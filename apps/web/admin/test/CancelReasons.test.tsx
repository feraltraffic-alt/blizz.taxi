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

/** Cancellation reasons (#385): C1–C6 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const manager = {...me, effective_permissions: ['settings.manage']};
const reason = (n: number, over: Record<string, unknown> = {}) => ({id: 'c000000' + n + '-0000-4000-8000-000000000001',
  audience: 'RIDER', code: 'CHANGED_MIND', labels: {uk: 'Передумав', ru: 'Передумал'}, driver_outcome: null,
  active: true, sort_order: 10, version: 2, ...over});
const catalog = () => [
  reason(1),
  reason(2, {code: 'WAIT_TOO_LONG', labels: {uk: 'Довго чекати'}, sort_order: 5, active: false}),
  reason(3, {audience: 'DRIVER', code: 'CAR_BROKE', labels: {uk: 'Зламалася машина'}, driver_outcome: 'RETURN_TO_SEARCH'}),
  reason(4, {audience: 'STAFF', code: 'OPERATOR_ERROR', labels: {uk: 'Помилка оператора'}, operator_fault: true})];

function handlers(opts: {create?: () => Response; update?: (body: Record<string, unknown>) => Response | Promise<Response>;
  list?: () => unknown[]} = {}) {
  const creates: Record<string, unknown>[] = [];
  const updates: {id: string; body: Record<string, unknown>}[] = [];
  let reads = 0;
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(manager as never)),
    http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [],
      languages: {default_language: 'uk', enabled: ['uk', 'ru']}})),
    http.get(origin + '/api/admin/v1/settings/cancel-reasons', () => {
      reads++;
      return HttpResponse.json({reasons: opts.list ? opts.list() : catalog()} as never);
    }),
    http.post(origin + '/api/admin/v1/settings/cancel-reasons', async ({request}) => {
      const body = await request.json() as Record<string, unknown>;
      creates.push(body);
      return opts.create ? opts.create() : HttpResponse.json(reason(9, {...body, version: 0}) as never, {status: 201});
    }),
    http.post(origin + '/api/admin/v1/settings/cancel-reasons/:id', async ({request, params}) => {
      const body = await request.json() as Record<string, unknown>;
      updates.push({id: String(params.id), body});
      return opts.update ? opts.update(body) : HttpResponse.json(reason(1, {labels: body.labels,
        active: body.active, sort_order: body.sort_order, version: 3}) as never);
    }));
  return {creates, updates, reads: () => reads};
}

function mount() {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={['/settings/cancel-reasons']}><AdminApp client={api} /></MemoryRouter>);
}

async function open() {
  mount();
  const user = userEvent.setup();
  await screen.findByText(/^CHANGED_MIND · /);
  return user;
}

async function fill(user: ReturnType<typeof userEvent.setup>, over: {side?: string; code?: string; uk?: string;
  outcome?: string; order?: string; reason?: string} = {}) {
  await user.selectOptions(screen.getByLabelText('Сторона'), over.side ?? 'RIDER');
  if (over.code !== '') await user.type(screen.getByLabelText('Код'), over.code ?? 'NO_CAR');
  const uk = over.uk ?? 'Немає авто';
  if (uk) {
    await user.click(screen.getByLabelText('Текст (uk)'));
    await user.paste(uk);
  }
  if (over.outcome) await user.selectOptions(screen.getByLabelText('Что делает причина водителя'), over.outcome);
  if (over.order !== undefined) {
    await user.clear(screen.getByLabelText('Порядок'));
    if (over.order) await user.type(screen.getByLabelText('Порядок'), over.order);
  }
  const why = over.reason ?? 'Новая причина';
  if (why) {
    await user.click(screen.getByLabelText('Причина изменения списка'));
    await user.paste(why);
  }
  await user.click(screen.getByRole('button', {name: 'Добавить причину'}));
}

describe('C1: the list', () => {
  it('by side and order, with state, outcome and fault', async () => {
    handlers();
    await open();
    const rider = screen.getAllByText(/^(CHANGED_MIND|WAIT_TOO_LONG) · /).map(e => e.textContent);
    expect(rider).toEqual(['WAIT_TOO_LONG · Довго чекати · скрыта · порядок 5',
      'CHANGED_MIND · Передумав · активна · порядок 10']);
    expect(screen.getByText('CAR_BROKE · Зламалася машина · активна · порядок 10 · → снова в поиск')).toBeVisible();
    expect(screen.getByText('OPERATOR_ERROR · Помилка оператора · активна · порядок 10 · по вине оператора'))
      .toBeVisible();
  });

  it('is linked from the settings', async () => {
    handlers();
    const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
      correlationId: () => cid, initialSession: session});
    render(<MemoryRouter initialEntries={['/settings']}><AdminApp client={api} /></MemoryRouter>);
    expect(await screen.findByRole('link', {name: 'Причины отмены'})).toHaveAttribute('href', '/settings/cancel-reasons');
  });
});

describe('C2: add', () => {
  it('a rider reason: no outcome, no fault; empty labels left out', async () => {
    const {creates} = handlers();
    const user = await open();
    await fill(user);
    expect(await screen.findByText(/^NO_CAR · Немає авто/)).toBeVisible();
    expect(creates).toEqual([{command_id: expect.any(String), audience: 'RIDER', code: 'NO_CAR',
      labels: {uk: 'Немає авто'}, active: true, sort_order: 0, reason: 'Новая причина'}]);
  });

  it('a driver reason carries its outcome', async () => {
    const {creates} = handlers();
    const user = await open();
    await fill(user, {side: 'DRIVER', outcome: 'CANCEL_ORDER'});
    await waitFor(() => expect(creates).toHaveLength(1));
    expect(creates[0]).toMatchObject({audience: 'DRIVER', driver_outcome: 'CANCEL_ORDER'});
    expect('operator_fault' in creates[0]!).toBe(false);
  });

  it('a staff reason carries the operator fault', async () => {
    const {creates} = handlers();
    const user = await open();
    await user.selectOptions(screen.getByLabelText('Сторона'), 'STAFF');
    await user.click(screen.getByRole('checkbox', {name: 'По вине оператора'}));
    await fill(user, {side: 'STAFF'});
    await waitFor(() => expect(creates).toHaveLength(1));
    expect(creates[0]).toMatchObject({audience: 'STAFF', operator_fault: true});
    expect('driver_outcome' in creates[0]!).toBe(false);
  });
});

describe('C3: change', () => {
  it('labels, activity and order with the version read', async () => {
    const {updates} = handlers();
    const user = await open();
    await user.click(screen.getByRole('button', {name: 'Изменить: CHANGED_MIND'}));
    const uk = screen.getByLabelText('Текст CHANGED_MIND (uk)');
    expect(uk).toHaveValue('Передумав');
    await user.clear(uk);
    await user.type(uk, 'Передумав їхати');
    await user.click(screen.getByRole('checkbox', {name: 'Активна: CHANGED_MIND'}));
    await user.type(screen.getByLabelText('Причина изменения: CHANGED_MIND'), 'Уточнили');
    await user.click(screen.getByRole('button', {name: 'Сохранить: CHANGED_MIND'}));
    expect(await screen.findByText('CHANGED_MIND · Передумав їхати · скрыта · порядок 10')).toBeVisible();
    expect(updates).toEqual([{id: reason(1).id, body: {command_id: expect.any(String), expected_version: 2,
      labels: {uk: 'Передумав їхати', ru: 'Передумал'}, active: false, sort_order: 10, reason: 'Уточнили'}}]);
  });
});

describe('C4: refused on the screen', () => {
  it.each([
    ['a lower-case code', {code: 'no_car'}], ['a one-letter code', {code: 'N'}], ['no code', {code: ''}],
    ['no default-language label', {uk: ''}], ['a label over 80', {uk: 'x'.repeat(81)}],
    ['a driver reason without an outcome', {side: 'DRIVER'}], ['an order over 10000', {order: '10001'}],
    ['an order with letters', {order: '1a'}], ['no reason', {reason: ''}], ['a reason over 500', {reason: 'x'.repeat(501)}]
  ])('%s sends nothing', async (_name, over) => {
    const {creates} = handlers();
    const user = await open();
    await fill(user, over);
    expect(await screen.findByText(/^Код — заглавные латинские буквы/)).toBeVisible();
    expect(creates).toEqual([]);
  });
});

describe('C5: server refusals', () => {
  it('a 409 on adding says the code is taken', async () => {
    handlers({create: () => HttpResponse.json(problem(409, 'CONFLICT'), {status: 409})});
    const user = await open();
    await fill(user);
    expect(await screen.findByText('Такой код у этой стороны уже есть.')).toBeVisible();
  });

  it('a 409 on changing reads the list again', async () => {
    const {reads} = handlers({update: () => HttpResponse.json(problem(409, 'VERSION_CONFLICT'), {status: 409})});
    const user = await open();
    await user.click(screen.getByRole('button', {name: 'Изменить: CHANGED_MIND'}));
    await user.type(screen.getByLabelText('Причина изменения: CHANGED_MIND'), 'r');
    await user.click(screen.getByRole('button', {name: 'Сохранить: CHANGED_MIND'}));
    expect(await screen.findByText('Причину изменил кто-то другой; список обновлён.')).toBeVisible();
    await waitFor(() => expect(reads()).toBe(2));
  });
});

describe('C6: one at a time', () => {
  it('a double click adds once', async () => {
    const {creates} = handlers({create: () => HttpResponse.json(reason(9, {code: 'NO_CAR'}) as never, {status: 201})});
    const user = await open();
    await user.selectOptions(screen.getByLabelText('Сторона'), 'RIDER');
    await user.type(screen.getByLabelText('Код'), 'NO_CAR');
    await user.type(screen.getByLabelText('Текст (uk)'), 'Немає авто');
    await user.type(screen.getByLabelText('Причина изменения списка'), 'r');
    server.use(http.post(origin + '/api/admin/v1/settings/cancel-reasons', async ({request}) => {
      creates.push(await request.json() as Record<string, unknown>);
      await delay(100);
      return HttpResponse.json(reason(9, {code: 'NO_CAR'}) as never, {status: 201});
    }));
    await user.dblClick(screen.getByRole('button', {name: 'Добавить причину'}));
    expect(await screen.findByText('Причина добавлена.')).toBeVisible();
    expect(creates).toHaveLength(1);
  });
});
