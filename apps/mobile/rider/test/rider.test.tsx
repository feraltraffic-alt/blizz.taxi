import {act, fireEvent, render, screen, waitFor} from '@testing-library/react-native';
import {createApiClient, type RefreshTokenStore} from '@blizz/api-client';
import {RiderApp, type AppConfig} from '../src/App';
import {secureRefreshTokens, type SecureStore} from '@blizz/mobile-ui';
import {translations, validateCatalogs} from '../src/i18n';

const cid = '10000000-0000-4000-8000-000000000001';
const session = {
  session_id: '10000000-0000-4000-8000-000000000002', subject: {type: 'CLIENT', id: '10000000-0000-4000-8000-000000000003'},
  audience: 'rider', access_token: 'test-only-access', refresh_token: 'test-only-refresh',
  access_expires_at: '2099-01-01T00:00:00Z', refresh_expires_at: '2099-01-01T00:00:00Z', password_change_required: false
};
const NOW = Date.parse('2026-11-02T10:00:00Z');
const challenge = {challenge_id: '20000000-0000-4000-8000-000000000001', expires_at: '2026-11-02T10:05:00Z',
  resend_available_at: '2026-11-02T10:01:00Z', channel: 'SMS'};
const terms = {version_id: '30000000-0000-4000-8000-000000000001', audience: 'RIDER', kind: 'TERMS', number: 1,
  acceptance_required: true, accepted: false, effective_from: '2026-01-01T00:00:00Z', languages: ['ru', 'uk']};

type Call = {method: string; path: string; body?: unknown; headers: Record<string, string>};
type Answer = {status: number; body?: unknown; headers?: Record<string, string>; delayMs?: number} | 'network';

/** A scripted server: each path gets its answers in turn (the last one repeats); every request is recorded. */
function server(script: Record<string, Answer[]>) {
  const calls: Call[] = [];
  const fetch = jest.fn(async (url: string, init: RequestInit) => {
    const path = new URL(url).pathname;
    const method = String(init.method);
    calls.push({method, path, body: init.body ? JSON.parse(String(init.body)) : undefined,
      headers: init.headers as Record<string, string>});
    const answers = script[method + ' ' + path] ?? [{status: 404, body: {code: 'NOT_FOUND', correlation_id: cid}}];
    const answer = answers.length > 1 ? answers.shift()! : answers[0]!;
    if (answer === 'network') throw new TypeError('Network request failed');
    if (answer.delayMs) await new Promise(resolve => setTimeout(resolve, answer.delayMs));
    return new Response(answer.body === undefined ? null : JSON.stringify(answer.body), {
      status: answer.status, headers: {'Content-Type': 'application/json', ...(answer.headers ?? {})}
    });
  });
  return {fetch: fetch as unknown as typeof globalThis.fetch, calls};
}

function memory(initial: string | null = null): RefreshTokenStore & {value: string | null} {
  const store = {value: initial, read: () => store.value, write: (v: string | null) => {store.value = v;}};
  return store;
}

const problem = (status: number, code: string) => ({status, body: {type: 'about:blank', title: code, status, code,
  correlation_id: cid, retryable: false}});

async function mount(script: Record<string, Answer[]>, options: {tokens?: RefreshTokenStore; signedIn?: boolean;
  now?: () => number} = {}) {
  const http = server(script);
  const tokens = options.tokens ?? memory();
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: tokens, fetch: http.fetch,
    correlationId: () => cid, initialSession: options.signedIn ? session as never : undefined});
  const config: AppConfig = {service: 'default', deviceRef: 'test-device', now: options.now ?? (() => NOW),
    newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')};
  await render(<RiderApp client={client} config={config} />);
  return {http, tokens, client};
}

async function askCode(phone: string) {
  await fireEvent.changeText(await screen.findByLabelText('Номер телефона'), phone);
  await fireEvent.press(screen.getByRole('button', {name: 'Получить код'}));
}

const legalNone = {'GET /api/rider/v1/legal': [{status: 200, body: {documents: []}}]};
const meOk = {'GET /api/rider/v1/me': [{status: 200, body: {subject_type: 'CLIENT', subject_id: session.subject.id,
  session_id: session.session_id, account_state: 'ACTIVE', phone: '+380671234567', name: 'Олена'}}]};

