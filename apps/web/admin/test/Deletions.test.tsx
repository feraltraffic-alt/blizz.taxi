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

/** Account deletion requests (#386): D1–D6 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const C1 = 'c1000000-0000-4000-8000-000000000001';
const C2 = 'c2000000-0000-4000-8000-000000000002';
const D1 = 'd1000000-0000-4000-8000-000000000001';
const rights = (...permissions: string[]) => ({...me, effective_permissions: permissions});
const free = {active_order_id: null, debt: [], open_support_cases: 0, bonuses_to_burn: [{currency: 'UAH',
  amount_minor: 5000}], blocked: false};
const client = (id: string, over: Record<string, unknown> = {}) => ({client_id: id, previous_state: 'ACTIVE',
  requested_at: '2026-11-01T10:00:00Z', blockers: free, ...over});
const blockedClient = client(C2, {previous_state: 'BLOCKED', requested_at: '2026-11-02T10:00:00Z', blockers: {
  active_order_id: '0d000000-0000-4000-8000-000000000001', debt: [{currency: 'UAH', amount_minor: 12000}],
  open_support_cases: 2, bonuses_to_burn: [], blocked: true}});
const driver = {driver_id: D1, previous_state: 'ACTIVE', requested_at: '2026-11-01T12:00:00Z', blockers: {
  active_work: ['TRIP', 'RESERVATION'], debt: [{currency: 'PLN', amount_minor: 3550}], open_cash_disputes: 1,
  blocked: true}};

function handlers(opts: {who?: unknown; clients?: (q: URLSearchParams) => unknown;
  decide?: () => Response} = {}) {
  const asked = {clients: [] as URLSearchParams[], drivers: 0};
  const decisions: {path: string; body: Record<string, unknown>}[] = [];
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json((opts.who ?? rights('clients.delete',
      'drivers.delete')) as never)),
    http.get(origin + '/api/admin/v1/client-deletions', ({request}) => {
      const q = new URL(request.url).searchParams;
      asked.clients.push(q);
      return HttpResponse.json((opts.clients ? opts.clients(q) : {requests: [client(C1), blockedClient],
        page: {next_cursor: null, has_more: false}}) as never);
    }),
    http.get(origin + '/api/admin/v1/driver-deletions', () => {
      asked.drivers++;
      return HttpResponse.json({requests: [driver], page: {next_cursor: null, has_more: false}} as never);
    }),
    http.post(origin + '/api/admin/v1/:kind/:id/:action', async ({request, params}) => {
      decisions.push({path: params.kind + '/' + params.id + '/' + params.action,
        body: await request.json() as Record<string, unknown>});
      return opts.decide ? opts.decide() : HttpResponse.json({client_id: params.id,
        account_state: params.action === 'complete' ? 'ANONYMIZED' : 'ACTIVE'} as never);
    }));
  return {asked, decisions};
}

function mount() {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={['/deletions']}><AdminApp client={api} /></MemoryRouter>);
}

const row = async (id: string) => (await screen.findByText(new RegExp('^' + id.slice(0, 8))))
  .closest('li') as HTMLElement;

describe('D1: lists', () => {
  it('riders and drivers with what blocks them', async () => {
    handlers();
    mount();
    const free1 = await row(C1);
    expect(within(free1).getByText(C1.slice(0, 8) + ' · запрошено 01.11.2026 · вернётся в: активен')).toBeVisible();
    expect(within(free1).getByText('Сгорят бонусы: 50.00 UAH')).toBeVisible();
    const blocked = await row(C2);
    expect(within(blocked).getByText('Активный заказ')).toBeVisible();
    expect(within(blocked).getByText('Долг: 120.00 UAH')).toBeVisible();
    expect(within(blocked).getByText('Открытых обращений: 2')).toBeVisible();
    const d = await row(D1);
    expect(within(d).getByText('Не закончено: поездка, бронь')).toBeVisible();
    expect(within(d).getByText('Долг: 35.50 PLN')).toBeVisible();
    expect(within(d).getByText('Споров о наличных: 1')).toBeVisible();
  });

  it('"more" reads riders by cursor', async () => {
    const {asked} = handlers({clients: q => q.get('cursor') ? {requests: [blockedClient], page: {next_cursor: null,
      has_more: false}} : {requests: [client(C1)], page: {next_cursor: 'p2', has_more: true}}});
    mount();
    const user = userEvent.setup();
    await row(C1);
    await user.click(screen.getByRole('button', {name: 'Ещё запросы пассажиров'}));
    await row(C2);
    expect(asked.clients.map(q => q.get('cursor'))).toEqual([null, 'p2']);
  });
});

describe('D2: complete', () => {
  it('after the tick, with the reason; the row goes', async () => {
    const {decisions} = handlers();
    mount();
    const user = userEvent.setup();
    const r = await row(C1);
    await user.type(within(r).getByLabelText('Причина решения'), 'Просьба пассажира');
    await user.click(within(r).getByRole('checkbox', {name: 'Понимаю: это необратимо'}));
    await user.click(within(r).getByRole('button', {name: 'Удалить аккаунт'}));
    expect(await screen.findByText('Аккаунт обезличен.')).toBeVisible();
    expect(decisions).toEqual([{path: 'client-deletions/' + C1 + '/complete', body: {command_id: expect.any(String),
      reason: 'Просьба пассажира'}}]);
    expect(screen.queryByText(new RegExp('^' + C1.slice(0, 8)))).toBeNull();
  });
});

describe('D3: reject', () => {
  it('a blocked driver request can be rejected', async () => {
    const {decisions} = handlers();
    mount();
    const user = userEvent.setup();
    const r = await row(D1);
    await user.type(within(r).getByLabelText('Причина решения'), 'Есть долг');
    await user.click(within(r).getByRole('button', {name: 'Отклонить запрос'}));
    expect(await screen.findByText('Запрос отклонён.')).toBeVisible();
    expect(decisions).toEqual([{path: 'driver-deletions/' + D1 + '/reject', body: {command_id: expect.any(String),
      reason: 'Есть долг'}}]);
  });
});

describe('D4: refused on the screen', () => {
  it('without the tick nothing is sent', async () => {
    const {decisions} = handlers();
    mount();
    const user = userEvent.setup();
    const r = await row(C1);
    await user.type(within(r).getByLabelText('Причина решения'), 'r');
    await user.click(within(r).getByRole('button', {name: 'Удалить аккаунт'}));
    expect(await screen.findByText('Нужна причина до 500 символов, а для удаления — отметка «Понимаю».')).toBeVisible();
    expect(decisions).toEqual([]);
  });

  it.each([['no reason', ''], ['a reason over 500', 'x'.repeat(501)]])('%s sends nothing', async (_name, why) => {
    const {decisions} = handlers();
    mount();
    const user = userEvent.setup();
    const r = await row(C1);
    if (why) {
      await user.click(within(r).getByLabelText('Причина решения'));
      await user.paste(why);
    }
    await user.click(within(r).getByRole('button', {name: 'Отклонить запрос'}));
    expect(await screen.findByText('Нужна причина до 500 символов, а для удаления — отметка «Понимаю».')).toBeVisible();
    expect(decisions).toEqual([]);
  });

  it('a blocked request cannot be completed', async () => {
    handlers();
    mount();
    const r = await row(C2);
    expect(within(r).getByRole('button', {name: 'Удалить аккаунт'})).toBeDisabled();
  });
});

describe('D5: a server refusal', () => {
  it('a 409 is told and the list read again', async () => {
    const {asked} = handlers({decide: () => HttpResponse.json(problem(409, 'STATE_CONFLICT'), {status: 409})});
    mount();
    const user = userEvent.setup();
    const r = await row(C1);
    await user.type(within(r).getByLabelText('Причина решения'), 'r');
    await user.click(within(r).getByRole('checkbox', {name: 'Понимаю: это необратимо'}));
    await user.click(within(r).getByRole('button', {name: 'Удалить аккаунт'}));
    expect(await screen.findByText('Появилось препятствие; список обновлён.')).toBeVisible();
    await waitFor(() => expect(asked.clients).toHaveLength(2));
  });
});

describe('D6: who sees what', () => {
  it('clients.delete only: riders only', async () => {
    const {asked} = handlers({who: rights('clients.delete')});
    mount();
    await row(C1);
    expect(screen.queryByText(new RegExp('^' + D1.slice(0, 8)))).toBeNull();
    expect(asked.drivers).toBe(0);
  });

  it('drivers.delete only: drivers only', async () => {
    const {asked} = handlers({who: rights('drivers.delete')});
    mount();
    await row(D1);
    expect(asked.clients).toHaveLength(0);
  });

  it('neither: no section in the menu', async () => {
    handlers({who: rights('geo.manage')});
    const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
      correlationId: () => cid, initialSession: session});
    render(<MemoryRouter initialEntries={['/']}><AdminApp client={api} /></MemoryRouter>);
    await screen.findByRole('link', {name: 'Профиль'});
    expect(screen.queryByRole('link', {name: 'Удаление аккаунтов'})).toBeNull();
  });

  it('either: in the menu', async () => {
    handlers({who: rights('drivers.delete')});
    const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
      correlationId: () => cid, initialSession: session});
    render(<MemoryRouter initialEntries={['/']}><AdminApp client={api} /></MemoryRouter>);
    expect(await screen.findByRole('link', {name: 'Удаление аккаунтов'})).toBeVisible();
  });
});
