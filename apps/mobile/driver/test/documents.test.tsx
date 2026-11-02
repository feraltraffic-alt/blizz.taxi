import {fireEvent, render, screen, waitFor} from '@testing-library/react-native';
import {createApiClient} from '@blizz/api-client';
import {DriverApp, type AppConfig, type PickedFile} from '../src/App';

/** The driver's vehicle and documents for admission (#284): D1–D8 and D10 of the issue. */
const cid = '10000000-0000-4000-8000-000000000001';
const session = {
  session_id: '10000000-0000-4000-8000-000000000002', subject: {type: 'DRIVER', id: '10000000-0000-4000-8000-000000000003'},
  audience: 'driver', access_token: 'test-only-access', refresh_token: 'test-only-refresh',
  access_expires_at: '2099-01-01T00:00:00Z', refresh_expires_at: '2099-01-01T00:00:00Z', password_change_required: false
};
const VEHICLE = '60000000-0000-4000-8000-000000000001';
const FILE = '80000000-0000-4000-8000-000000000001';
const UPLOAD = '/api/driver/v1/uploads/' + FILE;
const car = {id: VEHICLE, registration_number: 'AA1234BB', make: 'Skoda', model: 'Octavia', color: 'белый',
  production_year: 2019, state: 'DRAFT', class_approvals: []};
const fresh = {id: session.subject.id, account_state: 'ACTIVE', review_status: 'NOT_SUBMITTED', admission_city_ids: [],
  has_payment_terminal: false, version: 4, vehicles: [], documents: []};
const withCar = {...fresh, vehicles: [car]};

type Call = {method: string; path: string; body?: unknown; type?: string; bytes?: number};
type Answer = {status: number; body?: unknown; delayMs?: number};

function server(script: Record<string, Answer[]>) {
  const calls: Call[] = [];
  const fetch = jest.fn(async (url: string, init: RequestInit) => {
    const path = new URL(url).pathname;
    const method = String(init.method);
    const headers = (init.headers ?? {}) as Record<string, string>;
    if (init.body instanceof Blob) {
      calls.push({method, path, type: headers['Content-Type'], bytes: init.body.size});
    } else {
      calls.push({method, path, body: init.body ? JSON.parse(String(init.body)) : undefined});
    }
    const answers = script[method + ' ' + path] ?? [{status: 404, body: {code: 'NOT_FOUND', correlation_id: cid}}];
    const answer = answers.length > 1 ? answers.shift()! : answers[0]!;
    if (answer.delayMs) await new Promise(resolve => setTimeout(resolve, answer.delayMs));
    return new Response(answer.body === undefined ? null : JSON.stringify(answer.body), {
      status: answer.status, headers: {'Content-Type': 'application/json'}
    });
  });
  return {fetch: fetch as unknown as typeof globalThis.fetch, calls};
}

const problem = (status: number, code: string) => ({status, body: {type: 'about:blank', title: code, status, code,
  correlation_id: cid, retryable: false}});
const base = (profile: unknown) => ({
  'GET /api/driver/v1/legal': [{status: 200, body: {documents: []}}],
  'GET /api/driver/v1/profile': [{status: 200, body: profile}],
  'GET /api/driver/v1/work-sessions/current': [{status: 200, body: {driver_id: session.subject.id, session_id: null,
    session_version: 0, session_state: 'CLOSED'}}],
  'POST /api/driver/v1/documents/upload-sessions': [{status: 201, body: {file_id: FILE, upload_path: UPLOAD,
    expires_at: '2099-01-01T00:00:00Z', max_bytes: 4096}}],
  ['PUT ' + UPLOAD]: [{status: 200, body: {file_id: FILE, state: 'SAFE', content_type: 'image/png',
    size_bytes: 4}}],
  'POST /api/driver/v1/documents': [{status: 201, body: {id: '90000000-0000-4000-8000-000000000001'}}],
});

const png = (size = 4): PickedFile => ({name: 'license.png', type: 'image/png', size,
  data: new Blob([new Uint8Array(size)], {type: 'image/png'})});

