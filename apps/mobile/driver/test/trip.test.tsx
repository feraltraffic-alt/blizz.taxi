import {fireEvent, render, screen, waitFor} from '@testing-library/react-native';
import {createApiClient} from '@blizz/api-client';
import {DriverApp, type AppConfig} from '../src/App';

/** The driver's offers and trips (#249): E1–E7 of the issue. */
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
    driver_outcome: 'RETURN_TO_SEARCH', not_counted: false},
  {code: 'PASSENGER_ASKED', labels: {ru: 'Пассажир попросил', uk: 'Пасажир попросив', pl: 'Pasażer poprosił'},
    driver_outcome: 'CANCEL_ORDER', not_counted: true}]};

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

describe('E1: the countdown', () => {
  it('follows seconds_left from the server even when the device clock is ten minutes off, and ends the offer at 0',
    async () => {
      await mount({...noTrip, 'GET /api/driver/v1/offers': [{status: 200, body: [offer(2)]}, {status: 200, body: []}]},
        {clock: NOW + 10 * 60_000});
      expect(await screen.findByText('Майдан Незалежності → Залізничний вокзал')).toBeTruthy();
      expect(screen.getByText('Осталось 2 с')).toBeTruthy();
      expect(screen.getByText('Біля метро')).toBeTruthy();
      await waitFor(() => expect(screen.queryByRole('button', {name: 'Принять'})).toBeNull(), {timeout: 4_000});
      expect(screen.getByText('Ждём предложений…')).toBeTruthy();
    }, 10_000);
});

