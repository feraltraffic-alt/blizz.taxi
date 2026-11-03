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

/** A driver's new phone by support, and the own card terminal (#435): P1–P4 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const DRIVER = 'd0000000-0000-4000-8000-000000000001';
const CHALLENGE = 'c4000000-0000-4000-8000-000000000001';
const reviewer = {...me, effective_permissions: ['driver.review']};
const profile = (over: Record<string, unknown> = {}) => ({id: DRIVER, account_state: 'ACTIVE',
  review_status: 'APPROVED', has_payment_terminal: false, admission_city_ids: [], version: 4, name: 'Водитель 1',
  language: 'uk', vehicles: [], documents: [], ...over});
const theCase = (over: Record<string, unknown> = {}) => ({profile: profile(over), phone: '+380500000001',
  history: [], duplicates: []});

type Sent = {path: string; body: Record<string, unknown>};

function handlers(opts: {code?: () => Response; change?: () => Response; terminal?: () => Response} = {}) {
  const sent: Sent[] = [];
  let reads = 0;
  let version = 4;
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(reviewer as never)),
    http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: []} as never)),
    http.get(origin + '/api/admin/v1/drivers/' + DRIVER, () => {
      reads++;
      return HttpResponse.json(theCase({version}) as never);
    }),
    http.post(origin + '/api/admin/v1/drivers/' + DRIVER + '/phone/new-code', async ({request}) => {
      sent.push({path: 'new-code', body: await request.json() as Record<string, unknown>});
      return opts.code ? opts.code() : HttpResponse.json({challenge_id: CHALLENGE,
        expires_at: '2026-11-03T10:10:00Z', resend_available_at: '2026-11-03T10:01:00Z'} as never, {status: 201});
    }),
    http.post(origin + '/api/admin/v1/drivers/' + DRIVER + '/phone', async ({request}) => {
      sent.push({path: 'phone', body: await request.json() as Record<string, unknown>});
      if (opts.change) return opts.change();
      version++;
      return HttpResponse.json({subject_id: DRIVER, phone: '+380671112233', version} as never);
    }),
    http.post(origin + '/api/admin/v1/drivers/' + DRIVER + '/payment-terminal', async ({request}) => {
      const body = await request.json() as Record<string, unknown>;
      sent.push({path: 'terminal', body});
      if (opts.terminal) return opts.terminal();
      version++;
      return HttpResponse.json(profile({has_payment_terminal: body.has_terminal, version}) as never);
    }));
  return {sent, reads: () => reads};
}

function mount() {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={['/drivers/' + DRIVER]}><AdminApp client={api} /></MemoryRouter>);
}

type User = ReturnType<typeof userEvent.setup>;

async function sendCode(user: User, phone: string) {
  await user.type(await screen.findByLabelText('Новый телефон водителя'), phone);
  await user.click(screen.getByRole('button', {name: 'Отправить код на новый номер'}));
}

async function change(user: User, code: string, reason: string) {
  if (code) await user.type(await screen.findByLabelText('Код с нового номера'), code);
  if (reason) await user.type(screen.getByLabelText('Как установлена личность'), reason);
  await user.click(screen.getByRole('button', {name: 'Сменить телефон'}));
}

async function terminal(user: User, button: string, reason: string) {
  if (reason) {
    await user.click(await screen.findByLabelText('Причина (терминал)'));
    await user.paste(reason);
  }
  await user.click(await screen.findByRole('button', {name: button}));
}

describe('P1: code to the new phone', () => {
  it('sends the phone, says when it can be sent again, and asks for the code', async () => {
    const h = handlers();
    const user = userEvent.setup();
    mount();
    await sendCode(user, '+380671112233');
    expect(await screen.findByText('Код отправлен; повторно — после 03.11.2026 10:01 UTC.')).toBeTruthy();
    expect(h.sent).toEqual([{path: 'new-code', body: {phone: '+380671112233'}}]);
    expect(screen.getByLabelText('Код с нового номера')).toBeTruthy();
  });

  it('not E.164 sends nothing', async () => {
    const h = handlers();
    const user = userEvent.setup();
    mount();
    await sendCode(user, '0671112233');
    expect(await screen.findByText('Нужен номер в формате +380…')).toBeTruthy();
    expect(h.sent).toHaveLength(0);
  });

  it('a 409 says it is the same phone', async () => {
    handlers({code: () => HttpResponse.json(problem(409, 'STATE_CONFLICT'), {status: 409})});
    const user = userEvent.setup();
    mount();
    await sendCode(user, '+380500000001');
    expect(await screen.findByText('Это и есть текущий номер водителя.')).toBeTruthy();
  });
});

describe('P2: change', () => {
  it('sends the contract body, shows the new phone and empties the fields', async () => {
    const h = handlers();
    const user = userEvent.setup();
    mount();
    await sendCode(user, '+380671112233');
    await change(user, '1234', 'Паспорт по видео');
    await waitFor(() => expect(h.sent).toHaveLength(2));
    expect(h.sent[1]).toEqual({path: 'phone', body: {command_id: expect.any(String), expected_version: 4,
      new_challenge_id: CHALLENGE, new_code: '1234', reason: 'Паспорт по видео'}});
    expect(await screen.findByRole('heading', {name: 'Водитель 1 · +380671112233'})).toBeTruthy();
    expect(screen.getByText('Телефон водителя изменён.')).toBeTruthy();
    expect((screen.getByLabelText('Новый телефон водителя') as HTMLInputElement).value).toBe('');
    expect(screen.queryByLabelText('Код с нового номера')).toBeNull();
  });

  it('the next command sends the version the last one answered, in either order', async () => {
    const h = handlers();
    const user = userEvent.setup();
    mount();
    await terminal(user, 'Отметить: терминал есть', 'Купил терминал');
    await screen.findByText('Свой терминал: есть');
    await sendCode(user, '+380671112233');
    await change(user, '1234', 'Паспорт');
    await screen.findByRole('heading', {name: 'Водитель 1 · +380671112233'});
    await terminal(user, 'Отметить: терминала нет', 'Сдал терминал');
    await waitFor(() => expect(h.sent).toHaveLength(4));
    expect(h.sent.map(s => [s.path, s.body.expected_version])).toEqual([['terminal', 4], ['new-code', undefined],
      ['phone', 5], ['terminal', 6]]);
  });
});

describe('P3: change refused', () => {
  it.each([['a code of three digits', '123', 'Паспорт'], ['a code with a letter', '12a4', 'Паспорт'],
    ['no reason', '1234', '']])('%s sends nothing', async (_name, code, reason) => {
    const h = handlers();
    const user = userEvent.setup();
    mount();
    await sendCode(user, '+380671112233');
    await change(user, code, reason);
    expect(await screen.findByText('Нужны код из 4–8 цифр и то, как установлена личность.')).toBeTruthy();
    expect(h.sent).toHaveLength(1);
  });

  it('OTP_INVALID says the code is wrong', async () => {
    handlers({change: () => HttpResponse.json(problem(400, 'OTP_INVALID'), {status: 400})});
    const user = userEvent.setup();
    mount();
    await sendCode(user, '+380671112233');
    await change(user, '1234', 'Паспорт');
    expect(await screen.findByText('Код неверный.')).toBeTruthy();
  });

  it('another 409 says the phone belongs to another account', async () => {
    handlers({change: () => HttpResponse.json(problem(409, 'STATE_CONFLICT'), {status: 409})});
    const user = userEvent.setup();
    mount();
    await sendCode(user, '+380671112233');
    await change(user, '1234', 'Паспорт');
    expect(await screen.findByText('Этот номер уже у другого аккаунта.')).toBeTruthy();
  });
});

describe('P4: terminal', () => {
  it('offers the opposite and sends it with the reason', async () => {
    const h = handlers();
    const user = userEvent.setup();
    mount();
    expect(await screen.findByText('Свой терминал: нет')).toBeTruthy();
    expect(screen.queryByRole('button', {name: 'Отметить: терминала нет'})).toBeNull();
    await terminal(user, 'Отметить: терминал есть', 'Купил терминал');
    await waitFor(() => expect(h.sent).toHaveLength(1));
    expect(h.sent[0]).toEqual({path: 'terminal', body: {command_id: expect.any(String), expected_version: 4,
      has_terminal: true, reason: 'Купил терминал'}});
    expect(await screen.findByText('Свой терминал: есть')).toBeTruthy();
    expect(screen.getByRole('button', {name: 'Отметить: терминала нет'})).toBeTruthy();
    expect((screen.getByLabelText('Причина (терминал)') as HTMLInputElement).value).toBe('');
  });

  it.each([['no reason', ''], ['a reason over 1000', 'x'.repeat(1001)]])('%s sends nothing', async (_name, reason) => {
    const h = handlers();
    const user = userEvent.setup();
    mount();
    await terminal(user, 'Отметить: терминал есть', reason);
    expect(await screen.findByText('Нужна причина до 1000 знаков.')).toBeTruthy();
    expect(h.sent).toHaveLength(0);
  });

  it('a 409 reads the driver again', async () => {
    const h = handlers({terminal: () => HttpResponse.json(problem(409, 'VERSION_CONFLICT'), {status: 409})});
    const user = userEvent.setup();
    mount();
    await terminal(user, 'Отметить: терминал есть', 'Купил');
    expect(await screen.findByText('Данные водителя изменились; они обновлены.')).toBeTruthy();
    await waitFor(() => expect(h.reads()).toBe(2));
  });
});
