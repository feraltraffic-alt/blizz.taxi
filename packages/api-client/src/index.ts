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
}
export interface ApiClient {
  get<P extends PathsFor<'get'>>(path: P, ...options: Arguments<P, 'get'>): Promise<Success<Operation<P, 'get'>>>;
  post<P extends PathsFor<'post'>>(path: P, ...options: Arguments<P, 'post'>): Promise<Success<Operation<P, 'post'>>>;
  signIn(input: StaffSignIn): Promise<void>;
  changePassword(input: ChangePassword): Promise<void>;
  logout(): Promise<void>;
  restoreSession(): Promise<void>;
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

// Inert public boundary for the tests-first commit; no auth, HTTP or UI behavior is implemented yet.
export function createApiClient(_options: ClientOptions): ApiClient {
  const missing = () => Promise.reject(new Error('Web behavior is not implemented'));
  const snapshot = {authenticated: false, passwordChangeRequired: false};
  return {
    get: missing,
    post: missing,
    signIn: missing,
    changePassword: missing,
    logout: missing,
    restoreSession: missing,
    sessionSnapshot: () => snapshot,
    subscribe: () => () => undefined
  };
}
