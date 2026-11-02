import {useCallback, useEffect, useRef} from 'react';
import type {ApiClient} from '@blizz/api-client';

/** A push's data: `type`, and for an order `order_id` and `order_version` (NotificationFeed). */
export type PushData = Record<string, string>;

/**
 * The phone's pushes (#264): its token, and the foreground decision. Each decider is asked whether a push that came
 * while the app is open should be shown; one "no" hides it (AC-19: a stale push is never shown).
 */
export interface PushPort {
  /** The FCM token with its platform, or null without permission. */
  token(): Promise<{platform: 'ANDROID' | 'IOS'; token: string} | null>;
  /** Adds a decider; returns its removal. */
  decide(decider: (data: PushData) => boolean): () => void;
}

/** What the port needs of expo-notifications, passed in as the module (as SecureStore is for the tokens). */
export interface Notifications {
  setNotificationHandler(handler: {handleNotification: (notification: {request: {content: {data?: unknown}}}) =>
    Promise<{shouldShowBanner: boolean; shouldShowList: boolean; shouldPlaySound: boolean; shouldSetBadge: boolean}>}
    | null): void;
  requestPermissionsAsync(): Promise<{granted: boolean}>;
  getDevicePushTokenAsync(): Promise<{data: unknown}>;
}

/** The port over expo-notifications; `os` is Platform.OS. */
export function expoPush(notifications: Notifications, os: string): PushPort {
  const deciders = new Set<(data: PushData) => boolean>();
  notifications.setNotificationHandler({
    handleNotification: async notification => {
      const raw = notification.request.content.data;
      const data: PushData = {};
      if (raw && typeof raw === 'object') {
        for (const [key, value] of Object.entries(raw)) data[key] = String(value);
      }
      const show = [...deciders].every(decide => decide(data));
      return {shouldShowBanner: show, shouldShowList: show, shouldPlaySound: show, shouldSetBadge: false};
    }
  });
  return {
    async token() {
      const permission = await notifications.requestPermissionsAsync();
      if (!permission.granted) return null;
      const token = await notifications.getDevicePushTokenAsync();
      return {platform: os === 'ios' ? 'IOS' : 'ANDROID', token: String(token.data)};
    },
    decide(decider) {
      deciders.add(decider);
      return () => {deciders.delete(decider);};
    }
  };
}

/**
 * Registers the phone once per session after sign-in and the legal texts (`base`: /api/rider/v1 or
 * /api/driver/v1). Never blocks the app: no permission or a failed registration only means no pushes. Returns the
 * sign-out that removes the device first, so a signed-out phone gets no more pushes.
 */
export function usePushDevice(client: ApiClient, push: PushPort | undefined, base: string, newId: () => string,
  locale: string): {signOut: () => Promise<void>} {
  const device = useRef<string | null>(null);

  useEffect(() => {
    if (!push) return;
    let current = true;
    void (async () => {
      try {
        const token = await push.token();
        if (!token || !current) return;
        const answer = await client.post((base + '/push-devices') as never, {body: {command_id: newId(),
          platform: token.platform, token: token.token, locale}} as never) as {id: string};
        device.current = answer.id;
      } catch {
        // No pushes this time; the app works without them and registers again at the next start.
      }
    })();
    return () => {current = false;};
  }, [client, push, base, locale]); // once per session: newId is a fresh id each call

  const signOut = useCallback(async () => {
    const id = device.current;
    if (id) {
      await client.post((base + '/push-devices/{device_id}/remove') as never, {params: {device_id: id},
        body: {command_id: newId()}} as never).catch(() => undefined);
      device.current = null;
    }
    await client.logout();
  }, [client, base]); // newId is a fresh id each call

  return {signOut};
}

/** Adds a foreground decider while the component lives. */
export function usePushDecider(push: PushPort | undefined, decider: (data: PushData) => boolean) {
  const latest = useRef(decider);
  latest.current = decider;
  useEffect(() => push?.decide(data => latest.current(data)), [push]);
}