async function open(profile: unknown, script: Record<string, Answer[]> = {},
  pick: (() => Promise<PickedFile | null>) | null = async () => png()) {
  const http = server({...base(profile), ...script});
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: {read: () => null, write: () => {}},
    fetch: http.fetch, correlationId: () => cid, initialSession: session as never});
  const picks = jest.fn(pick ?? (async () => null));
  const config: AppConfig = {service: 'default', deviceRef: 'test-driver', now: () => Date.parse('2026-11-02T10:00:00Z'),
    heartbeatMs: 60_000, pollMs: 60_000, locate: async () => ({lat: 50.4501, lon: 30.5234, accuracy_m: 8}),
    newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0'), ...(pick ? {pickFile: picks} : {})};
  await render(<DriverApp client={client} config={config} />);
  await fireEvent.press(await screen.findByRole('button', {name: 'Документы и автомобиль'}));
  return {http, picks};
}

const sent = (http: {calls: Call[]}, method: string, path: string) =>
  http.calls.filter(c => c.method === method && c.path === path);

async function fillCar(year = '2019') {
  await fireEvent.changeText(screen.getByLabelText('Госномер'), 'AA1234BB');
  await fireEvent.changeText(screen.getByLabelText('Марка'), 'Skoda');
  await fireEvent.changeText(screen.getByLabelText('Модель'), 'Octavia');
  await fireEvent.changeText(screen.getByLabelText('Цвет'), 'белый');
  await fireEvent.changeText(screen.getByLabelText('Год выпуска'), year);
}

describe('D1: the vehicle', () => {
  it('a valid form adds one vehicle and the profile is read again', async () => {
    const {http} = await open(fresh, {'POST /api/driver/v1/vehicles': [{status: 201, body: {id: VEHICLE}}],
      'GET /api/driver/v1/profile': [{status: 200, body: fresh}, {status: 200, body: withCar}]});
    await fillCar();
    await fireEvent.press(screen.getByRole('button', {name: 'Добавить автомобиль'}));
    expect(await screen.findByText('Skoda Octavia AA1234BB — черновик')).toBeTruthy();
    expect(sent(http, 'POST', '/api/driver/v1/vehicles').map(c => c.body)).toEqual([{
      command_id: expect.any(String), registration_number: 'AA1234BB', make: 'Skoda', model: 'Octavia',
      color: 'белый', production_year: 2019}]);
  });

  it.each([['an empty field', ''], ['a year before 1950', '1949'], ['a year after 2100', '2101'],
    ['not a year', '20x9']])('%s is refused on the phone and nothing is sent', async (_name, year) => {
    const {http} = await open(fresh);
    await fillCar(year);
    await fireEvent.press(screen.getByRole('button', {name: 'Добавить автомобиль'}));
    expect(await screen.findByText('Заполните все поля автомобиля; год — от 1950 до 2100.')).toBeTruthy();
    expect(sent(http, 'POST', '/api/driver/v1/vehicles')).toEqual([]);
  });

  it('a refusal of the server is shown', async () => {
    await open(fresh, {'POST /api/driver/v1/vehicles': [problem(409, 'CONFLICT')]});
    await fillCar();
    await fireEvent.press(screen.getByRole('button', {name: 'Добавить автомобиль'}));
    expect(await screen.findByText('Данные изменились. Обновите и попробуйте снова.')).toBeTruthy();
  });
});

