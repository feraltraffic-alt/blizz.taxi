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

/** Reports (#409): R1–R6 of the issue. */
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

const reader = {...me, effective_permissions: ['reports.view']};
const KYIV = {id: '5a000000-0000-4000-8000-000000000001', name: 'Київ', timezone: 'Europe/Kyiv', currency: 'UAH'};
const counts = (n: number) => ({created: n, fulfilled: n - 2, cancelled: 1, unfulfilled: 1, open: 0,
  by_channel: {APP: n}, by_payment: {CASH: n}, cancelled_by: {RIDER: 1}});
const orders = {city_id: KYIV.id, timezone: 'Europe/Kyiv', from: '2026-11-01', to: '2026-11-07',
  from_utc: '2026-10-31T22:00:00Z', to_utc: '2026-11-07T22:00:00Z', generated_at: '2026-11-08T06:00:00Z',
  days: [{date: '2026-11-01', from_utc: '', to_utc: '', counts: counts(10)},
    {date: '2026-11-02', from_utc: '', to_utc: '', counts: counts(12)}],
  total: counts(22), cancellation_reasons: [{cancelled_by: 'RIDER', code: 'CHANGED_MIND', count: 2}]};
const figures = (trips: number) => ({trips, fares_minor: 125050, service_rides_minor: 0, commission_minor: 18757,
  driver_share_minor: 106293, discounts_minor: 1000, bonuses_granted_minor: 500, paid_by_card_minor: 50000,
  paid_with_bonuses_minor: 2000, collected_by_drivers_minor: 73050, tips_minor: 1500, rider_debt_change_minor: -300});
const money = {city_id: KYIV.id, currency: 'UAH', timezone: 'Europe/Kyiv', from: '2026-11-01', to: '2026-11-07',
  from_utc: '', to_utc: '', generated_at: '2026-11-08T06:00:00Z',
  days: [{date: '2026-11-01', from_utc: '', to_utc: '', figures: figures(9)}], total: figures(9)};
const EXPORT = 'e5000000-0000-4000-8000-000000000001';
const exp = (state: string) => ({id: EXPORT, kind: 'ORDERS', city_id: KYIV.id, from: '2026-11-01', to: '2026-11-07',
  timezone: 'Europe/Kyiv', from_utc: '', to_utc: '', state, file_name: 'orders.csv', rows: 3, error: null,
  created_at: '2026-11-08T06:00:00Z', ready_at: null, expires_at: null});

function handlers(opts: {orders?: () => Response} = {}) {
  const asked = {orders: [] as URLSearchParams[], finance: [] as URLSearchParams[], files: 0, lists: 0};
  const exports: Record<string, unknown>[] = [];
  let state = 'RUNNING';
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(reader as never)),
    http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [KYIV]})),
    http.get(origin + '/api/admin/v1/reports/orders', ({request}) => {
      asked.orders.push(new URL(request.url).searchParams);
      return opts.orders ? opts.orders() : HttpResponse.json(orders as never);
    }),
    http.get(origin + '/api/admin/v1/reports/finance', ({request}) => {
      asked.finance.push(new URL(request.url).searchParams);
      return HttpResponse.json(money as never);
    }),
    http.post(origin + '/api/admin/v1/reports/exports', async ({request}) => {
      exports.push(await request.json() as Record<string, unknown>);
      return HttpResponse.json(exp('PENDING') as never, {status: 202});
    }),
    http.get(origin + '/api/admin/v1/reports/exports', () => {
      asked.lists++;
      // The first read finds nothing, the read after the export finds it running, later reads find it ready.
      if (asked.lists > 2) state = 'READY';
      return HttpResponse.json({exports: asked.lists > 1 ? [exp(state)] : []} as never);
    }),
    http.get(origin + '/api/admin/v1/reports/exports/' + EXPORT + '/file', () => {
      asked.files++;
      return new HttpResponse('date,created\n', {headers: {'Content-Type': 'text/csv'}});
    }));
  return {asked, exports};
}

/** Types a period once the city's default period is in place, so the default cannot overwrite it. */
async function period(user: ReturnType<typeof userEvent.setup>, from: string, to: string) {
  const f = await screen.findByLabelText('С даты');
  await waitFor(() => expect(f).not.toHaveValue(''));
  await user.clear(f);
  await user.type(f, from);
  await user.clear(screen.getByLabelText('По дату'));
  await user.type(screen.getByLabelText('По дату'), to);
}

function mount() {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={['/reports']}><AdminApp client={api} /></MemoryRouter>);
}

const statics = URL as unknown as {createObjectURL?: (blob: Blob) => string; revokeObjectURL?: (url: string) => void};
afterEach(() => {
  delete statics.createObjectURL;
  delete statics.revokeObjectURL;
});

