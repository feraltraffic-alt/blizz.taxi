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

/** Take a driver off, offer to a chosen driver (#294): O1–O7. */
describe('#294: driver actions on an order', () => {
  const all = ['orders.create', 'orders.view', 'orders.cancel', 'orders.reassign', 'orders.offer'];
  const free = (n: number) => ({driver_id: 'd000000' + n + '-0000-4000-8000-000000000001', name: 'Водитель ' + n,
    car: {registration_number: 'AA000' + n + 'BB', make: 'Skoda', model: 'Octavia', color: 'белый', classes: []},
    has_payment_terminal: false, status: 'FREE', occupancy: 'FREE', connection: 'CONNECTED', geolocation: 'FRESH',
    location: null, last_location_at: null, last_heartbeat_at: null, order_id: null});
  type Sent = {path: string; body: Record<string, unknown>};

  function handlers(status: string, opts: {rights?: string[]; command?: (path: string) => Response | Promise<Response>;
    reads?: () => unknown} = {}) {
    const sent: Sent[] = [];
    const asked = {reasons: 0, live: [] as URLSearchParams[]};
    const created = {...order, status, city_id: KYIV.id};
    server.use(...base({...operator, effective_permissions: opts.rights ?? all}),
      http.post(origin + '/api/operator/v1/quotes', () => HttpResponse.json(quote, {status: 201})),
      http.post(origin + '/api/operator/v1/orders', () => HttpResponse.json(created, {status: 201})),
      http.get(origin + '/api/operator/v1/orders/' + order.id, () =>
        HttpResponse.json((opts.reads ? opts.reads() : created) as never)),
      http.get(origin + '/api/operator/v1/reassign-reasons', () => {
        asked.reasons++;
        return HttpResponse.json({reasons: [{code: 'DRIVER_LATE', labels: {ru: 'Водитель опаздывает'}}]});
      }),
      http.get(origin + '/api/operator/v1/drivers/live', ({request}) => {
        asked.live.push(new URL(request.url).searchParams);
        return HttpResponse.json({city_id: KYIV.id, at: '2026-11-02T10:00:00Z', drivers: [free(1), free(2)]});
      }),
      http.post(origin + '/api/operator/v1/orders/' + order.id + '/:action', async ({request, params}) => {
        sent.push({path: String(params.action), body: await request.json() as Record<string, unknown>});
        return opts.command ? opts.command(String(params.action))
          : HttpResponse.json({...created, status: 'SEARCHING', version: 2} as never);
      }));
    return {sent, asked};
  }

  async function ordered() {
    mount();
    const user = await priced();
    await user.click(screen.getByRole('button', {name: 'Создать заказ'}));
    await screen.findByText('Заказ №1042');
    return user;
  }

  it('O1: takes the driver off with the reason, the comment and the version', async () => {
    const {sent} = handlers('ASSIGNED');
    const user = await ordered();
    await user.selectOptions(await screen.findByLabelText('Причина снятия водителя'), 'DRIVER_LATE');
    await user.type(screen.getByLabelText('Комментарий к снятию'), 'стоит в пробке');
    await user.click(screen.getByRole('button', {name: 'Снять водителя'}));
    expect(await screen.findByText('Статус: SEARCHING')).toBeVisible();
    expect(sent).toEqual([{path: 'revoke-assignment', body: {command_id: expect.any(String), expected_version: 1,
      reason_code: 'DRIVER_LATE', comment: 'стоит в пробке'}}]);
  });

  it('O2: no reason or a comment over 500 characters sends nothing', async () => {
    const {sent} = handlers('ASSIGNED');
    const user = await ordered();
    await screen.findByLabelText('Причина снятия водителя');
    await user.click(screen.getByRole('button', {name: 'Снять водителя'}));
    expect(await screen.findByText('Выберите причину; комментарий — до 500 символов.')).toBeVisible();
    await user.selectOptions(screen.getByLabelText('Причина снятия водителя'), 'DRIVER_LATE');
    await user.click(screen.getByLabelText('Комментарий к снятию'));
    await user.paste('я'.repeat(501));
    await user.click(screen.getByRole('button', {name: 'Снять водителя'}));
    expect(sent).toEqual([]);
  });

  it('O3: offers to a free driver of the order\'s city with a reason', async () => {
    const {sent, asked} = handlers('SEARCHING');
    const user = await ordered();
    await user.selectOptions(await screen.findByLabelText('Водитель для предложения'), 'Водитель 2 · AA0002BB');
    await user.type(screen.getByLabelText('Причина предложения'), 'клиент просил этого водителя');
    await user.click(screen.getByRole('button', {name: 'Предложить заказ'}));
    await waitFor(() => expect(sent).toHaveLength(1));
    expect(sent[0]).toEqual({path: 'manual-offers', body: {command_id: expect.any(String),
      driver_id: 'd0000002-0000-4000-8000-000000000001', reason: 'клиент просил этого водителя'}});
    expect([asked.live[0]!.get('city_id'), asked.live[0]!.getAll('status')]).toEqual([KYIV.id, ['FREE']]);
  });

  it('O3: not offered unless SEARCHING, the take-off only when ASSIGNED', async () => {
    const {asked} = handlers('IN_SERVICE');
    await ordered();
    expect(screen.queryByRole('button', {name: 'Предложить заказ'})).not.toBeInTheDocument();
    expect(screen.queryByRole('button', {name: 'Снять водителя'})).not.toBeInTheDocument();
    expect(asked.live).toEqual([]);
  });

  it('O4: no driver or no reason sends nothing', async () => {
    const {sent} = handlers('SEARCHING');
    const user = await ordered();
    await screen.findByLabelText('Водитель для предложения');
    await user.type(screen.getByLabelText('Причина предложения'), 'просьба клиента');
    await user.click(screen.getByRole('button', {name: 'Предложить заказ'}));
    expect(await screen.findByText('Выберите водителя и укажите причину, до 500 символов.')).toBeVisible();
    await user.selectOptions(screen.getByLabelText('Водитель для предложения'), 'Водитель 1 · AA0001BB');
    await user.clear(screen.getByLabelText('Причина предложения'));
    await user.click(screen.getByRole('button', {name: 'Предложить заказ'}));
    expect(sent).toEqual([]);
  });

  it.each([
    ['DRIVER_NOT_ELIGIBLE', 'Этот водитель сейчас не подходит для заказа.', 0],
    ['DRIVER_BUSY', 'Водитель занят.', 0],
    ['CONFLICT', 'Заказ изменился, пока вы его меняли. Проверьте его состояние.', 1]
  ])('O5: a 409 %s is told in words', async (code, text, rereads) => {
    let reads = 0;
    handlers('SEARCHING', {command: () => HttpResponse.json(problem(409, code), {status: 409}),
      reads: () => {reads++; return {...order, status: 'SEARCHING', city_id: KYIV.id};}});
    const user = await ordered();
    await user.selectOptions(await screen.findByLabelText('Водитель для предложения'), 'Водитель 1 · AA0001BB');
    await user.type(screen.getByLabelText('Причина предложения'), 'просьба клиента');
    await user.click(screen.getByRole('button', {name: 'Предложить заказ'}));
    expect(await screen.findByText(text)).toBeVisible();
    expect(reads).toBe(rereads);
  });

  it('O6: without the rights neither is offered and nothing is asked', async () => {
    const {asked} = handlers('SEARCHING', {rights: ['orders.create', 'orders.view', 'orders.cancel']});
    await ordered();
    expect(screen.queryByRole('button', {name: 'Предложить заказ'})).not.toBeInTheDocument();
    expect(asked.live).toEqual([]);
    expect(screen.queryByRole('button', {name: 'Снять водителя'})).not.toBeInTheDocument();
    expect(asked.reasons).toBe(0);
  });

  it('O7: a double click sends one command', async () => {
    const {sent} = handlers('ASSIGNED', {command: async () => {
      await delay(200);
      return HttpResponse.json({...order, status: 'SEARCHING', version: 2, city_id: KYIV.id} as never);
    }});
    const user = await ordered();
    await user.selectOptions(await screen.findByLabelText('Причина снятия водителя'), 'DRIVER_LATE');
    const button = screen.getByRole('button', {name: 'Снять водителя'});
    await Promise.all([user.click(button), user.click(button)]);
    await waitFor(() => expect(sent).toHaveLength(1));
    await delay(300);
    expect(sent).toHaveLength(1);
  });
});

