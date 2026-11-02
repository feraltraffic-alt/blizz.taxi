import {fireEvent, render, screen, waitFor} from '@testing-library/react-native';
import {createApiClient} from '@blizz/api-client';
import {RiderApp, type AppConfig} from '../src/App';

/** After a fulfilled ride (#254): rate the driver and leave a tip, R1–R8 of the issue. */
const cid = '10000000-0000-4000-8000-000000000001';
const session = {
  session_id: '10000000-0000-4000-8000-000000000002', subject: {type: 'CLIENT', id: '10000000-0000-4000-8000-000000000003'},
  audience: 'rider', access_token: 'test-only-access', refresh_token: 'test-only-refresh',
  access_expires_at: '2099-01-01T00:00:00Z', refresh_expires_at: '2099-01-01T00:00:00Z', password_change_required: false
};
const ID = '90000000-0000-4000-8000-000000000001';
const driver = {name: 'Іван', make: 'Skoda', model: 'Octavia', color: 'white', registration_number: 'AA0001TX'};
const riding = {id: ID, short_number: 7, status: 'IN_SERVICE', version: 4, price_minor: 12000, currency: 'UAH', driver};
const fulfilled = {...riding, status: 'FULFILLED', version: 5};
const options = (over: Record<string, unknown> = {}) => ({order_id: ID, currency: 'UAH', trip_cost_minor: 12000,
  presets: [{percent: 10, amount_minor: 1200}, {percent: 15, amount_minor: 1800}, {percent: 20, amount_minor: 2400},
    {percent: 25, amount_minor: 3000}], min_minor: 500, max_minor: 12000, method: 'CASH',
  available_until: '2026-11-02T12:00:00Z', open: true, tip: null, ...over});
const tip = (over: Record<string, unknown> = {}) => ({id: 'a0000000-0000-4000-8000-000000000001', order_id: ID,
  amount_minor: 1200, currency: 'UAH', method: 'CASH', state: 'RECORDED', failure_reason: null,
  created_at: '2026-11-02T10:30:00Z', ...over});
const rating = (score: number) => ({order_id: ID, score, created_at: '2026-11-02T10:31:00Z'});

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
    return new Response(answer.body === undefined ? null : JSON.stringify(answer.body),
      {status: answer.status, headers: {'Content-Type': 'application/json'}});
  });
  return {fetch: fetch as unknown as typeof globalThis.fetch, calls};
}

const problem = (status: number, code: string) => ({status, body: {type: 'about:blank', title: code, status, code,
  correlation_id: cid, retryable: false}});
const notRated = problem(404, 'NOT_FOUND');

/** A ride in progress on the server that the next poll finds fulfilled. */
async function mount(script: Record<string, Answer[]>) {
  const http = server({
    'GET /api/rider/v1/legal': [{status: 200, body: {documents: []}}],
    'GET /api/rider/v1/orders/current': [{status: 200, body: {orders: [riding]}}],
    'GET /api/rider/v1/cancel-reasons': [{status: 200, body: {reasons: []}}],
    ['GET /api/rider/v1/orders/' + ID]: [{status: 200, body: fulfilled}],
    ...script
  });
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: {read: () => null, write: () => {}},
    fetch: http.fetch, correlationId: () => cid, initialSession: session as never});
  const config: AppConfig = {service: 'default', deviceRef: 'test', pollMs: 50, locate: async () => ({lat: 50.45,
    lon: 30.52}), newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')};
  await render(<RiderApp client={client} config={config} />);
  expect(await screen.findByText('Поездка завершена')).toBeTruthy();
  return {http};
}

const posts = (http: {calls: Call[]}, end: string) => http.calls.filter(c => c.method === 'POST' && c.path.endsWith(end));

describe('R8: the plain success', () => {
  it('score 5 and a 10 % cash tip are thanked and told to hand over', async () => {
    const {http} = await mount({
      ['GET /api/rider/v1/orders/' + ID + '/rating']: [notRated],
      ['POST /api/rider/v1/orders/' + ID + '/rating']: [{status: 200, body: rating(5)}],
      ['GET /api/rider/v1/orders/' + ID + '/tip']: [{status: 200, body: options()}],
      ['POST /api/rider/v1/orders/' + ID + '/tip']: [{status: 201, body: tip()}]
    });
    await fireEvent.changeText(await screen.findByLabelText('Комментарий для службы'), 'Чисто и вовремя');
    await fireEvent.press(screen.getByRole('button', {name: 'Оценка 5'}));
    expect(await screen.findByText('Спасибо за оценку: 5')).toBeTruthy();
    expect(posts(http, '/rating')[0]!.body).toMatchObject({score: 5, comment: 'Чисто и вовремя'});
    await fireEvent.press(screen.getByRole('button', {name: '10 % — 12.00 UAH'}));
    expect(await screen.findByText('Чаевые 12.00 UAH: передайте их водителю наличными.')).toBeTruthy();
    expect(posts(http, '/tip')[0]!.body).toMatchObject({amount_minor: 1200});
    expect(screen.queryByRole('button', {name: '15 % — 18.00 UAH'})).toBeNull();
  });
});

