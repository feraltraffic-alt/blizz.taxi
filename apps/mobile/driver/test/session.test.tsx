import {fireEvent, render, screen, waitFor} from '@testing-library/react-native';
import {createApiClient, type RefreshTokenStore} from '@blizz/api-client';
import {DriverApp, type AppConfig} from '../src/App';

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
const admitted = {id: session.subject.id, account_state: 'ACTIVE', review_status: 'APPROVED', admission_city_ids: [KYIV],
  has_payment_terminal: false, version: 3, vehicles: [{id: VEHICLE, state: 'APPROVED'}], documents: []};
const offline = {driver_id: session.subject.id, session_id: null, session_version: 0, session_state: 'CLOSED',
  connection: 'DISCONNECTED', geolocation: 'UNAVAILABLE', occupancy: 'FREE', account_state: 'ACTIVE',
  review_status: 'APPROVED', eligible: false, ineligible_reasons: []};
const online = {...offline, session_id: SESSION, session_version: 1, session_state: 'OPEN', connection: 'CONNECTED'};

type Call = {method: string; path: string; body?: unknown};
type Answer = {status: number; body?: unknown; headers?: Record<string, string>; delayMs?: number} | 'network';

function server(script: Record<string, Answer[]>) {
  const calls: Call[] = [];
  const fetch = jest.fn(async (url: string, init: RequestInit) => {
    const path = new URL(url).pathname;
    const method = String(init.method);
    calls.push({method, path, body: init.body ? JSON.parse(String(init.body)) : undefined});
    const answers = script[method + ' ' + path] ?? [{status: 404, body: {code: 'NOT_FOUND', correlation_id: cid}}];
    const answer = answers.length > 1 ? answers.shift()! : answers[0]!;
    if (answer === 'network') throw new TypeError('Network request failed');
    if (answer.delayMs) await new Promise(resolve => setTimeout(resolve, answer.delayMs));
    return new Response(answer.body === undefined ? null : JSON.stringify(answer.body), {
      status: answer.status, headers: {'Content-Type': 'application/json', ...(answer.headers ?? {})}
    });
  });
  return {fetch: fetch as unknown as typeof globalThis.fetch, calls};
}

function memory(initial: string | null = null): RefreshTokenStore {
  let value = initial;
  return {read: () => value, write: next => {value = next;}};
}

const problem = (status: number, code: string) => ({status, body: {type: 'about:blank', title: code, status, code,
  correlation_id: cid, retryable: false}});
const noLegal = {'GET /api/driver/v1/legal': [{status: 200, body: {documents: []}}]};

async function mount(script: Record<string, Answer[]>, options: {signedIn?: boolean; tokens?: RefreshTokenStore;
  heartbeatMs?: number} = {}) {
  const http = server(script);
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: options.tokens ?? memory(),
    fetch: http.fetch, correlationId: () => cid,
    initialSession: options.signedIn === false ? undefined : session as never});
  const config: AppConfig = {service: 'default', deviceRef: 'test-driver', now: () => NOW,
    heartbeatMs: options.heartbeatMs ?? 60_000, locate: async () => ({lat: 50.4501, lon: 30.5234, accuracy_m: 8}),
    newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')};
  await render(<DriverApp client={client} config={config} />);
  return {http};
}

/** Pausing, resuming and taking the work session over from another device (#454): W1–W5 of the issue. */
const S = '/api/driver/v1/work-sessions/' + SESSION;
const base = {...noLegal, 'GET /api/driver/v1/profile': [{status: 200, body: admitted}]};
const accepting = {...online, intent: 'ACCEPTING', session_version: 4};
const paused = {...accepting, intent: 'NOT_ACCEPTING', session_version: 5};
const afterTrip = {...accepting, intent: 'PAUSE_AFTER_CURRENT', occupancy: 'ON_TRIP', session_version: 5};
const sent = (http: {calls: Call[]}, path: string) => http.calls.filter(c => c.method === 'POST' && c.path === path);

