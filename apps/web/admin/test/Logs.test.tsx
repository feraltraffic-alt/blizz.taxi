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

/** Logs in the admin panel (#374): L1–L5 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const auditor = {...me, effective_permissions: ['audit.view']};
const CORR = 'cc000000-0000-4000-8000-000000000001';
const ORDER = '0d000000-0000-4000-8000-000000000001';
const change = (n: number, over: Record<string, unknown> = {}) => ({id: 'ch00000' + n + '-0000-4000-8000-000000000001',
  occurred_at: '2026-11-03T1' + n + ':00:00Z', actor_type: 'STAFF', actor_id: 's1', actor_role: 'OPERATOR',
  action: 'order.cancel', resource_type: 'order', resource_id: ORDER, reason: 'Пассажир передумал',
  before: '{"status":"SEARCHING"}', after: '<b>{"status":"CANCELLED"}</b>', correlation_id: CORR, ...over});
const activity = {id: 'ac000000-0000-4000-8000-000000000001', occurred_at: '2026-11-03T12:30:00Z', kind: 'REQUEST',
  staff_id: 's1', staff_login: 'anna.op', role: 'OPERATOR', audience: 'operator', method: 'POST',
  path: '/api/operator/v1/orders/{order_id}/cancel', resource_ids: {order_id: ORDER}, status: 200, outcome: 'OK',
  duration_ms: 40, client_ip: null, correlation_id: CORR};

function handlers(opts: {changes?: (q: URLSearchParams) => unknown; status?: number} = {}) {
  const asked = {changes: [] as URLSearchParams[], activity: [] as URLSearchParams[], trails: [] as string[]};
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(auditor as never)),
    http.get(origin + '/api/admin/v1/logs/changes', ({request}) => {
      const q = new URL(request.url).searchParams;
      asked.changes.push(q);
      if (opts.status) return HttpResponse.json(problem(opts.status, 'ACCESS_DENIED'), {status: opts.status});
      return HttpResponse.json((opts.changes ? opts.changes(q) : {changes: [change(2)],
        page: {next_cursor: null, has_more: false}}) as never);
    }),
    http.get(origin + '/api/admin/v1/logs/activity', ({request}) => {
      asked.activity.push(new URL(request.url).searchParams);
      return HttpResponse.json({entries: [activity], page: {next_cursor: null, has_more: false}} as never);
    }),
    http.get(origin + '/api/admin/v1/logs/correlation/:id', ({params}) => {
      asked.trails.push(String(params.id));
      return HttpResponse.json({found: [
        {type: 'STAFF_ACTIVITY', id: activity.id, order_id: null, at: '2026-11-03T12:30:00Z'},
        {type: 'ORDER_EVENT', id: '7', order_id: ORDER, at: '2026-11-03T12:30:01Z'}]} as never);
    }));
  return asked;
}

function mount(path = '/logs') {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={[path]}><AdminApp client={api} /></MemoryRouter>);
}

describe('L1: changes', () => {
  it('newest first, with the details as text', async () => {
    handlers({changes: () => ({changes: [change(3), change(2, {reason: null, resource_id: null})],
      page: {next_cursor: null, has_more: false}})});
    mount();
    const user = userEvent.setup();
    const rows = await screen.findAllByText(/ · order\.cancel · /);
    expect(rows.map(r => r.textContent)).toEqual([
      '03.11.2026 13:00 UTC · Оператор · order.cancel · order ' + ORDER + ' · Пассажир передумал',
      '03.11.2026 12:00 UTC · Оператор · order.cancel · order']);
    await user.click(screen.getAllByRole('button', {name: 'Подробнее'})[0]!);
    expect(screen.getByText('{"status":"SEARCHING"}')).toBeVisible();
    expect(screen.getByText('<b>{"status":"CANCELLED"}</b>')).toBeVisible();
    expect(document.querySelector('b')).toBeNull();
  });
});

describe('L2: filters', () => {
  it('only the filled ones; "more" keeps them and adds the cursor', async () => {
    const asked = handlers({changes: q => q.get('cursor') ? {changes: [change(1)], page: {next_cursor: null,
      has_more: false}} : {changes: [change(2)], page: {next_cursor: 'p2', has_more: true}}});
    mount();
    const user = userEvent.setup();
    await screen.findAllByText(/ · order\.cancel · /);
    await user.selectOptions(screen.getByLabelText('Роль'), 'OPERATOR');
    await user.type(screen.getByLabelText('Действие'), 'order.cancel');
    await user.type(screen.getByLabelText('Тип объекта'), 'order');
    await user.click(screen.getByRole('button', {name: 'Показать'}));
    await waitFor(() => expect(asked.changes).toHaveLength(2));
    await user.click(await screen.findByRole('button', {name: 'Ещё'}));
    await waitFor(() => expect(asked.changes).toHaveLength(3));
    expect(asked.changes.map(q => [...q.entries()])).toEqual([[],
      [['role', 'OPERATOR'], ['action', 'order.cancel'], ['resource_type', 'order']],
      [['role', 'OPERATOR'], ['action', 'order.cancel'], ['resource_type', 'order'], ['cursor', 'p2']]]);
  });

  it('activity by kind', async () => {
    const asked = handlers();
    mount();
    const user = userEvent.setup();
    await user.click(await screen.findByRole('button', {name: 'Действия'}));
    await screen.findByText(/anna\.op/);
    await user.selectOptions(screen.getByLabelText('Вид'), 'SIGN_IN');
    await user.click(screen.getByRole('button', {name: 'Показать'}));
    await waitFor(() => expect(asked.activity).toHaveLength(2));
    expect([...asked.activity[1]!.entries()]).toEqual([['kind', 'SIGN_IN']]);
  });
});

describe('L3: activity', () => {
  it('who, what and how it ended', async () => {
    handlers();
    mount();
    const user = userEvent.setup();
    await user.click(await screen.findByRole('button', {name: 'Действия'}));
    expect(await screen.findByText('03.11.2026 12:30 UTC · anna.op · Оператор · POST '
      + '/api/operator/v1/orders/{order_id}/cancel · 200 · OK')).toBeVisible();
  });
});

describe('L4: one request', () => {
  it('from a change: the trail with the order linked', async () => {
    const asked = handlers();
    mount();
    const user = userEvent.setup();
    await screen.findAllByText(/ · order\.cancel · /);
    await user.click(screen.getAllByRole('button', {name: 'Весь запрос'})[0]!);
    expect(await screen.findByText('03.11.2026 12:30 UTC · STAFF_ACTIVITY · ' + activity.id)).toBeVisible();
    expect(screen.getByRole('link', {name: 'заказ'})).toHaveAttribute('href', '/orders/' + ORDER);
    expect(asked.trails).toEqual([CORR]);
  });

  it('typed as a UUID', async () => {
    const asked = handlers();
    mount();
    const user = userEvent.setup();
    await user.type(await screen.findByLabelText('Идентификатор запроса'), CORR);
    await user.click(screen.getByRole('button', {name: 'Найти запрос'}));
    await waitFor(() => expect(asked.trails).toEqual([CORR]));
  });

  it('not a UUID sends nothing', async () => {
    const asked = handlers();
    mount();
    const user = userEvent.setup();
    await user.type(await screen.findByLabelText('Идентификатор запроса'), 'cc000000-zzzz');
    await user.click(screen.getByRole('button', {name: 'Найти запрос'}));
    expect(await screen.findByText('Идентификатор — вида 0f8fad5b-d9cb-469f-a165-70867728950e.')).toBeVisible();
    expect(asked.trails).toEqual([]);
  });
});

describe('L5: not allowed', () => {
  it('a 403 is told', async () => {
    handlers({status: 403});
    mount();
    expect(await screen.findByText('Нет доступа к журналам.')).toBeVisible();
  });
});
