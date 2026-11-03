import {afterAll, afterEach, beforeAll, describe, expect, it, vi} from 'vitest';
import {render, screen, waitFor} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {MemoryRouter} from 'react-router-dom';
import {http, HttpResponse} from 'msw';
import {setupServer} from 'msw/node';
import {createApiClient} from '@blizz/api-client';
import {AdminApp} from '../src/App.js';
import {browserRefreshTokens} from '../src/storage.js';
import {cid, me, session} from '../../../../test/fixtures.js';

/** Support cases in the admin panel, on the operator's shared screen (#420): P2–P4 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const KYIV = {id: '5a000000-0000-4000-8000-000000000001', name: 'Київ'};
const agent = {...me, effective_permissions: ['support.manage']};
const CASE = 'c0000000-0000-4000-8000-000000000001';
const item = (over: Record<string, unknown> = {}) => ({id: CASE, number: 501, city_id: KYIV.id, category: 'LOST_ITEM',
  order_id: null, requester_type: 'CLIENT', requester_id: null, subject: 'Забыл зонт', priority: 'HIGH',
  state: 'OPEN', assigned_staff_id: null, resolution: null, respond_by: '2026-11-02T10:15:00Z', version: 3,
  created_at: '2026-11-02T10:00:00Z', updated_at: '2026-11-02T10:00:00Z', messages: [{id: 'e1', sequence: 1,
    author_type: 'CLIENT', author_id: null, visibility: 'PUBLIC', body: 'Оставил зонт в машине',
    created_at: '2026-11-02T10:01:00Z', attachments: []}], ...over});

function handlers(rights: unknown = agent) {
  const asked: {path: string; query: URLSearchParams; body: unknown}[] = [];
  const operator: string[] = [];
  server.use(
    http.all(origin + '/api/operator/*', ({request}) => {
      operator.push(new URL(request.url).pathname);
      return HttpResponse.json({}, {status: 404});
    }),
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(rights as never)),
    http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [KYIV]})),
    http.get(origin + '/api/admin/v1/support/cases', ({request}) => {
      asked.push({path: 'list', query: new URL(request.url).searchParams, body: null});
      return HttpResponse.json({cases: [item()], page: {next_cursor: null, has_more: false}} as never);
    }),
    http.get(origin + '/api/admin/v1/support/cases/' + CASE, () => HttpResponse.json(item() as never)),
    http.post(origin + '/api/admin/v1/support/cases/' + CASE + '/:action', async ({request, params}) => {
      asked.push({path: String(params.action), query: new URL(request.url).searchParams, body: await request.json()});
      return HttpResponse.json(item({version: 4, assigned_staff_id: me.member.id, state: 'IN_PROGRESS'}) as never);
    }));
  return {asked, operator};
}

function mount(path = '/support') {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={[path]}><AdminApp client={api} /></MemoryRouter>);
}

describe('P2: the admin queue', () => {
  it('the cases of the city, from the admin API only', async () => {
    const {asked, operator} = handlers();
    mount();
    expect(await screen.findByRole('button', {name: /№501/})).toBeVisible();
    expect(asked[0]!.query.get('city_id')).toBe(KYIV.id);
    expect(operator).toEqual([]);
  });
});

describe('P3: an admin case', () => {
  it('take it: the command goes to the admin API with the version', async () => {
    const {asked, operator} = handlers();
    mount();
    const user = userEvent.setup();
    await user.click(await screen.findByRole('button', {name: /№501/}));
    await screen.findByText(/Оставил зонт в машине/);
    await user.click(screen.getByRole('button', {name: 'Взять себе'}));
    await waitFor(() => expect(asked.filter(a => a.path !== 'list')).toHaveLength(1));
    const command = asked.find(a => a.path !== 'list')!;
    expect(command.path).toBe('assign');
    expect(command.body).toMatchObject({expected_version: 3, assignee_id: me.member.id});
    expect(operator).toEqual([]);
  });
});

describe('P4: who sees it', () => {
  it('support.manage has the menu entry', async () => {
    handlers();
    mount('/');
    expect(await screen.findByRole('link', {name: 'Обращения'})).toHaveAttribute('href', '/support');
  });

  it('others do not', async () => {
    handlers({...me, effective_permissions: ['geo.manage']});
    mount('/');
    await screen.findByRole('link', {name: 'Профиль'});
    expect(screen.queryByRole('link', {name: 'Обращения'})).toBeNull();
  });
});
