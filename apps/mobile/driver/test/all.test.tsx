import {fireEvent, render, screen, waitFor} from '@testing-library/react-native';
import {createApiClient} from '@blizz/api-client';
import {DriverApp, type AppConfig} from '../src/App';

/** The driver's ALL tab (#256): A1–A7 of the issue. */
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
const offer = (secondsLeft: number) => ({id: OFFER, order_id: ORDER,
  expires_at: new Date(NOW + secondsLeft * 1000).toISOString(), server_time: new Date(NOW).toISOString(),
  seconds_left: secondsLeft, vehicle_class: 'STANDARD', pickup: {lat: 50.4501, lon: 30.5234},
  pickup_label: 'Майдан Незалежності', dropoff_label: 'Залізничний вокзал', payment_method: 'CASH', price_kind: 'FIXED',
  price_minor: 15000, currency: 'UAH', expected_earnings_minor: 12750, comment: 'Біля метро', entrance: null,
  distance_m: 200});
const trip = (phase: string, version: number) => ({id: TRIP, order_id: ORDER, assignment_id: OFFER, phase, version,
  pickup: {lat: 50.4501, lon: 30.5234}, pickup_label: 'Майдан Незалежності', dropoff: {lat: 50.4405, lon: 30.489},
  dropoff_label: 'Залізничний вокзал', payment_method: 'CASH', price_minor: 15000, currency: 'UAH', needs_review: false,
  wallet_minor: 2000, discount_minor: 1000, contact_attempts: [], comment: null, entrance: null});
const assignment = {id: OFFER, order_id: ORDER, driver_id: session.subject.id, vehicle_id: VEHICLE, source: 'OFFER',
  state: 'COMMITTED', trip_id: TRIP, trip_phase: 'TO_PICKUP'};
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
const noTrip = {'GET /api/driver/v1/trips/current': [{status: 204}]};

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

const posts = (http: {calls: Call[]}, end: string) => http.calls.filter(c => c.method === 'POST' && c.path.endsWith(end));

const item = {order_id: ORDER, vehicle_class: 'STANDARD', pickup: {lat: 50.4501, lon: 30.5234},
  pickup_label: 'Майдан Незалежності', dropoff_label: 'Залізничний вокзал', payment_method: 'CASH', price_minor: 15000,
  currency: 'UAH', distance_m: 350};
const all = (...items: unknown[]) => ({status: 200, body: items});
const claim = 'POST /api/driver/v1/orders/' + ORDER + '/claim';

describe('A6: the plain success', () => {
  it('an order taken from the ALL tab becomes the trip to the pickup', async () => {
    const {http} = await mount({'GET /api/driver/v1/trips/current': [{status: 204}, {status: 200, body: trip('TO_PICKUP', 1)}],
      'GET /api/driver/v1/offers': [{status: 200, body: []}], 'GET /api/driver/v1/broadcast-orders': [all(item)],
      [claim]: [{status: 200, body: {...assignment, source: 'BROADCAST'}}]});
    expect(await screen.findByText('Майдан Незалежності → Залізничний вокзал')).toBeTruthy();
    expect(screen.getByText(/350 м до подачи/)).toBeTruthy();
    await fireEvent.press(screen.getByRole('button', {name: 'Взять'}));
    expect(await screen.findByRole('button', {name: 'Я на месте'})).toBeTruthy();
    expect((posts(http, '/claim')[0]!.body as {command_id: string}).command_id).toMatch(/^40000000-/);
  });
});

describe('A5: a double tap on "Взять"', () => {
  it('is one claim with one command id', async () => {
    const {http} = await mount({'GET /api/driver/v1/trips/current': [{status: 204}, {status: 200, body: trip('TO_PICKUP', 1)}],
      'GET /api/driver/v1/offers': [{status: 200, body: []}], 'GET /api/driver/v1/broadcast-orders': [all(item)],
      [claim]: [{status: 200, delayMs: 300, body: assignment}]});
    const take = await screen.findByRole('button', {name: 'Взять'});
    await fireEvent.press(take);
    await fireEvent.press(take);
    expect(await screen.findByRole('button', {name: 'Я на месте'})).toBeTruthy();
    expect(posts(http, '/claim')).toHaveLength(1);
  });
});

