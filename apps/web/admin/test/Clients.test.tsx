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

/** Riders (#413): K1–K6 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {
  server.resetHandlers();
  sessionStorage.clear();
  localStorage.clear();
  vi.restoreAllMocks();
  vi.useRealTimers();
});
afterAll(() => server.close());

const support = {...me, effective_permissions: ['clients.manage']};
const C = 'c1000000-0000-4000-8000-000000000001';
const CH = 'cc000000-0000-4000-8000-000000000001';
const client = (over: Record<string, unknown> = {}) => ({id: C, phone: '+380671234567', name: 'Оксана',
  language: 'uk', account_state: 'ACTIVE', has_app: true, created_at: '2026-10-01T10:00:00Z', version: 3, block: null,
  deletion_requested_at: null, ...over});
const card = (over: Record<string, unknown> = {}) => ({client: client(over), current_orders: [],
  latest_orders: [{id: 'o1', short_number: 1041, status: 'FULFILLED', created_at: '2026-11-02T10:00:00Z',
    pickup_label: 'Майдан', dropoff_label: 'Вокзал', vehicle_class: 'ECONOMY', price_minor: 12000,
    final_price_minor: 12500, currency: 'UAH', payment_method: 'CASH', driver: null, chat_available: false,
    cancellation: null, pickup_at: null}],
  bonuses: [{currency: 'UAH', balance_minor: 5000, available_minor: 5000}],
  debt: [{currency: 'UAH', amount_minor: 3550}],
  cases: [{id: 'k1', number: 77, category: 'LOST_ITEM', subject: 'Забыла сумку', state: 'OPEN',
    created_at: '2026-11-02T11:00:00Z'}]});

function handlers(opts: {act?: (action: string) => Response | undefined; phone?: () => Response} = {}) {
  const searches: URLSearchParams[] = [];
  const acts: {action: string; body: Record<string, unknown>}[] = [];
  let reads = 0;
  let state: Record<string, unknown> = {};
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(support as never)),
    http.get(origin + '/api/admin/v1/clients', ({request}) => {
      searches.push(new URL(request.url).searchParams);
      return HttpResponse.json({clients: [client()]} as never);
    }),
    http.get(origin + '/api/admin/v1/clients/' + C, () => {
      reads++;
      return HttpResponse.json(card(state) as never);
    }),
    http.post(origin + '/api/admin/v1/clients/' + C + '/:action', async ({request, params}) => {
      const body = await request.json() as Record<string, unknown>;
      const action = String(params.action);
      acts.push({action, body});
      const custom = opts.act?.(action);
      if (custom) return custom;
      if (action === 'block') {
        state = {account_state: 'BLOCKED', version: 4, block: {reason: body.reason, until: body.until ?? null,
          at: '2026-11-03T08:00:00Z'}};
      } else state = {version: 4};
      return HttpResponse.json(client(state) as never);
    }),
    http.post(origin + '/api/admin/v1/clients/' + C + '/phone/new-code', async ({request}) => {
      acts.push({action: 'new-code', body: await request.json() as Record<string, unknown>});
      return HttpResponse.json({challenge_id: CH, expires_at: '2026-11-03T08:10:00Z',
        resend_available_at: '2026-11-03T08:01:00Z'} as never);
    }),
    http.post(origin + '/api/admin/v1/clients/' + C + '/phone', async ({request}) => {
      acts.push({action: 'phone', body: await request.json() as Record<string, unknown>});
      if (opts.phone) return opts.phone();
      state = {phone: '+380509998877', version: 4};
      return HttpResponse.json({subject_id: C, phone: '+380509998877', version: 4} as never);
    }));
  return {searches, acts, reads: () => reads};
}

function mount(path = '/clients/' + C) {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={[path]}><AdminApp client={api} /></MemoryRouter>);
}

async function open() {
  mount();
  const user = userEvent.setup();
  await screen.findByText('+380671234567 · Оксана · активен');
  return user;
}

describe('K1: search', () => {
  it('4 digits or 2 letters; the rider linked', async () => {
    const {searches} = handlers();
    mount('/clients');
    const user = userEvent.setup();
    await user.type(await screen.findByLabelText('Телефон или имя'), '4567');
    await user.click(screen.getByRole('button', {name: 'Искать'}));
    expect(await screen.findByRole('link', {name: '+380671234567 · Оксана · активен'}))
      .toHaveAttribute('href', '/clients/' + C);
    expect(searches.map(q => q.get('query'))).toEqual(['4567']);
  });

  it.each([['3 digits', '456'], ['one letter', 'О']])('%s sends nothing', async (_name, text) => {
    const {searches} = handlers();
    mount('/clients');
    const user = userEvent.setup();
    await user.type(await screen.findByLabelText('Телефон или имя'), text);
    await user.click(screen.getByRole('button', {name: 'Искать'}));
    expect(await screen.findByText('Нужны хотя бы 4 цифры телефона или 2 буквы имени.')).toBeVisible();
    expect(searches).toEqual([]);
  });
});

describe('K2: the card', () => {
  it('bonuses, debt, orders, cases', async () => {
    handlers();
    await open();
    expect(screen.getByText('Бонусы: 50.00 UAH')).toBeVisible();
    expect(screen.getByText('Долг: 35.50 UAH')).toBeVisible();
    expect(screen.getByText('№ 1041 · 02.11.2026 · Майдан → Вокзал · FULFILLED · 125.00 UAH')).toBeVisible();
    expect(screen.getByText('Обращение № 77 · Забыла сумку · OPEN')).toBeVisible();
  });
});

describe('K3: block and unblock', () => {
  it('block until unblocked leaves until out; the card follows', async () => {
    const {acts} = handlers();
    const user = await open();
    await user.type(screen.getByLabelText('Причина блокировки или разблокировки'), 'Оскорбления водителя');
    await user.click(screen.getByRole('button', {name: 'Заблокировать'}));
    expect(await screen.findByText('Заблокирован: Оскорбления водителя · до разблокировки')).toBeVisible();
    expect(acts).toEqual([{action: 'block', body: {command_id: expect.any(String), expected_version: 3,
      reason: 'Оскорбления водителя'}}]);
  });

  it('block until a moment in UTC', async () => {
    vi.useFakeTimers({toFake: ['Date']});
    vi.setSystemTime(new Date('2026-11-03T08:00:00Z'));
    const {acts} = handlers();
    const user = await open();
    await user.type(screen.getByLabelText('Причина блокировки или разблокировки'), 'Неоплата');
    await user.type(screen.getByLabelText('Блокировка до (UTC), необязательно'), '2026-11-10 00:00');
    await user.click(screen.getByRole('button', {name: 'Заблокировать'}));
    await waitFor(() => expect(acts).toHaveLength(1));
    expect(acts[0]!.body).toEqual({command_id: expect.any(String), expected_version: 3, reason: 'Неоплата',
      until: '2026-11-10T00:00:00Z'});
  });

  it('unblock a blocked rider', async () => {
    const {acts} = handlers();
    mount();
    const user = userEvent.setup();
    server.use(http.get(origin + '/api/admin/v1/clients/' + C, () => HttpResponse.json(card({account_state: 'BLOCKED',
      block: {reason: 'r', until: null, at: '2026-11-01T00:00:00Z'}}) as never)));
    await screen.findByText(/заблокирован$/);
    await user.type(screen.getByLabelText('Причина блокировки или разблокировки'), 'Разобрались');
    await user.click(screen.getByRole('button', {name: 'Разблокировать'}));
    await waitFor(() => expect(acts).toHaveLength(1));
    expect(acts[0]).toEqual({action: 'unblock', body: {command_id: expect.any(String), expected_version: 3,
      reason: 'Разобрались'}});
  });
});

describe('K4: new phone', () => {
  it('a code to the new phone, then the code with the challenge and how the person was identified', async () => {
    const {acts} = handlers();
    const user = await open();
    await user.type(screen.getByLabelText('Новый телефон пассажира'), '+380509998877');
    await user.click(screen.getByRole('button', {name: 'Отправить код'}));
    expect(await screen.findByText('Код отправлен. Повторно — после 03.11.2026 08:01 UTC.')).toBeVisible();
    await user.type(screen.getByLabelText('Код, который назвал пассажир'), '123456');
    await user.type(screen.getByLabelText('Как установили личность'), 'Паспорт по видео');
    await user.click(screen.getByRole('button', {name: 'Сменить телефон'}));
    expect(await screen.findByText('+380509998877 · Оксана · активен')).toBeVisible();
    expect(acts).toEqual([{action: 'new-code', body: {phone: '+380509998877'}}, {action: 'phone', body: {
      command_id: expect.any(String), expected_version: 3, new_challenge_id: CH, new_code: '123456',
      reason: 'Паспорт по видео'}}]);
  });

  it.each([[409, 'STATE_CONFLICT', 'Этот телефон у другого аккаунта.'], [422, 'OTP_INVALID', 'Код не подошёл.']])(
    'a %i %s is told', async (status, code, text) => {
      handlers({phone: () => HttpResponse.json(problem(status, code), {status})});
      const user = await open();
      await user.type(screen.getByLabelText('Новый телефон пассажира'), '+380509998877');
      await user.click(screen.getByRole('button', {name: 'Отправить код'}));
      await screen.findByText(/^Код отправлен/);
      await user.type(screen.getByLabelText('Код, который назвал пассажир'), '123456');
      await user.type(screen.getByLabelText('Как установили личность'), 'Паспорт');
      await user.click(screen.getByRole('button', {name: 'Сменить телефон'}));
      expect(await screen.findByText(text)).toBeVisible();
    });
});

describe('K5: refused on the screen', () => {
  it.each([['no reason', '', ''], ['a reason over 500', 'x'.repeat(501), ''], ['a past end', 'r', '2026-01-01 00:00'],
    ['a bad end', 'r', '2026-11-31 00:00']])('blocking with %s sends nothing', async (_name, why, until) => {
    const {acts} = handlers();
    const user = await open();
    if (why) {
      await user.click(screen.getByLabelText('Причина блокировки или разблокировки'));
      await user.paste(why);
    }
    if (until) await user.type(screen.getByLabelText('Блокировка до (UTC), необязательно'), until);
    await user.click(screen.getByRole('button', {name: 'Заблокировать'}));
    expect(await screen.findByText(/^Нужна причина до 500 символов/)).toBeVisible();
    expect(acts).toEqual([]);
  });

  it('a phone not in E.164 sends nothing', async () => {
    const {acts} = handlers();
    const user = await open();
    await user.type(screen.getByLabelText('Новый телефон пассажира'), '0509998877');
    await user.click(screen.getByRole('button', {name: 'Отправить код'}));
    expect(await screen.findByText(/^Телефон — в виде/)).toBeVisible();
    expect(acts).toEqual([]);
  });

  it('a code of 3 digits sends nothing', async () => {
    const {acts} = handlers();
    const user = await open();
    await user.type(screen.getByLabelText('Новый телефон пассажира'), '+380509998877');
    await user.click(screen.getByRole('button', {name: 'Отправить код'}));
    await screen.findByText(/^Код отправлен/);
    await user.type(screen.getByLabelText('Код, который назвал пассажир'), '123');
    await user.type(screen.getByLabelText('Как установили личность'), 'r');
    await user.click(screen.getByRole('button', {name: 'Сменить телефон'}));
    expect(await screen.findByText(/^Код — от 4 до 8 цифр/)).toBeVisible();
    expect(acts.map(a => a.action)).toEqual(['new-code']);
  });
});

describe('K6: conflict', () => {
  it('a 409 on block is told and the card read again', async () => {
    const {reads} = handlers({act: () => HttpResponse.json(problem(409, 'VERSION_CONFLICT'), {status: 409})});
    const user = await open();
    await user.type(screen.getByLabelText('Причина блокировки или разблокировки'), 'r');
    await user.click(screen.getByRole('button', {name: 'Заблокировать'}));
    expect(await screen.findByText('Пассажира изменил кто-то другой; карточка обновлена.')).toBeVisible();
    await waitFor(() => expect(reads()).toBe(2));
  });
});
