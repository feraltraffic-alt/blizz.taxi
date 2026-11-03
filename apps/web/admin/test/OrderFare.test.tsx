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

/** An order's final fare and its correction (#422): F1–F4 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const ORDER = '0d000000-0000-4000-8000-000000000001';
const S2 = 'a2000000-0000-4000-8000-000000000002';
const corrector = {...me, effective_permissions: ['orders.view', 'fares.correct']};
const viewer = {...me, effective_permissions: ['orders.view']};
const v1 = {id: 'f1', version: 1, amount_minor: 12500, commission_minor: 1875, driver_share_minor: 10625,
  created_at: '2026-11-02T10:30:00Z', corrects_id: null, reason: null, author_id: null};
const fare = (over: Record<string, unknown> = {}) => ({order_id: ORDER, currency: 'UAH', current_version: 1,
  versions: [v1], refund_obligation_minor: 0, refund_state: 'NONE', accounting: 'POSTED', ...over});

function handlers(opts: {rights?: unknown; fare?: () => Response; correct?: () => Response} = {}) {
  const corrections: Record<string, unknown>[] = [];
  let reads = 0;
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json((opts.rights ?? corrector) as never)),
    http.get(origin + '/api/admin/v1/orders/' + ORDER + '/timeline', () => HttpResponse.json({events: []} as never)),
    http.get(origin + '/api/admin/v1/orders/' + ORDER + '/fare', () => {
      reads++;
      return opts.fare ? opts.fare() : HttpResponse.json(fare() as never);
    }),
    http.post(origin + '/api/admin/v1/orders/' + ORDER + '/fare-corrections', async ({request}) => {
      const body = await request.json() as Record<string, unknown>;
      corrections.push(body);
      return opts.correct ? opts.correct() : HttpResponse.json(fare({current_version: 2, versions: [v1, {id: 'f2',
        version: 2, amount_minor: body.amount_minor, commission_minor: 1575, driver_share_minor: 8925,
        created_at: '2026-11-03T09:00:00Z', corrects_id: 'f1', reason: body.reason, author_id: S2}],
      refund_obligation_minor: 2000, refund_state: 'WAITING_FOR_REFUND_FLOW'}) as never);
    }));
  return {corrections, reads: () => reads};
}

function mount() {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={['/orders/' + ORDER]}><AdminApp client={api} /></MemoryRouter>);
}

async function open() {
  mount();
  const user = userEvent.setup();
  await screen.findByText('v1 · 125.00 UAH · комиссия 18.75 · водителю 106.25');
  return user;
}

async function correct(user: ReturnType<typeof userEvent.setup>, amount = '105', reason = 'Пробка не по вине',
  own = 'Admin-Pass-2026') {
  if (amount) await user.type(screen.getByLabelText('Правильная стоимость'), amount);
  if (reason) {
    await user.click(screen.getByLabelText('Причина исправления'));
    await user.paste(reason);
  }
  if (own) await user.type(screen.getByLabelText('Ваш пароль для исправления'), own);
  await user.click(screen.getByRole('button', {name: 'Исправить стоимость'}));
}

describe('F1: the fare', () => {
  it('the first version', async () => {
    handlers();
    await open();
    expect(screen.queryByText(/^Должны пассажиру/)).toBeNull();
  });

  it('no final fare yet', async () => {
    handlers({fare: () => HttpResponse.json(problem(404, 'NOT_FOUND'), {status: 404})});
    mount();
    expect(await screen.findByText('Итоговой стоимости нет.')).toBeVisible();
  });
});

describe('F2: correct', () => {
  it('in minor units with the version, the reason and the own password; the answer shown; the password emptied',
    async () => {
      const {corrections} = handlers();
      const user = await open();
      await correct(user);
      expect(await screen.findByText('v2 · 105.00 UAH · комиссия 15.75 · водителю 89.25 · Пробка не по вине · '
        + 'сотрудник a2000000')).toBeVisible();
      expect(screen.getByText('Должны пассажиру 20.00 UAH — ждёт возврата; вручную не возвращать.')).toBeVisible();
      expect(corrections).toEqual([{command_id: expect.any(String), expected_version: 1, amount_minor: 10500,
        reason: 'Пробка не по вине', password: 'Admin-Pass-2026'}]);
      expect(screen.getByLabelText('Ваш пароль для исправления')).toHaveValue('');
    });

  it('without fares.correct there is no form', async () => {
    handlers({rights: viewer});
    await open();
    expect(screen.queryByRole('button', {name: 'Исправить стоимость'})).toBeNull();
  });
});

describe('F3: refused on the screen', () => {
  it.each([['three decimals', '1.005', 'r', 'p'], ['the same amount', '125', 'r', 'p'], ['no reason', '105', '', 'p'],
    ['a reason over 500', '105', 'x'.repeat(501), 'p'], ['no own password', '105', 'r', '']])(
    '%s sends nothing', async (_name, amount, reason, own) => {
      const {corrections} = handlers();
      const user = await open();
      await correct(user, amount, reason, own);
      expect(await screen.findByText(/^Новая стоимость — другая/)).toBeVisible();
      expect(corrections).toEqual([]);
    });
});

describe('F4: server refusals', () => {
  it('a 403: the own password did not fit and is emptied', async () => {
    handlers({correct: () => HttpResponse.json(problem(403, 'ACCESS_DENIED'), {status: 403})});
    const user = await open();
    await correct(user, '105', 'r', 'wrong');
    expect(await screen.findByText('Ваш пароль не подошёл.')).toBeVisible();
    expect(screen.getByLabelText('Ваш пароль для исправления')).toHaveValue('');
  });

  it('a 409 PAYMENT_PENDING: a payment is under way', async () => {
    handlers({correct: () => HttpResponse.json(problem(409, 'PAYMENT_PENDING'), {status: 409})});
    const user = await open();
    await correct(user);
    expect(await screen.findByText('Оплата ещё идёт; исправьте позже.')).toBeVisible();
  });

  it('another 409: the fare is read again', async () => {
    const {reads} = handlers({correct: () => HttpResponse.json(problem(409, 'VERSION_CONFLICT'), {status: 409})});
    const user = await open();
    await correct(user);
    expect(await screen.findByText('Стоимость изменилась или заказ не выполнен; показано текущее.')).toBeVisible();
    await waitFor(() => expect(reads()).toBe(2));
  });
});
