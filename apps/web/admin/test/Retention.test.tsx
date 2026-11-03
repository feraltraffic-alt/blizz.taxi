import {afterAll, afterEach, beforeAll, describe, expect, it, vi} from 'vitest';
import {render, screen, waitFor} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {MemoryRouter} from 'react-router-dom';
import {http, HttpResponse} from 'msw';
import {setupServer} from 'msw/node';
import {createApiClient} from '@blizz/api-client';
import {AdminApp} from '../src/App.js';
import {browserRefreshTokens} from '../src/storage.js';
import {cid, me, problem, session} from '../../../../test/fixtures.js';

/** Technical data retention terms, with a confirmation for shortening (#443): D1–D6 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const keeper = {...me, effective_permissions: ['retention.manage']};
const viewer = {...me, effective_permissions: ['orders.view']};
const DEFAULTS = {sessions: 30, sign_in_codes: 90, code_deliveries: 90, upload_sessions: 7, quarantined_files: 30,
  call_recordings: 0};
const fixed = {delivered_events: 30, consumer_receipts: 30, command_receipts: 30};
const version = (over: Record<string, unknown> = {}) => ({version: 0, days: DEFAULTS, changed_by: null, reason: null,
  changed_at: null, fixed_days: fixed, ...over});
const LABELS: Record<string, string> = {sessions: 'Сессии', sign_in_codes: 'Коды входа',
  code_deliveries: 'Доставка кодов', upload_sessions: 'Незавершённые загрузки', quarantined_files: 'Файлы в карантине',
  call_recordings: 'Записи звонков'};
const CONFIRM = 'Понимаю: данные старше срока будут удалены без возможности восстановления';

function handlers(opts: {rights?: unknown; current?: () => unknown; change?: () => Response} = {}) {
  const sent: Record<string, unknown>[] = [];
  let reads = 0;
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json((opts.rights ?? keeper) as never)),
    http.get(origin + '/api/admin/v1/retention', () => {
      reads++;
      return HttpResponse.json((opts.current ? opts.current() : version()) as never);
    }),
    http.put(origin + '/api/admin/v1/retention', async ({request}) => {
      const body = await request.json() as Record<string, unknown>;
      sent.push(body);
      return opts.change ? opts.change() : HttpResponse.json(version({version: 1, days: body.days,
        changed_by: me.member.id, reason: body.reason, changed_at: '2026-11-03T12:00:00Z'}) as never);
    }));
  return {sent, reads: () => reads};
}

function mount(path = '/retention') {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={[path]}><AdminApp client={api} /></MemoryRouter>);
}

type User = ReturnType<typeof userEvent.setup>;

async function set(user: User, kind: string, value: string) {
  await screen.findByText(/^Версия /);
  const input = screen.getByLabelText(LABELS[kind] + ', дней (0 — навсегда)');
  await user.clear(input);
  if (value) await user.type(input, value);
}

async function save(user: User, reason = 'Политика 2026', confirm = false) {
  if (reason) await user.type(screen.getByLabelText('Причина изменения сроков'), reason);
  if (confirm) await user.click(screen.getByLabelText(CONFIRM));
  await user.click(screen.getByRole('button', {name: 'Сохранить сроки'}));
}

describe('D1: the terms', () => {
  it('each kind, forever for 0, the defaults and the fixed rows', async () => {
    handlers();
    mount();
    expect(await screen.findByText('Сессии: 30 дн.')).toBeTruthy();
    expect(screen.getByText('Коды входа: 90 дн.')).toBeTruthy();
    expect(screen.getByText('Записи звонков: навсегда')).toBeTruthy();
    expect(screen.getByText('Версия 0 · по умолчанию')).toBeTruthy();
    expect(screen.getByText('Без службы, всегда 30 дн.: доставленные события, квитанции потребителей, '
      + 'квитанции команд')).toBeTruthy();
  });

  it('a changed version names who, when and why', async () => {
    handlers({current: () => version({version: 3, changed_by: 'a2000000-0000-4000-8000-000000000002',
      reason: 'Политика', changed_at: '2026-11-02T10:00:00Z'})});
    mount();
    expect(await screen.findByText('Версия 3 · сотрудник a2000000 · 02.11.2026 10:00 UTC · Политика')).toBeTruthy();
  });
});

describe('D2: change', () => {
  it('all six values with the version and the reason; the answer replaces the terms', async () => {
    const h = handlers({current: () => version({version: 2})});
    const user = userEvent.setup();
    mount();
    await set(user, 'sessions', '60');
    await save(user);
    await waitFor(() => expect(h.sent).toHaveLength(1));
    expect(h.sent[0]).toEqual({command_id: expect.any(String), expected_version: 2,
      days: {...DEFAULTS, sessions: 60}, reason: 'Политика 2026'});
    expect(await screen.findByText('Сессии: 60 дн.')).toBeTruthy();
    expect(screen.getByText(/^Версия 1 · /)).toBeTruthy();
  });
});

describe('D3: shortening needs a confirmation', () => {
  it.each([
    ['a lower number', 'sessions', '10', 'Сессии'],
    ['a number where it was forever', 'call_recordings', '365', 'Записи звонков']
  ])('%s: named, and nothing is sent without the checkbox; sent with it', async (_name, kind, value, label) => {
    const h = handlers();
    const user = userEvent.setup();
    mount();
    await set(user, kind, value);
    expect(await screen.findByText('Срок станет короче: ' + label + '.')).toBeTruthy();
    await save(user);
    expect(await screen.findByText('Подтвердите удаление данных старше нового срока.')).toBeTruthy();
    expect(h.sent).toHaveLength(0);
    await user.click(screen.getByLabelText(CONFIRM));
    await user.click(screen.getByRole('button', {name: 'Сохранить сроки'}));
    await waitFor(() => expect(h.sent).toHaveLength(1));
  });

  it.each([['a larger number', 'sessions', '60'], ['forever', 'sign_in_codes', '0']])(
    '%s needs no checkbox', async (_name, kind, value) => {
      const h = handlers();
      const user = userEvent.setup();
      mount();
      await set(user, kind, value);
      expect(screen.queryByText(/Срок станет короче/)).toBeNull();
      await save(user);
      await waitFor(() => expect(h.sent).toHaveLength(1));
    });
});

describe('D4: refused before sending', () => {
  it.each([['empty', ''], ['a fraction', '1.5'], ['negative', '-1'], ['too large', '2147483648']])(
    'a value %s', async (_name, value) => {
      const h = handlers();
      const user = userEvent.setup();
      mount();
      await set(user, 'sessions', value);
      await save(user, 'Причина', true);
      expect(await screen.findByText('Каждый срок — целое число дней от 0 до 2147483647.')).toBeTruthy();
      expect(h.sent).toHaveLength(0);
    });

  it('nothing changed', async () => {
    const h = handlers();
    const user = userEvent.setup();
    mount();
    await screen.findByText('Сессии: 30 дн.');
    await save(user);
    expect(await screen.findByText('Ничего не изменено.')).toBeTruthy();
    expect(h.sent).toHaveLength(0);
  });

  it('no reason', async () => {
    const h = handlers();
    const user = userEvent.setup();
    mount();
    await set(user, 'sessions', '60');
    await save(user, '');
    expect(await screen.findByText('Нужна причина.')).toBeTruthy();
    expect(h.sent).toHaveLength(0);
  });
});

describe('D5: conflict', () => {
  it('a 409 says so, reads the terms again and clears the checkbox', async () => {
    const h = handlers({change: () => HttpResponse.json(problem(409, 'VERSION_CONFLICT'), {status: 409})});
    const user = userEvent.setup();
    mount();
    await set(user, 'sessions', '10');
    await save(user, 'Политика', true);
    expect(await screen.findByText('Сроки изменились; показаны текущие.')).toBeTruthy();
    await waitFor(() => expect(h.reads()).toBe(2));
    expect(screen.queryByLabelText(CONFIRM)).toBeNull();
  });
});

describe('D6: access', () => {
  it('in the menu with retention.manage', async () => {
    handlers();
    mount('/');
    expect(await screen.findByRole('link', {name: 'Хранение данных'})).toHaveAttribute('href', '/retention');
  });

  it('not in the menu without it, and nothing is asked', async () => {
    const h = handlers({rights: viewer});
    mount('/');
    expect(await screen.findByRole('link', {name: 'Заказы'})).toBeTruthy();
    expect(screen.queryByRole('link', {name: 'Хранение данных'})).toBeNull();
    expect(h.reads()).toBe(0);
  });
});
