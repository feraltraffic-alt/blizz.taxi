import {fireEvent, render, screen, waitFor} from '@testing-library/react-native';

/** The provider's page: what the app sends it is recorded, and it "returns" at once, as the sandbox's FAKE page does. */
const pages: {url: string; fields: Record<string, string>}[] = [];
jest.mock('../src/ProviderPage', () => {
  const {useEffect} = jest.requireActual<typeof import('react')>('react');
  return {ProviderPage: ({url, fields, onDone}: {url: string; fields: Record<string, string>; onDone: () => void}) => {
    useEffect(() => {
      pages.push({url, fields});
      onDone();
    }, []);
    return null;
  }};
});
import {createApiClient} from '@blizz/api-client';
import {DriverApp, type AppConfig} from '../src/App';

/** The driver's money screen (#257): M1–M7 of the issue. */
const cid = '10000000-0000-4000-8000-000000000001';
const session = {
  session_id: '10000000-0000-4000-8000-000000000002', subject: {type: 'DRIVER', id: '10000000-0000-4000-8000-000000000003'},
  audience: 'driver', access_token: 'test-only-access', refresh_token: 'test-only-refresh',
  access_expires_at: '2099-01-01T00:00:00Z', refresh_expires_at: '2099-01-01T00:00:00Z', password_change_required: false
};
const NOW = Date.parse('2026-11-02T10:00:00Z');
const KYIV = '50000000-0000-4000-8000-000000000001';
const VEHICLE = '60000000-0000-4000-8000-000000000001';
const SESSION = '70000000-0000-4000-8000-000000000001';
const admitted = {id: session.subject.id, account_state: 'ACTIVE', review_status: 'APPROVED', admission_city_ids: [KYIV],
  has_payment_terminal: false, version: 3, vehicles: [{id: VEHICLE, state: 'APPROVED'}], documents: []};
const online = {driver_id: session.subject.id, session_id: SESSION, session_version: 1, session_state: 'OPEN',
  connection: 'CONNECTED', geolocation: 'FRESH', occupancy: 'FREE', account_state: 'ACTIVE', review_status: 'APPROVED',
  eligible: true, ineligible_reasons: []};

type Call = {method: string; path: string; query: URLSearchParams; body?: unknown};
type Answer = {status: number; body?: unknown; delayMs?: number};

function server(script: Record<string, Answer[]>) {
  const calls: Call[] = [];
  const fetch = jest.fn(async (url: string, init: RequestInit) => {
    const parsed = new URL(url);
    const path = parsed.pathname;
    const method = String(init.method);
    calls.push({method, path, query: parsed.searchParams, body: init.body ? JSON.parse(String(init.body)) : undefined});
    const answers = script[method + ' ' + path] ?? [{status: 404, body: {code: 'NOT_FOUND', correlation_id: cid}}];
    const answer = answers.length > 1 ? answers.shift()! : answers[0]!;
    if (answer.delayMs) await new Promise(resolve => setTimeout(resolve, answer.delayMs));
    return new Response(answer.body === undefined ? null : JSON.stringify(answer.body), {
      status: answer.status, headers: {'Content-Type': 'application/json'}
    });
  });
  return {fetch: fetch as unknown as typeof globalThis.fetch, calls};
}

const problem = (status: number, code: string) => ({status, body: {type: 'about:blank', title: code, status, code,
  correlation_id: cid, retryable: false}});
const base = {
  'GET /api/driver/v1/legal': [{status: 200, body: {documents: []}}],
  'GET /api/driver/v1/profile': [{status: 200, body: admitted}],
  'GET /api/driver/v1/work-sessions/current': [{status: 200, body: {...online, session_state: 'CLOSED',
    session_id: null}}],
};

async function mount(script: Record<string, Answer[]>, options: {clock?: number; pollMs?: number} = {}) {
  const http = server({...base, ...script});
  let id = 0;
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: {read: () => null, write: () => {}},
    fetch: http.fetch, correlationId: () => cid, initialSession: session as never});
  const config: AppConfig = {service: 'default', deviceRef: 'test-driver', now: () => options.clock ?? NOW,
    heartbeatMs: 60_000, pollMs: options.pollMs ?? 60_000, locate: async () => ({lat: 50.4501, lon: 30.5234, accuracy_m: 8}),
    newId: () => '40000000-0000-4000-8000-' + String(++id).padStart(12, '0')};
  await render(<DriverApp client={client} config={config} />);
  return {http};
}


