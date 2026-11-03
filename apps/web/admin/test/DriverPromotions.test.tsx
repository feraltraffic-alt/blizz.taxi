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

/** Driver promotions (#403): D1–D6 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const marketer = {...me, effective_permissions: ['promotions.manage']};
const KYIV = {id: '5a000000-0000-4000-8000-000000000001', name: 'Київ'};
const D1 = 'c1000000-0000-4000-8000-0000000000d1';
const terms = (over: Record<string, unknown> = {}) => ({name: 'Тиждень', reward_minor: 30000, currency: 'UAH',
  city_id: KYIV.id, period_days: 7, orders_required: 20, days_of_week: null, time_from: null, time_to: null,
  payment_method: 'CASH', repeat: 'EVERY_PERIOD', starts_at: '2026-11-10T00:00:00Z', ends_at: null, ...over});
const promo = (over: Record<string, unknown> = {}) => ({id: D1, terms: terms(), state: 'ACTIVE', version: 2,
  created_by: 's1', created_at: '2026-11-01T10:00:00Z', updated_at: '2026-11-01T10:00:00Z', ...over});

function handlers(opts: {archive?: () => Response} = {}) {
  const lists: URLSearchParams[] = [];
  const creates: Record<string, unknown>[] = [];
  const changes: Record<string, unknown>[] = [];
  const archives: Record<string, unknown>[] = [];
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(marketer as never)),
    http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [KYIV]})),
    http.get(origin + '/api/admin/v1/driver-promotions', ({request}) => {
      lists.push(new URL(request.url).searchParams);
      return HttpResponse.json({promotions: [promo()]} as never);
    }),
    http.post(origin + '/api/admin/v1/driver-promotions', async ({request}) => {
      const body = await request.json() as {promotion: Record<string, unknown>};
      creates.push(body);
      return HttpResponse.json(promo({id: 'new', terms: body.promotion, version: 1}) as never, {status: 201});
    }),
    http.post(origin + '/api/admin/v1/driver-promotions/' + D1 + '/change', async ({request}) => {
      const body = await request.json() as {promotion: Record<string, unknown>};
      changes.push(body);
      return HttpResponse.json(promo({terms: body.promotion, version: 3}) as never);
    }),
    http.post(origin + '/api/admin/v1/driver-promotions/' + D1 + '/archive', async ({request}) => {
      archives.push(await request.json() as Record<string, unknown>);
      return opts.archive ? opts.archive() : HttpResponse.json(promo({state: 'ARCHIVED', version: 3}) as never);
    }));
  return {lists, creates, changes, archives};
}

function mount() {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={['/driver-promotions']}><AdminApp client={api} /></MemoryRouter>);
}

const row = async (name: string) => (await screen.findByText(new RegExp('^' + name + ' · '))).closest('li') as HTMLElement;

async function fill(user: ReturnType<typeof userEvent.setup>, over: Record<string, string> = {}) {
  const put = async (label: string, key: string, fallback: string) => {
    const value = key in over ? over[key]! : fallback;
    const input = screen.getByLabelText(label);
    await user.clear(input);
    if (value) {
      await user.click(input);
      await user.paste(value);
    }
  };
  await put('Название акции для водителей', 'name', 'Вихідні');
  await put('Награда', 'reward', '300.5');
  await put('Валюта награды', 'currency', 'UAH');
  await put('Дней в периоде', 'days', '7');
  await put('Поездок нужно', 'orders', '20');
  await put('С (ЧЧ:ММ), водители', 'from', '');
  await put('До (ЧЧ:ММ), водители', 'to', '');
  await put('Начало (UTC), водители', 'starts', '2026-11-10 00:00');
  await put('Конец (UTC), водители', 'ends', '');
  await put('Причина изменения акции для водителей', 'reason', 'Запуск');
}

describe('D1: the list', () => {
  it('the terms in words; archived on demand', async () => {
    const {lists} = handlers();
    mount();
    const user = userEvent.setup();
    expect(await screen.findByText('Тиждень · 20 поездок за 7 дн. → 300.00 UAH · каждый период · Київ · наличные'
      + ' · с 2026-11-10 00:00 UTC · активна')).toBeVisible();
    await user.click(screen.getByRole('checkbox', {name: 'Показать остановленные акции водителей'}));
    await waitFor(() => expect(lists).toHaveLength(2));
    expect([...lists[1]!.entries()]).toEqual([['include_archived', 'true']]);
  });
});

describe('D2: create', () => {
  it('the reward in minor units, the start in UTC, empty conditions as null', async () => {
    const {creates} = handlers();
    mount();
    const user = userEvent.setup();
    await row('Тиждень');
    await user.selectOptions(screen.getByLabelText('Повтор'), 'EVERY_PERIOD');
    await fill(user);
    await user.click(screen.getByRole('button', {name: 'Создать акцию для водителей'}));
    await waitFor(() => expect(creates).toHaveLength(1));
    expect(creates[0]).toEqual({command_id: expect.any(String), reason: 'Запуск', promotion: {name: 'Вихідні',
      reward_minor: 30050, currency: 'UAH', city_id: null, period_days: 7, orders_required: 20, days_of_week: null,
      time_from: null, time_to: null, payment_method: null, repeat: 'EVERY_PERIOD',
      starts_at: '2026-11-10T00:00:00Z', ends_at: null}});
  });
});

describe('D3: change', () => {
  it('the form filled; the version read', async () => {
    const {changes} = handlers();
    mount();
    const user = userEvent.setup();
    await user.click(within(await row('Тиждень')).getByRole('button', {name: 'Изменить'}));
    expect(screen.getByLabelText('Награда')).toHaveValue('300.00');
    await user.clear(screen.getByLabelText('Поездок нужно'));
    await user.type(screen.getByLabelText('Поездок нужно'), '25');
    await user.type(screen.getByLabelText('Причина изменения акции для водителей'), 'Больше');
    await user.click(screen.getByRole('button', {name: 'Сохранить акцию для водителей'}));
    await waitFor(() => expect(changes).toHaveLength(1));
    expect(changes[0]).toEqual({command_id: expect.any(String), expected_version: 2, reason: 'Больше',
      promotion: terms({orders_required: 25})});
  });
});

describe('D4: stop', () => {
  it('with a reason and the version', async () => {
    const {archives} = handlers();
    mount();
    const user = userEvent.setup();
    const r = await row('Тиждень');
    await user.type(within(r).getByLabelText('Причина остановки'), 'Хватит');
    await user.click(within(r).getByRole('button', {name: 'Остановить'}));
    expect(await screen.findByText(/ · остановлена$/)).toBeVisible();
    expect(archives).toEqual([{command_id: expect.any(String), expected_version: 2, reason: 'Хватит'}]);
  });
});

describe('D5: refused on the screen', () => {
  it.each([['no name', {name: ''}], ['a reward of 0', {reward: '0'}], ['no currency', {currency: ''}],
    ['0 days', {days: '0'}], ['367 days', {days: '367'}], ['0 orders', {orders: '0'}], ['only from', {from: '07:00'}],
    ['a bad time', {from: '7:00', to: '09:00'}], ['no start', {starts: ''}], ['a bad start', {starts: '2026-11-31 00:00'}],
    ['an end before the start', {ends: '2026-11-01 00:00'}], ['no reason', {reason: ''}]])(
    '%s sends nothing', async (_name, over) => {
      const {creates} = handlers();
      mount();
      const user = userEvent.setup();
      await row('Тиждень');
      await fill(user, over as Record<string, string>);
      await user.click(screen.getByRole('button', {name: 'Создать акцию для водителей'}));
      expect(await screen.findByText(/^Нужны название, награда больше 0 с валютой/)).toBeVisible();
      expect(creates).toEqual([]);
    });
});

describe('D6: conflict', () => {
  it('is told and the list read again', async () => {
    const {lists} = handlers({archive: () => HttpResponse.json(problem(409, 'VERSION_CONFLICT'), {status: 409})});
    mount();
    const user = userEvent.setup();
    const r = await row('Тиждень');
    await user.type(within(r).getByLabelText('Причина остановки'), 'r');
    await user.click(within(r).getByRole('button', {name: 'Остановить'}));
    expect(await screen.findByText('Акцию изменил кто-то другой; список обновлён.')).toBeVisible();
    await waitFor(() => expect(lists).toHaveLength(2));
  });
});
