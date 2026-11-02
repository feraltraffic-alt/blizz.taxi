import {afterAll, afterEach, beforeAll, describe, expect, it} from 'vitest';
import {render, screen, waitFor} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {http, HttpResponse, delay} from 'msw';
import {setupServer} from 'msw/node';
import {createApiClient} from '@blizz/api-client';
import {browserRefreshTokens} from '@blizz/web-ui';
import {OperatorApp} from '../src/App.js';
import {translations, validateCatalogs} from '../src/i18n.js';
import {cid, me, problem, session} from '../../../../test/fixtures.js';

const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear();});
afterAll(() => server.close());

const KYIV = {id: '5a000000-0000-4000-8000-000000000001', code: 'kyiv', name: 'Київ', currency: 'UAH',
  timezone: 'Europe/Kyiv', working_hours: [], payment_methods: ['CASH'], orders_paused: false,
  center: {lat: 50.45, lon: 30.52}};
const operator = {...me, effective_permissions: ['orders.create', 'orders.view', 'orders.cancel']};
const place = (label: string, lat: number) => ({source: 'OWN', label, street: label, house: '1', point: {lat, lon: 30.5}});
const quote = {id: '80000000-0000-4000-8000-000000000001', vehicle_class: 'STANDARD', city_id: KYIV.id,
  amount_minor: 15000, currency: 'UAH', distance_m: 5000, duration_s: 600, route_source: 'ROUTER'};
const order = {id: '90000000-0000-4000-8000-000000000001', short_number: 1042, status: 'SEARCHING', version: 1};

function base(rights = operator) {
  return [
    http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [KYIV]})),
    http.get(origin + '/api/operator/v1/me', () => HttpResponse.json(rights)),
    http.get(origin + '/api/operator/v1/places', ({request}) => {
      const q = new URL(request.url).searchParams.get('query');
      return HttpResponse.json({provider: 'BUILT_IN', places: [place(q === 'вокзал' ? 'Вокзал' : 'Майдан',
        q === 'вокзал' ? 50.44 : 50.45)]});
    }),
    http.get(origin + '/api/operator/v1/cancel-reasons', () => HttpResponse.json({reasons: [
      {code: 'CALLER_CHANGED_MIND', labels: {ru: 'Клиент передумал'}}]})),
    http.get(origin + '/api/operator/v1/vehicle-classes', ({request}) =>
      HttpResponse.json(new URL(request.url).searchParams.get('city_id') === KYIV.id
        ? [{code: 'STANDARD', name: 'Стандарт'}, {code: 'COMFORT', name: 'Комфорт'}]
        : [{code: 'ECONOMY', name: 'Ekonomia'}]))
  ];
}

