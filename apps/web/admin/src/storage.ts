import type {RefreshTokenStore} from '@blizz/api-client';
import {browserRefreshTokens as tabTokens} from '@blizz/web-ui';

/**
 * The refresh token in the tab's sessionStorage (one tab, gone when it closes; the lead's decision in #136). The access
 * token is never stored: it lives in the client's memory only. Nothing goes to localStorage.
 */
export function browserRefreshTokens(storage: Storage): RefreshTokenStore {
  return tabTokens(storage, 'blizz.admin.refresh');
}
