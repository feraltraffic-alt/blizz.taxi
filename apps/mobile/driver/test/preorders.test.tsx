import {fireEvent, render, screen, waitFor} from '@testing-library/react-native';
import {createApiClient} from '@blizz/api-client';
import {DriverApp, type AppConfig} from '../src/App';

/** The driver's pre-orders by reservation (#324): P1–P7 of the issue. */
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
const TRIP = '80000000-0000-4000-8000-000000000003';
const admitted = {id: session.subject.id, account_state: 'ACTIVE', review_status: 'APPROVED', admission_city_ids: [KYIV],
  has_payment_terminal: false, version: 3, vehicles: [{id: VEHICLE, state: 'APPROVED'}], documents: []};
const online = {driver_id: session.subject.id, session_id: SESSION, session_version: 1, session_state: 'OPEN',
  connection: 'CONNECTED', geolocation: 'FRESH', occupancy: 'FREE', account_state: 'ACTIVE', review_status: 'APPROVED',
  eligible: true, ineligible_reasons: []};
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
  const http = server({...base, ...noTrip, 'GET /api/driver/v1/offers': [{status: 200, body: []}], ...script});
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: {read: () => null, write: () => {}},
    fetch: http.fetch, correlationId: () => cid, initialSession: session as never});
  const config: AppConfig = {service: 'default', deviceRef: 'test-driver', now: () => options.clock ?? NOW,
    heartbeatMs: 60_000, pollMs: 60_000, locate: async () => ({lat: 50.4501, lon: 30.5234, accuracy_m: 8}),
    newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')};
  await render(<DriverApp client={client} config={config} />);
  return {http};
}

const PRE = '90000000-0000-4000-8000-000000000001';
const RES = '91000000-0000-4000-8000-000000000001';
const preorder = {order_id: PRE, short_number: 2001, pickup_at: '2026-11-02T18:00:00Z', vehicle_class: 'STANDARD',
  pickup: {lat: 50.45, lon: 30.52}, pickup_label: 'Оболонь', dropoff_label: 'Аэропорт Борисполь', price_minor: 60000,
  currency: 'UAH', payment_method: 'CASH'};
const reservation = (state = 'RESERVED') => ({id: RES, state, order: preorder, reserved_at: '2026-11-02T10:00:00Z',
  confirm_from: '2026-11-02T17:00:00Z', confirm_until: '2026-11-02T17:50:00Z', drop_until: '2026-11-02T16:00:00Z'});
const hm = (iso: string) => {
  const d = new Date(iso);
  return String(d.getHours()).padStart(2, '0') + ':' + String(d.getMinutes()).padStart(2, '0');
};
const dm = (iso: string) => {
  const d = new Date(iso);
  return String(d.getDate()).padStart(2, '0') + '.' + String(d.getMonth() + 1).padStart(2, '0') + ' ' + hm(iso);
};
const LIST = 'GET /api/driver/v1/preorders';
const MINE = 'GET /api/driver/v1/preorders/reservations';
const posts = (http: {calls: Call[]}) => http.calls.filter(c => c.method === 'POST');

async function open(script: Record<string, Answer[]>) {
  const result = await mount({[LIST]: [{status: 200, body: {preorders: [preorder]}}],
    [MINE]: [{status: 200, body: {reservations: []}}], ...script});
  await fireEvent.press(await screen.findByRole('button', {name: 'Предзаказы'}));
  return result;
}

describe('P1: available pre-orders', () => {
  it('are listed and one is reserved with a command id', async () => {
    const {http} = await open({['POST /api/driver/v1/preorders/' + PRE + '/reserve']: [{status: 200,
      body: reservation()}], [MINE]: [{status: 200, body: {reservations: []}},
      {status: 200, body: {reservations: [reservation()]}}],
    [LIST]: [{status: 200, body: {preorders: [preorder]}}, {status: 200, body: {preorders: []}}]});
    expect(await screen.findByText(dm(preorder.pickup_at) + ' · Оболонь → Аэропорт Борисполь · 600.00 UAH · наличные'))
      .toBeTruthy();
    await fireEvent.press(screen.getByRole('button', {name: 'Взять'}));
    expect(await screen.findByText('«В путь» с ' + hm('2026-11-02T17:00:00Z') + ' до ' + hm('2026-11-02T17:50:00Z')))
      .toBeTruthy();
    expect(posts(http)).toEqual([{method: 'POST', path: '/api/driver/v1/preorders/' + PRE + '/reserve',
      body: {command_id: expect.any(String)}}]);
  });
});

