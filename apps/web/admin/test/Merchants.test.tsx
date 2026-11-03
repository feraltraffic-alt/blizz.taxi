import {afterAll, afterEach, beforeAll, describe, expect, it, vi} from 'vitest';
import {render, screen, waitFor, within} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {MemoryRouter} from 'react-router-dom';
import {http, HttpResponse, delay} from 'msw';
import {setupServer} from 'msw/node';
import {createApiClient} from '@blizz/api-client';
import {AdminApp} from '../src/App.js';
import {browserRefreshTokens} from '../src/storage.js';
import {cid, me, problem, session} from '../../../../test/fixtures.js';

/** Payment merchants (#394): M1–M7 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const engineer = {...me, effective_permissions: ['integrations.manage']};
const KYIV = {id: '5a000000-0000-4000-8000-000000000001', name: 'Київ'};
const LVIV = {id: '5a000000-0000-4000-8000-000000000002', name: 'Львів'};
const M1 = 'ae000000-0000-4000-8000-000000000001';
const merchant = (over: Record<string, unknown> = {}) => ({id: M1, provider: 'WAYFORPAY', account: 'blizz_kyiv',
  domain: 'blizz.taxi', currency: 'UAH', city_ids: [KYIV.id, LVIV.id], secret_source: 'PANEL', secret_hint: '…a1b2',
  created_at: '2026-11-01T10:00:00Z', ...over});

function handlers(opts: {list?: () => unknown[]; create?: () => Response; change?: () => Response | Promise<Response>}
  = {}) {
  const creates: Record<string, unknown>[] = [];
  const changes: Record<string, unknown>[] = [];
  const checks: string[] = [];
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(engineer as never)),
    http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [KYIV, LVIV]})),
    http.get(origin + '/api/admin/v1/integrations/health', () => HttpResponse.json({instance: 'api-1',
      checked_at: '2026-11-03T04:00:00Z', providers: []} as never)),
    http.get(origin + '/api/admin/v1/integrations', () => HttpResponse.json({fields: []} as never)),
    http.get(origin + '/api/admin/v1/payment-merchants', () => HttpResponse.json({merchants: opts.list ? opts.list()
      : [merchant()]} as never)),
    http.post(origin + '/api/admin/v1/payment-merchants', async ({request}) => {
      const body = await request.json() as Record<string, unknown>;
      creates.push(body);
      return opts.create ? opts.create() : HttpResponse.json(merchant({id: 'new', account: body.account,
        domain: body.domain, currency: body.currency, city_ids: body.city_ids ?? []}) as never, {status: 201});
    }),
    http.post(origin + '/api/admin/v1/payment-merchants/' + M1 + '/change', async ({request}) => {
      changes.push(await request.json() as Record<string, unknown>);
      return opts.change ? opts.change() : HttpResponse.json(merchant() as never);
    }),
    http.post(origin + '/api/admin/v1/payment-merchants/:id/check', ({params}) => {
      checks.push(String(params.id));
      return HttpResponse.json({group: 'payments', ok: false, message: 'WayForPay: merchant unknown'} as never);
    }));
  return {creates, changes, checks};
}

function mount() {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={['/integrations']}><AdminApp client={api} /></MemoryRouter>);
}

const card = async () => (await screen.findByText(/^WAYFORPAY · blizz_kyiv/)).closest('li') as HTMLElement;

async function add(user: ReturnType<typeof userEvent.setup>, over: Record<string, string> = {}) {
  const typeIn = async (label: string, key: string, fallback: string) => {
    const value = key in over ? over[key]! : fallback;
    if (value) await user.type(screen.getByLabelText(label), value);
  };
  await typeIn('Аккаунт мерчанта', 'account', 'blizz_lviv');
  await typeIn('Домен мерчанта', 'domain', 'blizz.taxi');
  await user.clear(screen.getByLabelText('Валюта мерчанта'));
  await typeIn('Валюта мерчанта', 'currency', 'UAH');
  await typeIn('Ключ мерчанта', 'secret', 'merchant-secret-key');
  await user.click(screen.getByRole('checkbox', {name: 'Город мерчанта: Львів'}));
  await typeIn('Причина изменения мерчантов', 'reason', 'Новый город');
  await typeIn('Ваш пароль для мерчантов', 'own', 'Admin-Pass-2026');
  await user.click(screen.getByRole('button', {name: 'Добавить мерчант'}));
}

describe('M1: the list', () => {
  it('provider, account, domain, currency, cities, key hint', async () => {
    handlers({list: () => [merchant(), merchant({id: 'm2', account: 'blizz_waw', currency: 'PLN', city_ids: [],
      secret_source: 'NONE', secret_hint: null})]});
    mount();
    expect(await screen.findByText('WAYFORPAY · blizz_kyiv · blizz.taxi · UAH · города: Київ, Львів · ключ: …a1b2 (панель)'))
      .toBeVisible();
    expect(screen.getByText('WAYFORPAY · blizz_waw · blizz.taxi · PLN · города: — · ключ не задан — карты не принимаются'))
      .toBeVisible();
  });
});

describe('M2: add', () => {
  it('one command; a warning that cities move', async () => {
    const {creates} = handlers();
    mount();
    const user = userEvent.setup();
    await card();
    expect(screen.getByText('Город, который уже обслуживает другой мерчант, перейдёт к этому.')).toBeVisible();
    await add(user);
    expect(await screen.findByText('Мерчант сохранён.')).toBeVisible();
    expect(creates).toEqual([{command_id: expect.any(String), password: 'Admin-Pass-2026', provider: 'WAYFORPAY',
      account: 'blizz_lviv', domain: 'blizz.taxi', currency: 'UAH', secret: 'merchant-secret-key',
      city_ids: [LVIV.id], reason: 'Новый город'}]);
    expect(screen.getByLabelText('Ключ мерчанта')).toHaveValue('');
    expect(screen.getByLabelText('Ваш пароль для мерчантов')).toHaveValue('');
  });
});

describe('M3: change', () => {
  it('only what changed; an empty key keeps it', async () => {
    const {changes} = handlers();
    mount();
    const user = userEvent.setup();
    const c = await card();
    await user.click(within(c).getByRole('button', {name: 'Изменить мерчант'}));
    await user.click(within(c).getByRole('checkbox', {name: 'Город мерчанта: Львів'}));
    await user.type(within(c).getByLabelText('Причина изменения мерчанта'), 'Львів окремо');
    await user.type(within(c).getByLabelText('Ваш пароль для мерчанта'), 'Admin-Pass-2026');
    await user.click(within(c).getByRole('button', {name: 'Сохранить мерчант'}));
    await waitFor(() => expect(changes).toHaveLength(1));
    expect(changes[0]).toEqual({command_id: expect.any(String), password: 'Admin-Pass-2026', domain: null,
      secret: null, city_ids: [KYIV.id], reason: 'Львів окремо'});
  });
});

describe('M3: only a new key', () => {
  it('sends the key and keeps the domain and the cities as null', async () => {
    const {changes} = handlers();
    mount();
    const user = userEvent.setup();
    const c = await card();
    await user.click(within(c).getByRole('button', {name: 'Изменить мерчант'}));
    await user.type(within(c).getByLabelText('Новый ключ мерчанта'), 'rotated-key');
    await user.type(within(c).getByLabelText('Причина изменения мерчанта'), 'Ротация ключа');
    await user.type(within(c).getByLabelText('Ваш пароль для мерчанта'), 'Admin-Pass-2026');
    await user.click(within(c).getByRole('button', {name: 'Сохранить мерчант'}));
    await waitFor(() => expect(changes).toHaveLength(1));
    expect(changes[0]).toEqual({command_id: expect.any(String), password: 'Admin-Pass-2026', domain: null,
      secret: 'rotated-key', city_ids: null, reason: 'Ротация ключа'});
  });
});

describe('M4: refused on the screen', () => {
  it.each([['no account', {account: ''}], ['no domain', {domain: ''}], ['a lower-case currency', {currency: 'uah'}],
    ['no key', {secret: ''}], ['no reason', {reason: ''}], ['no own password', {own: ''}]])(
    '%s sends nothing', async (_name, over) => {
      const {creates} = handlers();
      mount();
      const user = userEvent.setup();
      await card();
      await add(user, over);
      expect(await screen.findByText(/^Нужны аккаунт, домен, валюта из трёх заглавных букв/)).toBeVisible();
      expect(creates).toEqual([]);
    });

  it('a change with nothing changed sends nothing', async () => {
    const {changes} = handlers();
    mount();
    const user = userEvent.setup();
    const c = await card();
    await user.click(within(c).getByRole('button', {name: 'Изменить мерчант'}));
    await user.type(within(c).getByLabelText('Причина изменения мерчанта'), 'r');
    await user.type(within(c).getByLabelText('Ваш пароль для мерчанта'), 'p');
    await user.click(within(c).getByRole('button', {name: 'Сохранить мерчант'}));
    expect(await screen.findByText('Ничего не изменено; нужны причина и ваш пароль.')).toBeVisible();
    expect(changes).toEqual([]);
  });
});

describe('M5: secrets', () => {
  it('after a 403 the typed key and the password are emptied', async () => {
    handlers({change: () => HttpResponse.json(problem(403, 'ACCESS_DENIED'), {status: 403})});
    mount();
    const user = userEvent.setup();
    const c = await card();
    await user.click(within(c).getByRole('button', {name: 'Изменить мерчант'}));
    await user.type(within(c).getByLabelText('Новый ключ мерчанта'), 'new-secret');
    await user.type(within(c).getByLabelText('Причина изменения мерчанта'), 'r');
    await user.type(within(c).getByLabelText('Ваш пароль для мерчанта'), 'wrong');
    await user.click(within(c).getByRole('button', {name: 'Сохранить мерчант'}));
    expect(await screen.findByText('Ваш пароль не подошёл.')).toBeVisible();
    expect(within(c).getByLabelText('Новый ключ мерчанта')).toHaveValue('');
    expect(within(c).getByLabelText('Ваш пароль для мерчанта')).toHaveValue('');
  });
});

describe('M6: check', () => {
  it('shows the provider answer', async () => {
    const {checks} = handlers();
    mount();
    const user = userEvent.setup();
    const c = await card();
    await user.click(within(c).getByRole('button', {name: 'Проверить мерчант'}));
    expect(await within(c).findByText('✗ WayForPay: merchant unknown')).toBeVisible();
    expect(checks).toEqual([M1]);
  });
});

describe('M7: one at a time', () => {
  it('a double click changes once', async () => {
    const {changes} = handlers({change: async () => {
      await delay(100);
      return HttpResponse.json(merchant() as never);
    }});
    mount();
    const user = userEvent.setup();
    const c = await card();
    await user.click(within(c).getByRole('button', {name: 'Изменить мерчант'}));
    await user.type(within(c).getByLabelText('Новый ключ мерчанта'), 'k');
    await user.type(within(c).getByLabelText('Причина изменения мерчанта'), 'r');
    await user.type(within(c).getByLabelText('Ваш пароль для мерчанта'), 'p');
    await user.dblClick(within(c).getByRole('button', {name: 'Сохранить мерчант'}));
    expect(await screen.findByText('Мерчант сохранён.')).toBeVisible();
    expect(changes).toHaveLength(1);
  });
});
