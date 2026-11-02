import {fireEvent, render, screen} from '@testing-library/react-native';
import {createApiClient} from '@blizz/api-client';
import {DriverApp, type AppConfig} from '../src/App';

/** The order chat on the driver's trip card (#262): C1 and C7 of the issue. */
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

const posts = (http: {calls: Call[]}, end: string) => http.calls.filter(c => c.method === 'POST' && c.path.endsWith(end));

const MESSAGES = 'GET /api/driver/v1/trips/' + TRIP + '/messages';
const SEND = 'POST /api/driver/v1/trips/' + TRIP + '/messages';
const message = (sequence: number, role: string, body: string) => ({id: 'c0000000-0000-4000-8000-00000000000' + sequence,
  order_id: ORDER, sequence, sender_role: role, body, sent_at: '2026-11-02T10:0' + sequence + ':00Z'});

describe('C1 on the driver\'s side', () => {
  it('the rider\'s message is the passenger\'s, and the answer is sent from the trip', async () => {
    const {http} = await mount({'GET /api/driver/v1/trips/current': [{status: 200, body: trip('TO_PICKUP', 1)}],
      [MESSAGES]: [{status: 200, body: {messages: [message(1, 'RIDER', 'Я у входа в метро')]}}],
      [SEND]: [{status: 201, body: message(2, 'DRIVER', 'Буду через 3 минуты')}]});
    expect(await screen.findByText('Пассажир: Я у входа в метро')).toBeTruthy();
    await fireEvent.changeText(screen.getByLabelText('Сообщение'), 'Буду через 3 минуты');
    await fireEvent.press(screen.getByRole('button', {name: 'Отправить'}));
    expect(await screen.findByText('Вы: Буду через 3 минуты')).toBeTruthy();
    expect(posts(http, '/messages')).toHaveLength(1);
  });
});

describe('C7: taken off the order', () => {
  it('a 404 says the driver is no longer on this order', async () => {
    await mount({'GET /api/driver/v1/trips/current': [{status: 200, body: trip('TO_PICKUP', 1)}],
      [MESSAGES]: [{status: 200, body: {messages: []}}], [SEND]: [problem(404, 'NOT_FOUND')]});
    await fireEvent.changeText(await screen.findByLabelText('Сообщение'), 'Подъезжаю');
    await fireEvent.press(screen.getByRole('button', {name: 'Отправить'}));
    expect(await screen.findByText('Вы больше не на этом заказе.')).toBeTruthy();
    expect(screen.queryByLabelText('Сообщение')).toBeNull();
  });
});
