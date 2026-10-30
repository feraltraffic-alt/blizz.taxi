import {afterAll, afterEach, beforeAll, describe, expect, it, vi} from 'vitest';
import {render, screen, waitFor} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {MemoryRouter} from 'react-router-dom';
import {http, HttpResponse} from 'msw';
import {setupServer} from 'msw/node';
import {createApiClient} from '@blizz/api-client';
import {AdminApp} from '../src/App.js';
import {browserRefreshTokens} from '../src/storage.js';
import {translations, validateCatalogs} from '../src/i18n.js';
import {cid, me, problem, session} from '../../../../test/fixtures.js';

const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());
function mount(options: {signedIn?: boolean; forced?: boolean; path?: string} = {}) {
  const tokens = browserRefreshTokens(sessionStorage);
  const api = createApiClient({
    baseUrl: origin, refreshTokens: tokens, correlationId: () => cid,
    initialSession: options.signedIn || options.forced
      ? {...session, password_change_required: options.forced ?? false} : undefined
  });
  render(<MemoryRouter initialEntries={[options.path ?? '/']}><AdminApp client={api} /></MemoryRouter>);
  return {api, tokens};
}
async function submit(login = 'admin-fixture') {
  const user = userEvent.setup();
  await user.type(await screen.findByLabelText('Логин'), login);
  await user.type(screen.getByLabelText('Пароль'), 'Fixture-Password-2026');
  await user.click(screen.getByRole('button', {name: 'Войти'}));
}

describe('staff sign-in', () => {
  it.each(['unknown-login', 'admin-fixture'])('E1: %s gets the same non-enumerating error', async login => {
    server.use(http.post(origin + '/auth/v1/staff/sign-in', () => HttpResponse.json(problem(), {status: 401})));
    mount();
    await submit(login);
    expect(await screen.findByRole('alert')).toHaveTextContent('Неверный логин или пароль.');
  });

  it('E1: a 429 lockout says when to retry', async () => {
    server.use(http.post(origin + '/auth/v1/staff/sign-in', () =>
      HttpResponse.json(problem(429, 'RATE_LIMITED'), {status: 429, headers: {'Retry-After': '60'}})));
    mount();
    await submit();
    expect(await screen.findByRole('alert')).toHaveTextContent(/60/);
    expect(screen.getByRole('alert')).toHaveTextContent(/Повторите/);
  });

  it('E2: a suspended account has its own message and leaves no tokens', async () => {
    server.use(http.post(origin + '/auth/v1/staff/sign-in', () =>
      HttpResponse.json(problem(403, 'ACCESS_DENIED'), {status: 403})));
    const {api, tokens} = mount();
    await submit();
    expect(await screen.findByRole('alert')).toHaveTextContent('Учётная запись приостановлена.');
    expect(api.sessionSnapshot().authenticated).toBe(false);
    expect(Boolean(tokens.read())).toBe(false);
  });

  it('sends the ADMIN audience and opens the actual staff profile after sign-in', async () => {
    let audience = '';
    server.use(
      http.post(origin + '/auth/v1/staff/sign-in', async ({request}) => {
        const input = await request.json() as {audience: string};
        audience = input.audience;
        return HttpResponse.json(session);
      }),
      http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(me))
    );
    mount();
    await submit();
    expect(await screen.findByText('Олена Коваль')).toBeVisible();
    expect(audience).toBe('ADMIN');
    expect(screen.getByText('Все города')).toBeVisible();
    expect(screen.getByText('Администратор')).toBeVisible();
  });
});

