import {fireEvent, render, screen, waitFor} from '@testing-library/react-native';
import {createApiClient} from '@blizz/api-client';
import {RiderApp, type AppConfig} from '../src/App';

/** The rider's support cases (#296): P1–P6 of the issue. */
const cid = '10000000-0000-4000-8000-000000000001';
const session = {
  session_id: '10000000-0000-4000-8000-000000000002', subject: {type: 'CLIENT', id: '10000000-0000-4000-8000-000000000003'},
  audience: 'rider', access_token: 'test-only-access', refresh_token: 'test-only-refresh',
  access_expires_at: '2099-01-01T00:00:00Z', refresh_expires_at: '2099-01-01T00:00:00Z', password_change_required: false
};
const ID = '90000000-0000-4000-8000-000000000001';

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
const CASE = 'c0000000-0000-4000-8000-000000000001';
const one = (over: Record<string, unknown> = {}) => ({id: CASE, number: 501, city_id: null, category: 'LOST_ITEM',
  order_id: null, requester_type: 'CLIENT', requester_id: null, subject: 'Забыл зонт', priority: 'NORMAL',
  state: 'IN_PROGRESS', assigned_staff_id: null, resolution: null, respond_by: '2026-11-02T14:00:00Z', version: 2,
  created_at: '2026-11-02T10:00:00Z', updated_at: '2026-11-02T10:00:00Z', messages: [], ...over});
const msg = (n: number, author: string, body: string) => ({id: 'e000000' + n + '-0000-4000-8000-000000000001',
  sequence: n, author_type: author, author_id: null, visibility: 'PUBLIC', body, created_at: '2026-11-02T10:0' + n
  + ':00Z', attachments: []});
const full = (over: Record<string, unknown> = {}) => one({messages: [msg(1, 'CLIENT', 'Оставил зонт в машине'),
  msg(2, 'STAFF', 'Уточняем у водителя')], ...over});
const list = (cases: unknown[], next: string | null = null) => ({status: 200, body: {cases,
  page: {next_cursor: next, has_more: next !== null}}});
const CASES = 'GET /api/rider/v1/support/cases';
const ONE = 'GET /api/rider/v1/support/cases/' + CASE;

async function mount(script: Record<string, Answer[]>, entry = 'Поддержка') {
  const http = server({
    'GET /api/rider/v1/legal': [{status: 200, body: {documents: []}}],
    'GET /api/rider/v1/orders/current': [{status: 200, body: {orders: []}}],
    [CASES]: [list([one()])],
    [ONE]: [{status: 200, body: full()}],
    ...script
  });
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: {read: () => null, write: () => {}},
    fetch: http.fetch, correlationId: () => cid, initialSession: session as never});
  const config: AppConfig = {service: 'default', deviceRef: 'test', pollMs: 60_000, locate: async () => ({lat: 50.45,
    lon: 30.52}), newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')};
  await render(<RiderApp client={client} config={config} />);
  await fireEvent.press(await screen.findByRole('button', {name: entry}));
  return {http};
}
const posts = (http: {calls: Call[]}) => http.calls.filter(c => c.method === 'POST');

async function fillCase(category = 'Потерянная вещь', subject = 'Забыл зонт', message = 'Оставил зонт в машине') {
  await fireEvent.press(await screen.findByRole('button', {name: 'Новое обращение'}));
  if (category) await fireEvent.press(screen.getByRole('button', {name: category}));
  await fireEvent.changeText(screen.getByLabelText('Тема'), subject);
  await fireEvent.changeText(screen.getByLabelText('Сообщение'), message);
}

describe('P1: my cases', () => {
  it('lists number, subject and state; "more" reads the next page once', async () => {
    const {http} = await mount({[CASES]: [list([one()], 'cursor-2'),
      {status: 200, delayMs: 200, body: {cases: [one({id: 'c2', number: 500, subject: 'Оплата', state: 'CLOSED'})],
        page: {next_cursor: null, has_more: false}}}]});
    expect(await screen.findByRole('button', {name: '№501 · Забыл зонт · в работе'})).toBeTruthy();
    const more = screen.getByRole('button', {name: 'Ещё'});
    await fireEvent.press(more);
    await fireEvent.press(more);
    expect(await screen.findByRole('button', {name: '№500 · Оплата · закрыто'})).toBeTruthy();
    expect(http.calls.filter(c => c.path === '/api/rider/v1/support/cases' && c.query.get('cursor') === 'cursor-2'))
      .toHaveLength(1);
  });

  it('says when there are none', async () => {
    await mount({[CASES]: [list([])]});
    expect(await screen.findByText('Обращений пока нет.')).toBeTruthy();
  });
});

