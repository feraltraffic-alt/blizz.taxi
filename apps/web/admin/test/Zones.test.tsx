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

/** A city's zones drawn on the map; publish and archive (#468): Z1–Z5 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const CITY = '5a000000-0000-4000-8000-000000000009';
const ZONE = '2e000000-0000-4000-8000-000000000001';
const city = (state = 'PUBLISHED') => ({id: CITY, code: 'lviv', name: 'Львів', currency: 'UAH',
  timezone: 'Europe/Kyiv', priority: 2, state, version: 40, polygon: {type: 'Polygon', coordinates: [[[30.4, 50.4],
    [30.6, 50.4], [30.6, 50.5], [30.4, 50.4]]]}});
const zone = (over: Record<string, unknown> = {}) => ({id: ZONE, city_id: CITY, type: 'AIRPORT', priority: 5,
  state: 'DRAFT', version: 7, polygon: {type: 'Polygon', coordinates: [[[30.45, 50.42], [30.5, 50.42], [30.5, 50.45],
    [30.45, 50.42]]]}, ...over});
const operations = {working_hours: [], payment_methods: ['CASH'], return_zone_meters: 0,
  dropoff_outside_city: {allowed: true, max_distance_km: null}, orders_paused: false, pause_reason: null, version: 1};

type Sent = {path: string; body: Record<string, unknown>};

function handlers(opts: {cityState?: string; zones?: () => unknown[]; create?: () => Response;
  change?: () => Response} = {}) {
  const sent: Sent[] = [];
  let zoneReads = 0;
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json({...me, effective_permissions: ['geo.manage']} as never)),
    http.get(origin + '/api/admin/v1/cities', () => HttpResponse.json({cities: [city(opts.cityState)]} as never)),
    http.get(origin + '/api/admin/v1/cities/' + CITY + '/operations', () => HttpResponse.json(operations as never)),
    http.get(origin + '/api/admin/v1/cities/' + CITY + '/zones', () => {
      zoneReads++;
      return HttpResponse.json({zones: opts.zones ? opts.zones() : [zone()]} as never);
    }),
    http.post(origin + '/api/admin/v1/cities/' + CITY + '/zones', async ({request}) => {
      sent.push({path: 'create', body: await request.json() as Record<string, unknown>});
      return opts.create ? opts.create() : HttpResponse.json({id: 'z9', state: 'DRAFT', version: 0} as never,
        {status: 201});
    }),
    http.post(origin + '/api/admin/v1/zones/:id/:action', async ({request, params}) => {
      sent.push({path: String(params.action) + '/' + String(params.id), body: await request.json() as
        Record<string, unknown>});
      return opts.change ? opts.change() : HttpResponse.json({id: ZONE, state: params.action === 'publish'
        ? 'PUBLISHED' : 'ARCHIVED', version: 8} as never);
    }));
  return {sent, zoneReads: () => zoneReads};
}

function mount() {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={['/geo/' + CITY]}><AdminApp client={api} /></MemoryRouter>);
}

type User = ReturnType<typeof userEvent.setup>;

async function newZone(user: User, form: {type?: string; priority?: string; reason?: string; points?: string[]}) {
  await user.click(await screen.findByRole('button', {name: 'Новая зона'}));
  const box = screen.getByRole('group', {name: 'Новая зона (черновик)'});
  if (form.type) await user.type(within(box).getByLabelText('Тип зоны'), form.type);
  if (form.priority !== undefined) {
    await user.clear(within(box).getByLabelText('Приоритет зоны'));
    if (form.priority) await user.type(within(box).getByLabelText('Приоритет зоны'), form.priority);
  }
  for (const p of form.points ?? []) {
    await user.type(within(box).getByLabelText('Точка: широта, долгота'), p);
    await user.click(within(box).getByRole('button', {name: 'Добавить точку'}));
  }
  if (form.reason) await user.type(within(box).getByLabelText('Причина (новая зона)'), form.reason);
  await user.click(within(box).getByRole('button', {name: 'Создать черновик зоны'}));
}

const THREE = ['50.42, 30.45', '50.42, 30.5', '50.45, 30.5'];

describe('Z1: create', () => {
  it('sends the contract body, the type uppercased, and reads the zones again', async () => {
    const h = handlers();
    const user = userEvent.setup();
    mount();
    await newZone(user, {type: 'airport', priority: '5', reason: 'Аэропорт', points: THREE});
    await waitFor(() => expect(h.sent).toHaveLength(1));
    expect(h.sent[0]).toEqual({path: 'create', body: {command_id: expect.any(String), type: 'AIRPORT', priority: 5,
      reason: 'Аэропорт', polygon: {type: 'Polygon', coordinates: [[[30.45, 50.42], [30.5, 50.42], [30.5, 50.45],
        [30.45, 50.42]]]}}});
    await waitFor(() => expect(h.zoneReads()).toBe(2));
    expect(await screen.findByText('Черновик зоны создан.')).toBeTruthy();
  });
});

describe('Z2: refused before sending', () => {
  it.each([
    ['a type with a space', {type: 'NEW ZONE', priority: '1', reason: 'R', points: THREE}],
    ['a type of one letter', {type: 'A', priority: '1', reason: 'R', points: THREE}],
    ['a priority that is not an integer', {type: 'AIRPORT', priority: 'x', reason: 'R', points: THREE}],
    ['two points', {type: 'AIRPORT', priority: '1', reason: 'R', points: THREE.slice(0, 2)}],
    ['no reason', {type: 'AIRPORT', priority: '1', points: THREE}]
  ])('%s', async (_name, form) => {
    const h = handlers();
    const user = userEvent.setup();
    mount();
    await newZone(user, form);
    expect(await screen.findByText('Нужны тип (латинские заглавные, цифры, _; 2–40), целый приоритет, причина и не '
      + 'меньше трёх точек границы.')).toBeTruthy();
    expect(h.sent).toHaveLength(0);
  });
});

describe('Z3: refused by the server', () => {
  it('a 400 says the boundary or data is not valid', async () => {
    handlers({create: () => HttpResponse.json(problem(400, 'VALIDATION_FAILED'), {status: 400})});
    const user = userEvent.setup();
    mount();
    await newZone(user, {type: 'AIRPORT', priority: '5', reason: 'Аэропорт', points: THREE});
    expect(await screen.findByText('Сервер не принял границу зоны или данные.')).toBeTruthy();
  });
});

describe('Z4: publish and archive', () => {
  it.each([['DRAFT', 'Опубликовать зону', 'publish', 'опубликована'],
    ['PUBLISHED', 'Архивировать зону', 'archive', 'в архиве']])(
    '%s: sends the zone\'s own version and the reason; the row changes', async (state, button, action, word) => {
      const h = handlers({zones: () => [zone({state})]});
      const user = userEvent.setup();
      mount();
      const row = (await screen.findByText(/^AIRPORT · /)).closest('li') as HTMLElement;
      await user.type(within(row).getByLabelText('Причина (зона AIRPORT)'), 'Готова');
      await user.click(within(row).getByRole('button', {name: button}));
      await waitFor(() => expect(h.sent).toHaveLength(1));
      expect(h.sent[0]).toEqual({path: action + '/' + ZONE, body: {command_id: expect.any(String),
        expected_version: 7, reason: 'Готова'}});
      expect(await screen.findByText('AIRPORT · ' + word + ' · приоритет 5')).toBeTruthy();
    });

  it('a 409 reads the zones again', async () => {
    const h = handlers({change: () => HttpResponse.json(problem(409, 'VERSION_CONFLICT'), {status: 409})});
    const user = userEvent.setup();
    mount();
    const row = (await screen.findByText(/^AIRPORT · /)).closest('li') as HTMLElement;
    await user.type(within(row).getByLabelText('Причина (зона AIRPORT)'), 'Готова');
    await user.click(within(row).getByRole('button', {name: 'Опубликовать зону'}));
    expect(await screen.findByText('Зона изменилась; список обновлён.')).toBeTruthy();
    await waitFor(() => expect(h.zoneReads()).toBe(2));
  });

  it('an archived zone offers neither', async () => {
    handlers({zones: () => [zone({state: 'ARCHIVED'})]});
    mount();
    const row = (await screen.findByText(/^AIRPORT · /)).closest('li') as HTMLElement;
    expect(within(row).queryByRole('button')).toBeNull();
  });
});

describe('Z5: only with a published or draft city', () => {
  it('an archived city offers no new zone', async () => {
    handlers({cityState: 'ARCHIVED'});
    mount();
    await screen.findByText('Состояние: в архиве');
    expect(screen.queryByRole('button', {name: 'Новая зона'})).toBeNull();
  });
});
