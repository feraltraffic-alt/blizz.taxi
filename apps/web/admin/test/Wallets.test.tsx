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

/** A rider's bonus account for staff (#365): W1–W7 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const CLIENT = 'c0000000-0000-4000-8000-000000000001';
const KYIV = {id: '5a000000-0000-4000-8000-000000000001', code: 'kyiv', name: 'Київ', currency: 'UAH',
  timezone: 'Europe/Kyiv', center: {lat: 50.45, lon: 30.52}};
const WAW = {...KYIV, id: '5a000000-0000-4000-8000-000000000002', code: 'waw', name: 'Варшава', currency: 'PLN'};
const manager = {...me, effective_permissions: ['wallets.manage']};
const entry = (n: number, amount: number, reason: string, kind = 'STAFF_TOP_UP') => ({id: 'e000000' + n
  + '-0000-4000-8000-000000000001', at: '2026-11-0' + n + 'T10:00:00Z', kind, currency: 'UAH', amount_minor: amount,
reason, staff_id: null, order_id: null});
const wallet = (over: Record<string, unknown> = {}) => ({client_id: CLIENT, balances: [{currency: 'UAH',
  balance_minor: 12000, reserved_minor: 2000, available_minor: 10000}], entries: [entry(2, 5000, 'Извинение'),
  entry(1, -3000, 'Поездка', 'TRIP_PAYMENT')], page: {next_cursor: null, has_more: false}, ...over});

function handlers(opts: {rights?: unknown; find?: (q: URLSearchParams) => Response; read?: (q: URLSearchParams) =>
  unknown; balances?: unknown[]; cities?: unknown[]; top?: () => Response | Promise<Response>} = {}) {
  const finds: URLSearchParams[] = [];
  const reads: URLSearchParams[] = [];
  const tops: Record<string, unknown>[] = [];
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json((opts.rights ?? manager) as never)),
    http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: opts.cities ?? [KYIV, WAW]})),
    http.get(origin + '/api/admin/v1/rider-wallets', ({request}) => {
      const q = new URL(request.url).searchParams;
      finds.push(q);
      return opts.find ? opts.find(q) : HttpResponse.json({client_id: CLIENT});
    }),
    http.get(origin + '/api/admin/v1/rider-wallets/' + CLIENT, ({request}) => {
      const q = new URL(request.url).searchParams;
      reads.push(q);
      return HttpResponse.json((opts.read ? opts.read(q)
        : wallet(opts.balances ? {balances: opts.balances} : {})) as never);
    }),
    http.post(origin + '/api/admin/v1/rider-wallets/' + CLIENT + '/top-ups', async ({request}) => {
      const body = await request.json() as Record<string, unknown>;
      tops.push(body);
      return opts.top ? opts.top() : HttpResponse.json(wallet({balances: [{currency: 'UAH',
        balance_minor: 12000 + Number(body.amount_minor), reserved_minor: 2000,
        available_minor: 10000 + Number(body.amount_minor)}], entries: [entry(3, Number(body.amount_minor),
        String(body.reason)), entry(2, 5000, 'Извинение')], page: undefined}) as never, {status: 201});
    }));
  return {finds, reads, tops};
}

function mount(path = '/wallets') {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={[path]}><AdminApp client={api} /></MemoryRouter>);
}

async function find(phone = '+380671234567') {
  mount();
  const user = userEvent.setup();
  await user.type(await screen.findByLabelText('Телефон пассажира'), phone);
  await user.click(screen.getByRole('button', {name: 'Найти'}));
  return user;
}

async function open() {
  const user = await find();
  await screen.findByText('Бонусы: 120.00 UAH (доступно 100.00, в резерве 20.00)');
  return user;
}

async function topUp(user: ReturnType<typeof userEvent.setup>, amount: string, reason = 'Извинение за поездку') {
  if (amount) await user.type(screen.getByLabelText('Сумма пополнения'), amount);
  if (reason) {
    await user.click(screen.getByLabelText('Причина пополнения (её увидит пассажир)'));
    await user.paste(reason);
  }
  await user.click(screen.getByRole('button', {name: 'Пополнить бонусы'}));
}

describe('W1: the section', () => {
  it('is in the menu for wallets.manage', async () => {
    handlers();
    mount('/');
    expect(await screen.findByRole('link', {name: 'Бонусные счета'})).toBeVisible();
  });

  it('is in the menu for the super admin', async () => {
    handlers({rights: {...me, member: {...me.member, profile: {...me.member.profile, role: 'SUPER_ADMIN'}},
      effective_permissions: []}});
    mount('/');
    expect(await screen.findByRole('link', {name: 'Бонусные счета'})).toBeVisible();
  });

  it('is not for others', async () => {
    handlers({rights: {...me, effective_permissions: ['finance.manage']}});
    mount('/');
    await screen.findByRole('link', {name: 'Профиль'});
    expect(screen.queryByRole('link', {name: 'Бонусные счета'})).toBeNull();
  });
});

describe('W2: find', () => {
  it('a phone in E.164 reads the account', async () => {
    const {finds, reads} = handlers();
    await find('+380671234567');
    expect(await screen.findByText('Бонусы: 120.00 UAH (доступно 100.00, в резерве 20.00)')).toBeVisible();
    expect(finds.map(q => q.get('phone'))).toEqual(['+380671234567']);
    expect(reads).toHaveLength(1);
  });

  it.each([['no plus', '380671234567'], ['too short', '+3806712'], ['letters', '+38067abc4567']])(
    'a phone with %s sends nothing', async (_name, phone) => {
      const {finds} = handlers();
      await find(phone);
      expect(await screen.findByText('Телефон — в виде +380671234567.')).toBeVisible();
      expect(finds).toEqual([]);
    });

  it('a 404 says no rider has it', async () => {
    handlers({find: () => HttpResponse.json(problem(404, 'NOT_FOUND'), {status: 404})});
    await find();
    expect(await screen.findByText('Пассажира с таким телефоном нет.')).toBeVisible();
  });
});

describe('W3: the account', () => {
  it('no bonuses yet', async () => {
    handlers({balances: []});
    await find();
    expect(await screen.findByText('Бонусов нет')).toBeVisible();
  });

  it('the movements, newest first, signed; "more" by cursor', async () => {
    const {reads} = handlers({read: q => q.get('cursor') ? wallet({entries: [entry(1, 700, 'Старое')]})
      : wallet({page: {next_cursor: 'p2', has_more: true}})});
    const user = await open();
    const lines = screen.getAllByText(/ UAH · /).map(e => e.textContent);
    expect(lines[0]).toMatch(/\+50\.00 UAH · Извинение$/);
    expect(lines[1]).toMatch(/−30\.00 UAH · Поездка$/);
    await user.click(screen.getByRole('button', {name: 'Ещё движения'}));
    expect(await screen.findByText(/\+7\.00 UAH · Старое$/)).toBeVisible();
    expect(reads.map(q => q.get('cursor'))).toEqual([null, 'p2']);
  });
});

describe('W4: top-up', () => {
  it('one command; the page shows the answer and clears the amount and the reason', async () => {
    const {tops} = handlers();
    const user = await open();
    await topUp(user, '25,5');
    expect(await screen.findByText('Бонусы: 145.50 UAH (доступно 125.50, в резерве 20.00)')).toBeVisible();
    expect(tops).toEqual([{command_id: expect.any(String), currency: 'UAH', amount_minor: 2550,
      reason: 'Извинение за поездку'}]);
    expect(screen.getByText('Бонусы начислены.')).toBeVisible();
    expect(screen.getByLabelText('Сумма пополнения')).toHaveValue('');
    expect(screen.getByLabelText('Причина пополнения (её увидит пассажир)')).toHaveValue('');
  });

  it('another currency from the service cities', async () => {
    const {tops} = handlers();
    const user = await open();
    await user.selectOptions(screen.getByLabelText('Валюта пополнения'), 'PLN');
    await topUp(user, '10');
    await waitFor(() => expect(tops).toHaveLength(1));
    expect(tops[0]).toMatchObject({currency: 'PLN', amount_minor: 1000});
  });
});

describe('W5: refused on the screen', () => {
  it.each([['a bad amount', '1.005', 'r'], ['no reason', '10', ''], ['a reason over 500 characters', '10',
    'x'.repeat(501)]])('%s sends nothing', async (_name, amount, reason) => {
    const {tops} = handlers();
    const user = await open();
    await topUp(user, amount, reason);
    expect(await screen.findByText(/^Сумма — от 0\.01 до 100 000\.00/)).toBeVisible();
    expect(tops).toEqual([]);
  });

  it('no currency sends nothing', async () => {
    const {tops} = handlers({balances: [], cities: []});
    const user = await find();
    await screen.findByText('Бонусов нет');
    await topUp(user, '10');
    expect(await screen.findByText(/^Сумма — от 0\.01 до 100 000\.00/)).toBeVisible();
    expect(tops).toEqual([]);
  });
});

describe('W6: the daily limit', () => {
  it('is told', async () => {
    handlers({top: () => HttpResponse.json(problem(422, 'TOP_UP_DAILY_LIMIT'), {status: 422})});
    const user = await open();
    await topUp(user, '10');
    expect(await screen.findByText('Достигнут ваш дневной лимит пополнений.')).toBeVisible();
  });
});

describe('W7: one at a time', () => {
  it('a double click tops up once', async () => {
    const {tops} = handlers({top: async () => {
      await delay(100);
      return HttpResponse.json(wallet() as never, {status: 201});
    }});
    const user = await open();
    await user.type(screen.getByLabelText('Сумма пополнения'), '10');
    await user.type(screen.getByLabelText('Причина пополнения (её увидит пассажир)'), 'r');
    await user.dblClick(screen.getByRole('button', {name: 'Пополнить бонусы'}));
    expect(await screen.findByText('Бонусы начислены.')).toBeVisible();
    expect(tops).toHaveLength(1);
  });
});
