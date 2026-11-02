import {createElement} from 'react';
import {registerRootComponent} from 'expo';
import Constants from 'expo-constants';
import * as SecureStore from 'expo-secure-store';
import {Platform} from 'react-native';
import {createApiClient} from '@blizz/api-client';
import {RiderApp} from './src/App';
import {secureRefreshTokens} from './src/secureTokens';
import {webRefreshTokens} from './src/webTokens';

const extra = (Constants.expoConfig?.extra ?? {}) as {service?: string; apiUrl?: string};
const version = Constants.expoConfig?.version ?? '0.0.0';
const platform = Platform.OS === 'ios' ? 'RIDER_IOS' : 'RIDER_ANDROID';
const client = createApiClient({
  baseUrl: extra.apiUrl || (Platform.OS === 'web' ? globalThis.location.origin : ''),
  // The web target (for the end-to-end run only) has no Keychain: the tab's sessionStorage stands in.
  refreshTokens: Platform.OS === 'web' ? webRefreshTokens() : secureRefreshTokens(SecureStore),
  headers: (): Record<string, string> =>
    Platform.OS === 'web' ? {} : {'X-App-Platform': platform, 'X-App-Version': version}
});
const deviceRef = 'rider-' + globalThis.crypto.randomUUID();

function Root() {
  return createElement(RiderApp, {client, config: {service: extra.service ?? 'default', deviceRef}});
}

registerRootComponent(Root);
