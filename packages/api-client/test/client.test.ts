import {afterAll, afterEach, beforeAll, describe, expect, it, vi} from 'vitest';
import {http, HttpResponse, delay} from 'msw';
import {setupServer} from 'msw/node';
import {ApiError, UpgradeRequiredError, createApiClient} from '../src/index.js';
import {cid, me, memoryTokens, problem, rotated, session} from '../../../test/fixtures.js';

const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => server.resetHandlers());
afterAll(() => server.close());
const client = (tokens = memoryTokens()) => createApiClient({
  baseUrl: origin, refreshTokens: tokens, initialSession: session, correlationId: () => cid
});

describe('contract transport', () => {
  it('sends bearer and correlation id and returns the contract response', async () => {
    let authenticated = false;
    let correlation = '';
    server.use(http.get(origin + '/api/admin/v1/me', ({request}) => {
      authenticated = request.headers.get('Authorization') === 'Bearer ' + session.access_token;
      correlation = request.headers.get('X-Correlation-Id') ?? '';
      return HttpResponse.json(me);
    }));
    expect(await client().get('/api/admin/v1/me')).toEqual(me);
    expect(authenticated).toBe(true);
    expect(correlation).toBe(cid);
  });

  it.each([
    ['unknown Problem code', () => HttpResponse.json(problem(503, 'A_FUTURE_CODE'), {status: 503})],
    ['non-JSON 502', () => new HttpResponse('upstream unavailable', {status: 502})],
    ['network failure', () => HttpResponse.error()]
  ])('E5: %s preserves a correlation id in a typed error', async (_name, response) => {
    server.use(http.get(origin + '/api/admin/v1/me', response));
    const error = await client().get('/api/admin/v1/me').catch(value => value);
    expect(error).toBeInstanceOf(ApiError);
    expect(error.correlation_id).toBe(cid);
    expect(typeof error.code).toBe('string');
    if (_name === 'unknown Problem code') expect(error.code).toBe('A_FUTURE_CODE');
  });

  it('E1: carries numeric Retry-After on a lockout', async () => {
    server.use(http.post(origin + '/auth/v1/staff/sign-in', () =>
      HttpResponse.json({...problem(429, 'RATE_LIMITED'), retryable: true},
        {status: 429, headers: {'Retry-After': '60'}})));
    const api = client(memoryTokens(null));
    await expect(api.signIn({login: 'admin', password: 'fixture-password', audience: 'ADMIN'}))
      .rejects.toMatchObject({status: 429, code: 'RATE_LIMITED', retryAfterSeconds: 60, retryable: true});
  });

  it('also parses an HTTP-date Retry-After', async () => {
    server.use(http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(problem(429, 'RATE_LIMITED'),
      {status: 429, headers: {'Retry-After': new Date(Date.now() + 60_000).toUTCString()}})));
    const error = await client().get('/api/admin/v1/me').catch(value => value);
    expect(error).toBeInstanceOf(ApiError);
    expect(error.retryAfterSeconds).toBeGreaterThanOrEqual(59);
    expect(error.retryAfterSeconds).toBeLessThanOrEqual(60);
  });

  it('raises 426 as a dedicated upgrade error', async () => {
    server.use(http.get(origin + '/api/admin/v1/me', () =>
      HttpResponse.json(problem(426, 'UPGRADE_REQUIRED'), {status: 426})));
    await expect(client().get('/api/admin/v1/me')).rejects.toBeInstanceOf(UpgradeRequiredError);
  });

  it('wrong login and wrong current password do not rotate refresh tokens', async () => {
    let refreshes = 0;
    server.use(
      http.post(origin + '/auth/v1/staff/sign-in', () => HttpResponse.json(problem(), {status: 401})),
      http.post(origin + '/api/admin/v1/me/password', () => HttpResponse.json(problem(), {status: 401})),
      http.post(origin + '/auth/v1/token/refresh', () => {refreshes++; return HttpResponse.json(rotated);})
    );
    const api = client();
    await expect(api.signIn({login: 'admin', password: 'wrong-password', audience: 'ADMIN'}))
      .rejects.toBeInstanceOf(ApiError);
    const signedIn = client();
    await expect(signedIn.changePassword({current_password: 'wrong-password', new_password: 'New-Fixture-Password'}))
      .rejects.toBeInstanceOf(ApiError);
    expect(refreshes).toBe(0);
  });
});

