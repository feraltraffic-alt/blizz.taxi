import {fireEvent, render, screen, waitFor} from '@testing-library/react-native';
import {Linking} from 'react-native';
import {createApiClient} from '@blizz/api-client';
import {DriverApp, type AppConfig} from '../src/App';

/** Calling the rider during a trip (#378): K2 of the issue. */
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
const TRIP = '80000000-0000-4000-8000-000000000003';
const admitted = {id: session.subject.id, account_state: 'ACTIVE', review_status: 'APPROVED', admission_city_ids: [KYIV],
  has_payment_terminal: false, version: 3, vehicles: [{id: VEHICLE, state: 'APPROVED'}], documents: []};
const online = {driver_id: session.subject.id, session_id: SESSION, session_version: 1, session_state: 'OPEN',
  connection: 'CONNECTED', geolocation: 'FRESH', occupancy: 'FREE', account_state: 'ACTIVE', review_status: 'APPROVED',
  eligible: true, ineligible_reasons: []};
const trip = (phase: string, version: number) => ({id: TRIP, order_id: ORDER, assignment_id: OFFER, phase, version,
  pickup: {lat: 50.4501, lon: 30.5234}, pickup_label: 'Майдан Незалежності', dropoff: {lat: 50.4405, lon: 30.489},
  dropoff_label: 'Залізничний вокзал', payment_method: 'CASH', price_minor: 15000, currency: 'UAH', needs_review: false,
  wallet_minor: 2000, discount_minor: 1000, contact_attempts: [], comment: null, entrance: null});
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

const problem = (status: number, code: string) => ({status, body: {type: 'about:blank', title: code, status, code,
  correlation_id: cid, retryable: false}});
const base = {
  'GET /api/driver/v1/legal': [{status: 200, body: {documents: []}}],
  'GET /api/driver/v1/profile': [{status: 200, body: admitted}],
  'GET /api/driver/v1/work-sessions/current': [{status: 200, body: online}],
  'GET /api/driver/v1/cancel-reasons': [{status: 200, body: reasons}]
};

async function mount(script: Record<string, Answer[]>, options: {clock?: number} = {}) {
  const http = server({...base, ...script});
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: {read: () => null, write: () => {}},
    fetch: http.fetch, correlationId: () => cid, initialSession: session as never});
  const config: AppConfig = {service: 'default', deviceRef: 'test-driver', now: () => options.clock ?? NOW,
    heartbeatMs: 60_000, pollMs: 60_000, locate: async () => ({lat: 50.4501, lon: 30.5234, accuracy_m: 8}),
    newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')};
  await render(<DriverApp client={client} config={config} />);
  return {http};
}

afterEach(() => jest.restoreAllMocks());

describe('K2: the driver calls the rider', () => {
  it.each([['TO_PICKUP', 'Едете к пассажиру'], ['WAITING', 'Ждёте пассажира'], ['IN_PROGRESS', 'Везёте пассажира']])(
    'in %s: a press reads the target then and dials it', async (phase, shown) => {
      const open = jest.spyOn(Linking, 'openURL').mockResolvedValue(undefined);
      const {http} = await mount({'GET /api/driver/v1/trips/current': [{status: 200, body: trip(phase, 3)}],
        ['GET /api/driver/v1/trips/' + TRIP + '/call']: [{status: 200, body: {mode: 'DIRECT', phone: '+380671234567'}}]});
      expect(await screen.findByText(shown)).toBeTruthy();
      expect(http.calls.filter(c => c.path.endsWith('/call'))).toHaveLength(0);
      await fireEvent.press(screen.getByRole('button', {name: 'Позвонить пассажиру'}));
      await waitFor(() => expect(open).toHaveBeenCalledWith('tel:+380671234567'));
      expect(http.calls.filter(c => c.path === '/api/driver/v1/trips/' + TRIP + '/call')).toHaveLength(1);
    });

  it('a 409 says it cannot call now', async () => {
    const open = jest.spyOn(Linking, 'openURL').mockResolvedValue(undefined);
    await mount({'GET /api/driver/v1/trips/current': [{status: 200, body: trip('TO_PICKUP', 3)}],
      ['GET /api/driver/v1/trips/' + TRIP + '/call']: [problem(409, 'STATE_CONFLICT')]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Позвонить пассажиру'}));
    expect(await screen.findByText('Позвонить сейчас нельзя.')).toBeTruthy();
    expect(open).not.toHaveBeenCalled();
  });
});
