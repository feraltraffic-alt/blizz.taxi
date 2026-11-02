import {fireEvent, render, screen, waitFor} from '@testing-library/react-native';
import {createApiClient, type RefreshTokenStore} from '@blizz/api-client';
import {DriverApp, type AppConfig} from '../src/App';
import {translations, validateCatalogs} from '../src/i18n';

const cid = '10000000-0000-4000-8000-000000000001';
const session = {
  session_id: '10000000-0000-4000-8000-000000000002', subject: {type: 'DRIVER', id: '10000000-0000-4000-8000-000000000003'},
  audience: 'driver', access_token: 'test-only-access', refresh_token: 'test-only-refresh',
  access_expires_at: '2099-01-01T00:00:00Z', refresh_expires_at: '2099-01-01T00:00:00Z', password_change_required: false
};
const NOW = Date.parse('2026-11-02T10:00:00Z');
const KYIV = '50000000-0000-4000-8000-000000000001';
const VEHICLE = '60000000-0000-4000-8000-000000000001';
const SESSION = '70000000-0000-4000-8000-000000000001';
const agreement = {version_id: '30000000-0000-4000-8000-000000000001', audience: 'DRIVER', kind: 'DRIVER_AGREEMENT',
  number: 1, acceptance_required: true, accepted: false, effective_from: '2026-01-01T00:00:00Z', languages: ['ru']};
const admitted = {id: session.subject.id, account_state: 'ACTIVE', review_status: 'APPROVED', admission_city_ids: [KYIV],
  has_payment_terminal: false, version: 3, vehicles: [{id: VEHICLE, state: 'APPROVED'}], documents: []};
const inReview = {...admitted, review_status: 'IN_REVIEW', admission_city_ids: [],
  documents: [{id: 'd1', type: 'DRIVER_LICENSE', decision: 'REJECTED', decision_reason: 'Нечитаемое фото'}]};
const offline = {driver_id: session.subject.id, session_id: null, session_version: 0, session_state: 'CLOSED',
  connection: 'DISCONNECTED', geolocation: 'UNAVAILABLE', occupancy: 'FREE', account_state: 'ACTIVE',
  review_status: 'APPROVED', eligible: false, ineligible_reasons: []};
const online = {...offline, session_id: SESSION, session_version: 1, session_state: 'OPEN', connection: 'CONNECTED'};

type Call = {method: string; path: string; body?: unknown};
type Answer = {status: number; body?: unknown; headers?: Record<string, string>; delayMs?: number} | 'network';

