import {afterAll, afterEach, beforeAll, describe, expect, it, vi} from 'vitest';
import {render, screen, waitFor} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {MemoryRouter} from 'react-router-dom';
import {http, HttpResponse} from 'msw';
import {setupServer} from 'msw/node';
import {createApiClient} from '@blizz/api-client';
import {translator} from '@blizz/web-ui';
import {AdminApp} from '../src/App.js';
import {CancellationReport, DriverDiscipline, driverRules, offerRules} from '../src/Discipline.js';
import {translations} from '../src/i18n.js';
import {browserRefreshTokens} from '../src/storage.js';
import {cid, me, problem, session} from '../../../../test/fixtures.js';

/** Drivers' cancellations and offers in the admin panel (ADR 0018, #487): settings, the driver's card, the report. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const t = translator(translations, 'ru');
const DRIVER = 'd0000000-0000-4000-8000-000000000001';
const PAUSE = 'e0000000-0000-4000-8000-000000000001';
const KYIV = {id: '5a000000-0000-4000-8000-000000000001', name: 'Київ', currency: 'UAH'};
const base = {brand: {service_name: 'Blizz', primary_color: '#FFD400', on_primary_color: '#000000'},
  languages: {default_language: 'uk', enabled: ['uk']}, calls: {mode: 'DIRECT', service_phone: null}};

const api = () => createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
  correlationId: () => cid, initialSession: session});

describe('the numbers of a form', () => {
  const text = (over: Record<string, string> = {}) => ({grace_seconds: '30', warn_after: '3', pause_after: '5',
    first_pause_minutes: '30', second_pause_minutes: '120', escalation_days: '7', rate_flag_percent: '20',
    rate_flag_min_accepted: '20', uncounted_flag_above: '5', uncounted_flag_days: '7', ...over});
  it.each([['warn at the pause', {warn_after: '5'}], ['a zero pause', {first_pause_minutes: '0'}],
    ['the first pause longer', {first_pause_minutes: '200'}], ['a negative grace', {grace_seconds: '-1'}],
    ['no escalation window', {escalation_days: '0'}], ['not a number', {pause_after: 'five'}]])('%s is refused',
    (_name, over) => {
      expect(driverRules(true, text(over))).toBeNull();
    });
  it('the defaults pass', () => {
    expect(driverRules(false, text())).toMatchObject({enabled: false, pause_after: 5, grace_seconds: 30});
  });
  it('the warning percent must be above the pause percent', () => {
    const offers = {missed_in_row: '3', acceptance_min_offers: '20', acceptance_warn_percent: '30',
      acceptance_pause_percent: '30', far_pickup_meters: '3000'};
    expect(offerRules(true, true, offers)).toBeNull();
    expect(offerRules(true, false, {...offers, acceptance_warn_percent: '50'}))
      .toMatchObject({acceptance_enabled: false, acceptance_warn_percent: 50});
  });
});

describe('settings', () => {
  function handlers(save?: () => Response) {
    const saves: Record<string, unknown>[] = [];
    let reads = 0;
    server.use(
      http.get(origin + '/api/admin/v1/me', () => HttpResponse.json({...me,
        effective_permissions: ['settings.manage']} as never)),
      http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [KYIV]})),
      http.get(origin + '/api/admin/v1/settings', () => {
        reads++;
        return HttpResponse.json({version: 4, settings: base} as never);
      }),
      http.post(origin + '/api/admin/v1/settings', async ({request}) => {
        const body = await request.json() as {settings: unknown};
        saves.push(body as Record<string, unknown>);
        return save ? save() : HttpResponse.json({version: 5, settings: body.settings} as never);
      }));
    return {saves, reads: () => reads};
  }

  async function open() {
    render(<MemoryRouter initialEntries={['/settings/discipline']}><AdminApp client={api()} /></MemoryRouter>);
    const user = userEvent.setup();
    await waitFor(() => expect(screen.getByLabelText('Пауза после отмен за сутки')).toHaveValue('5'));
    return user;
  }

  it('shows the defaults and sends both parts with the rest of the settings as read', async () => {
    const {saves} = handlers();
    const user = await open();
    await user.clear(screen.getByLabelText('Пауза после отмен за сутки'));
    await user.type(screen.getByLabelText('Пауза после отмен за сутки'), '6');
    await user.click(screen.getByRole('checkbox', {name: 'Снимать с линии за пропуски подряд'}));
    await user.type(screen.getByLabelText('Причина изменения'), 'Пилот');
    await user.click(screen.getByRole('button', {name: 'Сохранить правила'}));
    await waitFor(() => expect(saves).toHaveLength(1));
    expect(saves[0]).toMatchObject({expected_version: 4, reason: 'Пилот', settings: {...base,
      driver_discipline: {enabled: true, grace_seconds: 30, warn_after: 3, pause_after: 6, first_pause_minutes: 30,
        second_pause_minutes: 120, escalation_days: 7, rate_flag_percent: 20, rate_flag_min_accepted: 20,
        uncounted_flag_above: 5, uncounted_flag_days: 7},
      offer_discipline: {missed_enabled: false, missed_in_row: 3, acceptance_enabled: true, acceptance_min_offers: 20,
        acceptance_warn_percent: 50, acceptance_pause_percent: 30, far_pickup_meters: 3000}}});
    expect(await screen.findByText('Правила сохранены.')).toBeVisible();
  });

  it('the pickup time and the minutes of the fault go with the settings (ADR 0019, ADR 0020)', async () => {
    const {saves} = handlers();
    const user = await open();
    expect(screen.getByLabelText('Не предлагать заказ водителю с подачей дольше, минут')).toHaveValue('15');
    await user.clear(screen.getByLabelText('Не предлагать заказ водителю с подачей дольше, минут'));
    await user.type(screen.getByLabelText('Не предлагать заказ водителю с подачей дольше, минут'), '20');
    await user.clear(screen.getByLabelText('Бесплатная отмена клиентом после принятия заказа, минут'));
    await user.type(screen.getByLabelText('Бесплатная отмена клиентом после принятия заказа, минут'), '3');
    await user.click(screen.getByRole('checkbox',
      {name: 'Засчитывать водителю отмену клиентом из-за опоздания (паузы и предупреждения)'}));
    await user.type(screen.getByLabelText('Причина изменения'), 'Пилот');
    await user.click(screen.getByRole('button', {name: 'Сохранить правила'}));
    await waitFor(() => expect(saves).toHaveLength(1));
    expect(saves[0]).toMatchObject({settings: {pickup_time: {max_minutes: 20, routed_candidates: 10},
      cancellation_fault: {client_free_minutes: 3, driver_late_minutes: 5, driver_late_without_promise_minutes: 15,
        count_late_cancellations: true}}});
  });

  it('a pickup time over two hours sends nothing', async () => {
    const {saves} = handlers();
    const user = await open();
    await user.clear(screen.getByLabelText('Не предлагать заказ водителю с подачей дольше, минут'));
    await user.type(screen.getByLabelText('Не предлагать заказ водителю с подачей дольше, минут'), '121');
    await user.type(screen.getByLabelText('Причина изменения'), 'x');
    await user.click(screen.getByRole('button', {name: 'Сохранить правила'}));
    expect(await screen.findByText(/Проверьте числа/)).toBeVisible();
    expect(saves).toHaveLength(0);
  });

  it('a warning not before the pause, or no reason, sends nothing', async () => {
    const {saves} = handlers();
    const user = await open();
    await user.clear(screen.getByLabelText('Предупреждение после отмен за сутки'));
    await user.type(screen.getByLabelText('Предупреждение после отмен за сутки'), '5');
    await user.type(screen.getByLabelText('Причина изменения'), 'x');
    await user.click(screen.getByRole('button', {name: 'Сохранить правила'}));
    expect(await screen.findByText(/Проверьте числа/)).toBeVisible();
    await user.clear(screen.getByLabelText('Предупреждение после отмен за сутки'));
    await user.type(screen.getByLabelText('Предупреждение после отмен за сутки'), '3');
    await user.clear(screen.getByLabelText('Причина изменения'));
    await user.click(screen.getByRole('button', {name: 'Сохранить правила'}));
    expect(saves).toHaveLength(0);
  });

  it('a conflict reads the settings again', async () => {
    const {reads} = handlers(() => HttpResponse.json(problem(409, 'VERSION_CONFLICT') as never, {status: 409}));
    const user = await open();
    await user.type(screen.getByLabelText('Причина изменения'), 'x');
    await user.click(screen.getByRole('button', {name: 'Сохранить правила'}));
    expect(await screen.findByText('Настройки изменил кто-то другой; показаны свежие.')).toBeVisible();
    expect(reads()).toBe(2);
  });
});

describe('the driver\'s card', () => {
  const card = (pause: boolean) => ({driver_id: DRIVER,
    cancellations: {enabled: true, last24h: 5, warn_after: 3, pause_after: 5, until_pause: 0, accepted30d: 10,
      cancelled30d: 5, rate30d_percent: 50},
    acceptance: {enabled: true, offers7d: 4, accepted7d: 4, percent7d: null, min_offers: 20, warn_percent: 50,
      pause_percent: 30},
    pause: pause ? {id: PAUSE, kind: 'CANCELLATIONS', level: 1, ends_at: '2026-11-04T10:30:00Z'} : null,
    recent: [{order_id: 'a0000000-0000-4000-8000-000000000001', city_id: KYIV.id, reason_code: 'VEHICLE_PROBLEM',
      counted: true, not_counted_why: null, accepted_at: '2026-11-04T09:00:00Z', cancelled_at: '2026-11-04T09:01:00Z'},
    {order_id: 'a0000000-0000-4000-8000-000000000002', city_id: KYIV.id, reason_code: 'PASSENGER_ASKED',
      counted: false, not_counted_why: 'REASON', accepted_at: '2026-11-04T08:00:00Z',
      cancelled_at: '2026-11-04T08:05:00Z'}]});

  function handlers(lift?: () => Response) {
    const lifts: Record<string, unknown>[] = [];
    let lifted = false;
    server.use(
      http.get(origin + '/api/admin/v1/drivers/:id/discipline', () => HttpResponse.json(card(!lifted) as never)),
      http.get(origin + '/api/admin/v1/driver-pauses', ({request}) => {
        expect(new URL(request.url).searchParams.get('driver_id')).toBe(DRIVER);
        return HttpResponse.json({pauses: [{id: PAUSE, driver_id: DRIVER, city_id: KYIV.id, kind: 'CANCELLATIONS',
          level: 1, starts_at: '2026-11-04T10:00:00Z', ends_at: '2026-11-04T10:30:00Z', active: !lifted,
          lifted_at: null, lifted_by: null, lift_reason: lifted ? 'Сломалась машина' : null,
          version: lifted ? 2 : 1}]} as never);
      }),
      http.post(origin + '/api/admin/v1/driver-pauses/:id/lift', async ({request}) => {
        lifts.push(await request.json() as Record<string, unknown>);
        if (lift) return lift();
        lifted = true;
        return HttpResponse.json({} as never);
      }));
    return {lifts};
  }

  const mount = () => render(<MemoryRouter><DriverDiscipline client={api()} t={t} newId={() => 'c1'}
    driverId={DRIVER} /></MemoryRouter>);

  it('shows the counts, the reasons and the pause, and lifts it only with a reason', async () => {
    const {lifts} = handlers();
    mount();
    const user = userEvent.setup();
    expect(await screen.findByText(/Отмен после принятия за сутки: 5 \(пауза с 5\)\. За 30 дней: 5 из 10/))
      .toBeVisible();
    expect(screen.getByText('Предложений за 7 дней: 4 — процент считается от 20.')).toBeVisible();
    expect(screen.getByText('нет — причина не считается')).toBeVisible();
    expect(screen.getByRole('status')).toHaveTextContent(/на паузе за отмены \(уровень 1\)/);
    await user.click(screen.getByRole('button', {name: 'Снять паузу'}));
    expect(await screen.findByText('Укажите причину снятия паузы.')).toBeVisible();
    expect(lifts).toHaveLength(0);
    await user.type(screen.getByLabelText('Причина снятия паузы'), 'Сломалась машина');
    await user.click(screen.getByRole('button', {name: 'Снять паузу'}));
    await waitFor(() => expect(lifts).toEqual([{command_id: 'c1', expected_version: 1, reason: 'Сломалась машина'}]));
    expect(await screen.findByText('Паузы сейчас нет.')).toBeVisible();
    expect(screen.getByText(/снята: Сломалась машина/)).toBeVisible();
  });

  it('a pause already over reads the card again', async () => {
    handlers(() => HttpResponse.json(problem(409, 'STATE_CONFLICT') as never, {status: 409}));
    mount();
    const user = userEvent.setup();
    await user.type(await screen.findByLabelText('Причина снятия паузы'), 'x');
    await user.click(screen.getByRole('button', {name: 'Снять паузу'}));
    expect(await screen.findByText('Пауза уже закончилась или изменилась; показано текущее.')).toBeVisible();
  });
});

describe('the report', () => {
  it('lists the drivers of the chosen city with links to their cards', async () => {
    const asked: string[] = [];
    server.use(http.get(origin + '/api/admin/v1/reports/driver-cancellations', ({request}) => {
      asked.push(new URL(request.url).searchParams.get('city_id') ?? '');
      return HttpResponse.json({city_id: KYIV.id, days: 30, min_accepted: 20, generated_at: '2026-11-04T10:00:00Z',
        drivers: [{driver_id: DRIVER, accepted: 20, cancelled: 8, rate_percent: 40}]} as never);
    }));
    render(<MemoryRouter><CancellationReport client={api()} t={t} cities={[KYIV]} /></MemoryRouter>);
    expect(await screen.findByRole('link', {name: DRIVER.slice(0, 8)})).toHaveAttribute('href', '/drivers/' + DRIVER);
    expect(screen.getByText('40 %')).toBeVisible();
    expect(screen.getByText('8 из 20')).toBeVisible();
    expect(asked).toEqual([KYIV.id]);
  });
});

describe('a driver\'s reason that does not count', () => {
  it('is sent with a driver reason only', async () => {
    const creates: Record<string, unknown>[] = [];
    server.use(
      http.get(origin + '/api/admin/v1/me', () => HttpResponse.json({...me,
        effective_permissions: ['settings.manage']} as never)),
      http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [],
        languages: {default_language: 'uk', enabled: ['uk']}})),
      http.get(origin + '/api/admin/v1/settings/cancel-reasons', () => HttpResponse.json({reasons: [
        {id: 'c1', audience: 'DRIVER', code: 'PASSENGER_ASKED', labels: {uk: 'Попросив'}, driver_outcome: 'CANCEL_ORDER',
          operator_fault: false, not_counted: true, active: true, sort_order: 1, version: 0}]} as never)),
      http.post(origin + '/api/admin/v1/settings/cancel-reasons', async ({request}) => {
        const body = await request.json() as Record<string, unknown>;
        creates.push(body);
        return HttpResponse.json({...body, id: 'c2', version: 0} as never, {status: 201});
      }));
    render(<MemoryRouter initialEntries={['/settings/cancel-reasons']}><AdminApp client={api()} /></MemoryRouter>);
    const user = userEvent.setup();
    expect(await screen.findByText(/^PASSENGER_ASKED · .* · не считается отказом$/)).toBeVisible();
    await user.selectOptions(screen.getByLabelText('Сторона'), 'DRIVER');
    await user.type(screen.getByLabelText('Код'), 'ACCIDENT');
    await user.type(screen.getByLabelText('Текст (uk)'), 'ДТП');
    await user.selectOptions(screen.getByLabelText('Что делает причина водителя'), 'CANCEL_ORDER');
    await user.click(screen.getByRole('checkbox', {name: 'Не считать отказом водителя (ADR 0018)'}));
    await user.type(screen.getByLabelText('Причина изменения списка'), 'ADR 0018');
    await user.click(screen.getByRole('button', {name: 'Добавить причину'}));
    await waitFor(() => expect(creates).toHaveLength(1));
    expect(creates[0]).toMatchObject({audience: 'DRIVER', code: 'ACCIDENT', not_counted: true});
  });
});
