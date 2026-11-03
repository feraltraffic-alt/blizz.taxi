import {afterAll, afterEach, beforeAll, describe, expect, it} from 'vitest';
import {render, screen, waitFor} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {http, HttpResponse, delay} from 'msw';
import {setupServer} from 'msw/node';
import {createApiClient} from '@blizz/api-client';
import {browserRefreshTokens} from '@blizz/web-ui';
import {OperatorApp} from '../src/App.js';
import {cid, me, problem, session} from '../../../../test/fixtures.js';

/** My day and the operators of a city (#349): Y1–Y4 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear();});
afterAll(() => server.close());

const KYIV = {id: '5a000000-0000-4000-8000-000000000001', code: 'kyiv', name: 'Київ', currency: 'UAH',
  timezone: 'Europe/Kyiv', working_hours: [], payment_methods: ['CASH'], orders_paused: false,
  center: {lat: 50.45, lon: 30.52}};
const two = (n: number) => String(n).padStart(2, '0');
const dm = (iso: string) => {
  const d = new Date(iso);
  return two(d.getDate()) + '.' + two(d.getMonth() + 1);
};
const dmhm = (iso: string) => {
  const d = new Date(iso);
  return dm(iso) + ' ' + two(d.getHours()) + ':' + two(d.getMinutes());
};
const grant = (active: boolean, over: Record<string, unknown> = {}) => ({id: active ? 'g1' : 'g0', staff_id: me.member.id,
  permissions: ['orders.view', 'orders.cancel'], all_cities: true, city_ids: [], reason: 'Ночная смена',
  granted_by: 'x', granted_at: '2026-11-02T20:00:00Z', expires_at: '2026-11-03T06:00:00Z', revoked_at: null,
  revoked_by: null, revoke_reason: null, active, ...over});

function handlers(opts: {rights?: string[]; bonus?: () => Response; grants?: unknown[]; operators?: unknown[]} = {}) {
  const asked = {operators: [] as URLSearchParams[]};
  server.use(
    http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [KYIV]})),
    http.get(origin + '/api/operator/v1/me', () => HttpResponse.json({...me,
      effective_permissions: opts.rights ?? ['orders.create']} as never)),
    http.get(origin + '/api/operator/v1/vehicle-classes', () => HttpResponse.json([])),
    http.get(origin + '/api/operator/v1/me/bonus', () => opts.bonus ? opts.bonus() : HttpResponse.json({
      staff_id: me.member.id, balance: 120, fulfilled_count: 30, cancelled_count: 2,
      period_started_at: '2026-11-01T00:00:00Z', last_entries: []})),
    http.get(origin + '/api/operator/v1/me/emergency-grants', () =>
      HttpResponse.json({grants: opts.grants ?? []} as never)),
    http.get(origin + '/api/operator/v1/operators', ({request}) => {
      asked.operators.push(new URL(request.url).searchParams);
      return HttpResponse.json({operators: opts.operators ?? [{staff_id: 's1', name: 'Анна Коваль',
        status: 'AVAILABLE', changed_at: null, extension: '101'}]} as never);
    }));
  return asked;
}

async function openDay(pollMs = 60_000) {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage, 'test'),
    correlationId: () => cid, initialSession: session});
  render(<OperatorApp client={api} pollMs={pollMs} />);
  const user = userEvent.setup();
  await user.click(await screen.findByRole('button', {name: 'Мой день'}));
  return user;
}

describe('Y1: points', () => {
  it('shows the points of the period', async () => {
    handlers();
    await openDay();
    expect(await screen.findByText('Баллы: 120 (выполнено 30, отменено 2) с ' + dm('2026-11-01T00:00:00Z')))
      .toBeVisible();
  });

  it('a failed read hides the line', async () => {
    handlers({bonus: () => HttpResponse.json(problem(503, 'UNAVAILABLE'), {status: 503})});
    await openDay();
    expect(await screen.findByText('Экстренного доступа нет.')).toBeVisible();
    expect(screen.queryByText(/Баллы:/)).not.toBeInTheDocument();
  });
});

describe('Y2: emergency access', () => {
  it('lists the active grants only', async () => {
    handlers({grants: [grant(true), grant(false, {reason: 'Старый'})]});
    await openDay();
    expect(await screen.findByText('Экстренный доступ до ' + dmhm('2026-11-03T06:00:00Z')
      + ': orders.view, orders.cancel — Ночная смена')).toBeVisible();
    expect(screen.queryByText(/Старый/)).not.toBeInTheDocument();
  });

  it('says when there is none', async () => {
    handlers({grants: [grant(false)]});
    await openDay();
    expect(await screen.findByText('Экстренного доступа нет.')).toBeVisible();
  });
});

describe('Y3: the supervisor', () => {
  it('lists the operators of the city and reads them again', async () => {
    const asked = handlers({rights: ['orders.create', 'calls.supervise']});
    await openDay(60);
    expect(await screen.findByText('Анна Коваль · доступен · вн. 101')).toBeVisible();
    expect(asked.operators[0]!.get('city_id')).toBe(KYIV.id);
    await waitFor(() => expect(asked.operators.length).toBeGreaterThanOrEqual(3));
  });

  it('without the right: no section and no request', async () => {
    const asked = handlers();
    await openDay(60);
    await screen.findByText('Экстренного доступа нет.');
    await delay(150);
    expect(screen.queryByText('Операторы города')).not.toBeInTheDocument();
    expect(asked.operators).toEqual([]);
  });
});

describe('Y4: no operators', () => {
  it('says so', async () => {
    handlers({rights: ['orders.create', 'calls.supervise'], operators: []});
    await openDay();
    expect(await screen.findByText('Операторов нет.')).toBeVisible();
  });
});