describe('R1: a double tap on a score', () => {
  it('is one rating with one command id', async () => {
    const {http} = await mount({
      ['GET /api/rider/v1/orders/' + ID + '/rating']: [notRated],
      ['POST /api/rider/v1/orders/' + ID + '/rating']: [{status: 200, delayMs: 300, body: rating(4)}],
      ['GET /api/rider/v1/orders/' + ID + '/tip']: [{status: 200, body: options({open: false})}]
    });
    const four = await screen.findByRole('button', {name: 'Оценка 4'});
    await fireEvent.press(four);
    await fireEvent.press(four);
    expect(await screen.findByText('Спасибо за оценку: 4')).toBeTruthy();
    expect(posts(http, '/rating')).toHaveLength(1);
    expect((posts(http, '/rating')[0]!.body as {command_id: string}).command_id).toMatch(/^40000000-/);
  });
});

describe('R2: after the edit window', () => {
  it('a 409 is said so and the score given stays shown', async () => {
    await mount({
      ['GET /api/rider/v1/orders/' + ID + '/rating']: [{status: 200, body: rating(3)}],
      ['POST /api/rider/v1/orders/' + ID + '/rating']: [problem(409, 'STATE_CONFLICT')],
      ['GET /api/rider/v1/orders/' + ID + '/tip']: [{status: 200, body: options({open: false})}]
    });
    expect(await screen.findByText('Ваша оценка: 3')).toBeTruthy();
    await fireEvent.press(screen.getByRole('button', {name: 'Оценка 5'}));
    expect(await screen.findByText('Оценку уже нельзя изменить.')).toBeTruthy();
    expect(screen.getByText('Ваша оценка: 3')).toBeTruthy();
  });
});

describe('R3: an own tip amount', () => {
  it.each([['4', 'Чаевые — от 5.00 до 120.00 UAH.'], ['121', 'Чаевые — от 5.00 до 120.00 UAH.'],
    ['abc', 'Чаевые — от 5.00 до 120.00 UAH.']])('%s is refused at the field, before any request', async (amount, text) => {
    const {http} = await mount({
      ['GET /api/rider/v1/orders/' + ID + '/rating']: [notRated],
      ['GET /api/rider/v1/orders/' + ID + '/tip']: [{status: 200, body: options()}]
    });
    await fireEvent.changeText(await screen.findByLabelText('Своя сумма, UAH'), amount);
    await fireEvent.press(screen.getByRole('button', {name: 'Оставить чаевые'}));
    expect(await screen.findByText(text)).toBeTruthy();
    expect(posts(http, '/tip')).toHaveLength(0);
  });

  it('an amount within the bounds is sent in minor units', async () => {
    const {http} = await mount({
      ['GET /api/rider/v1/orders/' + ID + '/rating']: [notRated],
      ['GET /api/rider/v1/orders/' + ID + '/tip']: [{status: 200, body: options()}],
      ['POST /api/rider/v1/orders/' + ID + '/tip']: [{status: 201, body: tip({amount_minor: 2550})}]
    });
    await fireEvent.changeText(await screen.findByLabelText('Своя сумма, UAH'), '25.5');
    await fireEvent.press(screen.getByRole('button', {name: 'Оставить чаевые'}));
    expect(await screen.findByText('Чаевые 25.50 UAH: передайте их водителю наличными.')).toBeTruthy();
    expect(posts(http, '/tip')[0]!.body).toMatchObject({amount_minor: 2550});
  });
});

