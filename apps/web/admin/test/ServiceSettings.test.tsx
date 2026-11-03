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

/** Service settings (#411): S1–S6 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const manager = {...me, effective_permissions: ['settings.manage']};
const KYIV = {id: '5a000000-0000-4000-8000-000000000001', name: 'Київ', currency: 'UAH'};
const WAW = {id: '5a000000-0000-4000-8000-000000000002', name: 'Warszawa', currency: 'PLN'};
const settings = () => ({
  brand: {service_name: 'Blizz', primary_color: '#FFD400', on_primary_color: '#000000', accent_color: null,
    logo_url: null, support_phone: '+380441234567', support_email: null, support_telegram: null,
    privacy_policy_url: null, terms_url: null},
  languages: {default_language: 'uk', enabled: ['uk', 'ru']},
  calls: {mode: 'VIA_SERVICE_NUMBERS', service_phone: '+380441234567'},
  preorders: {threshold_minutes: 60, horizon_days: 7, mode: 'BROADCAST_BEFORE', broadcast_minutes: 30},
  app_versions: {rider_android: {minimum: '1.2.0', latest: '1.3.0'}, require_version_header: false},
  ratings: {edit_window_hours: 24}, tips: {window_hours: 24}, orders: {active_per_payer: 3},
  cash_not_received: {credit_driver: true, driver_share_percent: 100},
  staff_top_ups: {daily_max_per_staff_minor: {UAH: 30000000}},
  rider_debts: {allowed_minor: {UAH: 0, PLN: 1000}}});

function handlers(opts: {save?: () => Response} = {}) {
  const saves: Record<string, unknown>[] = [];
  let reads = 0;
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(manager as never)),
    http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [KYIV, WAW]})),
    http.get(origin + '/api/admin/v1/settings', () => {
      reads++;
      return HttpResponse.json({version: 4, settings: settings(), changed_by: 's1', reason: 'Пилот',
        changed_at: '2026-11-01T10:00:00Z'} as never);
    }),
    http.post(origin + '/api/admin/v1/settings', async ({request}) => {
      const body = await request.json() as {settings: unknown};
      saves.push(body as Record<string, unknown>);
      return opts.save ? opts.save() : HttpResponse.json({version: 5, settings: body.settings, reason: 'r'} as never);
    }));
  return {saves, reads: () => reads};
}

function mount() {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={['/settings/service']}><AdminApp client={api} /></MemoryRouter>);
}

async function open() {
  mount();
  const user = userEvent.setup();
  await waitFor(() => expect(screen.getByLabelText('Название службы')).toHaveValue('Blizz'));
  return user;
}

async function replace(user: ReturnType<typeof userEvent.setup>, label: string, value: string) {
  const input = screen.getByLabelText(label);
  await user.clear(input);
  if (value) {
    await user.click(input);
    await user.paste(value);
  }
}

async function save(user: ReturnType<typeof userEvent.setup>, reason = 'Уточнение') {
  if (reason) await user.type(screen.getByLabelText('Причина изменения настроек'), reason);
  await user.click(screen.getByRole('button', {name: 'Сохранить настройки'}));
}

describe('S1: read', () => {
  it('the form from the settings in force, and the version', async () => {
    handlers();
    await open();
    expect(screen.getByLabelText('Основной цвет')).toHaveValue('#FFD400');
    expect(screen.getByLabelText('Язык по умолчанию')).toHaveValue('uk');
    expect(screen.getByRole('checkbox', {name: 'ru'})).toBeChecked();
    expect(screen.getByRole('checkbox', {name: 'pl'})).not.toBeChecked();
    expect(screen.getByLabelText('Лимит пополнений сотрудника за сутки, UAH')).toHaveValue('300000.00');
    expect(screen.getByLabelText('Допустимый долг пассажира, PLN')).toHaveValue('10.00');
    expect(screen.getByText('Версия 4 · причина: Пилот')).toBeVisible();
  });

  it('is linked from the settings', async () => {
    handlers();
    const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
      correlationId: () => cid, initialSession: session});
    render(<MemoryRouter initialEntries={['/settings']}><AdminApp client={api} /></MemoryRouter>);
    expect(await screen.findByRole('link', {name: 'Настройки службы'})).toHaveAttribute('href', '/settings/service');
  });
});

describe('S2: save the whole', () => {
  it('unedited parts as read; edited ones changed', async () => {
    const {saves} = handlers();
    const user = await open();
    await replace(user, 'Название службы', 'Blizz Taxi');
    await replace(user, 'Окно оценки, часов', '48');
    await save(user);
    expect(await screen.findByText('Настройки сохранены.')).toBeVisible();
    const expected = settings();
    expected.brand.service_name = 'Blizz Taxi';
    expected.ratings.edit_window_hours = 48;
    expect(saves).toEqual([{command_id: expect.any(String), expected_version: 4, settings: expected,
      reason: 'Уточнение'}]);
  });
});

describe('S3: calls', () => {
  it('DIRECT warns about the call log', async () => {
    handlers();
    const user = await open();
    expect(screen.queryByText(/остаётся в журнале звонков/)).toBeNull();
    await user.selectOptions(screen.getByLabelText('Как звонят друг другу'), 'DIRECT');
    expect(screen.getByText('При прямых звонках номер другой стороны остаётся в журнале звонков телефона.'))
      .toBeVisible();
  });

  it('through the service needs its phone', async () => {
    const {saves} = handlers();
    const user = await open();
    await replace(user, 'Номер службы для звонков', '');
    await save(user);
    expect(await screen.findByText(/^Проверьте настройки/)).toBeVisible();
    expect(saves).toEqual([]);
  });
});

describe('S4: money per currency', () => {
  it('major units to minor; an empty limit left out; an empty debt is 0', async () => {
    const {saves} = handlers();
    const user = await open();
    await replace(user, 'Лимит пополнений сотрудника за сутки, UAH', '');
    await replace(user, 'Лимит пополнений сотрудника за сутки, PLN', '1500.5');
    await replace(user, 'Допустимый долг пассажира, PLN', '');
    await replace(user, 'Допустимый долг пассажира, UAH', '200');
    await save(user);
    await waitFor(() => expect(saves).toHaveLength(1));
    const sent = saves[0]!.settings as ReturnType<typeof settings>;
    expect(sent.staff_top_ups).toEqual({daily_max_per_staff_minor: {PLN: 150050}});
    expect(sent.rider_debts).toEqual({allowed_minor: {UAH: 20000, PLN: 0}});
  });
});

describe('S5: refused on the screen', () => {
  it.each([
    ['a name over 60', 'Название службы', 'x'.repeat(61)], ['a bad colour', 'Основной цвет', 'yellow'],
    ['white on yellow', 'Цвет текста на основном', '#FFFFFF'], ['a window of 0', 'Окно чаевых, часов', '0'],
    ['a window of 721', 'Окно оценки, часов', '721'], ['11 active orders', 'Активных заказов на плательщика', '11'],
    ['a share of 101', 'Доля водителя при неоплате наличными, %', '101'],
    ['a bad amount', 'Допустимый долг пассажира, UAH', '1.005']
  ])('%s sends nothing', async (_name, label, value) => {
    const {saves} = handlers();
    const user = await open();
    await replace(user, label, value);
    await save(user);
    expect(await screen.findByText(/^Проверьте настройки/)).toBeVisible();
    expect(saves).toEqual([]);
  });

  it('a default language that is not enabled', async () => {
    const {saves} = handlers();
    const user = await open();
    await user.click(screen.getByRole('checkbox', {name: 'uk'}));
    await save(user);
    expect(await screen.findByText(/^Проверьте настройки/)).toBeVisible();
    expect(saves).toEqual([]);
  });

  it('no reason', async () => {
    const {saves} = handlers();
    const user = await open();
    await save(user, '');
    expect(await screen.findByText(/^Проверьте настройки/)).toBeVisible();
    expect(saves).toEqual([]);
  });
});

describe('S6: conflict', () => {
  it('is told and the settings read again', async () => {
    const {reads} = handlers({save: () => HttpResponse.json(problem(409, 'VERSION_CONFLICT'), {status: 409})});
    const user = await open();
    await save(user);
    expect(await screen.findByText('Настройки изменил кто-то другой; показаны текущие.')).toBeVisible();
    await waitFor(() => expect(reads()).toBe(2));
  });
});
