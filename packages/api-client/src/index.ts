import type {AllPaths} from './generated/index.js';
import type {components as Auth} from './generated/auth.v1.js';
import type {components as Admin} from './generated/admin.v1.js';

export type Session = Auth['schemas']['Session'];
export type StaffSignIn = Auth['schemas']['StaffSignInRequest'];
export type AdminMe = Admin['schemas']['Me'];
export type ChangePassword = Admin['schemas']['ChangePassword'];
type Method = 'get' | 'post' | 'put' | 'delete';
type Operation<P extends keyof AllPaths, M extends Method> =
  M extends keyof AllPaths[P] ? NonNullable<AllPaths[P][M]> : never;
type PathsFor<M extends Method> = {
  [P in keyof AllPaths]: Operation<P, M> extends never ? never : P
}[keyof AllPaths];
type Body<O> = O extends {requestBody: {content: {'application/json': infer B}}} ? {body: B} : {body?: never};
type Params<O> = O extends {parameters: {path: infer P}} ? {params: P} : {params?: never};
type Query<O> = O extends {parameters: {query?: infer Q}} ? {query?: Q} : {query?: never};
export type CallOptions<P extends keyof AllPaths, M extends Method> =
  Body<Operation<P, M>> & Params<Operation<P, M>> & Query<Operation<P, M>> & {signal?: AbortSignal};
type Arguments<P extends keyof AllPaths, M extends Method> = {} extends CallOptions<P, M>
  ? [options?: CallOptions<P, M>] : [options: CallOptions<P, M>];
type Content<R> = R extends {content: {'application/json': infer J}} ? J
  : R extends {content?: never} ? undefined : Blob;
type Success<O> = O extends {responses: infer R}
  ? Content<R[keyof R & (200 | 201 | 202 | 204 | 206)]> : never;

export interface RefreshTokenStore {
  read(): string | null;
  write(value: string | null): void;
}
export interface SessionSnapshot {
  authenticated: boolean;
  passwordChangeRequired: boolean;
}
export interface ClientOptions {
  baseUrl: string;
  refreshTokens: RefreshTokenStore;
  initialSession?: Session;
  fetch?: typeof globalThis.fetch;
  correlationId?: () => string;
  /** Headers of every request, e.g. the app's platform and version (REQ-API-10). */
  headers?: () => Record<string, string>;
}
export interface ApiClient {
  get<P extends PathsFor<'get'>>(path: P, ...options: Arguments<P, 'get'>): Promise<Success<Operation<P, 'get'>>>;
  post<P extends PathsFor<'post'>>(path: P, ...options: Arguments<P, 'post'>): Promise<Success<Operation<P, 'post'>>>;
  /**
   * The raw bytes of a file, PUT to the upload_path the server gave (a relative /api/… path only, so the token never
   * leaves for another host); refreshed once on 401 like any call. Answers the server's JSON (StoredFile).
   */
  upload(path: string, data: Blob, contentType: string): Promise<unknown>;
  /**
   * The access token for a live channel's subprotocol (a browser cannot set Authorization on a WebSocket, and a
   * token in the address would reach proxy logs, REQ-SEC-08): the current one, refreshed only when there is none.
   */
  socketToken(): Promise<string | null>;
  /** A fresh token after the channel was closed for an expired one (4401): one refresh, shared with other calls. */
  renewSocketToken(): Promise<string | null>;
  signIn(input: StaffSignIn): Promise<void>;
  changePassword(input: ChangePassword): Promise<void>;
  logout(): Promise<void>;
  restoreSession(): Promise<void>;
  /** A session the app got itself, e.g. from a one-time code (/auth/v1/otp/verify). */
  startSession(session: Session): void;
  sessionSnapshot(): SessionSnapshot;
  subscribe(listener: () => void): () => void;
}

export class ApiError extends Error {
  constructor(
    readonly status: number,
    readonly code: string,
    readonly correlation_id: string,
    readonly retryable: boolean,
    readonly retryAfterSeconds?: number
  ) {
    super(code);
    this.name = 'ApiError';
  }
}
export class UpgradeRequiredError extends ApiError {}

type RequestOptions = {
  body?: unknown;
  /** Raw bytes instead of a JSON body, with their own Content-Type. */
  raw?: {data: Blob; type: string};
  params?: Record<string, unknown>;
  query?: Record<string, unknown>;
  signal?: AbortSignal;
};

