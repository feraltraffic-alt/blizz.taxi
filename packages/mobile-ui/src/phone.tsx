import {useRef, useState} from 'react';
import {Text} from 'react-native';
import {ApiError} from '@blizz/api-client';
import {Alert, Button, Field, Screen, useTheme} from './ui';
import type {Shared} from './session';

const E164 = /^\+[1-9][0-9]{7,14}$/;
const CODE = /^[0-9]{4,8}$/;
type Challenge = {challenge_id: string};

/**
 * Changing the account's phone (#328, REQ-AUTH-08): a code to the current phone, a code to the new one, then the
 * change with both. Shared by the rider and the driver; the server's refusals are told in words.
 */
export function PhoneChange({client, t, guard, failure, newId, api, backLabel, onBack}: Shared & {
  newId: () => string; api: '/api/rider/v1' | '/api/driver/v1'; backLabel: string; onBack: () => void}) {
  const [current, setCurrent] = useState<Challenge | null>(null);
  const [next, setNext] = useState<Challenge | null>(null);
  const [currentCode, setCurrentCode] = useState('');
  const [phone, setPhone] = useState('');
  const [newCode, setNewCode] = useState('');
  const [done, setDone] = useState<string | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const acting = useRef(false);
  const command = useRef(newId());
  const theme = useTheme();

  async function once(action: () => Promise<void>, conflict: string) {
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    try {
      await action();
    } catch (error) {
      if (!(error instanceof ApiError)) setMessage(failure(error));
      else if (error.status === 429) setMessage(t('pcTooOften', {seconds: error.retryAfterSeconds ?? 60}));
      else if (error.status === 409) setMessage(conflict);
      else if (error.status === 422) setMessage(t('wrongCode'));
      else if (error.status === 403) setMessage(t('pcInactive'));
      else setMessage(failure(error));
    } finally {
      acting.current = false;
    }
  }

  const askCurrent = () => once(async () => {
    setCurrent(await guard(() => client.post((api + '/me/phone-change/current-code') as never, {} as never)) as
      Challenge);
  }, t('pcTaken'));

  function askNew() {
    const number = phone.trim();
    if (!E164.test(number)) {
      setMessage(t('pcBadPhone'));
      return;
    }
    return once(async () => {
      setNext(await guard(() => client.post((api + '/me/phone-change/new-code') as never,
        {body: {phone: number}} as never)) as Challenge);
    }, t('pcSame'));
  }

  function change() {
    if (!current || !next) return;
    if (!CODE.test(currentCode.trim()) || !CODE.test(newCode.trim())) {
      setMessage(t('pcBadCode'));
      return;
    }
    return once(async () => {
      const changed = await guard(() => client.post((api + '/me/phone-change') as never, {body: {
        command_id: command.current, current_challenge_id: current.challenge_id, current_code: currentCode.trim(),
        new_challenge_id: next.challenge_id, new_code: currentCode.trim()}} as never)) as {phone: string};
      setDone(changed.phone);
    }, t('pcTaken'));
  }

  return (
    <Screen title={t('pcChange')}>
      {done ? <Text style={{color: theme.text}}>{t('pcDone', {phone: done})}</Text> : (
        <>
          <Button label={t('pcAskCurrent')} onPress={() => void askCurrent()} />
          {current ? (
            <>
              <Field label={t('pcCurrentCode')} value={currentCode} onChange={setCurrentCode} keyboard="number-pad" />
              <Field label={t('pcNewPhone')} value={phone} onChange={setPhone} keyboard="phone-pad" />
              <Button label={t('pcAskNew')} onPress={() => void askNew()} />
            </>
          ) : null}
          {next ? (
            <>
              <Field label={t('pcNewCode')} value={newCode} onChange={setNewCode} keyboard="number-pad" />
              <Button label={t('pcChange')} onPress={() => void change()} />
            </>
          ) : null}
        </>
      )}
      <Alert text={message} />
      <Button label={backLabel} onPress={onBack} />
    </Screen>
  );
}
