import {render, screen, waitFor} from '@testing-library/react-native';
import {createApiClient, type RefreshTokenStore} from '@blizz/api-client';
import {RiderApp, type AppConfig} from '../src/App';
import {driverMapHtml} from '@blizz/mobile-ui';

/** The driver on a map while the trip is under way (#483): M1–M4 of the issue. */
type Captured = {views: {source: {html: string}}[]; injected: string[]};
const captured = globalThis as unknown as {mapCapture: Captured};
captured.mapCapture = {views: [], injected: []};

jest.mock('react-native-webview', () => {
  const React = jest.requireActual('react');
  const sink = (globalThis as unknown as {mapCapture: Captured}).mapCapture;
  return {WebView: React.forwardRef((props: {source: {html: string}}, ref: unknown) => {
    React.useImperativeHandle(ref, () => ({injectJavaScript: (js: string) => {sink.injected.push(js);}}));
    sink.views.push(props);
    return null;
  })};
});

beforeEach(() => {
  captured.mapCapture.views.length = 0;
  captured.mapCapture.injected.length = 0;
});

const cid = '10000000-0000-4000-8000-000000000001';
const session = {
  session_id: '10000000-0000-4000-8000-000000000002', subject: {type: 'CLIENT', id: '10000000-0000-4000-8000-000000000003'},
  audience: 'rider', access_token: 'test-only-access', refresh_token: 'test-only-refresh',
  access_expires_at: '2099-01-01T00:00:00Z', refresh_expires_at: '2099-01-01T00:00:00Z', password_change_required: false
};
const HERE = {lat: 50.45, lon: 30.52};
const quote = {id: '80000000-0000-4000-8000-000000000001', vehicle_class: 'STANDARD', amount_minor: 12000,
  currency: 'UAH'};
const order = {id: '90000000-0000-4000-8000-000000000001', short_number: 7, status: 'SEARCHING', version: 1,
  price_minor: 12000, currency: 'UAH', driver: null};

type Call = {method: string; path: string; query: URLSearchParams; body?: unknown};
type Answer = {status: number; body?: unknown; delayMs?: number} | 'network';

function server(script: Record<string, Answer[]>) {
  const calls: Call[] = [];
  const fetch = jest.fn(async (url: string, init: RequestInit) => {
    const parsed = new URL(url);
    const method = String(init.method);
    calls.push({method, path: parsed.pathname, query: parsed.searchParams,
      body: init.body ? JSON.parse(String(init.body)) : undefined});
    const answers = script[method + ' ' + parsed.pathname] ?? [{status: 404, body: {code: 'NOT_FOUND', correlation_id: cid}}];
    const answer = answers.length > 1 ? answers.shift()! : answers[0]!;
    if (answer === 'network') throw new TypeError('Network request failed');
    if (answer.delayMs) await new Promise(resolve => setTimeout(resolve, answer.delayMs));
    return new Response(answer.body === undefined ? null : JSON.stringify(answer.body),
      {status: answer.status, headers: {'Content-Type': 'application/json'}});
  });
  return {fetch: fetch as unknown as typeof globalThis.fetch, calls};
}

const memory = (): RefreshTokenStore => {let v: string | null = null; return {read: () => v, write: n => {v = n;}};};

const ready = {
  'GET /api/rider/v1/legal': [{status: 200, body: {documents: []}}],
  'GET /api/rider/v1/orders/current': [{status: 200, body: {orders: []}}],
  'GET /api/rider/v1/vehicle-classes': [{status: 200, body: [{code: 'STANDARD', name: 'Стандарт'}]}],
  'GET /api/rider/v1/places': [{status: 200, body: {provider: 'FAKE', places: [{label: 'Вокзал', point: {lat: 50.44,
    lon: 30.49}}]}}],
  'POST /api/rider/v1/quotes': [{status: 201, body: quote}],
  'GET /api/rider/v1/cancel-reasons': [{status: 200, body: {reasons: [{code: 'CHANGED_MIND', labels: {ru: 'Передумал'}}]}}]
};

