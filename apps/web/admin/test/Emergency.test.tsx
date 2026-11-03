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

/** Emergency access (#373): G1–G7 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const superAdmin = {...me, member: {...me.member, profile: {...me.member.profile, role: 'SUPER_ADMIN'}},
  effective_permissions: []};
const KYIV = {id: '5a000000-0000-4000-8000-000000000001', name: 'Київ'};
const LVIV = {id: '5a000000-0000-4000-8000-000000000002', name: 'Львів'};
const STAFF = 'a1000000-0000-4000-8000-000000000001';
const GRANT = 'e9000000-0000-4000-8000-000000000001';
const member = {id: STAFF, login: 'anna.op', state: 'ACTIVE', password_change_required: false, version: 2,
  profile: {first_name: 'Анна', last_name: 'Коваль', contacts: {phone: '+380671111111'}, role: 'OPERATOR',
    permissions: ['orders.create'], all_cities: false, city_ids: [KYIV.id]}};
const grant = (over: Record<string, unknown> = {}) => ({id: GRANT, staff_id: STAFF, permissions: ['orders.view'],
  all_cities: true, city_ids: [], reason: 'Ночная смена без админа', granted_by: me.member.id,
  granted_at: '2026-11-03T13:30:00Z', expires_at: '2026-11-03T15:30:00Z', revoked_at: null, revoked_by: null,
  revoke_reason: null, active: true, ...over});

function handlers(opts: {rights?: unknown; give?: () => Response; grants?: () => unknown[]; revoke?: () => Response;
  mine?: () => unknown[]} = {}) {
  const gives: Record<string, unknown>[] = [];
  const revokes: Record<string, unknown>[] = [];
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json((opts.rights ?? superAdmin) as never)),
    http.get(origin + '/api/admin/v1/me/emergency-grants', () => HttpResponse.json({grants: opts.mine ? opts.mine()
      : []} as never)),
    http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [KYIV, LVIV]})),
    http.get(origin + '/api/admin/v1/permissions', () => HttpResponse.json({permissions: [
      {code: 'orders.create', group: 'Orders', description: 'Create phone orders'},
      {code: 'orders.view', group: 'Orders', description: 'View orders'}]})),
    http.get(origin + '/api/admin/v1/staff', () => HttpResponse.json({staff: [member]} as never)),
    http.get(origin + '/api/admin/v1/staff/' + STAFF, () => HttpResponse.json(member as never)),
    http.get(origin + '/api/admin/v1/staff/' + me.member.id, () => HttpResponse.json({...member, id: me.member.id,
      login: 'admin-fixture'} as never)),
    http.post(origin + '/api/admin/v1/staff/' + STAFF + '/emergency-grants', async ({request}) => {
      gives.push(await request.json() as Record<string, unknown>);
      return opts.give ? opts.give() : HttpResponse.json(grant() as never, {status: 201});
    }),
    http.get(origin + '/api/admin/v1/emergency-grants', () => HttpResponse.json({grants: opts.grants ? opts.grants()
      : [grant()]} as never)),
    http.post(origin + '/api/admin/v1/emergency-grants/' + GRANT + '/revoke', async ({request}) => {
      revokes.push(await request.json() as Record<string, unknown>);
      return opts.revoke ? opts.revoke() : HttpResponse.json(grant({active: false,
        revoked_at: '2026-11-03T14:00:00Z', revoke_reason: 'Админ на месте'}) as never);
    }),
    http.get(origin + '/api/admin/v1/emergency-grants/' + GRANT + '/activity', () => HttpResponse.json({activity: [
      {at: '2026-11-03T13:40:00Z', method: 'GET', path: '/api/admin/v1/orders', status: 200, outcome: 'OK'}]})));
  return {gives, revokes};
}

function mount(path: string) {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={[path]}><AdminApp client={api} /></MemoryRouter>);
}

async function openGive() {
  mount('/staff/' + STAFF + '/emergency');
  const user = userEvent.setup();
  await screen.findByRole('checkbox', {name: 'orders.view — View orders'});
  await screen.findByRole('checkbox', {name: 'Київ'});
  return user;
}

async function fill(user: ReturnType<typeof userEvent.setup>, over: {fn?: boolean; city?: string | null;
  minutes?: string; reason?: string; own?: string} = {}) {
  if (over.fn !== false) await user.click(screen.getByRole('checkbox', {name: 'orders.view — View orders'}));
  if (over.city !== null) await user.click(screen.getByRole('checkbox', {name: over.city ?? 'Київ'}));
  if (over.minutes !== undefined) {
    await user.clear(screen.getByLabelText('Минут'));
    if (over.minutes) await user.type(screen.getByLabelText('Минут'), over.minutes);
  }
  const reason = over.reason ?? 'Ночная смена без админа';
  if (reason) {
    await user.click(screen.getByLabelText('Причина'));
    await user.paste(reason);
  }
  const own = over.own ?? 'Super-Admin-Pass';
  if (own) await user.type(screen.getByLabelText('Ваш пароль'), own);
  await user.click(screen.getByRole('button', {name: 'Дать доступ'}));
}

describe('G1: give', () => {
  it('from the member page; one command; the own password emptied', async () => {
    const {gives} = handlers();
    mount('/staff/' + STAFF);
    const user = userEvent.setup();
    await user.click(await screen.findByRole('link', {name: 'Временный доступ: Коваль Анна'}));
    await screen.findByRole('checkbox', {name: 'orders.view — View orders'});
    await screen.findByRole('checkbox', {name: 'Київ'});
    expect(screen.getByLabelText('Минут')).toHaveValue('60');
    await fill(user);
    expect(await screen.findByText('Доступ выдан до 03.11.2026 15:30 UTC.')).toBeVisible();
    expect(gives).toEqual([{command_id: expect.any(String), permissions: ['orders.view'], all_cities: false,
      city_ids: [KYIV.id], minutes: 60, reason: 'Ночная смена без админа', password: 'Super-Admin-Pass'}]);
    expect(screen.getByLabelText('Ваш пароль')).toHaveValue('');
  });

  it('every city leaves city_ids out', async () => {
    const {gives} = handlers();
    const user = await openGive();
    await fill(user, {city: 'Все города', minutes: '480'});
    await waitFor(() => expect(gives).toHaveLength(1));
    expect(gives[0]).toEqual({command_id: expect.any(String), permissions: ['orders.view'], all_cities: true,
      minutes: 480, reason: 'Ночная смена без админа', password: 'Super-Admin-Pass'});
  });
});

describe('G2: refused on the screen', () => {
  it.each([
    ['no function', {fn: false}], ['no city', {city: null}], ['4 minutes', {minutes: '4'}],
    ['481 minutes', {minutes: '481'}], ['minutes not whole', {minutes: '30.5'}],
    ['a reason of 9 characters', {reason: 'Коротко12'}], ['a reason over 500', {reason: 'x'.repeat(501)}],
    ['no own password', {own: ''}]
  ] as const)('%s sends nothing', async (_name, over) => {
    const {gives} = handlers();
    const user = await openGive();
    await fill(user, over as Parameters<typeof fill>[1]);
    expect(await screen.findByText(/^Нужны функции, города/)).toBeVisible();
    expect(gives).toEqual([]);
  });
});

describe('G3: refusals', () => {
  it('never to oneself: no form', async () => {
    handlers();
    mount('/staff/' + me.member.id + '/emergency');
    expect(await screen.findByText('Себе временный доступ дать нельзя.')).toBeVisible();
    expect(screen.queryByRole('button', {name: 'Дать доступ'})).toBeNull();
  });

  it('a 403 says the own password did not fit, and it is emptied', async () => {
    handlers({give: () => HttpResponse.json(problem(403, 'ACCESS_DENIED'), {status: 403})});
    const user = await openGive();
    await fill(user, {own: 'wrong'});
    expect(await screen.findByText('Ваш пароль не подошёл.')).toBeVisible();
    expect(screen.getByLabelText('Ваш пароль')).toHaveValue('');
  });

  it('a 409 says the member is not active', async () => {
    handlers({give: () => HttpResponse.json(problem(409, 'STATE_CONFLICT'), {status: 409})});
    const user = await openGive();
    await fill(user);
    expect(await screen.findByText('Сотрудник не активен.')).toBeVisible();
  });
});

describe('G4: the list', () => {
  it('active first, with the login, functions, until when, state and reason', async () => {
    handlers({grants: () => [grant({id: 'old', active: false, expires_at: '2026-11-02T10:00:00Z'}), grant()]});
    mount('/');
    const user = userEvent.setup();
    await user.click(await screen.findByRole('link', {name: 'Временный доступ'}));
    const rows = await screen.findAllByText(/^anna\.op · orders\.view · до /);
    expect(rows.map(r => r.textContent)).toEqual([
      'anna.op · orders.view · до 03.11.2026 15:30 UTC · действует · Ночная смена без админа',
      'anna.op · orders.view · до 02.11.2026 10:00 UTC · закончился · Ночная смена без админа']);
  });
});

describe('G5: end', () => {
  it('with a reason; the answer replaces the row', async () => {
    const {revokes} = handlers();
    mount('/emergency');
    const user = userEvent.setup();
    await user.type(await screen.findByLabelText('Причина завершения: anna.op'), 'Админ на месте');
    await user.click(screen.getByRole('button', {name: 'Завершить: anna.op'}));
    expect(await screen.findByText(/· закончился · /)).toBeVisible();
    expect(revokes).toEqual([{command_id: expect.any(String), reason: 'Админ на месте'}]);
    expect(screen.queryByRole('button', {name: 'Завершить: anna.op'})).toBeNull();
  });

  it('no reason sends nothing', async () => {
    const {revokes} = handlers();
    mount('/emergency');
    const user = userEvent.setup();
    await user.click(await screen.findByRole('button', {name: 'Завершить: anna.op'}));
    expect(await screen.findByText('Нужна причина до 500 символов.')).toBeVisible();
    expect(revokes).toEqual([]);
  });

  it('a 409 says it has already ended', async () => {
    handlers({revoke: () => HttpResponse.json(problem(409, 'STATE_CONFLICT'), {status: 409})});
    mount('/emergency');
    const user = userEvent.setup();
    await user.type(await screen.findByLabelText('Причина завершения: anna.op'), 'r');
    await user.click(screen.getByRole('button', {name: 'Завершить: anna.op'}));
    expect(await screen.findByText('Этот доступ уже закончился.')).toBeVisible();
  });
});

describe('G6: activity', () => {
  it('the requests made with the access', async () => {
    handlers();
    mount('/emergency');
    const user = userEvent.setup();
    await user.click(await screen.findByRole('button', {name: 'Что сделано: anna.op'}));
    expect(await screen.findByText('03.11.2026 13:40 UTC · GET /api/admin/v1/orders · 200')).toBeVisible();
  });
});

describe('G7: mine', () => {
  it('the functions given to me and until when', async () => {
    handlers({rights: me, mine: () => [grant({staff_id: me.member.id})]});
    mount('/');
    expect(await screen.findByText('Временный доступ: orders.view до 03.11.2026 15:30 UTC')).toBeVisible();
  });

  it('none', async () => {
    handlers({rights: me});
    mount('/');
    expect(await screen.findByText('Временный доступ: нет')).toBeVisible();
  });
});
