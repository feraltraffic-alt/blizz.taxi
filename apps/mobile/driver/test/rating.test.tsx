import {fireEvent, render, screen, waitFor} from '@testing-library/react-native';
import {createApiClient} from '@blizz/api-client';
import {DriverApp, type AppConfig} from '../src/App';

/** The driver rates the rider after a completed trip (#460): R1–R4 of the issue. */
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

const card = (phase: string, version: number) => ({...trip(phase, version), payment_method: 'CARD'});
const RATE = '/api/driver/v1/orders/' + ORDER + '/rating';
const done = (over: Record<string, Answer[]> = {}) => ({'GET /api/driver/v1/trips/current': [{status: 200,
  body: card('IN_PROGRESS', 9)}, {status: 204}], 'GET /api/driver/v1/offers': [{status: 200, body: []}],
['POST /api/driver/v1/trips/' + TRIP + '/complete']: [{status: 200, body: card('COMPLETED', 10)}],
[`POST ${RATE}`]: [{status: 201, body: {order_id: ORDER, score: 4, created_at: '2026-11-02T10:00:00Z'}}], ...over});
const rated = (http: {calls: Call[]}) => http.calls.filter(c => c.method === 'POST' && c.path === RATE);

async function finish() {
  await fireEvent.press(await screen.findByRole('button', {name: 'Завершить поездку'}));
  expect(await screen.findByText('Оцените пассажира')).toBeTruthy();
}

describe('R1: offered after a completed trip', () => {
  it('five scores, a staff-only comment, send and skip; the offers are there too', async () => {
    await mount(done());
    await finish();
    for (const n of ['1', '2', '3', '4', '5']) expect(screen.getByRole('button', {name: 'Оценка ' + n})).toBeTruthy();
    expect(screen.getByLabelText('Комментарий для службы (пассажир его не увидит)')).toBeTruthy();
    expect(screen.getByRole('button', {name: 'Отправить оценку'})).toBeTruthy();
    expect(screen.getByRole('button', {name: 'Пропустить'})).toBeTruthy();
    expect(screen.getByText('Ждём предложений…')).toBeTruthy();
  });

  it('not after an aborted trip', async () => {
    await mount({'GET /api/driver/v1/trips/current': [{status: 200, body: card('IN_PROGRESS', 9)},
      {status: 200, body: card('ABORTED', 10)}, {status: 204}], 'GET /api/driver/v1/offers': [{status: 200, body: []}],
    ['POST /api/driver/v1/trips/' + TRIP + '/complete']: [problem(409, 'STATE_CONFLICT')]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Завершить поездку'}));
    expect(await screen.findByText('Ждём предложений…')).toBeTruthy();
    expect(screen.queryByText('Оцените пассажира')).toBeNull();
  });
});

describe('R2: send', () => {
  it('comment only when typed: the score alone', async () => {
    const {http} = await mount(done());
    await finish();
    await fireEvent.press(screen.getByRole('button', {name: 'Оценка 4'}));
    await fireEvent.press(screen.getByRole('button', {name: 'Отправить оценку'}));
    expect(await screen.findByText('Спасибо за оценку')).toBeTruthy();
    expect(rated(http).map(c => c.body)).toEqual([{command_id: expect.any(String), score: 4}]);
  });

  it('a typed comment is sent trimmed', async () => {
    const {http} = await mount(done());
    await finish();
    await fireEvent.press(screen.getByRole('button', {name: 'Оценка 2'}));
    await fireEvent.changeText(screen.getByLabelText('Комментарий для службы (пассажир его не увидит)'),
      '  Курил в салоне  ');
    await fireEvent.press(screen.getByRole('button', {name: 'Отправить оценку'}));
    await screen.findByText('Спасибо за оценку');
    expect(rated(http).map(c => c.body)).toEqual([{command_id: expect.any(String), score: 2,
      comment: 'Курил в салоне'}]);
  });

  it('a double tap with a slow answer sends one', async () => {
    const {http} = await mount(done({[`POST ${RATE}`]: [{status: 201, delayMs: 300, body: {order_id: ORDER, score: 5,
      created_at: '2026-11-02T10:00:00Z'}}]}));
    await finish();
    await fireEvent.press(screen.getByRole('button', {name: 'Оценка 5'}));
    const send = screen.getByRole('button', {name: 'Отправить оценку'});
    await fireEvent.press(send);
    await fireEvent.press(send);
    expect(await screen.findByText('Спасибо за оценку')).toBeTruthy();
    expect(rated(http)).toHaveLength(1);
  });
});

describe('R3: refused', () => {
  it.each([['no score', null, ''], ['a comment over 500', '3', 'x'.repeat(501)]])('%s sends nothing',
    async (_name, score, comment) => {
      const {http} = await mount(done());
      await finish();
      if (score) await fireEvent.press(screen.getByRole('button', {name: 'Оценка ' + score}));
      if (comment) await fireEvent.changeText(screen.getByLabelText('Комментарий для службы (пассажир его не увидит)'),
        comment);
      await fireEvent.press(screen.getByRole('button', {name: 'Отправить оценку'}));
      expect(await screen.findByText('Выберите оценку; комментарий — до 500 знаков.')).toBeTruthy();
      expect(rated(http)).toHaveLength(0);
    });

  it('a 409 says the time has passed, and the card can be closed', async () => {
    await mount(done({[`POST ${RATE}`]: [problem(409, 'STATE_CONFLICT')]}));
    await finish();
    await fireEvent.press(screen.getByRole('button', {name: 'Оценка 3'}));
    await fireEvent.press(screen.getByRole('button', {name: 'Отправить оценку'}));
    expect(await screen.findByText('Время для оценки прошло.')).toBeTruthy();
    await fireEvent.press(screen.getByRole('button', {name: 'Пропустить'}));
    await waitFor(() => expect(screen.queryByText('Оцените пассажира')).toBeNull());
  });
});

describe('R4: skip', () => {
  it('closes the card without a request', async () => {
    const {http} = await mount(done());
    await finish();
    await fireEvent.press(screen.getByRole('button', {name: 'Пропустить'}));
    await waitFor(() => expect(screen.queryByText('Оцените пассажира')).toBeNull());
    expect(rated(http)).toHaveLength(0);
  });
});
