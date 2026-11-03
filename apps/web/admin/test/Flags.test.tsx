import {afterAll, afterEach, beforeAll, describe, expect, it, vi} from 'vitest';
import {render, screen, waitFor, within} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {MemoryRouter} from 'react-router-dom';
import {http, HttpResponse, delay} from 'msw';
import {setupServer} from 'msw/node';
import {createApiClient} from '@blizz/api-client';
import {AdminApp} from '../src/App.js';
import {browserRefreshTokens} from '../src/storage.js';
import {cid, me, problem, session} from '../../../../test/fixtures.js';

/** Feature flags (#395): F1–F6 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {
  server.resetHandlers();
  sessionStorage.clear();
  localStorage.clear();
  vi.restoreAllMocks();
  vi.useRealTimers();
});
afterAll(() => server.close());

const keeper = {...me, effective_permissions: ['flags.manage']};
const flag = (over: Record<string, unknown> = {}) => ({key: 'card-payments', description: 'Riders pay by card',
  owner: 'payments', review_by: '2026-12-31', default_enabled: false, enabled: true, version: 2, changed_by: 's1',
  reason: 'Пилот Київ', changed_at: '2026-11-01T10:00:00Z', ...over});

function handlers(opts: {list?: () => unknown[]; change?: () => Response | Promise<Response>} = {}) {
  const changes: {key: string; body: Record<string, unknown>}[] = [];
  let reads = 0;
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(keeper as never)),
    http.get(origin + '/api/admin/v1/feature-flags', () => {
      reads++;
      return HttpResponse.json({flags: opts.list ? opts.list() : [flag(), flag({key: 'preorders',
        description: 'Orders for later', owner: 'operations', enabled: false, default_enabled: true, version: 0,
        changed_by: null, reason: null, changed_at: null})]} as never);
    }),
    http.post(origin + '/api/admin/v1/feature-flags/:key/change', async ({request, params}) => {
      const body = await request.json() as Record<string, unknown>;
      changes.push({key: String(params.key), body});
      return opts.change ? opts.change() : HttpResponse.json(flag({enabled: body.enabled, version: 3,
        reason: body.reason}) as never);
    }));
  return {changes, reads: () => reads};
}

function mount() {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={['/flags']}><AdminApp client={api} /></MemoryRouter>);
}

const row = async (key: string) => (await screen.findByText(new RegExp('^' + key + ' · '))).closest('li') as HTMLElement;

describe('F1: the list', () => {
  it('state, default, owner, review date, description; the last change', async () => {
    handlers();
    mount();
    const card = await row('card-payments');
    expect(within(card).getByText('card-payments · включён (по умолчанию: выключен) · модуль payments · '
      + 'пересмотреть до 31.12.2026 · Riders pay by card')).toBeVisible();
    expect(within(card).getByText('Изменён 01.11.2026 10:00 UTC: Пилот Київ')).toBeVisible();
    const pre = await row('preorders');
    expect(within(pre).queryByText(/^Изменён/)).toBeNull();
  });
});

describe('F2: overdue', () => {
  it('before today (UTC) is overdue; the review date itself is not', async () => {
    vi.useFakeTimers({toFake: ['Date']});
    vi.setSystemTime(new Date('2026-11-03T23:30:00Z'));
    handlers({list: () => [flag({key: 'old', review_by: '2026-11-02'}), flag({key: 'today', review_by: '2026-11-03'})]});
    mount();
    expect(within(await row('old')).getByText('Срок пересмотра прошёл.')).toBeVisible();
    expect(within(await row('today')).queryByText('Срок пересмотра прошёл.')).toBeNull();
  });
});

describe('F3: switch', () => {
  it('to the opposite, with the reason and the version; the row follows', async () => {
    const {changes} = handlers();
    mount();
    const user = userEvent.setup();
    const card = await row('card-payments');
    expect(screen.getByText('Выключение не останавливает то, что уже началось.')).toBeVisible();
    await user.type(within(card).getByLabelText('Причина: card-payments'), 'Сбой провайдера');
    await user.click(within(card).getByRole('button', {name: 'Выключить: card-payments'}));
    expect(await screen.findByText(/^card-payments · выключен/)).toBeVisible();
    expect(changes).toEqual([{key: 'card-payments', body: {command_id: expect.any(String), expected_version: 2,
      enabled: false, reason: 'Сбой провайдера'}}]);
  });

  it('an off flag offers to switch on', async () => {
    const {changes} = handlers();
    mount();
    const user = userEvent.setup();
    const pre = await row('preorders');
    await user.type(within(pre).getByLabelText('Причина: preorders'), 'Готовы');
    await user.click(within(pre).getByRole('button', {name: 'Включить: preorders'}));
    await waitFor(() => expect(changes).toHaveLength(1));
    expect(changes[0]).toEqual({key: 'preorders', body: {command_id: expect.any(String), expected_version: 0,
      enabled: true, reason: 'Готовы'}});
  });
});

describe('F4: refused on the screen', () => {
  it.each([['no reason', ''], ['a reason over 500', 'x'.repeat(501)]])('%s sends nothing', async (_name, why) => {
    const {changes} = handlers();
    mount();
    const user = userEvent.setup();
    const card = await row('card-payments');
    if (why) {
      await user.click(within(card).getByLabelText('Причина: card-payments'));
      await user.paste(why);
    }
    await user.click(within(card).getByRole('button', {name: 'Выключить: card-payments'}));
    expect(await screen.findByText('Нужна причина до 500 символов.')).toBeVisible();
    expect(changes).toEqual([]);
  });
});

describe('F5: conflict', () => {
  it('is told and the list read again', async () => {
    const {reads} = handlers({change: () => HttpResponse.json(problem(409, 'VERSION_CONFLICT'), {status: 409})});
    mount();
    const user = userEvent.setup();
    const card = await row('card-payments');
    await user.type(within(card).getByLabelText('Причина: card-payments'), 'r');
    await user.click(within(card).getByRole('button', {name: 'Выключить: card-payments'}));
    expect(await screen.findByText('Флаг переключил кто-то другой; список обновлён.')).toBeVisible();
    await waitFor(() => expect(reads()).toBe(2));
  });
});

describe('F6: one at a time', () => {
  it('a double click switches once', async () => {
    const {changes} = handlers({change: async () => {
      await delay(100);
      return HttpResponse.json(flag({enabled: false, version: 3}) as never);
    }});
    mount();
    const user = userEvent.setup();
    const card = await row('card-payments');
    await user.type(within(card).getByLabelText('Причина: card-payments'), 'r');
    await user.dblClick(within(card).getByRole('button', {name: 'Выключить: card-payments'}));
    expect(await screen.findByText(/^card-payments · выключен/)).toBeVisible();
    expect(changes).toHaveLength(1);
  });
});
