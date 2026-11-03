import {afterAll, afterEach, beforeAll, describe, expect, it} from 'vitest';
import {render, screen, waitFor} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {http, HttpResponse, delay} from 'msw';
import {setupServer} from 'msw/node';
import {createApiClient} from '@blizz/api-client';
import {browserRefreshTokens} from '@blizz/web-ui';
import {OperatorApp} from '../src/App.js';
import {boxOf} from '../src/LiveMap.js';
import {cid, me, session} from '../../../../test/fixtures.js';

/** Limit the live board to the part of the map in view (#475): B1–B3 of the issue. */
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

type Asked = {city: string | null; status: string[]; vehicleClass: string | null; fresh: string | null;
  box: string | null};

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
        fresh: query.get('fresh'), box: query.get('box')};
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

describe('B1: format', () => {
  it('min_lat,min_lon,max_lat,max_lon with at most 6 decimals', () => {
    expect(boxOf({south: 50.4, west: 30.4, north: 50.5, east: 30.6})).toBe('50.4,30.4,50.5,30.6');
    expect(boxOf({south: 50.123456789, west: -0.1, north: 50.2, east: 0.1000004})).toBe('50.123457,-0.1,50.2,0.1');
  });
});

const parts = (box: string | null) => (box ?? '').split(',').map(Number);

describe('B2: sent only when on', () => {
  it('off: no box; on: box from the map view; off again: none', async () => {
    const asked = base();
    const user = await openBoard();
    await screen.findByRole('region', {name: 'Машины на карте'});
    expect(asked.every(a => a.box === null)).toBe(true);
    await user.click(screen.getByLabelText('Только видимая часть карты'));
    await waitFor(() => expect(asked.at(-1)!.box).not.toBeNull());
    const [south, west, north, east] = parts(asked.at(-1)!.box);
    expect(south! <= north! && west! <= east!).toBe(true);
    // jsdom gives the map no size: its view is the center, as the projection rounds it.
    for (const [value, center] of [[south, 50.45], [north, 50.45], [west, 30.52], [east, 30.52]] as const) {
      expect(Math.abs(value! - center)).toBeLessThan(0.001);
    }
    await user.click(screen.getByLabelText('Только видимая часть карты'));
    await waitFor(() => expect(asked.at(-1)!.box).toBeNull());
  });
});

describe('B3: kept with the other filters', () => {
  it('status, class and fresh go along with box', async () => {
    const asked = base();
    const user = await openBoard();
    await screen.findByRole('region', {name: 'Машины на карте'});
    await user.click(screen.getByRole('checkbox', {name: 'свободен'}));
    await user.click(screen.getByLabelText('Только видимая часть карты'));
    await waitFor(() => expect(asked.at(-1)!.box).not.toBeNull());
    expect(asked.at(-1)!.status).toEqual(['FREE']);
    expect(asked.at(-1)!.city).toBe(KYIV.id);
  });
});