describe('W1: pause', () => {
  it('sends the version of the session, and a free driver is paused', async () => {
    const {http} = await mount({...base, 'GET /api/driver/v1/work-sessions/current': [{status: 200, body: accepting}],
      [`POST ${S}/pause`]: [{status: 200, body: paused}]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Пауза'}));
    expect(await screen.findByText('На паузе: новые заказы не приходят')).toBeTruthy();
    expect(sent(http, S + '/pause').map(c => c.body)).toEqual([{command_id: expect.any(String), expected_version: 4}]);
    expect(screen.queryByRole('button', {name: 'Пауза'})).toBeNull();
  });

  it('on a trip the pause comes after it', async () => {
    await mount({...base, 'GET /api/driver/v1/work-sessions/current': [{status: 200, body: {...accepting,
      occupancy: 'ON_TRIP'}}], [`POST ${S}/pause`]: [{status: 200, body: afterTrip}]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Пауза'}));
    expect(await screen.findByText('Пауза после текущей поездки')).toBeTruthy();
  });
});

describe('W2: resume', () => {
  it.each([['paused', paused], ['pausing after the trip', afterTrip]])('%s: sends the version and accepts again',
    async (_name, state) => {
      const {http} = await mount({...base, 'GET /api/driver/v1/work-sessions/current': [{status: 200, body: state}],
        [`POST ${S}/resume`]: [{status: 200, body: {...accepting, session_version: 6}}]});
      await fireEvent.press(await screen.findByRole('button', {name: 'Снова принимать заказы'}));
      expect(await screen.findByRole('button', {name: 'Пауза'})).toBeTruthy();
      expect(sent(http, S + '/resume').map(c => c.body)).toEqual([{command_id: expect.any(String),
        expected_version: 5}]);
    });

  it('DRIVER_NOT_ELIGIBLE says so and reads the state again', async () => {
    const {http} = await mount({...base, 'GET /api/driver/v1/work-sessions/current': [{status: 200, body: paused}],
      [`POST ${S}/resume`]: [problem(409, 'DRIVER_NOT_ELIGIBLE')]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Снова принимать заказы'}));
    expect(await screen.findByText('Сейчас нельзя принимать заказы: проверьте допуск и автомобиль.')).toBeTruthy();
    await waitFor(() => expect(http.calls.filter(c => c.path === '/api/driver/v1/work-sessions/current'))
      .toHaveLength(2));
  });
});

describe('W3: a stale version', () => {
  it('a 409 on pause reads the state again, and the next pause sends the new version', async () => {
    const {http} = await mount({...base, 'GET /api/driver/v1/work-sessions/current': [{status: 200, body: accepting},
      {status: 200, body: {...accepting, session_version: 9}}],
    [`POST ${S}/pause`]: [problem(409, 'VERSION_CONFLICT'), {status: 200, body: paused}]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Пауза'}));
    await waitFor(() => expect(http.calls.filter(c => c.path === '/api/driver/v1/work-sessions/current'))
      .toHaveLength(2));
    await fireEvent.press(await screen.findByRole('button', {name: 'Пауза'}));
    await waitFor(() => expect(sent(http, S + '/pause')).toHaveLength(2));
    expect(sent(http, S + '/pause').map(c => (c.body as {expected_version: number}).expected_version))
      .toEqual([4, 9]);
  });
});

describe('W4: another device', () => {
  it('a heartbeat refused as STATE_CONFLICT stops the heartbeats and offers to continue here', async () => {
    const {http} = await mount({...base, 'GET /api/driver/v1/work-sessions/current': [{status: 200, body: accepting}],
      [`POST ${S}/heartbeat`]: [problem(409, 'STATE_CONFLICT')]}, {heartbeatMs: 30});
    expect(await screen.findByText('Смена открыта на другом устройстве.')).toBeTruthy();
    const beats = sent(http, S + '/heartbeat').length;
    await new Promise(resolve => setTimeout(resolve, 200));
    expect(sent(http, S + '/heartbeat').length).toBe(beats);
    expect(screen.getByRole('button', {name: 'Продолжить на этом устройстве'})).toBeTruthy();
    expect(screen.queryByRole('button', {name: 'Пауза'})).toBeNull();
  });

  it('going online refused as STATE_CONFLICT with the session open elsewhere offers to continue here', async () => {
    await mount({...base, 'GET /api/driver/v1/work-sessions/current': [{status: 200, body: offline},
      {status: 200, body: accepting}], 'POST /api/driver/v1/work-sessions': [problem(409, 'STATE_CONFLICT')]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Выйти на линию'}));
    expect(await screen.findByRole('button', {name: 'Продолжить на этом устройстве'})).toBeTruthy();
    expect(screen.getByText('Смена открыта на другом устройстве.')).toBeTruthy();
  });

  it('continuing here sends the handover with the version, and the heartbeats start again', async () => {
    const {http} = await mount({...base, 'GET /api/driver/v1/work-sessions/current': [{status: 200, body: accepting}],
      [`POST ${S}/heartbeat`]: [problem(409, 'STATE_CONFLICT'), {status: 200, body: {...accepting,
        session_version: 5}}],
      [`POST ${S}/handover`]: [{status: 200, body: {...accepting, session_version: 5}}]}, {heartbeatMs: 30});
    await fireEvent.press(await screen.findByRole('button', {name: 'Продолжить на этом устройстве'}));
    await waitFor(() => expect(sent(http, S + '/handover')).toHaveLength(1));
    expect(sent(http, S + '/handover')[0]!.body).toEqual({command_id: expect.any(String), expected_version: 4});
    await waitFor(() => expect(screen.queryByText('Смена открыта на другом устройстве.')).toBeNull());
    const beats = sent(http, S + '/heartbeat').length;
    await waitFor(() => expect(sent(http, S + '/heartbeat').length).toBeGreaterThan(beats));
    expect(screen.getByRole('button', {name: 'Пауза'})).toBeTruthy();
  });
});

describe('W5: only on the line', () => {
  it('off the line: no pause, resume or handover', async () => {
    await mount({...base, 'GET /api/driver/v1/work-sessions/current': [{status: 200, body: offline}]});
    expect(await screen.findByText('Вы не на линии')).toBeTruthy();
    for (const name of ['Пауза', 'Снова принимать заказы', 'Продолжить на этом устройстве']) {
      expect(screen.queryByRole('button', {name})).toBeNull();
    }
  });
});