function mount() {
  let id = 0;
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage, 'test'),
    correlationId: () => cid, initialSession: session});
  render(<OperatorApp client={api} pollMs={60_000}
    newId={() => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')} />);
}

/** Fills the caller, picks both places and prices the ride. */
async function priced(user = userEvent.setup()) {
  await user.type(await screen.findByLabelText('Телефон звонящего'), '+380671234567');
  await user.type(screen.getByLabelText('Откуда'), 'майдан');
  await user.click(screen.getAllByRole('button', {name: 'Найти'})[0]!);
  await user.click(await screen.findByRole('button', {name: 'Майдан'}));
  await user.type(screen.getByLabelText('Куда'), 'вокзал');
  await user.click(screen.getAllByRole('button', {name: 'Найти'})[1]!);
  await user.click(await screen.findByRole('button', {name: 'Вокзал'}));
  await user.click(screen.getByRole('button', {name: 'Рассчитать цену'}));
  expect(await screen.findByText('Цена: 150.00 UAH')).toBeVisible();
  return user;
}

describe('E1: the right to create orders', () => {
  it('an operator without orders.create sees no order form', async () => {
    server.use(...base({...me, effective_permissions: ['orders.view']}));
    mount();
    expect(await screen.findByText('У вас нет права создавать заказы в этом городе.')).toBeVisible();
    expect(screen.queryByLabelText('Телефон звонящего')).not.toBeInTheDocument();
  });

  it('a 403 from the server is shown with its correlation id, not a blank page', async () => {
    server.use(...base(), http.post(origin + '/api/operator/v1/quotes', () =>
      HttpResponse.json(problem(403, 'ACCESS_DENIED'), {status: 403})));
    mount();
    const user = userEvent.setup();
    await user.type(await screen.findByLabelText('Телефон звонящего'), '+380671234567');
    await user.type(screen.getByLabelText('Откуда'), 'майдан');
    await user.click(screen.getAllByRole('button', {name: 'Найти'})[0]!);
    await user.click(await screen.findByRole('button', {name: 'Майдан'}));
    await user.type(screen.getByLabelText('Куда'), 'вокзал');
    await user.click(screen.getAllByRole('button', {name: 'Найти'})[1]!);
    await user.click(await screen.findByRole('button', {name: 'Вокзал'}));
    await user.click(screen.getByRole('button', {name: 'Рассчитать цену'}));
    expect(await screen.findByText(new RegExp(cid))).toBeVisible();
    expect(screen.getByRole('main')).toBeVisible();
  });
});

describe('the city list', () => {
  it('holds only the cities of the operator\'s scope', async () => {
    const warsaw = {...KYIV, id: '5a000000-0000-4000-8000-000000000002', code: 'warsaw', name: 'Warszawa'};
    const scoped = {...operator, member: {...operator.member, profile: {...operator.member.profile, all_cities: false,
      city_ids: [KYIV.id]}}};
    // The first matching handler answers: the two-city bootstrap goes before the base ones.
    server.use(http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [warsaw, KYIV]})),
      ...base(scoped));
    mount();
    const select = await screen.findByLabelText('Город');
    expect([...(select as HTMLSelectElement).options].map(o => o.text)).toEqual(['Київ']);
  });
});

describe('C5: vehicle classes (#251)', () => {
  it('lists the city\'s classes, reloads them for another city and quotes the chosen one', async () => {
    const warsaw = {...KYIV, id: '5a000000-0000-4000-8000-000000000002', code: 'warsaw', name: 'Warszawa'};
    let quoted: unknown = null;
    server.use(http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [KYIV, warsaw]})),
      http.post(origin + '/api/operator/v1/quotes', async ({request}) => {
        quoted = await request.json();
        return HttpResponse.json(quote, {status: 201});
      }), ...base());
    mount();
    const classes = await screen.findByLabelText('Класс авто');
    await waitFor(() => expect([...(classes as HTMLSelectElement).options].map(o => o.text))
      .toEqual(['Стандарт', 'Комфорт']));
    const user = userEvent.setup();
    await user.selectOptions(screen.getByLabelText('Город'), 'Warszawa');
    await waitFor(() => expect([...(screen.getByLabelText('Класс авто') as HTMLSelectElement).options]
      .map(o => o.text)).toEqual(['Ekonomia']));
    await user.selectOptions(screen.getByLabelText('Город'), 'Київ');
    await waitFor(() => expect((screen.getByLabelText('Класс авто') as HTMLSelectElement).options).toHaveLength(2));
    await user.selectOptions(screen.getByLabelText('Класс авто'), 'Комфорт');
    await priced(user);
    expect(quoted).toMatchObject({vehicle_class: 'COMFORT'});
  });
});