interface Problem {
  code?: unknown;
  correlation_id?: unknown;
  retryable?: unknown;
}

/** Seconds from a Retry-After header: a number of seconds or an HTTP date. */
function retryAfter(header: string | null): number | undefined {
  if (header === null) return undefined;
  const value = header.trim();
  if (/^\d+$/.test(value)) return Number(value);
  const at = Date.parse(value);
  if (Number.isNaN(at)) return undefined;
  return Math.max(0, Math.round((at - Date.now()) / 1000));
}

/** Every non-2xx as a typed error: the Problem's code when there is one, else a generic code. */
async function toError(response: Response, correlationId: string): Promise<ApiError> {
  let problem: Problem = {};
  try {
    const text = await response.text();
    const parsed: unknown = text ? JSON.parse(text) : {};
    if (parsed && typeof parsed === 'object') problem = parsed as Problem;
  } catch {
    problem = {};
  }
  const code = typeof problem.code === 'string' && problem.code ? problem.code : 'HTTP_' + response.status;
  const correlation = typeof problem.correlation_id === 'string' && problem.correlation_id
    ? problem.correlation_id : response.headers.get('X-Correlation-Id') ?? correlationId;
  const retryable = typeof problem.retryable === 'boolean' ? problem.retryable
    : response.status === 429 || response.status >= 500;
  const seconds = response.status === 429 || response.status === 503
    ? retryAfter(response.headers.get('Retry-After')) : undefined;
  if (response.status === 426) {
    return new UpgradeRequiredError(response.status, code, correlation, false, seconds);
  }
  return new ApiError(response.status, code, correlation, retryable, seconds);
}

function newCorrelationId(): string {
  return globalThis.crypto.randomUUID();
}

/**
 * The typed client of the contracts (packages/contracts): a bearer token and an X-Correlation-Id on every request,
 * Problem Details as ApiError, one refresh for all requests that met an expired access token at once (single
 * flight), each retried once. The access token lives in memory only; the refresh token in the given store.
 */