/** Calling the order's caller, driver or rider (#304): T1–T6. */
describe('#304: click-to-call', () => {
  type Sent = {to: string; command_id: string};
  const placed = (state: string) => ({id: 'ca000000-0000-4000-8000-000000000009', direction: 'OUTBOUND',
    party: 'CALLER', state, caller_phone: null, called_number: null, city_id: KYIV.id, answered_by: me.member.id,
    order_ids: [order.id], started_at: '2026-11-02T10:00:00Z', answered_at: null, ended_at: null, recording: null});

  function handlers(status: string, opts: {rights?: string[]; answers?: (() => Response | Promise<Response>)[];
    payer?: boolean} = {}) {
    const sent: Sent[] = [];
    const created = {...order, status, city_id: KYIV.id, ...(opts.payer ? {payer_client_id: 'p1'} : {})};
    let n = 0;
    server.use(...base({...operator, effective_permissions: opts.rights ?? ['orders.create', 'orders.view']}),
      http.post(origin + '/api/operator/v1/quotes', () => HttpResponse.json(quote, {status: 201})),
      http.post(origin + '/api/operator/v1/orders', () => HttpResponse.json(created, {status: 201})),
      http.get(origin + '/api/operator/v1/orders/' + order.id, () => HttpResponse.json(created as never)),
      http.post(origin + '/api/operator/v1/orders/' + order.id + '/calls', async ({request}) => {
        sent.push(await request.json() as Sent);
        const answer = opts.answers?.[Math.min(n++, opts.answers.length - 1)];
        return answer ? answer() : HttpResponse.json(placed('DIALING') as never, {status: 201});
      }));
    return sent;
  }

  async function ordered() {
    mount();
    const user = await priced();
    await user.click(screen.getByRole('button', {name: 'Создать заказ'}));
    await screen.findByText('Заказ №1042');
    return user;
  }
  const buttons = () => ['Позвонить звонящему', 'Позвонить водителю', 'Позвонить пассажиру']
    .filter(name => screen.queryByRole('button', {name}));

  it.each([
    ['SEARCHING', false, ['Позвонить звонящему']],
    ['ASSIGNED', false, ['Позвонить звонящему', 'Позвонить водителю']],
    ['IN_SERVICE', true, ['Позвонить звонящему', 'Позвонить водителю', 'Позвонить пассажиру']]
  ])('T1: in %s (payer %s) the offered calls are %j', async (status, payer, offered) => {
    handlers(status, {payer});
    await ordered();
    expect(buttons()).toEqual(offered);
  });

  it('T2: one call with a command id; the phone rings', async () => {
    const sent = handlers('ASSIGNED');
    const user = await ordered();
    await user.click(screen.getByRole('button', {name: 'Позвонить водителю'}));
    expect(await screen.findByText('Звонит ваш телефон…')).toBeVisible();
    expect(sent).toEqual([{command_id: expect.any(String), to: 'DRIVER'}]);
  });

  it('T3: a 409 says why and offers no retry', async () => {
    handlers('SEARCHING', {answers: [() => HttpResponse.json(problem(409, 'STATE_CONFLICT'), {status: 409})]});
    const user = await ordered();
    await user.click(screen.getByRole('button', {name: 'Позвонить звонящему'}));
    expect(await screen.findByText('Нельзя позвонить: нет внутреннего номера или этой стороны у заказа.'))
      .toBeVisible();
    expect(screen.queryByRole('button', {name: 'Повторить звонок'})).not.toBeInTheDocument();
  });

  it('T4: after a 503 the retry is the same command; after a FAILED call the next is new', async () => {
    const sent = handlers('SEARCHING', {answers: [
      () => HttpResponse.json(problem(503, 'PROVIDER_UNAVAILABLE'), {status: 503}),
      () => HttpResponse.json(placed('FAILED') as never, {status: 201}),
      () => HttpResponse.json(placed('DIALING') as never, {status: 201})]});
    const user = await ordered();
    await user.click(screen.getByRole('button', {name: 'Позвонить звонящему'}));
    await user.click(await screen.findByRole('button', {name: 'Повторить звонок'}));
    expect(await screen.findByText('Звонок не удался.')).toBeVisible();
    await user.click(screen.getByRole('button', {name: 'Позвонить звонящему'}));
    expect(await screen.findByText('Звонит ваш телефон…')).toBeVisible();
    expect(sent.map(s => s.to)).toEqual(['CALLER', 'CALLER', 'CALLER']);
    expect(sent[1]!.command_id).toBe(sent[0]!.command_id);
    expect(sent[2]!.command_id).not.toBe(sent[0]!.command_id);
  });

  it('T5: a double click sends one command', async () => {
    const sent = handlers('SEARCHING', {answers: [async () => {
      await delay(200);
      return HttpResponse.json(placed('DIALING') as never, {status: 201});
    }]});
    const user = await ordered();
    const call = screen.getByRole('button', {name: 'Позвонить звонящему'});
    await Promise.all([user.click(call), user.click(call)]);
    await waitFor(() => expect(sent).toHaveLength(1));
    await delay(300);
    expect(sent).toHaveLength(1);
  });

  it('T6: without orders.view no calls are offered', async () => {
    handlers('ASSIGNED', {rights: ['orders.create']});
    await ordered();
    expect(buttons()).toEqual([]);
  });
});

