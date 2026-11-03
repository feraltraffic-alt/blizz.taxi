import {fireEvent, render, screen, waitFor} from '@testing-library/react-native';
import {createApiClient, type RefreshTokenStore} from '@blizz/api-client';
import {RiderApp, type AppConfig} from '../src/App';

const cid = '10000000-0000-4000-8000-000000000001';
const session = {
  session_id: '10000000-0000-4000-8000-000000000002', subject: {type: 'CLIENT', id: '10000000-0000-4000-8000-000000000003'},
  audience: 'rider', access_token: 'test-only-access', refresh_token: 'test-only-refresh',
  access_expires_at: '2099-01-01T00:00:00Z', refresh_expires_at: '2099-01-01T00:00:00Z', password_change_required: false
};
const HERE = {lat: 50.45, lon: 30.52};
const CENTER = {lat: 50.425, lon: 30.525};
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

const problem = (status: number, code: string) => ({status, body: {type: 'about:blank', title: code, status, code,
  correlation_id: cid, retryable: false}});
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

async function mount(script: Record<string, Answer[]>, options: {locate?: () => Promise<{lat: number; lon: number}>}
  = {}) {
  const http = server(script);
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: memory(), fetch: http.fetch,
    correlationId: () => cid, initialSession: session as never});
  const config: AppConfig = {service: 'default', deviceRef: 'test', pollMs: 60_000,
    locate: options.locate ?? (async () => HERE),
    newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')};
  await render(<RiderApp client={client} config={config} />);
  return {http};
}

/** From here to the station, priced. */
async function priced() {
  await fireEvent.changeText(await screen.findByLabelText('Поиск адреса назначения'), 'вокзал');
  await fireEvent.press(screen.getByRole('button', {name: 'Найти'}));
  await fireEvent.press(await screen.findByRole('button', {name: 'Вокзал'}));
  await fireEvent.press(await screen.findByRole('button', {name: 'Узнать цену'}));
  expect(await screen.findByText('Цена: 120.00 UAH')).toBeTruthy();
}

describe('E1: outside every city', () => {
  it('a pickup outside the cities is said so before an order', async () => {
    const {http} = await mount({...ready, 'GET /api/rider/v1/vehicle-classes': [problem(422, 'CITY_NOT_FOUND')]});
    expect(await screen.findByText('Здесь мы пока не работаем.')).toBeTruthy();
    expect(http.calls.some(c => c.path === '/api/rider/v1/orders' && c.method === 'POST')).toBe(false);
  });
});

describe('E2: no location', () => {
  it('the address search starts from the city\'s point', async () => {
    const {http} = await mount({...ready, 'GET /api/config/v1/bootstrap': [{status: 200, body: {cities: [{center: CENTER}]}}]},
      {locate: () => Promise.reject(new Error('denied'))});
    await fireEvent.press(await screen.findByRole('button', {name: 'Изменить «откуда»'}));
    await fireEvent.changeText(screen.getByLabelText('Поиск адреса подачи'), 'вокзал');
    await waitFor(() => expect(screen.getByRole('button', {name: 'Найти'}).props.accessibilityState.disabled).toBe(false));
    await fireEvent.press(screen.getByRole('button', {name: 'Найти'}));
    await waitFor(() => expect(http.calls.find(c => c.path === '/api/rider/v1/places')).toBeTruthy());
    const search = http.calls.find(c => c.path === '/api/rider/v1/places')!;
    expect(Number(search.query.get('lat'))).toBe(CENTER.lat);
  });
});

describe('E3: an expired price', () => {
  it('asks for a new price and orders nothing with the old one', async () => {
    const {http} = await mount({...ready, 'POST /api/rider/v1/orders': [problem(409, 'QUOTE_EXPIRED')]});
    await priced();
    await fireEvent.press(screen.getByRole('button', {name: 'Заказать'}));
    expect(await screen.findByText('Цена устарела. Узнайте цену снова.')).toBeTruthy();
    expect(screen.getByRole('button', {name: 'Заказать'}).props.accessibilityState.disabled).toBe(true);
    expect(http.calls.filter(c => c.path === '/api/rider/v1/orders' && c.method === 'POST')).toHaveLength(1);
  });
});