function server(script: Record<string, Answer[]>) {
  const calls: Call[] = [];
  const fetch = jest.fn(async (url: string, init: RequestInit) => {
    const path = new URL(url).pathname;
    const method = String(init.method);
    calls.push({method, path, body: init.body ? JSON.parse(String(init.body)) : undefined});
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

function memory(initial: string | null = null): RefreshTokenStore {
  let value = initial;
  return {read: () => value, write: next => {value = next;}};
}

const problem = (status: number, code: string) => ({status, body: {type: 'about:blank', title: code, status, code,
  correlation_id: cid, retryable: false}});
const noLegal = {'GET /api/driver/v1/legal': [{status: 200, body: {documents: []}}]};

async function mount(script: Record<string, Answer[]>, options: {signedIn?: boolean; tokens?: RefreshTokenStore;
  heartbeatMs?: number} = {}) {
  const http = server(script);
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: options.tokens ?? memory(),
    fetch: http.fetch, correlationId: () => cid,
    initialSession: options.signedIn === false ? undefined : session as never});
  const config: AppConfig = {service: 'default', deviceRef: 'test-driver', now: () => NOW,
    heartbeatMs: options.heartbeatMs ?? 60_000, locate: async () => ({lat: 50.4501, lon: 30.5234, accuracy_m: 8}),
    newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')};
  await render(<DriverApp client={client} config={config} />);
  return {http};
}

describe('E1: sign-in as a driver', () => {
  it('asks the code for the DRIVER audience and shows a country the service does not serve', async () => {
    const {http} = await mount({'POST /auth/v1/otp/challenges': [problem(422, 'PHONE_COUNTRY_NOT_SERVED')]},
      {signedIn: false});
    await fireEvent.changeText(await screen.findByLabelText('Номер телефона'), '+4915112345678');
    await fireEvent.press(screen.getByRole('button', {name: 'Получить код'}));
    expect(await screen.findByText('Мы пока не работаем с номерами этой страны.')).toBeTruthy();
    expect((http.calls[0]!.body as {audience: string}).audience).toBe('DRIVER');
  });

  it('a wrong code keeps the screen', async () => {
    await mount({'POST /auth/v1/otp/challenges': [{status: 201, body: {challenge_id: '20000000-0000-4000-8000-000000000001',
      expires_at: '2026-11-02T10:05:00Z', resend_available_at: '2026-11-02T10:01:00Z'}}],
      'POST /auth/v1/otp/verify': [problem(400, 'OTP_INVALID')]}, {signedIn: false});
    await fireEvent.changeText(await screen.findByLabelText('Номер телефона'), '+380501234567');
    await fireEvent.press(screen.getByRole('button', {name: 'Получить код'}));
    await fireEvent.changeText(await screen.findByLabelText('Код из сообщения'), '111111');
    await fireEvent.press(screen.getByRole('button', {name: 'Подтвердить'}));
    expect(await screen.findByText('Неверный код.')).toBeTruthy();
  });
});

describe('E2: the driver agreement', () => {
  it('blocks the app, and a double tap is one acceptance with one command id', async () => {
    const {http} = await mount({
      'GET /api/driver/v1/legal': [{status: 200, body: {documents: [agreement]}}],
      'GET /api/config/v1/legal/driver/driver_agreement': [{status: 200, body: {...agreement, language: 'ru',
        text: 'Договор водителя'}}],
      'POST /api/driver/v1/legal/acceptances': [{status: 200, delayMs: 300, body: {version_id: agreement.version_id,
        kind: 'DRIVER_AGREEMENT', number: 1, language: 'ru', accepted_at: '2026-11-02T10:00:00Z'}}],
      'GET /api/driver/v1/profile': [{status: 200, body: admitted}],
      'GET /api/driver/v1/work-sessions/current': [{status: 200, body: offline}]
    });
    expect(await screen.findByText('Договор водителя')).toBeTruthy();
    expect(screen.queryByRole('button', {name: 'Выйти на линию'})).toBeNull();
    const accept = screen.getByRole('button', {name: 'Принимаю'});
    await fireEvent.press(accept);
    await fireEvent.press(accept);
    expect(http.calls.filter(c => c.path === '/api/driver/v1/legal/acceptances').length).toBeLessThanOrEqual(1);
    expect(await screen.findByRole('button', {name: 'Выйти на линию'})).toBeTruthy();
    const acceptances = http.calls.filter(c => c.path === '/api/driver/v1/legal/acceptances');
    expect(acceptances).toHaveLength(1);
    expect((acceptances[0]!.body as {command_id: string}).command_id).toBe('40000000-0000-4000-8000-000000000001');
  });
});

describe('E3: admission', () => {
  it('a driver under review is not offered to go online, and sees why', async () => {
    await mount({...noLegal, 'GET /api/driver/v1/profile': [{status: 200, body: inReview}],
      'GET /api/driver/v1/work-sessions/current': [{status: 200, body: offline}]});
    expect(await screen.findByText('Выход на линию откроется после допуска.')).toBeTruthy();
    expect(screen.queryByRole('button', {name: 'Выйти на линию'})).toBeNull();
    expect(screen.getByText('Проверка документов: на проверке')).toBeTruthy();
    expect(screen.getByText(/DRIVER_LICENSE: REJECTED — Нечитаемое фото/)).toBeTruthy();
    expect(screen.getByText('Вас ещё не допустили ни в один город.')).toBeTruthy();
  });
});

describe('E4: the server refuses to put the driver online', () => {
  const base = {...noLegal, 'GET /api/driver/v1/profile': [{status: 200, body: admitted}],
    'GET /api/driver/v1/work-sessions/current': [{status: 200, body: offline}]};
  it.each([
    [problem(403, 'ACCESS_DENIED'), 'Сервер не позволил выйти на линию: ACCESS_DENIED'],
    [problem(409, 'DRIVER_NOT_ELIGIBLE'), 'Сервер не позволил выйти на линию: DRIVER_NOT_ELIGIBLE'],
    [problem(409, 'STATE_CONFLICT'), 'Вы уже на линии на другом устройстве.'],
    [problem(422, 'VALIDATION_FAILED'), 'Здесь нет города, в котором вы допущены.']
  ])('%j shows its reason and stays offline', async (answer, text) => {
    await mount({...base, 'POST /api/driver/v1/work-sessions': [answer]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Выйти на линию'}));
    expect(await screen.findByText(text)).toBeTruthy();
    expect(screen.getByText('Вы не на линии')).toBeTruthy();
  });

  it('going online sends the approved vehicle and the location, then going offline closes that session', async () => {
    const {http} = await mount({...base, 'POST /api/driver/v1/work-sessions': [{status: 201, body: online}],
      ['POST /api/driver/v1/work-sessions/' + SESSION + '/close']: [{status: 200, body: {...offline, session_version: 2}}]});
    await fireEvent.press(await screen.findByRole('button', {name: 'Выйти на линию'}));
    expect(await screen.findByText('Вы на линии')).toBeTruthy();
    const open = http.calls.find(c => c.path === '/api/driver/v1/work-sessions')!.body as
      {vehicle_id: string; location: {lat: number; sequence: number}};
    expect(open.vehicle_id).toBe(VEHICLE);
    expect(open.location.lat).toBe(50.4501);
    await fireEvent.press(screen.getByRole('button', {name: 'Уйти с линии'}));
    expect(await screen.findByText('Вы не на линии')).toBeTruthy();
    const close = http.calls.find(c => c.path.endsWith('/close'))!.body as {expected_version: number};
    expect(close.expected_version).toBe(1);
  });
});

describe('E5: restarting', () => {
  it('a session open on the server shows online and the heartbeat resumes', async () => {
    const {http} = await mount({...noLegal, 'GET /api/driver/v1/profile': [{status: 200, body: admitted}],
      'GET /api/driver/v1/work-sessions/current': [{status: 200, body: online}],
      ['POST /api/driver/v1/work-sessions/' + SESSION + '/heartbeat']: [{status: 200, body: online}]},
    {heartbeatMs: 50});
    expect(await screen.findByText('Вы на линии')).toBeTruthy();
    await waitFor(() => expect(http.calls.some(c => c.path.endsWith('/heartbeat'))).toBe(true));
  });

  it('a session the server closed shows offline', async () => {
    await mount({...noLegal, 'GET /api/driver/v1/profile': [{status: 200, body: admitted}],
      'GET /api/driver/v1/work-sessions/current': [{status: 200, body: {...online, session_state: 'CLOSED'}}]});
    expect(await screen.findByText('Вы не на линии')).toBeTruthy();
  });

  it('a stored refresh token opens the app signed in', async () => {
    await mount({'POST /auth/v1/token/refresh': [{status: 200, body: session}], ...noLegal,
      'GET /api/driver/v1/profile': [{status: 200, body: admitted}],
      'GET /api/driver/v1/work-sessions/current': [{status: 200, body: offline}]},
    {signedIn: false, tokens: memory('stored')});
    expect(await screen.findByText('Вы не на линии')).toBeTruthy();
  });
});

describe('E6: a lost heartbeat', () => {
  it('keeps the session, says the connection is lost and recovers with the next beat', async () => {
    await mount({...noLegal, 'GET /api/driver/v1/profile': [{status: 200, body: admitted}],
      'GET /api/driver/v1/work-sessions/current': [{status: 200, body: online}],
      ['POST /api/driver/v1/work-sessions/' + SESSION + '/heartbeat']: ['network', 'network',
        {status: 200, body: online}]}, {heartbeatMs: 50});
    expect(await screen.findByText('Связь с сервером потеряна. Пробуем снова…')).toBeTruthy();
    expect(screen.getByText('Вы на линии')).toBeTruthy();
    await waitFor(() => expect(screen.queryByText('Связь с сервером потеряна. Пробуем снова…')).toBeNull());
    expect(screen.getByText('Вы на линии')).toBeTruthy();
  });
});

it('a 426 shows the update screen with no way around it', async () => {
  await mount({...noLegal, 'GET /api/driver/v1/profile': [problem(426, 'UPGRADE_REQUIRED')],
    'GET /api/driver/v1/work-sessions/current': [{status: 200, body: offline}]});
  expect(await screen.findByText('Обновите приложение')).toBeTruthy();
  expect(screen.queryByRole('button')).toBeNull();
});

it('RU, UK and PL have the same keys', () => {
  validateCatalogs(translations);
  expect(Object.keys(translations.pl).sort()).toEqual(Object.keys(translations.ru).sort());
});
