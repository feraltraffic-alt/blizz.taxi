import {afterAll, afterEach, beforeAll, describe, expect, it, vi} from 'vitest';
import {render, screen, waitFor} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {MemoryRouter} from 'react-router-dom';
import {http, HttpResponse} from 'msw';
import {setupServer} from 'msw/node';
import {createApiClient} from '@blizz/api-client';
import {translator} from '@blizz/web-ui';
import {AdminApp} from '../src/App.js';
import {RefundSettings, StaffRefundLimits, WaitingRefunds} from '../src/Refunds.js';
import {translations} from '../src/i18n.js';
import {browserRefreshTokens} from '../src/storage.js';
import {cid, me, problem, session} from '../../../../test/fixtures.js';

/** Staff refunds in the admin panel (#512 part 4, ADR 0018 part A). */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const t = translator(translations, 'ru');
const ORDER = '0d000000-0000-4000-8000-000000000001';
const STAFF = 'a2000000-0000-4000-8000-000000000002';
const R1 = 'f1000000-0000-4000-8000-000000000001';
const api = () => createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
  correlationId: () => cid, initialSession: session});
const newId = () => '40000000-0000-4000-8000-000000000001';

const refundable = (over: Record<string, unknown> = {}) => ({order_id: ORDER, currency: 'UAH', money_minor: 15000,
  bonus_minor: 0, refunded_minor: 0, left_minor: 15000, minimum_minor: 1000, to_card: true,
  until: '2026-12-01T10:00:00Z', default_fault: null, rider_warning: false, rider_refunds: 0, ...over});
const refund = (over: Record<string, unknown> = {}) => ({id: R1, order_id: ORDER, city_id: ORDER, client_id: ORDER,
  driver_id: null, currency: 'UAH', amount_minor: 1200, card_minor: 1200, bonus_minor: 0, paid_bonus_minor: 0,
  rider_agreed: false, reason_code: 'LONG_ROUTE', reason_labels: {ru: 'Длинный маршрут'}, fault: 'DRIVER',
  comment: null, state: 'REQUESTED', requested_by: STAFF, requested_at: '2026-11-06T10:00:00Z', decided_by: null,
  decided_at: null, decision_reason: null, ended_at: null, version: 1, ...over});

function orderHandlers(opts: {allows?: Record<string, unknown>; create?: () => Response;
  rights?: string[]} = {}) {
  const sent: Record<string, unknown>[] = [];
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json({...me,
      effective_permissions: opts.rights ?? ['orders.view', 'refunds.create']} as never)),
    http.get(origin + '/api/admin/v1/orders/' + ORDER + '/timeline', () => HttpResponse.json({events: []} as never)),
    http.get(origin + '/api/admin/v1/orders/' + ORDER + '/fare', () => HttpResponse.json(problem(404, 'NOT_FOUND'),
      {status: 404})),
    http.get(origin + '/api/admin/v1/orders/' + ORDER + '/refunds', () => HttpResponse.json({
      refundable: refundable(opts.allows), refunds: []} as never)),
    http.get(origin + '/api/admin/v1/refund-reasons', () => HttpResponse.json({reasons: [
      {code: 'LONG_ROUTE', labels: {ru: 'Длинный маршрут'}, fault: 'DRIVER'},
      {code: 'OTHER', labels: {ru: 'Другое'}, fault: 'NONE'}]} as never)),
    http.post(origin + '/api/admin/v1/orders/' + ORDER + '/refunds', async ({request}) => {
      sent.push(await request.json() as Record<string, unknown>);
      return opts.create ? opts.create() : HttpResponse.json(({refund: refund(), rider_warning: true,
        rider_refunds: 3}) as never, {status: 201});
    }));
  return sent;
}

function mountOrder() {
  render(<MemoryRouter initialEntries={['/orders/' + ORDER]}><AdminApp client={api()} /></MemoryRouter>);
}

async function fill(user: ReturnType<typeof userEvent.setup>, amount: string, reason: string) {
  await user.type(await screen.findByLabelText('Сумма, UAH'), amount);
  await user.selectOptions(screen.getByLabelText('Причина'), reason);
}