describe('E1: the phone number', () => {
  it('a number outside Poland and Ukraine is the server\'s PHONE_COUNTRY_NOT_SERVED', async () => {
    await mount({'POST /auth/v1/otp/challenges': [problem(422, 'PHONE_COUNTRY_NOT_SERVED')]});
    await askCode('+4915112345678');
    expect(await screen.findByText('Мы пока не работаем с номерами этой страны.')).toBeTruthy();
  });

  it('a number that is too short is a 400 shown at the field', async () => {
    await mount({'POST /auth/v1/otp/challenges': [problem(400, 'VALIDATION_FAILED')]});
    await askCode('+380');
    expect(await screen.findByText('Проверьте номер: он слишком короткий.')).toBeTruthy();
  });
});

describe('E2: the code', () => {
  it('a wrong code says so and keeps the screen', async () => {
    await mount({'POST /auth/v1/otp/challenges': [{status: 201, body: challenge}],
      'POST /auth/v1/otp/verify': [problem(400, 'OTP_INVALID')]});
    await askCode('+380671234567');
    await fireEvent.changeText(await screen.findByLabelText('Код из сообщения'), '123456');
    await fireEvent.press(screen.getByRole('button', {name: 'Подтвердить'}));
    expect(await screen.findByText('Неверный код.')).toBeTruthy();
    expect(screen.getByLabelText('Код из сообщения')).toBeTruthy();
  });

  it('an expired challenge offers a new code and sends nothing', async () => {
    let now = NOW;
    const {http} = await mount({'POST /auth/v1/otp/challenges': [{status: 201, body: challenge}]}, {now: () => now});
    await askCode('+380671234567');
    await fireEvent.changeText(await screen.findByLabelText('Код из сообщения'), '123456');
    now = Date.parse(challenge.expires_at) + 1000;
    await fireEvent.press(screen.getByRole('button', {name: 'Подтвердить'}));
    expect(await screen.findByText('Срок действия кода истёк. Получите новый код.')).toBeTruthy();
    expect(http.calls.filter(c => c.path === '/auth/v1/otp/verify')).toHaveLength(0);
    expect(screen.getByRole('button', {name: 'Отправить код ещё раз'})).toBeTruthy();
  });

  it('a right code signs in and opens the profile', async () => {
    const {tokens} = await mount({'POST /auth/v1/otp/challenges': [{status: 201, body: challenge}],
      'POST /auth/v1/otp/verify': [{status: 200, body: session}], ...legalNone, ...meOk});
    await askCode('+380671234567');
    await fireEvent.changeText(await screen.findByLabelText('Код из сообщения'), '123456');
    await fireEvent.press(screen.getByRole('button', {name: 'Подтвердить'}));
    expect(await screen.findByText(/ACTIVE/)).toBeTruthy();
    expect(screen.getByText('Олена')).toBeTruthy();
    expect(screen.getByText('+380671234567')).toBeTruthy();
    expect(tokens.read()).toBe(session.refresh_token);
  });
});

describe('E3: resending', () => {
  it('the resend waits for resend_available_at', async () => {
    let now = NOW;
    const {http} = await mount({'POST /auth/v1/otp/challenges': [{status: 201, body: challenge}]}, {now: () => now});
    await askCode('+380671234567');
    expect(await screen.findByText('Новый код через 60 с')).toBeTruthy();
    const resend = screen.getByRole('button', {name: 'Отправить код ещё раз'});
    expect(resend.props.accessibilityState.disabled).toBe(true);
    await fireEvent.press(resend);
    expect(http.calls.filter(c => c.path === '/auth/v1/otp/challenges')).toHaveLength(1);
    now = Date.parse(challenge.resend_available_at) + 1;
    await act(async () => {await new Promise(resolve => setTimeout(resolve, 1100));});
    await waitFor(() => expect(screen.getByRole('button', {name: 'Отправить код ещё раз'})
      .props.accessibilityState.disabled).toBe(false));
  });

  it('a 429 says when to try again', async () => {
    await mount({'POST /auth/v1/otp/challenges': [{...problem(429, 'RATE_LIMITED'), headers: {'Retry-After': '90'}}]});
    await askCode('+380671234567');
    expect(await screen.findByText('Слишком много попыток. Повторите через 90 с.')).toBeTruthy();
  });
});

