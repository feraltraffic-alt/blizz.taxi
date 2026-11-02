import {fireEvent, render, screen, waitFor} from '@testing-library/react-native';
import {createApiClient} from '@blizz/api-client';
import {RiderApp, type AppConfig} from '../src/App';

/** The order chat in the rider's tracker (#262): C1–C6 of the issue. */
const cid = '10000000-0000-4000-8000-000000000001';
const session = {
  session_id: '10000000-0000-4000-8000-000000000002', subject: {type: 'CLIENT', id: '10000000-0000-4000-8000-000000000003'},
  audience: 'rider', access_token: 'test-only-access', refresh_token: 'test-only-refresh',
  access_expires_at: '2099-01-01T00:00:00Z', refresh_expires_at: '2099-01-01T00:00:00Z', password_change_required: false
};
const ID = '90000000-0000-4000-8000-000000000001';
const driver = {name: 'Іван', make: 'Skoda', model: 'Octavia', color: 'white', registration_number: 'AA0001TX'};
const riding = {id: ID, short_number: 7, status: 'ASSIGNED', version: 4, price_minor: 12000, currency: 'UAH', driver};

type Call = {method: string; path: string; query: URLSearchParams; body?: unknown};
type Answer = {status: number; body?: unknown; delayMs?: number} | 'network';