describe('the order card', () => {
  it('shows what the order allows and requests a card refund in minor units', async () => {
    const sent = orderHandlers();
    mountOrder();
    const user = userEvent.setup();
    expect(await screen.findByText(/Оплачено деньгами 150\.00, бонусами 0\.00/)).toBeVisible();
    await fill(user, '12', 'LONG_ROUTE');
    await user.click(screen.getByRole('button', {name: 'Оформить возврат'}));
    await waitFor(() => expect(sent).toHaveLength(1));
    expect(sent[0]).toEqual({command_id: expect.any(String), amount_minor: 1200, destination: 'CARD',
      rider_agreed: false, reason_code: 'LONG_ROUTE'});
    expect(await screen.findByText(/Возврат ждёт подтверждения\. У пассажира уже 3/)).toBeVisible();
  });

  it('a cash trip offers only bonuses, and bonuses need the rider\'s consent', async () => {
    const sent = orderHandlers({allows: {to_card: false}});
    mountOrder();
    const user = userEvent.setup();
    await fill(user, '12', 'LONG_ROUTE');
    expect(screen.queryByRole('option', {name: 'На карту'})).toBeNull();
    await user.click(screen.getByRole('button', {name: 'Оформить возврат'}));
    expect(await screen.findByText(/Укажите сумму и причину/)).toBeVisible();
    expect(sent).toHaveLength(0);
    await user.click(screen.getByRole('checkbox', {name: 'Пассажир согласен на бонусы'}));
    await user.click(screen.getByRole('button', {name: 'Оформить возврат'}));
    await waitFor(() => expect(sent).toHaveLength(1));
    expect(sent[0]).toMatchObject({destination: 'BONUSES', rider_agreed: true});
  });

  it('OTHER needs who pays and a comment', async () => {
    const sent = orderHandlers();
    mountOrder();
    const user = userEvent.setup();
    await fill(user, '12', 'OTHER');
    await user.click(screen.getByRole('button', {name: 'Оформить возврат'}));
    expect(await screen.findByText(/Укажите сумму и причину/)).toBeVisible();
    await user.selectOptions(screen.getByLabelText('Кто платит'), 'DRIVER');
    await user.type(screen.getByLabelText('Комментарий'), 'курил в салоне');
    await user.click(screen.getByRole('button', {name: 'Оформить возврат'}));
    await waitFor(() => expect(sent).toHaveLength(1));
    expect(sent[0]).toMatchObject({reason_code: 'OTHER', fault: 'DRIVER', comment: 'курил в салоне'});
  });

  it('over the limit, the server\'s refusal in words', async () => {
    orderHandlers({create: () => HttpResponse.json(problem(422, 'REFUND_LIMIT'), {status: 422})});
    mountOrder();
    const user = userEvent.setup();
    await fill(user, '600', 'LONG_ROUTE');
    await user.click(screen.getByRole('button', {name: 'Оформить возврат'}));
    expect(await screen.findByText(/Сверх вашего лимита возвратов/)).toBeVisible();
  });

  it('a confirmer sees the refunds but makes none', async () => {
    orderHandlers({rights: ['orders.view', 'refunds.confirm']});
    mountOrder();
    expect(await screen.findByText(/Оплачено деньгами/)).toBeVisible();
    expect(screen.queryByRole('button', {name: 'Оформить возврат'})).toBeNull();
  });
});

describe('waiting for a confirmation', () => {
  function handlers(answer?: () => Response) {
    const sent: {path: string; body: Record<string, unknown>}[] = [];
    server.use(
      http.get(origin + '/api/admin/v1/refunds/waiting', () => HttpResponse.json({refunds: [refund()]} as never)),
      http.post(origin + '/api/admin/v1/refunds/:id/:action', async ({request, params}) => {
        sent.push({path: String(params.action), body: await request.json() as Record<string, unknown>});
        return answer ? answer() : HttpResponse.json(refund({state: 'APPROVED', version: 2}) as never);
      }));
    return sent;
  }

  it('confirms with the version read; a rejection needs a reason', async () => {
    const sent = handlers();
    render(<WaitingRefunds client={api()} t={t} newId={newId} />);
    const user = userEvent.setup();
    await screen.findByText(/12\.00 UAH · Длинный маршрут · платит водитель/);
    await user.click(screen.getByRole('button', {name: 'Отклонить'}));
    expect(await screen.findByText('Укажите причину отказа (до 500 символов).')).toBeVisible();
    await user.click(screen.getByRole('button', {name: 'Подтвердить'}));
    await waitFor(() => expect(sent).toHaveLength(1));
    expect(sent[0]).toEqual({path: 'confirm', body: {command_id: newId(), expected_version: 1}});
    await user.type(screen.getByLabelText('Причина отказа'), 'маршрут был кратчайшим');
    await user.click(screen.getByRole('button', {name: 'Отклонить'}));
    await waitFor(() => expect(sent).toHaveLength(2));
    expect(sent[1]).toEqual({path: 'reject', body: {command_id: newId(), expected_version: 1,
      reason: 'маршрут был кратчайшим'}});
  });

  it('a change by someone else reads the list again', async () => {
    handlers(() => HttpResponse.json(problem(409, 'VERSION_CONFLICT'), {status: 409}));
    render(<WaitingRefunds client={api()} t={t} newId={newId} />);
    const user = userEvent.setup();
    await user.click(await screen.findByRole('button', {name: 'Подтвердить'}));
    expect(await screen.findByText('Данные изменились; показаны свежие.')).toBeVisible();
  });
});

