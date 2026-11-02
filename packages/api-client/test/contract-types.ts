import type {ApiClient, AdminMe} from '../src/index.js';

// These are checked by tsc, never executed. A contract/body/path regression makes typecheck fail.
declare const api: ApiClient;
const profile = () => api.get('/api/admin/v1/me');
const profileType: () => Promise<AdminMe> = profile;
void profileType;
function invalidRequests() {
  // @ts-expect-error the contract requires login, password and audience
  api.post('/auth/v1/staff/sign-in', {body: {login: 'fixture'}});
  // @ts-expect-error a GET-only path cannot be posted
  api.post('/api/admin/v1/me');
  // @ts-expect-error a foreign path is not a generated operation
  api.get('/api/admin/v1/does-not-exist');
  // @ts-expect-error the path parameter is required
  api.get('/api/admin/v1/staff/{staff_id}');
}
void invalidRequests;
