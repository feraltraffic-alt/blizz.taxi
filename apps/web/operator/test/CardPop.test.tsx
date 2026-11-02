import {afterAll, afterEach, beforeAll, describe, expect, it} from 'vitest';
import {act, render, screen, waitFor} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {http, HttpResponse} from 'msw';
import {setupServer} from 'msw/node';
import {createApiClient} from '@blizz/api-client';
import {browserRefreshTokens} from '@blizz/web-ui';
import {OperatorApp, type LiveSocket} from '../src/App.js';
import {cid, me, problem, rotated, session} from '../../../../test/fixtures.js';

/** The card-pop over /ws/v1/operator (#306): W1–W6 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear();});
afterAll(() => server.close());

const KYIV = {id: '5a000000-0000-4000-8000-000000000001', code: 'kyiv', name: 'Київ', currency: 'UAH',
  timezone: 'Europe/Kyiv', working_hours: [], payment_methods: ['CASH'], orders_paused: false,
  center: {lat: 50.45, lon: 30.52}};
const CALL = 'ca000000-0000-4000-8000-000000000001';
const URL_ = 'wss://api.blizz.test/ws/v1/operator';

/** A fake browser socket: the test drives open, messages and close. */
class FakeSocket implements LiveSocket {
  onopen: (() => void) | null = null;
  onmessage: ((event: {data: string}) => void) | null = null;
  onclose: ((event: {code: number}) => void) | null = null;
  closed = false;
  constructor(readonly url: string, readonly protocols: string[]) {}
  close() {this.closed = true;}
  send() {}
  push(message: unknown) {act(() => this.onmessage?.({data: JSON.stringify(message)}));}
  drop(code: number) {act(() => this.onclose?.({code}));}
}

function handlers(rights = ['orders.create', 'calls.answer'], answer?: () => Response) {
  const answered: unknown[] = [];
  let refreshes = 0;
  server.use(
    http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [KYIV]})),
    http.get(origin + '/api/operator/v1/me', () => HttpResponse.json({...me, effective_permissions: rights} as never)),
    http.get(origin + '/api/operator/v1/vehicle-classes', () => HttpResponse.json([{code: 'STANDARD', name: 'Стандарт'}])),
    http.post(origin + '/auth/v1/token/refresh', () => {refreshes++; return HttpResponse.json(rotated);}),
    http.post(origin + '/api/operator/v1/calls/' + CALL + '/answer', async ({request}) => {
      answered.push(await request.json());
      return answer ? answer() : HttpResponse.json({id: CALL, state: 'ANSWERED'} as never);
    }));
  return {answered, refreshes: () => refreshes};
}

function mount() {
  const sockets: FakeSocket[] = [];
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage, 'test'),
    correlationId: () => cid, initialSession: session});
  let id = 0;
  const view = render(<OperatorApp client={api} pollMs={60_000}
    newId={() => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')}
    live={{url: URL_, retryMs: [20, 40], open: (url, protocols) => {
      const socket = new FakeSocket(url, protocols);
      sockets.push(socket);
      return socket;
    }}} />);
  return {sockets, view};
}
const ringing = (over: Record<string, unknown> = {}) => ({type: 'CallRinging', payload: {call_id: CALL,
  city_id: KYIV.id, caller_phone: '+380671234567', client_id: 'c1', client_name: 'Анна Петрова',
  open_order_ids: ['o1'], ...over}});

describe('W1: connect', () => {
  it('with calls.answer, the token in the subprotocol, never in the URL', async () => {
    handlers();
    const {sockets} = mount();
    await waitFor(() => expect(sockets).toHaveLength(1));
    expect(sockets[0]!.url).toBe(URL_);
    expect(sockets[0]!.protocols).toEqual(['blizz.v1', 'blizz.bearer.' + session.access_token]);
    expect(sockets[0]!.url).not.toContain('access_token');
  });

  it('without calls.answer no socket', async () => {
    handlers(['orders.create', 'calls.listen']);
    const {sockets} = mount();
    await screen.findByRole('button', {name: 'Выйти'});
    await new Promise(resolve => setTimeout(resolve, 50));
    expect(sockets).toEqual([]);
  });
});

