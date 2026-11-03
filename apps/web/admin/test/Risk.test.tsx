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

/** Driver risk flags (#405): R1–R5 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const analyst = {...me, effective_permissions: ['drivers.risk']};
const KYIV = {id: '5a000000-0000-4000-8000-000000000001', name: 'Київ'};
const DRIVER = 'd0000000-0000-4000-8000-000000000001';
const F1 = 'f0000000-0000-4000-8000-0000000000f1';
const flag = (over: Record<string, unknown> = {}) => ({id: F1, driver_id: DRIVER, city_id: KYIV.id,
  kind: 'IMPOSSIBLE_MOVEMENT', state: 'OPEN', evidence: {distance_m: 4200, seconds: 48, speed_kph: 312},
  raised_by: null, raised_at: '2026-11-03T05:10:00Z', reason: null, reviewed_by: null, reviewed_at: null,
  review_reason: null, version: 1, ...over});

function handlers(opts: {list?: (q: URLSearchParams) => unknown; review?: () => Response} = {}) {
  const lists: URLSearchParams[] = [];
  const reviews: {action: string; body: Record<string, unknown>}[] = [];
  const raises: Record<string, unknown>[] = [];
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(analyst as never)),
    http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [KYIV]})),
    http.get(origin + '/api/admin/v1/driver-risk-flags', ({request}) => {
      const q = new URL(request.url).searchParams;
      lists.push(q);
      return HttpResponse.json((opts.list ? opts.list(q) : {flags: [flag(), flag({id: 'f2', kind: 'DUPLICATE_DOCUMENT',
        city_id: null, evidence: {document_id: 'x', other_driver_id: 'y', other_document_id: 'z'},
        raised_at: '2026-11-02T09:00:00Z'})], page: {next_cursor: null, has_more: false}}) as never);
    }),
    http.post(origin + '/api/admin/v1/driver-risk-flags', async ({request}) => {
      const body = await request.json() as Record<string, unknown>;
      raises.push(body);
      return HttpResponse.json(flag({id: 'f9', kind: 'MANUAL', reason: body.reason, evidence: {}}) as never,
        {status: 201});
    }),
    http.post(origin + '/api/admin/v1/driver-risk-flags/' + F1 + '/:action', async ({request, params}) => {
      const body = await request.json() as Record<string, unknown>;
      reviews.push({action: String(params.action), body});
      return opts.review ? opts.review() : HttpResponse.json(flag({state: params.action === 'confirm' ? 'CONFIRMED'
        : 'DISMISSED', review_reason: body.reason, version: 2}) as never);
    }));
  return {lists, reviews, raises};
}

function mount() {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={['/risk']}><AdminApp client={api} /></MemoryRouter>);
}

const first = async () => (await screen.findByText(/^Невозможное перемещение · /)).closest('li') as HTMLElement;

describe('R1: the list', () => {
  it('open by default, the evidence in words, the driver linked', async () => {
    const {lists} = handlers();
    mount();
    const r = await first();
    expect(within(r).getByText('Невозможное перемещение · открыт · 03.11.2026 05:10 UTC · 312 км/ч: 4200 м за 48 с'))
      .toBeVisible();
    expect(within(r).getByRole('link', {name: 'Водитель'})).toHaveAttribute('href', '/drivers/' + DRIVER);
    expect(screen.getByText('Тот же документ · открыт · 02.11.2026 09:00 UTC · тот же файл, что у другого водителя'))
      .toBeVisible();
    expect([...lists[0]!.entries()]).toEqual([['state', 'OPEN']]);
  });

  it('filters sent when chosen; "more" keeps them and adds the cursor', async () => {
    const {lists} = handlers({list: q => q.get('cursor') ? {flags: [], page: {next_cursor: null, has_more: false}}
      : {flags: [flag()], page: {next_cursor: 'p2', has_more: true}}});
    mount();
    const user = userEvent.setup();
    await first();
    await user.selectOptions(screen.getByLabelText('Состояние флага'), 'CONFIRMED');
    await user.selectOptions(screen.getByLabelText('Город флага'), KYIV.id);
    await waitFor(() => expect(lists).toHaveLength(3));
    await user.click(await screen.findByRole('button', {name: 'Ещё флаги'}));
    await waitFor(() => expect(lists).toHaveLength(4));
    expect([...lists[3]!.entries()]).toEqual([['state', 'CONFIRMED'], ['city_id', KYIV.id], ['cursor', 'p2']]);
  });
});

describe('R2: review', () => {
  it('confirm with a reason and the version; says the driver is not suspended by it', async () => {
    const {reviews} = handlers();
    mount();
    const user = userEvent.setup();
    const r = await first();
    await user.type(within(r).getByLabelText('Причина решения по флагу'), 'Подмена GPS');
    await user.click(within(r).getByRole('button', {name: 'Подтвердить'}));
    expect(await screen.findByText(/^Невозможное перемещение · подтверждён/)).toBeVisible();
    expect(screen.getByText('Флаг подтверждён. Водитель от этого не приостановлен — сделайте это в его карточке.'))
      .toBeVisible();
    expect(reviews).toEqual([{action: 'confirm', body: {command_id: expect.any(String), expected_version: 1,
      reason: 'Подмена GPS'}}]);
  });

  it('dismiss', async () => {
    const {reviews} = handlers();
    mount();
    const user = userEvent.setup();
    const r = await first();
    await user.type(within(r).getByLabelText('Причина решения по флагу'), 'Туннель');
    await user.click(within(r).getByRole('button', {name: 'Отклонить'}));
    expect(await screen.findByText(/^Невозможное перемещение · отклонён/)).toBeVisible();
    expect(reviews.map(x => x.action)).toEqual(['dismiss']);
  });
});

describe('R3: raise', () => {
  it('a driver id, a city and a reason; the new flag first', async () => {
    const {raises} = handlers();
    mount();
    const user = userEvent.setup();
    await first();
    await user.type(screen.getByLabelText('Идентификатор водителя'), DRIVER);
    await user.selectOptions(screen.getByLabelText('Город нового флага'), KYIV.id);
    await user.type(screen.getByLabelText('Почему поднят флаг'), 'Жалоба пассажира');
    await user.click(screen.getByRole('button', {name: 'Поднять флаг'}));
    expect(await screen.findByText(/^Вручную · открыт · .* · Жалоба пассажира$/)).toBeVisible();
    expect(raises).toEqual([{command_id: expect.any(String), driver_id: DRIVER, city_id: KYIV.id,
      reason: 'Жалоба пассажира'}]);
  });
});

describe('R4: refused on the screen', () => {
  it.each([['no reason', DRIVER, true, ''], ['a reason over 1000', DRIVER, true, 'x'.repeat(1001)],
    ['a driver id that is not a UUID', 'd0000000', true, 'r'], ['no city', DRIVER, false, 'r']])(
    'raising with %s sends nothing', async (_name, driver, city, why) => {
      const {raises} = handlers();
      mount();
      const user = userEvent.setup();
      await first();
      await user.type(screen.getByLabelText('Идентификатор водителя'), driver);
      if (city) await user.selectOptions(screen.getByLabelText('Город нового флага'), KYIV.id);
      if (why) {
        await user.click(screen.getByLabelText('Почему поднят флаг'));
        await user.paste(why);
      }
      await user.click(screen.getByRole('button', {name: 'Поднять флаг'}));
      expect(await screen.findByText(/^Нужны идентификатор водителя/)).toBeVisible();
      expect(raises).toEqual([]);
    });

  it('a review without a reason sends nothing', async () => {
    const {reviews} = handlers();
    mount();
    const user = userEvent.setup();
    await user.click(within(await first()).getByRole('button', {name: 'Подтвердить'}));
    expect(await screen.findByText('Нужна причина до 1000 символов.')).toBeVisible();
    expect(reviews).toEqual([]);
  });
});

describe('R5: conflict', () => {
  it('is told and the list read again', async () => {
    const {lists} = handlers({review: () => HttpResponse.json(problem(409, 'STATE_CONFLICT'), {status: 409})});
    mount();
    const user = userEvent.setup();
    const r = await first();
    await user.type(within(r).getByLabelText('Причина решения по флагу'), 'r');
    await user.click(within(r).getByRole('button', {name: 'Подтвердить'}));
    expect(await screen.findByText('Флаг уже рассмотрел кто-то другой; список обновлён.')).toBeVisible();
    await waitFor(() => expect(lists).toHaveLength(2));
  });
});
