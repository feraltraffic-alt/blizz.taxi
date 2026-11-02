import {fireEvent, render, screen, waitFor} from '@testing-library/react-native';
import {createApiClient} from '@blizz/api-client';
import {DriverApp, type AppConfig} from '../src/App';

/** The driver's support cases (#298): S2–S5 of the issue. */
const cid = '10000000-0000-4000-8000-000000000001';
const session = {
  session_id: '10000000-0000-4000-8000-000000000002', subject: {type: 'DRIVER', id: '10000000-0000-4000-8000-000000000003'},
  audience: 'driver', access_token: 'test-only-access', refresh_token: 'test-only-refresh',
  access_expires_at: '2099-01-01T00:00:00Z', refresh_expires_at: '2099-01-01T00:00:00Z', password_change_required: false
};
const admitted = {id: session.subject.id, account_state: 'ACTIVE', review_status: 'APPROVED',
  admission_city_ids: ['50000000-0000-4000-8000-000000000001'], has_payment_terminal: false, version: 3,
  vehicles: [{id: 'v1', registration_number: 'AA1', make: 'Skoda', model: 'Octavia', color: 'white',
    production_year: 2019, state: 'APPROVED', class_approvals: []}], documents: []};
const CASE = 'c0000000-0000-4000-8000-000000000001';
const msg = (n: number, author: string, body: string) => ({id: 'e000000' + n + '-0000-4000-8000-000000000001',
  sequence: n, author_type: author, author_id: null, visibility: 'PUBLIC', body,
  created_at: '2026-11-02T10:0' + n + ':00Z', attachments: []});
const full = (over: Record<string, unknown> = {}) => ({id: CASE, number: 77, city_id: null, category: 'CASH_DISPUTE',
  order_id: null, requester_type: 'DRIVER', requester_id: null, subject: 'Не доплатил', priority: 'NORMAL',
  state: 'OPEN', assigned_staff_id: null, resolution: null, respond_by: '2026-11-02T14:00:00Z', version: 1,
  created_at: '2026-11-02T10:00:00Z', updated_at: '2026-11-02T10:00:00Z',
  messages: [msg(1, 'DRIVER', 'Пассажир не доплатил'), msg(2, 'STAFF', 'Разбираемся')], ...over});

type Call = {method: string; path: string; body?: unknown};
type Answer = {status: number; body?: unknown};

async function mount(script: Record<string, Answer[]>, profile: unknown = admitted) {
  const calls: Call[] = [];
  const all: Record<string, Answer[]> = {
    'GET /api/driver/v1/legal': [{status: 200, body: {documents: []}}],
    'GET /api/driver/v1/profile': [{status: 200, body: profile}],
    'GET /api/driver/v1/work-sessions/current': [{status: 200, body: {driver_id: session.subject.id, session_id: null,
      session_version: 0, session_state: 'CLOSED'}}],
    'GET /api/driver/v1/support/cases': [{status: 200, body: {cases: [full({messages: []})],
      page: {next_cursor: null, has_more: false}}}],
    ['GET /api/driver/v1/support/cases/' + CASE]: [{status: 200, body: full()}],
    ...script};
  const fetch = jest.fn(async (url: string, init: RequestInit) => {
    const path = new URL(url).pathname;
    const method = String(init.method);
    calls.push({method, path, body: init.body ? JSON.parse(String(init.body)) : undefined});
    const answers = all[method + ' ' + path] ?? [{status: 404, body: {code: 'NOT_FOUND', correlation_id: cid}}];
    const answer = answers.length > 1 ? answers.shift()! : answers[0]!;
    return new Response(answer.body === undefined ? null : JSON.stringify(answer.body),
      {status: answer.status, headers: {'Content-Type': 'application/json'}});
  });
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: {read: () => null, write: () => {}},
    fetch: fetch as unknown as typeof globalThis.fetch, correlationId: () => cid, initialSession: session as never});
  const config: AppConfig = {service: 'default', deviceRef: 'test-driver', now: () => Date.parse('2026-11-02T10:00:00Z'),
    heartbeatMs: 60_000, pollMs: 60_000, locate: async () => ({lat: 50.45, lon: 30.52, accuracy_m: 8}),
    newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')};
  await render(<DriverApp client={client} config={config} />);
  await fireEvent.press(await screen.findByRole('button', {name: 'Поддержка'}));
  return {calls};
}

describe('S2: the driver\'s list', () => {
  it('reads the driver API', async () => {
    const {calls} = await mount({});
    expect(await screen.findByRole('button', {name: '№77 · Не доплатил · открыто'})).toBeTruthy();
    expect(calls.some(c => c.method === 'GET' && c.path === '/api/driver/v1/support/cases')).toBe(true);
  });
});

describe('S3: the driver\'s categories', () => {
  it('rider behaviour yes, driver behaviour and the system ones no', async () => {
    await mount({});
    await fireEvent.press(await screen.findByRole('button', {name: 'Новое обращение'}));
    for (const name of ['Потерянная вещь', 'Оплата', 'Спор о наличных', 'Поведение пассажира', 'Безопасность',
      'Проблема с приложением', 'Другое']) expect(screen.getByRole('button', {name})).toBeTruthy();
    for (const name of ['Поведение водителя', 'Проверка поездки', 'Не нашлось водителя', 'Потеря связи',
      'Оплата не подтверждена']) expect(screen.queryByRole('button', {name})).toBeNull();
  });
});

describe('S4: a new case and an answer', () => {
  it('posts to the driver API with the contract bodies; my messages are mine', async () => {
    const {calls} = await mount({'POST /api/driver/v1/support/cases': [{status: 200, body: full()}],
      ['POST /api/driver/v1/support/cases/' + CASE + '/messages']: [{status: 200, body: full({messages: [
        msg(1, 'DRIVER', 'Пассажир не доплатил'), msg(2, 'STAFF', 'Разбираемся'), msg(3, 'DRIVER', 'Жду')]})}]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Новое обращение'}));
    await fireEvent.press(screen.getByRole('button', {name: 'Спор о наличных'}));
    await fireEvent.changeText(screen.getByLabelText('Тема'), 'Не доплатил');
    await fireEvent.changeText(screen.getByLabelText('Сообщение'), 'Пассажир не доплатил');
    await fireEvent.press(screen.getByRole('button', {name: 'Отправить обращение'}));
    expect(await screen.findByText('Вы: Пассажир не доплатил')).toBeTruthy();
    expect(screen.getByText('Поддержка: Разбираемся')).toBeTruthy();
    await fireEvent.changeText(screen.getByLabelText('Ваш ответ'), 'Жду');
    await fireEvent.press(screen.getByRole('button', {name: 'Ответить'}));
    expect(await screen.findByText('Вы: Жду')).toBeTruthy();
    expect(calls.filter(c => c.method === 'POST').map(c => [c.path, c.body])).toEqual([
      ['/api/driver/v1/support/cases', {command_id: expect.any(String), category: 'CASH_DISPUTE',
        subject: 'Не доплатил', message: 'Пассажир не доплатил'}],
      ['/api/driver/v1/support/cases/' + CASE + '/messages', {command_id: expect.any(String), message: 'Жду'}]]);
  });
});

describe('S5: a blocked driver', () => {
  it('still has support', async () => {
    await mount({}, {...admitted, account_state: 'BLOCKED', review_status: 'SUSPENDED'});
    expect(await screen.findByRole('button', {name: '№77 · Не доплатил · открыто'})).toBeTruthy();
  });
});
