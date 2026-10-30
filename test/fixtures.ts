import type {AdminMe, RefreshTokenStore, Session} from '../packages/api-client/src/index.js';

export const cid = '10000000-0000-4000-8000-000000000001';
export const session: Session = {
  session_id: '10000000-0000-4000-8000-000000000002',
  subject: {type: 'STAFF', id: '10000000-0000-4000-8000-000000000003'},
  audience: 'admin',
  access_token: 'test-only-access-first',
  refresh_token: 'test-only-refresh-first',
  access_expires_at: '2026-01-01T00:00:00Z',
  refresh_expires_at: '2099-01-01T00:00:00Z',
  password_change_required: false
};
export const rotated: Session = {
  ...session,
  access_token: 'test-only-access-rotated',
  refresh_token: 'test-only-refresh-rotated',
  access_expires_at: '2099-01-01T00:00:00Z'
};
export const me: AdminMe = {
  member: {
    id: session.subject.id,
    login: 'admin-fixture',
    state: 'ACTIVE',
    password_change_required: false,
    version: 0,
    profile: {
      first_name: 'Олена', last_name: 'Коваль', contacts: {email: 'test@example.invalid'},
      role: 'ADMIN', permissions: ['geo.manage'], all_cities: true, city_ids: []
    }
  },
  effective_permissions: ['geo.manage']
};
export function problem(status = 401, code = 'UNAUTHENTICATED') {
  return {type: 'about:blank', title: code, status, code, correlation_id: cid, retryable: false};
}
export function memoryTokens(initial: string | null = session.refresh_token): RefreshTokenStore {
  let value = initial;
  return {read: () => value, write: next => {value = next;}};
}
