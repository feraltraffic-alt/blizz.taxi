import {render, waitFor} from '@testing-library/react-native';
import {createApiClient, type RefreshTokenStore} from '@blizz/api-client';
import {DriverApp, type AppConfig} from '../src/App';
import {chunkedSecureStore, type SecureStore} from '@blizz/mobile-ui';

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

const noLegal = {'GET /api/driver/v1/legal': [{status: 200, body: {documents: []}}]};

/** The unsent GPS points kept across a restart, encrypted on the phone (#462): P1–P5 of the issue. */
const S = '/api/driver/v1/work-sessions/' + SESSION;
const BATCH = '/api/driver/v1/location-batches';
const KEY = 'blizz.driver.track';
const base = {...noLegal, 'GET /api/driver/v1/profile': [{status: 200, body: admitted}],
  'GET /api/driver/v1/work-sessions/current': [{status: 200, body: online}]};
const ok = {status: 200, body: online};
const counts = {status: 200, body: {accepted: 3, duplicates: 0, flagged: 0}};
type Point = {sequence: number; recorded_at: string};
type Batch = {command_id: string; points: Point[]};
const batches = (http: {calls: Call[]}) => http.calls.filter(c => c.path === BATCH).map(c => c.body as Batch);

/** expo-secure-store's synchronous part, in memory: the keys it holds are visible to the test. */
function phone(): SecureStore & {keys: Map<string, string>} {
  const keys = new Map<string, string>();
  return {keys, getItem: key => keys.get(key) ?? null, setItem: (key, value) => {keys.set(key, value);},
    deleteItemAsync: async key => {keys.delete(key);}};
}

/**
 * {@code restart}: the view of the app before, given a new app instance (a new key) in its place, as a restart does.
 * Unmounting by hand and rendering again left the test renderer without effects for the next test.
 */
async function mount(script: Record<string, Answer[]>, store: SecureStore, options: {prefix: string; now?: number;
  tokens?: RefreshTokenStore; restart?: Awaited<ReturnType<typeof render>>}) {
  const http = server(script);
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: options.tokens ?? memory(),
    fetch: http.fetch, correlationId: () => cid, initialSession: session as never});
  const config: AppConfig = {service: 'default', deviceRef: 'test-driver', now: () => options.now ?? NOW,
    heartbeatMs: 30, locate: async () => ({lat: 50.4501, lon: 30.5234, accuracy_m: 8}),
    trackStore: chunkedSecureStore(store, KEY),
    newId: () => options.prefix + '-0000-4000-8000-' + String(++id).padStart(12, '0')};
  const app = <DriverApp key={options.prefix} client={client} config={config} />;
  if (options.restart) {
    await options.restart.rerender(app);
    return {http, view: options.restart};
  }
  const view = await render(app);
  return {http, view};
}

const stored = (store: SecureStore) => {
  const value = chunkedSecureStore(store, KEY).read();
  return value ? JSON.parse(value) as {pending: Batch | null; points: Point[]} : null;
};

describe('P1: survives a restart', () => {
  it('points buffered before a restart are sent after it', async () => {
    const store = phone();
    const first = await mount({...base, [`POST ${S}/heartbeat`]: ['network']}, store, {prefix: '41000000'});
    await waitFor(() => expect(stored(store)?.points.length ?? 0).toBeGreaterThanOrEqual(3));
    const kept = stored(store)!.points.map(p => p.sequence);
    const second = await mount({...base, [`POST ${S}/heartbeat`]: [ok], [`POST ${BATCH}`]: [counts]}, store,
      {prefix: '42000000', restart: first.view});
    await waitFor(() => expect(batches(second.http).length).toBeGreaterThanOrEqual(1));
    expect(batches(second.http)[0]!.points.map(p => p.sequence).slice(0, kept.length)).toEqual(kept);
  });

  it('a batch pending before a restart goes with the same command_id', async () => {
    const store = phone();
    const first = await mount({...base, [`POST ${S}/heartbeat`]: ['network', ok], [`POST ${BATCH}`]: ['network']},
      store, {prefix: '43000000'});
    // Every good beat retries the batch that failed, with the same command_id: at least one try.
    await waitFor(() => expect(batches(first.http).length).toBeGreaterThanOrEqual(1));
    await waitFor(() => expect(stored(store)?.pending?.command_id).toBe(batches(first.http)[0]!.command_id));
    const command = batches(first.http)[0]!.command_id;
    const second = await mount({...base, [`POST ${S}/heartbeat`]: [ok], [`POST ${BATCH}`]: [counts]}, store,
      {prefix: '44000000', restart: first.view});
    await waitFor(() => expect(batches(second.http).length).toBeGreaterThanOrEqual(1));
    expect(batches(second.http)[0]!.command_id).toBe(command);
    expect(command.startsWith('43000000')).toBe(true);
  });
});

