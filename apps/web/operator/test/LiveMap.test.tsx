import {afterAll, afterEach, beforeAll, describe, expect, it} from 'vitest';
import {render, screen, waitFor} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {http, HttpResponse, delay} from 'msw';
import {setupServer} from 'msw/node';
import {createApiClient} from '@blizz/api-client';
import {browserRefreshTokens} from '@blizz/web-ui';
import {OperatorApp} from '../src/App.js';
import {markers} from '../src/LiveMap.js';
import {OSM_TILES, translator} from '@blizz/web-ui';
import {translations} from '../src/i18n.js';
import {readFileSync} from 'node:fs';
import {join} from 'node:path';
import {cid, me, problem, session} from '../../../../test/fixtures.js';

/** The live drivers on an OpenStreetMap map (#470): L1–L5 of the issue. */
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

const t = translator(translations, 'ru');

describe('L1: markers', () => {
  it('one per driver with a position, in order, coloured by status, labelled', () => {
    const drivers = [driver(1), driver(2, {status: 'ON_ORDER', location: {lat: 50.46, lon: 30.53}}),
      driver(3, {status: 'PAUSED', car: null, location: {lat: 50.47, lon: 30.54}}),
      driver(4, {status: 'CLOSING', location: {lat: 50.48, lon: 30.55}}),
      driver(5, {status: 'NO_SIGNAL', location: {lat: 50.49, lon: 30.56}})];
    expect(markers(drivers as never, t)).toEqual([
      {lat: 50.45, lon: 30.52, color: '#15803d', label: 'Водитель 1 · Skoda Octavia AA0001BB · свободен'},
      {lat: 50.46, lon: 30.53, color: '#1d4ed8', label: 'Водитель 2 · Skoda Octavia AA0002BB · на заказе'},
      {lat: 50.47, lon: 30.54, color: '#6b7280', label: 'Водитель 3 · без автомобиля · на паузе'},
      {lat: 50.48, lon: 30.55, color: '#b45309', label: expect.stringMatching(/^Водитель 4 · Skoda Octavia AA0004BB · /)},
      {lat: 50.49, lon: 30.56, color: '#b91c1c', label: expect.stringMatching(/^Водитель 5 · Skoda Octavia AA0005BB · /)}]);
  });
});

describe('L2: no position', () => {
  it('drivers without a location are not drawn', () => {
    expect(markers([driver(1, {location: null}), driver(2)] as never, t).map(m => m.label))
      .toEqual(['Водитель 2 · Skoda Octavia AA0002BB · свободен']);
  });

  it('they are counted on the board; with none, no count line', async () => {
    base(viewer, () => board([driver(1, {location: null}), driver(2, {location: null}), driver(3)]));
    await openBoard();
    expect(await screen.findByText('Без позиции на карте: 2')).toBeTruthy();
  });

  it('with every driver placed there is no count line', async () => {
    base(viewer, () => board([driver(1), driver(2)]));
    await openBoard();
    await screen.findByRole('region', {name: 'Машины на карте'});
    expect(screen.queryByText(/Без позиции на карте/)).toBeNull();
  });
});

describe('L3: CSP', () => {
  it('images only from self, data: and the OSM tile server', () => {
    const html = readFileSync(join(process.cwd(), 'apps/web/operator/index.html'), 'utf8');
    const csp = /content="([^"]+)"/.exec(html.slice(html.indexOf('Content-Security-Policy')))![1]!;
    const img = csp.split(';').map(p => p.trim()).find(p => p.startsWith('img-src'))!;
    expect(img.split(/\s+/).slice(1).sort()).toEqual(["'self'", 'data:', 'https://tile.openstreetmap.org'].sort());
  });
});

describe('L4: the board', () => {
  it('the map region and the OSM attribution above the list', async () => {
    base(viewer, () => board([driver(1)]));
    await openBoard();
    expect(await screen.findByRole('region', {name: 'Машины на карте'})).toBeTruthy();
    await waitFor(() => expect(screen.getByRole('link', {name: 'OpenStreetMap'}))
      .toHaveAttribute('href', 'https://www.openstreetmap.org/copyright'));
    expect(screen.getByText('Водитель 1 · Skoda Octavia, белый, AA0001BB · свободен')).toBeTruthy();
  });
});

describe('L5: shared tiles', () => {
  it('one definition of the OSM tiles for both panels', () => {
    expect(OSM_TILES.url).toBe('https://tile.openstreetmap.org/{z}/{x}/{y}.png');
    expect(OSM_TILES.maxZoom).toBe(19);
    expect(OSM_TILES.attribution).toContain('href="https://www.openstreetmap.org/copyright"');
  });
});