describe('E2: a late accept', () => {
  it.each(['OFFER_EXPIRED', 'OFFER_REVOKED'])('%s is said so and the offer leaves', async code => {
    const {http} = await mount({...noTrip, 'GET /api/driver/v1/offers': [{status: 200, body: [offer(15)]},
      {status: 200, body: []}], ['POST /api/driver/v1/offers/' + OFFER + '/accept']: [problem(409, code)]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Принять'}));
    expect(await screen.findByText('Это предложение уже недоступно.')).toBeTruthy();
    expect(screen.queryByRole('button', {name: 'Принять'})).toBeNull();
    expect(screen.queryByRole('button', {name: 'Я на месте'})).toBeNull();
    expect(posts(http, '/accept')).toHaveLength(1);
  });
});

describe('E3: a double tap', () => {
  it('on "Accept" is one accept with one command id, then the trip to the pickup', async () => {
    const {http} = await mount({'GET /api/driver/v1/trips/current': [{status: 204}, {status: 200, body: trip('TO_PICKUP', 1)}],
      'GET /api/driver/v1/offers': [{status: 200, body: [offer(15)]}],
      ['POST /api/driver/v1/offers/' + OFFER + '/accept']: [{status: 200, delayMs: 300, body: assignment}]});
    const accept = await screen.findByRole('button', {name: 'Принять'});
    await fireEvent.press(accept);
    await fireEvent.press(accept);
    expect(await screen.findByRole('button', {name: 'Я на месте'})).toBeTruthy();
    const accepts = posts(http, '/accept');
    expect(accepts).toHaveLength(1);
    expect((accepts[0]!.body as {command_id: string}).command_id).toMatch(/^40000000-/);
  });

  it('on "Arrived" is one arrival with the trip version', async () => {
    const {http} = await mount({'GET /api/driver/v1/trips/current': [{status: 200, body: trip('TO_PICKUP', 4)}],
      ['POST /api/driver/v1/trips/' + TRIP + '/arrive']: [{status: 200, delayMs: 300, body: trip('WAITING', 5)}]});
    const arrived = await screen.findByRole('button', {name: 'Я на месте'});
    await fireEvent.press(arrived);
    await fireEvent.press(arrived);
    expect(await screen.findByRole('button', {name: 'Начать поездку'})).toBeTruthy();
    const arrivals = posts(http, '/arrive');
    expect(arrivals).toHaveLength(1);
    expect((arrivals[0]!.body as {expected_version: number}).expected_version).toBe(4);
  });
});

describe('E4: restarting', () => {
  it('a trip waiting for the passenger is shown from the server with its buttons', async () => {
    const {http} = await mount({'GET /api/driver/v1/trips/current': [{status: 200, body: trip('WAITING', 7)}],
      'GET /api/driver/v1/offers': [{status: 200, body: [offer(15)]}]});
    expect(await screen.findByText('Ждёте пассажира')).toBeTruthy();
    expect(screen.getByRole('button', {name: 'Начать поездку'})).toBeTruthy();
    expect(screen.getByRole('button', {name: 'Пассажир не вышел'})).toBeTruthy();
    expect(screen.queryByRole('button', {name: 'Принять'})).toBeNull();
    expect(http.calls.some(c => c.path === '/api/driver/v1/offers')).toBe(false);
  });

  it('a cancel before the start sends the reason and the version, and returns to the offers', async () => {
    const {http} = await mount({'GET /api/driver/v1/trips/current': [{status: 200, body: trip('WAITING', 7)},
      {status: 204}], 'GET /api/driver/v1/offers': [{status: 200, body: []}],
    ['POST /api/driver/v1/trips/' + TRIP + '/cancel']: [{status: 200, body: trip('ABORTED', 8)}]});
    await fireEvent.press(await screen.findByRole('button', {name: '○ Сломалась машина'}));
    // ADR 0018 B3: the driver sees which reasons do not count toward a pause.
    expect(screen.getByRole('button', {name: '○ Пассажир попросил (не считается отказом)'})).toBeTruthy();
    await fireEvent.press(screen.getByRole('button', {name: 'Отменить поездку'}));
    expect(await screen.findByText('Ждём предложений…')).toBeTruthy();
    const body = posts(http, '/cancel')[0]!.body as {reason_code: string; expected_version: number};
    expect(body).toMatchObject({reason_code: 'CAR_BROKE', expected_version: 7});
  });
});

describe('E5: an arrival far from the pickup', () => {
  it.each(['PICKUP_TOO_FAR', 'LOCATION_NOT_FRESH'])('%s is said so and can be confirmed with a reason',
    async code => {
      const {http} = await mount({'GET /api/driver/v1/trips/current': [{status: 200, body: trip('TO_PICKUP', 4)}],
        ['POST /api/driver/v1/trips/' + TRIP + '/arrive']: [problem(422, code), {status: 200, body: trip('WAITING', 5)}]});
      await fireEvent.press(await screen.findByRole('button', {name: 'Я на месте'}));
      expect(await screen.findByText(code === 'PICKUP_TOO_FAR' ? 'Сервер видит вас далеко от точки подачи.'
        : 'Сервер не знает, где вы сейчас.')).toBeTruthy();
      expect(screen.getByRole('button', {name: 'Подтвердить прибытие'})).toBeDisabled();
      await fireEvent.changeText(screen.getByLabelText('Почему вы на месте'), 'Пассажир у другого входа');
      await fireEvent.press(screen.getByRole('button', {name: 'Подтвердить прибытие'}));
      expect(await screen.findByRole('button', {name: 'Начать поездку'})).toBeTruthy();
      const arrivals = posts(http, '/arrive');
      expect(arrivals).toHaveLength(2);
      expect(arrivals[0]!.body).not.toHaveProperty('exception_reason');
      expect(arrivals[1]!.body).toMatchObject({expected_version: 4, exception_reason: 'Пассажир у другого входа'});
    });
});

describe('E6: the trip moved on', () => {
  it('a 409 reloads the trip, says so, and an ended trip returns to the offers', async () => {
    const {http} = await mount({'GET /api/driver/v1/trips/current': [{status: 200, body: trip('WAITING', 5)},
      {status: 204}], 'GET /api/driver/v1/offers': [{status: 200, body: []}],
    ['POST /api/driver/v1/trips/' + TRIP + '/start']: [problem(409, 'STATE_CONFLICT')]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Начать поездку'}));
    expect(await screen.findByText('Поездка изменилась: её отменили или она уже в другом состоянии.')).toBeTruthy();
    expect(await screen.findByText('Ждём предложений…')).toBeTruthy();
    expect(http.calls.filter(c => c.path === '/api/driver/v1/trips/current')).toHaveLength(2);
  });
});

describe('E7: completing a cash trip', () => {
  it('shows the amount to collect and posts nothing until the cash is confirmed', async () => {
    const {http} = await mount({'GET /api/driver/v1/trips/current': [{status: 200, body: trip('IN_PROGRESS', 9)},
      {status: 204}], 'GET /api/driver/v1/offers': [{status: 200, body: []}],
    ['POST /api/driver/v1/trips/' + TRIP + '/complete']: [{status: 200, body: trip('COMPLETED', 10)}]});
    expect(await screen.findByText('Получить наличными: 120.00 UAH')).toBeTruthy();
    await fireEvent.press(screen.getByRole('button', {name: 'Завершить поездку'}));
    expect(posts(http, '/complete')).toHaveLength(0);
    await fireEvent.press(await screen.findByRole('button', {name: 'Наличные получены: 120.00 UAH'}));
    expect(await screen.findByText('Ждём предложений…')).toBeTruthy();
    const body = posts(http, '/complete')[0]!.body as {cash_received: boolean; expected_version: number;
      reported_at: string};
    expect(body).toMatchObject({cash_received: true, expected_version: 9, reported_at: new Date(NOW).toISOString()});
  });
});
