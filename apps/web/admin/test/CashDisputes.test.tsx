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

/** Cash disputes, listed and decided (#427): D1–D5 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const ORDER = '0d000000-0000-4000-8000-000000000001';
const ORDER2 = '0d000000-0000-4000-8000-000000000002';
const finance = {...me, effective_permissions: ['finance.manage']};
const viewer = {...me, effective_permissions: ['orders.view']};
const dispute = (over: Record<string, unknown> = {}) => ({order_id: ORDER,
  driver_id: 'd1000000-0000-4000-8000-000000000001', payer_client_id: 'c1000000-0000-4000-8000-000000000001',
  currency: 'UAH', held_minor: 2000, rider_debt_minor: 12500, opened_at: '2026-11-03T09:00:00Z',
  decide_by: '2099-11-17T09:00:00Z', decision: null, decided_by: null, reason: null, decided_at: null, version: 3,
  ...over});

type Page = {disputes: unknown[]; page: {next_cursor: string | null; has_more: boolean}};

function handlers(opts: {rights?: unknown; pages?: (cursor: string | null) => Page; decide?: () => Response} = {}) {
  const decided: {order: string; body: Record<string, unknown>}[] = [];
  const asked: (string | null)[] = [];
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json((opts.rights ?? finance) as never)),
    http.get(origin + '/api/admin/v1/cash-disputes', ({request}) => {
      const cursor = new URL(request.url).searchParams.get('cursor');
      asked.push(cursor);
      return HttpResponse.json((opts.pages ? opts.pages(cursor)
        : {disputes: [dispute()], page: {next_cursor: null, has_more: false}}) as never);
    }),
    http.post(origin + '/api/admin/v1/orders/:id/cash-dispute/decide', async ({request, params}) => {
      const body = await request.json() as Record<string, unknown>;
      decided.push({order: String(params.id), body});
      return opts.decide ? opts.decide() : HttpResponse.json(dispute({decision: body.decision, reason: body.reason,
        decided_by: me.member.id, decided_at: '2026-11-03T10:00:00Z', version: 4}) as never);
    }));
  return {decided, asked};
}

function mount(path = '/cash-disputes') {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={[path]}><AdminApp client={api} /></MemoryRouter>);
}

const line = 'Заказ 0d000000 · водитель d1000000 · долг пассажира 125.00 UAH · удержано 20.00 UAH · решить до '
  + '17.11.2099 09:00 UTC';
/** The row's line: the order's link and the words after it, in one span. */
const row = (_: string, element: Element | null) => element?.tagName === 'SPAN' && element.textContent === line;

describe('D1: the list', () => {
  it('each dispute in words, the order a link', async () => {
    handlers();
    mount();
    expect(await screen.findByText(row)).toBeTruthy();
    expect(screen.getByRole('link', {name: 'Заказ 0d000000'})).toHaveAttribute('href', '/orders/' + ORDER);
    expect(screen.queryByText(/просрочено/)).toBeNull();
    expect(screen.queryByRole('button', {name: 'Показать ещё'})).toBeNull();
  });

  it('past decide_by says overdue', async () => {
    handlers({pages: () => ({disputes: [dispute({decide_by: '2026-01-02T09:00:00Z'})],
      page: {next_cursor: null, has_more: false}})});
    mount();
    expect(await screen.findByText((_, e) => e?.tagName === 'SPAN'
      && /решить до 02\.01\.2026 09:00 UTC · просрочено$/.test(e.textContent ?? ''))).toBeTruthy();
  });

  it('the next page is asked with the cursor', async () => {
    const h = handlers({pages: cursor => cursor === 'c2'
      ? {disputes: [dispute({order_id: ORDER2})], page: {next_cursor: null, has_more: false}}
      : {disputes: [dispute()], page: {next_cursor: 'c2', has_more: true}}});
    const user = userEvent.setup();
    mount();
    await user.click(await screen.findByRole('button', {name: 'Показать ещё'}));
    await waitFor(() => expect(screen.getAllByRole('link', {name: 'Заказ 0d000000'})).toHaveLength(2));
    expect(h.asked).toEqual([null, 'c2']);
    expect(screen.queryByRole('button', {name: 'Показать ещё'})).toBeNull();
  });

  it('an empty list says so', async () => {
    handlers({pages: () => ({disputes: [], page: {next_cursor: null, has_more: false}})});
    mount();
    expect(await screen.findByText('Нерешённых споров нет.')).toBeTruthy();
  });
});

describe('D2: decide', () => {
  it.each([['Пассажир заплатил', 'RIDER_PAID'], ['Выплатить водителю', 'PAY_DRIVER'],
    ['Оставить удержание', 'KEEP_HELD']])('%s sends the decision with the version, and the dispute leaves',
    async (button, decision) => {
      const h = handlers();
      const user = userEvent.setup();
      mount();
      const item = (await screen.findByText(row)).closest('li') as HTMLElement;
      await user.type(within(item).getByLabelText('Причина решения'), 'Звонок пассажиру');
      await user.click(within(item).getByRole('button', {name: button}));
      await waitFor(() => expect(h.decided).toHaveLength(1));
      expect(h.decided[0]).toEqual({order: ORDER, body: {command_id: expect.any(String), expected_version: 3, decision,
        reason: 'Звонок пассажиру'}});
      await waitFor(() => expect(screen.queryByText(row)).toBeNull());
      expect(screen.getByText('Решение записано.')).toBeTruthy();
    });
});

describe('D3: refused before sending', () => {
  it.each([['no reason', '   '], ['a reason over 1000', 'x'.repeat(1001)]])('%s', async (_name, reason) => {
    const h = handlers();
    const user = userEvent.setup();
    mount();
    const item = (await screen.findByText(row)).closest('li') as HTMLElement;
    const input = within(item).getByLabelText('Причина решения');
    await user.click(input);
    await user.paste(reason);
    await user.click(within(item).getByRole('button', {name: 'Оставить удержание'}));
    expect(await screen.findByText('Нужна причина до 1000 знаков.')).toBeTruthy();
    expect(h.decided).toHaveLength(0);
  });
});

describe('D4: conflicts', () => {
  it.each(['STATE_CONFLICT', 'VERSION_CONFLICT'])('%s says so and reads the list again', async code => {
    const h = handlers({decide: () => HttpResponse.json(problem(409, code), {status: 409})});
    const user = userEvent.setup();
    mount();
    const item = (await screen.findByText(row)).closest('li') as HTMLElement;
    await user.type(within(item).getByLabelText('Причина решения'), 'Звонок');
    await user.click(within(item).getByRole('button', {name: 'Выплатить водителю'}));
    expect(await screen.findByText('Спор уже решён или изменён; список обновлён.')).toBeTruthy();
    await waitFor(() => expect(h.asked).toEqual([null, null]));
  });
});

describe('D5: access', () => {
  it('in the menu with finance.manage', async () => {
    handlers();
    mount('/');
    expect(await screen.findByRole('link', {name: 'Споры по наличным'})).toHaveAttribute('href', '/cash-disputes');
  });

  it('not in the menu without it, and nothing is asked', async () => {
    const h = handlers({rights: viewer});
    mount('/');
    expect(await screen.findByRole('link', {name: 'Заказы'})).toBeTruthy();
    expect(screen.queryByRole('link', {name: 'Споры по наличным'})).toBeNull();
    expect(h.asked).toHaveLength(0);
  });
});
