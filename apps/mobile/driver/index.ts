import {createElement} from 'react';
import {registerRootComponent} from 'expo';
import Constants from 'expo-constants';
import * as Location from 'expo-location';
import * as Notifications from 'expo-notifications';
import * as SecureStore from 'expo-secure-store';
import {Platform} from 'react-native';
import {createApiClient} from '@blizz/api-client';
import {expoPush, secureRefreshTokens, webRefreshTokens, type Notifications as Port} from '@blizz/mobile-ui';
import {DriverApp, type Position} from './src/App';

const KEY = 'blizz.driver.refresh';
const extra = (Constants.expoConfig?.extra ?? {}) as {service?: string; apiUrl?: string};
const version = Constants.expoConfig?.version ?? '0.0.0';
const platform = Platform.OS === 'ios' ? 'DRIVER_IOS' : 'DRIVER_ANDROID';
const client = createApiClient({
  baseUrl: extra.apiUrl || (Platform.OS === 'web' ? globalThis.location.origin : ''),
  // The web target (for the end-to-end run only) has no Keychain: the tab's sessionStorage stands in.
  refreshTokens: Platform.OS === 'web' ? webRefreshTokens(KEY) : secureRefreshTokens(SecureStore, KEY),
  headers: (): Record<string, string> =>
    Platform.OS === 'web' ? {} : {'X-App-Platform': platform, 'X-App-Version': version}
});
const deviceRef = 'driver-' + globalThis.crypto.randomUUID();

async function locate(): Promise<Position> {
  const permission = await Location.requestForegroundPermissionsAsync();
  if (permission.status !== 'granted') throw new Error('No location permission');
  const fix = await Location.getCurrentPositionAsync({accuracy: Location.Accuracy.High});
  return {lat: fix.coords.latitude, lon: fix.coords.longitude, accuracy_m: fix.coords.accuracy ?? undefined};
}

// Pushes on the phone only: the web build (end-to-end runs) has none (#264).
const push = Platform.OS === 'web' ? undefined : expoPush(Notifications as unknown as Port, Platform.OS);

function Root() {
  return createElement(DriverApp, {client, config: {service: extra.service ?? 'default', deviceRef, locate, push}});
}

registerRootComponent(Root);
