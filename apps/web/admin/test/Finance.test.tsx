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

/** Finance: limits of transfers between drivers (#416): T1–T4 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const finance = {...me, effective_permissions: ['finance.manage']};
const KYIV = {id: '5a000000-0000-4000-8000-000000000001', name: 'Київ', currency: 'UAH'};
const WAW = {id: '5a000000-0000-4000-8000-000000000002', name: 'Warszawa', currency: 'PLN'};
const rule = (over: Record<string, unknown> = {}) => ({currency: 'UAH', enabled: true, max_per_transfer_minor: 50000,
  max_per_day_minor: 200000, min_balance_after_minor: 0, version: 2, ...over});

function handlers(opts: {set?: () => Response} = {}) {
  const sets: {currency: string; body: Record<string, unknown>}[] = [];
  let reads = 0;
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(finance as never)),
    http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [KYIV, WAW]})),
    http.get(origin + '/api/admin/v1/settings/driver-transfers', () => {
      reads++;
      return HttpResponse.json({rules: [rule()]} as never);
    }),
    http.post(origin + '/api/admin/v1/settings/driver-transfers/:currency', async ({request, params}) => {
      const body = await request.json() as Record<string, unknown>;
      sets.push({currency: String(params.currency), body});
      if (opts.set) return opts.set();
      return HttpResponse.json(rule({currency: params.currency, enabled: body.enabled,
        max_per_transfer_minor: body.max_per_transfer_minor, max_per_day_minor: body.max_per_day_minor,
        min_balance_after_minor: body.min_balance_after_minor, version: Number(body.expected_version) + 1}) as never);
    }));
  return {sets, reads: () => reads};
}

function mount() {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={['/finance']}><AdminApp client={api} /></MemoryRouter>);
}

const block = async (currency: string) => (await screen.findByRole('group', {name: 'Переводы в ' + currency}));

async function put(user: ReturnType<typeof userEvent.setup>, box: HTMLElement, label: string, value: string) {
  const input = within(box).getByLabelText(label);
  await user.clear(input);
  if (value) await user.type(input, value);
}

describe('T1: the list', () => {
  it('a rule per currency, and the city currencies without one', async () => {
    handlers();
    mount();
    expect(within(await block('UAH')).getByText('включены · до 500.00 за перевод · до 2 000.00 в сутки (UTC) · '
      + 'остаток после не меньше 0.00')).toBeVisible();
    expect(within(await block('PLN')).getByText('правила нет — переводы выключены')).toBeVisible();
  });
});

describe('T2: set', () => {
  it('a changed rule with its version, amounts in minor units', async () => {
    const {sets} = handlers();
    mount();
    const user = userEvent.setup();
    const uah = await block('UAH');
    await put(user, uah, 'За перевод', '750.5');
    await put(user, uah, 'Остаток после перевода не меньше', '-100');
    await put(user, uah, 'Причина', 'Пилот');
    await user.click(within(uah).getByRole('button', {name: 'Сохранить правило'}));
    expect(await within(uah).findByText(/^включены · до 750\.50 за перевод/)).toBeVisible();
    expect(sets).toEqual([{currency: 'UAH', body: {command_id: expect.any(String), expected_version: 2, enabled: true,
      max_per_transfer_minor: 75050, max_per_day_minor: 200000, min_balance_after_minor: -10000, reason: 'Пилот'}}]);
  });

  it('a new rule with version 0', async () => {
    const {sets} = handlers();
    mount();
    const user = userEvent.setup();
    const pln = await block('PLN');
    await user.click(within(pln).getByRole('checkbox', {name: 'Переводы включены'}));
    await put(user, pln, 'За перевод', '100');
    await put(user, pln, 'В сутки', '300');
    await put(user, pln, 'Остаток после перевода не меньше', '0');
    await put(user, pln, 'Причина', 'Запуск');
    await user.click(within(pln).getByRole('button', {name: 'Сохранить правило'}));
    await waitFor(() => expect(sets).toHaveLength(1));
    expect(sets[0]).toEqual({currency: 'PLN', body: {command_id: expect.any(String), expected_version: 0,
      enabled: true, max_per_transfer_minor: 10000, max_per_day_minor: 30000, min_balance_after_minor: 0,
      reason: 'Запуск'}});
  });
});

describe('T3: refused on the screen', () => {
  it.each([['0 per transfer', 'За перевод', '0'], ['0 per day', 'В сутки', '0'], ['per day below per transfer',
    'В сутки', '100'], ['three decimals', 'За перевод', '1.005'], ['no reason', 'Причина', '']])(
    '%s sends nothing', async (_name, label, value) => {
      const {sets} = handlers();
      mount();
      const user = userEvent.setup();
      const uah = await block('UAH');
      await put(user, uah, 'Причина', 'r');
      await put(user, uah, label, value);
      await user.click(within(uah).getByRole('button', {name: 'Сохранить правило'}));
      expect(await screen.findByText(/^Суммы больше 0/)).toBeVisible();
      expect(sets).toEqual([]);
    });
});

describe('T4: conflict', () => {
  it('is told and the list read again', async () => {
    const {reads} = handlers({set: () => HttpResponse.json(problem(409, 'VERSION_CONFLICT'), {status: 409})});
    mount();
    const user = userEvent.setup();
    const uah = await block('UAH');
    await put(user, uah, 'Причина', 'r');
    await user.click(within(uah).getByRole('button', {name: 'Сохранить правило'}));
    expect(await screen.findByText('Правило изменил кто-то другой; список обновлён.')).toBeVisible();
    await waitFor(() => expect(reads()).toBe(2));
  });
});
