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

/** Card reconciliation runs and decisions on their differences (#431): R1–R6 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const RUN = '7a000000-0000-4000-8000-000000000001';
const ITEM = '1e000000-0000-4000-8000-000000000001';
const payments = {...me, effective_permissions: ['payments.retry']};
const viewer = {...me, effective_permissions: ['orders.view']};
const run = (over: Record<string, unknown> = {}) => ({id: RUN, merchant_id: '3e000000-0000-4000-8000-000000000001',
  day: '2026-11-02', period_from: '2026-11-01T22:00:00Z', period_to: '2026-11-02T22:00:00Z',
  observed_until: '2026-11-03T00:00:00Z', partial: false, state: 'OPEN', local_count: 120, provider_count: 121,
  item_count: 3, open_count: 2, failure_code: null, attempts: 1, created_at: '2026-11-03T01:00:00Z',
  updated_at: '2026-11-03T01:05:00Z', finished_at: '2026-11-03T01:05:00Z', version: 2, ...over});
const item = (over: Record<string, unknown> = {}) => ({id: ITEM, run_id: RUN, kind: 'AMOUNT',
  reference_fingerprint: 'a'.repeat(64), reference_display: 'CHARGE 01000000', local_operation_id: null,
  local_record_id: null, local_type: 'CHARGE', local_state: 'SUCCEEDED', local_amount_minor: 12500,
  local_currency: 'UAH', provider_type: 'SALE', provider_state: 'Approved', provider_status: '1000',
  provider_amount_minor: 12000, provider_currency: 'UAH', fee_minor: 250, provider_at: '2026-11-02T10:00:00Z',
  state: 'OPEN', decision: null, reason: null, resolved_by: null, resolved_at: null, version: 5, ...over});

const firstRun = '02.11.2026 · мерчант 3e000000 · расхождения: открыто 2 из 3 · у нас 120, у банка 121';
const firstItem = 'сумма · CHARGE 01000000 · у нас CHARGE SUCCEEDED 125.00 UAH · у банка SALE Approved 1000 '
  + '120.00 UAH · комиссия 2.50 · 02.11.2026 10:00 UTC';

function handlers(opts: {rights?: unknown; runs?: (cursor: string | null) => unknown;
  detail?: (after: string | null) => unknown; resolve?: () => Response} = {}) {
  const runAsks: (string | null)[] = [];
  const detailAsks: {after: string | null; cursor: string | null}[] = [];
  const resolved: {id: string; body: Record<string, unknown>}[] = [];
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json((opts.rights ?? payments) as never)),
    http.post(origin + '/api/admin/v1/payment-reconciliations/items/:id/resolve', async ({request, params}) => {
      const body = await request.json() as Record<string, unknown>;
      resolved.push({id: String(params.id), body});
      return opts.resolve ? opts.resolve() : HttpResponse.json(item({state: 'RESOLVED', decision: body.decision,
        reason: body.reason, resolved_by: me.member.id, resolved_at: '2026-11-03T09:00:00Z', version: 6}) as never);
    }),
    http.get(origin + '/api/admin/v1/payment-reconciliations/:runId', ({request}) => {
      const query = new URL(request.url).searchParams;
      detailAsks.push({after: query.get('after'), cursor: query.get('cursor')});
      return HttpResponse.json((opts.detail ? opts.detail(query.get('after'))
        : {run: run(), items: [item()], next: null}) as never);
    }),
    http.get(origin + '/api/admin/v1/payment-reconciliations', ({request}) => {
      const cursor = new URL(request.url).searchParams.get('cursor');
      runAsks.push(cursor);
      return HttpResponse.json((opts.runs ? opts.runs(cursor) : {runs: [run()], next_cursor: null}) as never);
    }));
  return {runAsks, detailAsks, resolved};
}

function mount(path: string) {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={[path]}><AdminApp client={api} /></MemoryRouter>);
}

/** A line made of a link and words after it, matched as one span. */
const spanned = (text: string | RegExp) => (_: string, e: Element | null) => e?.tagName === 'SPAN'
  && (typeof text === 'string' ? e.textContent === text : text.test(e.textContent ?? ''));