describe('a staff member\'s limits', () => {
  it('no limit, then 500 and 3000 by default, in minor units, as a new currency', async () => {
    const sent: Record<string, unknown>[] = [];
    server.use(
      http.get(origin + '/api/admin/v1/staff/' + STAFF + '/refund-limits', () => HttpResponse.json({limits: []})),
      http.post(origin + '/api/admin/v1/staff/' + STAFF + '/refund-limits', async ({request}) => {
        sent.push(await request.json() as Record<string, unknown>);
        return HttpResponse.json({staff_id: STAFF, currency: 'UAH', per_refund_minor: 50000, daily_minor: 300000,
          used_minor: 0, version: 1} as never);
      }));
    render(<StaffRefundLimits client={api()} t={t} newId={newId} staffId={STAFF} />);
    const user = userEvent.setup();
    expect(await screen.findByText('Лимиты не заданы — возвраты недоступны.')).toBeVisible();
    await user.click(screen.getByRole('button', {name: 'Сохранить лимит'}));
    expect(await screen.findByText(/Валюта — три латинские буквы/)).toBeVisible();
    await user.type(screen.getByLabelText('Причина изменения лимита'), 'пилот');
    await user.click(screen.getByRole('button', {name: 'Сохранить лимит'}));
    await waitFor(() => expect(sent).toHaveLength(1));
    expect(sent[0]).toEqual({command_id: newId(), currency: 'UAH', per_refund_minor: 50000, daily_minor: 300000,
      expected_version: 0, reason: 'пилот'});
  });
});

describe('a staff member\'s limits, changed', () => {
  it('a currency with a limit is changed against its version', async () => {
    const sent: Record<string, unknown>[] = [];
    server.use(
      http.get(origin + '/api/admin/v1/staff/' + STAFF + '/refund-limits', () => HttpResponse.json({limits: [
        {staff_id: STAFF, currency: 'UAH', per_refund_minor: 50000, daily_minor: 300000, used_minor: 12000,
          version: 2}]} as never)),
      http.post(origin + '/api/admin/v1/staff/' + STAFF + '/refund-limits', async ({request}) => {
        sent.push(await request.json() as Record<string, unknown>);
        return HttpResponse.json({} as never);
      }));
    render(<StaffRefundLimits client={api()} t={t} newId={newId} staffId={STAFF} />);
    const user = userEvent.setup();
    expect(await screen.findByText('UAH: один возврат до 500.00, за 24 часа до 3000.00 (использовано 120.00)'))
      .toBeVisible();
    await user.clear(screen.getByLabelText('За 24 часа, не больше'));
    await user.type(screen.getByLabelText('За 24 часа, не больше'), '4000');
    await user.type(screen.getByLabelText('Причина изменения лимита'), 'больше смен');
    await user.click(screen.getByRole('button', {name: 'Сохранить лимит'}));
    await waitFor(() => expect(sent).toHaveLength(1));
    expect(sent[0]).toMatchObject({currency: 'UAH', daily_minor: 400000, expected_version: 2});
  });
});

describe('the service\'s rules', () => {
  it('terms and sums go with the settings; the super admin\'s term is not shorter', async () => {
    const saves: Record<string, unknown>[] = [];
    const base = {brand: {name: 'Blizz'}, languages: {default_language: 'ru', enabled: ['ru']}};
    server.use(
      http.get(origin + '/api/admin/v1/settings', () => HttpResponse.json({version: 4, settings: base} as never)),
      http.post(origin + '/api/admin/v1/settings', async ({request}) => {
        const body = await request.json() as Record<string, unknown>;
        saves.push(body);
        return HttpResponse.json({version: 5, settings: body.settings} as never);
      }));
    render(<RefundSettings client={api()} t={t} newId={newId} />);
    const user = userEvent.setup();
    const staffDays = await screen.findByLabelText('Сотрудник возвращает в течение, дней');
    expect(staffDays).toHaveValue('30');
    await user.clear(staffDays);
    await user.type(staffDays, '200');
    await user.type(screen.getByLabelText('Причина изменения лимита'), 'бухгалтерия');
    await user.click(screen.getByRole('button', {name: 'Сохранить правила возвратов'}));
    expect(await screen.findByText(/срок супер-админа не короче/)).toBeVisible();
    expect(saves).toHaveLength(0);
    await user.clear(staffDays);
    await user.type(staffDays, '20');
    await user.clear(screen.getByLabelText('Бонусы за возврат действуют, дней (0 — бессрочно)'));
    await user.type(screen.getByLabelText('Бонусы за возврат действуют, дней (0 — бессрочно)'), '90');
    await user.clear(screen.getByLabelText('Минимальный возврат'));
    await user.type(screen.getByLabelText('Минимальный возврат'), '15');
    await user.click(screen.getByRole('button', {name: 'Сохранить правила возвратов'}));
    await waitFor(() => expect(saves).toHaveLength(1));
    expect(saves[0]).toMatchObject({expected_version: 4, settings: {...base, refunds: {staff_days: 20,
      super_admin_days: 180, minimum_minor: {UAH: 1500}, default_per_refund_minor: {UAH: 50000},
      card_for_cash: false, bonus_validity_days: 90}}});
  });
});