describe('P2: a refused reservation', () => {
  it.each([
    ['ORDER_ALREADY_ASSIGNED', 'Этот предзаказ уже взял другой водитель.'],
    ['STATE_CONFLICT', 'Нельзя взять: не больше трёх предзаказов, или их сейчас выдают иначе.']
  ])('%s is told', async (code, text) => {
    const {http} = await open({['POST /api/driver/v1/preorders/' + PRE + '/reserve']: [problem(409, code)]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Взять'}));
    expect(await screen.findByText(text)).toBeTruthy();
    await waitFor(() => expect(http.calls.filter(c => c.method === 'GET' && c.path === '/api/driver/v1/preorders'))
      .toHaveLength(2));
  });
});

describe('P3: my reservations', () => {
  it('show the pickup, the window for "on my way" and the last moment to give it back', async () => {
    await open({[MINE]: [{status: 200, body: {reservations: [reservation()]}}]});
    expect(await screen.findByText(dm(preorder.pickup_at) + ' · Оболонь → Аэропорт Борисполь')).toBeTruthy();
    expect(screen.getByText('«В путь» с ' + hm('2026-11-02T17:00:00Z') + ' до ' + hm('2026-11-02T17:50:00Z')))
      .toBeTruthy();
    expect(screen.getByText('Отказаться можно до ' + hm('2026-11-02T16:00:00Z'))).toBeTruthy();
  });
});

describe('P4: on my way', () => {
  // A failing test must not leave the pinned clock to the next one.
  afterEach(() => jest.restoreAllMocks());

  it('is offered by the server\'s window, not the phone\'s clock, and returns to work', async () => {
    // The phone says 10:00, long before confirm_from; the server is the judge and accepts. Both the app's clock and
    // the device's own (Date.now) say so.
    jest.spyOn(Date, 'now').mockReturnValue(NOW);
    const {http} = await open({[MINE]: [{status: 200, body: {reservations: [reservation()]}}],
      ['POST /api/driver/v1/preorders/reservations/' + RES + '/confirm']: [{status: 200, body: {id: 'a1',
        order_id: PRE, driver_id: session.subject.id, vehicle_id: VEHICLE, source: 'RESERVATION', state: 'COMMITTED',
        trip_id: TRIP, trip_phase: 'TO_PICKUP'}}]});
    await fireEvent.press(await screen.findByRole('button', {name: 'В путь'}));
    expect(await screen.findByText('Вы на линии')).toBeTruthy();
    expect(posts(http)).toEqual([{method: 'POST', path: '/api/driver/v1/preorders/reservations/' + RES + '/confirm',
      body: {command_id: expect.any(String)}}]);
  });

  it('a 409 tells the window', async () => {
    await open({[MINE]: [{status: 200, body: {reservations: [reservation()]}}],
      ['POST /api/driver/v1/preorders/reservations/' + RES + '/confirm']: [problem(409, 'STATE_CONFLICT')]});
    await fireEvent.press(await screen.findByRole('button', {name: 'В путь'}));
    expect(await screen.findByText('Сейчас нельзя: «В путь» доступно с ' + hm('2026-11-02T17:00:00Z') + ' до '
      + hm('2026-11-02T17:50:00Z') + '.')).toBeTruthy();
  });
});

describe('P5: giving it back', () => {
  it('needs a reason and sends it', async () => {
    const {http} = await open({[MINE]: [{status: 200, body: {reservations: [reservation()]}},
      {status: 200, body: {reservations: []}}],
    ['POST /api/driver/v1/preorders/reservations/' + RES + '/drop']: [{status: 200, body: reservation('DROPPED')}]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Отказаться'}));
    expect(await screen.findByText('Выберите причину отказа.')).toBeTruthy();
    expect(posts(http)).toEqual([]);
    await fireEvent.press(screen.getByRole('button', {name: 'Сломалась машина'}));
    await fireEvent.press(screen.getByRole('button', {name: 'Отказаться'}));
    await waitFor(() => expect(posts(http)).toHaveLength(1));
    expect(posts(http)[0]).toEqual({method: 'POST', path: '/api/driver/v1/preorders/reservations/' + RES + '/drop',
      body: {command_id: expect.any(String), reason_code: 'CAR_BROKE'}});
  });

  it('a 409 sends the driver to the dispatcher', async () => {
    await open({[MINE]: [{status: 200, body: {reservations: [reservation()]}}],
      ['POST /api/driver/v1/preorders/reservations/' + RES + '/drop']: [problem(409, 'STATE_CONFLICT')]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Сломалась машина'}));
    await fireEvent.press(screen.getByRole('button', {name: 'Отказаться'}));
    expect(await screen.findByText('Отказаться уже нельзя, свяжитесь с диспетчером.')).toBeTruthy();
  });
});

describe('P6: offline', () => {
  it('has no pre-orders button', async () => {
    const http = server({...base, 'GET /api/driver/v1/work-sessions/current': [{status: 200, body: {...online,
      session_state: 'CLOSED', session_id: null}}]});
    const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: {read: () => null,
      write: () => {}}, fetch: http.fetch, correlationId: () => cid, initialSession: session as never});
    await render(<DriverApp client={client} config={{service: 'default', deviceRef: 'test-driver', now: () => NOW,
      heartbeatMs: 60_000, pollMs: 60_000, locate: async () => ({lat: 50.45, lon: 30.52})}} />);
    expect(await screen.findByText('Вы не на линии')).toBeTruthy();
    expect(screen.queryByRole('button', {name: 'Предзаказы'})).toBeNull();
  });
});

describe('P7: one at a time', () => {
  it('a double press reserves once', async () => {
    const {http} = await open({['POST /api/driver/v1/preorders/' + PRE + '/reserve']: [{status: 200, delayMs: 200,
      body: reservation()}]});
    const take = await screen.findByRole('button', {name: 'Взять'});
    await fireEvent.press(take);
    await fireEvent.press(take);
    await waitFor(() => expect(posts(http)).toHaveLength(1));
    await new Promise(resolve => setTimeout(resolve, 300));
    expect(posts(http)).toHaveLength(1);
  });
});
