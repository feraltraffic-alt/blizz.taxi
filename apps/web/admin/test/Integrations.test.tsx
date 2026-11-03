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

/** Integrations (#391): N1–N7 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const engineer = {...me, effective_permissions: ['integrations.manage']};
const health = {instance: 'api-1', checked_at: '2026-11-03T04:00:00Z', providers: [
  {provider: 'GRAPHHOPPER', state: 'CLOSED', last_success_at: '2026-11-03T03:59:00Z', last_failure_at: null,
    last_failure_kind: null},
  {provider: 'FCM', state: 'OPEN', last_success_at: null, last_failure_at: '2026-11-03T03:58:00Z',
    last_failure_kind: 'SocketTimeoutException'}]};
const fields = [
  {name: 'push.fcm.credentials', group: 'push', kind: 'SECRET', label: 'Firebase key', description: 'JSON key',
    for_apps: false, set: true, value: null, hint: '…a1b2', changed_by: null, changed_at: null},
  {name: 'routing.graphhopper.url', group: 'routing', kind: 'TEXT', label: 'GraphHopper URL', description: 'Base URL',
    for_apps: false, set: true, value: 'https://gh.example', hint: null, changed_by: null, changed_at: null},
  {name: 'maps.tiles.url', group: 'maps', kind: 'TEXT', label: 'Tiles', description: 'Tile URL', for_apps: true,
    set: false, value: null, hint: null, changed_by: null, changed_at: null}];

function handlers(opts: {change?: () => Response | Promise<Response>} = {}) {
  const changes: Record<string, unknown>[] = [];
  const checks: string[] = [];
  let reads = 0;
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(engineer as never)),
    http.get(origin + '/api/admin/v1/integrations/health', () => HttpResponse.json(health as never)),
    http.get(origin + '/api/admin/v1/integrations', () => {
      reads++;
      return HttpResponse.json({fields} as never);
    }),
    http.post(origin + '/api/admin/v1/integrations', async ({request}) => {
      changes.push(await request.json() as Record<string, unknown>);
      return opts.change ? opts.change() : HttpResponse.json({fields} as never);
    }),
    http.post(origin + '/api/admin/v1/integrations/:group/check', ({params}) => {
      checks.push(String(params.group));
      return HttpResponse.json({group: params.group, ok: params.group === 'routing',
        message: params.group === 'routing' ? 'GraphHopper /info answered' : 'Firebase sign-in failed'} as never);
    }));
  return {changes, checks, reads: () => reads};
}

function mount() {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={['/integrations']}><AdminApp client={api} /></MemoryRouter>);
}

async function open() {
  mount();
  const user = userEvent.setup();
  await screen.findByText(/^GraphHopper URL/);
  return user;
}

async function send(user: ReturnType<typeof userEvent.setup>, reason = 'Новый ключ', own = 'Admin-Pass-2026') {
  if (reason) await user.type(screen.getByLabelText('Причина изменения ключей'), reason);
  if (own) await user.type(screen.getByLabelText('Ваш пароль для ключей'), own);
  await user.click(screen.getByRole('button', {name: 'Сохранить ключи'}));
}

describe('N1: health', () => {
  it('one line per provider and the instance', async () => {
    handlers();
    mount();
    expect(await screen.findByText('GRAPHHOPPER · работает · успех 03.11.2026 03:59 UTC')).toBeVisible();
    expect(screen.getByText('FCM · отключён · сбой 03.11.2026 03:58 UTC (SocketTimeoutException)')).toBeVisible();
    expect(screen.getByText('Сервер: api-1')).toBeVisible();
  });
});

describe('N2: fields', () => {
  it('values, secret hints, for the apps; a secret input starts empty', async () => {
    handlers();
    await open();
    expect(screen.getByText('Firebase key — JSON key · задан …a1b2')).toBeVisible();
    expect(screen.getByText('Tiles — Tile URL · для приложений · не задан')).toBeVisible();
    expect(screen.getByLabelText('Новое значение: GraphHopper URL')).toHaveValue('https://gh.example');
    const secret = screen.getByLabelText('Новое значение: Firebase key');
    expect(secret).toHaveAttribute('type', 'password');
    expect(secret).toHaveValue('');
    expect(document.body.textContent).not.toContain('a1b2-full');
  });
});

describe('N3: change', () => {
  it('only edited fields; the password and the typed secret emptied; the fields read again', async () => {
    const {changes, reads} = handlers();
    const user = await open();
    await user.type(screen.getByLabelText('Новое значение: Firebase key'), '{"key":"secret-json"}');
    await user.click(screen.getByRole('button', {name: 'Убрать значение: GraphHopper URL'}));
    await send(user);
    expect(await screen.findByText('Ключи сохранены.')).toBeVisible();
    expect(changes).toEqual([{command_id: expect.any(String), password: 'Admin-Pass-2026', changes: [
      {name: 'push.fcm.credentials', value: '{"key":"secret-json"}'}, {name: 'routing.graphhopper.url', value: null}],
    reason: 'Новый ключ'}]);
    expect(screen.getByLabelText('Ваш пароль для ключей')).toHaveValue('');
    expect(screen.getByLabelText('Новое значение: Firebase key')).toHaveValue('');
    await waitFor(() => expect(reads()).toBe(2));
  });

  it('after a 403 the typed secret is emptied too', async () => {
    handlers({change: () => HttpResponse.json(problem(403, 'ACCESS_DENIED'), {status: 403})});
    const user = await open();
    await user.type(screen.getByLabelText('Новое значение: Firebase key'), 'secret-json');
    await send(user, 'r', 'wrong');
    expect(await screen.findByText('Ваш пароль не подошёл.')).toBeVisible();
    expect(screen.getByLabelText('Ваш пароль для ключей')).toHaveValue('');
    expect(screen.getByLabelText('Новое значение: Firebase key')).toHaveValue('');
  });
});

describe('N4: refused on the screen', () => {
  it.each([['nothing changed', false, 'r', 'p'], ['no reason', true, '', 'p'], ['no own password', true, 'r', '']])(
    '%s sends nothing', async (_name, edit, reason, own) => {
      const {changes} = handlers();
      const user = await open();
      if (edit) await user.type(screen.getByLabelText('Новое значение: Tiles'), 'https://tiles.example');
      await send(user, reason, own);
      expect(await screen.findByText('Измените хотя бы одно поле; нужны причина и ваш пароль.')).toBeVisible();
      expect(changes).toEqual([]);
    });
});

describe('N5: server refusals', () => {
  it('a 409 says the master key is missing', async () => {
    handlers({change: () => HttpResponse.json(problem(409, 'STATE_CONFLICT'), {status: 409})});
    const user = await open();
    await user.type(screen.getByLabelText('Новое значение: Tiles'), 'https://tiles.example');
    await send(user);
    expect(await screen.findByText('На сервере нет главного ключа для секретов.')).toBeVisible();
  });
});

describe('N6: check', () => {
  it('per group, the result as received', async () => {
    const {checks} = handlers();
    const user = await open();
    await user.click(screen.getByRole('button', {name: 'Проверить: routing'}));
    expect(await screen.findByText('✓ GraphHopper /info answered')).toBeVisible();
    await user.click(screen.getByRole('button', {name: 'Проверить: push'}));
    expect(await screen.findByText('✗ Firebase sign-in failed')).toBeVisible();
    expect(checks).toEqual(['routing', 'push']);
  });
});

describe('N7: one at a time', () => {
  it('a double click sends one change', async () => {
    const {changes} = handlers({change: async () => {
      await delay(100);
      return HttpResponse.json({fields} as never);
    }});
    const user = await open();
    await user.type(screen.getByLabelText('Новое значение: Tiles'), 'https://tiles.example');
    await user.type(screen.getByLabelText('Причина изменения ключей'), 'r');
    await user.type(screen.getByLabelText('Ваш пароль для ключей'), 'p');
    await user.dblClick(screen.getByRole('button', {name: 'Сохранить ключи'}));
    expect(await screen.findByText('Ключи сохранены.')).toBeVisible();
    expect(changes).toHaveLength(1);
  });
});
