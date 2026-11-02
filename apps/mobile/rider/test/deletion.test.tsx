import {fireEvent, render, screen} from '@testing-library/react-native';
import {createApiClient} from '@blizz/api-client';
import {RiderApp, type AppConfig} from '../src/App';

/** Deleting the account and withdrawing the request (#336): A1–A5, A7. */
const cid = '10000000-0000-4000-8000-000000000001';
const session = {
  session_id: '10000000-0000-4000-8000-000000000002', subject: {type: 'CLIENT', id: '10000000-0000-4000-8000-000000000003'},
  audience: 'rider', access_token: 'test-only-access', refresh_token: 'test-only-refresh',
  access_expires_at: '2099-01-01T00:00:00Z', refresh_expires_at: '2099-01-01T00:00:00Z', password_change_required: false
};

type Call = {method: string; path: string; body?: unknown};
type Answer = {status: number; body?: unknown; delayMs?: number; headers?: Record<string, string>};

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
      {status: answer.status, headers: {'Content-Type': 'application/json', ...answer.headers}});
  });
  return {fetch: fetch as unknown as typeof globalThis.fetch, calls};
}
const problem = (status: number, code: string, headers?: Record<string, string>) => ({status, headers,
  body: {type: 'about:blank', title: code, status, code, correlation_id: cid, retryable: false}});

const CHALLENGE = 'POST /api/rider/v1/me/deletion-request/challenge';
const REQUEST = 'POST /api/rider/v1/me/deletion-request';
const CANCEL = 'POST /api/rider/v1/me/deletion-request/cancel';
const status = (state: string) => ({status: 200, body: {client_id: session.subject.id, account_state: state,
  requested_at: state === 'DELETION_PENDING' ? '2026-11-02T10:00:00Z' : null}});

async function mount(script: Record<string, Answer[]>, state = 'ACTIVE') {
  const http = server({
    'GET /api/rider/v1/legal': [{status: 200, body: {documents: []}}],
    'GET /api/rider/v1/orders/current': [{status: 200, body: {orders: []}}],
    'GET /api/rider/v1/me': [{status: 200, body: {account_state: state, phone: '+380671111111', name: 'Анна'}}],
    [CHALLENGE]: [{status: 201, body: {challenge_id: 'ch1', expires_at: '2099-01-01T00:00:00Z',
      resend_available_at: '2026-11-02T10:01:00Z'}}],
    [REQUEST]: [status('DELETION_PENDING')],
    [CANCEL]: [status('ACTIVE')],
    ...script
  });
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: {read: () => null, write: () => {}},
    fetch: http.fetch, correlationId: () => cid, initialSession: session as never});
  const config: AppConfig = {service: 'default', deviceRef: 'test', pollMs: 60_000, locate: async () => ({lat: 50.45,
    lon: 30.52}), newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')};
  await render(<RiderApp client={client} config={config} />);
  await fireEvent.press(await screen.findByRole('button', {name: 'Профиль'}));
  return {http};
}
const posts = (http: {calls: Call[]}) => http.calls.filter(c => c.method === 'POST');

async function request(code = '123456') {
  await fireEvent.press(await screen.findByRole('button', {name: 'Удалить аккаунт'}));
  await fireEvent.changeText(await screen.findByLabelText('Код подтверждения удаления'), code);
  await fireEvent.press(screen.getByRole('button', {name: 'Подтвердить удаление'}));
}

describe('A1: the request', () => {
  it('a code, then one request with it; the account is pending deletion', async () => {
    const {http} = await mount({});
    await request();
    expect(await screen.findByText('Запрос на удаление принят. Аккаунт удалят после проверки.')).toBeTruthy();
    expect(screen.getByRole('button', {name: 'Отменить удаление'})).toBeTruthy();
    expect(posts(http).map(c => [c.path, c.body])).toEqual([
      ['/api/rider/v1/me/deletion-request/challenge', undefined],
      ['/api/rider/v1/me/deletion-request', {command_id: expect.any(String), challenge_id: 'ch1',
        otp_code: '123456'}]]);
  });
});

describe('A2: withdrawing', () => {
  it('one cancel; the account is back', async () => {
    const {http} = await mount({}, 'DELETION_PENDING');
    await fireEvent.press(await screen.findByRole('button', {name: 'Отменить удаление'}));
    expect(await screen.findByText('Удаление отменено.')).toBeTruthy();
    expect(screen.getByRole('button', {name: 'Удалить аккаунт'})).toBeTruthy();
    expect(posts(http).map(c => [c.path, c.body])).toEqual([['/api/rider/v1/me/deletion-request/cancel',
      {command_id: expect.any(String)}]]);
  });
});

describe('A3: refusals', () => {
  it.each([
    [422, 'OTP_INVALID', 'Неверный код.'],
    [409, 'STATE_CONFLICT', 'Запрос уже подан или аккаунт сейчас нельзя удалить.']
  ])('a %s %s is told', async (s, code, text) => {
    await mount({[REQUEST]: [problem(s, code)]});
    await request();
    expect(await screen.findByText(text)).toBeTruthy();
  });

  it('a 429 on the code tells when', async () => {
    await mount({[CHALLENGE]: [problem(429, 'RATE_LIMITED', {'Retry-After': '15'})]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Удалить аккаунт'}));
    expect(await screen.findByText('Слишком часто, повторите через 15 с.')).toBeTruthy();
  });
});

describe('A4: the code', () => {
  it.each(['12', 'abcd'])('"%s" sends nothing', async bad => {
    const {http} = await mount({});
    await request(bad);
    expect(await screen.findByText('Код — от 4 до 8 цифр.')).toBeTruthy();
    expect(posts(http).map(c => c.path)).toEqual(['/api/rider/v1/me/deletion-request/challenge']);
  });
});

describe('A5: already pending', () => {
  it('shows the notice and the withdrawal, not the request', async () => {
    await mount({}, 'DELETION_PENDING');
    expect(await screen.findByText('Аккаунт будет удалён после проверки.')).toBeTruthy();
    expect(screen.queryByRole('button', {name: 'Удалить аккаунт'})).toBeNull();
  });
});

describe('A7: one at a time', () => {
  it('a double press requests once', async () => {
    const {http} = await mount({[REQUEST]: [{...status('DELETION_PENDING'), delayMs: 200}]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Удалить аккаунт'}));
    await fireEvent.changeText(await screen.findByLabelText('Код подтверждения удаления'), '123456');
    const confirm = screen.getByRole('button', {name: 'Подтвердить удаление'});
    await fireEvent.press(confirm);
    await fireEvent.press(confirm);
    expect(await screen.findByText('Запрос на удаление принят. Аккаунт удалят после проверки.')).toBeTruthy();
    expect(posts(http).filter(c => c.path === '/api/rider/v1/me/deletion-request')).toHaveLength(1);
  });
});
