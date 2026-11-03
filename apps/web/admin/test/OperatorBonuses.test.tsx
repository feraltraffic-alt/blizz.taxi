import {afterAll, afterEach, beforeAll, describe, expect, it, vi} from 'vitest';
import {render, screen, waitFor, within} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {MemoryRouter} from 'react-router-dom';
import {http, HttpResponse} from 'msw';
import {setupServer} from 'msw/node';
import {createApiClient} from '@blizz/api-client';
import {AdminApp} from '../src/App.js';
import {browserRefreshTokens} from '../src/storage.js';
import {cid, me, problem, session} from '../../../../test/fixtures.js';

/** Operator bonuses (#418): B1–B6 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const manager = {...me, effective_permissions: ['operator-bonuses.manage']};
const S1 = 'a1000000-0000-4000-8000-000000000001';
const settings = () => ({m: 2, g: 1, count_cancellations: true, reset_day: 1, time_rules: [
  {key: 'night', days_of_week: [5, 6], start_hour: 22, end_hour: 24, m: 4, g: 2},
  {key: 'morning', days_of_week: [1, 2, 3, 4, 5], start_hour: 7, end_hour: 10, m: 3, g: 1}]});

function handlers(opts: {change?: () => Response} = {}) {
  const changes: Record<string, unknown>[] = [];
  let reads = 0;
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(manager as never)),
    http.get(origin + '/api/admin/v1/settings/operator-bonuses', () => {
      reads++;
      return HttpResponse.json({version: 3, settings: settings(), effective_at: '2026-11-01T00:00:00Z',
        reason: 'Ночные смены'} as never);
    }),
    http.post(origin + '/api/admin/v1/settings/operator-bonuses', async ({request}) => {
      const body = await request.json() as {settings: unknown; reason: string};
      changes.push(body as Record<string, unknown>);
      return opts.change ? opts.change() : HttpResponse.json({version: 4, settings: body.settings,
        effective_at: '2026-11-03T09:00:00Z', reason: body.reason} as never);
    }),
    http.get(origin + '/api/admin/v1/operator-bonuses', () => HttpResponse.json({accounts: [{staff_id: S1, balance: 42,
      fulfilled_count: 21, cancelled_count: 1, period_started_at: '2026-11-01T00:00:00Z', last_entries: []}]} as never)),
    http.get(origin + '/api/admin/v1/operator-bonuses/periods', () => HttpResponse.json({periods: [{staff_id: S1,
      period_key: '2026-11-01', period_started_at: '2026-10-01T00:00:00Z', period_ended_at: '2026-11-01T00:00:00Z',
      points: 120, fulfilled_count: 60, cancelled_count: 2, closed_at: '2026-11-01T00:00:05Z'}],
    page: {next_cursor: null, has_more: false}} as never)));
  return {changes, reads: () => reads};
}

function mount() {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={['/operator-bonuses']}><AdminApp client={api} /></MemoryRouter>);
}

async function open() {
  mount();
  const user = userEvent.setup();
  await waitFor(() => expect(screen.getByLabelText('Баллы за выполненный заказ')).toHaveValue('2'));
  return user;
}

const rule = (n: number) => screen.getByRole('group', {name: 'Правило ' + n});

async function put(user: ReturnType<typeof userEvent.setup>, box: HTMLElement | null, label: string, value: string) {
  const input = (box ? within(box) : screen).getByLabelText(label);
  await user.clear(input);
  if (value) await user.type(input, value);
}

async function save(user: ReturnType<typeof userEvent.setup>, reason = 'Уточнение') {
  if (reason) await user.type(screen.getByLabelText('Причина изменения правил'), reason);
  await user.click(screen.getByRole('button', {name: 'Сохранить правила'}));
}

describe('B1: rules', () => {
  it('the rules in force, in order, with the version', async () => {
    handlers();
    await open();
    expect(screen.getByLabelText('Баллы за отмену по вине оператора')).toHaveValue('1');
    expect(screen.getByLabelText('День сброса')).toHaveValue('1');
    expect(within(rule(1)).getByLabelText('Ключ')).toHaveValue('night');
    expect(within(rule(1)).getByRole('checkbox', {name: 'сб'})).toBeChecked();
    expect(within(rule(2)).getByLabelText('Ключ')).toHaveValue('morning');
    expect(screen.getByText('Версия 3 с 01.11.2026 · причина: Ночные смены')).toBeVisible();
  });
});

describe('B2: change', () => {
  it('a rule added, one moved up; every rule in the order shown', async () => {
    const {changes} = handlers();
    const user = await open();
    await user.click(within(rule(2)).getByRole('button', {name: 'Выше'}));
    await user.click(screen.getByRole('button', {name: 'Добавить правило'}));
    await put(user, rule(3), 'Ключ', 'lunch');
    await user.click(within(rule(3)).getByRole('checkbox', {name: 'ср'}));
    await user.click(within(rule(3)).getByRole('checkbox', {name: 'пн'}));
    await put(user, rule(3), 'С часа', '12');
    await put(user, rule(3), 'До часа', '14');
    await put(user, rule(3), 'Баллы за заказ', '3');
    await put(user, rule(3), 'Баллы за отмену', '0');
    await save(user);
    expect(await screen.findByText(/^Версия 4 с 03\.11\.2026/)).toBeVisible();
    const [m, n] = settings().time_rules;
    expect(changes).toEqual([{command_id: expect.any(String), expected_version: 3, reason: 'Уточнение', settings: {
      m: 2, g: 1, count_cancellations: true, reset_day: 1, time_rules: [n, m, {key: 'lunch', days_of_week: [1, 3],
        start_hour: 12, end_hour: 14, m: 3, g: 0}]}}]);
  });

  it('a rule removed', async () => {
    const {changes} = handlers();
    const user = await open();
    await user.click(within(rule(1)).getByRole('button', {name: 'Убрать правило'}));
    await save(user);
    await waitFor(() => expect(changes).toHaveLength(1));
    expect((changes[0]!.settings as {time_rules: {key: string}[]}).time_rules.map(r => r.key)).toEqual(['morning']);
  });
});

describe('B3: refused on the screen', () => {
  it.each([
    ['m not whole', null, 'Баллы за выполненный заказ', '1.5'], ['g negative', null, 'Баллы за отмену по вине оператора', '-1'],
    ['reset day 29', null, 'День сброса', '29'], ['no key', 1, 'Ключ', ''], ['a key used twice', 2, 'Ключ', 'night'],
    ['start equals end', 2, 'До часа', '7'], ['end 25', 2, 'До часа', '25'], ['start 24', 2, 'С часа', '24']
  ] as const)('%s sends nothing', async (_name, n, label, value) => {
    const {changes} = handlers();
    const user = await open();
    await put(user, n ? rule(n) : null, label, value);
    await save(user);
    expect(await screen.findByText(/^Проверьте правила/)).toBeVisible();
    expect(changes).toEqual([]);
  });

  it('a rule with no days', async () => {
    const {changes} = handlers();
    const user = await open();
    await user.click(within(rule(1)).getByRole('checkbox', {name: 'пт'}));
    await user.click(within(rule(1)).getByRole('checkbox', {name: 'сб'}));
    await save(user);
    expect(await screen.findByText(/^Проверьте правила/)).toBeVisible();
    expect(changes).toEqual([]);
  });

  it('no reason', async () => {
    const {changes} = handlers();
    const user = await open();
    await save(user, '');
    expect(await screen.findByText(/^Проверьте правила/)).toBeVisible();
    expect(changes).toEqual([]);
  });
});

describe('B4, B5: accounts and periods', () => {
  it('the points of each account and each closed period', async () => {
    handlers();
    await open();
    expect(screen.getByText('a1000000 · 42 баллов · выполнено 21 · отменено 1 · с 01.11.2026')).toBeVisible();
    expect(screen.getByText('a1000000 · 2026-11-01 · 120 баллов')).toBeVisible();
  });
});

describe('B6: conflict', () => {
  it('is told and the rules read again', async () => {
    const {reads} = handlers({change: () => HttpResponse.json(problem(409, 'VERSION_CONFLICT'), {status: 409})});
    const user = await open();
    await save(user);
    expect(await screen.findByText('Правила изменил кто-то другой; показаны текущие.')).toBeVisible();
    await waitFor(() => expect(reads()).toBe(2));
  });
});
