import {afterAll, afterEach, beforeAll, describe, expect, it, vi} from 'vitest';
import {render, screen, waitFor} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {http, HttpResponse, delay} from 'msw';
import {setupServer} from 'msw/node';
import {createApiClient} from '@blizz/api-client';
import {browserRefreshTokens} from '@blizz/web-ui';
import {OperatorApp} from '../src/App.js';
import {cid, me, problem, session} from '../../../../test/fixtures.js';

/** The support queue and one case (#288): S1–S9 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear();});
afterAll(() => server.close());

const KYIV = {id: '5a000000-0000-4000-8000-000000000001', code: 'kyiv', name: 'Київ', currency: 'UAH',
  timezone: 'Europe/Kyiv', working_hours: [], payment_methods: ['CASH'], orders_paused: false,
  center: {lat: 50.45, lon: 30.52}};
const agent = {...me, effective_permissions: ['support.manage']};
const CASE = 'c0000000-0000-4000-8000-000000000001';
const item = (over: Record<string, unknown> = {}) => ({id: CASE, number: 501, city_id: KYIV.id, category: 'LOST_ITEM',
  order_id: null, requester_type: 'CLIENT', requester_id: null, subject: 'Забыл зонт', priority: 'HIGH',
  state: 'OPEN', assigned_staff_id: null, resolution: null, respond_by: '2026-11-02T10:15:00Z', version: 3,
  created_at: '2026-11-02T10:00:00Z', updated_at: '2026-11-02T10:00:00Z', messages: [], ...over});
const message = (n: number, visibility: string, body: string) => ({id: 'e000000' + n + '-0000-4000-8000-000000000001',
  sequence: n, author_type: visibility === 'INTERNAL' ? 'STAFF' : 'CLIENT', author_id: null, visibility, body,
  created_at: '2026-11-02T10:0' + n + ':00Z', attachments: []});
const full = (over: Record<string, unknown> = {}) => item({messages: [message(1, 'PUBLIC', 'Оставил зонт в машине'),
  message(2, 'INTERNAL', 'Водитель не отвечает')], ...over});
const page = (cases: unknown[], next: string | null = null) => ({cases, page: {next_cursor: next, has_more: Boolean(next)}});

type Sent = {path: string; query: URLSearchParams; body: unknown};

function base(opts: {rights?: unknown; list?: (q: URLSearchParams) => unknown; one?: () => unknown;
  command?: (path: string) => Response | Promise<Response>} = {}) {
  const sent: Sent[] = [];
  server.use(
    http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [KYIV]})),
    http.get(origin + '/api/operator/v1/me', () => HttpResponse.json((opts.rights ?? agent) as never)),
    http.get(origin + '/api/operator/v1/support/cases', ({request}) => {
      const query = new URL(request.url).searchParams;
      sent.push({path: 'list', query, body: null});
      return HttpResponse.json((opts.list ?? (() => page([item()])))(query) as never);
    }),
    http.get(origin + '/api/operator/v1/support/cases/' + CASE, () =>
      HttpResponse.json((opts.one ?? (() => full()))() as never)),
    http.post(origin + '/api/operator/v1/support/cases/' + CASE + '/:action', async ({request, params}) => {
      sent.push({path: String(params.action), query: new URL(request.url).searchParams, body: await request.json()});
      return opts.command ? opts.command(String(params.action)) : HttpResponse.json(full({version: 4}) as never);
    })
  );
  return sent;
}

async function openQueue(user = userEvent.setup()) {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage, 'test'),
    correlationId: () => cid, initialSession: session});
  let id = 0;
  render(<OperatorApp client={api} pollMs={60_000}
    newId={() => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')} />);
  await user.click(await screen.findByRole('button', {name: 'Обращения'}));
  return user;
}

async function openCase(user = userEvent.setup()) {
  await openQueue(user);
  await user.click(await screen.findByRole('button', {name: /№501/}));
  await screen.findByText(/Оставил зонт в машине/);
  return user;
}

const commands = (sent: Sent[]) => sent.filter(s => s.path !== 'list');

describe('S1: the queue', () => {
  it('a row per case; filters go to the server', async () => {
    const sent = base();
    const user = await openQueue();
    const row = await screen.findByRole('button', {name: /№501/});
    expect(row.textContent).toMatch(/^№501 · Забыл зонт · Потерянная вещь · высокий · открыто · ответить до /);
    expect(sent[0]!.query.get('city_id')).toBe(KYIV.id);
    await user.selectOptions(screen.getByLabelText('Состояние'), 'IN_PROGRESS');
    await user.selectOptions(screen.getByLabelText('Приоритет'), 'URGENT');
    await user.click(screen.getByRole('checkbox', {name: 'Только неназначенные'}));
    await waitFor(() => {
      const q = sent.at(-1)!.query;
      expect([q.get('city_id'), q.get('state'), q.get('priority'), q.get('unassigned')])
        .toEqual([KYIV.id, 'IN_PROGRESS', 'URGENT', 'true']);
    });
    await user.selectOptions(screen.getByLabelText('Город'), '');
    await waitFor(() => expect(sent.at(-1)!.query.has('city_id')).toBe(false));
  });

  it('"more" reads the next page by cursor once on a double press', async () => {
    const sent = base({list: q => q.get('cursor') ? page([item({id: 'c2', number: 502, subject: 'Второе'})])
      : page([item()], 'cursor-2')});
    server.use(http.get(origin + '/api/operator/v1/support/cases', async ({request}) => {
      const query = new URL(request.url).searchParams;
      sent.push({path: 'list', query, body: null});
      if (query.get('cursor')) await delay(200);
      return HttpResponse.json((query.get('cursor') ? page([item({id: 'c2', number: 502, subject: 'Второе'})])
        : page([item()], 'cursor-2')) as never);
    }));
    const user = await openQueue();
    const more = await screen.findByRole('button', {name: 'Ещё'});
    await user.click(more);
    await user.click(more);
    expect(await screen.findByRole('button', {name: /№502/})).toBeTruthy();
    expect(sent.filter(s => s.query.get('cursor') === 'cursor-2')).toHaveLength(1);
    expect(screen.getByRole('button', {name: /№501/})).toBeTruthy();
  });
});

describe('S2: a case', () => {
  it('lists the messages in order, internal ones marked', async () => {
    base();
    await openCase();
    const items = screen.getAllByRole('listitem').map(li => li.textContent);
    expect(items).toEqual([expect.stringContaining('Оставил зонт в машине'),
      expect.stringMatching(/внутренний.*Водитель не отвечает/)]);
  });
});

describe('S3: assign', () => {
  it('take for myself, then back to the queue, each with the version', async () => {
    const sent = base({command: () => HttpResponse.json(full({version: 4, state: 'IN_PROGRESS',
      assigned_staff_id: me.member.id}) as never)});
    const user = await openCase();
    await user.click(screen.getByRole('button', {name: 'Взять себе'}));
    await user.click(await screen.findByRole('button', {name: 'Вернуть в очередь'}));
    await waitFor(() => expect(commands(sent)).toHaveLength(2));
    expect(commands(sent).map(s => [s.path, s.body])).toEqual([
      ['assign', {command_id: expect.any(String), expected_version: 3, assignee_id: me.member.id}],
      ['assign', {command_id: expect.any(String), expected_version: 4, assignee_id: null}]]);
  });
});

describe('S4: writing', () => {
  it('a reply waiting for the requester, and an internal comment', async () => {
    const sent = base();
    const user = await openCase();
    await user.type(screen.getByLabelText('Текст'), 'Водитель привезёт зонт');
    await user.click(screen.getByRole('checkbox', {name: 'Ждать ответа'}));
    await user.click(screen.getByRole('button', {name: 'Ответить'}));
    await waitFor(() => expect(commands(sent)).toHaveLength(1));
    await user.type(screen.getByLabelText('Текст'), 'Позвонить водителю');
    await user.click(screen.getByRole('button', {name: 'Внутренний комментарий'}));
    await waitFor(() => expect(commands(sent)).toHaveLength(2));
    expect(commands(sent).map(s => [s.path, s.body])).toEqual([
      ['comments', {command_id: expect.any(String), expected_version: 3, visibility: 'PUBLIC',
        body: 'Водитель привезёт зонт', wait_for_requester: true}],
      ['comments', {command_id: expect.any(String), expected_version: 4, visibility: 'INTERNAL',
        body: 'Позвонить водителю'}]]);
  });

  it('an empty text or one over 4000 characters sends nothing', async () => {
    const sent = base();
    const user = await openCase();
    await user.click(screen.getByRole('button', {name: 'Ответить'}));
    expect(await screen.findByText('Напишите текст до 4000 символов.')).toBeTruthy();
    await user.click(screen.getByLabelText('Текст'));
    await user.paste('я'.repeat(4001));
    await user.click(screen.getByRole('button', {name: 'Внутренний комментарий'}));
    expect(commands(sent)).toEqual([]);
  });
});

describe('S5: decisions', () => {
  it.each([
    ['OPEN', ['Решить', 'Закрыть']], ['IN_PROGRESS', ['Решить', 'Закрыть']],
    ['WAITING_REQUESTER', ['Решить', 'Закрыть']], ['RESOLVED', ['Закрыть', 'Открыть снова']], ['CLOSED', []]
  ])('in %s the offered decisions are %j', async (state, offered) => {
    base({one: () => full({state})});
    await openCase();
    const all = ['Решить', 'Закрыть', 'Открыть снова'];
    expect(all.filter(name => screen.queryByRole('button', {name}))).toEqual(offered);
  });

  it.each([['Решить', 'resolve'], ['Закрыть', 'close']])('%s needs a text and sends it', async (name, path) => {
    const sent = base();
    const user = await openCase();
    await user.click(screen.getByRole('button', {name}));
    expect(await screen.findByText('Напишите текст до 4000 символов.')).toBeTruthy();
    expect(commands(sent)).toEqual([]);
    await user.type(screen.getByLabelText('Текст'), 'Зонт вернули');
    await user.click(screen.getByRole('button', {name}));
    await waitFor(() => expect(commands(sent)).toHaveLength(1));
    expect(commands(sent)[0]).toMatchObject({path, body: {command_id: expect.any(String), expected_version: 3,
      text: 'Зонт вернули'}});
  });

  it('reopen sends its reason', async () => {
    const sent = base({one: () => full({state: 'RESOLVED'})});
    const user = await openCase();
    await user.type(screen.getByLabelText('Текст'), 'Зонт не тот');
    await user.click(screen.getByRole('button', {name: 'Открыть снова'}));
    await waitFor(() => expect(commands(sent)).toHaveLength(1));
    expect(commands(sent)[0]).toMatchObject({path: 'reopen', body: {expected_version: 3, text: 'Зонт не тот'}});
  });
});

describe('S6: priority', () => {
  it('changes with the version', async () => {
    const sent = base();
    const user = await openCase();
    await user.selectOptions(screen.getByLabelText('Приоритет обращения'), 'URGENT');
    await user.click(screen.getByRole('button', {name: 'Изменить приоритет'}));
    await waitFor(() => expect(commands(sent)).toHaveLength(1));
    expect(commands(sent)[0]).toMatchObject({path: 'priority', body: {command_id: expect.any(String),
      expected_version: 3, priority: 'URGENT'}});
  });
});

describe('S7: a conflict', () => {
  it('reads the case again and says so', async () => {
    let reads = 0;
    base({one: () => ++reads === 1 ? full() : full({version: 5, state: 'IN_PROGRESS'}),
      command: () => HttpResponse.json(problem(409, 'CONFLICT'), {status: 409})});
    const user = await openCase();
    await user.click(screen.getByRole('button', {name: 'Взять себе'}));
    expect(await screen.findByText('Обращение изменилось, проверьте его.')).toBeTruthy();
    expect(reads).toBe(2);
    expect(screen.getByText(/в работе/)).toBeTruthy();
  });
});

describe('S8: the right', () => {
  it('without support.manage nothing is offered or asked', async () => {
    const sent = base({rights: {...me, effective_permissions: ['orders.create']}});
    const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage, 'test'),
      correlationId: () => cid, initialSession: session});
    render(<OperatorApp client={api} pollMs={60_000} />);
    await screen.findByRole('button', {name: 'Выйти'});
    expect(screen.queryByRole('button', {name: 'Обращения'})).toBeNull();
    expect(sent).toEqual([]);
  });
});

describe('S9: one action at a time', () => {
  it('a double press sends one command', async () => {
    const sent = base({command: async () => {
      await delay(200);
      return HttpResponse.json(full({version: 4}) as never);
    }});
    const user = await openCase();
    const take = screen.getByRole('button', {name: 'Взять себе'});
    await user.click(take);
    await user.click(take);
    await waitFor(() => expect(commands(sent)).toHaveLength(1));
    await delay(300);
    expect(commands(sent)).toHaveLength(1);
  });
});

/** Support attachments for the operator (#317): V1–V5. */
describe('#317: attachments', () => {
  const FILE = 'f0000000-0000-4000-8000-000000000001';
  const att = (id: string, type: string, name: string | null) => ({file_id: id, content_type: type, size_bytes: 2048,
    name});
  const withFiles = () => full({messages: [{...message(1, 'PUBLIC', 'Оставил зонт в машине'),
    attachments: [att('a1', 'image/png', 'photo.png'), att('a2', 'application/pdf', null)]}]});
  const statics = URL as unknown as {createObjectURL?: (blob: Blob) => string; revokeObjectURL?: (url: string) => void};
  const urls = {made: 0, revoked: [] as string[]};
  function stubUrls() {
    urls.made = 0;
    urls.revoked = [];
    statics.createObjectURL = vi.fn(() => 'blob:file-' + ++urls.made);
    statics.revokeObjectURL = vi.fn((url: string) => {urls.revoked.push(url);});
  }
  afterEach(() => {
    delete statics.createObjectURL;
    delete statics.revokeObjectURL;
  });

  function files(opts: {download?: () => Response; stored?: string} = {}) {
    const asked = {downloads: [] as string[], sessions: [] as unknown[], puts: 0};
    server.use(
      http.get(origin + '/api/operator/v1/support/cases/' + CASE + '/attachments/:file', ({params}) => {
        asked.downloads.push(String(params.file));
        return opts.download ? opts.download() : new HttpResponse(new Uint8Array([137, 80, 78, 71]),
          {headers: {'Content-Type': 'image/png'}});
      }),
      http.post(origin + '/api/operator/v1/support/uploads', async ({request}) => {
        asked.sessions.push(await request.json());
        return HttpResponse.json({file_id: FILE, upload_path: '/api/operator/v1/uploads/' + FILE,
          expires_at: '2099-01-01T00:00:00Z', max_bytes: 10485760}, {status: 201});
      }),
      http.put(origin + '/api/operator/v1/uploads/' + FILE, () => {
        asked.puts++;
        return HttpResponse.json({file_id: FILE, state: opts.stored ?? 'SAFE', size_bytes: 4,
          reject_reason: opts.stored === 'REJECTED' ? 'вирус' : null});
      }));
    return asked;
  }

  it('V1: lists the files; one download each; an image inline, a PDF as a link', async () => {
    stubUrls();
    base({one: withFiles});
    const asked = files();
    const user = await openCase();
    expect(screen.getByText('photo.png · image/png · 2 КБ')).toBeVisible();
    expect(screen.getByText('файл · application/pdf · 2 КБ')).toBeVisible();
    await user.click(screen.getByRole('button', {name: 'Открыть photo.png'}));
    expect(await screen.findByRole('img', {name: 'photo.png'})).toHaveAttribute('src', 'blob:file-1');
    await user.click(screen.getByRole('button', {name: 'Открыть файл'}));
    expect(await screen.findByRole('link', {name: 'Скачать файл'})).toHaveAttribute('href', 'blob:file-2');
    expect(screen.queryByRole('button', {name: 'Открыть photo.png'})).not.toBeInTheDocument();
    expect(asked.downloads).toEqual(['a1', 'a2']);
  });

  it('V2: a refused download shows the correlation id', async () => {
    stubUrls();
    base({one: withFiles});
    files({download: () => HttpResponse.json(problem(403, 'ACCESS_DENIED'), {status: 403})});
    const user = await openCase();
    await user.click(screen.getByRole('button', {name: 'Открыть photo.png'}));
    expect(await screen.findByText(new RegExp(cid))).toBeVisible();
    expect(urls.made).toBe(0);
  });

  it('V3: a file attached to a reply goes as attachment_ids', async () => {
    const sent = base();
    const asked = files();
    const user = await openCase();
    await user.upload(screen.getByLabelText('Приложить файл'), new File([new Uint8Array(4)], 'answer.png',
      {type: 'image/png'}));
    expect(await screen.findByText('answer.png')).toBeVisible();
    await user.type(screen.getByLabelText('Текст'), 'Вот ответ');
    await user.click(screen.getByRole('button', {name: 'Ответить'}));
    await waitFor(() => expect(commands(sent)).toHaveLength(1));
    expect(asked.sessions).toEqual([{command_id: expect.any(String), content_type: 'image/png', size_bytes: 4}]);
    expect(commands(sent)[0]!.body).toEqual({command_id: expect.any(String), expected_version: 3,
      visibility: 'PUBLIC', body: 'Вот ответ', attachment_ids: [FILE]});
  });

  it.each([
    ['a gif', new File([new Uint8Array(4)], 'a.gif', {type: 'image/gif'}), 'Подходят только JPEG, PNG, WEBP или PDF.'],
    ['a file over 10 MB', new File([new Uint8Array(10 * 1024 * 1024 + 1)], 'big.png', {type: 'image/png'}),
      'Файл больше 10 МБ.']
  ])('V3: %s is refused before any request', async (_name, file, text) => {
    base();
    const asked = files();
    const user = userEvent.setup({applyAccept: false});
    await openCase(user);
    await user.upload(screen.getByLabelText('Приложить файл'), file);
    expect(await screen.findByText(text)).toBeVisible();
    expect(asked.sessions).toEqual([]);
  });

  it.each([['REJECTED', 'Файл не принят: вирус'], ['QUARANTINE', 'Файл ещё проверяется. Приложите его чуть позже.']])(
    'V3: %s is told and not attached', async (stored, text) => {
      const sent = base();
      files({stored});
      const user = await openCase();
      await user.upload(screen.getByLabelText('Приложить файл'), new File([new Uint8Array(4)], 'x.png',
        {type: 'image/png'}));
      expect(await screen.findByText(text)).toBeVisible();
      await user.type(screen.getByLabelText('Текст'), 'Внутреннее');
      await user.click(screen.getByRole('button', {name: 'Внутренний комментарий'}));
      await waitFor(() => expect(commands(sent)).toHaveLength(1));
      expect(commands(sent)[0]!.body).not.toHaveProperty('attachment_ids');
    });

  it('V4: a removed file is not sent', async () => {
    const sent = base();
    files();
    const user = await openCase();
    await user.upload(screen.getByLabelText('Приложить файл'), new File([new Uint8Array(4)], 'x.png',
      {type: 'image/png'}));
    await user.click(await screen.findByRole('button', {name: 'Убрать x.png'}));
    await user.type(screen.getByLabelText('Текст'), 'Без файла');
    await user.click(screen.getByRole('button', {name: 'Ответить'}));
    await waitFor(() => expect(commands(sent)).toHaveLength(1));
    expect(commands(sent)[0]!.body).not.toHaveProperty('attachment_ids');
  });

  it('V5: the object URLs are revoked when the case closes', async () => {
    stubUrls();
    base({one: withFiles});
    files();
    const user = await openCase();
    await user.click(screen.getByRole('button', {name: 'Открыть photo.png'}));
    await screen.findByRole('img', {name: 'photo.png'});
    await user.click(screen.getByRole('button', {name: 'К очереди'}));
    await waitFor(() => expect(urls.revoked).toEqual(['blob:file-1']));
  });
});