describe('E4: a double tap', () => {
  it('is one order with one command id while the first is on its way', async () => {
    const {http} = await mount({...ready, 'POST /api/rider/v1/orders': [{status: 201, delayMs: 300, body: order}]});
    await priced();
    const button = screen.getByRole('button', {name: 'Заказать'});
    await fireEvent.press(button);
    await fireEvent.press(button);
    expect(http.calls.filter(c => c.path === '/api/rider/v1/orders' && c.method === 'POST').length).toBeLessThanOrEqual(1);
    expect(await screen.findByText('Ищем водителя')).toBeTruthy();
    const posts = http.calls.filter(c => c.path === '/api/rider/v1/orders' && c.method === 'POST');
    expect(posts).toHaveLength(1);
    expect((posts[0]!.body as {command_id: string; payment_method: string}).payment_method).toBe('CASH');
  });
});

describe('E5: restarting', () => {
  it('an order in progress on the server is shown with its driver', async () => {
    await mount({...ready, 'GET /api/rider/v1/orders/current': [{status: 200, body: {orders: [{...order,
      status: 'ASSIGNED', driver: {name: 'Іван', make: 'Skoda', model: 'Octavia', color: 'white',
        registration_number: 'AA0001TX'}, pickup_eta: {seconds: 240}}]}}]});
    expect(await screen.findByText('Водитель едет к вам')).toBeTruthy();
    expect(screen.getByText(/AA0001TX/)).toBeTruthy();
    expect(screen.getByText('Водитель будет через 4 мин')).toBeTruthy();
  });
});

describe('cancelling', () => {
  it('a cancelled order stays on screen as cancelled until the rider starts a new ride', async () => {
    const {http} = await mount({...ready, 'GET /api/rider/v1/orders/current': [{status: 200, body: {orders: [order]}}],
      ['POST /api/rider/v1/orders/' + order.id + '/cancel']: [{status: 200, body: {...order, status: 'CANCELLED',
        version: 3}}]});
    await fireEvent.press(await screen.findByRole('button', {name: '○ Передумал'}));
    await fireEvent.press(screen.getByRole('button', {name: 'Отменить поездку'}));
    expect(await screen.findByText('Заказ отменён')).toBeTruthy();
    const body = http.calls.find(c => c.path.endsWith('/cancel'))!.body as {expected_version: number; reason_code: string};
    expect(body).toMatchObject({expected_version: order.version, reason_code: 'CHANGED_MIND'});
    await fireEvent.press(screen.getByRole('button', {name: 'Новая поездка'}));
    expect(await screen.findByText('Куда поедем?')).toBeTruthy();
  });
});

