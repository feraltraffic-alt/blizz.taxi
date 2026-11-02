import {fireEvent, render, screen, waitFor} from '@testing-library/react-native';
import {createApiClient} from '@blizz/api-client';
import {RiderApp, type AppConfig} from '../src/App';

/** The rider's order history (#267): H1–H6 of the issue. */
const cid = '10000000-0000-4000-8000-000000000001';
const session = {
  session_id: '10000000-0000-4000-8000-000000000002', subject: {type: 'CLIENT', id: '10000000-0000-4000-8000-000000000003'},
  audience: 'rider', access_token: 'test-only-access', refresh_token: 'test-only-refresh',
  access_expires_at: '2099-01-01T00:00:00Z', refresh_expires_at: '2099-01-01T00:00:00Z', password_change_required: false
};
const ID = '90000000-0000-4000-8000-000000000001';

type Call = {method: string; path: string; query: URLSearchParams; body?: unknown};
type Answer = {status: number; body?: unknown; delayMs?: number};

function server(script: Record<string, Answer[]>) {
  const calls: Call[] = [];
  const fetch = jest.fn(async (url: string, init: RequestInit) => {
    const parsed = new URL(url);
    const path = parsed.pathname;
    const method = String(init.method);
    calls.push({method, path, query: parsed.searchParams, body: init.body ? JSON.parse(String(init.body)) : undefined});
    const answers = script[method + ' ' + path] ?? [{status: 404, body: {code: 'NOT_FOUND', correlation_id: cid}}];
    const answer = answers.length > 1 ? answers.shift()! : answers[0]!;
    if (answer.delayMs) await new Promise(resolve => setTimeout(resolve, answer.delayMs));
    return new Response(answer.body === undefined ? null : JSON.stringify(answer.body),
      {status: answer.status, headers: {'Content-Type': 'application/json'}});
  });
  return {fetch: fetch as unknown as typeof globalThis.fetch, calls};
}

const problem = (status: number, code: string) => ({status, body: {type: 'about:blank', title: code, status, code,
  correlation_id: cid, retryable: false}});

const item = (n: number, over: Record<string, unknown> = {}) => ({id: '90000000-0000-4000-8000-00000000000' + n,
  short_number: 1040 + n, status: 'FULFILLED', created_at: '2026-11-0' + n + 'T08:3' + n + ':00Z',
  pickup_label: 'Майдан ' + n, dropoff_label: 'Вокзал ' + n, vehicle_class: 'STANDARD', price_minor: 12000,
  final_price_minor: 12000, currency: 'UAH', payment_method: 'CASH',
  driver: {name: 'Іван', make: 'Skoda', model: 'Octavia', color: 'white', registration_number: 'AA0001TX'},
  chat_available: false, cancellation: null, pickup_at: null, ...over});
const page = (items: unknown[], next: string | null) => ({status: 200, body: {items,
  page: {next_cursor: next, has_more: next !== null}}});
const HISTORY = 'GET /api/rider/v1/orders';
const opts = {order_id: ID, currency: 'UAH', trip_cost_minor: 12000, presets: [{percent: 10, amount_minor: 1200}],
  min_minor: 500, max_minor: 12000, method: 'CASH', available_until: '2026-11-03T12:00:00Z', open: true, tip: null};

async function mount(script: Record<string, Answer[]>) {
  const http = server({
    'GET /api/rider/v1/legal': [{status: 200, body: {documents: []}}],
    'GET /api/rider/v1/orders/current': [{status: 200, body: {orders: []}}],
    ...script
  });
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: {read: () => null, write: () => {}},
    fetch: http.fetch, correlationId: () => cid, initialSession: session as never});
  const config: AppConfig = {service: 'default', deviceRef: 'test', pollMs: 60_000, locate: async () => ({lat: 50.45,
    lon: 30.52}), newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')};
  await render(<RiderApp client={client} config={config} />);
  await fireEvent.press(await screen.findByRole('button', {name: 'Мои поездки'}));
  return {http};
}