export function createApiClient(options: ClientOptions): ApiClient {
  const doFetch = options.fetch ?? globalThis.fetch.bind(globalThis);
  const correlation = options.correlationId ?? newCorrelationId;
  const base = options.baseUrl.replace(/\/+$/, '');
  let access: string | null = null;
  let passwordChangeRequired = false;
  /** The session's audience (admin, operator, …): the staff password is changed on the panel's own path. */
  let audience: string | null = null;
  /** Grows at every sign-in and sign-out: a refresh that started before one is thrown away. */
  let generation = 0;
  let refreshing: Promise<boolean> | null = null;
  const listeners = new Set<() => void>();

  const notify = () => listeners.forEach(listener => listener());

  function adopt(session: Session) {
    access = session.access_token;
    audience = session.audience;
    options.refreshTokens.write(session.refresh_token);
    passwordChangeRequired = Boolean(session.password_change_required);
    notify();
  }

  function clear() {
    generation++;
    access = null;
    passwordChangeRequired = false;
    refreshing = null;
    options.refreshTokens.write(null);
    notify();
  }

  if (options.initialSession) {
    access = options.initialSession.access_token;
    audience = options.initialSession.audience;
    passwordChangeRequired = Boolean(options.initialSession.password_change_required);
    options.refreshTokens.write(options.initialSession.refresh_token);
  }

  function url(path: string, request: RequestOptions): string {
    let resolved = path;
    for (const [name, value] of Object.entries(request.params ?? {})) {
      resolved = resolved.replace('{' + name + '}', encodeURIComponent(String(value)));
    }
    const query = new URLSearchParams();
    for (const [name, value] of Object.entries(request.query ?? {})) {
      if (value === undefined || value === null) continue;
      if (Array.isArray(value)) value.forEach(item => query.append(name, String(item)));
      else query.append(name, String(value));
    }
    const search = query.toString();
    return base + resolved + (search ? '?' + search : '');
  }

  /** One HTTP exchange; a network failure becomes an ApiError with this request's correlation id. */
  async function exchange(method: string, path: string, request: RequestOptions, token: string | null) {
    const id = correlation();
    const headers: Record<string, string> = {
      ...(options.headers?.() ?? {}), 'X-Correlation-Id': id, Accept: 'application/json'
    };
    if (token) headers.Authorization = 'Bearer ' + token;
    if (request.body !== undefined) headers['Content-Type'] = 'application/json';
    if (request.raw) headers['Content-Type'] = request.raw.type;
    let response: Response;
    try {
      response = await doFetch(url(path, request), {
        method: method.toUpperCase(), headers,
        body: request.raw ? request.raw.data : request.body === undefined ? undefined : JSON.stringify(request.body),
        signal: request.signal
      });
    } catch {
      throw new ApiError(0, 'NETWORK_ERROR', id, true);
    }
    return {response, id};
  }

  async function read(response: Response): Promise<unknown> {
    if (response.status === 204) return undefined;
    const type = response.headers.get('Content-Type') ?? '';
    if (type.includes('json')) return response.json();
    // The bytes as they came (a recording, an export): text() would turn bytes that are not UTF-8 into U+FFFD.
    const bytes = await response.arrayBuffer();
    return bytes.byteLength === 0 ? undefined : new Blob([bytes], {type});
  }

  /** The single refresh in flight; true when a new access token is in hand. */
  function refresh(): Promise<boolean> {
    if (refreshing) return refreshing;
    const token = options.refreshTokens.read();
    if (!token) return Promise.resolve(false);
    const started = generation;
    const attempt = (async () => {
      try {
        const {response, id} = await exchange('post', '/auth/v1/token/refresh', {body: {refresh_token: token}}, null);
        if (!response.ok) {
          await toError(response, id);
          if (started === generation) clear();
          return false;
        }
        const session = await response.json() as Session;
        if (started !== generation) return false; // signed out meanwhile: nothing comes back to life
        adopt(session);
        return true;
      } catch {
        if (started === generation) clear();
        return false;
      } finally {
        if (started === generation) refreshing = null;
      }
    })();
    refreshing = attempt;
    return attempt;
  }

  async function call(method: string, path: string, request: RequestOptions = {}, mayRefresh = true) {
    const token = access;
    const {response, id} = await exchange(method, path, request, token);
    if (response.ok) return read(response);
    if (response.status === 401 && mayRefresh && token !== null) {
      // Another request may have refreshed already: then only retry with the new token.
      const renewed = access !== null && access !== token ? true : await refresh();
      if (renewed && access !== null) {
        const retry = await exchange(method, path, request, access);
        if (retry.response.ok) return read(retry.response);
        throw await toError(retry.response, retry.id);
      }
    }
    throw await toError(response, id);
  }

  return {
    get: ((path: string, request?: RequestOptions) => call('get', path, request)) as ApiClient['get'],
    post: ((path: string, request?: RequestOptions) => call('post', path, request)) as ApiClient['post'],

    async socketToken() {
      if (access) return access;
      return await refresh() ? access : null;
    },

    async renewSocketToken() {
      return await refresh() ? access : null;
    },

    async upload(path, data, contentType) {
      if (!/^\/api\/[A-Za-z0-9/_-]+$/.test(path)) throw new Error('Not an upload path of this server: ' + path);
      return call('put', path, {raw: {data, type: contentType}});
    },

    async signIn(input) {
      const {response, id} = await exchange('post', '/auth/v1/staff/sign-in', {body: input}, null);
      if (!response.ok) {
        clear();
        throw await toError(response, id);
      }
      generation++;
      adopt(await response.json() as Session);
    },

    async changePassword(input) {
      // A wrong current password is a 401 too: it is answered, never refreshed and retried.
      const panel = audience === 'operator' ? 'operator' : 'admin';
      await call('post', '/api/' + panel + '/v1/me/password', {body: input}, false);
      passwordChangeRequired = false;
      notify();
    },

    async logout() {
      const token = options.refreshTokens.read();
      clear();
      if (token) {
        try {
          await exchange('post', '/auth/v1/logout', {body: {refresh_token: token}}, null);
        } catch {
          // The tokens are gone from this tab either way.
        }
      }
    },

    async restoreSession() {
      if (access) return;
      await refresh();
    },

    startSession(session) {
      generation++;
      adopt(session);
    },

    sessionSnapshot() {
      return {authenticated: access !== null, passwordChangeRequired};
    },

    subscribe(listener) {
      listeners.add(listener);
      return () => {listeners.delete(listener);};
    }
  };
}
