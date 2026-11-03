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

/** Rider promotions (#400): P1–P6 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const marketer = {...me, effective_permissions: ['promotions.manage']};
const KYIV = {id: '5a000000-0000-4000-8000-000000000001', name: 'Київ'};
const P1 = 'b0000000-0000-4000-8000-000000000001';
const none = {city_id: null, vehicle_class: null, every_nth_trip: null, days_of_week: null, time_from: null,
  time_to: null, pickup_zone_id: null, dropoff_zone_id: null, starts_at: null, ends_at: null};
const promo = (over: Record<string, unknown> = {}) => ({id: P1, name: 'Ночь', kind: 'DISCOUNT', value_type: 'PERCENT',
  value: 1000, currency: null, conditions: {...none, city_id: KYIV.id, days_of_week: ['FRIDAY', 'SATURDAY'],
    time_from: '22:00', time_to: '06:00', pickup_zone_id: 'z1000000-0000-4000-8000-000000000001'},
  state: 'ACTIVE', version: 2, created_by: 's1', created_at: '2026-11-01T10:00:00Z', updated_at: '2026-11-01T10:00:00Z',
  ...over});

function handlers(opts: {archive?: () => Response} = {}) {
  const lists: URLSearchParams[] = [];
  const creates: Record<string, unknown>[] = [];
  const changes: Record<string, unknown>[] = [];
  const archives: Record<string, unknown>[] = [];
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(marketer as never)),
    http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [KYIV]})),
    http.get(origin + '/api/admin/v1/promotions', ({request}) => {
      lists.push(new URL(request.url).searchParams);
      return HttpResponse.json({promotions: [promo()]} as never);
    }),
    http.post(origin + '/api/admin/v1/promotions', async ({request}) => {
      const body = await request.json() as {promotion: Record<string, unknown>};
      creates.push(body);
      return HttpResponse.json({...promo(), ...body.promotion, id: 'new', version: 1} as never, {status: 201});
    }),
    http.post(origin + '/api/admin/v1/promotions/' + P1 + '/change', async ({request}) => {
      const body = await request.json() as {promotion: Record<string, unknown>};
      changes.push(body);
      return HttpResponse.json({...promo(), ...body.promotion, version: 3} as never);
    }),
    http.post(origin + '/api/admin/v1/promotions/' + P1 + '/archive', async ({request}) => {
      archives.push(await request.json() as Record<string, unknown>);
      return opts.archive ? opts.archive() : HttpResponse.json(promo({state: 'ARCHIVED', version: 3}) as never);
    }));
  return {lists, creates, changes, archives};
}

function mount() {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={['/promotions']}><AdminApp client={api} /></MemoryRouter>);
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
  await put('Название акции', 'name', 'Утро');
  if (over.type) await user.selectOptions(screen.getByLabelText('Размер'), over.type);
  await put('Значение', 'value', '12.5');
  if (over.currency !== undefined) await put('Валюта акции', 'currency', over.currency);
  await put('Каждая N-я поездка', 'nth', '');
  await put('С (ЧЧ:ММ)', 'from', '');
  await put('До (ЧЧ:ММ)', 'to', '');
  await put('Начало (UTC)', 'starts', '');
  await put('Конец (UTC)', 'ends', '');
  await put('Причина изменения акции', 'reason', 'Запуск');
}

describe('P1: the list', () => {
  it('active by default, with the conditions in words; archived on demand', async () => {
    const {lists} = handlers();
    mount();
    const user = userEvent.setup();
    expect(await screen.findByText('Ночь · скидка 10 % · Київ · пт, сб · 22:00–06:00 · зона подачи · активна'))
      .toBeVisible();
    await user.click(screen.getByRole('checkbox', {name: 'Показать остановленные'}));
    await waitFor(() => expect(lists).toHaveLength(2));
    expect([...lists[0]!.entries()]).toEqual([]);
    expect([...lists[1]!.entries()]).toEqual([['include_archived', 'true']]);
  });
});

describe('P2: create', () => {
  it('a percent in basis points, no currency, empty conditions as null', async () => {
    const {creates} = handlers();
    mount();
    const user = userEvent.setup();
    await row('Ночь');
    await fill(user, {value: '12,5'});
    await user.click(screen.getByRole('button', {name: 'Создать акцию'}));
    await waitFor(() => expect(creates).toHaveLength(1));
    expect(creates[0]).toEqual({command_id: expect.any(String), reason: 'Запуск', promotion: {name: 'Утро',
      kind: 'DISCOUNT', value_type: 'PERCENT', value: 1250, conditions: none}});
  });

  it('a fixed bonus with its currency, a city, every 5th trip, days, hours and dates', async () => {
    const {creates} = handlers();
    mount();
    const user = userEvent.setup();
    await row('Ночь');
    await user.selectOptions(screen.getByLabelText('Вид акции'), 'BONUS');
    await user.selectOptions(screen.getByLabelText('Город акции'), KYIV.id);
    await user.click(screen.getByRole('checkbox', {name: 'пн'}));
    await user.click(screen.getByRole('checkbox', {name: 'вс'}));
    await fill(user, {type: 'FIXED', value: '50', currency: 'UAH', nth: '5', from: '07:00', to: '10:00',
      starts: '2026-11-10 00:00', ends: '2026-12-01 00:00'});
    await user.click(screen.getByRole('button', {name: 'Создать акцию'}));
    await waitFor(() => expect(creates).toHaveLength(1));
    expect(creates[0]).toEqual({command_id: expect.any(String), reason: 'Запуск', promotion: {name: 'Утро',
      kind: 'BONUS', value_type: 'FIXED', value: 5000, currency: 'UAH', conditions: {...none, city_id: KYIV.id,
        every_nth_trip: 5, days_of_week: ['MONDAY', 'SUNDAY'], time_from: '07:00', time_to: '10:00',
        starts_at: '2026-11-10T00:00:00Z', ends_at: '2026-12-01T00:00:00Z'}}});
  });
});

describe('P3: change', () => {
  it('the form filled; the version read; the zones sent back', async () => {
    const {changes} = handlers();
    mount();
    const user = userEvent.setup();
    await user.click(within(await row('Ночь')).getByRole('button', {name: 'Изменить'}));
    expect(screen.getByLabelText('Значение')).toHaveValue('10');
    await user.type(screen.getByLabelText('Причина изменения акции'), 'Дольше');
    await user.clear(screen.getByLabelText('До (ЧЧ:ММ)'));
    await user.type(screen.getByLabelText('До (ЧЧ:ММ)'), '07:00');
    await user.click(screen.getByRole('button', {name: 'Сохранить акцию'}));
    await waitFor(() => expect(changes).toHaveLength(1));
    expect(changes[0]).toEqual({command_id: expect.any(String), expected_version: 2, reason: 'Дольше', promotion: {
      name: 'Ночь', kind: 'DISCOUNT', value_type: 'PERCENT', value: 1000, conditions: {...none, city_id: KYIV.id,
        days_of_week: ['FRIDAY', 'SATURDAY'], time_from: '22:00', time_to: '07:00',
        pickup_zone_id: 'z1000000-0000-4000-8000-000000000001'}}});
  });
});

describe('P4: stop', () => {
  it('with a reason and the version', async () => {
    const {archives} = handlers();
    mount();
    const user = userEvent.setup();
    const r = await row('Ночь');
    await user.type(within(r).getByLabelText('Причина остановки'), 'Закончилась');
    await user.click(within(r).getByRole('button', {name: 'Остановить'}));
    expect(await screen.findByText(/ · остановлена$/)).toBeVisible();
    expect(archives).toEqual([{command_id: expect.any(String), expected_version: 2, reason: 'Закончилась'}]);
  });
});

describe('P5: refused on the screen', () => {
  it.each([
    ['no name', {name: ''}], ['a percent over 100', {value: '100.01'}], ['three decimals', {value: '0.005'}],
    ['an amount of 0', {type: 'FIXED', value: '0', currency: 'UAH'}], ['FIXED without a currency',
      {type: 'FIXED', value: '50', currency: ''}], ['N of 1', {nth: '1'}], ['N of 1001', {nth: '1001'}],
    ['only from', {from: '07:00'}], ['a bad time', {from: '25:00', to: '10:00'}], ['a bad date', {starts: '2026-02-30 00:00'}],
    ['ends before it starts', {starts: '2026-12-01 00:00', ends: '2026-11-01 00:00'}], ['no reason', {reason: ''}]
  ])('%s sends nothing', async (_name, over) => {
    const {creates} = handlers();
    mount();
    const user = userEvent.setup();
    await row('Ночь');
    await fill(user, over as Record<string, string>);
    await user.click(screen.getByRole('button', {name: 'Создать акцию'}));
    expect(await screen.findByText(/^Нужны название до 120 символов/)).toBeVisible();
    expect(creates).toEqual([]);
  });
});

describe('P6: conflict', () => {
  it('is told and the list read again', async () => {
    const {lists} = handlers({archive: () => HttpResponse.json(problem(409, 'VERSION_CONFLICT'), {status: 409})});
    mount();
    const user = userEvent.setup();
    const r = await row('Ночь');
    await user.type(within(r).getByLabelText('Причина остановки'), 'r');
    await user.click(within(r).getByRole('button', {name: 'Остановить'}));
    expect(await screen.findByText('Акцию изменил кто-то другой; список обновлён.')).toBeVisible();
    await waitFor(() => expect(lists).toHaveLength(2));
  });
});
