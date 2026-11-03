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

/** An order's chargebacks, recorded by hand and resolved (#426): C1–C6 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const ORDER = '0d000000-0000-4000-8000-000000000001';
const CB1 = 'cb000000-0000-4000-8000-000000000001';
const payments = {...me, effective_permissions: ['orders.view', 'payments.retry']};
const operation = {id: '01000000-0000-4000-8000-000000000001', order_id: ORDER, type: 'SETTLE', state: 'SUCCEEDED',
  amount_minor: 12500, currency: 'UAH', provider_status: null, reason: null, retry_of: null, initiated_by: null,
  created_at: '2026-10-30T09:00:00Z'};
const cb = (over: Record<string, unknown> = {}) => ({id: CB1, order_id: ORDER, amount_minor: 5000, currency: 'UAH',
  bank_reason: 'Fraud 4837', received_on: '2026-11-01', state: 'OPEN', resolution_reason: null,
  created_at: '2026-11-01T10:00:00Z', resolved_at: null, version: 0, ...over});

type Sent = {path: string; body: Record<string, unknown>};

function handlers(opts: {list?: () => unknown[]; operations?: () => Response; record?: () => Response;
  resolve?: () => Response} = {}) {
  const sent: Sent[] = [];
  let reads = 0;
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(payments as never)),
    http.get(origin + '/api/admin/v1/orders/' + ORDER + '/timeline', () => HttpResponse.json({events: []} as never)),
    http.get(origin + '/api/admin/v1/orders/' + ORDER + '/fare', () => HttpResponse.json(problem(404, 'NOT_FOUND'),
      {status: 404})),
    http.get(origin + '/api/admin/v1/orders/' + ORDER + '/payment-operations', () => opts.operations
      ? opts.operations() : HttpResponse.json({operations: [operation]} as never)),
    http.get(origin + '/api/admin/v1/orders/' + ORDER + '/chargebacks', () => {
      reads++;
      return HttpResponse.json({chargebacks: opts.list ? opts.list() : [cb()]} as never);
    }),
    http.post(origin + '/api/admin/v1/orders/' + ORDER + '/chargebacks/:id/resolve', async ({request, params}) => {
      const body = await request.json() as Record<string, unknown>;
      sent.push({path: 'resolve/' + String(params.id), body});
      return opts.resolve ? opts.resolve() : HttpResponse.json(cb({state: body.outcome, resolution_reason: body.reason,
        resolved_at: '2026-11-02T12:00:00Z', version: 1}) as never);
    }),
    http.post(origin + '/api/admin/v1/orders/' + ORDER + '/chargebacks', async ({request}) => {
      const body = await request.json() as Record<string, unknown>;
      sent.push({path: 'record', body});
      return opts.record ? opts.record() : HttpResponse.json(cb({id: 'cb2', amount_minor: body.amount_minor,
        bank_reason: body.bank_reason, received_on: body.received_on}) as never, {status: 201});
    }));
  return {sent, reads: () => reads};
}

function mount() {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={['/orders/' + ORDER]}><AdminApp client={api} /></MemoryRouter>);
}

const open = '01.11.2026 · 50.00 UAH · Fraud 4837 · открыт';

async function fill(user: ReturnType<typeof userEvent.setup>, amount: string, reason: string, date: string) {
  if (amount) await user.type(screen.getByLabelText('Сумма чарджбэка'), amount);
  if (reason) await user.type(screen.getByLabelText('Причина банка'), reason);
  if (date) await user.type(screen.getByLabelText('Дата уведомления банка (ГГГГ-ММ-ДД)'), date);
  await user.click(screen.getByRole('button', {name: 'Записать чарджбэк'}));
}

describe('C1: the list', () => {
  it('an open and a resolved chargeback in words', async () => {
    handlers({list: () => [cb(), cb({id: 'cb2', state: 'WON', resolution_reason: 'Деньги вернулись',
      resolved_at: '2026-11-02T12:00:00Z', version: 1})]});
    mount();
    expect(await screen.findByText(open)).toBeTruthy();
    expect(screen.getByText('01.11.2026 · 50.00 UAH · Fraud 4837 · выигран · Деньги вернулись · 02.11.2026'))
      .toBeTruthy();
  });

  it('not shown when the order has no card payment', async () => {
    const h = handlers({operations: () => HttpResponse.json(problem(404, 'NOT_FOUND'), {status: 404})});
    mount();
    expect(await screen.findByText('Оплаты картой нет.')).toBeTruthy();
    expect(screen.queryByText('Чарджбэки')).toBeNull();
    expect(h.reads()).toBe(0);
  });
});

describe('C2: record', () => {
  it('sends the contract body in the card payment currency and adds the answer', async () => {
    const h = handlers({list: () => []});
    const user = userEvent.setup();
    mount();
    await screen.findByText('Чарджбэки');
    await fill(user, '50', 'Fraud 4837', '2026-11-01');
    await waitFor(() => expect(h.sent).toHaveLength(1));
    expect(h.sent[0]).toEqual({path: 'record', body: {command_id: expect.any(String), amount_minor: 5000,
      currency: 'UAH', bank_reason: 'Fraud 4837', received_on: '2026-11-01'}});
    expect(await screen.findByText(open)).toBeTruthy();
    expect((screen.getByLabelText('Сумма чарджбэка') as HTMLInputElement).value).toBe('');
    expect((screen.getByLabelText('Причина банка') as HTMLInputElement).value).toBe('');
    expect((screen.getByLabelText('Дата уведомления банка (ГГГГ-ММ-ДД)') as HTMLInputElement).value).toBe('');
  });
});

const tomorrow = new Date(Date.now() + 36 * 3600 * 1000).toISOString().slice(0, 10);

describe('C3: record refused before sending', () => {
  it.each([
    ['amount zero', '0', 'Fraud', '2026-11-01'],
    ['amount with three decimals', '1.005', 'Fraud', '2026-11-01'],
    ['no amount', '', 'Fraud', '2026-11-01'],
    ['empty bank reason', '50', '   ', '2026-11-01'],
    ['bank reason over 500', '50', 'x'.repeat(501), '2026-11-01'],
    ['date in another form', '50', 'Fraud', '01.11.2026'],
    ['date that does not exist', '50', 'Fraud', '2026-02-30'],
    ['date after today', '50', 'Fraud', tomorrow]
  ])('%s', async (_name, amount, reason, date) => {
    const h = handlers({list: () => []});
    const user = userEvent.setup();
    mount();
    await screen.findByText('Чарджбэки');
    await fill(user, amount, reason, date);
    expect(await screen.findByText('Нужны сумма, причина банка до 500 знаков и дата не позже сегодняшней (UTC).'))
      .toBeTruthy();
    expect(h.sent).toHaveLength(0);
  });
});

describe('C4: record refused by the server', () => {
  it('CHARGEBACK_NOT_ALLOWED names what may be wrong', async () => {
    handlers({list: () => [], record: () => HttpResponse.json(problem(422, 'CHARGEBACK_NOT_ALLOWED'), {status: 422})});
    const user = userEvent.setup();
    mount();
    await screen.findByText('Чарджбэки');
    await fill(user, '50', 'Fraud', '2026-11-01');
    expect(await screen.findByText('Записать нельзя: заказ оплачен не картой, в другой валюте, или сумма больше '
      + 'оставшейся оплаты картой.')).toBeTruthy();
  });
});

describe('C5: resolve', () => {
  it.each([['Выигран', 'WON', 'выигран'], ['Проигран', 'LOST', 'проигран']])('%s sends the outcome and replaces the row',
    async (button, outcome, word) => {
      const h = handlers();
      const user = userEvent.setup();
      mount();
      const row = (await screen.findByText(open)).closest('li') as HTMLElement;
      await user.type(within(row).getByLabelText('Причина решения'), 'Ответ банка');
      await user.click(within(row).getByRole('button', {name: button}));
      await waitFor(() => expect(h.sent).toHaveLength(1));
      expect(h.sent[0]).toEqual({path: 'resolve/' + CB1, body: {command_id: expect.any(String), expected_version: 0,
        outcome, reason: 'Ответ банка'}});
      expect(await screen.findByText('01.11.2026 · 50.00 UAH · Fraud 4837 · ' + word + ' · Ответ банка · 02.11.2026'))
        .toBeTruthy();
      expect(screen.queryByRole('button', {name: 'Выигран'})).toBeNull();
    });

  it.each(['WON', 'LOST'])('no buttons on a resolved one (%s)', async state => {
    handlers({list: () => [cb({state, resolution_reason: 'Решено', resolved_at: '2026-11-02T12:00:00Z', version: 1})]});
    mount();
    await screen.findByText(/Fraud 4837 · (выигран|проигран)/);
    expect(screen.queryByRole('button', {name: 'Выигран'})).toBeNull();
    expect(screen.queryByRole('button', {name: 'Проигран'})).toBeNull();
    expect(screen.queryByLabelText('Причина решения')).toBeNull();
  });

  it('no reason sends nothing', async () => {
    const h = handlers();
    const user = userEvent.setup();
    mount();
    const row = (await screen.findByText(open)).closest('li') as HTMLElement;
    await user.type(within(row).getByLabelText('Причина решения'), '   ');
    await user.click(within(row).getByRole('button', {name: 'Проигран'}));
    expect(await screen.findByText('Нужна причина решения до 500 знаков.')).toBeTruthy();
    expect(h.sent).toHaveLength(0);
  });
});

describe('C6: resolve conflicts', () => {
  it.each(['STATE_CONFLICT', 'VERSION_CONFLICT'])('%s says so and reads the list again', async code => {
    const h = handlers({resolve: () => HttpResponse.json(problem(409, code), {status: 409})});
    const user = userEvent.setup();
    mount();
    const row = (await screen.findByText(open)).closest('li') as HTMLElement;
    await user.type(within(row).getByLabelText('Причина решения'), 'Ответ банка');
    await user.click(within(row).getByRole('button', {name: 'Выигран'}));
    expect(await screen.findByText('Чарджбэк уже решён или изменён; список обновлён.')).toBeTruthy();
    await waitFor(() => expect(h.reads()).toBe(2));
  });
});
