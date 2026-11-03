import {afterAll, afterEach, beforeAll, describe, expect, it, vi} from 'vitest';
import {render, screen, waitFor} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {MemoryRouter} from 'react-router-dom';
import {http, HttpResponse} from 'msw';
import {setupServer} from 'msw/node';
import {createApiClient} from '@blizz/api-client';
import {AdminApp} from '../src/App.js';
import {browserRefreshTokens} from '../src/storage.js';
import {parsePoint, polygonOf} from '../src/BoundaryEditor.js';
import {cid, me, problem, session} from '../../../../test/fixtures.js';

/** Create a city with its boundary drawn on the map; edit, publish and archive (#467): C1–C6 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const CITY = '5a000000-0000-4000-8000-000000000009';
const ring = [[30.4, 50.4], [30.6, 50.4], [30.6, 50.5], [30.4, 50.4]];
const city = (over: Record<string, unknown> = {}) => ({id: CITY, code: 'lviv', name: 'Львів', currency: 'UAH',
  timezone: 'Europe/Kyiv', priority: 2, state: 'DRAFT', version: 4, polygon: {type: 'Polygon', coordinates: [ring]},
  ...over});
const operations = {working_hours: [], payment_methods: ['CASH'], return_zone_meters: 0,
  dropoff_outside_city: {allowed: true, max_distance_km: null}, orders_paused: false, pause_reason: null, version: 1};

type Sent = {path: string; body: Record<string, unknown>};

function handlers(opts: {current?: () => unknown; create?: () => Response; update?: () => Response;
  change?: (action: string) => Response} = {}) {
  const sent: Sent[] = [];
  let reads = 0;
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json({...me, effective_permissions: ['geo.manage']} as never)),
    http.get(origin + '/api/admin/v1/cities', () => {
      reads++;
      return HttpResponse.json({cities: [opts.current ? opts.current() : city()]} as never);
    }),
    http.get(origin + '/api/admin/v1/cities/' + CITY + '/operations', () => HttpResponse.json(operations as never)),
    http.get(origin + '/api/admin/v1/cities/' + CITY + '/zones', () => HttpResponse.json({zones: []} as never)),
    http.post(origin + '/api/admin/v1/cities/:id/:action', async ({request, params}) => {
      const body = await request.json() as Record<string, unknown>;
      sent.push({path: String(params.action), body});
      if (params.action === 'update') return opts.update ? opts.update()
        : HttpResponse.json({id: CITY, state: 'DRAFT', version: 5} as never);
      return opts.change ? opts.change(String(params.action)) : HttpResponse.json({id: CITY,
        state: params.action === 'publish' ? 'PUBLISHED' : 'ARCHIVED', version: 5} as never);
    }),
    http.post(origin + '/api/admin/v1/cities', async ({request}) => {
      sent.push({path: 'create', body: await request.json() as Record<string, unknown>});
      return opts.create ? opts.create() : HttpResponse.json({id: 'new-city', state: 'DRAFT', version: 0} as never,
        {status: 201});
    }));
  return {sent, reads: () => reads};
}

function mount(path: string) {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={[path]}><AdminApp client={api} /></MemoryRouter>);
}

type User = ReturnType<typeof userEvent.setup>;

async function points(user: User, list: string[]) {
  for (const p of list) {
    const input = screen.getByLabelText('Точка: широта, долгота');
    await user.clear(input);
    await user.type(input, p);
    await user.click(screen.getByRole('button', {name: 'Добавить точку'}));
  }
}

async function fill(user: User, form: Record<string, string>) {
  for (const [label, value] of Object.entries(form)) {
    const input = screen.getByLabelText(label);
    await user.clear(input);
    if (value) await user.type(input, value);
  }
}

const FORM = {'Код города': 'lviv', 'Название города': 'Львів', 'Валюта': 'uah', 'Часовой пояс': 'Europe/Kyiv',
  'Приоритет города': '2', 'Причина (черновик города)': 'Новый город'};
const THREE = ['50.4, 30.4', '50.4, 30.6', '50,5; 30,6'];

describe('C1: drawing', () => {
  it('polygonOf closes the ring and swaps to [lon, lat]', () => {
    expect(polygonOf([[50.4, 30.4], [50.4, 30.6], [50.5, 30.6]])).toEqual({type: 'Polygon',
      coordinates: [[[30.4, 50.4], [30.6, 50.4], [30.6, 50.5], [30.4, 50.4]]]});
  });

  it.each([[[]], [[[1, 2]]], [[[1, 2], [3, 4]]], [[[1, 2], [1, 2], [3, 4]]]])('fewer than 3 distinct points: null %#',
    pts => {
      expect(polygonOf(pts as [number, number][])).toBeNull();
    });

  it.each([['50.45, 30.52', [50.45, 30.52]], ['50,45; 30,52', [50.45, 30.52]], [' -33.9 , 151.2 ', [-33.9, 151.2]]])(
    'the point field takes %s', (text, value) => {
      expect(parsePoint(text)).toEqual(value);
    });

  it.each(['91, 30', '50, 181', 'Київ', '50.4', '', '50.4, 30.5, 1'])('refuses %j', text => {
    expect(parsePoint(text)).toBeNull();
  });

  it('removing the last point and clearing', async () => {
    handlers();
    const user = userEvent.setup();
    mount('/geo');
    await user.click(await screen.findByRole('button', {name: 'Новый город'}));
    await points(user, THREE);
    expect(screen.getByText('Точек: 3')).toBeTruthy();
    await user.click(screen.getByRole('button', {name: 'Убрать последнюю точку'}));
    expect(screen.getByText('Точек: 2')).toBeTruthy();
    await user.click(screen.getByRole('button', {name: 'Очистить'}));
    expect(screen.getByText('Точек: 0')).toBeTruthy();
  });
});

describe('C2: create', () => {
  it('sends the contract body and the draft appears in the list', async () => {
    const h = handlers();
    const user = userEvent.setup();
    mount('/geo');
    await user.click(await screen.findByRole('button', {name: 'Новый город'}));
    await fill(user, FORM);
    await points(user, THREE);
    await user.click(screen.getByRole('button', {name: 'Создать черновик города'}));
    await waitFor(() => expect(h.sent).toHaveLength(1));
    expect(h.sent[0]).toEqual({path: 'create', body: {command_id: expect.any(String), code: 'lviv', name: 'Львів',
      currency: 'UAH', timezone: 'Europe/Kyiv', priority: 2, reason: 'Новый город', polygon: {type: 'Polygon',
        coordinates: [[[30.4, 50.4], [30.6, 50.4], [30.6, 50.5], [30.4, 50.4]]]}}});
    await waitFor(() => expect(h.reads()).toBe(2));
    expect(await screen.findByText('Черновик города создан.')).toBeTruthy();
  });
});

describe('C3: create refused before sending', () => {
  it.each([
    ['two points', {}, THREE.slice(0, 2)],
    ['a code with a capital', {'Код города': 'Lviv'}, THREE],
    ['a currency of two letters', {'Валюта': 'UA'}, THREE],
    ['an unknown time zone', {'Часовой пояс': 'Europe/Atlantis'}, THREE],
    ['a priority that is not an integer', {'Приоритет города': '1.5'}, THREE],
    ['no name', {'Название города': ''}, THREE],
    ['no reason', {'Причина (черновик города)': ''}, THREE]
  ])('%s', async (_name, change, pts) => {
    const h = handlers();
    const user = userEvent.setup();
    mount('/geo');
    await user.click(await screen.findByRole('button', {name: 'Новый город'}));
    await fill(user, {...FORM, ...change});
    await points(user, pts);
    await user.click(screen.getByRole('button', {name: 'Создать черновик города'}));
    expect(await screen.findByText('Нужны код (a–z, 0–9, дефис; 2–40), название, валюта из трёх букв, часовой '
      + 'пояс вида Europe/Kyiv, целый приоритет, причина и не меньше трёх точек границы.')).toBeTruthy();
    expect(h.sent).toHaveLength(0);
  });
});

describe('C4: refused by the server', () => {
  it.each([[400, 'VALIDATION_FAILED', 'Сервер не принял границу или данные: граница не должна пересекать себя.'],
    [409, 'STATE_CONFLICT', 'Такой код города уже есть.']])('%s says why', async (status, code, text) => {
    handlers({create: () => HttpResponse.json(problem(status, code), {status})});
    const user = userEvent.setup();
    mount('/geo');
    await user.click(await screen.findByRole('button', {name: 'Новый город'}));
    await fill(user, FORM);
    await points(user, THREE);
    await user.click(screen.getByRole('button', {name: 'Создать черновик города'}));
    expect(await screen.findByText(text)).toBeTruthy();
  });
});

describe('C5: a draft', () => {
  it('starts from its values and boundary, and sends UpdateCity with the version', async () => {
    const h = handlers();
    const user = userEvent.setup();
    mount('/geo/' + CITY);
    await user.click(await screen.findByRole('button', {name: 'Изменить черновик'}));
    expect(screen.getByText('Точек: 3')).toBeTruthy();
    expect((screen.getByLabelText('Название города') as HTMLInputElement).value).toBe('Львів');
    await fill(user, {'Название города': 'Львів-центр', 'Причина (черновик города)': 'Уточнили границу'});
    await points(user, ['50.45, 30.45']);
    await user.click(screen.getByRole('button', {name: 'Сохранить черновик'}));
    await waitFor(() => expect(h.sent).toHaveLength(1));
    expect(h.sent[0]).toEqual({path: 'update', body: {command_id: expect.any(String), expected_version: 4,
      name: 'Львів-центр', currency: 'UAH', timezone: 'Europe/Kyiv', priority: 2, reason: 'Уточнили границу',
      polygon: {type: 'Polygon', coordinates: [[[30.4, 50.4], [30.6, 50.4], [30.6, 50.5], [30.45, 50.45],
        [30.4, 50.4]]]}}});
    expect(await screen.findByText('Черновик сохранён.')).toBeTruthy();
  });

  it('a 409 reads the city again', async () => {
    const h = handlers({update: () => HttpResponse.json(problem(409, 'VERSION_CONFLICT'), {status: 409})});
    const user = userEvent.setup();
    mount('/geo/' + CITY);
    await user.click(await screen.findByRole('button', {name: 'Изменить черновик'}));
    await fill(user, {'Причина (черновик города)': 'Правка'});
    await user.click(screen.getByRole('button', {name: 'Сохранить черновик'}));
    expect(await screen.findByText('Город изменился; данные обновлены.')).toBeTruthy();
    await waitFor(() => expect(h.reads()).toBeGreaterThanOrEqual(2));
  });

  it('a published city offers no draft editing', async () => {
    handlers({current: () => city({state: 'PUBLISHED'})});
    mount('/geo/' + CITY);
    await screen.findByRole('button', {name: 'В архив'});
    expect(screen.queryByRole('button', {name: 'Изменить черновик'})).toBeNull();
  });
});

describe('C6: publish and archive', () => {
  it.each([['DRAFT', 'Опубликовать', 'publish', 'опубликован'], ['PUBLISHED', 'В архив', 'archive', 'в архиве']])(
    '%s: %s sends the version and the reason, and the state changes', async (state, button, action, word) => {
      const h = handlers({current: () => city({state})});
      const user = userEvent.setup();
      mount('/geo/' + CITY);
      await user.type(await screen.findByLabelText('Причина (состояние города)'), 'Готов к работе');
      await user.click(screen.getByRole('button', {name: button}));
      await waitFor(() => expect(h.sent).toHaveLength(1));
      expect(h.sent[0]).toEqual({path: action, body: {command_id: expect.any(String), expected_version: 4,
        reason: 'Готов к работе'}});
      expect(await screen.findByText('Состояние: ' + word)).toBeTruthy();
    });

  it('no reason sends nothing', async () => {
    const h = handlers();
    const user = userEvent.setup();
    mount('/geo/' + CITY);
    await user.click(await screen.findByRole('button', {name: 'Опубликовать'}));
    expect(await screen.findByText('Нужна причина.')).toBeTruthy();
    expect(h.sent).toHaveLength(0);
  });

  it('an archived city offers neither', async () => {
    handlers({current: () => city({state: 'ARCHIVED'})});
    mount('/geo/' + CITY);
    expect(await screen.findByText('Состояние: в архиве')).toBeTruthy();
    expect(screen.queryByRole('button', {name: 'Опубликовать'})).toBeNull();
    expect(screen.queryByRole('button', {name: 'В архив'})).toBeNull();
  });
});