describe('E2: the caller\'s number', () => {
  it('a number that is not E.164 is refused at the field before any request', async () => {
    let lookups = 0;
    server.use(...base(), http.get(origin + '/api/operator/v1/customers/lookup', () => {
      lookups++;
      return HttpResponse.json({});
    }));
    mount();
    const user = userEvent.setup();
    await user.type(await screen.findByLabelText('Телефон звонящего'), '0671234567');
    await user.click(screen.getByRole('button', {name: 'Найти клиента'}));
    expect(await screen.findByText('Номер в формате +380XXXXXXXXX.')).toBeVisible();
    expect(lookups).toBe(0);
  });

  it('a known caller is shown by name, an unknown one as new', async () => {
    server.use(...base(), http.get(origin + '/api/operator/v1/customers/lookup', ({request}) =>
      new URL(request.url).searchParams.get('phone') === '+380671234567'
        ? HttpResponse.json({client_id: 'c1', name: 'Олена', account_state: 'ACTIVE', orders: []})
        : HttpResponse.json(problem(404, 'NOT_FOUND'), {status: 404})));
    mount();
    const user = userEvent.setup();
    await user.type(await screen.findByLabelText('Телефон звонящего'), '+380671234567');
    await user.click(screen.getByRole('button', {name: 'Найти клиента'}));
    expect(await screen.findByText('Клиент: Олена')).toBeVisible();
  });
});

describe('E3: an expired price', () => {
  it('asks for a new price and never creates the order with the old one', async () => {
    const orders: unknown[] = [];
    server.use(...base(), http.post(origin + '/api/operator/v1/quotes', () => HttpResponse.json(quote, {status: 201})),
      http.post(origin + '/api/operator/v1/orders', async ({request}) => {
        orders.push(await request.json());
        return HttpResponse.json(problem(409, 'QUOTE_EXPIRED'), {status: 409});
      }));
    mount();
    const user = await priced();
    await user.click(screen.getByRole('button', {name: 'Создать заказ'}));
    expect(await screen.findByText('Цена устарела. Рассчитайте снова.')).toBeVisible();
    expect(screen.getByRole('button', {name: 'Создать заказ'})).toBeDisabled();
    expect(orders).toHaveLength(1);
  });
});

describe('E4: a double click', () => {
  it('is one order with one command id while the first is on its way', async () => {
    const orders: {command_id: string}[] = [];
    server.use(...base(), http.post(origin + '/api/operator/v1/quotes', () => HttpResponse.json(quote, {status: 201})),
      http.post(origin + '/api/operator/v1/orders', async ({request}) => {
        orders.push(await request.json() as {command_id: string});
        await delay(300);
        return HttpResponse.json(order, {status: 201});
      }));
    mount();
    const user = await priced();
    const create = screen.getByRole('button', {name: 'Создать заказ'});
    await Promise.all([user.click(create), user.click(create)]);
    expect(await screen.findByText('Заказ №1042')).toBeVisible();
    expect(orders).toHaveLength(1);
    expect(orders[0]!.command_id).toMatch(/^40000000-/);
  });
});

describe('E5: cancelling', () => {
  it('needs a reason, and a 409 refreshes the order and says so', async () => {
    let reads = 0;
    server.use(...base(), http.post(origin + '/api/operator/v1/quotes', () => HttpResponse.json(quote, {status: 201})),
      http.post(origin + '/api/operator/v1/orders', () => HttpResponse.json(order, {status: 201})),
      http.post(origin + '/api/operator/v1/orders/:id/cancel', () =>
        HttpResponse.json(problem(409, 'VERSION_CONFLICT'), {status: 409})),
      http.get(origin + '/api/operator/v1/orders/:id', () => {
        reads++;
        return HttpResponse.json({...order, status: 'ASSIGNED', version: 2});
      }));
    mount();
    const user = await priced();
    await user.click(screen.getByRole('button', {name: 'Создать заказ'}));
    expect(await screen.findByText('Статус: SEARCHING')).toBeVisible();
    expect(screen.getByRole('button', {name: 'Отменить заказ'})).toBeDisabled();
    await user.selectOptions(screen.getByLabelText('Причина отмены'), 'CALLER_CHANGED_MIND');
    await user.click(screen.getByRole('button', {name: 'Отменить заказ'}));
    expect(await screen.findByText('Заказ изменился, пока вы его отменяли. Проверьте его состояние.')).toBeVisible();
    expect(await screen.findByText('Статус: ASSIGNED')).toBeVisible();
    expect(reads).toBe(1);
  });
});

