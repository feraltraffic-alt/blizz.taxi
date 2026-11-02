import type {RefreshTokenStore} from '@blizz/api-client';

export function browserRefreshTokens(_storage: Storage): RefreshTokenStore {
  return {read: () => null, write: () => undefined};
}
