import {fireEvent, render, screen} from '@testing-library/react-native';
import {createApiClient, type RefreshTokenStore} from '@blizz/api-client';
import {RiderApp, type AppConfig} from '../src/App';

/** Paying a ride by card (#271): Y1–Y5 of the issue. */

const cid = '10000000-0000-4000-8000-000000000001';
const session = {
  session_id: '10000000-0000-4000-8000-000000000002', subject: {type: 'CLIENT', id: '10000000-0000-4000-8000-000000000003'},
  audience: 'rider', access_token: 'test-only-access', refresh_token: 'test-only-refresh',
  access_expires_at: '2099-01-01T00:00:00Z', refresh_expires_at: '2099-01-01T00:00:00Z', password_change_required: false
};
const HERE = {lat: 50.45, lon: 30.52};
const quote = {id: '80000000-0000-4000-8000-000000000001', vehicle_class: 'STANDARD', amount_minor: 12000,
  currency: 'UAH'};
const order = {id: '90000000-0000-4000-8000-000000000001', short_number: 7, status: 'SEARCHING', version: 1,
  price_minor: 12000, currency: 'UAH', driver: null};

type Call = {method: string; path: string; query: URLSearchParams; body?: unknown};
type Answer = {status: number; body?: unknown; delayMs?: number} | 'network';

function server(script: Record<string, Answer[]>) {
  const calls: Call[] = [];
  const fetch = jest.fn(async (url: string, init: RequestInit) => {
    const parsed = new URL(url);
    const method = String(init.method);
    calls.push({method, path: parsed.pathname, query: parsed.searchParams,
      body: init.body ? JSON.parse(String(init.body)) : undefined});
    const answers = script[method + ' ' + parsed.pathname] ?? [{status: 404, body: {code: 'NOT_FOUND', correlation_id: cid}}];
    const answer = answers.length > 1 ? answers.shift()! : answers[0]!;
    if (answer === 'network') throw new TypeError('Network request failed');
    if (answer.delayMs) await new Promise(resolve => setTimeout(resolve, answer.delayMs));
    return new Response(answer.body === undefined ? null : JSON.stringify(answer.body),
      {status: answer.status, headers: {'Content-Type': 'application/json'}});
  });
  return {fetch: fetch as unknown as typeof globalThis.fetch, calls};
}

const problem = (status: number, code: string) => ({status, body: {type: 'about:blank', title: code, status, code,
  correlation_id: cid, retryable: false}});
const memory = (): RefreshTokenStore => {let v: string | null = null; return {read: () => v, write: n => {v = n;}};};

const ready = {
  'GET /api/rider/v1/legal': [{status: 200, body: {documents: []}}],
  'GET /api/rider/v1/orders/current': [{status: 200, body: {orders: []}}],
  'GET /api/rider/v1/vehicle-classes': [{status: 200, body: [{code: 'STANDARD', name: 'Стандарт'}]}],
  'GET /api/rider/v1/places': [{status: 200, body: {provider: 'FAKE', places: [{label: 'Вокзал', point: {lat: 50.44,
    lon: 30.49}}]}}],
  'POST /api/rider/v1/quotes': [{status: 201, body: quote}],
  'GET /api/rider/v1/cancel-reasons': [{status: 200, body: {reasons: [{code: 'CHANGED_MIND', labels: {ru: 'Передумал'}}]}}]
};

async function mount(script: Record<string, Answer[]>, options: {locate?: () => Promise<{lat: number; lon: number}>;
  pollMs?: number} = {}) {
  const http = server(script);
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: memory(), fetch: http.fetch,
    correlationId: () => cid, initialSession: session as never});
  const config: AppConfig = {service: 'default', deviceRef: 'test', pollMs: options.pollMs ?? 60_000,
    locate: options.locate ?? (async () => HERE),
    newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')};
  await render(<RiderApp client={client} config={config} />);
  return {http};
}

/** From here to the station, priced. */
async function priced() {
  await fireEvent.changeText(await screen.findByLabelText('Поиск адреса назначения'), 'вокзал');
  await fireEvent.press(screen.getByRole('button', {name: 'Найти'}));
  await fireEvent.press(await screen.findByRole('button', {name: 'Вокзал'}));
  await fireEvent.press(await screen.findByRole('button', {name: 'Узнать цену'}));
  expect(await screen.findByText('Цена: 120.00 UAH')).toBeTruthy();
}

const card = {id: 'ca000000-0000-4000-8000-000000000001', merchant_id: 'aa000000-0000-4000-8000-000000000001',
  masked_pan: '41****1111', card_type: 'VISA', created_at: '2026-11-02T10:00:00Z'};