describe('E4: legal texts', () => {
  it('a text that must be accepted blocks the app, and a double tap is one acceptance with one command id', async () => {
    const {http} = await mount({
      'GET /api/rider/v1/legal': [{status: 200, body: {documents: [terms]}}],
      'GET /api/config/v1/legal/rider/terms': [{status: 200, body: {...terms, language: 'ru', text: 'Условия'}}],
      // Slow, so the second tap lands while the first acceptance is still on its way.
      'POST /api/rider/v1/legal/acceptances': [{status: 200, delayMs: 300, body: {version_id: terms.version_id,
        kind: 'TERMS', number: 1, language: 'ru', accepted_at: '2026-11-02T10:00:00Z'}}],
      ...meOk
    }, {signedIn: true});
    expect(await screen.findByText('Условия')).toBeTruthy();
    expect(screen.queryByText('Профиль')).toBeNull();
    const accept = screen.getByRole('button', {name: 'Принимаю'});
    await fireEvent.press(accept);
    await fireEvent.press(accept);
    expect(http.calls.filter(c => c.path === '/api/rider/v1/legal/acceptances').length).toBeLessThanOrEqual(1);
    expect(await screen.findByText(/ACTIVE/)).toBeTruthy();
    const acceptances = http.calls.filter(c => c.path === '/api/rider/v1/legal/acceptances');
    expect(acceptances).toHaveLength(1);
    expect((acceptances[0]!.body as {command_id: string}).command_id).toBe('40000000-0000-4000-8000-000000000001');
    expect(http.calls.find(c => c.path === '/api/config/v1/legal/rider/terms')).toBeTruthy();
  });
});

describe('E5: restarting', () => {
  it('a refresh token in secure storage opens the app signed in', async () => {
    const tokens = memory('stored-refresh');
    const {http} = await mount({'POST /auth/v1/token/refresh': [{status: 200, body: session}], ...legalNone, ...meOk},
      {tokens});
    expect(await screen.findByText(/ACTIVE/)).toBeTruthy();
    expect((http.calls[0]!.body as {refresh_token: string}).refresh_token).toBe('stored-refresh');
  });

  it('a revoked session opens at sign-in and the stored token is deleted', async () => {
    const tokens = memory('revoked-refresh');
    await mount({'POST /auth/v1/token/refresh': [problem(401, 'UNAUTHENTICATED')]}, {tokens});
    expect(await screen.findByLabelText('Номер телефона')).toBeTruthy();
    expect(tokens.read()).toBeNull();
  });

  it('the secure store keeps only the refresh token and empties it on sign-out', () => {
    const kept = new Map<string, string>();
    const store: SecureStore = {getItem: k => kept.get(k) ?? null, setItem: (k, v) => {kept.set(k, v);},
      deleteItemAsync: async k => {kept.delete(k);}};
    const tokens = secureRefreshTokens(store, 'blizz.rider.refresh');
    tokens.write('refresh-1');
    expect(tokens.read()).toBe('refresh-1');
    expect([...kept.values()]).toEqual(['refresh-1']);
    tokens.write(null);
    expect(tokens.read()).toBeNull();
  });
});

describe('E6: an old app', () => {
  it('a 426 on an action shows the update screen with no way around it', async () => {
    await mount({'POST /auth/v1/otp/challenges': [problem(426, 'UPGRADE_REQUIRED')]});
    await askCode('+380671234567');
    expect(await screen.findByText('Обновите приложение')).toBeTruthy();
    expect(screen.queryByRole('button')).toBeNull();
    expect(screen.queryByLabelText('Номер телефона')).toBeNull();
  });
});

describe('states', () => {
  it('a network failure says there is no connection and offers a retry', async () => {
    await mount({'GET /api/rider/v1/legal': ['network']}, {signedIn: true});
    expect(await screen.findByText('Нет связи с сервером. Проверьте интернет.')).toBeTruthy();
    expect(screen.getByRole('button', {name: 'Повторить'})).toBeTruthy();
  });

  it('a server error shows the correlation id', async () => {
    await mount({'GET /api/rider/v1/legal': [problem(503, 'A_FUTURE_CODE')]}, {signedIn: true});
    expect(await screen.findByText(new RegExp(cid))).toBeTruthy();
  });
});

it('RU, UK and PL have the same keys, and a missing key is refused', () => {
  validateCatalogs(translations);
  expect(Object.keys(translations.uk).sort()).toEqual(Object.keys(translations.ru).sort());
  expect(() => validateCatalogs({ru: {accept: 'Принимаю'}, uk: {}, pl: {accept: 'Akceptuję'}})).toThrow(/uk.*accept/);
});
