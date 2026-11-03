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

/** The platform owner's taxi services (#448): S1–S6 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const as = (role: string) => ({...me, member: {...me.member, profile: {...me.member.profile, role,
  permissions: []}}, effective_permissions: []});
const owner = as('PLATFORM_OWNER');
const SVC = '5e000000-0000-4000-8000-000000000001';
const service = (over: Record<string, unknown> = {}) => ({id: SVC, code: 'taxi-kyiv', name: 'Такси Київ',
  state: 'ACTIVE', version: 2, created_at: '2026-11-01T08:00:00Z', ...over});

type Sent = {path: string; body: Record<string, unknown>};

function handlers(opts: {rights?: unknown; list?: () => unknown[]; create?: () => Response;
  change?: () => Response} = {}) {
  const sent: Sent[] = [];
  let reads = 0;
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json((opts.rights ?? owner) as never)),
    http.get(origin + '/api/admin/v1/services', () => {
      reads++;
      return HttpResponse.json({services: opts.list ? opts.list() : [service()]} as never);
    }),
    http.post(origin + '/api/admin/v1/services/:id/:action', async ({request, params}) => {
      const body = await request.json() as Record<string, unknown>;
      sent.push({path: String(params.action) + '/' + String(params.id), body});
      return opts.change ? opts.change() : HttpResponse.json(service({state: params.action === 'suspend'
        ? 'SUSPENDED' : 'ACTIVE', version: 3}) as never);
    }),
    http.post(origin + '/api/admin/v1/services', async ({request}) => {
      const body = await request.json() as Record<string, unknown>;
      sent.push({path: 'create', body});
      return opts.create ? opts.create() : HttpResponse.json(service({id: 'new', code: body.code, name: body.name,
        version: 0, created_at: '2026-11-03T12:00:00Z'}) as never, {status: 201});
    }));
  return {sent, reads: () => reads};
}

function mount(path = '/services') {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={[path]}><AdminApp client={api} /></MemoryRouter>);
}

type User = ReturnType<typeof userEvent.setup>;
type Form = {code?: string; name?: string; login?: string; initial?: string; first?: string; last?: string;
  reason?: string; own?: string};
const full: Form = {code: ' taxi-lviv ', name: ' Такси Львів ', login: ' lviv-root ', initial: 'Start-2026!',
  first: ' Іван ', last: ' Петренко ', reason: ' Новый город ', own: 'Owner-pass-1'};
const LABELS: Record<keyof Form, string> = {code: 'Код таксопарка', name: 'Название таксопарка',
  login: 'Логин суперадмина', initial: 'Начальный пароль суперадмина', first: 'Имя суперадмина',
  last: 'Фамилия суперадмина', reason: 'Причина создания', own: 'Ваш пароль (создание)'};

async function create(user: User, form: Form) {
  await screen.findByText(/^taxi-kyiv · /);
  for (const [key, value] of Object.entries(form) as [keyof Form, string][]) {
    if (!value) continue;
    await user.click(screen.getByLabelText(LABELS[key]));
    await user.paste(value);
  }
  await user.click(screen.getByRole('button', {name: 'Создать таксопарк'}));
}

const value = (label: string) => (screen.getByLabelText(label) as HTMLInputElement).value;

describe('S1: list', () => {
  it('an active and a suspended service in words', async () => {
    handlers({list: () => [service(), service({id: 's2', code: 'taxi-odesa', name: 'Такси Одеса',
      state: 'SUSPENDED'})]});
    mount();
    expect(await screen.findByText('taxi-kyiv · Такси Київ · работает · с 01.11.2026')).toBeTruthy();
    expect(screen.getByText('taxi-odesa · Такси Одеса · приостановлен · с 01.11.2026')).toBeTruthy();
  });
});

describe('S2: create', () => {
  it('sends the contract body trimmed, adds the service and empties both passwords', async () => {
    const h = handlers();
    const user = userEvent.setup();
    mount();
    await create(user, full);
    await waitFor(() => expect(h.sent).toHaveLength(1));
    expect(h.sent[0]).toEqual({path: 'create', body: {command_id: expect.any(String), code: 'taxi-lviv',
      name: 'Такси Львів', super_admin: {login: 'lviv-root', initial_password: 'Start-2026!', first_name: 'Іван',
        last_name: 'Петренко'}, reason: 'Новый город', password: 'Owner-pass-1'}});
    expect(await screen.findByText('taxi-lviv · Такси Львів · работает · с 03.11.2026')).toBeTruthy();
    expect(value(LABELS.initial)).toBe('');
    expect(value(LABELS.own)).toBe('');
  });
});

describe('S3: create refused before sending', () => {
  it.each([
    ['a code with a capital', {code: 'Taxi'}], ['a code of one letter', {code: 'a'}],
    ['a code starting with a dash', {code: '-taxi'}], ['a code over 40', {code: 'a'.repeat(41)}],
    ['no name', {name: ''}], ['a name over 120', {name: 'x'.repeat(121)}], ['no login', {login: ''}],
    ['no first name', {first: ''}], ['no last name', {last: ''}], ['no initial password', {initial: ''}],
    ['an initial password over 128', {initial: 'x'.repeat(129)}], ['no reason', {reason: ''}],
    ['no own password', {own: ''}]
  ])('%s', async (_name, change) => {
    const h = handlers();
    const user = userEvent.setup();
    mount();
    await create(user, {...full, ...change});
    expect(await screen.findByText('Нужны код (латиница в нижнем регистре, цифры, дефис; 2–40), название до 120, '
      + 'логин, имя, фамилия и начальный пароль суперадмина, причина и ваш пароль.')).toBeTruthy();
    expect(h.sent).toHaveLength(0);
  });
});

describe('S4: create refused by the server', () => {
  it('a 403 says the own password did not fit and empties both passwords', async () => {
    handlers({create: () => HttpResponse.json(problem(403, 'ACCESS_DENIED'), {status: 403})});
    const user = userEvent.setup();
    mount();
    await create(user, full);
    expect(await screen.findByText('Ваш пароль не подошёл.')).toBeTruthy();
    expect(value(LABELS.initial)).toBe('');
    expect(value(LABELS.own)).toBe('');
  });

  it('a 409 says the code or login is taken', async () => {
    handlers({create: () => HttpResponse.json(problem(409, 'STATE_CONFLICT'), {status: 409})});
    const user = userEvent.setup();
    mount();
    await create(user, full);
    expect(await screen.findByText('Такой код или логин уже занят.')).toBeTruthy();
  });
});

describe('S5: suspend and resume', () => {
  it('suspend warns, sends the version and the reason, and the row changes', async () => {
    const h = handlers();
    const user = userEvent.setup();
    mount();
    const row = (await screen.findByText(/^taxi-kyiv · /)).closest('li') as HTMLElement;
    expect(within(row).getByText('Все сессии таксопарка закончатся сразу.')).toBeTruthy();
    await user.type(within(row).getByLabelText('Причина (taxi-kyiv)'), 'Долг по оплате');
    await user.click(within(row).getByRole('button', {name: 'Приостановить'}));
    await waitFor(() => expect(h.sent).toHaveLength(1));
    expect(h.sent[0]).toEqual({path: 'suspend/' + SVC, body: {command_id: expect.any(String), expected_version: 2,
      reason: 'Долг по оплате'}});
    expect(await screen.findByText('taxi-kyiv · Такси Київ · приостановлен · с 01.11.2026')).toBeTruthy();
    expect(screen.getByRole('button', {name: 'Возобновить'})).toBeTruthy();
  });

  it('resume on a suspended one', async () => {
    const h = handlers({list: () => [service({state: 'SUSPENDED'})]});
    const user = userEvent.setup();
    mount();
    const row = (await screen.findByText(/^taxi-kyiv · /)).closest('li') as HTMLElement;
    expect(within(row).queryByRole('button', {name: 'Приостановить'})).toBeNull();
    await user.type(within(row).getByLabelText('Причина (taxi-kyiv)'), 'Оплатили');
    await user.click(within(row).getByRole('button', {name: 'Возобновить'}));
    await waitFor(() => expect(h.sent).toHaveLength(1));
    expect(h.sent[0]!.path).toBe('resume/' + SVC);
    expect(await screen.findByText('taxi-kyiv · Такси Київ · работает · с 01.11.2026')).toBeTruthy();
  });

  it('no reason sends nothing', async () => {
    const h = handlers();
    const user = userEvent.setup();
    mount();
    const row = (await screen.findByText(/^taxi-kyiv · /)).closest('li') as HTMLElement;
    await user.click(within(row).getByRole('button', {name: 'Приостановить'}));
    expect(await screen.findByText('Нужна причина.')).toBeTruthy();
    expect(h.sent).toHaveLength(0);
  });

  it('a 409 reads the list again', async () => {
    const h = handlers({change: () => HttpResponse.json(problem(409, 'VERSION_CONFLICT'), {status: 409})});
    const user = userEvent.setup();
    mount();
    const row = (await screen.findByText(/^taxi-kyiv · /)).closest('li') as HTMLElement;
    await user.type(within(row).getByLabelText('Причина (taxi-kyiv)'), 'Долг');
    await user.click(within(row).getByRole('button', {name: 'Приостановить'}));
    expect(await screen.findByText('Таксопарк изменился; список обновлён.')).toBeTruthy();
    await waitFor(() => expect(h.reads()).toBe(2));
  });
});

describe('S6: access', () => {
  it('in the menu for the platform owner', async () => {
    handlers();
    mount('/');
    expect(await screen.findByRole('link', {name: 'Таксопарки'})).toHaveAttribute('href', '/services');
  });

  it.each([['a super admin', as('SUPER_ADMIN')], ['an admin with every permission', {...as('ADMIN'),
    effective_permissions: ['geo.manage', 'finance.manage', 'payments.retry', 'support.manage']}]])(
    'not for %s, and nothing is asked', async (_name, rights) => {
      const h = handlers({rights});
      mount('/');
      await screen.findByRole('link', {name: 'Профиль'});
      expect(screen.queryByRole('link', {name: 'Таксопарки'})).toBeNull();
      expect(h.reads()).toBe(0);
    });
});
