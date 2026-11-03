import {afterAll, afterEach, beforeAll, describe, expect, it, vi} from 'vitest';
import {readFileSync} from 'node:fs';
import {join} from 'node:path';
import {render, screen, waitFor} from '@testing-library/react';
import {MemoryRouter} from 'react-router-dom';
import {http, HttpResponse} from 'msw';
import {setupServer} from 'msw/node';
import {createApiClient} from '@blizz/api-client';
import {AdminApp} from '../src/App.js';
import {browserRefreshTokens} from '../src/storage.js';
import {rings, TILES} from '../src/CityMap.js';
import {cid, me, session} from '../../../../test/fixtures.js';

/** A map of a city's boundary and zones (#465): M1–M5 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const CITY = '5a000000-0000-4000-8000-000000000001';
const square = {type: 'Polygon', coordinates: [[[30.4, 50.4], [30.6, 50.4], [30.6, 50.5], [30.4, 50.5], [30.4, 50.4]]]};
const city = (polygon: unknown = square) => ({id: CITY, code: 'kyiv', name: 'Київ', currency: 'UAH',
  timezone: 'Europe/Kyiv', priority: 1, state: 'PUBLISHED', version: 3, polygon});
const zone = (over: Record<string, unknown> = {}) => ({id: 'z1', city_id: CITY, type: 'AIRPORT', priority: 5,
  state: 'PUBLISHED', version: 1, polygon: {type: 'Polygon', coordinates: [[[30.45, 50.42], [30.5, 50.42],
    [30.5, 50.45], [30.45, 50.42]]]}, ...over});
const operations = {working_hours: [], payment_methods: ['CASH'], return_zone_meters: 0,
  dropoff_outside_city: {allowed: true, max_distance_km: null}, orders_paused: false, pause_reason: null, version: 1};

describe('M1: GeoJSON to the map', () => {
  it('a Polygon: [lon, lat] becomes [lat, lon]', () => {
    expect(rings(square)).toEqual([[[50.4, 30.4], [50.4, 30.6], [50.5, 30.6], [50.5, 30.4], [50.4, 30.4]]]);
  });

  it('a MultiPolygon with a hole keeps every ring, swapped', () => {
    const multi = {type: 'MultiPolygon', coordinates: [
      [[[0, 1], [2, 1], [2, 3], [0, 1]], [[0.5, 1.5], [1, 1.5], [1, 2], [0.5, 1.5]]],
      [[[10, 11], [12, 11], [12, 13], [10, 11]]]]};
    expect(rings(multi)).toEqual([[[1, 0], [1, 2], [3, 2], [1, 0]], [[1.5, 0.5], [1.5, 1], [2, 1], [1.5, 0.5]],
      [[11, 10], [11, 12], [13, 12], [11, 10]]]);
  });

  it.each([['an unknown type', {type: 'Point', coordinates: [1, 2]}], ['an empty ring', {type: 'Polygon',
    coordinates: [[]]}], ['nothing', null], ['no coordinates', {type: 'Polygon'}]])('%s gives nothing', (_name, value) => {
    expect(rings(value)).toEqual([]);
  });
});

describe('M2: tiles and attribution', () => {
  it('the OpenStreetMap tile server, zoom up to 19, with its attribution', () => {
    expect(TILES.url).toBe('https://tile.openstreetmap.org/{z}/{x}/{y}.png');
    expect(TILES.maxZoom).toBe(19);
    expect(TILES.attribution).toContain('href="https://www.openstreetmap.org/copyright"');
    expect(TILES.attribution).toContain('OpenStreetMap');
  });
});

describe('M3: CSP', () => {
  it('images only from self, data: and the OSM tile server', () => {
    const html = readFileSync(join(process.cwd(), 'apps/web/admin/index.html'), 'utf8');
    const csp = /content="([^"]+)"/.exec(html.slice(html.indexOf('Content-Security-Policy')))![1]!;
    const img = csp.split(';').map(p => p.trim()).find(p => p.startsWith('img-src'))!;
    expect(img.split(/\s+/).slice(1).sort()).toEqual(["'self'", 'data:', 'https://tile.openstreetmap.org'].sort());
  });
});

function handlers(opts: {polygon?: unknown; zones?: unknown[]} = {}) {
  const asked = {zones: 0};
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json({...me,
      effective_permissions: ['geo.manage']} as never)),
    http.get(origin + '/api/admin/v1/cities', () => HttpResponse.json({cities: [city(opts.polygon ?? square)]} as never)),
    http.get(origin + '/api/admin/v1/cities/' + CITY + '/operations', () => HttpResponse.json(operations as never)),
    http.get(origin + '/api/admin/v1/cities/' + CITY + '/zones', () => {
      asked.zones++;
      return HttpResponse.json({zones: opts.zones ?? [zone(), zone({id: 'z2', type: 'STATION', state: 'DRAFT',
        priority: 2})]} as never);
    }));
  return asked;
}

function mount() {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={['/geo/' + CITY]}><AdminApp client={api} /></MemoryRouter>);
}

describe('M4: the city page', () => {
  it('the map with its attribution and the zones as text, asked once', async () => {
    const asked = handlers();
    mount();
    expect(await screen.findByText('AIRPORT · опубликована · приоритет 5')).toBeTruthy();
    expect(screen.getByText('STATION · черновик · приоритет 2')).toBeTruthy();
    expect(screen.getByRole('region', {name: 'Карта города'})).toBeTruthy();
    await waitFor(() => expect(screen.getByRole('link', {name: 'OpenStreetMap'}))
      .toHaveAttribute('href', 'https://www.openstreetmap.org/copyright'));
    expect(asked.zones).toBe(1);
  });

  it('no zones says so', async () => {
    handlers({zones: []});
    mount();
    expect(await screen.findByText('Зон нет.')).toBeTruthy();
  });
});

describe('M5: a city without a boundary', () => {
  it('no map, says so, and the page still works', async () => {
    handlers({polygon: {type: 'Polygon', coordinates: []}});
    mount();
    expect(await screen.findByText('У города нет границы для карты.')).toBeTruthy();
    expect(screen.queryByRole('region', {name: 'Карта города'})).toBeNull();
    expect(await screen.findByText('AIRPORT · опубликована · приоритет 5')).toBeTruthy();
  });
});