describe('A1–A4: a claim refused', () => {
  it('A1: someone else was faster: said so, and the order leaves the list', async () => {
    await mount({...noTrip, 'GET /api/driver/v1/offers': [{status: 200, body: []}],
      'GET /api/driver/v1/broadcast-orders': [all(item)], [claim]: [problem(409, 'ORDER_ALREADY_ASSIGNED')]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Взять'}));
    expect(await screen.findByText('Этот заказ уже взял другой водитель.')).toBeTruthy();
    expect(screen.queryByRole('button', {name: 'Взять'})).toBeNull();
  });

  it('A2: too far from the pickup: said so, and the list is read again', async () => {
    const {http} = await mount({...noTrip, 'GET /api/driver/v1/offers': [{status: 200, body: []}],
      'GET /api/driver/v1/broadcast-orders': [all(item), all()], [claim]: [problem(422, 'PICKUP_TOO_FAR')]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Взять'}));
    expect(await screen.findByText('Вы слишком далеко от точки подачи этого заказа.')).toBeTruthy();
    await waitFor(() => expect(http.calls.filter(c => c.path === '/api/driver/v1/broadcast-orders')).toHaveLength(2));
  });

  it('A3: the shift is held on another phone: said so', async () => {
    await mount({...noTrip, 'GET /api/driver/v1/offers': [{status: 200, body: []}],
      'GET /api/driver/v1/broadcast-orders': [all(item)], [claim]: [problem(409, 'STATE_CONFLICT')]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Взять'}));
    expect(await screen.findByText('Смена открыта на другом телефоне: заказы берутся только с него.')).toBeTruthy();
  });

  it.each([['the list', [problem(429, 'RATE_LIMITED')], []], ['a claim', [all(item)], [problem(429, 'RATE_LIMITED')]]])(
    'A4: 429 on %s is "too often"', async (_, list, answer) => {
      await mount({...noTrip, 'GET /api/driver/v1/offers': [{status: 200, body: []}],
        'GET /api/driver/v1/broadcast-orders': list as Answer[], [claim]: answer as Answer[]});
      if ((answer as Answer[]).length > 0) await fireEvent.press(await screen.findByRole('button', {name: 'Взять'}));
      expect(await screen.findByText('Слишком часто. Подождите немного.')).toBeTruthy();
    });
});

describe('A7: declining a personal offer', () => {
  it('sends the reject and shows the ALL tab, where the order may come back', async () => {
    const {http} = await mount({...noTrip, 'GET /api/driver/v1/offers': [{status: 200, body: [offer(15)]},
      {status: 200, body: []}], ['POST /api/driver/v1/offers/' + OFFER + '/reject']: [{status: 204}],
    'GET /api/driver/v1/broadcast-orders': [all(item)]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Отклонить'}));
    expect(await screen.findByRole('button', {name: 'Взять'})).toBeTruthy();
    expect(posts(http, '/reject')).toHaveLength(1);
    expect(screen.queryByRole('button', {name: 'Принять'})).toBeNull();
  });

  it('while a personal offer is open, the ALL tab is not read', async () => {
    const {http} = await mount({...noTrip, 'GET /api/driver/v1/offers': [{status: 200, body: [offer(15)]}],
      'GET /api/driver/v1/broadcast-orders': [all(item)]});
    expect(await screen.findByRole('button', {name: 'Принять'})).toBeTruthy();
    await new Promise(resolve => setTimeout(resolve, 100));
    expect(http.calls.some(c => c.path === '/api/driver/v1/broadcast-orders')).toBe(false);
  });
});
