import {fireEvent, render, screen, waitFor} from '@testing-library/react-native';
import {createApiClient} from '@blizz/api-client';
import {RiderApp, type AppConfig} from '../src/App';

/** The provider's page: what the app sends it is recorded, and it "returns" at once, as the sandbox's FAKE page does. */
const pages: {url: string; fields: Record<string, string>}[] = [];
jest.mock('../src/ProviderPage', () => {
  const {useEffect} = jest.requireActual<typeof import('react')>('react');
  return {ProviderPage: ({url, fields, onDone}: {url: string; fields: Record<string, string>; onDone: () => void}) => {
    useEffect(() => {
      pages.push({url, fields});
      onDone();
    }, []);
    return null;
  }};
});

/** The rider's saved cards (#269): K1–K6 of the issue. */
const cid = '10000000-0000-4000-8000-000000000001';
const session = {
  session_id: '10000000-0000-4000-8000-000000000002', subject: {type: 'CLIENT', id: '10000000-0000-4000-8000-000000000003'},
  audience: 'rider', access_token: 'test-only-access', refresh_token: 'test-only-refresh',
  access_expires_at: '2099-01-01T00:00:00Z', refresh_expires_at: '2099-01-01T00:00:00Z', password_change_required: false
};

type Call = {method: string; path: string; query: URLSearchParams; body?: unknown};
type Answer = {status: number; body?: unknown; delayMs?: number};

function server(script: Record<string, Answer[]>) {
  const calls: Call[] = [];
  const fetch = jest.fn(async (url: string, init: RequestInit) => {
    const parsed = new URL(url);
    const path = parsed.pathname;
    const method = String(init.method);
    calls.push({method, path, query: parsed.searchParams, body: init.body ? JSON.parse(String(init.body)) : undefined});
    const answers = script[method + ' ' + path] ?? [{status: 404, body: {code: 'NOT_FOUND', correlation_id: cid}}];
    const answer = answers.length > 1 ? answers.shift()! : answers[0]!;
    if (answer.delayMs) await new Promise(resolve => setTimeout(resolve, answer.delayMs));
    return new Response(answer.body === undefined ? null : JSON.stringify(answer.body),
      {status: answer.status, headers: {'Content-Type': 'application/json'}});
  });
  return {fetch: fetch as unknown as typeof globalThis.fetch, calls};
}

const problem = (status: number, code: string) => ({status, body: {type: 'about:blank', title: code, status, code,
  correlation_id: cid, retryable: false}});

const KYIV = '5a000000-0000-4000-8000-000000000001';
const BINDING = 'b1000000-0000-4000-8000-000000000001';
const card = (n: number, pan: string) => ({id: 'ca000000-0000-4000-8000-00000000000' + n,
  merchant_id: 'aa000000-0000-4000-8000-000000000001', masked_pan: pan, card_type: 'VISA',
  created_at: '2026-11-02T10:00:00Z'});
const binding = (state: string, over: Record<string, unknown> = {}) => ({id: BINDING, state,
  expires_at: '2026-11-02T10:15:00Z', url: null, fields: null, return_url: null, card: null, failure_reason: null,
  ...over});
const started = {status: 201, body: binding('PENDING', {url: 'https://pay.example/verify',
  fields: {merchantAccount: 'test', orderReference: 'b1', returnUrl: 'https://api.blizz.test/return'},
  return_url: 'https://api.blizz.test/return'})};
const CARDS = 'GET /api/rider/v1/cards';
const START = 'POST /api/rider/v1/card-bindings';
const READ = 'GET /api/rider/v1/card-bindings/' + BINDING;

async function mount(script: Record<string, Answer[]>) {
  return mountWith(script);
}

async function mountWith(script: Record<string, Answer[]>) {
  pages.length = 0;
  const http = server({
    'GET /api/rider/v1/legal': [{status: 200, body: {documents: []}}],
    'GET /api/rider/v1/orders/current': [{status: 200, body: {orders: []}}],
    'GET /api/rider/v1/me': [{status: 200, body: {account_state: 'ACTIVE', phone: '+380671234567', name: null}}],
    'GET /api/config/v1/bootstrap': [{status: 200, body: {cities: [{id: KYIV, name: 'Київ',
      center: {lat: 50.45, lon: 30.52}}]}}],
    ...script
  });
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: {read: () => null, write: () => {}},
    fetch: http.fetch, correlationId: () => cid, initialSession: session as never});
  const config: AppConfig = {service: 'default', deviceRef: 'test', pollMs: 50, locate: async () => ({lat: 50.45,
    lon: 30.52}), newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')};
  await render(<RiderApp client={client} config={config} />);
  await fireEvent.press(await screen.findByRole('button', {name: 'Профиль'}));
  await fireEvent.press(await screen.findByRole('button', {name: 'Мои карты'}));
  return {http};
}