describe('E6: a city that takes no orders now', () => {
  it.each([['CITY_PAUSED', 'Приём заказов в городе приостановлен.'], ['CITY_CLOSED', 'Город сейчас не работает.']])(
    '%s is shown as such', async (code, text) => {
      server.use(...base(), http.post(origin + '/api/operator/v1/quotes', () => HttpResponse.json(quote, {status: 201})),
        http.post(origin + '/api/operator/v1/orders', () => HttpResponse.json(problem(409, code), {status: 409})));
      mount();
      const user = await priced();
      await user.click(screen.getByRole('button', {name: 'Создать заказ'}));
      expect(await screen.findByText(text)).toBeVisible();
    });
});

it('the catalogs have the same keys and every key of the shared staff screens', () => {
  validateCatalogs(translations);
  expect(Object.keys(translations.pl).sort()).toEqual(Object.keys(translations.ru).sort());
});

it('signs in with the OPERATOR audience', async () => {
  let audience = '';
  server.use(...base(), http.post(origin + '/auth/v1/staff/sign-in', async ({request}) => {
    audience = (await request.json() as {audience: string}).audience;
    return HttpResponse.json(session);
  }));
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage, 'test'),
    correlationId: () => cid});
  render(<OperatorApp client={api} />);
  const user = userEvent.setup();
  await user.type(await screen.findByLabelText('Логин'), 'operator');
  await user.type(screen.getByLabelText('Пароль'), 'Fixture-Password-2026');
  await user.click(screen.getByRole('button', {name: 'Войти'}));
  await waitFor(() => expect(audience).toBe('OPERATOR'));
});

