import type {RefreshTokenStore} from '@blizz/api-client';

const KEY = 'blizz.rider.refresh';

/** The web target of the end-to-end run: the tab's sessionStorage, never localStorage. */
export function webRefreshTokens(): RefreshTokenStore {
  return {
    read: () => {
      try {
        return globalThis.sessionStorage.getItem(KEY);
      } catch {
        return null;
      }
    },
    write: value => {
      try {
        if (value) globalThis.sessionStorage.setItem(KEY, value);
        else globalThis.sessionStorage.removeItem(KEY);
      } catch {
        // No storage: the session lasts as long as the page.
      }
    }
  };
}