describe('R1: the period', () => {
  it('the last 7 days in the city time zone: at 22:30 UTC Kyiv is on the next day', async () => {
    vi.useFakeTimers({toFake: ['Date']});
    vi.setSystemTime(new Date('2026-11-07T22:30:00Z'));
    const {asked} = handlers();
    mount();
    const user = userEvent.setup();
    await waitFor(() => expect(screen.getByLabelText('С даты')).toHaveValue('2026-11-02'));
    expect(screen.getByLabelText('По дату')).toHaveValue('2026-11-08');
    await user.click(screen.getByRole('button', {name: 'Показать'}));
    await waitFor(() => expect(asked.orders).toHaveLength(1));
    expect([...asked.orders[0]!.entries()]).toEqual([['city_id', KYIV.id], ['from', '2026-11-02'], ['to', '2026-11-08']]);
  });
});

describe('R2: orders', () => {
  it('totals, days, reasons, the moment of the figures', async () => {
    handlers();
    mount();
    const user = userEvent.setup();
    await user.click(await screen.findByRole('button', {name: 'Показать'}));
    expect(await screen.findByText('Всего: создано 22, выполнено 20, отменено 1, не выполнено 1, в работе 0')).toBeVisible();
    expect(screen.getByText('01.11.2026: создано 10, выполнено 8, отменено 1, не выполнено 1, в работе 0')).toBeVisible();
    expect(screen.getByText('RIDER · CHANGED_MIND: 2')).toBeVisible();
    expect(screen.getByText('Данные на 08.11.2026 06:00 UTC')).toBeVisible();
  });
});

describe('R3: money', () => {
  it('in major units of the currency', async () => {
    const {asked} = handlers();
    mount();
    const user = userEvent.setup();
    await user.selectOptions(await screen.findByLabelText('Отчёт'), 'FINANCE');
    await user.click(screen.getByRole('button', {name: 'Показать'}));
    expect(await screen.findByText('Всего: поездок 9, стоимость 1 250.50, комиссия 187.57, водителям 1 062.93, '
      + 'скидки 10.00, бонусы начислены 5.00, картой 500.00, бонусами 20.00, у водителей 730.50, чаевые 15.00, '
      + 'долг пассажиров −3.00 UAH')).toBeVisible();
    expect(asked.finance).toHaveLength(1);
  });
});

describe('R4: export', () => {
  it('one command; the list read again; a READY file fetched once', async () => {
    statics.createObjectURL = vi.fn(() => 'blob:csv');
    statics.revokeObjectURL = vi.fn();
    const {asked, exports} = handlers();
    mount();
    const user = userEvent.setup();
    await user.click(await screen.findByRole('button', {name: 'Выгрузить в CSV'}));
    const row = (await screen.findByText('Заказы · Київ · 01.11–07.11 · в работе')).closest('li') as HTMLElement;
    expect(within(row).queryByRole('button', {name: 'Скачать'})).toBeNull();
    expect(exports).toHaveLength(1);
    expect(Object.keys(exports[0]!).sort()).toEqual(['city_id', 'command_id', 'from', 'kind', 'to']);
    await user.click(screen.getByRole('button', {name: 'Обновить'}));
    const ready = (await screen.findByText('Заказы · Київ · 01.11–07.11 · готов')).closest('li') as HTMLElement;
    await user.click(within(ready).getByRole('button', {name: 'Скачать'}));
    expect(await within(ready).findByRole('link', {name: 'orders.csv'})).toHaveAttribute('href', 'blob:csv');
    await user.click(screen.getByRole('button', {name: 'Обновить'}));
    await screen.findByText('Заказы · Київ · 01.11–07.11 · готов');
    expect(asked.files).toBe(1);
  });
});

describe('R5: refused on the screen', () => {
  it.each([['a bad date', '2026-11-31', '2026-12-01'], ['to before from', '2026-11-05', '2026-11-04'],
    ['93 days', '2026-08-01', '2026-11-02']])('%s sends nothing', async (_name, from, to) => {
    const {asked} = handlers();
    mount();
    const user = userEvent.setup();
    await period(user, from, to);
    await user.click(screen.getByRole('button', {name: 'Показать'}));
    expect(await screen.findByText('Даты — ГГГГ-ММ-ДД, конец не раньше начала, не больше 92 дней после него.'))
      .toBeVisible();
    expect(asked.orders).toEqual([]);
  });

  it('92 days are allowed', async () => {
    const {asked} = handlers();
    mount();
    const user = userEvent.setup();
    await period(user, '2026-08-01', '2026-11-01');
    await user.click(screen.getByRole('button', {name: 'Показать'}));
    await waitFor(() => expect(asked.orders).toHaveLength(1));
  });
});

describe('R6: not allowed', () => {
  it('a 403 on the city is told', async () => {
    handlers({orders: () => HttpResponse.json(problem(403, 'ACCESS_DENIED'), {status: 403})});
    mount();
    const user = userEvent.setup();
    await user.click(await screen.findByRole('button', {name: 'Показать'}));
    expect(await screen.findByText('Нет доступа к отчётам этого города.')).toBeVisible();
  });
});
