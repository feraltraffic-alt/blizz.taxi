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

/** The admin panel's live map of the drivers (#482): V1–V4 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const KYIV = {id: '5a000000-0000-4000-8000-000000000001', code: 'kyiv', name: 'Київ', currency: 'UAH',
  timezone: 'Europe/Kyiv', center: {lat: 50.45, lon: 30.52}};
const viewer = {...me, effective_permissions: ['orders.view']};
const other = {...me, effective_permissions: ['geo.manage']};
const AT = '2026-11-03T12:00:00Z';
const driver = {driver_id: 'd0000000-0000-4000-8000-000000000001', name: 'Водитель 1',
  car: {registration_number: 'AA0001BB', make: 'Skoda', model: 'Octavia', color: 'белый', classes: ['STANDARD']},
  has_payment_terminal: false, status: 'FREE', occupancy: 'FREE', connection: 'CONNECTED', geolocation: 'FRESH',
  location: {lat: 50.45, lon: 30.52}, last_location_at: AT, last_heartbeat_at: AT, order_id: null};

type Asked = {path: string; city: string | null; status: string[]; box: string | null};

function handlers(opts: {rights?: unknown; live?: () => Response} = {}) {
  const asked: Asked[] = [];
  const answer = (path: string) => ({request}: {request: Request}) => {
    const q = new URL(request.url).searchParams;
    asked.push({path, city: q.get('city_id'), status: q.getAll('status'), box: q.get('box')});
    return opts.live ? opts.live() : HttpResponse.json({city_id: KYIV.id, at: AT, drivers: [driver]} as never);
  };
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json((opts.rights ?? viewer) as never)),
    http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [KYIV]} as never)),
    http.get(origin + '/api/operator/v1/vehicle-classes', () => HttpResponse.json([] as never)),
    http.get(origin + '/api/admin/v1/drivers/live', answer('admin')),
    http.get(origin + '/api/operator/v1/drivers/live', answer('operator')));
  return asked;
}

function mount(path = '/live') {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={[path]}><AdminApp client={api} /></MemoryRouter>);
}

describe('V1: the section', () => {
  it('in the menu with orders.view; reads the admin path with the first city; map and list', async () => {
    const asked = handlers();
    mount('/');
    const user = userEvent.setup();
    await user.click(await screen.findByRole('link', {name: 'Карта машин'}));
    expect(await screen.findByRole('region', {name: 'Машины на карте'})).toBeTruthy();
    expect(screen.getByText('Водитель 1 · Skoda Octavia, белый, AA0001BB · свободен')).toBeTruthy();
    expect(asked.map(a => [a.path, a.city])).toEqual([['admin', KYIV.id]]);
  });
});

describe('V2: without orders.view', () => {
  it('no section and nothing asked', async () => {
    const asked = handlers({rights: other});
    mount('/');
    await screen.findByRole('link', {name: 'География'});
    expect(screen.queryByRole('link', {name: 'Карта машин'})).toBeNull();
    expect(asked).toHaveLength(0);
  });
});

describe('V3: filters reach the admin path', () => {
  it('status, and box when the view filter is on', async () => {
    const asked = handlers();
    mount();
    const user = userEvent.setup();
    await screen.findByRole('region', {name: 'Машины на карте'});
    await user.click(screen.getByRole('checkbox', {name: 'свободен'}));
    await waitFor(() => expect(asked.at(-1)!.status).toEqual(['FREE']));
    await user.click(screen.getByLabelText('Только видимая часть карты'));
    await waitFor(() => expect(asked.at(-1)!.box).not.toBeNull());
    expect(asked.every(a => a.path === 'admin')).toBe(true);
  });
});

describe('V4: refused', () => {
  it('a 403 shows the failure, not an empty board', async () => {
    handlers({live: () => HttpResponse.json(problem(403, 'ACCESS_DENIED'), {status: 403})});
    mount();
    expect(await screen.findByRole('alert')).toBeTruthy();
    expect(screen.queryByText('Нет машин на линии.')).toBeNull();
  });
});
