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

/** Call centre numbers (#407): C1–C6 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const manager = {...me, effective_permissions: ['settings.manage']};
const KYIV = {id: '5a000000-0000-4000-8000-000000000001', name: 'Київ'};
const LVIV = {id: '5a000000-0000-4000-8000-000000000002', name: 'Львів'};
const line = (over: Record<string, unknown> = {}) => ({number: '+380441234567', city_id: KYIV.id,
  label: 'Диспетчерская', version: 3, ...over});

function handlers(opts: {change?: () => Response} = {}) {
  const changes: {path: string; body: Record<string, unknown>}[] = [];
  let reads = 0;
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(manager as never)),
    http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [KYIV, LVIV]})),
    http.get(origin + '/api/admin/v1/call-lines', () => {
      reads++;
      return HttpResponse.json({lines: [line()]} as never);
    }),
    http.post(origin + '/api/admin/v1/call-lines/:number', async ({request}) => {
      const body = await request.json() as Record<string, unknown>;
      const path = new URL(request.url).pathname;
      changes.push({path, body});
      const number = decodeURIComponent(path.split('/').pop()!);
      return opts.change ? opts.change() : HttpResponse.json(line({number, city_id: body.city_id ?? KYIV.id,
        label: body.label ?? null, version: Number(body.expected_version) + 1}) as never);
    }));
  return {changes, reads: () => reads};
}

function mount() {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={['/settings/call-lines']}><AdminApp client={api} /></MemoryRouter>);
}

const row = async (n: string) => (await screen.findByText(new RegExp('^\\' + n + ' · '))).closest('li') as HTMLElement;

async function add(user: ReturnType<typeof userEvent.setup>, over: {number?: string; city?: boolean; label?: string;
  reason?: string} = {}) {
  const number = over.number ?? '+380441234568';
  if (number) await user.type(screen.getByLabelText('Новый номер'), number);
  if (over.city !== false) await user.selectOptions(screen.getByLabelText('Город нового номера'), LVIV.id);
  const label = over.label ?? 'Львів диспетчер';
  if (label) {
    await user.click(screen.getByLabelText('Подпись номера'));
    await user.paste(label);
  }
  const reason = over.reason ?? 'Новый офис';
  if (reason) await user.type(screen.getByLabelText('Причина нового номера'), reason);
  await user.click(screen.getByRole('button', {name: 'Добавить номер'}));
}

describe('C1: the list', () => {
  it('number, city, label', async () => {
    handlers();
    mount();
    expect(await screen.findByText('+380441234567 · Київ · Диспетчерская')).toBeVisible();
  });

  it('is linked from the settings', async () => {
    handlers();
    const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
      correlationId: () => cid, initialSession: session});
    render(<MemoryRouter initialEntries={['/settings']}><AdminApp client={api} /></MemoryRouter>);
    expect(await screen.findByRole('link', {name: 'Номера колл-центра'})).toHaveAttribute('href', '/settings/call-lines');
  });
});

describe('C2: add', () => {
  it('version 0, the plus encoded in the path', async () => {
    const {changes} = handlers();
    mount();
    const user = userEvent.setup();
    await row('+380441234567');
    await add(user);
    expect(await screen.findByText('+380441234568 · Львів · Львів диспетчер')).toBeVisible();
    expect(changes).toEqual([{path: '/api/admin/v1/call-lines/%2B380441234568', body: {command_id: expect.any(String),
      expected_version: 0, city_id: LVIV.id, label: 'Львів диспетчер', reason: 'Новый офис'}}]);
  });
});

describe('C3: move', () => {
  it('another city with the version', async () => {
    const {changes} = handlers();
    mount();
    const user = userEvent.setup();
    const r = await row('+380441234567');
    await user.selectOptions(within(r).getByLabelText('Новый город номера'), LVIV.id);
    await user.type(within(r).getByLabelText('Причина для номера'), 'Переезд');
    await user.click(within(r).getByRole('button', {name: 'Перенести'}));
    expect(await screen.findByText('+380441234567 · Львів · Диспетчерская')).toBeVisible();
    expect(changes[0]).toEqual({path: '/api/admin/v1/call-lines/%2B380441234567', body: {command_id: expect.any(String),
      expected_version: 3, city_id: LVIV.id, label: 'Диспетчерская', reason: 'Переезд'}});
  });
});

describe('C4: remove', () => {
  it('city null with the version; the row goes', async () => {
    const {changes} = handlers();
    mount();
    const user = userEvent.setup();
    const r = await row('+380441234567');
    await user.type(within(r).getByLabelText('Причина для номера'), 'Отключили');
    await user.click(within(r).getByRole('button', {name: 'Убрать номер'}));
    await waitFor(() => expect(screen.queryByText(/^\+380441234567 · /)).toBeNull());
    expect(changes[0]!.body).toEqual({command_id: expect.any(String), expected_version: 3, city_id: null,
      reason: 'Отключили'});
  });
});

describe('C5: refused on the screen', () => {
  it.each([['a number without the plus', {number: '380441234568'}], ['no city', {city: false}],
    ['a label over 80', {label: 'x'.repeat(81)}], ['no reason', {reason: ''}],
    ['a number already listed', {number: '+380441234567'}]])('%s sends nothing', async (_name, over) => {
    const {changes} = handlers();
    mount();
    const user = userEvent.setup();
    await row('+380441234567');
    await add(user, over);
    expect(await screen.findByText(/^Нужны номер вида \+380441234567/)).toBeVisible();
    expect(changes).toEqual([]);
  });

  it('moving without a reason sends nothing', async () => {
    const {changes} = handlers();
    mount();
    const user = userEvent.setup();
    const r = await row('+380441234567');
    await user.selectOptions(within(r).getByLabelText('Новый город номера'), LVIV.id);
    await user.click(within(r).getByRole('button', {name: 'Перенести'}));
    expect(await screen.findByText('Нужна причина до 500 символов.')).toBeVisible();
    expect(changes).toEqual([]);
  });
});

describe('C6: conflict', () => {
  it('is told and the list read again', async () => {
    const {reads} = handlers({change: () => HttpResponse.json(problem(409, 'VERSION_CONFLICT'), {status: 409})});
    mount();
    const user = userEvent.setup();
    const r = await row('+380441234567');
    await user.type(within(r).getByLabelText('Причина для номера'), 'r');
    await user.click(within(r).getByRole('button', {name: 'Убрать номер'}));
    expect(await screen.findByText('Номер изменил кто-то другой; список обновлён.')).toBeVisible();
    await waitFor(() => expect(reads()).toBe(2));
  });
});