describe('R4: a double tap on a tip', () => {
  it('is one tip with one command id', async () => {
    const {http} = await mount({
      ['GET /api/rider/v1/orders/' + ID + '/rating']: [notRated],
      ['GET /api/rider/v1/orders/' + ID + '/tip']: [{status: 200, body: options()}],
      ['POST /api/rider/v1/orders/' + ID + '/tip']: [{status: 201, delayMs: 300, body: tip()}]
    });
    const preset = await screen.findByRole('button', {name: '10 % — 12.00 UAH'});
    await fireEvent.press(preset);
    await fireEvent.press(preset);
    expect(await screen.findByText('Чаевые 12.00 UAH: передайте их водителю наличными.')).toBeTruthy();
    expect(posts(http, '/tip')).toHaveLength(1);
  });
});

describe('R5: a card tip on its way', () => {
  it('PENDING reads the tip screen again until PAID', async () => {
    await mount({
      ['GET /api/rider/v1/orders/' + ID + '/rating']: [notRated],
      ['GET /api/rider/v1/orders/' + ID + '/tip']: [{status: 200, body: options({method: 'CARD'})},
        {status: 200, body: options({method: 'CARD', open: false, tip: tip({method: 'CARD', state: 'PENDING'})})},
        {status: 200, body: options({method: 'CARD', open: false, tip: tip({method: 'CARD', state: 'PAID'})})}],
      ['POST /api/rider/v1/orders/' + ID + '/tip']: [{status: 201, body: tip({method: 'CARD', state: 'PENDING'})}]
    });
    await fireEvent.press(await screen.findByRole('button', {name: '10 % — 12.00 UAH'}));
    expect(await screen.findByText('Чаевые 12.00 UAH: ждём ответа банка…')).toBeTruthy();
    expect(await screen.findByText('Чаевые 12.00 UAH оплачены картой. Спасибо!', {}, {timeout: 3_000})).toBeTruthy();
  });
});

describe('R6: a declined card tip, and one already left', () => {
  it('FAILED shows the reason and a new tip goes with a new command id', async () => {
    const {http} = await mount({
      ['GET /api/rider/v1/orders/' + ID + '/rating']: [notRated],
      ['GET /api/rider/v1/orders/' + ID + '/tip']: [{status: 200, body: options({method: 'CARD'})}],
      ['POST /api/rider/v1/orders/' + ID + '/tip']: [
        {status: 201, body: tip({method: 'CARD', state: 'FAILED', failure_reason: 'Недостаточно средств'})},
        {status: 201, body: tip({method: 'CARD', state: 'PAID', amount_minor: 1800})}]
    });
    await fireEvent.press(await screen.findByRole('button', {name: '10 % — 12.00 UAH'}));
    expect(await screen.findByText('Банк отклонил чаевые: Недостаточно средств')).toBeTruthy();
    await fireEvent.press(screen.getByRole('button', {name: '15 % — 18.00 UAH'}));
    expect(await screen.findByText('Чаевые 18.00 UAH оплачены картой. Спасибо!')).toBeTruthy();
    const sent = posts(http, '/tip').map(c => (c.body as {command_id: string}).command_id);
    expect(sent).toHaveLength(2);
    expect(new Set(sent).size).toBe(2);
  });

  it('a tip already left is shown and not offered again', async () => {
    await mount({
      ['GET /api/rider/v1/orders/' + ID + '/rating']: [{status: 200, body: rating(5)}],
      ['GET /api/rider/v1/orders/' + ID + '/tip']: [{status: 200, body: options({tip: tip()})}]
    });
    expect(await screen.findByText('Чаевые 12.00 UAH: передайте их водителю наличными.')).toBeTruthy();
    expect(screen.queryByRole('button', {name: '10 % — 12.00 UAH'})).toBeNull();
    expect(screen.queryByLabelText('Своя сумма, UAH')).toBeNull();
  });
});

describe('R7: no tip', () => {
  it.each([['a SERVICE order', {method: null}], ['a closed window', {open: false}]])('%s offers none', async (_, over) => {
    const {http} = await mount({
      ['GET /api/rider/v1/orders/' + ID + '/rating']: [notRated],
      ['GET /api/rider/v1/orders/' + ID + '/tip']: [{status: 200, body: options(over)}]
    });
    expect(await screen.findByRole('button', {name: 'Оценка 5'})).toBeTruthy();
    await waitFor(() => expect(http.calls.some(c => c.path.endsWith('/tip'))).toBe(true));
    await new Promise(resolve => setTimeout(resolve, 100));
    expect(screen.queryByRole('button', {name: '10 % — 12.00 UAH'})).toBeNull();
    expect(screen.queryByLabelText('Своя сумма, UAH')).toBeNull();
  });
});