const zero = {trips: 0, fare_minor: 0, commission_minor: 0, driver_share_minor: 0, held_minor: 0, cash_minor: 0,
  cashless_minor: 0, tips_minor: 0, bonuses_minor: 0, top_ups_minor: 0, transfers_in_minor: 0, transfers_out_minor: 0,
  adjustments_minor: 0, net_minor: 0};
const week = {...zero, trips: 3, fare_minor: 45000, commission_minor: 6750, driver_share_minor: 38250, cash_minor: 30000,
  cashless_minor: 15000, net_minor: 8250};
const earnings = (over: Record<string, unknown> = {}) => ({driver_id: session.subject.id, city_id: KYIV,
  currency: 'UAH', timezone: 'Europe/Kyiv', from: '2026-10-27', to: '2026-11-02',
  days: [{date: '2026-11-02', figures: {...week, trips: 1, fare_minor: 15000, driver_share_minor: 12750}}], total: week,
  balance_minor: 8250, pending: {trips: 0, fare_minor: 0}, ...over});
const entry = (n: number, kind: string, amount: number, reason: string) => ({
  id: 'b0000000-0000-4000-8000-00000000000' + n, at: '2026-11-02T0' + n + ':00:00Z', kind, currency: 'UAH',
  amount_minor: amount, reason, order_id: null, counterpart_id: null});
const history = (entries: unknown[], next: string | null) => ({driver_id: session.subject.id,
  balances: [{currency: 'UAH', balance_minor: 8250}], entries, page: {next_cursor: next, has_more: next !== null}});
const money = (script: Record<string, Answer[]>) => ({
  'GET /api/driver/v1/balance': [{status: 200, body: {balances: [{currency: 'UAH', balance_minor: 8250,
    debt_limit_minor: 50000, blocked: false}]}}],
  'GET /api/driver/v1/earnings': [{status: 200, body: earnings()}],
  'GET /api/driver/v1/balance/history': [{status: 200, body: history([entry(3, 'TRIP_FARE', 12750, 'Поездка 1042'),
    entry(2, 'CASH_COLLECTED', -15000, 'Наличные за поездку 1042'), entry(1, 'BONUS', 500, 'Бонус за неделю')], null)}],
  ...script
});

async function openMoney(script: Record<string, Answer[]>, clock?: number, pollMs?: number) {
  const result = await mount(money(script), {clock, pollMs});
  await fireEvent.press(await screen.findByRole('button', {name: 'Деньги'}));
  return result;
}

describe('M1: the plain success', () => {
  it('shows the balance, the week and the movements', async () => {
    const {http} = await openMoney({});
    expect(await screen.findByText('Служба должна вам 82.50 UAH')).toBeTruthy();
    expect(screen.getByText('Лимит долга: 500.00 UAH')).toBeTruthy();
    expect(screen.getByText('За 7 дней: поездок 3, 450.00 UAH, комиссия 67.50 UAH, ваша часть 382.50 UAH')).toBeTruthy();
    expect(screen.getByText('Сегодня: поездок 1, 150.00 UAH, ваша часть 127.50 UAH')).toBeTruthy();
    expect(screen.getByText('+127.50 UAH · Оплата поездки · Поездка 1042')).toBeTruthy();
    expect(screen.getByText('−150.00 UAH · Наличные у вас · Наличные за поездку 1042')).toBeTruthy();
    expect(screen.getByText('+5.00 UAH · Бонус · Бонус за неделю')).toBeTruthy();
    expect(http.calls.some(c => c.path === '/api/driver/v1/balance')).toBe(true);
  });

  it('asks the earnings of the first admission city for the last 7 days', async () => {
    const {http} = await openMoney({});
    await screen.findByText('Служба должна вам 82.50 UAH');
    const asked = http.calls.find(c => c.path === '/api/driver/v1/earnings')!;
    expect(asked.query.get('city_id')).toBe(KYIV);
    expect(asked.query.get('from')).toBe('2026-10-27');
    expect(asked.query.get('to')).toBe('2026-11-02');
  });
});