const cardQuote = {...quote, payment_methods: ['CASH', 'CARD'], card_hold_minor: 12000};
const withCard = {...ready, 'POST /api/rider/v1/quotes': [{status: 201, body: cardQuote}],
  'GET /api/rider/v1/cards': [{status: 200, body: {cards: [card]}}]};
const awaiting = {...order, status: 'AWAITING_PAYMENT', payment_method: 'CARD', payment_state: 'AUTH_PENDING'};
const ORDER = 'GET /api/rider/v1/orders/' + order.id;
const SWITCH = 'POST /api/rider/v1/orders/' + order.id + '/switch-to-cash';
const posted = (http: {calls: Call[]}) => http.calls.filter(c => c.path === '/api/rider/v1/orders' && c.method === 'POST');

describe('Y1: the plain success', () => {
  it('offers the card with the hold; a card order waits for the payment, then searches', async () => {
    const {http} = await mount({...withCard, 'POST /api/rider/v1/orders': [{status: 202, body: awaiting}],
      [ORDER]: [{status: 200, body: {...awaiting, status: 'SEARCHING', payment_state: 'AUTHORIZED', version: 2}}]},
    {pollMs: 50});
    await priced();
    expect(screen.getByRole('button', {name: '● Наличными'})).toBeTruthy();
    await fireEvent.press(screen.getByRole('button', {name: '○ Картой VISA 41****1111'}));
    expect(screen.getByText('На карте заблокируем 120.00 UAH до конца поездки.')).toBeTruthy();
    await fireEvent.press(screen.getByRole('button', {name: 'Заказать'}));
    expect(await screen.findByText('Ожидаем оплату')).toBeTruthy();
    expect(await screen.findByText('Ищем водителя')).toBeTruthy();
    expect(posted(http)[0]!.body).toMatchObject({payment_method: 'CARD'});
  });
});

describe('Y2: no card choice', () => {
  it.each([['no saved card', {...withCard, 'GET /api/rider/v1/cards': [{status: 200, body: {cards: []}}]}],
    ['CARD not offered', {...withCard, 'POST /api/rider/v1/quotes': [{status: 201, body: {...quote,
      payment_methods: ['CASH'], card_hold_minor: null}}]}]])('%s: the order is cash', async (_, script) => {
    const {http} = await mount({...script, 'POST /api/rider/v1/orders': [{status: 201, body: order}]});
    await priced();
    expect(screen.queryByRole('button', {name: /Картой/})).toBeNull();
    await fireEvent.press(screen.getByRole('button', {name: 'Заказать'}));
    expect(await screen.findByText('Ищем водителя')).toBeTruthy();
    expect(posted(http)[0]!.body).toMatchObject({payment_method: 'CASH'});
  });
});

describe('Y3: a card order that ends without a ride', () => {
  it.each([['PAYMENT_DECLINED', 'Банк отклонил оплату картой.'],
    ['PAYMENT_TIMEOUT', 'Банк не ответил вовремя. Деньги не списаны.']])('%s is said', async (reason, text) => {
    await mount({...ready, 'GET /api/rider/v1/orders/current': [{status: 200, body: {orders: [awaiting]}}],
      [ORDER]: [{status: 200, body: {...awaiting, status: 'UNFULFILLED', status_reason: reason, version: 2}}]},
    {pollMs: 50});
    expect(await screen.findByText(text)).toBeTruthy();
  });
});

describe('Y4, Y5: paying in cash instead', () => {
  it('sends the version once on a double tap and shows the order as cash', async () => {
    const searching = {...awaiting, status: 'SEARCHING', payment_state: 'AUTHORIZED', version: 3};
    const {http} = await mount({...ready, 'GET /api/rider/v1/orders/current': [{status: 200, body: {orders: [searching]}}],
      [SWITCH]: [{status: 200, delayMs: 300, body: {...searching, payment_method: 'CASH', payment_state: 'RELEASED',
        version: 4}}]});
    const button = await screen.findByRole('button', {name: 'Платить наличными'});
    expect(screen.getByText('Оплата: картой')).toBeTruthy();
    await fireEvent.press(button);
    await fireEvent.press(button);
    expect(await screen.findByText('Оплата: наличными')).toBeTruthy();
    const sent = http.calls.filter(c => c.path.endsWith('/switch-to-cash'));
    expect(sent).toHaveLength(1);
    expect(sent[0]!.body).toMatchObject({expected_version: 3});
    expect(screen.queryByRole('button', {name: 'Платить наличными'})).toBeNull();
  });

  it('PAYMENT_UNKNOWN is said', async () => {
    await mount({...ready, 'GET /api/rider/v1/orders/current': [{status: 200, body: {orders: [awaiting]}}],
      [SWITCH]: [problem(409, 'PAYMENT_UNKNOWN')]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Платить наличными'}));
    expect(await screen.findByText('Банк ещё отвечает. Попробуйте через минуту.')).toBeTruthy();
  });
});
