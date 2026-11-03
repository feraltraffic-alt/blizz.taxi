import {afterAll, afterEach, beforeAll, describe, expect, it, vi} from 'vitest';
import {render, screen, waitFor} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {MemoryRouter} from 'react-router-dom';
import {http, HttpResponse, delay} from 'msw';
import {setupServer} from 'msw/node';
import {createApiClient} from '@blizz/api-client';
import {AdminApp} from '../src/App.js';
import {browserRefreshTokens} from '../src/storage.js';
import {cid, me, problem, session} from '../../../../test/fixtures.js';

/** City operations (#359): C1–C7 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const admin = {...me, effective_permissions: ['geo.manage']};
const WAW = '5a000000-0000-4000-8000-000000000002';
const city = {id: WAW, code: 'waw', name: 'Варшава', currency: 'PLN', timezone: 'Europe/Warsaw', priority: 0,
  state: 'PUBLISHED', version: 1, polygon: {type: 'Polygon', coordinates: []}};
type Ops = {city_id: string; working_hours: {days_of_week: number[]; from: string; to: string}[];
  payment_methods: string[]; return_zone_meters: number; dropoff_outside_city: {allowed: boolean;
    max_distance_km: number | null}; orders_paused: boolean; pause_reason: string | null; paused_at: string | null;
  version: number};
const ops = (over: Partial<Ops> = {}): Ops => ({city_id: WAW, working_hours: [], payment_methods: ['CASH', 'CARD'],
  return_zone_meters: 500, dropoff_outside_city: {allowed: true, max_distance_km: null}, orders_paused: false,
  pause_reason: null, paused_at: null, version: 4, ...over});

function handlers(opts: {current?: () => Ops; change?: (body: Record<string, unknown>) => Response | Promise<Response>;
  act?: (action: string, body: Record<string, unknown>) => Response | Promise<Response>} = {}) {
  const changes: Record<string, unknown>[] = [];
  const acts: {action: string; body: Record<string, unknown>}[] = [];
  let reads = 0;
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(admin as never)),
    http.get(origin + '/api/admin/v1/cities', () => HttpResponse.json({cities: [city]} as never)),
    http.get(origin + '/api/admin/v1/cities/' + WAW + '/operations', () => {
      reads++;
      return HttpResponse.json((opts.current ? opts.current() : ops()) as never);
    }),
    http.post(origin + '/api/admin/v1/cities/' + WAW + '/operations', async ({request}) => {
      const body = await request.json() as Record<string, unknown>;
      changes.push(body);
      return opts.change ? opts.change(body) : HttpResponse.json(ops({...body as Partial<Ops>, version: 5}) as never);
    }),
    http.post(origin + '/api/admin/v1/cities/' + WAW + '/operations/:action', async ({request, params}) => {
      const body = await request.json() as Record<string, unknown>;
      const action = String(params.action);
      acts.push({action, body});
      return opts.act ? opts.act(action, body) : HttpResponse.json(ops({orders_paused: action === 'pause',
        pause_reason: action === 'pause' ? String(body.reason) : null, version: 5}) as never);
    }));
  return {changes, acts, reads: () => reads};
}

function mount(path: string) {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={[path]}><AdminApp client={api} /></MemoryRouter>);
}

async function open() {
  mount('/geo/' + WAW);
  const user = userEvent.setup();
  await screen.findByText('Часы работы: круглосуточно');
  return user;
}

describe('C1: the list', () => {
  it('each city with its currency, time zone and state, linked to its page', async () => {
    handlers();
    mount('/geo');
    const link = await screen.findByRole('link', {name: 'Варшава · PLN · Europe/Warsaw · опубликован'});
    expect(link).toHaveAttribute('href', '/geo/' + WAW);
  });
});

describe('C2: reading a city', () => {
  it('around the clock, the methods, the return zone, no limit, not paused', async () => {
    handlers();
    await open();
    expect(screen.getByText('Способы оплаты: наличные, карта')).toBeVisible();
    expect(screen.getByText('Зона возврата: 500 м')).toBeVisible();
    expect(screen.getByText('Высадка за городом: без ограничения')).toBeVisible();
    expect(screen.getByText('Новые заказы принимаются.')).toBeVisible();
  });

  it('intervals, a limit and a pause with its reason', async () => {
    handlers({current: () => ops({working_hours: [{days_of_week: [1, 2, 3, 4, 5], from: '08:00', to: '22:00'},
      {days_of_week: [6, 7], from: '22:00', to: '06:00'}], dropoff_outside_city: {allowed: true, max_distance_km: 50},
    orders_paused: true, pause_reason: 'Метель'})});
    mount('/geo/' + WAW);
    expect(await screen.findByText('Пн, Вт, Ср, Чт, Пт 08:00–22:00')).toBeVisible();
    expect(screen.getByText('Сб, Вс 22:00–06:00')).toBeVisible();
    expect(screen.getByText('Высадка за городом: до 50 км')).toBeVisible();
    expect(screen.getByText('Новые заказы приостановлены: Метель')).toBeVisible();
  });

  it('drop-off forbidden', async () => {
    handlers({current: () => ops({dropoff_outside_city: {allowed: false, max_distance_km: null}})});
    mount('/geo/' + WAW);
    expect(await screen.findByText('Высадка за городом: запрещена')).toBeVisible();
  });
});

describe('C3: changing', () => {
  it('one command with the hours, the methods, the zone, the drop-off, the version and the reason', async () => {
    const {changes} = handlers();
    const user = await open();
    await user.click(screen.getByRole('button', {name: 'Добавить интервал'}));
    for (const day of ['Пн', 'Вт', 'Ср']) await user.click(screen.getByRole('checkbox', {name: day + ', интервал 1'}));
    await user.type(screen.getByLabelText('С, интервал 1'), '22:00');
    await user.type(screen.getByLabelText('До, интервал 1'), '06:00');
    await user.click(screen.getByRole('checkbox', {name: 'Терминал'}));
    await user.clear(screen.getByLabelText('Зона возврата, м'));
    await user.type(screen.getByLabelText('Зона возврата, м'), '1000');
    await user.selectOptions(screen.getByLabelText('Высадка за городом'), 'LIMIT');
    await user.type(screen.getByLabelText('Предел, км'), '40');
    await user.type(screen.getByLabelText('Причина изменения'), 'Ночной режим');
    await user.click(screen.getByRole('button', {name: 'Сохранить'}));
    expect(await screen.findByText('Пн, Вт, Ср 22:00–06:00')).toBeVisible();
    expect(changes).toEqual([{command_id: expect.any(String), expected_version: 4,
      working_hours: [{days_of_week: [1, 2, 3], from: '22:00', to: '06:00'}], payment_methods: ['CASH', 'CARD', 'TERMINAL'],
      return_zone_meters: 1000, dropoff_outside_city: {allowed: true, max_distance_km: 40}, reason: 'Ночной режим'}]);
    expect(screen.getByText('Высадка за городом: до 40 км')).toBeVisible();
  });

  it('removing the only interval sends around the clock; forbidding the drop-off sends no limit', async () => {
    const {changes} = handlers({current: () => ops({working_hours: [{days_of_week: [1], from: '08:00', to: '20:00'}]})});
    mount('/geo/' + WAW);
    const user = userEvent.setup();
    await screen.findByText('Пн 08:00–20:00');
    await user.click(screen.getByRole('button', {name: 'Убрать интервал 1'}));
    await user.selectOptions(screen.getByLabelText('Высадка за городом'), 'FORBIDDEN');
    await user.type(screen.getByLabelText('Причина изменения'), 'Круглосуточно');
    await user.click(screen.getByRole('button', {name: 'Сохранить'}));
    await waitFor(() => expect(changes).toHaveLength(1));
    expect(changes[0]).toMatchObject({working_hours: [], dropoff_outside_city: {allowed: false, max_distance_km: null}});
  });
});

describe('C4: refused on the screen', () => {
  async function interval(user: ReturnType<typeof userEvent.setup>, n: number, from = '08:00', to = '20:00',
    days = ['Пн']) {
    await user.click(screen.getByRole('button', {name: 'Добавить интервал'}));
    for (const day of days) await user.click(screen.getByRole('checkbox', {name: day + ', интервал ' + n}));
    if (from) await user.type(screen.getByLabelText('С, интервал ' + n), from);
    if (to) await user.type(screen.getByLabelText('До, интервал ' + n), to);
  }

  it.each([
    ['no payment method', async (user: ReturnType<typeof userEvent.setup>) => {
      await user.click(screen.getByRole('checkbox', {name: 'Наличные'}));
      await user.click(screen.getByRole('checkbox', {name: 'Карта'}));
    }],
    ['an interval with no days', async (user: ReturnType<typeof userEvent.setup>) => interval(user, 1, '08:00', '20:00', [])],
    ['24:00', async (user: ReturnType<typeof userEvent.setup>) => interval(user, 1, '08:00', '24:00')],
    ['7:00', async (user: ReturnType<typeof userEvent.setup>) => interval(user, 1, '7:00', '20:00')],
    ['a return zone over 50000', async (user: ReturnType<typeof userEvent.setup>) => {
      await user.clear(screen.getByLabelText('Зона возврата, м'));
      await user.type(screen.getByLabelText('Зона возврата, м'), '50001');
    }],
    ['a negative return zone', async (user: ReturnType<typeof userEvent.setup>) => {
      await user.clear(screen.getByLabelText('Зона возврата, м'));
      await user.type(screen.getByLabelText('Зона возврата, м'), '-1');
    }],
    ['a limit of 0 km', async (user: ReturnType<typeof userEvent.setup>) => {
      await user.selectOptions(screen.getByLabelText('Высадка за городом'), 'LIMIT');
      await user.type(screen.getByLabelText('Предел, км'), '0');
    }],
    ['a limit over 1000 km', async (user: ReturnType<typeof userEvent.setup>) => {
      await user.selectOptions(screen.getByLabelText('Высадка за городом'), 'LIMIT');
      await user.type(screen.getByLabelText('Предел, км'), '1001');
    }]
  ])('C4: %s sends nothing', async (_name, spoil) => {
    const {changes} = handlers();
    const user = await open();
    await spoil(user);
    await user.type(screen.getByLabelText('Причина изменения'), 'r');
    await user.click(screen.getByRole('button', {name: 'Сохранить'}));
    expect(await screen.findByText(/^Нужны способ оплаты/)).toBeVisible();
    expect(changes).toEqual([]);
  });

  it('C4: no reason sends nothing', async () => {
    const {changes} = handlers();
    const user = await open();
    await user.click(screen.getByRole('button', {name: 'Сохранить'}));
    expect(await screen.findByText(/^Нужны способ оплаты/)).toBeVisible();
    expect(changes).toEqual([]);
  });

  it('C4: more than 14 intervals cannot be added', async () => {
    handlers();
    const user = await open();
    for (let n = 1; n <= 14; n++) await user.click(screen.getByRole('button', {name: 'Добавить интервал'}));
    expect(screen.getByRole('button', {name: 'Добавить интервал'})).toBeDisabled();
    expect(screen.getByLabelText('С, интервал 14')).toBeVisible();
  });
});

describe('C5: pause and resume', () => {
  it('pause with the reason and the version; then only resume is offered', async () => {
    const {acts} = handlers();
    const user = await open();
    expect(screen.queryByRole('button', {name: 'Возобновить новые заказы'})).toBeNull();
    await user.type(screen.getByLabelText('Причина паузы или возобновления'), 'Метель');
    await user.click(screen.getByRole('button', {name: 'Приостановить новые заказы'}));
    expect(await screen.findByText('Новые заказы приостановлены: Метель')).toBeVisible();
    expect(acts).toEqual([{action: 'pause', body: {command_id: expect.any(String), expected_version: 4,
      reason: 'Метель'}}]);
    expect(screen.getByRole('button', {name: 'Возобновить новые заказы'})).toBeVisible();
    expect(screen.queryByRole('button', {name: 'Приостановить новые заказы'})).toBeNull();
  });

  it('resume from a pause', async () => {
    const {acts} = handlers({current: () => ops({orders_paused: true, pause_reason: 'Метель'})});
    mount('/geo/' + WAW);
    const user = userEvent.setup();
    await screen.findByText('Новые заказы приостановлены: Метель');
    await user.type(screen.getByLabelText('Причина паузы или возобновления'), 'Расчистили');
    await user.click(screen.getByRole('button', {name: 'Возобновить новые заказы'}));
    expect(await screen.findByText('Новые заказы принимаются.')).toBeVisible();
    expect(acts.map(a => a.action)).toEqual(['resume']);
  });

  it('without a reason nothing is sent', async () => {
    const {acts} = handlers();
    const user = await open();
    await user.click(screen.getByRole('button', {name: 'Приостановить новые заказы'}));
    expect(await screen.findByText('Нужна причина.')).toBeVisible();
    expect(acts).toEqual([]);
  });
});

describe('C6: a conflict', () => {
  it('is told, re-read, and the next change uses the new version', async () => {
    let version = 4;
    let first = true;
    const {changes, reads} = handlers({current: () => ops({version}), change: body => {
      if (first) {
        first = false;
        version = 7;
        return HttpResponse.json(problem(409, 'VERSION_CONFLICT'), {status: 409});
      }
      return HttpResponse.json(ops({...body as Partial<Ops>, version: 8}) as never);
    }});
    const user = await open();
    await user.type(screen.getByLabelText('Причина изменения'), 'r');
    await user.click(screen.getByRole('button', {name: 'Сохранить'}));
    expect(await screen.findByText('Город изменил кто-то другой; показано текущее состояние.')).toBeVisible();
    await waitFor(() => expect(reads()).toBe(2));
    await user.type(screen.getByLabelText('Причина изменения'), 'r');
    await user.click(screen.getByRole('button', {name: 'Сохранить'}));
    await waitFor(() => expect(changes).toHaveLength(2));
    expect(changes.map(c => c.expected_version)).toEqual([4, 7]);
  });
});

describe('C7: one at a time', () => {
  it('a double click sends one change', async () => {
    const {changes} = handlers({change: async body => {
      await delay(100);
      return HttpResponse.json(ops({...body as Partial<Ops>, version: 5}) as never);
    }});
    const user = await open();
    await user.type(screen.getByLabelText('Причина изменения'), 'r');
    await user.dblClick(screen.getByRole('button', {name: 'Сохранить'}));
    expect(await screen.findByText('Сохранено.')).toBeVisible();
    expect(changes).toHaveLength(1);
  });
});