describe('M2: a debt over the limit', () => {
  it('says the debt and why there are no orders', async () => {
    await openMoney({'GET /api/driver/v1/balance': [{status: 200, body: {balances: [{currency: 'UAH',
      balance_minor: -62000, debt_limit_minor: 50000, blocked: true}]}}]});
    expect(await screen.findByText('Вы должны службе 620.00 UAH')).toBeTruthy();
    expect(screen.getByText('Новых заказов не будет, пока долг выше лимита.')).toBeTruthy();
  });
});

describe('M3: nothing yet', () => {
  it('a driver without movements sees so, and no "more"', async () => {
    await openMoney({'GET /api/driver/v1/balance/history': [{status: 200, body: history([], null)}]});
    expect(await screen.findByText('Движений пока нет.')).toBeTruthy();
    expect(screen.queryByRole('button', {name: 'Ещё'})).toBeNull();
  });
});

describe('M4: the next page', () => {
  it('is read with the cursor, once on a double tap, and appended; the button leaves at the end', async () => {
    const {http} = await openMoney({'GET /api/driver/v1/balance/history': [
      {status: 200, body: history([entry(3, 'TRIP_FARE', 12750, 'Поездка 1042')], 'cursor-2')},
      {status: 200, delayMs: 300, body: history([entry(1, 'BONUS', 500, 'Бонус за неделю')], null)}]});
    const more = await screen.findByRole('button', {name: 'Ещё'});
    await fireEvent.press(more);
    await fireEvent.press(more);
    expect(await screen.findByText('+5.00 UAH · Бонус · Бонус за неделю')).toBeTruthy();
    expect(screen.getByText('+127.50 UAH · Оплата поездки · Поездка 1042')).toBeTruthy();
    await waitFor(() => expect(screen.queryByRole('button', {name: 'Ещё'})).toBeNull());
    const reads = http.calls.filter(c => c.path === '/api/driver/v1/balance/history');
    expect(reads).toHaveLength(2);
    expect(reads[1]!.query.get('cursor')).toBe('cursor-2');
  });
});

describe('M5: an unknown kind', () => {
  it('is shown by its code', async () => {
    await openMoney({'GET /api/driver/v1/balance/history': [{status: 200, body: history([
      entry(1, 'SOMETHING_NEW', 100, 'Новое')], null)}]});
    expect(await screen.findByText('+1.00 UAH · SOMETHING_NEW · Новое')).toBeTruthy();
  });
});

describe('M6: trips not in the journal yet', () => {
  it('are said', async () => {
    await openMoney({'GET /api/driver/v1/earnings': [{status: 200, body: earnings({pending: {trips: 2,
      fare_minor: 30000}})}]});
    expect(await screen.findByText('Ещё считаются поездок: 2.')).toBeTruthy();
  });
});

describe('M7: a failed read', () => {
  it('shows the correlation id and a retry that reads again', async () => {
    const {http} = await openMoney({'GET /api/driver/v1/balance': [problem(500, 'INTERNAL'), {status: 200,
      body: {balances: [{currency: 'UAH', balance_minor: 0, debt_limit_minor: null, blocked: false}]}}]});
    expect(await screen.findByText(new RegExp(cid))).toBeTruthy();
    await fireEvent.press(screen.getByRole('button', {name: 'Повторить'}));
    expect(await screen.findByText('Баланс: 0.00 UAH')).toBeTruthy();
    expect(http.calls.filter(c => c.path === '/api/driver/v1/balance')).toHaveLength(2);
  });
});

/** The days of the city's calendar, not the phone's (#321): Z1–Z4. */
describe('#321: the city\'s days', () => {
  const boot = (timezone: string) => ({'GET /api/config/v1/bootstrap': [{status: 200, body: {cities: [
    {id: KYIV, code: 'kyiv', name: 'Київ', currency: 'UAH', timezone, center: {lat: 50.45, lon: 30.52}}]}}]});
  async function asked(script: Record<string, Answer[]>, clock: number) {
    const {http} = await openMoney({...script}, clock);
    await screen.findByText(/За 7 дней/);
    const call = http.calls.filter(c => c.path === '/api/driver/v1/earnings').at(-1)!;
    return [call.query.get('from'), call.query.get('to')];
  }

  it('Z1: at 22:30 UTC Kyiv is already on the next day', async () => {
    expect(await asked(boot('Europe/Kyiv'), Date.parse('2026-11-02T22:30:00Z'))).toEqual(['2026-10-28', '2026-11-03']);
  });

  it('Z2: at 10:00 UTC both calendars agree', async () => {
    expect(await asked(boot('Europe/Kyiv'), Date.parse('2026-11-02T10:00:00Z'))).toEqual(['2026-10-27', '2026-11-02']);
  });

  it('Z3: a city behind UTC is still on the day before', async () => {
    expect(await asked(boot('America/New_York'), Date.parse('2026-11-03T02:00:00Z')))
      .toEqual(['2026-10-27', '2026-11-02']);
  });

  it('Z4: without the city\'s time zone the phone\'s calendar is used', async () => {
    const clock = Date.parse('2026-11-02T22:30:00Z');
    const local = (at: number) => {
      const d = new Date(at);
      return d.getFullYear() + '-' + String(d.getMonth() + 1).padStart(2, '0') + '-' + String(d.getDate()).padStart(2, '0');
    };
    expect(await asked({'GET /api/config/v1/bootstrap': [{status: 503, body: {code: 'UNAVAILABLE',
      correlation_id: cid}}]}, clock)).toEqual([local(clock - 6 * 86_400_000), local(clock)]);
  });
});