describe('E6: refusals', () => {
  it('a cancel after the order moved on refreshes it and says so', async () => {
    await mount({...ready, 'GET /api/rider/v1/orders/current': [{status: 200, body: {orders: [order]}}],
      ['POST /api/rider/v1/orders/' + order.id + '/cancel']: [problem(409, 'STATE_CONFLICT')],
      ['GET /api/rider/v1/orders/' + order.id]: [{status: 200, body: {...order, status: 'IN_SERVICE', version: 3}}]});
    await fireEvent.press(await screen.findByRole('button', {name: '○ Передумал'}));
    await fireEvent.press(screen.getByRole('button', {name: 'Отменить поездку'}));
    expect(await screen.findByText('Заказ изменился, пока вы его отменяли. Проверьте его состояние.')).toBeTruthy();
    expect(await screen.findByText('В пути')).toBeTruthy();
  });

  it('a debt is said so, and a text to accept leads to the legal texts', async () => {
    await mount({...ready, 'POST /api/rider/v1/orders': [problem(403, 'RIDER_HAS_DEBT')]});
    await priced();
    await fireEvent.press(screen.getByRole('button', {name: 'Заказать'}));
    expect(await screen.findByText('Сначала погасите долг за прошлую поездку.')).toBeTruthy();
  });

  it('#332 D6: a debt offers to pay it, which opens the debts screen', async () => {
    await mount({...ready, 'POST /api/rider/v1/orders': [problem(403, 'RIDER_HAS_DEBT')],
      'GET /api/rider/v1/obligations': [{status: 200, body: {items: []}}]});
    await priced();
    await fireEvent.press(screen.getByRole('button', {name: 'Заказать'}));
    await fireEvent.press(await screen.findByRole('button', {name: 'Оплатить долг'}));
    expect(await screen.findByText('Долгов нет.')).toBeTruthy();
  });

  it('ACCEPTANCE_REQUIRED shows the legal text to accept', async () => {
    const terms = {version_id: 't1', audience: 'RIDER', kind: 'TERMS', number: 2, acceptance_required: true,
      accepted: false, effective_from: '2026-01-01T00:00:00Z', languages: ['ru']};
    await mount({...ready, 'POST /api/rider/v1/orders': [problem(403, 'ACCEPTANCE_REQUIRED')],
      'GET /api/rider/v1/legal': [{status: 200, body: {documents: []}}, {status: 200, body: {documents: [terms]}}],
      'GET /api/config/v1/legal/rider/terms': [{status: 200, body: {...terms, language: 'ru', text: 'Новые условия'}}]});
    await priced();
    await fireEvent.press(screen.getByRole('button', {name: 'Заказать'}));
    expect(await screen.findByText('Новые условия')).toBeTruthy();
  });
});

/** Naming the pickup from the location (#345): G1–G4. */
describe('#345: the pickup from the location', () => {
  const REVERSE = 'GET /api/rider/v1/places/reverse';
  const named = {status: 200, body: {source: 'OWN', label: 'Хрещатик, 22', street: 'Хрещатик', house: '22', point: HERE}};

  it('G1: the address of the point is the pickup, and the order carries it', async () => {
    const {http} = await mount({...ready, [REVERSE]: [named], 'POST /api/rider/v1/orders': [{status: 201, body: order}]});
    expect(await screen.findByText('Откуда: Хрещатик, 22')).toBeTruthy();
    const asked = http.calls.find(c => c.path === '/api/rider/v1/places/reverse')!;
    expect([Number(asked.query.get('lat')), Number(asked.query.get('lon')), asked.query.get('language')])
      .toEqual([HERE.lat, HERE.lon, 'ru']);
    await priced();
    await fireEvent.press(screen.getByRole('button', {name: 'Заказать'}));
    await waitFor(() => expect(http.calls.some(c => c.method === 'POST' && c.path === '/api/rider/v1/orders')).toBe(true));
    expect(http.calls.find(c => c.method === 'POST' && c.path === '/api/rider/v1/orders')!.body)
      .toMatchObject({pickup_label: 'Хрещатик, 22'});
  });

  it.each([['a 204', {status: 204}], ['a 503', problem(503, 'UNAVAILABLE')]])('G2, G3: %s keeps "Здесь"',
    async (_name, answer) => {
      await mount({...ready, [REVERSE]: [answer as Answer]});
      await waitFor(() => expect(screen.getByText('Откуда: Здесь')).toBeTruthy());
      await new Promise(resolve => setTimeout(resolve, 50));
      expect(screen.getByText('Откуда: Здесь')).toBeTruthy();
    });

  it('G4: a pickup the rider chose wins over a late answer', async () => {
    await mount({...ready, [REVERSE]: [{...named, delayMs: 400}]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Изменить «откуда»'}));
    await fireEvent.changeText(screen.getByLabelText('Поиск адреса подачи'), 'вокзал');
    await waitFor(() => expect(screen.getByRole('button', {name: 'Найти'}).props.accessibilityState.disabled).toBe(false));
    await fireEvent.press(screen.getByRole('button', {name: 'Найти'}));
    await fireEvent.press(await screen.findByRole('button', {name: 'Вокзал'}));
    expect(await screen.findByText('Откуда: Вокзал')).toBeTruthy();
    await new Promise(resolve => setTimeout(resolve, 500));
    expect(screen.getByText('Откуда: Вокзал')).toBeTruthy();
  });
});
