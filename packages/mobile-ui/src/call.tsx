import {useRef, useState} from 'react';
import {Linking, Text, View} from 'react-native';
import {ApiError} from '@blizz/api-client';
import {Alert, Button, useTheme} from './ui';
import type {Shared} from './session';

type Target = {mode: 'DIRECT' | 'VIA_SERVICE_NUMBERS'; phone: string};

/**
 * Calling the other side of a trip (#378, REQ-SEC-04): every press asks the server whom to dial at that moment (the
 * other side's phone, or the service's number), never a number kept from before. When the phone cannot dial, the
 * number is shown to dial by hand.
 */
export function CallButton({client, t, guard, failure, path, params, label}: Shared & {
  path: '/api/rider/v1/orders/{order_id}/call' | '/api/driver/v1/trips/{trip_id}/call';
  params: Record<string, string>; label: string}) {
  const [note, setNote] = useState<string | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const busy = useRef(false);
  const theme = useTheme();

  async function call() {
    if (busy.current) return;
    busy.current = true;
    setNote(null);
    setMessage(null);
    try {
      const target = await guard(() => client.get(path as never, {params} as never)) as Target;
      if (target.mode === 'VIA_SERVICE_NUMBERS') setNote(t('callViaService'));
      await Linking.openURL('tel:' + target.phone).catch(() => setNote(t('callDial', {phone: target.phone})));
    } catch (error) {
      setMessage(error instanceof ApiError && (error.status === 409 || error.status === 404) ? t('callNotNow')
        : failure(error));
    } finally {
      busy.current = false;
    }
  }

  return (
    <View style={{gap: 4}}>
      <Button label={label} onPress={() => void call()} />
      {note ? <Text style={{color: theme.muted}}>{note}</Text> : null}
      <Alert text={message} />
    </View>
  );
}
