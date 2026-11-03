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

/** Staff: list, add, suspend and restore (#355): S1–S6 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const superAdmin = {...me, member: {...me.member, profile: {...me.member.profile, role: 'SUPER_ADMIN'}},
  effective_permissions: []};
const KYIV = {id: '5a000000-0000-4000-8000-000000000001', name: 'Київ'};
const STAFF = 'a1000000-0000-4000-8000-000000000001';
const member = (state = 'ACTIVE', over: Record<string, unknown> = {}) => ({id: STAFF, login: 'anna.op',
  profile: {first_name: 'Анна', last_name: 'Коваль', contacts: {phone: '+380671111111'}, role: 'OPERATOR',
    permissions: ['orders.create'], all_cities: false, city_ids: [KYIV.id]}, state, password_change_required: true,
  version: 2, ...over});

function handlers(opts: {list?: () => unknown[]; create?: () => Response | Promise<Response>;
  change?: (action: string) => Response | Promise<Response>} = {}) {
  const created: Record<string, unknown>[] = [];
  const changed: {action: string; body: Record<string, unknown>}[] = [];
  let lists = 0;
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(superAdmin as never)),
    http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [KYIV]})),
    http.get(origin + '/api/admin/v1/permissions', () => HttpResponse.json({permissions: [
      {code: 'orders.create', group: 'Orders', description: 'Create phone orders'},
      {code: 'orders.view', group: 'Orders', description: 'View orders'}]})),
    http.get(origin + '/api/admin/v1/staff', () => {
      lists++;
      return HttpResponse.json({staff: opts.list ? opts.list() : [member()]} as never);
    }),
    http.post(origin + '/api/admin/v1/staff', async ({request}) => {
      created.push(await request.json() as Record<string, unknown>);
      return opts.create ? opts.create() : HttpResponse.json(member('INVITED', {id: 'new', login: 'ivan.op',
        profile: {...member().profile, first_name: 'Іван', last_name: 'Петренко'}}) as never);
    }),
    http.post(origin + '/api/admin/v1/staff/' + STAFF + '/:action', async ({request, params}) => {
      changed.push({action: String(params.action), body: await request.json() as Record<string, unknown>});
      return opts.change ? opts.change(String(params.action))
        : HttpResponse.json(member(String(params.action) === 'suspend' ? 'SUSPENDED' : 'ACTIVE', {version: 3}) as never);
    }));
  return {created, changed, lists: () => lists};
}

function mount() {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={['/staff']}><AdminApp client={api} /></MemoryRouter>);
}

async function fill(user: ReturnType<typeof userEvent.setup>, over: Record<string, string> = {}) {
  const value = (key: string, fallback: string) => key in over ? over[key]! : fallback;
  const type = async (label: string, text: string) => {
    if (text) await user.type(screen.getByLabelText(label), text);
  };
  await type('Имя', value('first', 'Іван'));
  await type('Фамилия', value('last', 'Петренко'));
  await type('Телефон', value('phone', '+380672222222'));
  await type('Логин нового сотрудника', value('login', 'ivan.op'));
  await type('Начальный пароль', value('initial', 'Initial-Pass-2026'));
  await user.selectOptions(screen.getByLabelText('Роль нового сотрудника'), 'OPERATOR');
  await user.click(screen.getByRole('checkbox', {name: 'orders.create — Create phone orders'}));
  await user.click(screen.getByRole('checkbox', {name: 'Київ'}));
  await type('Причина', value('reason', 'Новый оператор'));
  await type('Ваш пароль', value('own', 'Super-Admin-Pass'));
}

describe('S1: the list', () => {
  it('shows each member', async () => {
    handlers();
    mount();
    expect(await screen.findByText('Коваль Анна · anna.op · Оператор · активен')).toBeVisible();
  });
});

describe('S2: adding a member', () => {
  it('one command with the profile, the rights and the own password; the member appears', async () => {
    const {created} = handlers({list: () => [member()]});
    mount();
    const user = userEvent.setup();
    await screen.findByText(/anna.op/);
    await fill(user);
    await user.click(screen.getByRole('button', {name: 'Добавить сотрудника'}));
    expect(await screen.findByText('Петренко Іван · ivan.op · Оператор · приглашён')).toBeVisible();
    expect(created).toEqual([{command_id: expect.any(String), login: 'ivan.op', initial_password: 'Initial-Pass-2026',
      profile: {first_name: 'Іван', last_name: 'Петренко', contacts: {phone: '+380672222222'}, role: 'OPERATOR',
        permissions: ['orders.create'], all_cities: false, city_ids: [KYIV.id]}, reason: 'Новый оператор',
      password: 'Super-Admin-Pass'}]);
  });
});

describe('S3: refused on the screen', () => {
  it.each([['no first name', {first: ''}], ['no contact', {phone: ''}], ['a bad login', {login: 'a b'}],
    ['a short password', {initial: 'short'}], ['no reason', {reason: ''}], ['no own password', {own: ''}]])(
    '%s sends nothing', async (_name, over) => {
      const {created} = handlers();
      mount();
      const user = userEvent.setup();
      await screen.findByText(/anna.op/);
      await fill(user, over as Record<string, string>);
      await user.click(screen.getByRole('button', {name: 'Добавить сотрудника'}));
      expect(await screen.findByText('Заполните имя, фамилию, контакт, логин, пароль от 12 символов, причину и свой пароль.'))
        .toBeVisible();
      expect(created).toEqual([]);
    });
});

describe('S4: server refusals', () => {
  it.each([[409, 'CONFLICT', 'Такой логин уже занят.'], [403, 'ACCESS_DENIED', 'Ваш пароль не подошёл.']])(
    'a %s is told and the own password is emptied', async (status, code, text) => {
      handlers({create: () => HttpResponse.json(problem(status, code), {status})});
      mount();
      const user = userEvent.setup();
      await screen.findByText(/anna.op/);
      await fill(user);
      await user.click(screen.getByRole('button', {name: 'Добавить сотрудника'}));
      expect(await screen.findByText(text)).toBeVisible();
      expect(screen.getByLabelText('Ваш пароль')).toHaveValue('');
    });
});

describe('S5: suspend and restore', () => {
  it('with a reason and the version; the state follows', async () => {
    const {changed} = handlers();
    mount();
    const user = userEvent.setup();
    await screen.findByText(/anna.op/);
    await user.type(screen.getByLabelText('Причина для Коваль Анна'), 'Уволена');
    await user.click(screen.getByRole('button', {name: 'Приостановить: Коваль Анна'}));
    expect(await screen.findByText('Коваль Анна · anna.op · Оператор · приостановлен')).toBeVisible();
    expect(changed).toEqual([{action: 'suspend', body: {command_id: expect.any(String), expected_version: 2,
      reason: 'Уволена'}}]);
  });

  it('without a reason nothing is sent', async () => {
    const {changed} = handlers();
    mount();
    const user = userEvent.setup();
    await screen.findByText(/anna.op/);
    await user.click(screen.getByRole('button', {name: 'Приостановить: Коваль Анна'}));
    expect(await screen.findByText('Укажите причину.')).toBeVisible();
    expect(changed).toEqual([]);
  });
});

describe('S6: one at a time', () => {
  it('a double click adds one member', async () => {
    const {created} = handlers({create: async () => {
      await delay(200);
      return HttpResponse.json(member('INVITED', {id: 'new', login: 'ivan.op'}) as never);
    }});
    mount();
    const user = userEvent.setup();
    await screen.findByText(/anna.op/);
    await fill(user);
    const add = screen.getByRole('button', {name: 'Добавить сотрудника'});
    await Promise.all([user.click(add), user.click(add)]);
    await waitFor(() => expect(created).toHaveLength(1));
    await delay(300);
    expect(created).toHaveLength(1);
  });
});

/** A temporary password and internal numbers (#357): R1–R3, E1–E5. */
describe('#357: temporary password and numbers', () => {
  function more(opts: {reset?: () => Response; ext?: () => Response | Promise<Response>; numbers?: unknown[]} = {}) {
    const resets: Record<string, unknown>[] = [];
    const exts: Record<string, unknown>[] = [];
    server.use(
      http.get(origin + '/api/admin/v1/staff-extensions', () => HttpResponse.json({extensions: opts.numbers
        ?? [{staff_id: STAFF, extension: '101', version: 3}]} as never)),
      http.post(origin + '/api/admin/v1/staff/' + STAFF + '/reset-password', async ({request}) => {
        resets.push(await request.json() as Record<string, unknown>);
        return opts.reset ? opts.reset() : HttpResponse.json(member('ACTIVE', {version: 3}) as never);
      }),
      http.post(origin + '/api/admin/v1/staff-extensions/' + STAFF, async ({request}) => {
        const body = await request.json() as Record<string, unknown>;
        exts.push(body);
        return opts.ext ? opts.ext() : HttpResponse.json({staff_id: STAFF, extension: body.extension ?? '101',
          version: 4} as never);
      }));
    return {resets, exts};
  }
  async function open() {
    mount();
    const user = userEvent.setup();
    await screen.findByText(/anna.op/);
    return user;
  }

  it('R1: a temporary password with the reason and the own password, which is emptied', async () => {
    handlers();
    const {resets} = more();
    const user = await open();
    await user.type(screen.getByLabelText('Причина для Коваль Анна'), 'Забыла пароль');
    await user.type(screen.getByLabelText('Временный пароль для Коваль Анна'), 'Temporary-2026-ok');
    await user.type(screen.getByLabelText('Ваш пароль для Коваль Анна'), 'Super-Admin-Pass');
    await user.click(screen.getByRole('button', {name: 'Задать временный пароль: Коваль Анна'}));
    expect(await screen.findByText('Временный пароль задан. При входе сотрудник сменит его.')).toBeVisible();
    expect(resets).toEqual([{command_id: expect.any(String), expected_version: 2, temporary_password: 'Temporary-2026-ok',
      reason: 'Забыла пароль', password: 'Super-Admin-Pass'}]);
    expect(screen.getByLabelText('Ваш пароль для Коваль Анна')).toHaveValue('');
  });

  it.each([['a short password', 'short', 'Super-Admin-Pass', 'r'], ['no own password', 'Temporary-2026-ok', '', 'r'],
    ['no reason', 'Temporary-2026-ok', 'Super-Admin-Pass', '']])('R2: %s sends nothing', async (_n, temp, own, why) => {
    handlers();
    const {resets} = more();
    const user = await open();
    if (why) await user.type(screen.getByLabelText('Причина для Коваль Анна'), why);
    await user.type(screen.getByLabelText('Временный пароль для Коваль Анна'), temp);
    if (own) await user.type(screen.getByLabelText('Ваш пароль для Коваль Анна'), own);
    await user.click(screen.getByRole('button', {name: 'Задать временный пароль: Коваль Анна'}));
    expect(await screen.findByText('Временный пароль — от 12 символов; нужны причина и ваш пароль.')).toBeVisible();
    expect(resets).toEqual([]);
  });

  it('R3: a wrong own password is told and emptied', async () => {
    handlers();
    more({reset: () => HttpResponse.json(problem(403, 'ACCESS_DENIED'), {status: 403})});
    const user = await open();
    await user.type(screen.getByLabelText('Причина для Коваль Анна'), 'r');
    await user.type(screen.getByLabelText('Временный пароль для Коваль Анна'), 'Temporary-2026-ok');
    await user.type(screen.getByLabelText('Ваш пароль для Коваль Анна'), 'wrong');
    await user.click(screen.getByRole('button', {name: 'Задать временный пароль: Коваль Анна'}));
    expect(await screen.findByText('Ваш пароль не подошёл.')).toBeVisible();
    expect(screen.getByLabelText('Ваш пароль для Коваль Анна')).toHaveValue('');
  });

  it('E1: the number or that there is none', async () => {
    handlers();
    more();
    await open();
    expect(await screen.findByText('вн. 101')).toBeVisible();
  });

  it('E1: none', async () => {
    handlers();
    more({numbers: []});
    await open();
    expect(await screen.findByText('нет внутреннего номера')).toBeVisible();
  });

  it.each([[[{staff_id: STAFF, extension: '101', version: 3}], 3], [[], 0]])(
    'E2: set with the version %#', async (numbers, version) => {
      handlers();
      const {exts} = more({numbers});
      const user = await open();
      await user.type(screen.getByLabelText('Причина для Коваль Анна'), 'Новое место');
      await user.type(screen.getByLabelText('Внутренний номер для Коваль Анна'), '205');
      await user.click(screen.getByRole('button', {name: 'Сохранить номер: Коваль Анна'}));
      await waitFor(() => expect(exts).toHaveLength(1));
      expect(exts[0]).toEqual({command_id: expect.any(String), expected_version: version, extension: '205',
        reason: 'Новое место'});
    });

  it('E3: remove sends null', async () => {
    handlers();
    const {exts} = more();
    const user = await open();
    await user.type(screen.getByLabelText('Причина для Коваль Анна'), 'Ушла');
    await user.click(await screen.findByRole('button', {name: 'Убрать номер: Коваль Анна'}));
    await waitFor(() => expect(exts).toHaveLength(1));
    expect(exts[0]).toEqual({command_id: expect.any(String), expected_version: 3, extension: null, reason: 'Ушла'});
  });

  it('E4: a number of another member', async () => {
    handlers();
    more({ext: () => HttpResponse.json(problem(409, 'STATE_CONFLICT'), {status: 409})});
    const user = await open();
    await user.type(screen.getByLabelText('Причина для Коваль Анна'), 'r');
    await user.type(screen.getByLabelText('Внутренний номер для Коваль Анна'), '205');
    await user.click(screen.getByRole('button', {name: 'Сохранить номер: Коваль Анна'}));
    expect(await screen.findByText('Этот номер уже у другого сотрудника.')).toBeVisible();
  });

  it.each([['letters', 'abc', 'r'], ['one digit', '1', 'r'], ['no reason', '205', '']])(
    'E5: %s sends nothing', async (_n, number, why) => {
      handlers();
      const {exts} = more();
      const user = await open();
      if (why) await user.type(screen.getByLabelText('Причина для Коваль Анна'), why);
      await user.type(screen.getByLabelText('Внутренний номер для Коваль Анна'), number);
      await user.click(screen.getByRole('button', {name: 'Сохранить номер: Коваль Анна'}));
      expect(await screen.findByText('Номер — от 2 до 6 цифр, и нужна причина.')).toBeVisible();
      expect(exts).toEqual([]);
    });
});
