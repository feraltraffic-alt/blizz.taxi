import {createElement} from 'react';
import {registerRootComponent} from 'expo';
import Constants from 'expo-constants';
import * as DocumentPicker from 'expo-document-picker';
import * as Location from 'expo-location';
import * as Notifications from 'expo-notifications';
import * as SecureStore from 'expo-secure-store';
import {Platform} from 'react-native';
import {createApiClient} from '@blizz/api-client';
import {RiderApp, type PickedFile} from './src/App';
import type {Point} from './src/Ride';
import {expoPush, secureRefreshTokens, webRefreshTokens, type Notifications as Port} from '@blizz/mobile-ui';

const KEY = 'blizz.rider.refresh';
const extra = (Constants.expoConfig?.extra ?? {}) as {service?: string; apiUrl?: string};
const version = Constants.expoConfig?.version ?? '0.0.0';
const platform = Platform.OS === 'ios' ? 'RIDER_IOS' : 'RIDER_ANDROID';
const client = createApiClient({
  baseUrl: extra.apiUrl || (Platform.OS === 'web' ? globalThis.location.origin : ''),
  // The web target (for the end-to-end run only) has no Keychain: the tab's sessionStorage stands in.
  refreshTokens: Platform.OS === 'web' ? webRefreshTokens(KEY) : secureRefreshTokens(SecureStore, KEY),
  headers: (): Record<string, string> =>
    Platform.OS === 'web' ? {} : {'X-App-Platform': platform, 'X-App-Version': version}
});
const deviceRef = 'rider-' + globalThis.crypto.randomUUID();

async function locate(): Promise<Point> {
  const permission = await Location.requestForegroundPermissionsAsync();
  if (permission.status !== 'granted') throw new Error('No location permission');
  const fix = await Location.getCurrentPositionAsync({accuracy: Location.Accuracy.Balanced});
  return {lat: fix.coords.latitude, lon: fix.coords.longitude};
}

// Pushes on the phone only: the web build (end-to-end runs) has none (#264).
const push = Platform.OS === 'web' ? undefined : expoPush(Notifications as unknown as Port, Platform.OS);

/** A file for a support message from the phone (or the browser in the web build) (#313), as the driver's (#284). */
async function pickFile(): Promise<PickedFile | null> {
  const result = await DocumentPicker.getDocumentAsync({type: ['image/jpeg', 'image/png', 'image/webp',
    'application/pdf'], copyToCacheDirectory: true, multiple: false});
  const asset = result.canceled ? undefined : result.assets[0];
  if (!asset) return null;
  const data = asset.file ?? await (await fetch(asset.uri)).blob();
  return {name: asset.name, type: asset.mimeType ?? data.type, size: asset.size ?? data.size, data};
}

function Root() {
  return createElement(RiderApp, {client, config: {service: extra.service ?? 'default', deviceRef, locate, push,
    pickFile}});
}

registerRootComponent(Root);
