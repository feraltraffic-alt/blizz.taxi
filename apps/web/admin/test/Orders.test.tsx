import {afterAll, afterEach, beforeAll, describe, expect, it, vi} from 'vitest';
import {render, screen, waitFor} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {MemoryRouter} from 'react-router-dom';
import {http, HttpResponse} from 'msw';
import {setupServer} from 'msw/node';
import {createApiClient} from '@blizz/api-client';
import {AdminApp} from '../src/App.js';
import {browserRefreshTokens} from '../src/storage.js';
import {cid, me, problem, session} from '../../../../test/fixtures.js';

/** Orders in the admin panel (#368): O1–O5 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {
  server.resetHandlers();
  sessionStorage.clear();
  localStorage.clear();
  vi.restoreAllMocks();
  vi.useRealTimers();
});
afterAll(() => server.close());

const KYIV = {id: '5a000000-0000-4000-8000-000000000001', code: 'kyiv', name: 'Київ', currency: 'UAH',
  timezone: 'Europe/Kyiv', center: {lat: 50.45, lon: 30.52}};
const WAW = {...KYIV, id: '5a000000-0000-4000-8000-000000000002', code: 'waw', name: 'Варшава', currency: 'PLN',
  timezone: 'Europe/Warsaw'};
const ORDER = '0d000000-0000-4000-8000-000000000001';
const viewer = {...me, effective_permissions: ['orders.view']};
const row = (n: number, over: Record<string, unknown> = {}) => ({id: n === 1 ? ORDER : '0d00000' + n
  + '-0000-4000-8000-000000000001', short_number: 1040 + n, city_id: KYIV.id, status: 'FULFILLED', channel: 'APP',
created_at: '2026-11-03T12:05:00Z', payer_client_id: null, driver_id: null, vehicle_class: 'ECONOMY',
payment_method: 'CASH', price_minor: 12000, final_price_minor: 12500, currency: 'UAH', accounting: 'POSTED', ...over});

function handlers(opts: {overview?: (q: URLSearchParams) => Response; search?: (q: URLSearchParams) => unknown;
  timeline?: () => unknown} = {}) {
  const overviews: URLSearchParams[] = [];
  const searches: URLSearchParams[] = [];
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(viewer as never)),
    http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [KYIV, WAW]})),
    http.get(origin + '/api/admin/v1/orders/overview', ({request}) => {
      const q = new URL(request.url).searchParams;
      overviews.push(q);
      return opts.overview ? opts.overview(q) : HttpResponse.json({city_id: q.get('city_id'), date: q.get('date'),
        time_zone: 'Europe/Kyiv', total: 15, by_status: [{status: 'FULFILLED', count: 12},
          {status: 'CANCELLED', count: 3}]} as never);
    }),
    http.get(origin + '/api/admin/v1/orders', ({request}) => {
      const q = new URL(request.url).searchParams;
      searches.push(q);
      return HttpResponse.json((opts.search ? opts.search(q) : {orders: [row(1)],
        page: {next_cursor: null, has_more: false}}) as never);
    }),
    http.get(origin + '/api/admin/v1/orders/' + ORDER + '/timeline', () => HttpResponse.json((opts.timeline
      ? opts.timeline() : {events: [
        {sequence: 1, type: 'OrderCreated', occurred_at: '2026-11-03T12:05:00Z', reason: null, details: {},
          correlation_id: null, actor: {type: 'STAFF', id: 's1', name: 'Коваль Анна', role: 'OPERATOR'}},
        {sequence: 2, type: 'OrderCancelled', occurred_at: '2026-11-03T12:20:00Z', reason: 'Пассажир передумал',
          details: {}, correlation_id: null, actor: {type: 'CLIENT', id: 'c1', name: null, role: null}}]}) as never)));
  return {overviews, searches};
}

function mount(path = '/orders') {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={[path]}><AdminApp client={api} /></MemoryRouter>);
}

async function open() {
  mount();
  const user = userEvent.setup();
  await screen.findByText('Всего: 15');
  return user;
}

describe('O1: the day', () => {
  it('today in the city time zone: at 22:30 UTC Kyiv is already on the next day', async () => {
    vi.useFakeTimers({toFake: ['Date']});
    vi.setSystemTime(new Date('2026-11-03T22:30:00Z'));
    const {overviews} = handlers();
    mount();
    expect(await screen.findByText('Всего: 15')).toBeVisible();
    expect(screen.getByText('Выполнен: 12')).toBeVisible();
    expect(screen.getByText('Отменён: 3')).toBeVisible();
    expect(overviews.map(q => [q.get('city_id'), q.get('date')])).toEqual([[KYIV.id, '2026-11-04']]);
  });

  it('another date and another city read again', async () => {
    vi.useFakeTimers({toFake: ['Date']});
    vi.setSystemTime(new Date('2026-11-03T10:00:00Z'));
    const {overviews} = handlers();
    const user = await open();
    await user.selectOptions(screen.getByLabelText('Город'), WAW.id);
    await waitFor(() => expect(overviews).toHaveLength(2));
    const date = screen.getByLabelText('Дата');
    await user.clear(date);
    await user.type(date, '2026-11-01');
    await waitFor(() => expect(overviews.at(-1)?.get('date')).toBe('2026-11-01'));
    expect(overviews.at(-1)?.get('city_id')).toBe(WAW.id);
    expect(overviews[1]?.get('date')).toBe('2026-11-03');
  });
});

describe('O2: search', () => {
  it('only the filled filters, statuses repeated; the row; "more" by cursor with the same filters', async () => {
    const {searches} = handlers({search: q => q.get('cursor') ? {orders: [row(2, {final_price_minor: null,
      accounting: 'PENDING'})], page: {next_cursor: null, has_more: false}} : {orders: [row(1)],
      page: {next_cursor: 'p2', has_more: true}}});
    const user = await open();
    await user.click(screen.getByRole('checkbox', {name: 'Выполнен'}));
    await user.click(screen.getByRole('checkbox', {name: 'Отменён'}));
    await user.type(screen.getByLabelText('Телефон пассажира'), '+380671234567');
    await user.type(screen.getByLabelText('Короткий номер'), '1041');
    await user.click(screen.getByRole('button', {name: 'Найти заказы'}));
    const link = await screen.findByRole('link', {name: '№ 1041 · 03.11.2026 14:05 · Выполнен · ECONOMY · CASH · 125.00 UAH'});
    expect(link).toHaveAttribute('href', '/orders/' + ORDER);
    await user.click(screen.getByRole('button', {name: 'Ещё'}));
    expect(await screen.findByRole('link', {name: '№ 1042 · 03.11.2026 14:05 · Выполнен · ECONOMY · CASH · 120.00 UAH · '
      + 'не проведён в учёте'})).toBeVisible();
    const sent = searches.map(q => [...q.entries()]);
    expect(sent[0]).toEqual([['city_id', KYIV.id], ['status', 'FULFILLED'], ['status', 'CANCELLED'],
      ['rider_phone', '+380671234567'], ['short_number', '1041']]);
    expect(sent[1]).toEqual([...sent[0]!, ['cursor', 'p2']]);
  });

  it('a row with no price shows a dash; a driver phone is sent as driver_phone', async () => {
    const {searches} = handlers({search: () => ({orders: [row(1, {price_minor: null, final_price_minor: null,
      currency: null, accounting: null})], page: {next_cursor: null, has_more: false}})});
    const user = await open();
    await user.type(screen.getByLabelText('Телефон водителя'), '+380501112233');
    await user.click(screen.getByRole('button', {name: 'Найти заказы'}));
    expect(await screen.findByRole('link', {name: '№ 1041 · 03.11.2026 14:05 · Выполнен · ECONOMY · CASH · —'}))
      .toBeVisible();
    expect([...searches[0]!.entries()]).toEqual([['city_id', KYIV.id], ['driver_phone', '+380501112233']]);
  });
});

describe('O3: refused on the screen', () => {
  it.each([['a rider phone without the plus', 'Телефон пассажира', '380671234567'],
    ['a driver phone with letters', 'Телефон водителя', '+38050abc2233'], ['a short number 0', 'Короткий номер', '0'],
    ['a short number with letters', 'Короткий номер', '12a']])('%s sends nothing', async (_name, label, value) => {
    const {searches} = handlers();
    const user = await open();
    await user.type(screen.getByLabelText(label), value);
    await user.click(screen.getByRole('button', {name: 'Найти заказы'}));
    expect(await screen.findByText('Телефон — в виде +380671234567; номер — целое число от 1.')).toBeVisible();
    expect(searches).toEqual([]);
  });
});

describe('O4: the order', () => {
  it('the events oldest first with who and why', async () => {
    handlers();
    mount('/orders/' + ORDER);
    expect(await screen.findByText('03.11.2026 12:05 UTC · OrderCreated · Коваль Анна (Оператор)')).toBeVisible();
    expect(screen.getByText('03.11.2026 12:20 UTC · OrderCancelled · Пассажир · Пассажир передумал')).toBeVisible();
  });
});

describe('O5: not allowed', () => {
  it('a 403 on the city is told', async () => {
    handlers({overview: () => HttpResponse.json(problem(403, 'ACCESS_DENIED'), {status: 403})});
    mount();
    expect(await screen.findByText('Нет доступа к заказам этого города.')).toBeVisible();
  });
});
