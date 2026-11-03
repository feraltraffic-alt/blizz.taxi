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

/** A value kept under one key, read and written whole; null when there is none. */
export interface ValueStore {
  read(): string | null;
  write(value: string | null): void;
}

/**
 * A value of any length in the device's secure storage (#462). SecureStore keeps about 2 KB per key, so the value is
 * cut into parts of {@code size} characters under {@code key.0}, {@code key.1}, …, with their count under {@code key};
 * a shorter value empties the parts left over, and a part missing reads as no value at all, never as a broken one.
 */
export function chunkedSecureStore(store: SecureStore, key: string, size = 1900): ValueStore {
  const count = () => {
    try {
      const n = Number(store.getItem(key) || '0');
      return Number.isInteger(n) && n > 0 ? n : 0;
    } catch {
      return 0;
    }
  };
  const empty = (from: number, to: number) => {
    for (let i = from; i < to; i++) {
      store.setItem(key + '.' + i, '');
      void store.deleteItemAsync(key + '.' + i).catch(() => undefined);
    }
  };
  return {
    read: () => {
      const n = count();
      if (n === 0) return null;
      try {
        const parts: string[] = [];
        for (let i = 0; i < n; i++) {
          const part = store.getItem(key + '.' + i);
          if (!part) return null;
          parts.push(part);
        }
        return parts.join('');
      } catch {
        return null;
      }
    },
    write: value => {
      try {
        const before = count();
        if (!value) {
          store.setItem(key, '');
          empty(0, before);
          void store.deleteItemAsync(key).catch(() => undefined);
          return;
        }
        const parts = Math.ceil(value.length / size);
        for (let i = 0; i < parts; i++) store.setItem(key + '.' + i, value.slice(i * size, (i + 1) * size));
        store.setItem(key, String(parts));
        empty(parts, before);
      } catch {
        // A storage that refuses: the points last as long as the app runs.
      }
    }
  };
}
