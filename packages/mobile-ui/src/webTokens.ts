import type {RefreshTokenStore} from '@blizz/api-client';

/** The web target of the end-to-end run: the tab's sessionStorage, never localStorage. */
export function webRefreshTokens(key: string): RefreshTokenStore {
  return {
    read: () => {
      try {
        return globalThis.sessionStorage.getItem(key);
      } catch {
        return null;
      }
    },
    write: value => {
      try {
        if (value) globalThis.sessionStorage.setItem(key, value);
        else globalThis.sessionStorage.removeItem(key);
      } catch {
        // No storage: the session lasts as long as the page.
      }
    }
  };
}
