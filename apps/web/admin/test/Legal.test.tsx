import {afterAll, afterEach, beforeAll, describe, expect, it, vi} from 'vitest';
import {render, screen, waitFor, within} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {MemoryRouter} from 'react-router-dom';
import {http, HttpResponse, delay} from 'msw';
import {setupServer} from 'msw/node';
import {createApiClient} from '@blizz/api-client';
import {AdminApp} from '../src/App.js';
import {browserRefreshTokens} from '../src/storage.js';
import {cid, me, problem, session} from '../../../../test/fixtures.js';

/** Legal texts (#388): L1–L7 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const lawyer = {...me, effective_permissions: ['legal.manage']};
const DRAFT = '1e000000-0000-4000-8000-000000000002';
const version = (over: Record<string, unknown> = {}) => ({id: '1e000000-0000-4000-8000-000000000001',
  audience: 'RIDER', kind: 'TERMS', number: 1, state: 'PUBLISHED', texts: {uk: 'Умови', ru: 'Условия'},
  acceptance_required: true, effective_from: '2026-10-01T00:00:00Z', published_at: '2026-10-01T00:00:00Z',
  version: 1, ...over});
const draft = version({id: DRAFT, number: 2, state: 'DRAFT', texts: {uk: 'Нові умови'}, acceptance_required: false,
  effective_from: '2026-11-10T09:00:00Z', published_at: null, version: 0});

function handlers(opts: {publish?: () => Response | Promise<Response>; update?: () => Response} = {}) {
  const lists: URLSearchParams[] = [];
  const creates: Record<string, unknown>[] = [];
  const updates: Record<string, unknown>[] = [];
  const publishes: Record<string, unknown>[] = [];
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(lawyer as never)),
    http.get(origin + '/api/admin/v1/legal-documents', ({request}) => {
      lists.push(new URL(request.url).searchParams);
      return HttpResponse.json({versions: [draft, version()]} as never);
    }),
    http.post(origin + '/api/admin/v1/legal-documents', async ({request}) => {
      const body = await request.json() as Record<string, unknown>;
      creates.push(body);
      return HttpResponse.json(version({...body, id: '1e000000-0000-4000-8000-000000000009', number: 3,
        state: 'DRAFT', published_at: null, version: 0}) as never, {status: 201});
    }),
    http.post(origin + '/api/admin/v1/legal-documents/' + DRAFT, async ({request}) => {
      const body = await request.json() as Record<string, unknown>;
      updates.push(body);
      return opts.update ? opts.update() : HttpResponse.json({...draft, texts: body.texts,
        acceptance_required: body.acceptance_required, effective_from: body.effective_from, version: 1} as never);
    }),
    http.post(origin + '/api/admin/v1/legal-documents/' + DRAFT + '/publish', async ({request}) => {
      publishes.push(await request.json() as Record<string, unknown>);
      return opts.publish ? opts.publish() : HttpResponse.json({...draft, state: 'PUBLISHED',
        published_at: '2026-11-03T04:00:00Z', version: 1} as never);
    }));
  return {lists, creates, updates, publishes};
}

function mount() {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={['/legal']}><AdminApp client={api} /></MemoryRouter>);
}

const row = async (n: number) => (await screen.findByText(new RegExp('^№ ' + n + ' · '))).closest('li') as HTMLElement;

async function create(user: ReturnType<typeof userEvent.setup>, over: {audience?: string; kind?: string;
  uk?: string; ru?: string; from?: string; accept?: boolean} = {}) {
  await user.selectOptions(screen.getByLabelText('Для кого'), over.audience ?? 'RIDER');
  await user.selectOptions(screen.getByLabelText('Документ'), over.kind ?? 'TERMS');
  if (over.uk !== '') {
    await user.click(screen.getByLabelText('Текст (uk)'));
    await user.paste(over.uk ?? 'Умови користування');
  }
  if (over.ru) {
    await user.click(screen.getByLabelText('Текст (ru)'));
    await user.paste(over.ru);
  }
  if (over.accept) await user.click(screen.getByRole('checkbox', {name: 'Нужно принять'}));
  const from = screen.getByLabelText('Действует с (UTC), ГГГГ-ММ-ДД ЧЧ:ММ');
  await user.clear(from);
  if (over.from !== '') await user.type(from, over.from ?? '2026-11-10 09:00');
  await user.click(screen.getByRole('button', {name: 'Создать черновик'}));
}

describe('L1: the list', () => {
  it('versions with state, date, languages and acceptance; filters sent when chosen', async () => {
    const {lists} = handlers();
    mount();
    const user = userEvent.setup();
    expect(await screen.findByText('№ 1 · опубликован · с 01.10.2026 00:00 UTC · языки: uk, ru · нужно принять'))
      .toBeVisible();
    expect(screen.getByText('№ 2 · черновик · с 10.11.2026 09:00 UTC · языки: uk · принимать не нужно')).toBeVisible();
    await user.selectOptions(screen.getByLabelText('Показать для'), 'DRIVER');
    await user.selectOptions(screen.getByLabelText('Показать документ'), 'DRIVER_AGREEMENT');
    await waitFor(() => expect(lists).toHaveLength(3));
    expect([...lists[0]!.entries()]).toEqual([]);
    expect([...lists[2]!.entries()]).toEqual([['audience', 'DRIVER'], ['kind', 'DRIVER_AGREEMENT']]);
  });
});

describe('L2: a new draft', () => {
  it('texts per language, acceptance and the date as UTC', async () => {
    const {creates} = handlers();
    mount();
    const user = userEvent.setup();
    await row(1);
    await create(user, {ru: 'Условия пользования', accept: true});
    expect(await screen.findByText(/^№ 3 · черновик/)).toBeVisible();
    expect(creates).toEqual([{command_id: expect.any(String), audience: 'RIDER', kind: 'TERMS',
      texts: {uk: 'Умови користування', ru: 'Условия пользования'}, acceptance_required: true,
      effective_from: '2026-11-10T09:00:00Z'}]);
  });

  it('the driver agreement is offered for drivers only', async () => {
    handlers();
    mount();
    const user = userEvent.setup();
    await row(1);
    const kind = screen.getByLabelText('Документ');
    expect(within(kind).queryByRole('option', {name: 'Договор водителя'})).toBeNull();
    await user.selectOptions(screen.getByLabelText('Для кого'), 'DRIVER');
    expect(within(kind).getByRole('option', {name: 'Договор водителя'})).toBeVisible();
  });
});

describe('L3: change a draft', () => {
  it('fills the form and sends the version read', async () => {
    const {updates} = handlers();
    mount();
    const user = userEvent.setup();
    await user.click(within(await row(2)).getByRole('button', {name: 'Изменить'}));
    const uk = screen.getByLabelText('Текст (uk)');
    expect(uk).toHaveValue('Нові умови');
    expect(screen.getByLabelText('Действует с (UTC), ГГГГ-ММ-ДД ЧЧ:ММ')).toHaveValue('2026-11-10 09:00');
    await user.type(uk, '!');
    await user.click(screen.getByRole('button', {name: 'Сохранить черновик'}));
    await waitFor(() => expect(updates).toHaveLength(1));
    expect(updates[0]).toEqual({command_id: expect.any(String), expected_version: 0, texts: {uk: 'Нові умови!'},
      acceptance_required: false, effective_from: '2026-11-10T09:00:00Z'});
  });
});

describe('L4: publish', () => {
  it('after the tick; the row follows the answer', async () => {
    const {publishes} = handlers();
    mount();
    const user = userEvent.setup();
    const r = await row(2);
    await user.click(within(r).getByRole('checkbox', {name: 'Понимаю: опубликованный текст не меняется'}));
    await user.click(within(r).getByRole('button', {name: 'Опубликовать'}));
    expect(await screen.findByText(/^№ 2 · опубликован/)).toBeVisible();
    expect(publishes).toEqual([{command_id: expect.any(String), expected_version: 0}]);
  });

  it('a draft that must be accepted warns what it blocks', async () => {
    handlers();
    mount();
    const user = userEvent.setup();
    await user.click(within(await row(2)).getByRole('button', {name: 'Изменить'}));
    await user.click(screen.getByRole('checkbox', {name: 'Нужно принять'}));
    expect(screen.getByText('Пока текст не принят, пассажиры не смогут заказать, а водители — выйти на линию.'))
      .toBeVisible();
  });
});

describe('L5: refused on the screen', () => {
  it.each([
    ['no text', {uk: ''}], ['a text over 200 000', {uk: 'x'.repeat(200001)}], ['no date', {from: ''}],
    ['a bad date', {from: '2026-13-10 09:00'}], ['a date without the time', {from: '2026-11-10'}]
  ])('%s sends nothing', async (_name, over) => {
    const {creates} = handlers();
    mount();
    const user = userEvent.setup();
    await row(1);
    await create(user, over);
    expect(await screen.findByText(/^Нужен текст хотя бы на одном языке/)).toBeVisible();
    expect(creates).toEqual([]);
  });

  it('publishing without the tick sends nothing', async () => {
    const {publishes} = handlers();
    mount();
    const user = userEvent.setup();
    await user.click(within(await row(2)).getByRole('button', {name: 'Опубликовать'}));
    expect(await screen.findByText('Сначала отметьте «Понимаю».')).toBeVisible();
    expect(publishes).toEqual([]);
  });
});

describe('L6: server refusals', () => {
  it('a 409 is told and the list read again', async () => {
    const {lists} = handlers({publish: () => HttpResponse.json(problem(409, 'STATE_CONFLICT'), {status: 409})});
    mount();
    const user = userEvent.setup();
    const r = await row(2);
    await user.click(within(r).getByRole('checkbox', {name: 'Понимаю: опубликованный текст не меняется'}));
    await user.click(within(r).getByRole('button', {name: 'Опубликовать'}));
    expect(await screen.findByText('Текст изменил или опубликовал кто-то другой; список обновлён.')).toBeVisible();
    await waitFor(() => expect(lists).toHaveLength(2));
  });
});

describe('L7: one at a time', () => {
  it('a double click publishes once', async () => {
    const {publishes} = handlers({publish: async () => {
      await delay(100);
      return HttpResponse.json({...draft, state: 'PUBLISHED', version: 1} as never);
    }});
    mount();
    const user = userEvent.setup();
    const r = await row(2);
    await user.click(within(r).getByRole('checkbox', {name: 'Понимаю: опубликованный текст не меняется'}));
    await user.dblClick(within(r).getByRole('button', {name: 'Опубликовать'}));
    expect(await screen.findByText(/^№ 2 · опубликован/)).toBeVisible();
    expect(publishes).toHaveLength(1);
  });
});
