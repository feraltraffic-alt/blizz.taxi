import type {RefreshTokenStore} from '@blizz/api-client';

/** The part of expo-secure-store the app uses: Keychain on iOS, Keystore on Android. */
export interface SecureStore {
  getItem(key: string): string | null;
  setItem(key: string, value: string): void;
  deleteItemAsync(key: string): Promise<void>;
}

/**
 * The refresh token in the device's secure storage, never in AsyncStorage (#137). The access token lives in the
 * client's memory only. {@code key}: one per app, e.g. blizz.rider.refresh.
 */
export function secureRefreshTokens(store: SecureStore, key: string): RefreshTokenStore {
  return {
    read: () => {
      try {
        return store.getItem(key) || null;
      } catch {
        return null;
      }
    },
    write: value => {
      try {
        if (value) store.setItem(key, value);
        else {
          // Emptied at once for this run; deleted from the storage in the background.
          store.setItem(key, '');
          void store.deleteItemAsync(key);
        }
      } catch {
        // A storage that refuses: the session lasts as long as the app runs.
      }
    }
  };
}