describe('R1: runs', () => {
  it('an open run in words, the day a link', async () => {
    handlers();
    mount('/reconciliations');
    expect(await screen.findByText(spanned(firstRun))).toBeTruthy();
    expect(screen.getByRole('link', {name: '02.11.2026'})).toHaveAttribute('href', '/reconciliations/' + RUN);
    expect(screen.queryByRole('button', {name: 'Показать ещё'})).toBeNull();
  });

  it('FAILED shows the code and attempts, never zeros', async () => {
    handlers({runs: () => ({runs: [run({state: 'FAILED', local_count: null, provider_count: null, item_count: null,
      open_count: null, failure_code: 'PROVIDER_TIMEOUT', attempts: 3})], next_cursor: null})});
    mount('/reconciliations');
    expect(await screen.findByText(spanned('02.11.2026 · мерчант 3e000000 · сбой: PROVIDER_TIMEOUT · попыток 3')))
      .toBeTruthy();
    expect(screen.queryByText(/0 из 0|у нас 0/)).toBeNull();
  });

  it.each([
    ['CLEAN', {state: 'CLEAN', item_count: 0, open_count: 0, provider_count: 120},
      '02.11.2026 · мерчант 3e000000 · без расхождений · у нас 120, у банка 120'],
    ['RUNNING', {state: 'RUNNING', local_count: null, provider_count: null, item_count: null, open_count: null},
      '02.11.2026 · мерчант 3e000000 · идёт'],
    ['partial', {partial: true}, firstRun + ' · неполный день']
  ])('%s in words', async (_name, over, text) => {
    handlers({runs: () => ({runs: [run(over)], next_cursor: null})});
    mount('/reconciliations');
    expect(await screen.findByText(spanned(text))).toBeTruthy();
  });

  it('the next page is asked with cursor = next_cursor', async () => {
    const h = handlers({runs: cursor => cursor === 'n2'
      ? {runs: [run({id: 'r2', day: '2026-11-01'})], next_cursor: null}
      : {runs: [run()], next_cursor: 'n2'}});
    const user = userEvent.setup();
    mount('/reconciliations');
    await user.click(await screen.findByRole('button', {name: 'Показать ещё'}));
    expect(await screen.findByRole('link', {name: '01.11.2026'})).toBeTruthy();
    expect(screen.getByRole('link', {name: '02.11.2026'})).toBeTruthy();
    expect(h.runAsks).toEqual([null, 'n2']);
    expect(screen.queryByRole('button', {name: 'Показать ещё'})).toBeNull();
  });
});

describe('R2: a run', () => {
  it('the run and its differences in words', async () => {
    handlers({detail: () => ({run: run(), items: [item(), item({id: 'i2', kind: 'MISSING_LOCALLY',
      reference_display: null, local_type: null, local_state: null, local_amount_minor: null, local_currency: null,
      fee_minor: null, state: 'RESOLVED', decision: 'EXPLAINED', reason: 'Возврат в другой день',
      resolved_at: '2026-11-03T09:00:00Z'})], next: null})});
    mount('/reconciliations/' + RUN);
    expect(await screen.findByText(firstItem)).toBeTruthy();
    expect(screen.getByText('нет у нас · у банка SALE Approved 1000 120.00 UAH · 02.11.2026 10:00 UTC · '
      + 'объяснено · Возврат в другой день')).toBeTruthy();
    expect(screen.getByText(firstRun)).toBeTruthy();
  });

  it('the next page is asked with after = next', async () => {
    const h = handlers({detail: after => after === 'i9'
      ? {run: run(), items: [item({id: 'i10', kind: 'CURRENCY'})], next: null}
      : {run: run(), items: [item()], next: 'i9'}});
    const user = userEvent.setup();
    mount('/reconciliations/' + RUN);
    await user.click(await screen.findByRole('button', {name: 'Показать ещё'}));
    expect(await screen.findByText(/^валюта · /)).toBeTruthy();
    expect(screen.getByText(firstItem)).toBeTruthy();
    expect(h.detailAsks).toEqual([{after: null, cursor: null}, {after: 'i9', cursor: null}]);
    expect(screen.queryByRole('button', {name: 'Показать ещё'})).toBeNull();
  });
});

