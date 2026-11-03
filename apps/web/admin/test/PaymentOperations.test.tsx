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

/** An order's card operations and a retry (#424): O1–O3 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const ORDER = '0d000000-0000-4000-8000-000000000001';
const OP1 = '01000000-0000-4000-8000-000000000001';
const S2 = 'a2000000-0000-4000-8000-000000000002';
const payments = {...me, effective_permissions: ['orders.view', 'payments.retry']};
const viewer = {...me, effective_permissions: ['orders.view']};
const op = (over: Record<string, unknown> = {}) => ({id: OP1, order_id: ORDER, type: 'CHARGE', state: 'DECLINED',
  amount_minor: 12500, currency: 'UAH', provider_status: '05', reason: 'Insufficient funds', retry_of: null,
  initiated_by: null, created_at: '2026-11-03T09:00:00Z', ...over});

function handlers(opts: {rights?: unknown; list?: () => unknown[] | Response; retry?: () => Response} = {}) {
  const retries: {id: string; body: Record<string, unknown>}[] = [];
  let reads = 0;
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json((opts.rights ?? payments) as never)),
    http.get(origin + '/api/admin/v1/orders/' + ORDER + '/timeline', () => HttpResponse.json({events: []} as never)),
    http.get(origin + '/api/admin/v1/orders/' + ORDER + '/fare', () => HttpResponse.json(problem(404, 'NOT_FOUND'),
      {status: 404})),
    http.get(origin + '/api/admin/v1/orders/' + ORDER + '/payment-operations', () => {
      reads++;
      const list = opts.list ? opts.list() : [op()];
      return list instanceof Response ? list : HttpResponse.json({operations: list} as never);
    }),
    http.post(origin + '/api/admin/v1/payment-operations/:id/retry', async ({request, params}) => {
      const body = await request.json() as Record<string, unknown>;
      retries.push({id: String(params.id), body});
      return opts.retry ? opts.retry() : HttpResponse.json(op({id: 'op2', state: 'PENDING', provider_status: null,
        reason: null, retry_of: OP1, initiated_by: S2, created_at: '2026-11-03T09:30:00Z'}) as never);
    }));
  return {retries, reads: () => reads};
}

function mount() {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={['/orders/' + ORDER]}><AdminApp client={api} /></MemoryRouter>);
}

const first = '03.11.2026 09:00 UTC · списание · 125.00 UAH · отклонено · 05 · Insufficient funds';

describe('O1: the list', () => {
  it('each operation in words', async () => {
    handlers();
    mount();
    expect(await screen.findByText(first)).toBeVisible();
  });

  it('no card payment', async () => {
    handlers({list: () => HttpResponse.json(problem(404, 'NOT_FOUND'), {status: 404})});
    mount();
    expect(await screen.findByText('Оплаты картой нет.')).toBeVisible();
  });

  it('without payments.retry nothing is shown or asked', async () => {
    const {reads} = handlers({rights: viewer});
    mount();
    await screen.findByText('Итоговой стоимости нет.');
    expect(screen.queryByText(first)).toBeNull();
    expect(reads()).toBe(0);
  });
});

describe('O2: retry', () => {
  it('a declined charge with a reason; the new operation added, the button gone', async () => {
    const {retries} = handlers();
    mount();
    const user = userEvent.setup();
    await screen.findByText(first);
    await user.type(screen.getByLabelText('Причина повтора'), 'Пассажир пополнил карту');
    await user.click(screen.getByRole('button', {name: 'Повторить списание'}));
    expect(await screen.findByText('03.11.2026 09:30 UTC · списание · 125.00 UAH · в ожидании · повтор, попросил a2000000'))
      .toBeVisible();
    expect(retries).toEqual([{id: OP1, body: {command_id: expect.any(String), reason: 'Пассажир пополнил карту'}}]);
    expect(screen.queryByRole('button', {name: 'Повторить списание'})).toBeNull();
  });

  it.each([
    ['already repeated', () => [op(), op({id: 'op2', state: 'DECLINED', retry_of: OP1, created_at: '2026-11-03T09:30:00Z'})],
      1],
    ['another operation pending', () => [op(), op({id: 'op3', type: 'REFUND', state: 'PENDING'})], 0],
    ['a declined refund', () => [op({type: 'REFUND'})], 0],
    ['a succeeded charge', () => [op({state: 'SUCCEEDED'})], 0]
  ])('not offered: %s', async (_name, list, expected) => {
    handlers({list});
    mount();
    await screen.findByText(/^03\.11\.2026 09:00 UTC/);
    expect(screen.queryAllByRole('button', {name: 'Повторить списание'})).toHaveLength(expected);
  });
});

describe('O3: refusals', () => {
  it('no reason sends nothing', async () => {
    const {retries} = handlers();
    mount();
    const user = userEvent.setup();
    await screen.findByText(first);
    await user.click(screen.getByRole('button', {name: 'Повторить списание'}));
    expect(await screen.findByText('Нужна причина.')).toBeVisible();
    expect(retries).toEqual([]);
  });

  it('PAYMENT_UNKNOWN says the result is not known yet', async () => {
    handlers({retry: () => HttpResponse.json(problem(409, 'PAYMENT_UNKNOWN'), {status: 409})});
    mount();
    const user = userEvent.setup();
    await screen.findByText(first);
    await user.type(screen.getByLabelText('Причина повтора'), 'r');
    await user.click(screen.getByRole('button', {name: 'Повторить списание'}));
    expect(await screen.findByText('Результат ещё неизвестен: система продолжает спрашивать банк. Не повторяйте.'))
      .toBeVisible();
  });

  it('another 409 reads the list again', async () => {
    const {reads} = handlers({retry: () => HttpResponse.json(problem(409, 'STATE_CONFLICT'), {status: 409})});
    mount();
    const user = userEvent.setup();
    await screen.findByText(first);
    await user.type(screen.getByLabelText('Причина повтора'), 'r');
    await user.click(screen.getByRole('button', {name: 'Повторить списание'}));
    expect(await screen.findByText('Повторить нельзя; список обновлён.')).toBeVisible();
    await waitFor(() => expect(reads()).toBe(2));
  });
});
