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
  heartbeatMs?: number; trackLimit?: number} = {}) {
  const http = server(script);
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: options.tokens ?? memory(),
    fetch: http.fetch, correlationId: () => cid,
    initialSession: options.signedIn === false ? undefined : session as never});
  const config: AppConfig = {service: 'default', deviceRef: 'test-driver', now: () => NOW,
    heartbeatMs: options.heartbeatMs ?? 60_000, trackLimit: options.trackLimit, locate: async () => ({lat: 50.4501, lon: 30.5234, accuracy_m: 8}),
    newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')};
  await render(<DriverApp client={client} config={config} />);
  return {http};
}

/** Buffering the GPS points of failed heartbeats and uploading them as location batches (#456): B1–B5. */
const S = '/api/driver/v1/work-sessions/' + SESSION;
const BATCH = '/api/driver/v1/location-batches';
const base = {...noLegal, 'GET /api/driver/v1/profile': [{status: 200, body: admitted}],
  'GET /api/driver/v1/work-sessions/current': [{status: 200, body: online}]};
const ok = {status: 200, body: online};
const counts = {status: 200, body: {accepted: 3, duplicates: 0, flagged: 0}};
type Point = {sequence: number; lat: number; lon: number; accuracy_m: number; recorded_at: string};
type Batch = {command_id: string; points: Point[]};
const beats = (http: {calls: Call[]}) => http.calls.filter(c => c.path === S + '/heartbeat');
const batches = (http: {calls: Call[]}) => http.calls.filter(c => c.path === BATCH).map(c => c.body as Batch);
const located = (http: {calls: Call[]}, n: number) => (beats(http)[n]!.body as {location: Point}).location;

describe('B1 and B2: buffering and upload', () => {
  it('the points of beats lost to the network are sent in order after the next good beat', async () => {
    const {http} = await mount({...base, [`POST ${S}/heartbeat`]: ['network', 'network', 'network', ok],
      [`POST ${BATCH}`]: [counts]}, {heartbeatMs: 30});
    await waitFor(() => expect(batches(http)).toHaveLength(1));
    const sent = batches(http)[0]!;
    expect(sent).toEqual({command_id: expect.any(String), points: [located(http, 0), located(http, 1),
      located(http, 2)]});
    expect(sent.points.map(p => p.sequence)).toEqual([...sent.points.map(p => p.sequence)].sort((a, b) => a - b));
    await new Promise(resolve => setTimeout(resolve, 150));
    expect(batches(http)).toHaveLength(1);
  });

  it('250 points go as 100, 100 and 50, oldest first, each with its own command_id', async () => {
    const lost = Array.from({length: 250}, () => 'network' as const);
    const {http} = await mount({...base, [`POST ${S}/heartbeat`]: [...lost, ok], [`POST ${BATCH}`]: [counts]},
      {heartbeatMs: 1});
    await waitFor(() => expect(batches(http)).toHaveLength(3), {timeout: 8000});
    expect(batches(http).map(b => b.points.length)).toEqual([100, 100, 50]);
    expect(new Set(batches(http).map(b => b.command_id)).size).toBe(3);
    const sequences = batches(http).flatMap(b => b.points.map(p => p.sequence));
    expect(sequences).toEqual([...sequences].sort((a, b) => a - b));
  }, 15000);

  it('removed only after its 200: a batch that failed is in the next upload', async () => {
    const {http} = await mount({...base, [`POST ${S}/heartbeat`]: ['network', ok, ok, ok],
      [`POST ${BATCH}`]: ['network', counts]}, {heartbeatMs: 30});
    await waitFor(() => expect(batches(http)).toHaveLength(2));
    expect(batches(http)[1]!.points).toEqual(batches(http)[0]!.points);
  });
});

describe('B3: a failed upload', () => {
  it('a network failure sends the same command_id and points again', async () => {
    const {http} = await mount({...base, [`POST ${S}/heartbeat`]: ['network', ok, ok, ok],
      [`POST ${BATCH}`]: ['network', counts]}, {heartbeatMs: 30});
    await waitFor(() => expect(batches(http)).toHaveLength(2));
    expect(batches(http)[1]).toEqual(batches(http)[0]);
  });

  it('a 429 waits Retry-After before the next try', async () => {
    const {http} = await mount({...base, [`POST ${S}/heartbeat`]: ['network', ok],
      [`POST ${BATCH}`]: [{...problem(429, 'RATE_LIMITED'), headers: {'Retry-After': '120'}}, counts]},
    {heartbeatMs: 30});
    await waitFor(() => expect(batches(http)).toHaveLength(1));
    await new Promise(resolve => setTimeout(resolve, 200));
    expect(batches(http)).toHaveLength(1);
  });

  it('another 4xx drops that batch and does not block the rest', async () => {
    const lost = Array.from({length: 101}, () => 'network' as const);
    const {http} = await mount({...base, [`POST ${S}/heartbeat`]: [...lost, ok],
      [`POST ${BATCH}`]: [problem(400, 'VALIDATION_FAILED'), counts]}, {heartbeatMs: 1});
    await waitFor(() => expect(batches(http)).toHaveLength(2), {timeout: 8000});
    expect(batches(http).map(b => b.points.length)).toEqual([100, 1]);
    await new Promise(resolve => setTimeout(resolve, 150));
    expect(batches(http)).toHaveLength(2);
  }, 15000);
});

describe('B4: bounded', () => {
  it('keeps at most the limit, the newest', async () => {
    const {http} = await mount({...base, [`POST ${S}/heartbeat`]: ['network', 'network', 'network', 'network',
      'network', ok], [`POST ${BATCH}`]: [counts]}, {heartbeatMs: 30, trackLimit: 3});
    await waitFor(() => expect(batches(http)).toHaveLength(1));
    expect(batches(http)[0]!.points).toEqual([located(http, 2), located(http, 3), located(http, 4)]);
  });

  it('going offline empties the buffer: the next session never sends the old points', async () => {
    const SECOND = '70000000-0000-4000-8000-000000000002';
    const again = {...online, session_id: SECOND, session_version: 1};
    const {http} = await mount({...base, [`POST ${S}/heartbeat`]: ['network'],
      [`POST ${S}/close`]: [{status: 200, body: offline}], [`POST ${BATCH}`]: [counts],
      'POST /api/driver/v1/work-sessions': [{status: 201, body: again}],
      ['POST /api/driver/v1/work-sessions/' + SECOND + '/heartbeat']: [{status: 200, body: again}]},
    {heartbeatMs: 30});
    await waitFor(() => expect(beats(http).length).toBeGreaterThanOrEqual(2));
    await fireEvent.press(await screen.findByRole('button', {name: 'Уйти с линии'}));
    await fireEvent.press(await screen.findByRole('button', {name: 'Выйти на линию'}));
    await waitFor(() => expect(http.calls.filter(c => c.path.endsWith(SECOND + '/heartbeat')).length)
      .toBeGreaterThanOrEqual(2));
    expect(batches(http)).toHaveLength(0);
  });
});

describe('B5: never on disk', () => {
  it('nothing about the track is written to storage', async () => {
    const writes: string[] = [];
    const store = {read: () => null, write: (value: string | null) => {writes.push(String(value));}};
    const {http} = await mount({...base, [`POST ${S}/heartbeat`]: ['network', 'network', ok],
      [`POST ${BATCH}`]: [counts]}, {heartbeatMs: 30, tokens: store});
    await waitFor(() => expect(batches(http)).toHaveLength(1));
    expect(writes.join(' ')).not.toMatch(/sequence|lat|lon/);
  });
});