describe('P2: cleared after confirmation', () => {
  it('after the last 200 the store holds nothing to send', async () => {
    const store = phone();
    const {http} = await mount({...base, [`POST ${S}/heartbeat`]: ['network', 'network', ok],
      [`POST ${BATCH}`]: [counts]}, store, {prefix: '45000000'});
    await waitFor(() => expect(batches(http)).toHaveLength(1));
    await waitFor(() => expect(stored(store) ?? {pending: null, points: []}).toEqual({pending: null, points: []}));
  });
});

describe('P3: bounded by time', () => {
  it('points older than 24 hours are dropped on load', async () => {
    const store = phone();
    const old = {sequence: 1, lat: 50.45, lon: 30.52, accuracy_m: 8,
      recorded_at: new Date(NOW - 25 * 3600 * 1000).toISOString()};
    const fresh = {...old, sequence: 2, recorded_at: new Date(NOW - 3600 * 1000).toISOString()};
    chunkedSecureStore(store, KEY).write(JSON.stringify({pending: null, points: [old, fresh]}));
    const {http} = await mount({...base, [`POST ${S}/heartbeat`]: [ok], [`POST ${BATCH}`]: [counts]}, store,
      {prefix: '46000000'});
    await waitFor(() => expect(batches(http)).toHaveLength(1));
    expect(batches(http)[0]!.points.map(p => p.sequence)).toEqual([2]);
  });
});

describe('P4: chunking', () => {
  it('a 10 KB value is split into keys of at most 1900 and read back equal; a shorter one leaves no stale keys',
    () => {
      const store = phone();
      const chunked = chunkedSecureStore(store, KEY);
      const long = 'x'.repeat(10_000) + 'end';
      chunked.write(long);
      expect(chunked.read()).toBe(long);
      const parts = [...store.keys.entries()].filter(([k]) => k !== KEY);
      expect(parts.length).toBeGreaterThanOrEqual(6);
      expect(Math.max(...parts.map(([, v]) => v.length))).toBeLessThanOrEqual(1900);
      chunked.write('short');
      expect(chunked.read()).toBe('short');
      expect([...store.keys.keys()].filter(k => k !== KEY && store.keys.get(k) !== '').length).toBe(1);
    });

  it('a missing chunk reads as nothing, not as broken text', () => {
    const store = phone();
    const chunked = chunkedSecureStore(store, KEY);
    chunked.write('y'.repeat(5000));
    store.keys.delete(KEY + '.1');
    expect(chunked.read()).toBeNull();
  });

  it('null empties every key', () => {
    const store = phone();
    const chunked = chunkedSecureStore(store, KEY);
    chunked.write('z'.repeat(5000));
    chunked.write(null);
    expect(chunked.read()).toBeNull();
    expect([...store.keys.values()].every(v => v === '')).toBe(true);
  });
});

describe('P5: never in plain storage', () => {
  it('nothing about the track goes to the refresh-token store', async () => {
    const store = phone();
    const writes: string[] = [];
    const tokens = {read: () => null, write: (value: string | null) => {writes.push(String(value));}};
    const {http} = await mount({...base, [`POST ${S}/heartbeat`]: ['network', 'network', ok],
      [`POST ${BATCH}`]: [counts]}, store, {prefix: '47000000', tokens});
    await waitFor(() => expect(batches(http)).toHaveLength(1));
    expect(writes.join(' ')).not.toMatch(/sequence|recorded_at/);
    expect([...store.keys.keys()].every(k => k === KEY || k.startsWith(KEY + '.'))).toBe(true);
  });
});