async function mount(script: Record<string, Answer[]>, options: {locate?: () => Promise<{lat: number; lon: number}>;
  pollMs?: number} = {}) {
  const http = server(script);
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: memory(), fetch: http.fetch,
    correlationId: () => cid, initialSession: session as never});
  const config: AppConfig = {service: 'default', deviceRef: 'test', pollMs: options.pollMs ?? 60_000,
    locate: options.locate ?? (async () => HERE),
    newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')};
  await render(<RiderApp client={client} config={config} />);
  return {http};
}

const PICKUP = {lat: 50.4501, lon: 30.5234};
const driver = {name: 'Іван', make: 'Skoda', model: 'Octavia', color: 'white', registration_number: 'AA0001TX'};
const located = (lat: number, lon: number, over: Record<string, unknown> = {}) => ({...order, status: 'ASSIGNED',
  version: 4, pickup: PICKUP, driver, driver_location: {lat, lon, at: new Date(Date.now() - 70_000).toISOString(),
    stale: false, ...over}});

describe('M1: the page', () => {
  it('both points as [lat, lon], Leaflet only from unpkg with SRI, OSM tiles and attribution', () => {
    const html = driverMapHtml({pickup: PICKUP, driver: {lat: 50.46, lon: 30.51}});
    expect(html).toContain('[50.4501,30.5234]');
    expect(html).toContain('[50.46,30.51]');
    expect(html).toContain('https://unpkg.com/leaflet@1.9.4/dist/leaflet.js');
    expect(html).toContain('https://unpkg.com/leaflet@1.9.4/dist/leaflet.css');
    expect(html.match(/integrity="sha256-[A-Za-z0-9+/=]+"/g)).toHaveLength(2);
    expect(html).toContain('https://tile.openstreetmap.org/{z}/{x}/{y}.png');
    expect(html).toContain('openstreetmap.org/copyright');
    expect([...html.matchAll(/<script[^>]*src="([^"]+)"/g)].map(m => m[1])).toEqual(
      ['https://unpkg.com/leaflet@1.9.4/dist/leaflet.js']);
  });

  it('a coordinate that is not a number makes no page', () => {
    expect(() => driverMapHtml({pickup: {lat: NaN, lon: 1}, driver: {lat: 1, lon: 1}})).toThrow();
  });
});

describe('M2: shown while the driver is located', () => {
  it('the map and the line; a newer position is pushed, the page stays', async () => {
    await mount({...ready, 'GET /api/rider/v1/orders/current': [{status: 200, body: {orders: [located(50.46, 30.51)]}}],
      ['GET /api/rider/v1/orders/' + order.id]: [{status: 200, body: located(50.455, 30.515)}]}, {pollMs: 50});
    expect(await screen.findByText('Водитель на карте · обновлено 1 мин назад')).toBeTruthy();
    await waitFor(() => expect(captured.mapCapture.views.length).toBeGreaterThan(0));
    const first = captured.mapCapture.views[0]!.source.html;
    expect(first).toContain('[50.46,30.51]');
    await waitFor(() => expect(captured.mapCapture.injected.some(js => js.includes('50.455')
      && js.includes('30.515'))).toBe(true));
    expect(new Set(captured.mapCapture.views.map(v => v.source.html)).size).toBe(1);
  });
});

describe('M3: stale', () => {
  it('says the position is old', async () => {
    await mount({...ready, 'GET /api/rider/v1/orders/current': [{status: 200, body: {orders: [located(50.46, 30.51,
      {stale: true})]}}]});
    expect(await screen.findByText('Позиция водителя устарела')).toBeTruthy();
  });
});

describe('M4: no position', () => {
  it('no map and no line', async () => {
    await mount({...ready, 'GET /api/rider/v1/orders/current': [{status: 200, body: {orders: [{...order,
      status: 'ASSIGNED', pickup: PICKUP, driver}]}}]});
    expect(await screen.findByText('Водитель едет к вам')).toBeTruthy();
    expect(screen.queryByText(/Водитель на карте/)).toBeNull();
    expect(captured.mapCapture.views).toHaveLength(0);
  });
});
