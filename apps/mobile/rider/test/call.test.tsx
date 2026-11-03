import {fireEvent, render, screen, waitFor} from '@testing-library/react-native';
import {Linking} from 'react-native';
import {createApiClient} from '@blizz/api-client';
import {RiderApp, type AppConfig} from '../src/App';

/** Calling the driver during a ride (#378): K1, K3–K6 of the issue. */
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

const CALL = 'GET /api/rider/v1/orders/' + ID + '/call';
const target = (mode: string, phone: string) => ({status: 200, body: {mode, phone}});

/** An order in the given status, on the server and in every poll. */
async function mount(script: Record<string, Answer[]>, status = 'ASSIGNED', shown = 'Водитель едет к вам') {
  const order = {...riding, status, driver: status === 'SEARCHING' ? null : driver};
  // A finished order is no longer current: the ride screen learns the end from the order itself.
  const listed = status === 'FULFILLED' || status === 'CANCELLED' ? {...riding} : order;
  const http = server({
    'GET /api/rider/v1/legal': [{status: 200, body: {documents: []}}],
    'GET /api/rider/v1/orders/current': [{status: 200, body: {orders: [listed]}}],
    'GET /api/rider/v1/cancel-reasons': [{status: 200, body: {reasons: []}}],
    ['GET /api/rider/v1/orders/' + ID]: [{status: 200, body: order}],
    ...script
  });
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: {read: () => null, write: () => {}},
    fetch: http.fetch, correlationId: () => cid, initialSession: session as never});
  const config: AppConfig = {service: 'default', deviceRef: 'test', pollMs: listed === order ? 60_000 : 50, locate: async () => ({lat: 50.45,
    lon: 30.52}), newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')};
  await render(<RiderApp client={client} config={config} />);
  expect(await screen.findByText(shown)).toBeTruthy();
  return {http};
}
const reads = (http: {calls: Call[]}) => http.calls.filter(c => c.path === '/api/rider/v1/orders/' + ID + '/call');
// Linking.openURL is a jest mock of the preset: its calls are cleared between tests, not only the spy restored.
afterEach(() => {
  jest.restoreAllMocks();
  jest.clearAllMocks();
});

describe('K1: the rider calls the driver', () => {
  it.each([['ASSIGNED', 'Водитель едет к вам'], ['IN_SERVICE', 'В пути']])(
    'in %s: each press reads the target then and dials it', async (status, shown) => {
      const open = jest.spyOn(Linking, 'openURL').mockResolvedValue(undefined);
      const {http} = await mount({[CALL]: [target('DIRECT', '+380501112233'),
        target('VIA_SERVICE_NUMBERS', '+380441234567')]}, status, shown);
      expect(reads(http)).toHaveLength(0);
      await fireEvent.press(screen.getByRole('button', {name: 'Позвонить водителю'}));
      await waitFor(() => expect(open).toHaveBeenCalledTimes(1));
      await fireEvent.press(screen.getByRole('button', {name: 'Позвонить водителю'}));
      await waitFor(() => expect(open).toHaveBeenCalledTimes(2));
      expect(open.mock.calls.map(c => c[0])).toEqual(['tel:+380501112233', 'tel:+380441234567']);
      expect(reads(http)).toHaveLength(2);
    });

  it.each([['SEARCHING', 'Ищем водителя'], ['FULFILLED', 'Поездка завершена'], ['CANCELLED', 'Заказ отменён']])(
    'not in %s', async (status, shown) => {
      await mount({}, status, shown);
      expect(screen.queryByRole('button', {name: 'Позвонить водителю'})).toBeNull();
    });
});

describe('K3: through the service', () => {
  it('says so', async () => {
    jest.spyOn(Linking, 'openURL').mockResolvedValue(undefined);
    await mount({[CALL]: [target('VIA_SERVICE_NUMBERS', '+380441234567')]});
    await fireEvent.press(screen.getByRole('button', {name: 'Позвонить водителю'}));
    expect(await screen.findByText('Звонок идёт через номер службы.')).toBeTruthy();
  });

  it('a direct call does not', async () => {
    const open = jest.spyOn(Linking, 'openURL').mockResolvedValue(undefined);
    await mount({[CALL]: [target('DIRECT', '+380501112233')]});
    await fireEvent.press(screen.getByRole('button', {name: 'Позвонить водителю'}));
    await waitFor(() => expect(open).toHaveBeenCalled());
    expect(screen.queryByText('Звонок идёт через номер службы.')).toBeNull();
  });
});

describe('K4: not now', () => {
  it.each([[409, 'STATE_CONFLICT'], [404, 'NOT_FOUND']])('a %i says so and dials nothing', async (code, name) => {
    const open = jest.spyOn(Linking, 'openURL').mockResolvedValue(undefined);
    await mount({[CALL]: [problem(code, name)]});
    await fireEvent.press(screen.getByRole('button', {name: 'Позвонить водителю'}));
    expect(await screen.findByText('Позвонить сейчас нельзя.')).toBeTruthy();
    expect(open).not.toHaveBeenCalled();
  });
});

describe('K5: the phone cannot dial', () => {
  it('shows the number to dial by hand', async () => {
    jest.spyOn(Linking, 'openURL').mockRejectedValue(new Error('no dialer'));
    await mount({[CALL]: [target('DIRECT', '+380501112233')]});
    await fireEvent.press(screen.getByRole('button', {name: 'Позвонить водителю'}));
    expect(await screen.findByText('Наберите номер: +380501112233')).toBeTruthy();
  });
});

describe('K6: one at a time', () => {
  it('a double press reads once', async () => {
    const open = jest.spyOn(Linking, 'openURL').mockResolvedValue(undefined);
    const {http} = await mount({[CALL]: [{...target('DIRECT', '+380501112233'), delayMs: 50}]});
    fireEvent.press(screen.getByRole('button', {name: 'Позвонить водителю'}));
    await fireEvent.press(screen.getByRole('button', {name: 'Позвонить водителю'}));
    await waitFor(() => expect(open).toHaveBeenCalledTimes(1));
    expect(reads(http)).toHaveLength(1);
  });
});
