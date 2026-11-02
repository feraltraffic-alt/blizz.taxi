import {useCallback, useEffect, useRef, useState} from 'react';
import {Share, Text, View} from 'react-native';
import {ApiError} from '@blizz/api-client';
import {Alert, Button, Field, Screen, useTheme} from './ui';
import type {Shared} from './session';

type DataExport = {id: string; state: 'PENDING' | 'RUNNING' | 'READY' | 'FAILED' | 'EXPIRED'; created_at: string;
  expires_at?: string | null; size_bytes?: number | null};

const CODE = /^[0-9]{4,8}$/;
const two = (n: number) => String(n).padStart(2, '0');
const dm = (at: string) => {
  const d = new Date(at);
  return two(d.getDate()) + '.' + two(d.getMonth() + 1) + ' ' + two(d.getHours()) + ':' + two(d.getMinutes());
};

/**
 * A copy of my personal data (#330, REQ-PRV-07), shared by the rider and the driver: ask with a code to my phone,
 * follow the copy while it is built, and share a ready one through the system sheet (React Native Share).
 */
export function DataExports({client, t, guard, failure, newId, api, pollMs, backLabel, onBack}: Shared & {
  newId: () => string; api: '/api/rider/v1' | '/api/driver/v1'; pollMs: number; backLabel: string;
  onBack: () => void}) {
  const [exports, setExports] = useState<DataExport[] | null>(null);
  const [challenge, setChallenge] = useState<string | null>(null);
  const [code, setCode] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const acting = useRef(false);
  const command = useRef(newId());
  const theme = useTheme();

  const read = useCallback(async () => {
    setExports(((await guard(() => client.get((api + '/me/data-exports') as never, {} as never))) as
      {exports: DataExport[]}).exports);
  }, [client, guard, api]);

  useEffect(() => {
    read().catch(error => setMessage(failure(error)));
  }, [read]); // the failure text follows the same texts

  // While a copy is being built, it is read again; never once none is (#330 X4).
  const building = (exports ?? []).some(e => e.state === 'PENDING' || e.state === 'RUNNING');
  useEffect(() => {
    if (!building) return;
    const timer = setInterval(() => {read().catch(() => undefined);}, pollMs);
    return () => clearInterval(timer);
  }, [building, read, pollMs]);

  async function once(action: () => Promise<void>) {
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    try {
      await action();
    } catch (error) {
      if (!(error instanceof ApiError)) setMessage(failure(error));
      else if (error.status === 429) setMessage(t('pcTooOften', {seconds: error.retryAfterSeconds ?? 60}));
      else if (error.status === 409) setMessage(t('exOncePerDay'));
      else if (error.status === 422) setMessage(t('wrongCode'));
      else if (error.status === 403) setMessage(t('pcInactive'));
      else setMessage(failure(error));
    } finally {
      acting.current = false;
    }
  }

  const ask = () => once(async () => {
    setChallenge(((await guard(() => client.post((api + '/me/data-exports/challenge') as never, {} as never))) as
      {challenge_id: string}).challenge_id);
  });

  function confirm() {
    if (!challenge) return;
    if (!CODE.test(code.trim())) {
      setMessage(t('pcBadCode'));
      return;
    }
    return once(async () => {
      await guard(() => client.post((api + '/me/data-exports') as never, {body: {command_id: command.current,
        challenge_id: challenge, otp_code: code.trim()}} as never));
      setChallenge(null);
      setCode('');
      command.current = newId();
      await read();
    });
  }

  const share = (e: DataExport) => once(async () => {
    const file = await guard(() => client.get((api + '/me/data-exports/{export_id}/file') as never,
      {params: {export_id: e.id}} as never));
    await Share.share({message: JSON.stringify(file, null, 2)});
  });

  function line(e: DataExport): string {
    if (e.state !== 'READY') return dm(e.created_at) + ' · ' + t('ex_' + e.state);
    return [dm(e.created_at), t('exReadyUntil', {until: e.expires_at ? dm(e.expires_at) : '—'}),
      Math.max(1, Math.round((e.size_bytes ?? 0) / 1024)) + ' ' + t('kilobytes')].join(' · ');
  }

  return (
    <Screen title={t('exTitle')}>
      <Text style={{color: theme.muted}}>{t('exAbout')}</Text>
      {exports && exports.length === 0 ? <Text style={{color: theme.muted}}>{t('exNone')}</Text> : null}
      {(exports ?? []).map(e => (
        <View key={e.id} style={{gap: 4}}>
          <Text style={{color: theme.text}}>{line(e)}</Text>
          {e.state === 'READY' ? <Button label={t('exShare')} onPress={() => void share(e)} /> : null}
        </View>
      ))}
      {challenge ? (
        <>
          <Field label={t('exCode')} value={code} onChange={setCode} keyboard="number-pad" />
          <Button label={t('exConfirm')} onPress={() => void confirm()} />
        </>
      ) : <Button label={t('exAsk')} onPress={() => void ask()} />}
      <Alert text={message} />
      <Button label={backLabel} onPress={onBack} />
    </Screen>
  );
}