describe('R3: decide', () => {
  it.each([['Объяснено', 'EXPLAINED', 'объяснено'], ['Исправлено вручную', 'CORRECTED_BY_HAND', 'исправлено вручную'],
    ['Передано выше', 'ESCALATED', 'передано выше']])('%s sends the version and replaces the row',
    async (button, decision, word) => {
      const h = handlers();
      const user = userEvent.setup();
      mount('/reconciliations/' + RUN);
      const row = (await screen.findByText(firstItem)).closest('li') as HTMLElement;
      await user.type(within(row).getByLabelText('Причина решения'), 'Сверил с кабинетом');
      await user.click(within(row).getByRole('button', {name: button}));
      await waitFor(() => expect(h.resolved).toHaveLength(1));
      expect(h.resolved[0]).toEqual({id: ITEM, body: {command_id: expect.any(String), expected_version: 5, decision,
        reason: 'Сверил с кабинетом'}});
      expect(await screen.findByText(firstItem + ' · ' + word + ' · Сверил с кабинетом')).toBeTruthy();
      expect(screen.queryByRole('button', {name: 'Объяснено'})).toBeNull();
    });

  it('no buttons on a resolved one', async () => {
    handlers({detail: () => ({run: run(), items: [item({state: 'RESOLVED', decision: 'ESCALATED', reason: 'Банк'})],
      next: null})});
    mount('/reconciliations/' + RUN);
    await screen.findByText(firstItem + ' · передано выше · Банк');
    expect(screen.queryByRole('button', {name: 'Объяснено'})).toBeNull();
    expect(screen.queryByLabelText('Причина решения')).toBeNull();
  });
});

describe('R4: refused before sending', () => {
  it.each([['no reason', '   '], ['a reason over 500', 'x'.repeat(501)]])('%s', async (_name, reason) => {
    const h = handlers();
    const user = userEvent.setup();
    mount('/reconciliations/' + RUN);
    const row = (await screen.findByText(firstItem)).closest('li') as HTMLElement;
    await user.click(within(row).getByLabelText('Причина решения'));
    await user.paste(reason);
    await user.click(within(row).getByRole('button', {name: 'Объяснено'}));
    expect(await screen.findByText('Нужна причина до 500 знаков.')).toBeTruthy();
    expect(h.resolved).toHaveLength(0);
  });
});

describe('R5: conflict', () => {
  it('a 409 says so and reads the run again from the first page', async () => {
    const h = handlers({resolve: () => HttpResponse.json(problem(409, 'STATE_CONFLICT'), {status: 409})});
    const user = userEvent.setup();
    mount('/reconciliations/' + RUN);
    const row = (await screen.findByText(firstItem)).closest('li') as HTMLElement;
    await user.type(within(row).getByLabelText('Причина решения'), 'Сверил');
    await user.click(within(row).getByRole('button', {name: 'Объяснено'}));
    expect(await screen.findByText('Расхождение уже решено или изменено; данные обновлены.')).toBeTruthy();
    await waitFor(() => expect(h.detailAsks).toHaveLength(2));
    expect(h.detailAsks[1]).toEqual({after: null, cursor: null});
  });
});

describe('R6: access', () => {
  it('in the menu with payments.retry', async () => {
    handlers();
    mount('/');
    expect(await screen.findByRole('link', {name: 'Сверки'})).toHaveAttribute('href', '/reconciliations');
  });

  it('not in the menu without it, and nothing is asked', async () => {
    const h = handlers({rights: viewer});
    mount('/');
    expect(await screen.findByRole('link', {name: 'Заказы'})).toBeTruthy();
    expect(screen.queryByRole('link', {name: 'Сверки'})).toBeNull();
    expect(h.runAsks).toHaveLength(0);
  });
});
