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

/** A driver's earnings per day for finance (#436): G1–G4 of the issue. */
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

const DRIVER = 'd0000000-0000-4000-8000-000000000001';
const KYIV = {id: '5a000000-0000-4000-8000-000000000001', code: 'kyiv', name: 'Київ', currency: 'UAH',
  timezone: 'Europe/Kyiv', center: {lat: 50.45, lon: 30.52}};
const LISBON = {id: '5a000000-0000-4000-8000-000000000003', code: 'lisbon', name: 'Lisboa', currency: 'EUR',
  timezone: 'Europe/Lisbon', center: {lat: 38.72, lon: -9.14}};
const finance = {...me, effective_permissions: ['driver.review', 'finance.manage']};
const reviewer = {...me, effective_permissions: ['driver.review']};
const zero = {trips: 0, fare_minor: 0, commission_minor: 0, driver_share_minor: 0, held_minor: 0, cash_minor: 0,
  cashless_minor: 0, tips_minor: 0, bonuses_minor: 0, top_ups_minor: 0, transfers_in_minor: 0,
  transfers_out_minor: 0, adjustments_minor: 0, net_minor: 0};
const day = {...zero, trips: 4, fare_minor: 50000, commission_minor: 7500, driver_share_minor: 42500,
  cash_minor: 20000, cashless_minor: 30000, net_minor: 42500};
const earnings = (over: Record<string, unknown> = {}) => ({driver_id: DRIVER, city_id: KYIV.id, currency: 'UAH',
  timezone: 'Europe/Kyiv', from: '2026-10-28', to: '2026-11-03', days: [{date: '2026-11-03', figures: day}],
  total: day, balance_minor: -12000, pending: {trips: 0, fare_minor: 0}, ...over});

function handlers(opts: {rights?: unknown; admitted?: string[]; answer?: (q: URLSearchParams) => Response} = {}) {
  const asked: URLSearchParams[] = [];
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json((opts.rights ?? finance) as never)),
    http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [KYIV, LISBON]} as never)),
    http.get(origin + '/api/admin/v1/drivers/' + DRIVER, () => HttpResponse.json({profile: {id: DRIVER,
      account_state: 'ACTIVE', review_status: 'APPROVED', has_payment_terminal: false,
      admission_city_ids: opts.admitted ?? [LISBON.id], version: 4, name: 'Водитель 1', vehicles: [], documents: []},
    phone: '+380500000001', history: [], duplicates: []} as never)),
    http.get(origin + '/api/admin/v1/drivers/' + DRIVER + '/balance', () => HttpResponse.json({balances: [],
      entries: [], page: {next_cursor: null, has_more: false}} as never)),
    http.get(origin + '/api/admin/v1/drivers/' + DRIVER + '/earnings', ({request}) => {
      const q = new URL(request.url).searchParams;
      asked.push(q);
      return opts.answer ? opts.answer(q) : HttpResponse.json(earnings() as never);
    }));
  return {asked};
}

function mount() {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={['/drivers/' + DRIVER]}><AdminApp client={api} /></MemoryRouter>);
}

const entries = (q: URLSearchParams) => [...q.entries()];
const row = '03.11.2026 · поездок 4 · стоимость 500.00 · комиссия 75.00 · водителю 425.00 · наличными 200.00 · '
  + 'безнал 300.00 · итого +425.00 UAH';

describe('G1: default period', () => {
  it('the first admission city, the last 7 days ending today in its time zone', async () => {
    vi.useFakeTimers({toFake: ['Date']});
    vi.setSystemTime(new Date('2026-11-03T22:30:00Z'));
    const h = handlers({admitted: [KYIV.id]});
    mount();
    await waitFor(() => expect(h.asked).toHaveLength(1));
    expect(entries(h.asked[0]!)).toEqual([['city_id', KYIV.id], ['from', '2026-10-29'], ['to', '2026-11-04']]);
    expect(screen.getByLabelText('Заработок с')).toHaveValue('2026-10-29');
    expect(screen.getByLabelText('Заработок по')).toHaveValue('2026-11-04');
  });

  it('Lisbon at the same moment is still on 03.11', async () => {
    vi.useFakeTimers({toFake: ['Date']});
    vi.setSystemTime(new Date('2026-11-03T22:30:00Z'));
    const h = handlers();
    mount();
    await waitFor(() => expect(h.asked).toHaveLength(1));
    expect(entries(h.asked[0]!)).toEqual([['city_id', LISBON.id], ['from', '2026-10-28'], ['to', '2026-11-03']]);
  });

  it('a driver admitted nowhere: the first city of the service', async () => {
    const h = handlers({admitted: []});
    mount();
    await waitFor(() => expect(h.asked).toHaveLength(1));
    expect(h.asked[0]!.get('city_id')).toBe(KYIV.id);
  });

  it('changing the city asks again with its today', async () => {
    vi.useFakeTimers({toFake: ['Date']});
    vi.setSystemTime(new Date('2026-11-03T22:30:00Z'));
    const h = handlers();
    const user = userEvent.setup();
    mount();
    await waitFor(() => expect(h.asked).toHaveLength(1));
    await user.selectOptions(screen.getByLabelText('Город заработка'), KYIV.id);
    await waitFor(() => expect(h.asked).toHaveLength(2));
    expect(entries(h.asked[1]!)).toEqual([['city_id', KYIV.id], ['from', '2026-10-29'], ['to', '2026-11-04']]);
  });
});

