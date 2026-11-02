import {fireEvent, render, screen, waitFor} from '@testing-library/react-native';
import {createApiClient} from '@blizz/api-client';
import {RiderApp, type AppConfig, type PickedFile} from '../src/App';

/** The rider's support cases (#296): P1–P6 of the issue. */
const cid = '10000000-0000-4000-8000-000000000001';
const session = {
  session_id: '10000000-0000-4000-8000-000000000002', subject: {type: 'CLIENT', id: '10000000-0000-4000-8000-000000000003'},
  audience: 'rider', access_token: 'test-only-access', refresh_token: 'test-only-refresh',
  access_expires_at: '2099-01-01T00:00:00Z', refresh_expires_at: '2099-01-01T00:00:00Z', password_change_required: false
};

type Call = {method: string; path: string; query: URLSearchParams; body?: unknown};
type Answer = {status: number; body?: unknown; delayMs?: number; raw?: Uint8Array; type?: string};

function server(script: Record<string, Answer[]>) {
  const calls: Call[] = [];
  const fetch = jest.fn(async (url: string, init: RequestInit) => {
    const parsed = new URL(url);
    const path = parsed.pathname;
    const method = String(init.method);
    // File bytes (#313) are kept as their size and type; everything else is JSON.
    const headers = (init.headers ?? {}) as Record<string, string>;
    calls.push({method, path, query: parsed.searchParams, body: init.body instanceof Blob
      ? {bytes: init.body.size, type: headers['Content-Type']} : init.body ? JSON.parse(String(init.body)) : undefined});
    const answers = script[method + ' ' + path] ?? [{status: 404, body: {code: 'NOT_FOUND', correlation_id: cid}}];
    const answer = answers.length > 1 ? answers.shift()! : answers[0]!;
    if (answer.delayMs) await new Promise(resolve => setTimeout(resolve, answer.delayMs));
    if (answer.raw) return new Response(answer.raw, {status: answer.status, headers: {'Content-Type': answer.type!}});
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

async function mount(script: Record<string, Answer[]>, entry = 'Поддержка',
  pickFile?: () => Promise<PickedFile | null>) {
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
    lon: 30.52}), newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0'),
    ...(pickFile ? {pickFile} : {})};
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
    const {http} = await mount({['POST /api/rider/v1/support/cases/' + CASE + '/messages']: [{status: 200,
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
    const {http} = await mount({['POST /api/rider/v1/support/cases/' + CASE + '/messages']: [problem(409, 'CONFLICT')],
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

/** Attachments (#313): A1–A5 of the issue. */
describe('#313: attachments', () => {
  const FILE = 'f0000000-0000-4000-8000-000000000001';
  const UPLOAD = '/api/rider/v1/uploads/' + FILE;
  const file = (name = 'photo.png', type = 'image/png', size = 4): PickedFile => ({name, type, size,
    data: new Blob([new Uint8Array(Math.min(size, 8))], {type})});
  const uploads = (state = 'SAFE', reason: string | null = null) => ({
    'POST /api/rider/v1/support/uploads': [{status: 201, body: {file_id: FILE, upload_path: UPLOAD,
      expires_at: '2099-01-01T00:00:00Z', max_bytes: 10485760}}],
    ['PUT ' + UPLOAD]: [{status: 200, body: {file_id: FILE, state, content_type: 'image/png', size_bytes: 4,
      reject_reason: reason}}]});
  const nonGet = (http: {calls: Call[]}) => http.calls.filter(c => c.method !== 'GET');

  it('A1: a new case with a file: session, bytes, then attachment_ids', async () => {
    const {http} = await mount({...uploads(), 'POST /api/rider/v1/support/cases': [{status: 200, body: full()}]},
      'Поддержка', async () => file());
    await fillCase();
    await fireEvent.press(screen.getByRole('button', {name: 'Приложить файл'}));
    expect(await screen.findByText('photo.png')).toBeTruthy();
    await fireEvent.press(screen.getByRole('button', {name: 'Отправить обращение'}));
    await waitFor(() => expect(nonGet(http)).toHaveLength(3));
    expect(nonGet(http).map(c => [c.method + ' ' + c.path, c.body])).toEqual([
      ['POST /api/rider/v1/support/uploads', {command_id: expect.any(String), content_type: 'image/png', size_bytes: 4}],
      ['PUT ' + UPLOAD, {bytes: 4, type: 'image/png'}],
      ['POST /api/rider/v1/support/cases', {command_id: expect.any(String), category: 'LOST_ITEM',
        subject: 'Забыл зонт', message: 'Оставил зонт в машине', attachment_ids: [FILE]}]]);
  });

  it('A1: an answer with a file', async () => {
    const {http} = await mount({...uploads(), ['POST /api/rider/v1/support/cases/' + CASE + '/messages']: [
      {status: 200, body: full()}]}, 'Поддержка', async () => file('receipt.pdf', 'application/pdf'));
    await fireEvent.press(await screen.findByRole('button', {name: '№501 · Забыл зонт · в работе'}));
    await fireEvent.changeText(await screen.findByLabelText('Ваш ответ'), 'Вот чек');
    await fireEvent.press(screen.getByRole('button', {name: 'Приложить файл'}));
    expect(await screen.findByText('receipt.pdf')).toBeTruthy();
    await fireEvent.press(screen.getByRole('button', {name: 'Ответить'}));
    await waitFor(() => expect(nonGet(http).at(-1)!.path).toBe('/api/rider/v1/support/cases/' + CASE + '/messages'));
    expect(nonGet(http).at(-1)!.body).toEqual({command_id: expect.any(String), message: 'Вот чек',
      attachment_ids: [FILE]});
  });

  it.each([
    ['a gif', file('a.gif', 'image/gif'), 'Подходят только JPEG, PNG, WEBP или PDF.'],
    ['a file over 10 MB', file('big.png', 'image/png', 10 * 1024 * 1024 + 1), 'Файл больше 10 МБ.']
  ])('A2: %s opens no session', async (_name, picked, text) => {
    const {http} = await mount(uploads(), 'Поддержка', async () => picked);
    await fillCase();
    await fireEvent.press(screen.getByRole('button', {name: 'Приложить файл'}));
    expect(await screen.findByText(text)).toBeTruthy();
    expect(nonGet(http)).toEqual([]);
  });

  it('A2: a sixth file is refused before picking; a cancelled picker sends nothing', async () => {
    let n = 0;
    const {http} = await mount({
      'POST /api/rider/v1/support/uploads': [1, 2, 3, 4, 5].map(i => ({status: 201, body: {
        file_id: 'f000000' + i + '-0000-4000-8000-000000000001', upload_path: '/api/rider/v1/uploads/u' + i,
        expires_at: '2099-01-01T00:00:00Z', max_bytes: 10485760}})),
      ...Object.fromEntries([1, 2, 3, 4, 5].map(i => ['PUT /api/rider/v1/uploads/u' + i, [{status: 200, body: {
        file_id: 'f000000' + i + '-0000-4000-8000-000000000001', state: 'SAFE', size_bytes: 4}}]]))},
    'Поддержка', async () => ++n === 6 ? null : file('p' + n + '.png'));
    await fillCase();
    for (let i = 1; i <= 5; i++) {
      await fireEvent.press(screen.getByRole('button', {name: 'Приложить файл'}));
      expect(await screen.findByText('p' + i + '.png')).toBeTruthy();
    }
    await fireEvent.press(screen.getByRole('button', {name: 'Приложить файл'}));
    expect(await screen.findByText('Можно приложить не больше 5 файлов.')).toBeTruthy();
    await fireEvent.press(screen.getByRole('button', {name: 'Убрать p5.png'}));
    await fireEvent.press(screen.getByRole('button', {name: 'Приложить файл'}));
    await waitFor(() => expect(n).toBe(6));
    expect(nonGet(http).filter(c => c.path === '/api/rider/v1/support/uploads')).toHaveLength(5);
  });

  it.each([['REJECTED', 'Файл не принят: вирус'], ['QUARANTINE', 'Файл ещё проверяется. Приложите его чуть позже.']])(
    'A3: %s is told and not attached', async (state, text) => {
      const {http} = await mount({...uploads(state, state === 'REJECTED' ? 'вирус' : null),
        'POST /api/rider/v1/support/cases': [{status: 200, body: full()}]}, 'Поддержка', async () => file());
      await fillCase();
      await fireEvent.press(screen.getByRole('button', {name: 'Приложить файл'}));
      expect(await screen.findByText(text)).toBeTruthy();
      expect(screen.queryByText('photo.png')).toBeNull();
      await fireEvent.press(screen.getByRole('button', {name: 'Отправить обращение'}));
      await waitFor(() => expect(nonGet(http).at(-1)!.path).toBe('/api/rider/v1/support/cases'));
      expect(nonGet(http).at(-1)!.body).not.toHaveProperty('attachment_ids');
    });

  it('A4: a removed file is not sent', async () => {
    const {http} = await mount({...uploads(), 'POST /api/rider/v1/support/cases': [{status: 200, body: full()}]},
      'Поддержка', async () => file());
    await fillCase();
    await fireEvent.press(screen.getByRole('button', {name: 'Приложить файл'}));
    await fireEvent.press(await screen.findByRole('button', {name: 'Убрать photo.png'}));
    expect(screen.queryByText('photo.png')).toBeNull();
    await fireEvent.press(screen.getByRole('button', {name: 'Отправить обращение'}));
    await waitFor(() => expect(nonGet(http).at(-1)!.path).toBe('/api/rider/v1/support/cases'));
    expect(nonGet(http).at(-1)!.body).not.toHaveProperty('attachment_ids');
  });

  it('A5: a message tells how many files it has', async () => {
    const att = (n: number) => ({file_id: 'f' + n, content_type: 'image/png', size_bytes: 4, name: null});
    await mount({[ONE]: [{status: 200, body: full({messages: [{...msg(1, 'CLIENT', 'Вот фото'),
      attachments: [att(1), att(2)]}]})}]});
    await fireEvent.press(await screen.findByRole('button', {name: '№501 · Забыл зонт · в работе'}));
    expect(await screen.findByText('Вы: Вот фото · вложений: 2')).toBeTruthy();
  });

  it('A6: without a picker there is no attach button', async () => {
    await mount({});
    await fireEvent.press(await screen.findByRole('button', {name: 'Новое обращение'}));
    expect(screen.queryByRole('button', {name: 'Приложить файл'})).toBeNull();
  });
});

/** Opening attachments on the phone (#319): O1–O4. */
describe('#319: opening attachments', () => {
  const att = (id: string, type: string, name: string | null, size = 2048) => ({file_id: id, content_type: type,
    size_bytes: size, name});
  const withFiles = () => full({messages: [{...msg(2, 'STAFF', 'Вот фото зонта'),
    attachments: [att('a1', 'image/png', 'umbrella.png'), att('a2', 'application/pdf', null)]}]});
  const DOWNLOAD = 'GET /api/rider/v1/support/cases/' + CASE + '/attachments/a1';
  const PNG = new Uint8Array([137, 80, 78, 71, 13, 10, 26, 10]);

  async function openIt(script: Record<string, Answer[]>) {
    const result = await mount({[ONE]: [{status: 200, body: withFiles()}], ...script});
    await fireEvent.press(await screen.findByRole('button', {name: '№501 · Забыл зонт · в работе'}));
    await screen.findByText(/Вот фото зонта/);
    return result;
  }

  it('O1: each file is listed with its name and size', async () => {
    await openIt({});
    expect(screen.getByText('umbrella.png · 2 КБ')).toBeTruthy();
    expect(screen.getByText('файл · 2 КБ')).toBeTruthy();
  });

  it('O2: an image opens with one download and is shown', async () => {
    const {http} = await openIt({[DOWNLOAD]: [{status: 200, raw: PNG, type: 'image/png'}]});
    await fireEvent.press(screen.getByRole('button', {name: 'Открыть umbrella.png'}));
    const image = await screen.findByLabelText('umbrella.png');
    expect(String(image.props.source.uri)).toBe('data:image/png;base64,iVBORw0KGgo=');
    expect(screen.queryByRole('button', {name: 'Открыть umbrella.png'})).toBeNull();
    expect(http.calls.filter(c => c.path.endsWith('/attachments/a1'))).toHaveLength(1);
  });

  it('O3: a PDF has no open button and says where to read it', async () => {
    await openIt({});
    expect(screen.queryByRole('button', {name: 'Открыть файл'})).toBeNull();
    expect(screen.getByText('PDF открывается в веб-версии или по просьбе в поддержку.')).toBeTruthy();
  });

  it('O4: a refused download is told', async () => {
    await openIt({[DOWNLOAD]: [problem(404, 'NOT_FOUND')]});
    await fireEvent.press(screen.getByRole('button', {name: 'Открыть umbrella.png'}));
    expect(await screen.findByText(/Код запроса/)).toBeTruthy();
  });
});
