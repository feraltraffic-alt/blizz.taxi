import {fireEvent, render, screen, waitFor} from '@testing-library/react-native';
import {Linking} from 'react-native';
import {createApiClient} from '@blizz/api-client';
import {RiderApp, type AppConfig} from '../src/App';

/** The safety button in the rider's ride (#338): F1–F4 of the issue. */
const cid = '10000000-0000-4000-8000-000000000001';
const session = {
  session_id: '10000000-0000-4000-8000-000000000002', subject: {type: 'CLIENT', id: '10000000-0000-4000-8000-000000000003'},
  audience: 'rider', access_token: 'test-only-access', refresh_token: 'test-only-refresh',
  access_expires_at: '2099-01-01T00:00:00Z', refresh_expires_at: '2099-01-01T00:00:00Z', password_change_required: false
};
const ID = '90000000-0000-4000-8000-000000000001';
const driver = {name: 'Іван', make: 'Skoda', model: 'Octavia', color: 'white', registration_number: 'AA0001TX'};
const riding = {id: ID, short_number: 7, status: 'ASSIGNED', version: 4, price_minor: 12000, currency: 'UAH', driver};

type Call = {method: string; path: string; query: URLSearchParams; body?: unknown};
type Answer = {status: number; body?: unknown; delayMs?: number} | 'network';

function server(script: Record<string, Answer[]>) {
  const calls: Call[] = [];
  const fetch = jest.fn(async (url: string, init: RequestInit) => {
    const parsed = new URL(url);
    const path = parsed.pathname;
    const method = String(init.method);
    calls.push({method, path, query: parsed.searchParams, body: init.body ? JSON.parse(String(init.body)) : undefined});
    const answers = script[method + ' ' + path] ?? [{status: 404, body: {code: 'NOT_FOUND', correlation_id: cid}}];
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

const SAFETY = 'GET /api/rider/v1/safety-contacts';
const contacts = (over: Record<string, unknown> = {}) => ({status: 200, body: {city_id: 'k1', emergency_number: '112',
  support_phone: '+380441234567', extra: [{label: 'Полиция', phone: '+380441110102'}],
  disclaimer_code: 'NO_AUTO_DISPATCH', ...over}});

/** An order with its driver on the way, on the server and in every poll. */
async function mount(script: Record<string, Answer[]>) {
  const http = server({
    'GET /api/rider/v1/legal': [{status: 200, body: {documents: []}}],
    'GET /api/rider/v1/orders/current': [{status: 200, body: {orders: [riding]}}],
    'GET /api/rider/v1/cancel-reasons': [{status: 200, body: {reasons: []}}],
    ['GET /api/rider/v1/orders/' + ID]: [{status: 200, body: riding}],
    [SAFETY]: [contacts()],
    ...script
  });
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: {read: () => null, write: () => {}},
    fetch: http.fetch, correlationId: () => cid, initialSession: session as never});
  const config: AppConfig = {service: 'default', deviceRef: 'test', pollMs: 60_000, locate: async () => ({lat: 50.45,
    lon: 30.52}), newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')};
  await render(<RiderApp client={client} config={config} />);
  expect(await screen.findByText('Водитель едет к вам')).toBeTruthy();
  await fireEvent.press(screen.getByRole('button', {name: 'Безопасность'}));
  return {http};
}
afterEach(() => jest.restoreAllMocks());

describe('F1, F2: the contacts in a ride', () => {
  it('lists them with the disclaimer, read once, each called only on a press', async () => {
    const open = jest.spyOn(Linking, 'openURL').mockResolvedValue(undefined);
    const {http} = await mount({});
    expect(await screen.findByText('Экстренная служба: 112')).toBeTruthy();
    expect(screen.getByText('Поддержка службы: +380441234567')).toBeTruthy();
    expect(screen.getByText('Полиция: +380441110102')).toBeTruthy();
    expect(screen.getByText('Служба не вызывает экстренные службы сама — позвоните сами.')).toBeTruthy();
    expect(open).not.toHaveBeenCalled();
    await fireEvent.press(screen.getByRole('button', {name: 'Позвонить: Экстренная служба'}));
    await fireEvent.press(screen.getByRole('button', {name: 'Позвонить: Полиция'}));
    expect(open.mock.calls.map(c => c[0])).toEqual(['tel:112', 'tel:+380441110102']);
    const reads = http.calls.filter(c => c.path === '/api/rider/v1/safety-contacts');
    expect(reads).toHaveLength(1);
    expect(reads[0]!.query.has('city_id')).toBe(false);
  });
});

describe('F3: only what is there', () => {
  it('no support line without a support phone', async () => {
    await mount({[SAFETY]: [contacts({support_phone: null, extra: []})]});
    expect(await screen.findByText('Экстренная служба: 112')).toBeTruthy();
    expect(screen.queryByText(/Поддержка службы/)).toBeNull();
  });
});

describe('F4: a failed read', () => {
  it('is told, and 112 is still offered', async () => {
    const open = jest.spyOn(Linking, 'openURL').mockResolvedValue(undefined);
    await mount({[SAFETY]: [problem(503, 'UNAVAILABLE')]});
    expect(await screen.findByText(/Не удалось/)).toBeTruthy();
    await fireEvent.press(screen.getByRole('button', {name: 'Позвонить: Экстренная служба'}));
    await waitFor(() => expect(open).toHaveBeenCalledWith('tel:112'));
  });
});