describe('H1, H2: the list', () => {
  it('shows the orders newest first with route, status, price and driver', async () => {
    await mount({[HISTORY]: [page([item(3), item(2, {status: 'CANCELLED', driver: null, final_price_minor: null}),
      item(1, {final_price_minor: 13500})], null)]});
    expect(await screen.findByText('Майдан 3 → Вокзал 3')).toBeTruthy();
    const routes = screen.getAllByText(/^Майдан \d → Вокзал \d$/).map(n => String(n.props.children));
    expect(routes).toEqual(['Майдан 3 → Вокзал 3', 'Майдан 2 → Вокзал 2', 'Майдан 1 → Вокзал 1']);
    expect(screen.getByText(/№ 1043 · Поездка завершена · 120\.00 UAH · Іван/)).toBeTruthy();
    expect(screen.getByText(/№ 1042 · Заказ отменён · 120\.00 UAH$/)).toBeTruthy();
  });

  it('H2: the final price over the quoted one', async () => {
    await mount({[HISTORY]: [page([item(1, {final_price_minor: 13500})], null)]});
    expect(await screen.findByText(/№ 1041 · Поездка завершена · 135\.00 UAH/)).toBeTruthy();
  });
});

describe('H3: no orders yet', () => {
  it('says so and offers no "more"', async () => {
    await mount({[HISTORY]: [page([], null)]});
    expect(await screen.findByText('Поездок пока не было.')).toBeTruthy();
    expect(screen.queryByRole('button', {name: 'Ещё'})).toBeNull();
  });
});

describe('H4: the next page', () => {
  it('is read with the cursor, once on a double tap, and appended', async () => {
    const {http} = await mount({[HISTORY]: [page([item(3)], 'c-2'), {...page([item(2)], null), delayMs: 300}]});
    const more = await screen.findByRole('button', {name: 'Ещё'});
    await fireEvent.press(more);
    await fireEvent.press(more);
    expect(await screen.findByText('Майдан 2 → Вокзал 2')).toBeTruthy();
    expect(screen.getByText('Майдан 3 → Вокзал 3')).toBeTruthy();
    await waitFor(() => expect(screen.queryByRole('button', {name: 'Ещё'})).toBeNull());
    const reads = http.calls.filter(c => c.path === '/api/rider/v1/orders');
    expect(reads).toHaveLength(2);
    expect(reads[1]!.query.get('cursor')).toBe('c-2');
  });
});

describe('H5: an order\'s details', () => {
  it('a fulfilled one opens with the rating and tip, and "Назад" returns', async () => {
    await mount({[HISTORY]: [page([item(1, {id: ID})], null)],
      ['GET /api/rider/v1/orders/' + ID + '/rating']: [problem(404, 'NOT_FOUND')],
      ['GET /api/rider/v1/orders/' + ID + '/tip']: [{status: 200, body: opts}]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Майдан 1 → Вокзал 1'}));
    expect(await screen.findByRole('button', {name: 'Оценка 5'})).toBeTruthy();
    expect(await screen.findByRole('button', {name: '10 % — 12.00 UAH'})).toBeTruthy();
    expect(screen.queryByLabelText('Сообщение')).toBeNull();
    await fireEvent.press(screen.getByRole('button', {name: 'Назад'}));
    expect(await screen.findByText('Майдан 1 → Вокзал 1')).toBeTruthy();
  });

  it('one with the chat open shows the chat; a cancelled one without it has neither', async () => {
    await mount({[HISTORY]: [page([item(2, {id: ID, status: 'CANCELLED', chat_available: true}),
      item(1, {status: 'CANCELLED', chat_available: false, driver: null})], null)],
    ['GET /api/rider/v1/orders/' + ID + '/messages']: [{status: 200, body: {messages: []}}]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Майдан 2 → Вокзал 2'}));
    expect(await screen.findByLabelText('Сообщение')).toBeTruthy();
    expect(screen.queryByRole('button', {name: 'Оценка 5'})).toBeNull();
    await fireEvent.press(screen.getByRole('button', {name: 'Назад'}));
    await fireEvent.press(await screen.findByRole('button', {name: 'Майдан 1 → Вокзал 1'}));
    expect(await screen.findByText(/№ 1041/)).toBeTruthy();
    expect(screen.queryByLabelText('Сообщение')).toBeNull();
    expect(screen.queryByRole('button', {name: 'Оценка 5'})).toBeNull();
  });
});

describe('H6: a failed read', () => {
  it('shows the correlation id and a retry', async () => {
    const {http} = await mount({[HISTORY]: [problem(500, 'INTERNAL'), page([item(1)], null)]});
    expect(await screen.findByText(new RegExp(cid))).toBeTruthy();
    await fireEvent.press(screen.getByRole('button', {name: 'Повторить'}));
    expect(await screen.findByText('Майдан 1 → Вокзал 1')).toBeTruthy();
    expect(http.calls.filter(c => c.path === '/api/rider/v1/orders')).toHaveLength(2);
  });
});