describe('K1: the plain success', () => {
  it('lists the cards; a new card goes through the provider\'s page and appears when the binding completes',
    async () => {
      const {http} = await mount({[CARDS]: [{status: 200, body: {cards: [card(1, '41****1111')]}},
        {status: 200, body: {cards: [card(2, '52****4444'), card(1, '41****1111')]}}], [START]: [started],
      [READ]: [{status: 200, body: binding('PENDING')}, {status: 200, body: binding('COMPLETED',
        {card: card(2, '52****4444')})}]});
      expect(await screen.findByText('VISA 41****1111')).toBeTruthy();
      await fireEvent.press(screen.getByRole('button', {name: 'Добавить карту'}));
      expect(await screen.findByText('VISA 52****4444')).toBeTruthy();
      expect(screen.getByText('Карта добавлена.')).toBeTruthy();
      const start = http.calls.find(c => c.path === '/api/rider/v1/card-bindings')!.body as {city_id: string};
      expect(start.city_id).toBe(KYIV);
      expect(pages).toEqual([{url: 'https://pay.example/verify', fields: {merchantAccount: 'test', orderReference: 'b1',
        returnUrl: 'https://api.blizz.test/return'}}]);
      expect(http.calls.filter(c => c.path.endsWith(BINDING)).length).toBeGreaterThanOrEqual(2);
    });
});

describe('K2: a binding that does not complete', () => {
  it.each([['FAILED', {failure_reason: 'Карта отклонена банком'}, 'Карту не добавили: Карта отклонена банком'],
    ['EXPIRED', {}, 'Время на добавление карты вышло. Попробуйте ещё раз.']])('%s is said and adds no card',
    async (state, over, text) => {
      const {http} = await mount({[CARDS]: [{status: 200, body: {cards: []}}], [START]: [started],
        [READ]: [{status: 200, body: binding(state, over)}]});
      await fireEvent.press(await screen.findByRole('button', {name: 'Добавить карту'}));
      expect(await screen.findByText(text)).toBeTruthy();
      expect(http.calls.filter(c => c.path === '/api/rider/v1/cards')).toHaveLength(1);
    });
});

describe('K3: a city that takes no cards', () => {
  it('a 404 at the start is said so', async () => {
    await mount({[CARDS]: [{status: 200, body: {cards: []}}], [START]: [problem(404, 'NOT_FOUND')]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Добавить карту'}));
    expect(await screen.findByText('В этом городе карты пока не принимают.')).toBeTruthy();
    expect(pages).toHaveLength(0);
  });
});

describe('K4: a double tap on "add"', () => {
  it('is one binding', async () => {
    const {http} = await mount({[CARDS]: [{status: 200, body: {cards: []}}], [START]: [{...started, delayMs: 300}],
      [READ]: [{status: 200, body: binding('COMPLETED', {card: card(2, '52****4444')})}]});
    const add = await screen.findByRole('button', {name: 'Добавить карту'});
    await fireEvent.press(add);
    await fireEvent.press(add);
    expect(await screen.findByText('Карта добавлена.')).toBeTruthy();
    expect(http.calls.filter(c => c.path === '/api/rider/v1/card-bindings')).toHaveLength(1);
  });
});

describe('K5: removing a card', () => {
  it('removes it, once on a double tap', async () => {
    const remove = 'POST /api/rider/v1/cards/' + card(1, '').id + '/remove';
    const {http} = await mount({[CARDS]: [{status: 200, body: {cards: [card(1, '41****1111')]}}],
      [remove]: [{status: 204, delayMs: 300}]});
    const button = await screen.findByRole('button', {name: 'Удалить 41****1111'});
    await fireEvent.press(button);
    await fireEvent.press(button);
    await waitFor(() => expect(screen.queryByText('VISA 41****1111')).toBeNull());
    expect(http.calls.filter(c => c.path.endsWith('/remove'))).toHaveLength(1);
    expect(screen.getByText('Карт пока нет.')).toBeTruthy();
  });
});

describe('K6: a failed read', () => {
  it('shows the correlation id and a retry', async () => {
    await mount({[CARDS]: [problem(500, 'INTERNAL'), {status: 200, body: {cards: [card(1, '41****1111')]}}]});
    expect(await screen.findByText(new RegExp(cid))).toBeTruthy();
    await fireEvent.press(screen.getByRole('button', {name: 'Повторить'}));
    expect(await screen.findByText('VISA 41****1111')).toBeTruthy();
  });
});

describe('K7: a service with several cities', () => {
  it('asks which city the card is for, and binds it there', async () => {
    const WARSAW = '5a000000-0000-4000-8000-000000000002';
    const {http} = await mountWith({[CARDS]: [{status: 200, body: {cards: []}}], [START]: [started],
      [READ]: [{status: 200, body: binding('COMPLETED', {card: card(2, '52****4444')})}],
      'GET /api/config/v1/bootstrap': [{status: 200, body: {cities: [{id: WARSAW, name: 'Warszawa',
        center: {lat: 52.23, lon: 21.01}}, {id: KYIV, name: 'Київ', center: {lat: 50.45, lon: 30.52}}]}}]});
    expect(await screen.findByRole('button', {name: 'Добавить карту: Warszawa'})).toBeTruthy();
    await fireEvent.press(screen.getByRole('button', {name: 'Добавить карту: Київ'}));
    expect(await screen.findByText('Карта добавлена.')).toBeTruthy();
    const start = http.calls.find(c => c.path === '/api/rider/v1/card-bindings')!.body as {city_id: string};
    expect(start.city_id).toBe(KYIV);
  });
});