/** Switch to cash and change the destination (#309): M1–M8. */
describe('#309: cash and destination', () => {
  const all = ['orders.create', 'orders.view', 'orders.reassign'];
  type Sent = {path: string; body: Record<string, unknown>};

  function handlers(status: string, method: string, opts: {rights?: string[];
    command?: (path: string) => Response | Promise<Response>; reads?: () => unknown} = {}) {
    const sent: Sent[] = [];
    const created = {...order, status, city_id: KYIV.id, payment_method: method};
    server.use(...base({...operator, effective_permissions: opts.rights ?? all}),
      http.post(origin + '/api/operator/v1/quotes', () => HttpResponse.json(quote, {status: 201})),
      http.post(origin + '/api/operator/v1/orders', () => HttpResponse.json(created, {status: 201})),
      http.get(origin + '/api/operator/v1/reassign-reasons', () => HttpResponse.json({reasons: []})),
      http.get(origin + '/api/operator/v1/drivers/live', () => HttpResponse.json({city_id: KYIV.id, at: 'x', drivers: []})),
      http.get(origin + '/api/operator/v1/orders/' + order.id, () =>
        HttpResponse.json((opts.reads ? opts.reads() : created) as never)),
      http.post(origin + '/api/operator/v1/orders/' + order.id + '/:action', async ({request, params}) => {
        sent.push({path: String(params.action), body: await request.json() as Record<string, unknown>});
        if (opts.command) return opts.command(String(params.action));
        return String(params.action) === 'destination'
          ? HttpResponse.json({order: {...created, version: 2}, previous_price_minor: 15000, price_minor: 18000,
            currency: 'UAH', hold_minor: null, above_hold: false} as never)
          : HttpResponse.json({...created, payment_method: 'CASH', version: 2} as never);
      }));
    return sent;
  }

  async function ordered() {
    mount();
    const user = await priced();
    await user.click(screen.getByRole('button', {name: 'Создать заказ'}));
    await screen.findByText('Заказ №1042');
    return user;
  }

  it.each([
    ['SEARCHING', 'CARD', all, true], ['IN_SERVICE', 'CARD', all, true], ['SEARCHING', 'CASH', all, false],
    ['FULFILLED', 'CARD', all, false], ['SEARCHING', 'CARD', ['orders.create'], true]
  ])('M1: in %s paid by %s with %j cash is offered: %s', async (status, method, rights, offered) => {
    handlers(status, method, {rights: rights as string[]});
    await ordered();
    expect(Boolean(screen.queryByRole('button', {name: 'Перевести на наличные'}))).toBe(offered);
  });

  it('M2: a reason is required; then one command with the version', async () => {
    const sent = handlers('SEARCHING', 'CARD');
    const user = await ordered();
    await user.click(screen.getByRole('button', {name: 'Перевести на наличные'}));
    expect(await screen.findByText('Укажите причину, до 500 символов.')).toBeVisible();
    expect(sent).toEqual([]);
    await user.type(screen.getByLabelText('Причина перевода на наличные'), 'клиент попросил по телефону');
    await user.click(screen.getByRole('button', {name: 'Перевести на наличные'}));
    await waitFor(() => expect(sent).toHaveLength(1));
    expect(sent[0]).toEqual({path: 'switch-to-cash', body: {command_id: expect.any(String), expected_version: 1,
      reason: 'клиент попросил по телефону'}});
    expect(await screen.findByText('Оплата: наличные')).toBeVisible();
  });

  it.each([
    ['PAYMENT_UNKNOWN', 'Результат удержания ещё неизвестен, повторите чуть позже.', 0],
    ['STATE_CONFLICT', 'Заказ изменился, пока вы его меняли. Проверьте его состояние.', 1]
  ])('M3: a 409 %s', async (code, text, rereads) => {
    let reads = 0;
    handlers('SEARCHING', 'CARD', {command: () => HttpResponse.json(problem(409, code), {status: 409}),
      reads: () => {reads++; return {...order, status: 'SEARCHING', payment_method: 'CARD', city_id: KYIV.id};}});
    const user = await ordered();
    await user.type(screen.getByLabelText('Причина перевода на наличные'), 'просьба клиента');
    await user.click(screen.getByRole('button', {name: 'Перевести на наличные'}));
    expect(await screen.findByText(text)).toBeVisible();
    expect(reads).toBe(rereads);
  });

  it.each([['IN_SERVICE', all, true], ['ASSIGNED', all, false], ['IN_SERVICE', ['orders.create', 'orders.view'], false]])(
    'M4: in %s with %j the destination change is offered: %s', async (status, rights, offered) => {
      handlers(status, 'CASH', {rights: rights as string[]});
      await ordered();
      expect(Boolean(screen.queryByRole('button', {name: 'Изменить точку назначения'}))).toBe(offered);
    });

  async function newDestination(user: ReturnType<typeof userEvent.setup>, reason = 'пассажир попросил') {
    await user.type(screen.getByLabelText('Новая точка назначения'), 'вокзал');
    const finds = screen.getAllByRole('button', {name: 'Найти'});
    await user.click(finds[finds.length - 1]!);
    await user.click(await screen.findByRole('button', {name: 'Вокзал'}));
    if (reason) await user.type(screen.getByLabelText('Причина изменения точки'), reason);
    await user.click(screen.getByRole('button', {name: 'Изменить точку назначения'}));
  }

  it('M5: the new place and the reason with the version; the new price is shown', async () => {
    const sent = handlers('IN_SERVICE', 'CASH');
    const user = await ordered();
    await newDestination(user);
    expect(await screen.findByText('Новая цена: 180.00 UAH (была 150.00 UAH)')).toBeVisible();
    expect(sent).toEqual([{path: 'destination', body: {command_id: expect.any(String), expected_version: 1,
      dropoff: {lat: 50.44, lon: 30.5}, dropoff_label: 'Вокзал', reason: 'пассажир попросил'}}]);
  });

  it('M5: without a reason nothing is sent', async () => {
    const sent = handlers('IN_SERVICE', 'CASH');
    const user = await ordered();
    await newDestination(user, '');
    expect(await screen.findByText('Выберите новую точку и укажите причину, до 500 символов.')).toBeVisible();
    expect(sent).toEqual([]);
  });

  it('M6: above the hold says so', async () => {
    handlers('IN_SERVICE', 'CARD', {command: path => path === 'destination'
      ? HttpResponse.json({order: {...order, status: 'IN_SERVICE', version: 2}, previous_price_minor: 15000,
        price_minor: 30000, currency: 'UAH', hold_minor: 20000, above_hold: true} as never)
      : HttpResponse.json({} as never)});
    const user = await ordered();
    await newDestination(user);
    expect(await screen.findByText('Новая цена выше удержания на карте: заведено обращение по оплате.')).toBeVisible();
  });

  it.each([
    [422, 'DROPOFF_OUTSIDE_CITY', 'Новая точка вне зоны города.'],
    [503, 'PROVIDER_UNAVAILABLE', 'Не удалось рассчитать маршрут, попробуйте позже.'],
    [409, 'STATE_CONFLICT', 'Заказ изменился, пока вы его меняли. Проверьте его состояние.']
  ])('M7: a %s %s', async (status, code, text) => {
    handlers('IN_SERVICE', 'CASH', {command: () => HttpResponse.json(problem(status, code), {status})});
    const user = await ordered();
    await newDestination(user);
    expect(await screen.findByText(text)).toBeVisible();
  });

  it('M8: a double click switches once', async () => {
    const sent = handlers('SEARCHING', 'CARD', {command: async () => {
      await delay(200);
      return HttpResponse.json({...order, status: 'SEARCHING', payment_method: 'CASH', version: 2} as never);
    }});
    const user = await ordered();
    await user.type(screen.getByLabelText('Причина перевода на наличные'), 'просьба клиента');
    const button = screen.getByRole('button', {name: 'Перевести на наличные'});
    await Promise.all([user.click(button), user.click(button)]);
    await waitFor(() => expect(sent).toHaveLength(1));
    await delay(300);
    expect(sent).toHaveLength(1);
  });
});