function server(script: Record<string, Answer[]>) {
  const calls: Call[] = [];
  const fetch = jest.fn(async (url: string, init: RequestInit) => {
    const parsed = new URL(url);
    const path = parsed.pathname;
    const method = String(init.method);
    calls.push({method, path, query: parsed.searchParams, body: init.body ? JSON.parse(String(init.body)) : undefined});
    const answers = script[method + ' ' + path] ?? [{status: 404, body: {code: 'NOT_FOUND', correlation_id: cid}}];
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

const MESSAGES = 'GET /api/rider/v1/orders/' + ID + '/messages';
const SEND = 'POST /api/rider/v1/orders/' + ID + '/messages';
const message = (sequence: number, role: string, body: string) => ({id: 'c0000000-0000-4000-8000-00000000000' + sequence,
  order_id: ID, sequence, sender_role: role, body, sent_at: '2026-11-02T10:0' + sequence + ':00Z'});
const list = (...messages: unknown[]) => ({status: 200, body: {messages}});

/** An order with its driver on the way, on the server and in every poll. */
async function mount(script: Record<string, Answer[]>, pollMs = 60_000) {
  const http = server({
    'GET /api/rider/v1/legal': [{status: 200, body: {documents: []}}],
    'GET /api/rider/v1/orders/current': [{status: 200, body: {orders: [riding]}}],
    'GET /api/rider/v1/cancel-reasons': [{status: 200, body: {reasons: []}}],
    ['GET /api/rider/v1/orders/' + ID]: [{status: 200, body: riding}],
    ...script
  });
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: {read: () => null, write: () => {}},
    fetch: http.fetch, correlationId: () => cid, initialSession: session as never});
  const config: AppConfig = {service: 'default', deviceRef: 'test', pollMs, locate: async () => ({lat: 50.45,
    lon: 30.52}), newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')};
  await render(<RiderApp client={client} config={config} />);
  expect(await screen.findByText('Водитель едет к вам')).toBeTruthy();
  return {http};
}

const posts = (http: {calls: Call[]}) => http.calls.filter(c => c.method === 'POST' && c.path.endsWith('/messages'));

describe('C1: the plain success', () => {
  it('shows the history oldest first, and a sent message once, with the field emptied', async () => {
    const {http} = await mount({[MESSAGES]: [list(message(1, 'DRIVER', 'Буду через 3 минуты'),
      message(2, 'RIDER', 'Жду у входа'))], [SEND]: [{status: 201, body: message(3, 'RIDER', 'Я в синей куртке')}]});
    expect(await screen.findByText('Водитель: Буду через 3 минуты')).toBeTruthy();
    expect(screen.getByText('Вы: Жду у входа')).toBeTruthy();
    await fireEvent.changeText(screen.getByLabelText('Сообщение'), 'Я в синей куртке');
    await fireEvent.press(screen.getByRole('button', {name: 'Отправить'}));
    expect(await screen.findByText('Вы: Я в синей куртке')).toBeTruthy();
    expect(screen.getAllByText('Вы: Я в синей куртке')).toHaveLength(1);
    expect(screen.getByLabelText('Сообщение').props.value).toBe('');
    expect(posts(http)[0]!.body).toMatchObject({body: 'Я в синей куртке'});
  });
});

describe('C2: polling', () => {
  it('asks after the last sequence, and an overlapping answer adds no duplicate', async () => {
    const {http} = await mount({[MESSAGES]: [list(message(1, 'DRIVER', 'Подъезжаю')),
      list(message(1, 'DRIVER', 'Подъезжаю'), message(2, 'DRIVER', 'На месте')), list()]}, 50);
    expect(await screen.findByText('Водитель: На месте')).toBeTruthy();
    expect(screen.getAllByText('Водитель: Подъезжаю')).toHaveLength(1);
    await waitFor(() => expect(http.calls.filter(c => c.path.endsWith('/messages')).length).toBeGreaterThanOrEqual(3));
    const asks = http.calls.filter(c => c.method === 'GET' && c.path.endsWith('/messages'));
    expect(asks[0]!.query.get('after')).toBe('0');
    expect(asks[1]!.query.get('after')).toBe('1');
    expect(asks[2]!.query.get('after')).toBe('2');
  });
});

describe('C3: a send lost on the network', () => {
  it('keeps the text, offers a retry, and the retry is the same command', async () => {
    const {http} = await mount({[MESSAGES]: [list()], [SEND]: ['network', {status: 201,
      body: message(1, 'RIDER', 'Я у метро')}]});
    await fireEvent.changeText(await screen.findByLabelText('Сообщение'), 'Я у метро');
    await fireEvent.press(screen.getByRole('button', {name: 'Отправить'}));
    expect(await screen.findByText('Не отправлено.')).toBeTruthy();
    expect(screen.getByLabelText('Сообщение').props.value).toBe('Я у метро');
    await fireEvent.press(screen.getByRole('button', {name: 'Отправить'}));
    expect(await screen.findByText('Вы: Я у метро')).toBeTruthy();
    const sent = posts(http).map(c => (c.body as {command_id: string}).command_id);
    expect(sent).toHaveLength(2);
    expect(sent[1]).toBe(sent[0]);
  });

  it('a new text after a stored one is a new command', async () => {
    const {http} = await mount({[MESSAGES]: [list()], [SEND]: [{status: 201, body: message(1, 'RIDER', 'Раз')},
      {status: 201, body: message(2, 'RIDER', 'Два')}]});
    await fireEvent.changeText(await screen.findByLabelText('Сообщение'), 'Раз');
    await fireEvent.press(screen.getByRole('button', {name: 'Отправить'}));
    await screen.findByText('Вы: Раз');
    await fireEvent.changeText(screen.getByLabelText('Сообщение'), 'Два');
    await fireEvent.press(screen.getByRole('button', {name: 'Отправить'}));
    await screen.findByText('Вы: Два');
    const sent = posts(http).map(c => (c.body as {command_id: string}).command_id);
    expect(new Set(sent).size).toBe(2);
  });
});

describe('C4: a double tap on "send"', () => {
  it('is one message', async () => {
    const {http} = await mount({[MESSAGES]: [list()], [SEND]: [{status: 201, delayMs: 300,
      body: message(1, 'RIDER', 'Иду')}]});
    await fireEvent.changeText(await screen.findByLabelText('Сообщение'), 'Иду');
    const send = screen.getByRole('button', {name: 'Отправить'});
    await fireEvent.press(send);
    await fireEvent.press(send);
    expect(await screen.findByText('Вы: Иду')).toBeTruthy();
    expect(posts(http)).toHaveLength(1);
  });
});

describe('C5: the length', () => {
  it.each([['empty', '   '], ['1001 characters', 'я'.repeat(1001)]])('%s is refused at the field', async (_, text) => {
    const {http} = await mount({[MESSAGES]: [list()]});
    await fireEvent.changeText(await screen.findByLabelText('Сообщение'), text);
    await fireEvent.press(screen.getByRole('button', {name: 'Отправить'}));
    expect(await screen.findByText('Сообщение — от 1 до 1000 знаков.')).toBeTruthy();
    expect(posts(http)).toHaveLength(0);
  });
});

describe('C6: a closed chat', () => {
  it('a 409 says so and the field goes away', async () => {
    await mount({[MESSAGES]: [list(message(1, 'DRIVER', 'Спасибо за поездку'))],
      [SEND]: [problem(409, 'STATE_CONFLICT')]});
    await fireEvent.changeText(await screen.findByLabelText('Сообщение'), 'Забыл зонт');
    await fireEvent.press(screen.getByRole('button', {name: 'Отправить'}));
    expect(await screen.findByText('Чат закрыт. Напишите в поддержку.')).toBeTruthy();
    expect(screen.queryByLabelText('Сообщение')).toBeNull();
    expect(screen.getByText('Водитель: Спасибо за поездку')).toBeTruthy();
  });
});
