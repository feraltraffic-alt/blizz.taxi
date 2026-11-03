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

/** A city's safety contacts (#381): P1–P6 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const manager = {...me, effective_permissions: ['settings.manage']};
const KYIV = {id: '5a000000-0000-4000-8000-000000000001', name: 'Київ'};
const WAW = {id: '5a000000-0000-4000-8000-000000000002', name: 'Варшава'};
const contacts = (over: Record<string, unknown> = {}) => ({city_id: KYIV.id, version: 3, emergency_number: '112',
  support_phone: '+380441234567', extra: [{label: {uk: 'Поліція', ru: 'Полиция'}, phone: '+380441110102'}],
  changed_by: 's1', reason: 'Новый номер', changed_at: '2026-11-02T10:00:00Z', ...over});

function handlers(opts: {language?: string; read?: (city: string) => unknown;
  save?: (body: Record<string, unknown>) => Response | Promise<Response>} = {}) {
  const saves: {city: string; body: Record<string, unknown>}[] = [];
  let reads = 0;
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(manager as never)),
    http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [KYIV, WAW],
      languages: {default_language: opts.language ?? 'uk', enabled: ['uk', 'ru', 'pl']}})),
    http.get(origin + '/api/admin/v1/settings/safety-contacts/:city', ({params}) => {
      reads++;
      return HttpResponse.json((opts.read ? opts.read(String(params.city)) : contacts({city_id: params.city})) as never);
    }),
    http.post(origin + '/api/admin/v1/settings/safety-contacts/:city', async ({request, params}) => {
      const body = await request.json() as Record<string, unknown>;
      saves.push({city: String(params.city), body});
      return opts.save ? opts.save(body) : HttpResponse.json(contacts({...body, version: 4,
        reason: body.reason}) as never);
    }));
  return {saves, reads: () => reads};
}

function mount() {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={['/settings']}><AdminApp client={api} /></MemoryRouter>);
}

async function open() {
  mount();
  const user = userEvent.setup();
  await waitFor(() => expect(screen.getByLabelText('Экстренный номер')).toHaveValue('112'));
  return user;
}

async function save(user: ReturnType<typeof userEvent.setup>, reason = 'Уточнили номера') {
  if (reason) {
    await user.click(screen.getByLabelText('Причина изменения контактов'));
    await user.paste(reason);
  }
  await user.click(screen.getByRole('button', {name: 'Сохранить контакты'}));
}

describe('P1: read', () => {
  it('the city contacts with their version', async () => {
    handlers();
    await open();
    expect(screen.getByLabelText('Телефон поддержки')).toHaveValue('+380441234567');
    expect(screen.getByLabelText('Название контакта 1 (uk)')).toHaveValue('Поліція');
    expect(screen.getByLabelText('Название контакта 1 (ru)')).toHaveValue('Полиция');
    expect(screen.getByLabelText('Название контакта 1 (pl)')).toHaveValue('');
    expect(screen.getByLabelText('Телефон контакта 1')).toHaveValue('+380441110102');
    expect(screen.getByText('Версия 3 · причина: Новый номер')).toBeVisible();
  });

  it('another city is read', async () => {
    const {reads} = handlers({read: city => city === WAW.id ? contacts({city_id: WAW.id, version: 0,
      emergency_number: '112', support_phone: null, extra: [], changed_by: null, reason: null, changed_at: null})
      : contacts()});
    const user = await open();
    await user.selectOptions(screen.getByLabelText('Город'), WAW.id);
    await waitFor(() => expect(screen.getByLabelText('Телефон поддержки')).toHaveValue(''));
    expect(screen.queryByLabelText('Телефон контакта 1')).toBeNull();
    expect(screen.queryByText(/^Версия/)).toBeNull();
    expect(reads()).toBe(2);
  });
});

describe('P2: save', () => {
  it('one command with the version; empty labels left out; the answer shown', async () => {
    const {saves} = handlers();
    const user = await open();
    await user.clear(screen.getByLabelText('Экстренный номер'));
    await user.type(screen.getByLabelText('Экстренный номер'), '102');
    await user.type(screen.getByLabelText('Название контакта 1 (pl)'), 'Policja');
    await save(user);
    expect(await screen.findByText('Версия 4 · причина: Уточнили номера')).toBeVisible();
    expect(saves).toEqual([{city: KYIV.id, body: {command_id: expect.any(String), expected_version: 3,
      emergency_number: '102', support_phone: '+380441234567', extra: [{label: {uk: 'Поліція', ru: 'Полиция',
        pl: 'Policja'}, phone: '+380441110102'}], reason: 'Уточнили номера'}}]);
  });

  it('an empty support phone is sent as null', async () => {
    const {saves} = handlers();
    const user = await open();
    await user.clear(screen.getByLabelText('Телефон поддержки'));
    await save(user);
    await waitFor(() => expect(saves).toHaveLength(1));
    expect(saves[0]!.body.support_phone).toBeNull();
  });
});

describe('P3: add and remove', () => {
  it('up to five; one removed', async () => {
    const {saves} = handlers();
    const user = await open();
    await user.click(screen.getByRole('button', {name: 'Убрать контакт 1'}));
    for (let n = 1; n <= 5; n++) await user.click(screen.getByRole('button', {name: 'Добавить контакт'}));
    expect(screen.getByRole('button', {name: 'Добавить контакт'})).toBeDisabled();
    for (let n = 2; n <= 5; n++) await user.click(screen.getByRole('button', {name: 'Убрать контакт 2'}));
    await user.type(screen.getByLabelText('Название контакта 1 (uk)'), 'Швидка');
    await user.type(screen.getByLabelText('Телефон контакта 1'), '+380441110103');
    await save(user);
    await waitFor(() => expect(saves).toHaveLength(1));
    expect(saves[0]!.body.extra).toEqual([{label: {uk: 'Швидка'}, phone: '+380441110103'}]);
  });
});

describe('P4: refused on the screen', () => {
  it.each([
    ['an emergency number of one digit', async (user: ReturnType<typeof userEvent.setup>) => {
      await user.clear(screen.getByLabelText('Экстренный номер'));
      await user.type(screen.getByLabelText('Экстренный номер'), '1');
    }],
    ['an emergency number with letters', async (user: ReturnType<typeof userEvent.setup>) => {
      await user.clear(screen.getByLabelText('Экстренный номер'));
      await user.type(screen.getByLabelText('Экстренный номер'), '11a');
    }],
    ['a support phone without the plus', async (user: ReturnType<typeof userEvent.setup>) => {
      await user.clear(screen.getByLabelText('Телефон поддержки'));
      await user.type(screen.getByLabelText('Телефон поддержки'), '380441234567');
    }],
    ['a contact phone not in E.164', async (user: ReturnType<typeof userEvent.setup>) => {
      await user.clear(screen.getByLabelText('Телефон контакта 1'));
      await user.type(screen.getByLabelText('Телефон контакта 1'), '+0123');
    }],
    ['a contact without the default-language label', async (user: ReturnType<typeof userEvent.setup>) =>
      user.clear(screen.getByLabelText('Название контакта 1 (uk)'))],
    ['a label over 80 characters', async (user: ReturnType<typeof userEvent.setup>) => {
      await user.click(screen.getByLabelText('Название контакта 1 (pl)'));
      await user.paste('x'.repeat(81));
    }]
  ])('%s sends nothing', async (_name, spoil) => {
    const {saves} = handlers();
    const user = await open();
    await spoil(user);
    await save(user);
    expect(await screen.findByText(/^Экстренный номер — 2–6 цифр/)).toBeVisible();
    expect(saves).toEqual([]);
  });

  it('the default language follows the service: pl', async () => {
    const {saves} = handlers({language: 'pl'});
    const user = await open();
    await save(user);
    expect(await screen.findByText(/^Экстренный номер — 2–6 цифр/)).toBeVisible();
    expect(saves).toEqual([]);
  });

  it('no reason sends nothing', async () => {
    const {saves} = handlers();
    const user = await open();
    await save(user, '');
    expect(await screen.findByText(/^Экстренный номер — 2–6 цифр/)).toBeVisible();
    expect(saves).toEqual([]);
  });
});

describe('P5: a conflict', () => {
  it('is told, the city read again, and the next save carries the new version', async () => {
    let version = 3;
    let first = true;
    const {saves, reads} = handlers({read: () => contacts({version}), save: body => {
      if (first) {
        first = false;
        version = 8;
        return HttpResponse.json(problem(409, 'VERSION_CONFLICT'), {status: 409});
      }
      return HttpResponse.json(contacts({...body, version: 9}) as never);
    }});
    const user = await open();
    await save(user, 'r');
    expect(await screen.findByText('Контакты изменил кто-то другой; показаны текущие.')).toBeVisible();
    await waitFor(() => expect(reads()).toBe(2));
    await save(user, 'r');
    await waitFor(() => expect(saves).toHaveLength(2));
    expect(saves.map(s => s.body.expected_version)).toEqual([3, 8]);
  });
});

describe('P6: one at a time', () => {
  it('a double click saves once', async () => {
    const {saves} = handlers({save: async body => {
      await delay(100);
      return HttpResponse.json(contacts({...body, version: 4}) as never);
    }});
    const user = await open();
    await user.type(screen.getByLabelText('Причина изменения контактов'), 'r');
    await user.dblClick(screen.getByRole('button', {name: 'Сохранить контакты'}));
    expect(await screen.findByText('Контакты сохранены.')).toBeVisible();
    expect(saves).toHaveLength(1);
  });
});
