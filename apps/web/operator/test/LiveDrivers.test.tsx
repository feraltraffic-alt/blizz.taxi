import {afterAll, afterEach, beforeAll, describe, expect, it} from 'vitest';
import {render, screen, waitFor, within} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {http, HttpResponse, delay} from 'msw';
import {setupServer} from 'msw/node';
import {createApiClient} from '@blizz/api-client';
import {browserRefreshTokens} from '@blizz/web-ui';
import {OperatorApp} from '../src/App.js';
import {cid, me, problem, session} from '../../../../test/fixtures.js';

/** The cars on the line (#286): L1–L7 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear();});
afterAll(() => server.close());

const city = (id: string, name: string) => ({id, code: name, name, currency: 'UAH', timezone: 'Europe/Kyiv',
  working_hours: [], payment_methods: ['CASH'], orders_paused: false, center: {lat: 50.45, lon: 30.52}});
const KYIV = city('5a000000-0000-4000-8000-000000000001', 'Київ');
const LVIV = city('5a000000-0000-4000-8000-000000000002', 'Львів');
const viewer = {...me, effective_permissions: ['orders.view']};
const AT = '2026-11-02T12:00:00Z';
const driver = (n: number, over: Record<string, unknown> = {}) => ({
  driver_id: 'd0000000-0000-4000-8000-00000000000' + n, name: 'Водитель ' + n,
  car: {registration_number: 'AA000' + n + 'BB', make: 'Skoda', model: 'Octavia', color: 'белый',
    classes: ['STANDARD']},
  has_payment_terminal: false, status: 'FREE', occupancy: 'FREE', connection: 'CONNECTED', geolocation: 'FRESH',
  location: {lat: 50.45, lon: 30.52}, last_location_at: AT, last_heartbeat_at: AT, order_id: null, ...over});
const board = (drivers: unknown[], cityId = KYIV.id, at = AT) => ({city_id: cityId, at, drivers});

type Asked = {city: string | null; status: string[]; vehicleClass: string | null; fresh: string | null};

function base(rights: unknown = viewer, answer: (asked: Asked) => unknown = () => board([driver(1)])) {
  const asked: Asked[] = [];
  const handlers = [
    http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [KYIV, LVIV]})),
    http.get(origin + '/api/operator/v1/me', () => HttpResponse.json(rights as never)),
    http.get(origin + '/api/operator/v1/vehicle-classes', () =>
      HttpResponse.json([{code: 'STANDARD', name: 'Стандарт'}, {code: 'COMFORT', name: 'Комфорт'}])),
    http.get(origin + '/api/operator/v1/drivers/live', async ({request}) => {
      const query = new URL(request.url).searchParams;
      const one = {city: query.get('city_id'), status: query.getAll('status'), vehicleClass: query.get('vehicle_class'),
        fresh: query.get('fresh')};
      asked.push(one);
      const result = answer(one);
      if (result instanceof Response) return result;
      const {wait, body} = (result as {wait?: number; body?: unknown});
      if (wait !== undefined) {
        await delay(wait);
        return HttpResponse.json(body as never);
      }
      return HttpResponse.json(result as never);
    })
  ];
  server.use(...handlers);
  return asked;
}

async function openBoard(pollMs = 60_000, user = userEvent.setup()) {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage, 'test'),
    correlationId: () => cid, initialSession: session});
  render(<OperatorApp client={api} pollMs={pollMs} />);
  await user.click(await screen.findByRole('button', {name: 'Машины на линии'}));
  return user;
}

describe('L1: the list', () => {
  it('shows each car with its status, terminal and order, and counts by status', async () => {
    base(viewer, () => board([driver(1), driver(2, {status: 'ON_ORDER', occupancy: 'ON_ORDER', has_payment_terminal: true,
      order_id: '90000000-0000-4000-8000-000000000001'}), driver(3, {status: 'PAUSED', car: null})]));
    await openBoard();
    const rows = await screen.findAllByRole('listitem');
    expect(rows.map(r => r.textContent)).toEqual([
      'Водитель 1 · Skoda Octavia, белый, AA0001BB · свободен',
      'Водитель 2 · Skoda Octavia, белый, AA0002BB · на заказе · терминал',
      'Водитель 3 · без автомобиля · на паузе']);
    expect(screen.getByText('Всего: 3 · свободен: 1 · на заказе: 1 · на паузе: 1')).toBeTruthy();
    expect(document.body.textContent).not.toMatch(/\+380/);
  });
});

describe('L2: filters go to the server', () => {
  it('a repeated status, the class and fresh', async () => {
    const asked = base();
    const user = await openBoard();
    await screen.findAllByRole('listitem');
    await user.click(screen.getByRole('checkbox', {name: 'свободен'}));
    await user.click(screen.getByRole('checkbox', {name: 'нет связи'}));
    await user.selectOptions(screen.getByLabelText('Класс авто'), 'COMFORT');
    await user.click(screen.getByRole('checkbox', {name: 'Только со свежей позицией'}));
    await waitFor(() => expect(asked.at(-1)).toEqual({city: KYIV.id, status: ['FREE', 'NO_SIGNAL'],
      vehicleClass: 'COMFORT', fresh: 'true'}));
    expect(asked[0]).toEqual({city: KYIV.id, status: [], vehicleClass: null, fresh: null});
  });
});

describe('L3: polling and the city', () => {
  it('reads again every pollMs', async () => {
    const asked = base();
    await openBoard(50);
    await waitFor(() => expect(asked.length).toBeGreaterThanOrEqual(3));
  });

  it('a late answer for the old city is ignored after a switch', async () => {
    const asked = base(viewer, one => one.city === KYIV.id
      ? {wait: 300, body: board([driver(1, {name: 'Киевский'})])}
      : board([driver(2, {name: 'Львовский'})], LVIV.id));
    const user = await openBoard();
    await user.selectOptions(screen.getByLabelText('Город'), LVIV.id);
    expect(await screen.findByText(/Львовский/)).toBeTruthy();
    await new Promise(resolve => setTimeout(resolve, 400));
    expect(screen.queryByText(/Киевский/)).toBeNull();
    expect(asked.map(a => a.city)).toEqual([KYIV.id, LVIV.id]);
  });
});

describe('L4: out of touch, by the server clock', () => {
  it('minutes since the last heartbeat against the answer time, and no heartbeat at all', async () => {
    base(viewer, () => board([
      driver(1, {status: 'NO_SIGNAL', connection: 'DISCONNECTED', last_heartbeat_at: '2026-11-02T11:53:30Z'}),
      driver(2, {connection: 'STALE', last_heartbeat_at: '2026-11-02T11:58:00Z'}),
      driver(3, {status: 'NO_SIGNAL', connection: 'DISCONNECTED', last_heartbeat_at: null})]));
    await openBoard();
    const rows = await screen.findAllByRole('listitem');
    expect(within(rows[0]!).getByText('нет связи 6 мин')).toBeTruthy();
    expect(within(rows[1]!).getByText('нет связи 2 мин')).toBeTruthy();
    expect(within(rows[2]!).getByText('нет связи')).toBeTruthy();
  });
});

describe('L5: the right', () => {
  it('without orders.view the board is not offered and nothing is asked', async () => {
    const asked = base({...me, effective_permissions: ['orders.create']});
    const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage, 'test'),
      correlationId: () => cid, initialSession: session});
    render(<OperatorApp client={api} pollMs={50} />);
    await screen.findByRole('button', {name: 'Выйти'});
    expect(screen.queryByRole('button', {name: 'Машины на линии'})).toBeNull();
    await new Promise(resolve => setTimeout(resolve, 150));
    expect(asked).toEqual([]);
  });
});

describe('L6: a failure', () => {
  it('shows the correlation id, and the next good poll removes it', async () => {
    let calls = 0;
    base(viewer, () => ++calls === 1 ? HttpResponse.json(problem(403, 'FORBIDDEN'), {status: 403})
      : board([driver(1)]));
    await openBoard(80);
    expect(await screen.findByText(/Код запроса: /)).toBeTruthy();
    expect(await screen.findByText(/Водитель 1/)).toBeTruthy();
    expect(screen.queryByText(/Код запроса: /)).toBeNull();
  });
});

describe('L7: empty', () => {
  it('says there are no cars', async () => {
    base(viewer, () => board([]));
    await openBoard();
    expect(await screen.findByText('Нет машин на линии.')).toBeTruthy();
  });
});
