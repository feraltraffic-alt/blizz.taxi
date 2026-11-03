import {afterAll, afterEach, beforeAll, describe, expect, it, vi} from 'vitest';
import {render, screen, waitFor} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {MemoryRouter} from 'react-router-dom';
import {http, HttpResponse, delay} from 'msw';
import {setupServer} from 'msw/node';
import {createApiClient} from '@blizz/api-client';
import {AdminApp} from '../src/App.js';
import {browserRefreshTokens} from '../src/storage.js';
import {cid, me, problem, session} from '../../../../test/fixtures.js';

/** Changing a staff member's profile (#370): U1–U6 of the issue. */
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
const profile = {first_name: 'Анна', last_name: 'Коваль', contacts: {phone: '+380671111111'}, role: 'OPERATOR',
  permissions: ['orders.create'], all_cities: false, city_ids: [KYIV.id]};
const member = (version = 2) => ({id: STAFF, login: 'anna.op', profile, state: 'ACTIVE',
  password_change_required: false, version});

function handlers(opts: {one?: () => unknown; update?: (body: Record<string, unknown>) => Response | Promise<Response>}
  = {}) {
  const updates: Record<string, unknown>[] = [];
  let reads = 0;
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(superAdmin as never)),
    http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [KYIV, LVIV]})),
    http.get(origin + '/api/admin/v1/permissions', () => HttpResponse.json({permissions: [
      {code: 'orders.create', group: 'Orders', description: 'Create phone orders'},
      {code: 'orders.view', group: 'Orders', description: 'View orders'}]})),
    http.get(origin + '/api/admin/v1/staff-extensions', () => HttpResponse.json({extensions: []})),
    http.get(origin + '/api/admin/v1/staff', () => HttpResponse.json({staff: [member()]} as never)),
    http.get(origin + '/api/admin/v1/staff/' + STAFF, () => {
      reads++;
      return HttpResponse.json((opts.one ? opts.one() : member()) as never);
    }),
    http.post(origin + '/api/admin/v1/staff/' + STAFF + '/update', async ({request}) => {
      const body = await request.json() as Record<string, unknown>;
      updates.push(body);
      return opts.update ? opts.update(body) : HttpResponse.json({...member(3),
        profile: body.profile} as never);
    }));
  return {updates, reads: () => reads};
}

function mount(path = '/staff/' + STAFF) {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={[path]}><AdminApp client={api} /></MemoryRouter>);
}

async function open() {
  mount();
  const user = userEvent.setup();
  await waitFor(() => expect(screen.getByLabelText('Имя')).toHaveValue('Анна'));
  await screen.findByRole('checkbox', {name: 'orders.create — Create phone orders'});
  await screen.findByRole('checkbox', {name: 'Київ'});
  return user;
}

async function save(user: ReturnType<typeof userEvent.setup>, reason = 'Уточнение', own = '') {
  if (reason) await user.type(screen.getByLabelText('Причина'), reason);
  if (own) await user.type(screen.getByLabelText('Ваш пароль'), own);
  await user.click(screen.getByRole('button', {name: 'Сохранить изменения'}));
}

describe('U1: open', () => {
  it('from the list to a form filled from the member', async () => {
    handlers();
    mount('/staff');
    const user = userEvent.setup();
    await user.click(await screen.findByRole('link', {name: 'Изменить: Коваль Анна'}));
    await waitFor(() => expect(screen.getByLabelText('Имя')).toHaveValue('Анна'));
    expect(screen.getByLabelText('Фамилия')).toHaveValue('Коваль');
    expect(screen.getByLabelText('Телефон')).toHaveValue('+380671111111');
    expect(screen.getByLabelText('Роль')).toHaveValue('OPERATOR');
    expect(await screen.findByRole('checkbox', {name: 'orders.create — Create phone orders'})).toBeChecked();
    expect(screen.getByRole('checkbox', {name: 'orders.view — View orders'})).not.toBeChecked();
    expect(await screen.findByRole('checkbox', {name: 'Київ'})).toBeChecked();
    expect(screen.getByRole('checkbox', {name: 'Львів'})).not.toBeChecked();
    expect(screen.getByRole('checkbox', {name: 'Все города'})).not.toBeChecked();
  });
});

describe('U2: names and contacts only', () => {
  it('the whole profile, the version and the reason, without a password key; empty contacts left out', async () => {
    const {updates} = handlers();
    const user = await open();
    await user.clear(screen.getByLabelText('Фамилия'));
    await user.type(screen.getByLabelText('Фамилия'), 'Коваленко');
    await user.type(screen.getByLabelText('Telegram'), '@anna_op');
    await save(user);
    expect(await screen.findByText('Изменения сохранены.')).toBeVisible();
    expect(updates).toEqual([{command_id: expect.any(String), expected_version: 2, profile: {first_name: 'Анна',
      last_name: 'Коваленко', contacts: {phone: '+380671111111', telegram: '@anna_op'}, role: 'OPERATOR',
      permissions: ['orders.create'], all_cities: false, city_ids: [KYIV.id]}, reason: 'Уточнение'}]);
    expect('password' in updates[0]!).toBe(false);
  });
});