describe('D2: a document', () => {
  it('a licence: session, bytes, document without vehicle_id, profile read again', async () => {
    const {http} = await open(withCar, {'GET /api/driver/v1/profile': [{status: 200, body: withCar},
      {status: 200, body: {...withCar, documents: [{id: 'd1', type: 'DRIVER_LICENSE', decision: 'PENDING'}]}}]});
    await fireEvent.press(screen.getByRole('button', {name: 'Загрузить: Водительское удостоверение'}));
    expect(await screen.findByText('Водительское удостоверение: на проверке')).toBeTruthy();
    const steps = http.calls.filter(c => c.method !== 'GET');
    expect(steps.map(c => c.method + ' ' + c.path)).toEqual(['POST /api/driver/v1/documents/upload-sessions',
      'PUT ' + UPLOAD, 'POST /api/driver/v1/documents']);
    expect(steps[0]!.body).toEqual({command_id: expect.any(String), content_type: 'image/png', size_bytes: 4});
    expect(steps[1]).toMatchObject({type: 'image/png', bytes: 4});
    expect(steps[2]!.body).toEqual({command_id: expect.any(String), type: 'DRIVER_LICENSE', file_id: FILE});
    expect(screen.getByText('Документ отправлен на проверку.')).toBeTruthy();
  });

  it.each([['VEHICLE_REGISTRATION', 'Техпаспорт'], ['INSURANCE', 'Страховка']])(
    'a %s goes with the vehicle', async (type, name) => {
      const {http} = await open(withCar);
      await fireEvent.press(screen.getByRole('button', {name: 'Загрузить: ' + name}));
      await waitFor(() => expect(sent(http, 'POST', '/api/driver/v1/documents')).toHaveLength(1));
      expect(sent(http, 'POST', '/api/driver/v1/documents')[0]!.body).toEqual({command_id: expect.any(String), type,
        file_id: FILE, vehicle_id: VEHICLE});
    });

  it('a rejected document shows the reason next to its type', async () => {
    await open({...withCar, documents: [{id: 'd1', type: 'DRIVER_LICENSE', decision: 'REJECTED',
      decision_reason: 'Не читается номер'}]});
    expect(await screen.findByText('Водительское удостоверение: отклонён — Не читается номер')).toBeTruthy();
    expect(screen.getByText('Техпаспорт: не загружен')).toBeTruthy();
  });
});

describe('D3: a rejected file', () => {
  it('shows the reason and attaches nothing', async () => {
    const {http} = await open(withCar, {['PUT ' + UPLOAD]: [{status: 200, body: {file_id: FILE, state: 'REJECTED',
      content_type: 'image/png', size_bytes: 4, reject_reason: 'Файл повреждён'}}]});
    await fireEvent.press(screen.getByRole('button', {name: 'Загрузить: Водительское удостоверение'}));
    expect(await screen.findByText('Файл не принят: Файл повреждён')).toBeTruthy();
    expect(sent(http, 'POST', '/api/driver/v1/documents')).toEqual([]);
  });
});

describe('D4: a file in quarantine', () => {
  it('says it is still being checked and attaches nothing', async () => {
    const {http} = await open(withCar, {['PUT ' + UPLOAD]: [{status: 200, body: {file_id: FILE, state: 'QUARANTINE',
      content_type: 'image/png', size_bytes: 4}}]});
    await fireEvent.press(screen.getByRole('button', {name: 'Загрузить: Водительское удостоверение'}));
    expect(await screen.findByText('Файл ещё проверяется. Загрузите документ снова чуть позже.')).toBeTruthy();
    expect(sent(http, 'POST', '/api/driver/v1/documents')).toEqual([]);
  });
});

describe('D5: refused on the phone', () => {
  it.each([
    ['a gif', {name: 'a.gif', type: 'image/gif', size: 4, data: new Blob([new Uint8Array(4)])},
      'Подходят только JPEG, PNG или PDF.'],
    ['a file over 10 MB', {...png(4), size: 10 * 1024 * 1024 + 1}, 'Файл больше 10 МБ.']
  ])('%s opens no session', async (_name, file, text) => {
    const {http} = await open(withCar, {}, async () => file as PickedFile);
    await fireEvent.press(screen.getByRole('button', {name: 'Загрузить: Водительское удостоверение'}));
    expect(await screen.findByText(text)).toBeTruthy();
    expect(http.calls.filter(c => c.method !== 'GET')).toEqual([]);
  });

  it('a cancelled picker sends nothing and says nothing', async () => {
    const {http, picks} = await open(withCar, {}, async () => null);
    await fireEvent.press(screen.getByRole('button', {name: 'Загрузить: Водительское удостоверение'}));
    await waitFor(() => expect(picks).toHaveBeenCalledTimes(1));
    expect(http.calls.filter(c => c.method !== 'GET')).toEqual([]);
  });
});

