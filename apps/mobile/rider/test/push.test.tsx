import {fireEvent, render, screen, waitFor} from '@testing-library/react-native';
import {createApiClient} from '@blizz/api-client';
import type {PushData, PushPort} from '@blizz/mobile-ui';
import {RiderApp, type AppConfig} from '../src/App';

/** Pushes in the rider app (#264, AC-19): P1–P6 of the issue. */
const cid = '10000000-0000-4000-8000-000000000001';
const session = {
  session_id: '10000000-0000-4000-8000-000000000002', subject: {type: 'CLIENT', id: '10000000-0000-4000-8000-000000000003'},
  audience: 'rider', access_token: 'test-only-access', refresh_token: 'test-only-refresh',
  access_expires_at: '2099-01-01T00:00:00Z', refresh_expires_at: '2099-01-01T00:00:00Z', password_change_required: false
};
const ID = '90000000-0000-4000-8000-000000000001';
const driver = {name: 'Іван', make: 'Skoda', model: 'Octavia', color: 'white', registration_number: 'AA0001TX'};
const riding = {id: ID, short_number: 7, status: 'ASSIGNED', version: 5, price_minor: 12000, currency: 'UAH', driver};

type Call = {method: string; path: string; body?: unknown};
type Answer = {status: number; body?: unknown; delayMs?: number};

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
      {status: answer.status, headers: {'Content-Type': 'application/json'}});
  });
  return {fetch: fetch as unknown as typeof globalThis.fetch, calls};
}

const problem = (status: number, code: string) => ({status, body: {type: 'about:blank', title: code, status, code,
  correlation_id: cid, retryable: false}});

const DEVICE = 'd0000000-0000-4000-8000-000000000001';
const REGISTER = 'POST /api/rider/v1/push-devices';

/** A phone's pushes: a token (or none without permission), and a foreground push delivered to the app's deciders. */
function phone(token: string | null) {
  const deciders = new Set<(data: PushData) => boolean>();
  const port: PushPort = {
    token: async () => token === null ? null : {platform: 'ANDROID', token},
    decide: decider => {
      deciders.add(decider);
      return () => {deciders.delete(decider);};
    }
  };
  return {port, deliver: (data: PushData) => [...deciders].every(decide => decide(data))};
}

async function mount(script: Record<string, Answer[]>, push: PushPort | undefined) {
  const http = server({
    'GET /api/rider/v1/legal': [{status: 200, body: {documents: []}}],
    'GET /api/rider/v1/orders/current': [{status: 200, body: {orders: [riding]}}],
    'GET /api/rider/v1/cancel-reasons': [{status: 200, body: {reasons: []}}],
    ['GET /api/rider/v1/orders/' + ID]: [{status: 200, body: {...riding, status: 'IN_SERVICE', version: 6}}],
    'GET /api/rider/v1/me': [{status: 200, body: {account_state: 'ACTIVE', phone: '+380671234567', name: null}}],
    'POST /auth/v1/logout': [{status: 204}],
    ...script
  });
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: {read: () => 'stored',
    write: () => {}}, fetch: http.fetch, correlationId: () => cid, initialSession: session as never});
  const config: AppConfig = {service: 'default', deviceRef: 'test', pollMs: 60_000, locale: 'uk', push,
    locate: async () => ({lat: 50.45, lon: 30.52}),
    newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')};
  await render(<RiderApp client={client} config={config} />);
  expect(await screen.findByText('Водій їде до вас')).toBeTruthy();
  return {http};
}

const registered = {status: 201, body: {id: DEVICE, platform: 'ANDROID', locale: 'uk', state: 'ACTIVE',
  created_at: '2026-11-02T10:00:00Z'}};
const reads = (http: {calls: Call[]}) => http.calls.filter(c => c.method === 'GET' && c.path.endsWith(ID));