describe('protected panel', () => {
  it.each(['/', '/orders', '/staff', '/reports'])('E3: forced change blocks %s until a real password204', async path => {
    let changes = 0;
    let profileReads = 0;
    server.use(
      http.post(origin + '/api/admin/v1/me/password', async ({request}) => {
        const body = await request.json() as {current_password: string; new_password: string};
        expect(body.current_password.length > 0).toBe(true);
        expect(body.new_password.length).toBeGreaterThanOrEqual(12);
        changes++;
        return new HttpResponse(null, {status: 204});
      }),
      http.get(origin + '/api/admin/v1/me', () => {profileReads++; return HttpResponse.json(me);})
    );
    mount({forced: true, path});
    expect(await screen.findByRole('heading', {name: 'Смена пароля'})).toBeVisible();
    expect(screen.queryByRole('navigation')).not.toBeInTheDocument();
    expect(profileReads).toBe(0);
    const user = userEvent.setup();
    await user.type(screen.getByLabelText('Текущий пароль'), 'Fixture-Old-Password');
    await user.type(screen.getByLabelText('Новый пароль'), 'Fixture-New-Password');
    await user.click(screen.getByRole('button', {name: 'Сохранить пароль'}));
    expect(await screen.findByText('Олена Коваль')).toBeVisible();
    expect(changes).toBe(1);
    expect(profileReads).toBe(1);
  });

  it('builds navigation from effective permissions and logout returns to sign-in', async () => {
    let logouts = 0;
    server.use(
      http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(me)),
      http.post(origin + '/auth/v1/logout', () => {logouts++; return new HttpResponse(null, {status: 204});})
    );
    const {api, tokens} = mount({signedIn: true});
    expect(await screen.findByRole('link', {name: 'География'})).toBeVisible();
    expect(screen.queryByRole('link', {name: 'Сотрудники'})).not.toBeInTheDocument();
    await userEvent.setup().click(screen.getByRole('button', {name: 'Выйти'}));
    expect(await screen.findByRole('button', {name: 'Войти'})).toBeVisible();
    expect(api.sessionSnapshot().authenticated).toBe(false);
    expect(Boolean(tokens.read())).toBe(false);
    expect(logouts).toBe(1);
  });

  it('E4: refresh failure returns to sign-in and removes persisted refresh state', async () => {
    server.use(
      http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(problem(), {status: 401})),
      http.post(origin + '/auth/v1/token/refresh', () => HttpResponse.json(problem(), {status: 401}))
    );
    const {tokens} = mount({signedIn: true});
    expect(await screen.findByRole('button', {name: 'Войти'})).toBeVisible();
    expect(Boolean(tokens.read())).toBe(false);
  });

  it.each([
    ['unknown code', () => HttpResponse.json(problem(503, 'FUTURE_CODE'), {status: 503})],
    ['non-JSON502', () => new HttpResponse('Bad gateway', {status: 502})],
    ['network failure', () => HttpResponse.error()]
  ])('E5: %s shows a generic error and cid without a blank page', async (_name, response) => {
    server.use(http.get(origin + '/api/admin/v1/me', response));
    mount({signedIn: true});
    expect(await screen.findByRole('alert')).toHaveTextContent('Не удалось выполнить запрос.');
    expect(screen.getByRole('alert')).toHaveTextContent(cid);
    expect(screen.getByRole('main')).toBeVisible();
  });

  it('stores only the refresh token in sessionStorage and never touches localStorage', async () => {
    const localWrite = vi.spyOn(Storage.prototype, 'setItem');
    const store = browserRefreshTokens(sessionStorage);
    store.write(session.refresh_token);
    expect(store.read() === session.refresh_token).toBe(true);
    expect(localStorage.length).toBe(0);
    expect(localWrite.mock.instances.every(instance => instance === sessionStorage)).toBe(true);
    const values = Object.values(sessionStorage);
    expect(values.some(value => value === session.access_token)).toBe(false);
    store.write(null);
    expect(Boolean(store.read())).toBe(false);
  });
});

it('RU default catalog is nonempty and UK/PL contain the exact same keys', () => {
  expect(Object.keys(translations.ru)).toContain('signIn');
  expect(Object.keys(translations.ru).length).toBeGreaterThan(15);
  expect(Object.keys(translations.uk).sort()).toEqual(Object.keys(translations.ru).sort());
  expect(Object.keys(translations.pl).sort()).toEqual(Object.keys(translations.ru).sort());
  validateCatalogs(translations);
});
it('the translation guard actually refuses a missing key', () => {
  expect(() => validateCatalogs({ru: {signIn: 'Вход'}, uk: {}, pl: {signIn: 'Wejście'}})).toThrow(/uk.*signIn/);
});

it('refresh-token removal can be observed without persisting access tokens', async () => {
  const store = browserRefreshTokens(sessionStorage);
  store.write(session.refresh_token);
  await waitFor(() => expect(Boolean(store.read())).toBe(true));
  store.write(null);
  expect(Boolean(store.read())).toBe(false);
});