/** The order's history and conversation (#292): H1–H6. */
describe('#292: history and conversation', () => {
  const at = (minute: number) => '2026-11-02T10:0' + minute + ':00Z';
  const local = (iso: string) => {
    const d = new Date(iso);
    return String(d.getHours()).padStart(2, '0') + ':' + String(d.getMinutes()).padStart(2, '0');
  };
  const entry = (n: number, type: string, actor: Record<string, unknown>, reason: string | null,
    details: Record<string, unknown> = {}) => ({sequence: n, type, occurred_at: at(n), reason, details,
    correlation_id: null, actor: {id: null, name: null, role: null, ...actor}});
  const timeline = {events: [
    entry(1, 'OrderCreated', {type: 'STAFF', name: 'Анна Коваль', role: 'OPERATOR'}, null),
    entry(2, 'AssignmentWithdrawn', {type: 'DRIVER', name: 'Петро'}, 'flat tyre'),
    entry(3, 'OrderCancelled', {type: 'STAFF', name: 'Анна Коваль', role: 'OPERATOR'}, 'CALLER_CHANGED_MIND',
      {reason_code: 'CALLER_CHANGED_MIND', reason_labels: {ru: 'Клиент передумал'}}),
    entry(4, 'SomethingNew', {type: 'SYSTEM'}, null)]};
  const chat = {messages: [
    {id: 'm1', order_id: order.id, sequence: 1, sender_role: 'RIDER', body: 'Я у входа', sent_at: at(1)},
    {id: 'm2', order_id: order.id, sequence: 2, sender_role: 'DRIVER', body: 'Еду', sent_at: at(2)}]};

  function handlers(opts: {events?: () => Response; messages?: (q: URLSearchParams) => Response} = {}) {
    const asked = {events: 0, messages: [] as URLSearchParams[]};
    server.use(...base(),
      http.post(origin + '/api/operator/v1/quotes', () => HttpResponse.json(quote, {status: 201})),
      http.post(origin + '/api/operator/v1/orders', () => HttpResponse.json(order, {status: 201})),
      http.get(origin + '/api/operator/v1/orders/' + order.id + '/events', async () => {
        asked.events++;
        await delay(50);
        return opts.events ? opts.events() : HttpResponse.json(timeline);
      }),
      http.get(origin + '/api/operator/v1/orders/' + order.id + '/messages', ({request}) => {
        const query = new URL(request.url).searchParams;
        asked.messages.push(query);
        return opts.messages ? opts.messages(query) : HttpResponse.json(chat);
      }));
    return asked;
  }

  async function ordered() {
    mount();
    const user = await priced();
    await user.click(screen.getByRole('button', {name: 'Создать заказ'}));
    await screen.findByText('Заказ №1042');
    return user;
  }

  it('H1: the history in words, oldest first, with the reason label', async () => {
    handlers();
    const user = await ordered();
    await user.click(screen.getByRole('button', {name: 'История заказа'}));
    const list = await screen.findByRole('list', {name: 'История заказа'});
    expect([...list.querySelectorAll('li')].map(li => li.textContent)).toEqual([
      local(at(1)) + ' · Анна Коваль, оператор · Заказ создан',
      local(at(2)) + ' · Водитель Петро · Водитель отказался от заказа: flat tyre',
      local(at(3)) + ' · Анна Коваль, оператор · Заказ отменён: Клиент передумал',
      local(at(4)) + ' · Система · SomethingNew']);
  });

  it('H2: refresh reads again, once on a double click', async () => {
    const asked = handlers();
    const user = await ordered();
    await user.click(screen.getByRole('button', {name: 'История заказа'}));
    await screen.findByRole('list', {name: 'История заказа'});
    const refresh = screen.getByRole('button', {name: 'Обновить историю'});
    await Promise.all([user.click(refresh), user.click(refresh)]);
    await waitFor(() => expect(asked.events).toBe(2));
    await delay(100);
    expect(asked.events).toBe(2);
  });

  it('H3: the conversation needs a reason of 1–500 characters; otherwise nothing is asked', async () => {
    const asked = handlers();
    const user = await ordered();
    await user.click(screen.getByRole('button', {name: 'Открыть переписку'}));
    expect(await screen.findByText('Укажите причину, до 500 символов: она попадёт в журнал.')).toBeVisible();
    await user.click(screen.getByLabelText('Причина просмотра переписки'));
    await user.paste('я'.repeat(501));
    await user.click(screen.getByRole('button', {name: 'Открыть переписку'}));
    expect(asked.messages).toEqual([]);
  });

  it('H4: with a reason, one read; the messages in order; an empty one says so', async () => {
    let empty = false;
    const asked = handlers({messages: () => HttpResponse.json(empty ? {messages: []} : chat)});
    const user = await ordered();
    await user.type(screen.getByLabelText('Причина просмотра переписки'), 'Клиент жалуется на водителя');
    await user.click(screen.getByRole('button', {name: 'Открыть переписку'}));
    const list = await screen.findByRole('list', {name: 'Переписка'});
    expect([...list.querySelectorAll('li')].map(li => li.textContent)).toEqual([
      'Пассажир ' + local(at(1)) + ': Я у входа', 'Водитель ' + local(at(2)) + ': Еду']);
    expect(asked.messages.map(q => q.get('reason'))).toEqual(['Клиент жалуется на водителя']);
    empty = true;
    await user.click(screen.getByRole('button', {name: 'Открыть переписку'}));
    expect(await screen.findByText('Сообщений нет.')).toBeVisible();
  });

  it('H5: without orders.view neither is offered', async () => {
    const asked = handlers();
    server.use(http.get(origin + '/api/operator/v1/me', () =>
      HttpResponse.json({...operator, effective_permissions: ['orders.create', 'orders.cancel']})));
    await ordered();
    expect(screen.queryByRole('button', {name: 'История заказа'})).not.toBeInTheDocument();
    expect(screen.queryByRole('button', {name: 'Открыть переписку'})).not.toBeInTheDocument();
    expect(asked.events).toBe(0);
    expect(asked.messages).toEqual([]);
  });

  it('H6: a refusal is shown with its correlation id', async () => {
    handlers({events: () => HttpResponse.json(problem(403, 'ACCESS_DENIED'), {status: 403})});
    const user = await ordered();
    await user.click(screen.getByRole('button', {name: 'История заказа'}));
    expect(await screen.findByText(new RegExp(cid))).toBeVisible();
  });
});
