import {afterAll, afterEach, beforeAll, describe, expect, it, vi} from 'vitest';
import {render, screen, waitFor} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {http, HttpResponse, delay} from 'msw';
import {setupServer} from 'msw/node';
import {createApiClient} from '@blizz/api-client';
import {browserRefreshTokens} from '@blizz/web-ui';
import {OperatorApp} from '../src/App.js';
import {cid, me, problem, session} from '../../../../test/fixtures.js';

/** The calls panel (#300): K1–K6 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear();});
afterAll(() => server.close());

const KYIV = {id: '5a000000-0000-4000-8000-000000000001', code: 'kyiv', name: 'Київ', currency: 'UAH',
  timezone: 'Europe/Kyiv', working_hours: [], payment_methods: ['CASH'], orders_paused: false,
  center: {lat: 50.45, lon: 30.52}};
const ME = me.member.id;
const all = ['orders.create', 'orders.view', 'calls.answer', 'calls.listen'];
const CALL = 'ca000000-0000-4000-8000-000000000001';
const call = (over: Record<string, unknown> = {}) => ({id: CALL, direction: 'INBOUND', party: null, state: 'RINGING',
  caller_phone: '+380671234567', called_number: '+380441234567', city_id: KYIV.id, answered_by: null, order_ids: [],
  started_at: '2026-11-02T10:00:00Z', answered_at: null, ended_at: null, recording: null, ...over});
const local = (iso: string) => {
  const d = new Date(iso);
  return String(d.getHours()).padStart(2, '0') + ':' + String(d.getMinutes()).padStart(2, '0');
};
const quote = {id: '80000000-0000-4000-8000-000000000001', vehicle_class: 'STANDARD', city_id: KYIV.id,
  amount_minor: 15000, currency: 'UAH', distance_m: 5000, duration_s: 600, route_source: 'ROUTER'};

type Sent = {path: string; body: Record<string, unknown>};

function handlers(opts: {rights?: string[]; calls?: (q: URLSearchParams) => unknown[];
  answer?: () => Response | Promise<Response>; status?: () => Response | Promise<Response>;
  recording?: () => Response} = {}) {
  const sent: Sent[] = [];
  const asked = {calls: [] as URLSearchParams[], status: 0, recording: 0};
  const place = (label: string, lat: number) => ({source: 'OWN', label, street: label, house: '1',
    point: {lat, lon: 30.5}});
  server.use(
    http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [KYIV]})),
    http.get(origin + '/api/operator/v1/me', () =>
      HttpResponse.json({...me, effective_permissions: opts.rights ?? all} as never)),
    http.get(origin + '/api/operator/v1/vehicle-classes', () => HttpResponse.json([{code: 'STANDARD', name: 'Стандарт'}])),
    http.get(origin + '/api/operator/v1/places', ({request}) => {
      const q = new URL(request.url).searchParams.get('query');
      return HttpResponse.json({provider: 'BUILT_IN', places: [place(q === 'вокзал' ? 'Вокзал' : 'Майдан', 50.44)]});
    }),
    http.get(origin + '/api/operator/v1/customers/lookup', () => HttpResponse.json(problem(404, 'NOT_FOUND'),
      {status: 404})),
    http.get(origin + '/api/operator/v1/cancel-reasons', () => HttpResponse.json({reasons: []})),
    http.post(origin + '/api/operator/v1/quotes', () => HttpResponse.json(quote, {status: 201})),
    http.post(origin + '/api/operator/v1/orders', async ({request}) => {
      sent.push({path: 'orders', body: await request.json() as Record<string, unknown>});
      return HttpResponse.json({id: '90000000-0000-4000-8000-000000000001', short_number: 1042, status: 'SEARCHING',
        version: 1}, {status: 201});
    }),
    http.get(origin + '/api/operator/v1/me/call-status', () => {
      asked.status++;
      return HttpResponse.json({status: 'OFFLINE', changed_at: null, extension: '101'});
    }),
    http.post(origin + '/api/operator/v1/me/call-status', async ({request}) => {
      const body = await request.json() as Record<string, unknown>;
      sent.push({path: 'call-status', body});
      return opts.status ? opts.status()
        : HttpResponse.json({status: body.status, changed_at: '2026-11-02T10:00:00Z', extension: '101'});
    }),
    http.get(origin + '/api/operator/v1/calls', ({request}) => {
      const query = new URL(request.url).searchParams;
      asked.calls.push(query);
      return HttpResponse.json({calls: (opts.calls ?? (() => [call()]))(query),
        page: {next_cursor: null, has_more: false}} as never);
    }),
    http.get(origin + '/api/operator/v1/calls/' + CALL + '/recording', () => {
      asked.recording++;
      return opts.recording ? opts.recording() : new HttpResponse(new Uint8Array([82, 73, 70, 70, 0x80, 0xff]),
        {headers: {'Content-Type': 'audio/wav'}});
    }),
    http.post(origin + '/api/operator/v1/calls/' + CALL + '/answer', async ({request}) => {
      sent.push({path: 'answer', body: await request.json() as Record<string, unknown>});
      return opts.answer ? opts.answer()
        : HttpResponse.json(call({state: 'ANSWERED', answered_by: ME, answered_at: '2026-11-02T10:00:05Z'}) as never);
    }));
  return {sent, asked};
}

async function openCalls(pollMs = 60_000, user = userEvent.setup()) {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage, 'test'),
    correlationId: () => cid, initialSession: session});
  let id = 0;
  render(<OperatorApp client={api} pollMs={pollMs}
    newId={() => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')} />);
  await user.click(await screen.findByRole('button', {name: 'Звонки'}));
  return user;
}

describe('K1: my status', () => {
  it('shows the status and extension, and changes it with a command id', async () => {
    const {sent} = handlers();
    const user = await openCalls();
    expect(await screen.findByText('Мой статус: не на линии · внутренний номер 101')).toBeVisible();
    await user.click(screen.getByRole('button', {name: 'Доступен'}));
    expect(await screen.findByText('Мой статус: доступен · внутренний номер 101')).toBeVisible();
    expect(sent).toEqual([{path: 'call-status', body: {command_id: expect.any(String), status: 'AVAILABLE'}}]);
  });
});

describe('K2: the log', () => {
  it('rows with time, number, state; the hidden number; the ringing filter', async () => {
    const {asked} = handlers({calls: q => q.get('state') === 'RINGING' ? [call()] : [call(),
      call({id: 'c2', caller_phone: null, state: 'ENDED', answered_by: ME, order_ids: ['o1'],
        started_at: '2026-11-02T09:00:00Z'})]});
    const user = await openCalls();
    const list = await screen.findByRole('list', {name: 'Звонки'});
    await waitFor(() => expect([...list.querySelectorAll('li')].map(li => li.querySelector('span')?.textContent))
      .toEqual([local('2026-11-02T10:00:00Z') + ' · +380671234567 · звонит',
        local('2026-11-02T09:00:00Z') + ' · номер скрыт · завершён · заказов: 1']));
    await user.click(screen.getByRole('checkbox', {name: 'Только звонящие сейчас'}));
    await waitFor(() => expect(asked.calls.at(-1)!.get('state')).toBe('RINGING'));
    expect(asked.calls[0]!.has('state')).toBe(false);
  });

  it('is read again every pollMs', async () => {
    const {asked} = handlers();
    await openCalls(60);
    await waitFor(() => expect(asked.calls.length).toBeGreaterThanOrEqual(3));
  });
});

describe('K3: taking a call', () => {
  it('only a ringing call can be taken; the answer has a command id', async () => {
    const {sent} = handlers({calls: () => [call(), call({id: 'c2', state: 'ENDED', answered_by: 'someone'})]});
    const user = await openCalls();
    await screen.findByRole('list', {name: 'Звонки'});
    expect(await screen.findAllByRole('button', {name: 'Взять звонок'})).toHaveLength(1);
    await user.click(screen.getByRole('button', {name: 'Взять звонок'}));
    await waitFor(() => expect(sent).toEqual([{path: 'answer', body: {command_id: expect.any(String)}}]));
  });

  it('a 409 says it is gone and reads the log again', async () => {
    const {asked} = handlers({answer: () => HttpResponse.json(problem(409, 'STATE_CONFLICT'), {status: 409})});
    const user = await openCalls();
    await user.click(await screen.findByRole('button', {name: 'Взять звонок'}));
    expect(await screen.findByText('Звонок уже взял другой оператор, или он закончился.')).toBeVisible();
    await waitFor(() => expect(asked.calls.length).toBeGreaterThanOrEqual(2));
  });
});

describe('K4: an order from a call', () => {
  it('the form has the caller\'s number and the order carries the call', async () => {
    const {sent} = handlers({calls: () => [call({state: 'ANSWERED', answered_by: ME})]});
    const user = await openCalls();
    await user.click(await screen.findByRole('button', {name: 'Заказ по звонку'}));
    expect(screen.getByLabelText('Телефон звонящего')).toHaveValue('+380671234567');
    expect(screen.getByText('Заказ по звонку с +380671234567')).toBeVisible();
    await user.type(screen.getByLabelText('Откуда'), 'майдан');
    await user.click(screen.getAllByRole('button', {name: 'Найти'})[0]!);
    await user.click(await screen.findByRole('button', {name: 'Майдан'}));
    await user.type(screen.getByLabelText('Куда'), 'вокзал');
    await user.click(screen.getAllByRole('button', {name: 'Найти'})[1]!);
    await user.click(await screen.findByRole('button', {name: 'Вокзал'}));
    await user.click(screen.getByRole('button', {name: 'Рассчитать цену'}));
    await screen.findByText('Цена: 150.00 UAH');
    await user.click(screen.getByRole('button', {name: 'Создать заказ'}));
    await waitFor(() => expect(sent.filter(s => s.path === 'orders')).toHaveLength(1));
    expect(sent.find(s => s.path === 'orders')!.body).toMatchObject({call_id: CALL,
      caller: {phone: '+380671234567'}});
  });

  it('a call taken by someone else offers no order', async () => {
    handlers({calls: () => [call({state: 'ANSWERED', answered_by: 'another-operator'})]});
    await openCalls();
    await screen.findByRole('list', {name: 'Звонки'});
    expect(screen.queryByRole('button', {name: 'Заказ по звонку'})).not.toBeInTheDocument();
  });
});

describe('K5: rights', () => {
  it('listen only: the log, no status, no taking', async () => {
    const {asked} = handlers({rights: ['orders.create', 'calls.listen']});
    await openCalls();
    await screen.findByRole('list', {name: 'Звонки'});
    expect(screen.queryByRole('button', {name: 'Взять звонок'})).not.toBeInTheDocument();
    expect(screen.queryByRole('button', {name: 'Доступен'})).not.toBeInTheDocument();
    expect(asked.status).toBe(0);
  });

  it('neither right: no panel and nothing asked', async () => {
    const {asked} = handlers({rights: ['orders.create']});
    const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage, 'test'),
      correlationId: () => cid, initialSession: session});
    render(<OperatorApp client={api} pollMs={60} />);
    await screen.findByRole('button', {name: 'Выйти'});
    expect(screen.queryByRole('button', {name: 'Звонки'})).not.toBeInTheDocument();
    await delay(150);
    expect(asked.calls).toEqual([]);
    expect(asked.status).toBe(0);
  });
});

describe('K6: one action at a time', () => {
  it('a double click takes the call once', async () => {
    const {sent} = handlers({answer: async () => {
      await delay(200);
      return HttpResponse.json(call({state: 'ANSWERED', answered_by: ME}) as never);
    }});
    const user = await openCalls();
    const take = await screen.findByRole('button', {name: 'Взять звонок'});
    await Promise.all([user.click(take), user.click(take)]);
    await waitFor(() => expect(sent).toHaveLength(1));
    await delay(300);
    expect(sent).toHaveLength(1);
  });
});

/** Playing a call's recording (#302): R1–R6. */
describe('#302: recordings', () => {
  const stored = (state: string, over: Record<string, unknown> = {}) => call({state: 'ENDED', answered_by: ME,
    ended_at: '2026-11-02T10:03:00Z', recording: {state, duration_seconds: state === 'STORED' ? 125 : null,
      stored_at: state === 'STORED' ? '2026-11-02T10:04:00Z' : null}, ...over});
  const urls = {made: [] as Blob[], revoked: [] as string[]};

  // jsdom has no object URLs: only these two statics are added, URL itself stays the real constructor.
  const statics = URL as unknown as {createObjectURL?: (blob: Blob) => string; revokeObjectURL?: (url: string) => void};
  function stubUrls() {
    urls.made = [];
    urls.revoked = [];
    statics.createObjectURL = vi.fn((blob: Blob) => {urls.made.push(blob); return 'blob:recording-' + urls.made.length;});
    statics.revokeObjectURL = vi.fn((url: string) => {urls.revoked.push(url);});
  }
  afterEach(() => {
    delete statics.createObjectURL;
    delete statics.revokeObjectURL;
  });

  it('R1: a stored recording shows its length and plays with one request', async () => {
    stubUrls();
    const {asked} = handlers({calls: () => [stored('STORED')]});
    const user = await openCalls();
    expect(await screen.findByText(/запись 2:05/)).toBeVisible();
    await user.click(screen.getByRole('button', {name: 'Прослушать запись'}));
    const player = await screen.findByLabelText('Запись звонка');
    expect(player.getAttribute('src')).toBe('blob:recording-1');
    expect(asked.recording).toBe(1);
    expect([...new Uint8Array(await urls.made[0]!.arrayBuffer())]).toEqual([82, 73, 70, 70, 0x80, 0xff]);
  });

  it('R2: polling and another press do not fetch it again', async () => {
    stubUrls();
    const {asked} = handlers({calls: () => [stored('STORED')]});
    const user = await openCalls(60);
    await user.click(await screen.findByRole('button', {name: 'Прослушать запись'}));
    await screen.findByLabelText('Запись звонка');
    await waitFor(() => expect(asked.calls.length).toBeGreaterThanOrEqual(3));
    expect(screen.queryByRole('button', {name: 'Прослушать запись'})).not.toBeInTheDocument();
    expect(asked.recording).toBe(1);
  });

  it.each([['PENDING', 'запись готовится'], ['NONE', 'записи нет']])('R3: %s says so, no button', async (state, text) => {
    const {asked} = handlers({calls: () => [stored(state)]});
    await openCalls();
    expect(await screen.findByText(new RegExp(text))).toBeVisible();
    expect(screen.queryByRole('button', {name: 'Прослушать запись'})).not.toBeInTheDocument();
    expect(asked.recording).toBe(0);
  });

  it('R4: without calls.listen there is no button', async () => {
    handlers({rights: ['orders.create', 'calls.answer'], calls: () => [stored('STORED')]});
    await openCalls();
    await screen.findByRole('list', {name: 'Звонки'});
    expect(screen.queryByRole('button', {name: 'Прослушать запись'})).not.toBeInTheDocument();
  });

  it('R5: a refusal shows the correlation id', async () => {
    stubUrls();
    handlers({calls: () => [stored('STORED')],
      recording: () => HttpResponse.json(problem(404, 'NOT_FOUND'), {status: 404})});
    const user = await openCalls();
    await user.click(await screen.findByRole('button', {name: 'Прослушать запись'}));
    expect(await screen.findByText(new RegExp(cid))).toBeVisible();
    expect(urls.made).toEqual([]);
  });

  it('R6: the object URL is revoked when the panel closes', async () => {
    stubUrls();
    handlers({calls: () => [stored('STORED')]});
    const user = await openCalls();
    await user.click(await screen.findByRole('button', {name: 'Прослушать запись'}));
    await screen.findByLabelText('Запись звонка');
    await user.click(screen.getByRole('button', {name: 'Заказы'}));
    await waitFor(() => expect(urls.revoked).toEqual(['blob:recording-1']));
  });
});