describe('G2: figures', () => {
  it('a day, the total, the balance now', async () => {
    handlers();
    mount();
    expect(await screen.findByText(row)).toBeTruthy();
    expect(screen.getByText('Всего · поездок 4 · стоимость 500.00 · комиссия 75.00 · водителю 425.00 · '
      + 'наличными 200.00 · безнал 300.00 · итого +425.00 UAH')).toBeTruthy();
    expect(screen.getByText('Баланс сейчас −120.00 UAH')).toBeTruthy();
    expect(screen.queryByText(/Ещё не в журнале/)).toBeNull();
  });

  it('the other figures only when not 0, and pending trips', async () => {
    const full = {...day, tips_minor: 1000, bonuses_minor: 500, top_ups_minor: 10000, transfers_in_minor: 200,
      transfers_out_minor: 300, adjustments_minor: -400, held_minor: 1500, net_minor: 53000};
    handlers({answer: () => HttpResponse.json(earnings({days: [{date: '2026-11-03', figures: full}], total: full,
      pending: {trips: 2, fare_minor: 18000}}) as never)});
    mount();
    expect(await screen.findByText('03.11.2026 · поездок 4 · стоимость 500.00 · комиссия 75.00 · водителю 425.00 · '
      + 'наличными 200.00 · безнал 300.00 · чаевые 10.00 · бонусы 5.00 · пополнения 100.00 · переводы получено 2.00 · '
      + 'переводы отправлено 3.00 · корректировки −4.00 · удержано 15.00 · итого +530.00 UAH')).toBeTruthy();
    expect(screen.getByText('Ещё не в журнале: поездок 2 на 180.00 UAH')).toBeTruthy();
  });

  it('no days says there were no movements', async () => {
    handlers({answer: () => HttpResponse.json(earnings({days: [], total: zero}) as never)});
    mount();
    expect(await screen.findByText('Движений за период не было.')).toBeTruthy();
  });
});

describe('G3: period refused before sending', () => {
  it.each([
    ['a date in another form', '03.11.2026', '2026-11-03'],
    ['a date that does not exist', '2026-02-30', '2026-03-03'],
    ['from after to', '2026-11-04', '2026-11-03'],
    ['more than 92 days', '2026-08-02', '2026-11-03']
  ])('%s', async (_name, from, to) => {
    const h = handlers();
    const user = userEvent.setup();
    mount();
    await waitFor(() => expect(h.asked).toHaveLength(1));
    await user.clear(screen.getByLabelText('Заработок с'));
    await user.type(screen.getByLabelText('Заработок с'), from);
    await user.clear(screen.getByLabelText('Заработок по'));
    await user.type(screen.getByLabelText('Заработок по'), to);
    await user.click(screen.getByRole('button', {name: 'Показать заработок'}));
    expect(await screen.findByText('Нужен период ГГГГ-ММ-ДД, «с» не позже «по», не больше 92 дней.')).toBeTruthy();
    expect(h.asked).toHaveLength(1);
  });

  it('92 days exactly is asked', async () => {
    const h = handlers();
    const user = userEvent.setup();
    mount();
    await waitFor(() => expect(h.asked).toHaveLength(1));
    await user.clear(screen.getByLabelText('Заработок с'));
    await user.type(screen.getByLabelText('Заработок с'), '2026-08-03');
    await user.clear(screen.getByLabelText('Заработок по'));
    await user.type(screen.getByLabelText('Заработок по'), '2026-11-03');
    await user.click(screen.getByRole('button', {name: 'Показать заработок'}));
    await waitFor(() => expect(h.asked).toHaveLength(2));
    expect(entries(h.asked[1]!)).toEqual([['city_id', LISBON.id], ['from', '2026-08-03'], ['to', '2026-11-03']]);
  });
});

describe('G4: access', () => {
  it('without finance.manage there is no block and nothing is asked', async () => {
    const h = handlers({rights: reviewer});
    mount();
    await screen.findByRole('heading', {name: 'Водитель 1 · +380500000001'});
    expect(screen.queryByLabelText('Город заработка')).toBeNull();
    expect(h.asked).toHaveLength(0);
  });

  it('a 403 says the city is not the staff member\'s', async () => {
    handlers({answer: () => HttpResponse.json(problem(403, 'FORBIDDEN'), {status: 403})});
    mount();
    expect(await screen.findByText('Заработок в этом городе вам недоступен.')).toBeTruthy();
  });
});
