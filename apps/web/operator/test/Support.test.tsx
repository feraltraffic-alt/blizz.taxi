import {afterAll, afterEach, beforeAll, describe, expect, it} from 'vitest';
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
