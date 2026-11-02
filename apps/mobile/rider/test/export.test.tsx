import {fireEvent, render, screen, waitFor} from '@testing-library/react-native';
import {createApiClient} from '@blizz/api-client';
import {Share} from 'react-native';
import {RiderApp, type AppConfig} from '../src/App';

/** A copy of my data (#330): X1–X6 of the issue. */
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

const CHALLENGE = 'POST /api/rider/v1/me/data-exports/challenge';
const ASK = 'POST /api/rider/v1/me/data-exports';
const LIST = 'GET /api/rider/v1/me/data-exports';
const EXP = 'e1000000-0000-4000-8000-000000000001';
const exp = (state: string, over: Record<string, unknown> = {}) => ({id: EXP, state, created_at: '2026-11-02T10:00:00Z',
  ready_at: state === 'READY' ? '2026-11-02T10:05:00Z' : null, expires_at: state === 'READY' ? '2026-11-09T10:05:00Z'
    : null, size_bytes: state === 'READY' ? 20480 : null, ...over});
const two = (n: number) => String(n).padStart(2, '0');
const dm = (iso: string) => {
  const d = new Date(iso);
  return two(d.getDate()) + '.' + two(d.getMonth() + 1) + ' ' + two(d.getHours()) + ':' + two(d.getMinutes());
};

async function mount(script: Record<string, Answer[]>, pollMs = 60_000) {
  const http = server({
    'GET /api/rider/v1/legal': [{status: 200, body: {documents: []}}],
    'GET /api/rider/v1/orders/current': [{status: 200, body: {orders: []}}],
    'GET /api/rider/v1/me': [{status: 200, body: {account_state: 'ACTIVE', phone: '+380671111111', name: 'Анна'}}],
    [LIST]: [{status: 200, body: {exports: []}}],
    [CHALLENGE]: [{status: 201, body: {challenge_id: 'ch1', expires_at: '2099-01-01T00:00:00Z',
      resend_available_at: '2026-11-02T10:01:00Z'}}],
    [ASK]: [{status: 202, body: exp('PENDING')}],
    ...script
  });
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: {read: () => null, write: () => {}},
    fetch: http.fetch, correlationId: () => cid, initialSession: session as never});
  const config: AppConfig = {service: 'default', deviceRef: 'test', pollMs, locate: async () => ({lat: 50.45,
    lon: 30.52}), newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')};
  await render(<RiderApp client={client} config={config} />);
  await fireEvent.press(await screen.findByRole('button', {name: 'Профиль'}));
  await fireEvent.press(await screen.findByRole('button', {name: 'Мои данные'}));
  return {http};
}
const posts = (http: {calls: Call[]}) => http.calls.filter(c => c.method === 'POST');
const lists = (http: {calls: Call[]}) => http.calls.filter(c => c.method === 'GET'
  && c.path === '/api/rider/v1/me/data-exports');

describe('X1: the list', () => {
  it('shows each copy with its state; a ready one with its last day and size', async () => {
    await mount({[LIST]: [{status: 200, body: {exports: [exp('READY'), exp('FAILED', {id: 'e2',
      created_at: '2026-10-30T09:00:00Z'})]}}]});
    expect(await screen.findByText(dm('2026-11-02T10:00:00Z') + ' · готова до ' + dm('2026-11-09T10:05:00Z')
      + ' · 20 КБ')).toBeTruthy();
    expect(screen.getByText(dm('2026-10-30T09:00:00Z') + ' · не удалась')).toBeTruthy();
  });
});

describe('X2: asking for a copy', () => {
  it('a code, then one command with it; the new copy appears', async () => {
    const {http} = await mount({[LIST]: [{status: 200, body: {exports: []}},
      {status: 200, body: {exports: [exp('PENDING')]}}]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Запросить копию данных'}));
    await fireEvent.changeText(await screen.findByLabelText('Код из сообщения'), '123456');
    await fireEvent.press(screen.getByRole('button', {name: 'Подтвердить запрос'}));
    expect(await screen.findByText(dm('2026-11-02T10:00:00Z') + ' · готовится')).toBeTruthy();
    expect(posts(http).map(c => [c.path, c.body])).toEqual([
      ['/api/rider/v1/me/data-exports/challenge', undefined],
      ['/api/rider/v1/me/data-exports', {command_id: expect.any(String), challenge_id: 'ch1', otp_code: '123456'}]]);
  });
});

describe('X3: refusals', () => {
  it.each([
    [409, 'STATE_CONFLICT', 'Копию можно запросить раз в сутки.'],
    [422, 'OTP_INVALID', 'Неверный код.'],
    [403, 'ACCOUNT_NOT_ACTIVE', 'Аккаунт не активен.']
  ])('a %s %s is told', async (status, code, text) => {
    await mount({[ASK]: [problem(status, code)]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Запросить копию данных'}));
    await fireEvent.changeText(await screen.findByLabelText('Код из сообщения'), '123456');
    await fireEvent.press(screen.getByRole('button', {name: 'Подтвердить запрос'}));
    expect(await screen.findByText(text)).toBeTruthy();
  });

  it('a 429 on the code tells when', async () => {
    await mount({[CHALLENGE]: [problem(429, 'RATE_LIMITED', {'Retry-After': '30'})]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Запросить копию данных'}));
    expect(await screen.findByText('Слишком часто, повторите через 30 с.')).toBeTruthy();
  });
});

describe('X4: while it is built', () => {
  it('the list is read again until no copy is pending or running', async () => {
    const {http} = await mount({[LIST]: [{status: 200, body: {exports: [exp('RUNNING')]}},
      {status: 200, body: {exports: [exp('RUNNING')]}}, {status: 200, body: {exports: [exp('READY')]}}]}, 40);
    expect(await screen.findByText(new RegExp('готова до'))).toBeTruthy();
    const settled = lists(http).length;
    await new Promise(resolve => setTimeout(resolve, 200));
    expect(lists(http).length).toBe(settled);
    expect(settled).toBe(3);
  });
});

describe('X5: sharing a ready copy', () => {
  it('downloads it once and opens the share sheet with its JSON', async () => {
    const share = jest.spyOn(Share, 'share').mockResolvedValue({action: 'sharedAction', activityType: undefined});
    const {http} = await mount({[LIST]: [{status: 200, body: {exports: [exp('READY')]}}],
      ['GET /api/rider/v1/me/data-exports/' + EXP + '/file']: [{status: 200, body: {sections: {profile: {name: 'Анна'}}}}]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Поделиться'}));
    await waitFor(() => expect(share).toHaveBeenCalledTimes(1));
    expect(JSON.parse((share.mock.calls[0]![0] as {message: string}).message))
      .toEqual({sections: {profile: {name: 'Анна'}}});
    expect(http.calls.filter(c => c.path.endsWith('/file'))).toHaveLength(1);
    share.mockRestore();
  });
});

describe('X6: the code', () => {
  it.each(['12', 'abcd'])('"%s" sends nothing', async bad => {
    const {http} = await mount({});
    await fireEvent.press(await screen.findByRole('button', {name: 'Запросить копию данных'}));
    await fireEvent.changeText(await screen.findByLabelText('Код из сообщения'), bad);
    await fireEvent.press(screen.getByRole('button', {name: 'Подтвердить запрос'}));
    expect(await screen.findByText('Код — от 4 до 8 цифр.')).toBeTruthy();
    expect(posts(http).map(c => c.path)).toEqual(['/api/rider/v1/me/data-exports/challenge']);
  });
});
