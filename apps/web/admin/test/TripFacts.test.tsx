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

/** A trip's times, their corrections and the review (#429): T1–T6 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const ORDER = '0d000000-0000-4000-8000-000000000001';
const S2 = 'a2000000-0000-4000-8000-000000000002';
const corrector = {...me, effective_permissions: ['orders.view', 'trips.correct']};
const viewer = {...me, effective_permissions: ['orders.view']};
const facts = (over: Record<string, unknown> = {}) => ({order_id: ORDER, trip_id: 'f0000000-0000-4000-8000-000000000001',
  version: 7, phase: 'COMPLETED', arrived_at: '2026-11-03T09:00:00Z', started_at: '2026-11-03T09:05:00Z',
  completed_at: '2026-11-03T09:40:00Z', corrected_started_at: null, corrected_completed_at: null, start_void: false,
  needs_review: false, capture_held: false, corrections: [], ...over});
const correction = (over: Record<string, unknown> = {}) => ({id: 'c0000000-0000-4000-8000-000000000001',
  kind: 'STARTED_AT', recorded_value: '2026-11-03T09:05:00Z', corrected_value: '2026-11-03T09:03:00Z',
  reason: 'Водитель нажал позже', author_id: S2, created_at: '2026-11-03T10:00:00Z', holds_capture: false,
  reviewed_at: null, reviewed_by: null, released_by_deadline_at: null, ...over});
const corrected = facts({version: 8, corrected_started_at: '2026-11-03T09:03:00Z', needs_review: true,
  corrections: [correction()]});

type Sent = {path: string; body: Record<string, unknown>};

function handlers(opts: {rights?: unknown; facts?: () => Response; correct?: () => Response;
  review?: () => Response} = {}) {
  const sent: Sent[] = [];
  let reads = 0;
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json((opts.rights ?? corrector) as never)),
    http.get(origin + '/api/admin/v1/orders/' + ORDER + '/timeline', () => HttpResponse.json({events: []} as never)),
    http.get(origin + '/api/admin/v1/orders/' + ORDER + '/fare', () => HttpResponse.json(problem(404, 'NOT_FOUND'),
      {status: 404})),
    http.get(origin + '/api/admin/v1/orders/' + ORDER + '/trip-facts', () => {
      reads++;
      return opts.facts ? opts.facts() : HttpResponse.json(facts() as never);
    }),
    http.post(origin + '/api/admin/v1/orders/' + ORDER + '/trip-corrections/review', async ({request}) => {
      sent.push({path: 'review', body: await request.json() as Record<string, unknown>});
      return opts.review ? opts.review() : HttpResponse.json(facts({version: 9, corrected_started_at:
        '2026-11-03T09:03:00Z', corrections: [correction({reviewed_at: '2026-11-03T11:00:00Z', reviewed_by: S2})]}) as
        never);
    }),
    http.post(origin + '/api/admin/v1/orders/' + ORDER + '/trip-corrections', async ({request}) => {
      sent.push({path: 'correct', body: await request.json() as Record<string, unknown>});
      return opts.correct ? opts.correct() : HttpResponse.json(corrected as never);
    }));
  return {sent, reads: () => reads};
}

function mount() {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={['/orders/' + ORDER]}><AdminApp client={api} /></MemoryRouter>);
}

const times = 'Подача 03.11.2026 09:00 UTC · начало 09:05 UTC · завершение 09:40 UTC';
const START = 'Начало (ГГГГ-ММ-ДД ЧЧ:ММ, UTC)';
const END = 'Завершение (ГГГГ-ММ-ДД ЧЧ:ММ, UTC)';

async function correct(user: ReturnType<typeof userEvent.setup>, f: {mistake?: boolean; start?: string; end?: string;
  reason?: string}) {
  await screen.findByText(times);
  if (f.mistake) await user.click(screen.getByLabelText('Начало нажато по ошибке'));
  if (f.start) await user.type(screen.getByLabelText(START), f.start);
  if (f.end) await user.type(screen.getByLabelText(END), f.end);
  if (f.reason) {
    await user.click(screen.getByLabelText('Причина исправления'));
    await user.paste(f.reason);
  }
  await user.click(screen.getByRole('button', {name: 'Исправить время'}));
}

describe('T1: times', () => {
  it('the recorded times', async () => {
    handlers();
    mount();
    expect(await screen.findByText(times)).toBeTruthy();
    expect(screen.queryByText('Нужна проверка')).toBeNull();
    expect(screen.queryByText('Списание с карты ждёт проверки')).toBeNull();
  });

  it('corrections, a voided start, the review and the held capture in words', async () => {
    handlers({facts: () => HttpResponse.json(facts({corrected_started_at: '2026-11-03T09:03:00Z',
      corrected_completed_at: '2026-11-03T09:45:00Z', needs_review: true, capture_held: true, corrections: [
        correction(),
        correction({id: 'c2', kind: 'COMPLETED_AT', recorded_value: '2026-11-03T09:40:00Z',
          corrected_value: '2026-11-03T09:45:00Z', reason: 'Поздно завершил', holds_capture: true,
          reviewed_at: '2026-11-03T11:00:00Z', reviewed_by: S2, released_by_deadline_at: '2026-11-03T10:30:00Z'})]}) as
      never)});
    mount();
    expect(await screen.findByText('Подача 03.11.2026 09:00 UTC · начало 09:05 UTC → исправлено 09:03 UTC · '
      + 'завершение 09:40 UTC → исправлено 09:45 UTC')).toBeTruthy();
    expect(screen.getByText('Нужна проверка')).toBeTruthy();
    expect(screen.getByText('Списание с карты ждёт проверки')).toBeTruthy();
    expect(screen.getByText('начало · 09:05 UTC → 09:03 UTC · Водитель нажал позже · сотрудник a2000000 · '
      + '03.11.2026 10:00 UTC · ждёт проверки')).toBeTruthy();
    expect(screen.getByText('завершение · 09:40 UTC → 09:45 UTC · Поздно завершил · сотрудник a2000000 · '
      + '03.11.2026 10:00 UTC · проверено · списано по сроку')).toBeTruthy();
  });

  it('a voided start', async () => {
    handlers({facts: () => HttpResponse.json(facts({start_void: true, needs_review: true, corrections: [
      correction({kind: 'START_VOID', corrected_value: null, reason: 'Ошибка'})]}) as never)});
    mount();
    expect(await screen.findByText('Подача 03.11.2026 09:00 UTC · начало 09:05 UTC (нажато по ошибке) · '
      + 'завершение 09:40 UTC')).toBeTruthy();
    expect(screen.getByText('начало нажато по ошибке · 09:05 UTC · Ошибка · сотрудник a2000000 · 03.11.2026 10:00 UTC'
      + ' · ждёт проверки')).toBeTruthy();
  });

  it('no trip', async () => {
    handlers({facts: () => HttpResponse.json(problem(404, 'NOT_FOUND'), {status: 404})});
    mount();
    expect(await screen.findByText('Поездки нет.')).toBeTruthy();
  });
});

describe('T2: correct', () => {
  it.each([
    ['a start time', {start: '2026-11-03 09:03'}, {started_at: '2026-11-03T09:03:00Z'}],
    ['a completion time', {end: '2026-11-03 09:45'}, {completed_at: '2026-11-03T09:45:00Z'}],
    ['both times', {start: '2026-11-03 09:03', end: '2026-11-03 09:45'},
      {started_at: '2026-11-03T09:03:00Z', completed_at: '2026-11-03T09:45:00Z'}],
    ['the start by mistake', {mistake: true}, {started_by_mistake: true}],
    ['the start by mistake and a completion', {mistake: true, end: '2026-11-03 09:45'},
      {started_by_mistake: true, completed_at: '2026-11-03T09:45:00Z'}]
  ])('only what was filled: %s', async (_name, f, change) => {
    const h = handlers();
    const user = userEvent.setup();
    mount();
    await correct(user, {...f, reason: 'Водитель нажал позже'});
    await waitFor(() => expect(h.sent).toHaveLength(1));
    expect(h.sent[0]).toEqual({path: 'correct', body: {command_id: expect.any(String), expected_version: 7, ...change,
      reason: 'Водитель нажал позже'}});
    expect(await screen.findByText('Нужна проверка')).toBeTruthy();
    expect((screen.getByLabelText(START) as HTMLInputElement).value).toBe('');
    expect((screen.getByLabelText('Причина исправления') as HTMLInputElement).value).toBe('');
  });
});

describe('T3: refused before sending', () => {
  it.each([
    ['nothing to correct', {reason: 'Причина'}],
    ['checkbox with a start time', {mistake: true, start: '2026-11-03 09:03', reason: 'Причина'}],
    ['a time in another form', {start: '03.11.2026 09:03', reason: 'Причина'}],
    ['a date that does not exist', {end: '2026-02-30 09:45', reason: 'Причина'}],
    ['an empty reason', {start: '2026-11-03 09:03'}],
    ['a reason over 500', {start: '2026-11-03 09:03', reason: 'x'.repeat(501)}]
  ])('%s', async (_name, f) => {
    const h = handlers();
    const user = userEvent.setup();
    mount();
    await correct(user, f);
    expect(await screen.findByText('Нужно исправить начало или завершение (время ГГГГ-ММ-ДД ЧЧ:ММ; «по ошибке» '
      + 'без времени начала) и причина до 500 знаков.')).toBeTruthy();
    expect(h.sent).toHaveLength(0);
  });
});

describe('T4: refused by the server', () => {
  it('a 400 says the time does not fit', async () => {
    handlers({correct: () => HttpResponse.json(problem(400, 'VALIDATION_FAILED'), {status: 400})});
    const user = userEvent.setup();
    mount();
    await correct(user, {end: '2026-11-03 08:00', reason: 'Причина'});
    expect(await screen.findByText('Время не подходит: в будущем, раньше подачи, или завершение раньше начала.'))
      .toBeTruthy();
  });

  it.each(['VERSION_CONFLICT', 'STATE_CONFLICT'])('%s reads the facts again', async code => {
    const h = handlers({correct: () => HttpResponse.json(problem(409, code), {status: 409})});
    const user = userEvent.setup();
    mount();
    await correct(user, {start: '2026-11-03 09:03', reason: 'Причина'});
    expect(await screen.findByText('Поездка изменилась; данные обновлены.')).toBeTruthy();
    await waitFor(() => expect(h.reads()).toBe(2));
  });
});

describe('T5: review', () => {
  it('offered while needs_review, sends the reason, the answer replaces the block', async () => {
    const h = handlers({facts: () => HttpResponse.json(corrected as never)});
    const user = userEvent.setup();
    mount();
    await user.type(await screen.findByLabelText('Причина проверки'), 'Сверил с треком');
    await user.click(screen.getByRole('button', {name: 'Закрыть проверку'}));
    await waitFor(() => expect(h.sent).toHaveLength(1));
    expect(h.sent[0]).toEqual({path: 'review', body: {command_id: expect.any(String), reason: 'Сверил с треком'}});
    await waitFor(() => expect(screen.queryByText('Нужна проверка')).toBeNull());
    expect(screen.queryByRole('button', {name: 'Закрыть проверку'})).toBeNull();
    expect(screen.getByText(/· проверено$/)).toBeTruthy();
  });

  it('not offered without needs_review', async () => {
    handlers();
    mount();
    await screen.findByText(times);
    expect(screen.queryByRole('button', {name: 'Закрыть проверку'})).toBeNull();
  });

  it('no reason sends nothing', async () => {
    const h = handlers({facts: () => HttpResponse.json(corrected as never)});
    const user = userEvent.setup();
    mount();
    await user.click(await screen.findByRole('button', {name: 'Закрыть проверку'}));
    expect(await screen.findByText('Нужна причина проверки до 500 знаков.')).toBeTruthy();
    expect(h.sent).toHaveLength(0);
  });

  it('a 409 reads the facts again', async () => {
    const h = handlers({facts: () => HttpResponse.json(corrected as never),
      review: () => HttpResponse.json(problem(409, 'STATE_CONFLICT'), {status: 409})});
    const user = userEvent.setup();
    mount();
    await user.type(await screen.findByLabelText('Причина проверки'), 'Сверил');
    await user.click(screen.getByRole('button', {name: 'Закрыть проверку'}));
    expect(await screen.findByText('Поездка изменилась; данные обновлены.')).toBeTruthy();
    await waitFor(() => expect(h.reads()).toBe(2));
  });
});

describe('T6: access', () => {
  it('without trips.correct the times only', async () => {
    handlers({rights: viewer, facts: () => HttpResponse.json(corrected as never)});
    mount();
    expect(await screen.findByText('Нужна проверка')).toBeTruthy();
    expect(screen.queryByRole('button', {name: 'Исправить время'})).toBeNull();
    expect(screen.queryByRole('button', {name: 'Закрыть проверку'})).toBeNull();
  });
});