describe('D6: vehicle documents need a vehicle', () => {
  it('without a vehicle only the driver documents can be uploaded', async () => {
    await open(fresh);
    expect(screen.getByRole('button', {name: 'Загрузить: Водительское удостоверение'})).toBeTruthy();
    expect(screen.queryByRole('button', {name: 'Загрузить: Техпаспорт'})).toBeNull();
    expect(screen.queryByRole('button', {name: 'Загрузить: Страховка'})).toBeNull();
    expect(screen.getByText('Техпаспорт и страховку можно загрузить после добавления автомобиля.')).toBeTruthy();
  });
});

describe('D7: submit for review', () => {
  it('sends the profile version and reads the profile again', async () => {
    const {http} = await open(withCar, {'POST /api/driver/v1/verification/submit': [{status: 200,
      body: {...withCar, review_status: 'IN_REVIEW', version: 5}}],
    'GET /api/driver/v1/profile': [{status: 200, body: withCar}, {status: 200,
      body: {...withCar, review_status: 'IN_REVIEW', version: 5}}]});
    await fireEvent.press(screen.getByRole('button', {name: 'Отправить на проверку'}));
    expect(await screen.findByText('Проверка документов: на проверке')).toBeTruthy();
    expect(sent(http, 'POST', '/api/driver/v1/verification/submit').map(c => c.body)).toEqual([{
      command_id: expect.any(String), expected_version: 4}]);
    expect(screen.queryByRole('button', {name: 'Отправить на проверку'})).toBeNull();
  });

  it('VALIDATION_FAILED says what to do and stays', async () => {
    await open(withCar, {'POST /api/driver/v1/verification/submit': [problem(400, 'VALIDATION_FAILED')]});
    await fireEvent.press(screen.getByRole('button', {name: 'Отправить на проверку'}));
    expect(await screen.findByText('Не хватает документов или автомобиля, или срок документа истёк.')).toBeTruthy();
    expect(screen.getByRole('button', {name: 'Отправить на проверку'})).toBeTruthy();
  });

  it.each(['IN_REVIEW', 'APPROVED', 'REJECTED', 'SUSPENDED'])('is not offered in %s', async status => {
    await open({...withCar, review_status: status});
    expect(screen.queryByRole('button', {name: 'Отправить на проверку'})).toBeNull();
  });

  it.each(['CHANGES_REQUIRED', 'EXPIRED'])('is offered in %s', async status => {
    await open({...withCar, review_status: status});
    expect(screen.getByRole('button', {name: 'Отправить на проверку'})).toBeTruthy();
  });
});

describe('D8: one action at a time', () => {
  it('a double press opens one upload session', async () => {
    const {http} = await open(withCar, {'POST /api/driver/v1/documents/upload-sessions': [{status: 201, delayMs: 200,
      body: {file_id: FILE, upload_path: UPLOAD, expires_at: '2099-01-01T00:00:00Z', max_bytes: 4096}}]});
    const button = screen.getByRole('button', {name: 'Загрузить: Водительское удостоверение'});
    await fireEvent.press(button);
    await fireEvent.press(button);
    await waitFor(() => expect(sent(http, 'POST', '/api/driver/v1/documents')).toHaveLength(1));
    expect(sent(http, 'POST', '/api/driver/v1/documents/upload-sessions')).toHaveLength(1);
  });

  it('a double press adds one vehicle', async () => {
    const {http} = await open(fresh, {'POST /api/driver/v1/vehicles': [{status: 201, delayMs: 200,
      body: {id: VEHICLE}}]});
    await fillCar();
    const button = screen.getByRole('button', {name: 'Добавить автомобиль'});
    await fireEvent.press(button);
    await fireEvent.press(button);
    await waitFor(() => expect(sent(http, 'POST', '/api/driver/v1/vehicles')).toHaveLength(1));
    await new Promise(resolve => setTimeout(resolve, 300));
    expect(sent(http, 'POST', '/api/driver/v1/vehicles')).toHaveLength(1);
  });
});

describe('D10: no picker', () => {
  it('a build without a file picker offers no upload and says so', async () => {
    await open(withCar, {}, null);
    expect(screen.queryByRole('button', {name: 'Загрузить: Водительское удостоверение'})).toBeNull();
    expect(screen.getByText('Загрузка файлов недоступна в этой сборке.')).toBeTruthy();
  });
});
