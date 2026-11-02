import {fireEvent, render, screen, waitFor} from '@testing-library/react-native';
import {createApiClient} from '@blizz/api-client';
import {RiderApp, type AppConfig} from '../src/App';

/** Changing the phone number (#328): C1–C4 of the issue. */
const cid = '10000000-0000-4000-8000-000000000001';
const session = {
  session_id: '10000000-0000-4000-8000-000000000002', subject: {type: 'CLIENT', id: '10000000-0000-4000-8000-000000000003'},
  audience: 'rider', access_token: 'test-only-access', refresh_token: 'test-only-refresh',
  access_expires_at: '2099-01-01T00:00:00Z', refresh_expires_at: '2099-01-01T00:00:00Z', password_change_required: false
};
const CUR = 'c1000000-0000-4000-8000-000000000001';
const NEW = 'c2000000-0000-4000-8000-000000000002';
const code = (id: string) => ({status: 201, body: {challenge_id: id, expires_at: '2099-01-01T00:00:00Z',
  resend_available_at: '2026-11-02T10:01:00Z'}});

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

const CURRENT = 'POST /api/rider/v1/me/phone-change/current-code';
const NEWCODE = 'POST /api/rider/v1/me/phone-change/new-code';
const CHANGE = 'POST /api/rider/v1/me/phone-change';

async function mount(script: Record<string, Answer[]>) {
  const http = server({
    'GET /api/rider/v1/legal': [{status: 200, body: {documents: []}}],
    'GET /api/rider/v1/orders/current': [{status: 200, body: {orders: []}}],
    'GET /api/rider/v1/me': [{status: 200, body: {account_state: 'ACTIVE', phone: '+380671111111', name: 'Анна'}}],
    [CURRENT]: [code(CUR)], [NEWCODE]: [code(NEW)],
    [CHANGE]: [{status: 200, body: {subject_id: session.subject.id, phone: '+380672222222', version: 2}}],
    ...script
  });
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: {read: () => null, write: () => {}},
    fetch: http.fetch, correlationId: () => cid, initialSession: session as never});
  const config: AppConfig = {service: 'default', deviceRef: 'test', pollMs: 60_000, locate: async () => ({lat: 50.45,
    lon: 30.52}), newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')};
  await render(<RiderApp client={client} config={config} />);
  await fireEvent.press(await screen.findByRole('button', {name: 'Профиль'}));
  await fireEvent.press(await screen.findByRole('button', {name: 'Сменить номер'}));
  return {http};
}
const posts = (http: {calls: Call[]}) => http.calls.filter(c => c.method === 'POST');

/** Steps 1–3 with the given inputs. */
async function walk(opts: {phone?: string; current?: string; next?: string} = {}) {
  await fireEvent.press(await screen.findByRole('button', {name: 'Код на текущий номер'}));
  await fireEvent.changeText(await screen.findByLabelText('Код с текущего номера'), opts.current ?? '1111');
  await fireEvent.changeText(screen.getByLabelText('Новый номер'), opts.phone ?? '+380672222222');
  await fireEvent.press(screen.getByRole('button', {name: 'Код на новый номер'}));
}

describe('C1: the plain change', () => {
  it('both codes, one command, the new number shown', async () => {
    const {http} = await mount({});
    await walk();
    await fireEvent.changeText(await screen.findByLabelText('Код с нового номера'), '2222');
    await fireEvent.press(screen.getByRole('button', {name: 'Сменить номер'}));
    expect(await screen.findByText('Номер изменён на +380672222222.')).toBeTruthy();
    expect(posts(http).map(c => [c.path, c.body])).toEqual([
      ['/api/rider/v1/me/phone-change/current-code', undefined],
      ['/api/rider/v1/me/phone-change/new-code', {phone: '+380672222222'}],
      ['/api/rider/v1/me/phone-change', {command_id: expect.any(String), current_challenge_id: CUR,
        current_code: '1111', new_challenge_id: NEW, new_code: '2222'}]]);
  });
});

describe('C2: refused on the phone', () => {
  it('a number that is not international sends no code', async () => {
    const {http} = await mount({});
    await walk({phone: '0672222222'});
    expect(await screen.findByText('Номер в формате +380XXXXXXXXX.')).toBeTruthy();
    expect(posts(http).map(c => c.path)).toEqual(['/api/rider/v1/me/phone-change/current-code']);
  });

  it.each(['12', 'abcd', '123456789'])('a code "%s" sends no change', async bad => {
    const {http} = await mount({});
    await walk();
    await fireEvent.changeText(await screen.findByLabelText('Код с нового номера'), bad);
    await fireEvent.press(screen.getByRole('button', {name: 'Сменить номер'}));
    expect(await screen.findByText('Код — от 4 до 8 цифр.')).toBeTruthy();
    expect(posts(http).filter(c => c.path === '/api/rider/v1/me/phone-change')).toEqual([]);
  });
});

describe('C3: refusals told', () => {
  it('a 409 on the new code: it is the current number', async () => {
    await mount({[NEWCODE]: [problem(409, 'STATE_CONFLICT')]});
    await walk({phone: '+380671111111'});
    expect(await screen.findByText('Это ваш текущий номер.')).toBeTruthy();
  });

  it.each([
    [409, 'STATE_CONFLICT', 'Этот номер уже у другого аккаунта.'],
    [422, 'OTP_INVALID', 'Неверный код.'],
    [403, 'ACCOUNT_NOT_ACTIVE', 'Аккаунт не активен.']
  ])('a %s %s on the change', async (status, errorCode, text) => {
    await mount({[CHANGE]: [problem(status, errorCode)]});
    await walk();
    await fireEvent.changeText(await screen.findByLabelText('Код с нового номера'), '2222');
    await fireEvent.press(screen.getByRole('button', {name: 'Сменить номер'}));
    expect(await screen.findByText(text)).toBeTruthy();
  });

  it('a 429 tells when to try again', async () => {
    await mount({[CURRENT]: [problem(429, 'RATE_LIMITED', {'Retry-After': '42'})]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Код на текущий номер'}));
    expect(await screen.findByText('Слишком часто, повторите через 42 с.')).toBeTruthy();
  });
});

describe('C4: one at a time', () => {
  it('a double press changes once', async () => {
    const {http} = await mount({[CHANGE]: [{status: 200, delayMs: 200, body: {subject_id: session.subject.id,
      phone: '+380672222222', version: 2}}]});
    await walk();
    await fireEvent.changeText(await screen.findByLabelText('Код с нового номера'), '2222');
    const button = screen.getByRole('button', {name: 'Сменить номер'});
    await fireEvent.press(button);
    await fireEvent.press(button);
    expect(await screen.findByText('Номер изменён на +380672222222.')).toBeTruthy();
    await waitFor(() => expect(posts(http).filter(c => c.path === '/api/rider/v1/me/phone-change')).toHaveLength(1));
  });
});
