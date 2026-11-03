import {afterAll, afterEach, beforeAll, describe, expect, it, vi} from 'vitest';
import {render, screen} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {MemoryRouter} from 'react-router-dom';
import {http, HttpResponse} from 'msw';
import {setupServer} from 'msw/node';
import {createApiClient} from '@blizz/api-client';
import {AdminApp} from '../src/App.js';
import {browserRefreshTokens} from '../src/storage.js';
import {cid, me, problem, session} from '../../../../test/fixtures.js';

/** How sign-in codes reached a phone (#434): K1–K3 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const support = {...me, effective_permissions: ['support.manage']};
const viewer = {...me, effective_permissions: ['orders.view']};
const attempt = (over: Record<string, unknown> = {}) => ({id: '0e000000-0000-4000-8000-000000000001',
  challenge_id: null, phone: '+380671234567', audience: 'CLIENT', channel: 'SMS', provider: 'TURBOSMS', state: 'SENT',
  provider_ref: '12345', error: null, attempted_at: '2026-11-03T09:00:15Z', ...over});

function handlers(opts: {rights?: unknown; answer?: () => Response} = {}) {
  const asked: {phone: string | null; limit: string | null}[] = [];
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json((opts.rights ?? support) as never)),
    http.get(origin + '/api/admin/v1/otp-deliveries', ({request}) => {
      const query = new URL(request.url).searchParams;
      asked.push({phone: query.get('phone'), limit: query.get('limit')});
      return opts.answer ? opts.answer() : HttpResponse.json({deliveries: [attempt()]} as never);
    }));
  return {asked};
}

function mount(path = '/otp-deliveries') {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={[path]}><AdminApp client={api} /></MemoryRouter>);
}

async function search(user: ReturnType<typeof userEvent.setup>, phone: string) {
  const input = await screen.findByLabelText('Телефон');
  if (phone) await user.type(input, phone);
  await user.click(screen.getByRole('button', {name: 'Найти'}));
}

describe('K1: search', () => {
  it('sends the trimmed phone with limit 50 and shows a sent attempt', async () => {
    const h = handlers();
    const user = userEvent.setup();
    mount();
    await search(user, '  +380671234567 ');
    expect(await screen.findByText('03.11.2026 09:00:15 UTC · пассажир · SMS · TURBOSMS · отправлено · id 12345'))
      .toBeTruthy();
    expect(h.asked).toEqual([{phone: '+380671234567', limit: '50'}]);
  });

  it.each([
    ['FAILED', {state: 'FAILED', provider_ref: null, error: 'Not configured', audience: 'DRIVER', channel: 'VOICE',
      provider: 'ASTERISK'}, '03.11.2026 09:00:15 UTC · водитель · VOICE · ASTERISK · не прошло · ошибка: Not configured'],
    ['UNKNOWN', {state: 'UNKNOWN', provider_ref: null, error: 'Timeout'},
      '03.11.2026 09:00:15 UTC · пассажир · SMS · TURBOSMS · нет ответа · ошибка: Timeout']
  ])('%s shows the error', async (_name, over, text) => {
    handlers({answer: () => HttpResponse.json({deliveries: [attempt(over)]} as never)});
    const user = userEvent.setup();
    mount();
    await search(user, '+380671234567');
    expect(await screen.findByText(text)).toBeTruthy();
  });

  it('an empty answer says no codes were sent', async () => {
    handlers({answer: () => HttpResponse.json({deliveries: []} as never)});
    const user = userEvent.setup();
    mount();
    await search(user, '+380671234567');
    expect(await screen.findByText('На этот номер коды не отправлялись.')).toBeTruthy();
  });
});

describe('K2: refused', () => {
  it('an empty phone sends nothing', async () => {
    const h = handlers();
    const user = userEvent.setup();
    mount();
    await search(user, '   ');
    expect(await screen.findByText('Введите номер телефона.')).toBeTruthy();
    expect(h.asked).toHaveLength(0);
  });

  it('a 400 says the number was not recognised', async () => {
    handlers({answer: () => HttpResponse.json(problem(400, 'VALIDATION_FAILED'), {status: 400})});
    const user = userEvent.setup();
    mount();
    await search(user, '12');
    expect(await screen.findByText('Номер не распознан.')).toBeTruthy();
  });
});

describe('K3: access', () => {
  it('in the menu with support.manage', async () => {
    handlers();
    mount('/');
    expect(await screen.findByRole('link', {name: 'Доставка кодов'})).toHaveAttribute('href', '/otp-deliveries');
  });

  it('not in the menu without it', async () => {
    handlers({rights: viewer});
    mount('/');
    expect(await screen.findByRole('link', {name: 'Заказы'})).toBeTruthy();
    expect(screen.queryByRole('link', {name: 'Доставка кодов'})).toBeNull();
  });
});