describe('P2: a new case', () => {
  it('only the requester categories, one POST, then the case opens', async () => {
    const {http} = await mount({'POST /api/rider/v1/support/cases': [{status: 200, body: full()}]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Новое обращение'}));
    for (const name of ['Потерянная вещь', 'Оплата', 'Спор о наличных', 'Поведение водителя', 'Безопасность',
      'Проблема с приложением', 'Другое']) expect(screen.getByRole('button', {name})).toBeTruthy();
    for (const name of ['Проверка поездки', 'Не нашлось водителя', 'Потеря связи', 'Оплата не подтверждена',
      'Поведение пассажира']) expect(screen.queryByRole('button', {name})).toBeNull();
    await fireEvent.press(screen.getByRole('button', {name: 'Потерянная вещь'}));
    await fireEvent.changeText(screen.getByLabelText('Тема'), 'Забыл зонт');
    await fireEvent.changeText(screen.getByLabelText('Сообщение'), 'Оставил зонт в машине');
    await fireEvent.press(screen.getByRole('button', {name: 'Отправить обращение'}));
    expect(await screen.findByText('Поддержка: Уточняем у водителя')).toBeTruthy();
    expect(posts(http).map(c => c.body)).toEqual([{command_id: expect.any(String), category: 'LOST_ITEM',
      subject: 'Забыл зонт', message: 'Оставил зонт в машине'}]);
  });
});

describe('P3: refused on the phone', () => {
  it.each([['no category', '', 'Тема', 'Текст'], ['an empty subject', 'Оплата', '', 'Текст'],
    ['a subject over 200', 'Оплата', 'я'.repeat(201), 'Текст'], ['an empty message', 'Оплата', 'Тема', ''],
    ['a message over 4000', 'Оплата', 'Тема', 'я'.repeat(4001)]])('%s sends nothing', async (_n, c, s, m) => {
    const {http} = await mount({});
    await fillCase(c, s, m);
    await fireEvent.press(screen.getByRole('button', {name: 'Отправить обращение'}));
    expect(await screen.findByText('Выберите тему обращения, напишите заголовок до 200 и текст до 4000 символов.'))
      .toBeTruthy();
    expect(posts(http)).toEqual([]);
  });
});

describe('P4: from an order', () => {
  it('a history order opens a new case with its order_id', async () => {
    const ORDER = '90000000-0000-4000-8000-000000000001';
    const {http} = await mount({
      'GET /api/rider/v1/orders': [{status: 200, body: {items: [{id: ORDER, short_number: 1041, status: 'CANCELLED',
        created_at: '2026-11-01T08:31:00Z', pickup_label: 'Майдан', dropoff_label: 'Вокзал', price_minor: 12000,
        final_price_minor: null, currency: 'UAH', driver: null, chat_available: false}], page: {next_cursor: null}}}],
      'POST /api/rider/v1/support/cases': [{status: 200, body: full({order_id: ORDER})}]}, 'Мои поездки');
    await fireEvent.press(await screen.findByRole('button', {name: 'Майдан → Вокзал'}));
    await fireEvent.press(screen.getByRole('button', {name: 'Написать в поддержку'}));
    expect(screen.getByText('По заказу № 1041')).toBeTruthy();
    await fireEvent.press(screen.getByRole('button', {name: 'Оплата'}));
    await fireEvent.changeText(screen.getByLabelText('Тема'), 'Списали дважды');
    await fireEvent.changeText(screen.getByLabelText('Сообщение'), 'Проверьте, пожалуйста');
    await fireEvent.press(screen.getByRole('button', {name: 'Отправить обращение'}));
    await waitFor(() => expect(posts(http)).toHaveLength(1));
    expect(posts(http)[0]!.body).toEqual({command_id: expect.any(String), category: 'PAYMENT', order_id: ORDER,
      subject: 'Списали дважды', message: 'Проверьте, пожалуйста'});
  });
});

describe('P5: a case', () => {
  it('shows the messages and answers with a command id', async () => {
    const {http} = await mount({'POST /api/rider/v1/support/cases/' + CASE + '/messages': [{status: 200,
      body: full({messages: [msg(1, 'CLIENT', 'Оставил зонт в машине'), msg(2, 'STAFF', 'Уточняем у водителя'),
        msg(3, 'CLIENT', 'Спасибо')]})}]});
    await fireEvent.press(await screen.findByRole('button', {name: '№501 · Забыл зонт · в работе'}));
    expect(await screen.findByText('Вы: Оставил зонт в машине')).toBeTruthy();
    expect(screen.getByText('Поддержка: Уточняем у водителя')).toBeTruthy();
    await fireEvent.changeText(screen.getByLabelText('Ваш ответ'), 'Спасибо');
    await fireEvent.press(screen.getByRole('button', {name: 'Ответить'}));
    expect(await screen.findByText('Вы: Спасибо')).toBeTruthy();
    expect(posts(http).map(c => c.body)).toEqual([{command_id: expect.any(String), message: 'Спасибо'}]);
  });

  it('a closed case offers no answer', async () => {
    await mount({[ONE]: [{status: 200, body: full({state: 'CLOSED'})}]});
    await fireEvent.press(await screen.findByRole('button', {name: '№501 · Забыл зонт · в работе'}));
    expect(await screen.findByText('Вы: Оставил зонт в машине')).toBeTruthy();
    expect(screen.queryByRole('button', {name: 'Ответить'})).toBeNull();
    expect(screen.getByText('Обращение закрыто.')).toBeTruthy();
  });

  it('a 409 says the case is closed and reads it again', async () => {
    const {http} = await mount({'POST /api/rider/v1/support/cases/' + CASE + '/messages': [problem(409, 'CONFLICT')],
      [ONE]: [{status: 200, body: full()}, {status: 200, body: full({state: 'CLOSED'})}]});
    await fireEvent.press(await screen.findByRole('button', {name: '№501 · Забыл зонт · в работе'}));
    await fireEvent.changeText(await screen.findByLabelText('Ваш ответ'), 'Ещё вопрос');
    await fireEvent.press(screen.getByRole('button', {name: 'Ответить'}));
    expect(await screen.findByText('Обращение закрыто.')).toBeTruthy();
    expect(http.calls.filter(c => c.method === 'GET' && c.path === '/api/rider/v1/support/cases/' + CASE))
      .toHaveLength(2);
  });
});

describe('P6: one action at a time', () => {
  it('a double press opens one case', async () => {
    const {http} = await mount({'POST /api/rider/v1/support/cases': [{status: 200, delayMs: 200, body: full()}]});
    await fillCase();
    const send = screen.getByRole('button', {name: 'Отправить обращение'});
    await fireEvent.press(send);
    await fireEvent.press(send);
    expect(await screen.findByText('Поддержка: Уточняем у водителя')).toBeTruthy();
    expect(posts(http)).toHaveLength(1);
  });
});