describe('U3: role, functions or cities', () => {
  it.each([
    ['the role', async (user: ReturnType<typeof userEvent.setup>) =>
      user.selectOptions(screen.getByLabelText('Роль'), 'ADMIN'), {role: 'ADMIN'}],
    ['a function', async (user: ReturnType<typeof userEvent.setup>) =>
      user.click(screen.getByRole('checkbox', {name: 'orders.view — View orders'})),
    {permissions: ['orders.create', 'orders.view']}],
    ['a city', async (user: ReturnType<typeof userEvent.setup>) =>
      user.click(screen.getByRole('checkbox', {name: 'Львів'})), {city_ids: [KYIV.id, LVIV.id]}],
    ['every city', async (user: ReturnType<typeof userEvent.setup>) =>
      user.click(screen.getByRole('checkbox', {name: 'Все города'})), {all_cities: true, city_ids: []}]
  ])('%s needs the own password, which is sent and then emptied', async (_name, change, expected) => {
    const {updates} = handlers();
    const user = await open();
    await change(user);
    await save(user, 'Повышение', 'Super-Admin-Pass');
    expect(await screen.findByText('Изменения сохранены.')).toBeVisible();
    expect(updates).toHaveLength(1);
    expect(updates[0]).toMatchObject({password: 'Super-Admin-Pass', profile: expected});
    expect(screen.getByLabelText('Ваш пароль')).toHaveValue('');
  });
});

describe('U4: refused on the screen', () => {
  it.each([
    ['no first name', async (user: ReturnType<typeof userEvent.setup>) => user.clear(screen.getByLabelText('Имя'))],
    ['no last name', async (user: ReturnType<typeof userEvent.setup>) => user.clear(screen.getByLabelText('Фамилия'))],
    ['no contact', async (user: ReturnType<typeof userEvent.setup>) => user.clear(screen.getByLabelText('Телефон'))],
    ['a bad Telegram name', async (user: ReturnType<typeof userEvent.setup>) =>
      user.type(screen.getByLabelText('Telegram'), '@a-b')],
    ['a role change without the own password', async (user: ReturnType<typeof userEvent.setup>) =>
      user.selectOptions(screen.getByLabelText('Роль'), 'ADMIN')]
  ])('%s sends nothing', async (_name, spoil) => {
    const {updates} = handlers();
    const user = await open();
    await spoil(user);
    await save(user);
    expect(await screen.findByText(/^Нужны имя, фамилия/)).toBeVisible();
    expect(updates).toEqual([]);
  });

  it('no reason sends nothing', async () => {
    const {updates} = handlers();
    const user = await open();
    await save(user, '');
    expect(await screen.findByText(/^Нужны имя, фамилия/)).toBeVisible();
    expect(updates).toEqual([]);
  });
});

describe('U5: server refusals', () => {
  it('a 403 says the own password did not fit, and it is emptied', async () => {
    handlers({update: () => HttpResponse.json(problem(403, 'ACCESS_DENIED'), {status: 403})});
    const user = await open();
    await user.selectOptions(screen.getByLabelText('Роль'), 'ADMIN');
    await save(user, 'r', 'wrong');
    expect(await screen.findByText('Ваш пароль не подошёл.')).toBeVisible();
    expect(screen.getByLabelText('Ваш пароль')).toHaveValue('');
  });

  it('a 409 is told, the member is read again, and the next save carries the new version', async () => {
    let version = 2;
    let first = true;
    const {updates, reads} = handlers({one: () => member(version), update: body => {
      if (first) {
        first = false;
        version = 6;
        return HttpResponse.json(problem(409, 'VERSION_CONFLICT'), {status: 409});
      }
      return HttpResponse.json({...member(7), profile: body.profile} as never);
    }});
    const user = await open();
    await save(user, 'r');
    expect(await screen.findByText('Сотрудника изменил кто-то другой; показаны текущие данные.')).toBeVisible();
    await waitFor(() => expect(reads()).toBe(2));
    await save(user, 'r');
    await waitFor(() => expect(updates).toHaveLength(2));
    expect(updates.map(u => u.expected_version)).toEqual([2, 6]);
  });
});

describe('U6: one at a time', () => {
  it('a double click sends one command', async () => {
    const {updates} = handlers({update: async body => {
      await delay(100);
      return HttpResponse.json({...member(3), profile: body.profile} as never);
    }});
    const user = await open();
    await user.type(screen.getByLabelText('Причина'), 'r');
    await user.dblClick(screen.getByRole('button', {name: 'Сохранить изменения'}));
    expect(await screen.findByText('Изменения сохранены.')).toBeVisible();
    expect(updates).toHaveLength(1);
  });
});