describe('W2: the card', () => {
  it('shows the caller, takes the call and makes an order from it', async () => {
    const {answered} = handlers();
    const {sockets} = mount();
    await waitFor(() => expect(sockets).toHaveLength(1));
    sockets[0]!.push({type: 'Connected'});
    sockets[0]!.push(ringing());
    expect(await screen.findByText('Звонок: +380671234567 · Анна Петрова · открытых заказов: 1')).toBeVisible();
    const user = userEvent.setup();
    await user.click(screen.getByRole('button', {name: 'Взять звонок'}));
    await waitFor(() => expect(answered).toEqual([{command_id: expect.any(String)}]));
    await user.click(await screen.findByRole('button', {name: 'Заказ по звонку'}));
    expect(screen.getByLabelText('Телефон звонящего')).toHaveValue('+380671234567');
    expect(screen.getByText('Заказ по звонку с +380671234567')).toBeVisible();
  });

  it('a hidden number and an unknown caller', async () => {
    handlers();
    const {sockets} = mount();
    await waitFor(() => expect(sockets).toHaveLength(1));
    sockets[0]!.push(ringing({caller_phone: null, client_id: null, client_name: null, open_order_ids: []}));
    expect(await screen.findByText('Звонок: номер скрыт')).toBeVisible();
  });
});

describe('W3: an expired token', () => {
  it('4401 refreshes once and reconnects with the new token', async () => {
    const h = handlers();
    const {sockets} = mount();
    await waitFor(() => expect(sockets).toHaveLength(1));
    sockets[0]!.drop(4401);
    await waitFor(() => expect(sockets).toHaveLength(2));
    expect(sockets[1]!.protocols).toEqual(['blizz.v1', 'blizz.bearer.' + rotated.access_token]);
    expect(h.refreshes()).toBe(1);
  });
});

describe('W4: access gone', () => {
  it('4403 does not reconnect and says so', async () => {
    handlers();
    const {sockets} = mount();
    await waitFor(() => expect(sockets).toHaveLength(1));
    sockets[0]!.drop(4403);
    expect(await screen.findByText('Доступ к звонкам закрыт. Войдите снова.')).toBeVisible();
    await new Promise(resolve => setTimeout(resolve, 100));
    expect(sockets).toHaveLength(1);
  });
});

describe('W5: other closes', () => {
  it('reconnect after the back-off; not after unmount', async () => {
    handlers();
    const {sockets, view} = mount();
    await waitFor(() => expect(sockets).toHaveLength(1));
    sockets[0]!.drop(1006);
    await waitFor(() => expect(sockets).toHaveLength(2));
    expect(sockets[1]!.protocols).toEqual(['blizz.v1', 'blizz.bearer.' + session.access_token]);
    view.unmount();
    expect(sockets[1]!.closed).toBe(true);
    sockets[1]!.drop(1006);
    await new Promise(resolve => setTimeout(resolve, 100));
    expect(sockets).toHaveLength(2);
  });
});

describe('W6: taken elsewhere', () => {
  it('a 409 says so and the card goes away', async () => {
    handlers(undefined, () => HttpResponse.json(problem(409, 'STATE_CONFLICT'), {status: 409}));
    const {sockets} = mount();
    await waitFor(() => expect(sockets).toHaveLength(1));
    sockets[0]!.push(ringing());
    const user = userEvent.setup();
    await user.click(await screen.findByRole('button', {name: 'Взять звонок'}));
    expect(await screen.findByText('Звонок уже взял другой оператор, или он закончился.')).toBeVisible();
    expect(screen.queryByText(/Звонок: \+380671234567/)).not.toBeInTheDocument();
  });
});
