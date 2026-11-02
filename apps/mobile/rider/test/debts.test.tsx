import {fireEvent, render, screen} from '@testing-library/react-native';
import {createApiClient} from '@blizz/api-client';
import {RiderApp, type AppConfig} from '../src/App';

/** The provider's page: what the app sends it is recorded, and it "returns" at once, as the sandbox's FAKE page does. */
const pages: {url: string; fields: Record<string, string>}[] = [];
jest.mock('../src/ProviderPage', () => {
  const {useEffect} = jest.requireActual<typeof import('react')>('react');
  return {ProviderPage: ({url, fields, onDone}: {url: string; fields: Record<string, string>; onDone: () => void}) => {
    useEffect(() => {
      pages.push({url, fields});
      onDone();
    }, []);
    return null;
  }};
});

/** Paying what is owed (#332): D1–D5 of the issue. */
const cid = '10000000-0000-4000-8000-000000000001';
const session = {
  session_id: '10000000-0000-4000-8000-000000000002', subject: {type: 'CLIENT', id: '10000000-0000-4000-8000-000000000003'},
  audience: 'rider', access_token: 'test-only-access', refresh_token: 'test-only-refresh',
  access_expires_at: '2099-01-01T00:00:00Z', refresh_expires_at: '2099-01-01T00:00:00Z', password_change_required: false
};

type Call = {method: string; path: string; body?: unknown};
type Answer = {status: number; body?: unknown; delayMs?: number; headers?: Record<string, string>};

function server(script: Record<string, Answer[]>) {
  const calls: Call[] = [];
  const fetch = jest.fn(async (url: string, init: RequestInit) => {
    const path = new URL(url).pathname;
    const method = String(init.method);
    calls.push({method, path, body: init.body ? JSON.parse(String(init.body)) : undefined});
    const answers = script[method + ' ' + path] ?? [{status: 404, body: {code: 'NOT_FOUND', correlation_id: cid}}];
    const answer = answers.length > 1 ? answers.shift()! : answers[0]!;
    if (answer.delayMs) await new Promise(resolve => setTimeout(resolve, answer.delayMs));
    return new Response(answer.body === undefined ? null : JSON.stringify(answer.body),
      {status: answer.status, headers: {'Content-Type': 'application/json', ...answer.headers}});
  });
  return {fetch: fetch as unknown as typeof globalThis.fetch, calls};
}
const problem = (status: number, code: string, headers?: Record<string, string>) => ({status, headers,
  body: {type: 'about:blank', title: code, status, code, correlation_id: cid, retryable: false}});

const ORDER = '90000000-0000-4000-8000-000000000001';
const PAY = 'b0000000-0000-4000-8000-000000000001';
const debt = {order_id: ORDER, currency: 'UAH', owed_minor: 15000, paid_minor: 3000, remainder_minor: 12000,
  repayments: []};
const payment = (state: string, over: Record<string, unknown> = {}) => ({id: PAY, state, amount_minor: 12000,
  currency: 'UAH', created_at: '2026-11-02T10:00:00Z', expires_at: '2026-11-02T10:15:00Z', ...over});
const started = payment('PENDING', {url: 'https://secure.wayforpay.test/pay', fields: {orderReference: 'r1'},
  return_url: 'https://api.blizz.test/return'});
const LIST = 'GET /api/rider/v1/obligations';
const START = 'POST /api/rider/v1/obligations/' + ORDER + '/payment-sessions';
const READ = 'GET /api/rider/v1/payments/' + PAY;
beforeEach(() => {pages.length = 0;});

async function mount(script: Record<string, Answer[]>) {
  const http = server({
    'GET /api/rider/v1/legal': [{status: 200, body: {documents: []}}],
    'GET /api/rider/v1/orders/current': [{status: 200, body: {orders: []}}],
    'GET /api/rider/v1/me': [{status: 200, body: {account_state: 'ACTIVE', phone: '+380671111111', name: 'Анна'}}],
    [LIST]: [{status: 200, body: {items: [debt]}}, {status: 200, body: {items: []}}],
    [START]: [{status: 201, body: started}],
    [READ]: [{status: 200, body: payment('PENDING')}, {status: 200, body: payment('COMPLETED')}],
    ...script
  });
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: {read: () => null, write: () => {}},
    fetch: http.fetch, correlationId: () => cid, initialSession: session as never});
  const config: AppConfig = {service: 'default', deviceRef: 'test', pollMs: 40, locate: async () => ({lat: 50.45,
    lon: 30.52}), newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')};
  await render(<RiderApp client={client} config={config} />);
  await fireEvent.press(await screen.findByRole('button', {name: 'Профиль'}));
  await fireEvent.press(await screen.findByRole('button', {name: 'Долги'}));
  return {http};
}
const starts = (http: {calls: Call[]}) => http.calls.filter(c => c.method === 'POST');

describe('D1: the list', () => {
  it('shows each obligation with what was paid', async () => {
    await mount({[LIST]: [{status: 200, body: {items: [debt]}}]});
    expect(await screen.findByText('Долг 120.00 UAH (оплачено 30.00 из 150.00)')).toBeTruthy();
  });

  it('says when there is none', async () => {
    await mount({[LIST]: [{status: 200, body: {items: []}}]});
    expect(await screen.findByText('Долгов нет.')).toBeTruthy();
  });
});

describe('D2: paying', () => {
  it('one start for the whole remainder, the page, the payment read until settled, the list again', async () => {
    const {http} = await mount({});
    await fireEvent.press(await screen.findByRole('button', {name: 'Оплатить 120.00 UAH'}));
    expect(await screen.findByText('Оплачено 120.00 UAH.')).toBeTruthy();
    expect(starts(http).map(c => [c.path, c.body])).toEqual([['/api/rider/v1/obligations/' + ORDER
      + '/payment-sessions', {command_id: expect.any(String)}]]);
    expect(pages).toEqual([{url: 'https://secure.wayforpay.test/pay', fields: {orderReference: 'r1'}}]);
    expect(http.calls.filter(c => c.path === '/api/rider/v1/payments/' + PAY)).toHaveLength(2);
    expect(await screen.findByText('Долгов нет.')).toBeTruthy();
  });
});

describe('D3: not paid', () => {
  it.each([
    [payment('FAILED', {failure_reason: 'Отказ банка'}), 'Оплата не прошла: Отказ банка'],
    [payment('EXPIRED'), 'Время оплаты истекло.']
  ])('%j is told', async (result, text) => {
    await mount({[READ]: [{status: 200, body: result}]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Оплатить 120.00 UAH'}));
    expect(await screen.findByText(text)).toBeTruthy();
  });
});

describe('D4: a payment already open', () => {
  it('is told', async () => {
    await mount({[START]: [problem(409, 'STATE_CONFLICT')]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Оплатить 120.00 UAH'}));
    expect(await screen.findByText('Оплата этого долга уже открыта — завершите её.')).toBeTruthy();
    expect(pages).toEqual([]);
  });
});

describe('D5: one at a time', () => {
  it('a double press starts once', async () => {
    const {http} = await mount({[START]: [{status: 201, delayMs: 200, body: started}]});
    const pay = await screen.findByRole('button', {name: 'Оплатить 120.00 UAH'});
    await fireEvent.press(pay);
    await fireEvent.press(pay);
    expect(await screen.findByText('Оплачено 120.00 UAH.')).toBeTruthy();
    expect(starts(http)).toHaveLength(1);
  });
});