/** Topping up the balance by card (#326): U1–U5. */
describe('#326: top-up by card', () => {
  const TOP = 'a0000000-0000-4000-8000-000000000001';
  const topUp = (state: string, over: Record<string, unknown> = {}) => ({id: TOP, state, amount_minor: 25050,
    currency: 'UAH', created_at: '2026-11-02T10:00:00Z', expires_at: '2026-11-02T10:15:00Z', ...over});
  const started = topUp('PENDING', {url: 'https://secure.wayforpay.test/pay', fields: {merchantAccount: 'test'},
    return_url: 'https://api.blizz.test/return'});
  const START = 'POST /api/driver/v1/balance/card-top-ups';
  const READ = 'GET /api/driver/v1/balance/card-top-ups/' + TOP;
  beforeEach(() => {pages.length = 0;});

  async function topUpWith(amount: string, script: Record<string, Answer[]>) {
    const result = await openMoney({[START]: [{status: 201, body: started}],
      [READ]: [{status: 200, body: topUp('PENDING')}, {status: 200, body: topUp('COMPLETED')}], ...script},
    undefined, 50);
    await fireEvent.changeText(await screen.findByLabelText('Сумма пополнения, UAH'), amount);
    await fireEvent.press(screen.getByRole('button', {name: 'Пополнить картой'}));
    return result;
  }
  const starts = (http: {calls: Call[]}) => http.calls.filter(c => c.method === 'POST'
    && c.path === '/api/driver/v1/balance/card-top-ups');

  it.each([['', 'пусто'], ['abc', 'не число'], ['10.005', 'три знака'], ['0.99', 'меньше 1'], ['10000.01', 'больше 10 000']])(
    'U1: "%s" (%s) is refused on the phone', async amount => {
      const {http} = await topUpWith(amount, {});
      expect(await screen.findByText('Укажите сумму от 1.00 до 10000.00 UAH.')).toBeTruthy();
      expect(starts(http)).toEqual([]);
    });

  it('U2, U3: one start in minor units, the page, then COMPLETED and the balance again', async () => {
    const {http} = await topUpWith('250.50', {});
    expect(await screen.findByText('Баланс пополнен на 250.50 UAH.')).toBeTruthy();
    expect(starts(http).map(c => c.body)).toEqual([{command_id: expect.any(String), city_id: KYIV,
      amount_minor: 25050}]);
    expect(pages).toEqual([{url: 'https://secure.wayforpay.test/pay', fields: {merchantAccount: 'test'}}]);
    expect(http.calls.filter(c => c.path === '/api/driver/v1/balance').length).toBeGreaterThanOrEqual(2);
  });

  it.each([
    [topUp('FAILED', {failure_reason: 'Недостаточно средств'}), 'Оплата не прошла: Недостаточно средств'],
    [topUp('EXPIRED'), 'Время оплаты истекло.']
  ])('U3: a %j result is told', async (result, text) => {
    await topUpWith('100', {[READ]: [{status: 200, body: result}]});
    expect(await screen.findByText(text)).toBeTruthy();
  });

  it('U4: a city without cards says so', async () => {
    await topUpWith('100', {[START]: [{status: 404, body: {code: 'NOT_FOUND', correlation_id: cid}}]});
    expect(await screen.findByText('В этом городе нельзя пополнить картой.')).toBeTruthy();
    expect(pages).toEqual([]);
  });

  it('U5: a double press starts once', async () => {
    const {http} = await openMoney({[START]: [{status: 201, delayMs: 200, body: started}],
      [READ]: [{status: 200, body: topUp('COMPLETED')}]}, undefined, 50);
    await fireEvent.changeText(await screen.findByLabelText('Сумма пополнения, UAH'), '100');
    const button = screen.getByRole('button', {name: 'Пополнить картой'});
    await fireEvent.press(button);
    await fireEvent.press(button);
    expect(await screen.findByText('Баланс пополнен на 250.50 UAH.')).toBeTruthy();
    expect(starts(http)).toHaveLength(1);
  });
});

