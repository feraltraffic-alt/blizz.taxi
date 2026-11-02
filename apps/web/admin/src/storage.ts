import type {RefreshTokenStore} from '@blizz/api-client';

const KEY = 'blizz.admin.refresh';

/**
 * The refresh token in the tab's sessionStorage (one tab, gone when it closes; the lead's decision in #136). The access
 * token is never stored: it lives in the client's memory only. Nothing goes to localStorage.
 */
export function browserRefreshTokens(storage: Storage): RefreshTokenStore {
  return {
    read: () => {
      try {
        return storage.getItem(KEY);
      } catch {
        return null;
      }
    },
    write: value => {
      try {
        if (value) storage.setItem(KEY, value);
        else storage.removeItem(KEY);
      } catch {
        // A blocked storage: the session lasts as long as this page.
      }
    }
  };
}