describe('P1–P3: registration', () => {
  it('P1: after sign-in and the texts, one registration with the token, the platform and the locale', async () => {
    const {http} = await mount({[REGISTER]: [registered]}, phone('fcm-token-1').port);
    await waitFor(() => expect(http.calls.filter(c => c.path === '/api/rider/v1/push-devices')).toHaveLength(1));
    const body = http.calls.find(c => c.path === '/api/rider/v1/push-devices')!.body as Record<string, string>;
    expect(body).toMatchObject({platform: 'ANDROID', token: 'fcm-token-1', locale: 'uk'});
    expect(body.command_id).toMatch(/^40000000-/);
  });

  it('P2: without permission nothing is sent and the app works', async () => {
    const {http} = await mount({}, phone(null).port);
    await new Promise(resolve => setTimeout(resolve, 100));
    expect(http.calls.some(c => c.path === '/api/rider/v1/push-devices')).toBe(false);
  });

  it('P3: a failed registration says nothing and blocks nothing', async () => {
    const {http} = await mount({[REGISTER]: [problem(500, 'INTERNAL')]}, phone('fcm-token-1').port);
    await waitFor(() => expect(http.calls.some(c => c.path === '/api/rider/v1/push-devices')).toBe(true));
    expect(screen.queryByText(/Не вдалося/)).toBeNull();
    expect(screen.getByText('Водій їде до вас')).toBeTruthy();
  });

  it('a build without pushes (the web one) registers nothing', async () => {
    const {http} = await mount({}, undefined);
    await new Promise(resolve => setTimeout(resolve, 100));
    expect(http.calls.some(c => c.path.includes('push-devices'))).toBe(false);
  });
});

describe('P4: signing out', () => {
  it('removes the registered device first, then signs out', async () => {
    const {http} = await mount({[REGISTER]: [registered],
      ['POST /api/rider/v1/push-devices/' + DEVICE + '/remove']: [{status: 204}]}, phone('fcm-token-1').port);
    await waitFor(() => expect(http.calls.some(c => c.path === '/api/rider/v1/push-devices')).toBe(true));
    await fireEvent.press(screen.getByRole('button', {name: 'Профіль'}));
    await fireEvent.press(await screen.findByRole('button', {name: 'Вийти'}));
    await waitFor(() => expect(http.calls.some(c => c.path === '/auth/v1/logout')).toBe(true));
    const order = http.calls.map(c => c.path).filter(p => p.includes('/remove') || p === '/auth/v1/logout');
    expect(order).toEqual(['/api/rider/v1/push-devices/' + DEVICE + '/remove', '/auth/v1/logout']);
  });

  it('without a device it only signs out', async () => {
    const {http} = await mount({}, phone(null).port);
    await fireEvent.press(screen.getByRole('button', {name: 'Профіль'}));
    await fireEvent.press(await screen.findByRole('button', {name: 'Вийти'}));
    await waitFor(() => expect(http.calls.some(c => c.path === '/auth/v1/logout')).toBe(true));
    expect(http.calls.some(c => c.path.includes('/remove'))).toBe(false);
  });
});

describe('P5, P6: a push in the foreground (AC-19)', () => {
  it('P5: about the order on screen and not newer is not shown, and nothing is read', async () => {
    const device = phone('fcm-token-1');
    const {http} = await mount({[REGISTER]: [registered]}, device.port);
    const before = reads(http).length;
    expect(device.deliver({type: 'rider.driver-assigned', order_id: ID, order_version: '4'})).toBe(false);
    expect(device.deliver({type: 'rider.driver-assigned', order_id: ID, order_version: '5'})).toBe(false);
    await new Promise(resolve => setTimeout(resolve, 100));
    expect(reads(http)).toHaveLength(before);
  });

  it('P5: a newer one is shown and the order is read at once', async () => {
    const device = phone('fcm-token-1');
    const {http} = await mount({[REGISTER]: [registered]}, device.port);
    const before = reads(http).length;
    expect(device.deliver({type: 'rider.driver-arrived', order_id: ID, order_version: '6'})).toBe(true);
    expect(await screen.findByText('У дорозі')).toBeTruthy();
    expect(reads(http).length).toBeGreaterThan(before);
  });

  it('P6: a push about another order is shown', async () => {
    const device = phone('fcm-token-1');
    await mount({[REGISTER]: [registered]}, device.port);
    expect(device.deliver({type: 'rider.trip-completed', order_id: '90000000-0000-4000-8000-000000000999',
      order_version: '2'})).toBe(true);
  });
});