/** The driver's rating and promotions (#341): R1–R3, P1–P3. */
describe('#341: rating and promotions', () => {
  const RATING = 'GET /api/driver/v1/me/rating';
  const PROMOS = 'GET /api/driver/v1/promotions';
  const promo = (over: Record<string, unknown> = {}) => ({promotion_id: 'p1', name: 'Неделя без выходных',
    reward_minor: 50000, currency: 'UAH', orders_required: 20, orders_done: 12, period_start: '2026-11-01T00:00:00Z',
    period_end: '2026-11-08T00:00:00Z', rewarded: false, repeat: 'EVERY_PERIOD', ...over});
  const dm = (iso: string) => {
    const d = new Date(iso);
    const two = (n: number) => String(n).padStart(2, '0');
    return two(d.getDate()) + '.' + two(d.getMonth() + 1) + ' ' + two(d.getHours()) + ':' + two(d.getMinutes());
  };

  it('R1: the average and the count', async () => {
    await openMoney({[RATING]: [{status: 200, body: {score_sum: 623, count: 128, average_hundredths: 487}}],
      [PROMOS]: [{status: 200, body: {promotions: []}}]});
    expect(await screen.findByText('Ваш рейтинг: 4.87 (128 оценок)')).toBeTruthy();
  });

  it('R2: no ratings yet', async () => {
    await openMoney({[RATING]: [{status: 200, body: {score_sum: 0, count: 0, average_hundredths: 0}}],
      [PROMOS]: [{status: 200, body: {promotions: []}}]});
    expect(await screen.findByText('Оценок пока нет')).toBeTruthy();
  });

  it('R3: an unavailable rating leaves the rest of the screen', async () => {
    await openMoney({[RATING]: [problem(503, 'UNAVAILABLE')], [PROMOS]: [{status: 200, body: {promotions: []}}]});
    expect(await screen.findByText('Служба должна вам 82.50 UAH')).toBeTruthy();
    expect(screen.queryByText(/Ваш рейтинг/)).toBeNull();
  });

  it('P1, P2: progress and a reward already paid', async () => {
    await openMoney({[RATING]: [{status: 200, body: {score_sum: 0, count: 0, average_hundredths: 0}}],
      [PROMOS]: [{status: 200, body: {promotions: [promo(), promo({promotion_id: 'p2', name: 'Первые 10',
        orders_required: 10, orders_done: 10, rewarded: true, repeat: 'ONCE'})]}}]});
    expect(await screen.findByText('«Неделя без выходных»: 12 из 20 поездок до ' + dm('2026-11-08T00:00:00Z')
      + ' · награда 500.00 UAH')).toBeTruthy();
    expect(screen.getByText('«Первые 10»: 10 из 10 поездок до ' + dm('2026-11-08T00:00:00Z')
      + ' · награда получена')).toBeTruthy();
  });

  it('P3: no promotions', async () => {
    await openMoney({[RATING]: [{status: 200, body: {score_sum: 0, count: 0, average_hundredths: 0}}],
      [PROMOS]: [{status: 200, body: {promotions: []}}]});
    expect(await screen.findByText('Сейчас акций нет.')).toBeTruthy();
  });
});

