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
      {code: 'CALLER_CHANGED_MIND', labels: {ru: 'Клиент передумал'}}]}))
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