describe('refresh rotation', () => {
  it('E4: five expired requests make one refresh and each retries once', async () => {
    let refreshes = 0;
    let requests = 0;
    let revoked = false;
    server.use(
      http.get(origin + '/api/admin/v1/me', async ({request}) => {
        requests++;
        if (request.headers.get('Authorization') === 'Bearer ' + session.access_token) {
          await delay(15);
          return HttpResponse.json(problem(), {status: 401});
        }
        return revoked ? HttpResponse.json(problem(), {status: 401}) : HttpResponse.json(me);
      }),
      http.post(origin + '/auth/v1/token/refresh', async () => {
        if (++refreshes > 1) {
          revoked = true;
          return HttpResponse.json(problem(), {status: 401});
        }
        await delay(30);
        return HttpResponse.json(rotated);
      })
    );
    const api = client();
    await expect(Promise.all(Array.from({length: 5}, () => api.get('/api/admin/v1/me'))))
      .resolves.toEqual(Array.from({length: 5}, () => me));
    expect(refreshes).toBe(1);
    expect(requests).toBe(10);
  });

  it('a delayed old-token 401 after refresh completes does not rotate again', async () => {
    let refreshes = 0;
    let oldRequests = 0;
    let releaseLate: () => void = () => undefined;
    const firstRetried = new Promise<void>(resolve => {releaseLate = resolve;});
    server.use(
      http.get(origin + '/api/admin/v1/me', async ({request}) => {
        if (request.headers.get('Authorization') === 'Bearer ' + session.access_token) {
          if (++oldRequests === 1) await firstRetried;
          return HttpResponse.json(problem(), {status: 401});
        }
        releaseLate();
        return HttpResponse.json(me);
      }),
      http.post(origin + '/auth/v1/token/refresh', () => {refreshes++; return HttpResponse.json(rotated);})
    );
    const api = client();
    await expect(Promise.all([api.get('/api/admin/v1/me'), api.get('/api/admin/v1/me')]))
      .resolves.toEqual([me, me]);
    expect(refreshes).toBe(1);
  });

  it('E4: failed refresh clears the session and all five requests fail', async () => {
    let refreshes = 0;
    server.use(
      http.get(origin + '/api/admin/v1/me', async () => {
        await delay(10);
        return HttpResponse.json(problem(), {status: 401});
      }),
      http.post(origin + '/auth/v1/token/refresh', async () => {
        refreshes++;
        await delay(30);
        return HttpResponse.json(problem(), {status: 401});
      })
    );
    const tokens = memoryTokens();
    const api = client(tokens);
    const results = await Promise.allSettled(Array.from({length: 5}, () => api.get('/api/admin/v1/me')));
    expect(results.every(result => result.status === 'rejected')).toBe(true);
    expect(refreshes).toBe(1);
    expect(api.sessionSnapshot().authenticated).toBe(false);
    expect(Boolean(tokens.read())).toBe(false);
  });

  it('a second 401 is not retried again', async () => {
    let refreshes = 0;
    let requests = 0;
    server.use(
      http.get(origin + '/api/admin/v1/me', () => {requests++; return HttpResponse.json(problem(), {status: 401});}),
      http.post(origin + '/auth/v1/token/refresh', () => {refreshes++; return HttpResponse.json(rotated);})
    );
    await expect(client().get('/api/admin/v1/me')).rejects.toMatchObject({status: 401});
    expect(requests).toBe(2);
    expect(refreshes).toBe(1);
  });

  it('a refresh finishing after logout cannot resurrect the session', async () => {
    let refreshes = 0;
    let release: () => void = () => undefined;
    const pendingResponse = new Promise<void>(resolve => {release = resolve;});
    server.use(
      http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(problem(), {status: 401})),
      http.post(origin + '/auth/v1/token/refresh', async () => {
        refreshes++;
        await pendingResponse;
        return HttpResponse.json(rotated);
      }),
      http.post(origin + '/auth/v1/logout', () => new HttpResponse(null, {status: 204}))
    );
    const tokens = memoryTokens();
    const api = client(tokens);
    const request = api.get('/api/admin/v1/me').catch(error => error);
    await vi.waitFor(() => expect(refreshes).toBe(1));
    await api.logout();
    release();
    await request;
    expect(api.sessionSnapshot().authenticated).toBe(false);
    expect(Boolean(tokens.read())).toBe(false);
  });

  it('restores a tab from its refresh token without persisting an access token', async () => {
    let refreshes = 0;
    server.use(http.post(origin + '/auth/v1/token/refresh', () => {
      refreshes++;
      return HttpResponse.json(rotated);
    }));
    const tokens = memoryTokens();
    const api = createApiClient({baseUrl: origin, refreshTokens: tokens});
    await api.restoreSession();
    expect(api.sessionSnapshot().authenticated).toBe(true);
    expect(refreshes).toBe(1);
    expect(tokens.read() === rotated.refresh_token).toBe(true);
  });
});