/** Sending money to another driver (#343): T1–T6. */
describe('#343: transfers', () => {
  const RULES = 'GET /api/driver/v1/transfer-rules';
  const SEND = 'POST /api/driver/v1/transfers';
  const rule = (over: Record<string, unknown> = {}) => ({status: 200, body: {rules: [{currency: 'UAH', enabled: true,
    max_per_transfer_minor: 50000, max_per_day_minor: 100000, min_balance_after_minor: 0, version: 1, ...over}]}});
  const sent = {status: 201, body: {id: 't1', from_driver_id: session.subject.id, to_driver_id: 'd2', currency: 'UAH',
    amount_minor: 15000, comment: null, at: '2026-11-02T10:00:00Z'}};
  const sends = (http: {calls: Call[]}) => http.calls.filter(c => c.method === 'POST' && c.path === '/api/driver/v1/transfers');

  async function fill(phone: string, sum: string, comment = '') {
    await fireEvent.changeText(await screen.findByLabelText('Номер водителя'), phone);
    await fireEvent.changeText(screen.getByLabelText('Сумма перевода, UAH'), sum);
    if (comment) await fireEvent.changeText(screen.getByLabelText('Комментарий к переводу'), comment);
    await fireEvent.press(screen.getByRole('button', {name: 'Перевести'}));
  }

  it('T1: the limits are shown; a rule that is off shows no form', async () => {
    await openMoney({[RULES]: [rule()]});
    expect(await screen.findByText('Перевод водителю: до 500.00 UAH за раз, до 1000.00 UAH в день')).toBeTruthy();
  });

  it('T1: off', async () => {
    await openMoney({[RULES]: [rule({enabled: false})]});
    expect(await screen.findByText('Переводы выключены.')).toBeTruthy();
    expect(screen.queryByLabelText('Номер водителя')).toBeNull();
  });

  it.each([['0671234567', '150', ''], ['+380671234567', '15.005', ''], ['+380671234567', '500.01', ''],
    ['+380671234567', '150', 'я'.repeat(201)]])('T2: %s / %s is refused on the phone', async (phone, sum, comment) => {
    const {http} = await openMoney({[RULES]: [rule()]});
    await fill(phone, sum, comment);
    expect(await screen.findByText('Проверьте номер (+380…), сумму до 500.00 UAH и комментарий до 200 символов.'))
      .toBeTruthy();
    expect(sends(http)).toEqual([]);
  });

  it('T3, T4: confirmed, sent once, the balance read again; cancel sends nothing', async () => {
    const {http} = await openMoney({[RULES]: [rule()], [SEND]: [sent]});
    await fill('+380671234567', '150', 'за смену');
    expect(await screen.findByText('Перевести 150.00 UAH водителю +380671234567?')).toBeTruthy();
    expect(sends(http)).toEqual([]);
    await fireEvent.press(screen.getByRole('button', {name: 'Отменить'}));
    expect(sends(http)).toEqual([]);
    await fireEvent.press(screen.getByRole('button', {name: 'Перевести'}));
    await fireEvent.press(await screen.findByRole('button', {name: 'Подтвердить перевод'}));
    expect(await screen.findByText('Отправлено 150.00 UAH.')).toBeTruthy();
    expect(sends(http).map(c => c.body)).toEqual([{command_id: expect.any(String), to_phone: '+380671234567',
      currency: 'UAH', amount_minor: 15000, comment: 'за смену'}]);
    await waitFor(() => expect(http.calls.filter(c => c.path === '/api/driver/v1/balance').length)
      .toBeGreaterThanOrEqual(2));
  });

  it.each([
    [404, 'NOT_FOUND', 'Нет активного водителя с этим номером.'],
    [422, 'WALLET_INSUFFICIENT', 'Недостаточно средств: после перевода должно остаться не меньше 0.00 UAH.'],
    [400, 'VALIDATION_FAILED', 'Превышен лимит переводов.'],
    [409, 'STATE_CONFLICT', 'Переводы сейчас недоступны.']
  ])('T5: a %s %s is told', async (status, code, text) => {
    await openMoney({[RULES]: [rule()], [SEND]: [problem(status, code)]});
    await fill('+380671234567', '150');
    await fireEvent.press(await screen.findByRole('button', {name: 'Подтвердить перевод'}));
    expect(await screen.findByText(text)).toBeTruthy();
  });

  it('T6: a double press on the confirmation sends once', async () => {
    const {http} = await openMoney({[RULES]: [rule()], [SEND]: [{...sent, delayMs: 200}]});
    await fill('+380671234567', '150');
    const confirm = await screen.findByRole('button', {name: 'Подтвердить перевод'});
    await fireEvent.press(confirm);
    await fireEvent.press(confirm);
    expect(await screen.findByText('Отправлено 150.00 UAH.')).toBeTruthy();
    expect(sends(http)).toHaveLength(1);
  });
});
