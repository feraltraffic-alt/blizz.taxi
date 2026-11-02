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

/** The bonus account and its top-up (#334): W1–W3 of the issue. */
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

const KYIV = {id: '50000000-0000-4000-8000-000000000001', code: 'kyiv', name: 'Київ', currency: 'UAH',
  timezone: 'Europe/Kyiv', center: {lat: 50.45, lon: 30.52}};
const LVIV = {...KYIV, id: '50000000-0000-4000-8000-000000000002', code: 'lviv', name: 'Львів'};
const TOP = 'a0000000-0000-4000-8000-000000000001';
const wallet = (available: number) => ({client_id: session.subject.id, balances: [{currency: 'UAH',
  balance_minor: available, reserved_minor: 0, available_minor: available}], entries: [{id: 'w1',
  at: '2026-11-02T09:00:00Z', kind: 'CARD_TOP_UP', currency: 'UAH', amount_minor: 5000, reason: 'Пополнение',
  staff_id: null}, {id: 'w2', at: '2026-11-01T09:00:00Z', kind: 'TRIP_PAYMENT', currency: 'UAH', amount_minor: -2000,
  reason: 'Поездка 1042', staff_id: null}], page: {next_cursor: null, has_more: false}});
const topUp = (state: string, over: Record<string, unknown> = {}) => ({id: TOP, state, amount_minor: 10000,
  currency: 'UAH', created_at: '2026-11-02T10:00:00Z', expires_at: '2026-11-02T10:15:00Z', ...over});
const WALLET = 'GET /api/rider/v1/wallet';
const START = 'POST /api/rider/v1/wallet/card-top-ups';
const READ = 'GET /api/rider/v1/wallet/card-top-ups/' + TOP;
beforeEach(() => {pages.length = 0;});

async function mount(script: Record<string, Answer[]>, cities = [KYIV]) {
  const http = server({
    'GET /api/rider/v1/legal': [{status: 200, body: {documents: []}}],
    'GET /api/rider/v1/orders/current': [{status: 200, body: {orders: []}}],
    'GET /api/rider/v1/me': [{status: 200, body: {account_state: 'ACTIVE', phone: '+380671111111', name: 'Анна'}}],
    'GET /api/config/v1/bootstrap': [{status: 200, body: {cities}}],
    [WALLET]: [{status: 200, body: wallet(3000)}, {status: 200, body: wallet(13000)}],
    [START]: [{status: 201, body: topUp('PENDING', {url: 'https://secure.wayforpay.test/pay',
      fields: {orderReference: 't1'}, return_url: 'https://api.blizz.test/return'})}],
    [READ]: [{status: 200, body: topUp('PENDING')}, {status: 200, body: topUp('COMPLETED')}],
    ...script
  });
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: {read: () => null, write: () => {}},
    fetch: http.fetch, correlationId: () => cid, initialSession: session as never});
  const config: AppConfig = {service: 'default', deviceRef: 'test', pollMs: 40, locate: async () => ({lat: 50.45,
    lon: 30.52}), newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')};
  await render(<RiderApp client={client} config={config} />);
  await fireEvent.press(await screen.findByRole('button', {name: 'Профиль'}));
  await fireEvent.press(await screen.findByRole('button', {name: 'Бонусы'}));
  return {http};
}
const starts = (http: {calls: Call[]}) => http.calls.filter(c => c.method === 'POST');

describe('W1: the wallet', () => {
  it('shows the available balance and the movements', async () => {
    await mount({});
    expect(await screen.findByText('Доступно: 30.00 UAH')).toBeTruthy();
    expect(screen.getByText('+50.00 UAH · Пополнение картой · Пополнение')).toBeTruthy();
    expect(screen.getByText('−20.00 UAH · Оплата поездки · Поездка 1042')).toBeTruthy();
  });
});

describe('W2: topping up', () => {
  it('one start in minor units for the city, the page, then the wallet again', async () => {
    const {http} = await mount({});
    await fireEvent.changeText(await screen.findByLabelText('Сумма пополнения, UAH'), '100');
    await fireEvent.press(screen.getByRole('button', {name: 'Пополнить картой'}));
    expect(await screen.findByText('Баланс пополнен на 100.00 UAH.')).toBeTruthy();
    expect(await screen.findByText('Доступно: 130.00 UAH')).toBeTruthy();
    expect(starts(http).map(c => c.body)).toEqual([{command_id: expect.any(String), city_id: KYIV.id,
      amount_minor: 10000}]);
    expect(pages).toEqual([{url: 'https://secure.wayforpay.test/pay', fields: {orderReference: 't1'}}]);
  });
});

describe('W3: several cities', () => {
  it('the chosen city takes the money', async () => {
    const {http} = await mount({}, [KYIV, LVIV]);
    await fireEvent.press(await screen.findByRole('button', {name: 'Город оплаты: Львів'}));
    await fireEvent.changeText(screen.getByLabelText('Сумма пополнения, UAH'), '100');
    await fireEvent.press(screen.getByRole('button', {name: 'Пополнить картой'}));
    expect(await screen.findByText('Баланс пополнен на 100.00 UAH.')).toBeTruthy();
    expect(starts(http)[0]!.body).toMatchObject({city_id: LVIV.id});
  });

  it('with one city there is no choice', async () => {
    await mount({});
    await screen.findByText('Доступно: 30.00 UAH');
    expect(screen.queryByRole('button', {name: /Город оплаты/})).toBeNull();
  });
});
