import {fireEvent, render, screen, waitFor} from '@testing-library/react-native';
import {createApiClient} from '@blizz/api-client';
import type {PushData, PushPort} from '@blizz/mobile-ui';
import {DriverApp, type AppConfig} from '../src/App';

/** Pushes in the driver app (#264, AC-19): P1, P4 and P7 of the issue. */
const cid = '10000000-0000-4000-8000-000000000001';
const session = {
  session_id: '10000000-0000-4000-8000-000000000002', subject: {type: 'DRIVER', id: '10000000-0000-4000-8000-000000000003'},
  audience: 'driver', access_token: 'test-only-access', refresh_token: 'test-only-refresh',
  access_expires_at: '2099-01-01T00:00:00Z', refresh_expires_at: '2099-01-01T00:00:00Z', password_change_required: false
};
const NOW = Date.parse('2026-11-02T10:00:00Z');
const KYIV = '50000000-0000-4000-8000-000000000001';
const VEHICLE = '60000000-0000-4000-8000-000000000001';
const SESSION = '70000000-0000-4000-8000-000000000001';
const OFFER = '80000000-0000-4000-8000-000000000001';
const ORDER = '80000000-0000-4000-8000-000000000002';
const admitted = {id: session.subject.id, account_state: 'ACTIVE', review_status: 'APPROVED', admission_city_ids: [KYIV],
  has_payment_terminal: false, version: 3, vehicles: [{id: VEHICLE, state: 'APPROVED'}], documents: []};
const online = {driver_id: session.subject.id, session_id: SESSION, session_version: 1, session_state: 'OPEN',
  connection: 'CONNECTED', geolocation: 'FRESH', occupancy: 'FREE', account_state: 'ACTIVE', review_status: 'APPROVED',
  eligible: true, ineligible_reasons: []};
const offer = (secondsLeft: number) => ({id: OFFER, order_id: ORDER,
  expires_at: new Date(NOW + secondsLeft * 1000).toISOString(), server_time: new Date(NOW).toISOString(),
  seconds_left: secondsLeft, vehicle_class: 'STANDARD', pickup: {lat: 50.4501, lon: 30.5234},
  pickup_label: 'Майдан Незалежності', dropoff_label: 'Залізничний вокзал', payment_method: 'CASH', price_kind: 'FIXED',
  price_minor: 15000, currency: 'UAH', expected_earnings_minor: 12750, comment: 'Біля метро', entrance: null,
  distance_m: 200});
const reasons = {reasons: [
  {code: 'CAR_BROKE', labels: {ru: 'Сломалась машина', uk: 'Зламалася машина', pl: 'Zepsuty samochód'},
    driver_outcome: 'RETURN_TO_SEARCH'}]};

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
    return new Response(answer.body === undefined ? null : JSON.stringify(answer.body), {
      status: answer.status, headers: {'Content-Type': 'application/json'}
    });
  });
  return {fetch: fetch as unknown as typeof globalThis.fetch, calls};
}

const base = {
  'GET /api/driver/v1/legal': [{status: 200, body: {documents: []}}],
  'GET /api/driver/v1/profile': [{status: 200, body: admitted}],
  'GET /api/driver/v1/work-sessions/current': [{status: 200, body: online}],
  'GET /api/driver/v1/cancel-reasons': [{status: 200, body: reasons}]
};
const noTrip = {'GET /api/driver/v1/trips/current': [{status: 204}]};

async function mount(script: Record<string, Answer[]>, push: PushPort) {
  const http = server({...base, ...script});
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: {read: () => 'stored', write: () => {}},
    fetch: http.fetch, correlationId: () => cid, initialSession: session as never});
  const config: AppConfig = {service: 'default', deviceRef: 'test-driver', now: () => NOW, push,
    heartbeatMs: 60_000, pollMs: 60_000, locate: async () => ({lat: 50.4501, lon: 30.5234, accuracy_m: 8}),
    newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')};
  await render(<DriverApp client={client} config={config} />);
  return {http};
}


const DEVICE = 'd0000000-0000-4000-8000-000000000002';

function phone() {
  const deciders = new Set<(data: PushData) => boolean>();
  const port: PushPort = {
    token: async () => ({platform: 'IOS', token: 'apns-fcm-token'}),
    decide: decider => {
      deciders.add(decider);
      return () => {deciders.delete(decider);};
    }
  };
  return {port, deliver: (data: PushData) => [...deciders].every(decide => decide(data))};
}

const pushes = {'POST /api/driver/v1/push-devices': [{status: 201, body: {id: DEVICE, platform: 'IOS', state: 'ACTIVE',
  created_at: '2026-11-02T10:00:00Z'}}], ['POST /api/driver/v1/push-devices/' + DEVICE + '/remove']: [{status: 204}],
'POST /auth/v1/logout': [{status: 204}]};

describe('P1 and P4 on the driver\'s side', () => {
  it('registers once after sign-in, and "Выйти" removes the device before signing out', async () => {
    const {http} = await mount({...noTrip, ...pushes, 'GET /api/driver/v1/offers': [{status: 200, body: []}]},
      phone().port);
    await waitFor(() => expect(http.calls.some(c => c.path === '/api/driver/v1/push-devices')).toBe(true));
    expect(http.calls.find(c => c.path === '/api/driver/v1/push-devices')!.body).toMatchObject({platform: 'IOS',
      token: 'apns-fcm-token', locale: 'ru'});
    await fireEvent.press(screen.getByRole('button', {name: 'Выйти'}));
    await waitFor(() => expect(http.calls.some(c => c.path === '/auth/v1/logout')).toBe(true));
    expect(http.calls.map(c => c.path).filter(p => p.includes('/remove') || p === '/auth/v1/logout'))
      .toEqual(['/api/driver/v1/push-devices/' + DEVICE + '/remove', '/auth/v1/logout']);
  });
});

describe('P7: an offer push in the foreground', () => {
  it('is not shown, and the offers are read at once', async () => {
    const device = phone();
    const {http} = await mount({...noTrip, ...pushes, 'GET /api/driver/v1/offers': [{status: 200, body: []},
      {status: 200, body: [offer(15)]}]}, device.port);
    expect(await screen.findByText('Ждём предложений…')).toBeTruthy();
    expect(device.deliver({type: 'driver.offer', order_id: ORDER, order_version: '3', offer_id: OFFER})).toBe(false);
    expect(await screen.findByRole('button', {name: 'Принять'})).toBeTruthy();
    expect(http.calls.filter(c => c.path === '/api/driver/v1/offers')).toHaveLength(2);
  });

  it('another push is shown', async () => {
    const device = phone();
    await mount({...noTrip, ...pushes, 'GET /api/driver/v1/offers': [{status: 200, body: []}]}, device.port);
    await screen.findByText('Ждём предложений…');
    expect(device.deliver({type: 'driver.document-expiring'})).toBe(true);
  });
});
