import {useRef, useState} from 'react';
import {Text, View} from 'react-native';
import {ApiError} from '@blizz/api-client';
import {Alert, Button, Field, useTheme} from './ui';
import type {Shared} from './session';

const CODE = /^[0-9]{4,8}$/;

/**
 * Asking to delete the account with a code to the phone, and withdrawing the request while it is pending (#336,
 * issue #144). Shared by the rider and the driver; state is the account state the app knows, onState gets a new one.
 */
export function AccountDeletion({client, t, guard, failure, newId, api, state, onState}: Shared & {
  newId: () => string; api: '/api/rider/v1' | '/api/driver/v1'; state: string; onState: (state: string) => void}) {
  const [challenge, setChallenge] = useState<string | null>(null);
  const [code, setCode] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const acting = useRef(false);
  const command = useRef(newId());
  const theme = useTheme();

  async function once(action: () => Promise<void>) {
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    try {
      await action();
    } catch (error) {
      if (!(error instanceof ApiError)) setMessage(failure(error));
      else if (error.status === 429) setMessage(t('pcTooOften', {seconds: error.retryAfterSeconds ?? 60}));
      else if (error.status === 422) setMessage(t('wrongCode'));
      else if (error.status === 409) setMessage(t('deletionConflict'));
      else setMessage(failure(error));
    } finally {
      acting.current = false;
    }
  }

  const ask = () => once(async () => {
    setChallenge(((await guard(() => client.post((api + '/me/deletion-request/challenge') as never, {} as never))) as
      {challenge_id: string}).challenge_id);
  });

  function confirm() {
    if (!challenge) return;
    if (!CODE.test(code.trim())) {
      setMessage(t('pcBadCode'));
      return;
    }
    return once(async () => {
      const result = await guard(() => client.post((api + '/me/deletion-request') as never, {body: {
        command_id: command.current, challenge_id: challenge, otp_code: code.trim()}} as never)) as
        {account_state: string};
      setChallenge(null);
      setCode('');
      command.current = newId();
      onState(result.account_state);
      setMessage(t('deletionRequested'));
    });
  }

  const withdraw = () => once(async () => {
    const result = await guard(() => client.post((api + '/me/deletion-request/cancel') as never,
      {body: {command_id: newId()}} as never)) as {account_state: string};
    onState(result.account_state);
    setMessage(t('deletionCancelled'));
  });

  return (
    <View style={{gap: 8}}>
      {state === 'NEVER' ? (
        <>
          <Text style={{color: theme.error}}>{t('deletionPending')}</Text>
          <Button label={t('cancelDeletion')} onPress={() => void withdraw()} />
        </>
      ) : challenge ? (
        <>
          <Field label={t('deleteCode')} value={code} onChange={setCode} keyboard="number-pad" />
          <Button label={t('confirmDeletion')} onPress={() => void confirm()} />
        </>
      ) : <Button label={t('deleteAccount')} onPress={() => void ask()} />}
      <Alert text={message} />
    </View>
  );
}
