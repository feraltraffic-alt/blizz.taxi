import {useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import type {Translate} from '@blizz/web-ui';

const E164 = /^\+[1-9][0-9]{7,14}$/;
const CODE = /^[0-9]{4,8}$/;

const utc = (at: string) => {
  const when = new Date(at);
  return when.toLocaleDateString('ru-RU', {timeZone: 'UTC'}) + ' '
    + when.toLocaleTimeString('ru-RU', {timeZone: 'UTC', hour: '2-digit', minute: '2-digit'}) + ' UTC';
};

/**
 * A driver's new phone set by support and the own card terminal (#435, REQ-AUTH-08, owner decisions 27–28.10.2026).
 * Every command sends the driver's version as it is now, so one command after another never sends a stale one.
 */
export function DriverContact<P extends {version: number; has_payment_terminal?: boolean}>({client, t, newId,
  driverId, profile, onPhone, onProfile, reread}: {client: ApiClient; t: Translate; newId: () => string;
  driverId: string; profile: P; onPhone: (phone: string, version: number) => void; onProfile: (profile: P) => void;
  reread: () => Promise<void>}) {
  const [phone, setPhone] = useState('');
  const [challenge, setChallenge] = useState<string | null>(null);
  const [code, setCode] = useState('');
  const [identified, setIdentified] = useState('');
  const [reason, setReason] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const acting = useRef(false);
  const first = useRef(profile.version);

  async function run(work: () => Promise<void>, refusal: (failure: ApiError) => string | null) {
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    try {
      await work();
    } catch (failure) {
      setMessage((failure instanceof ApiError ? refusal(failure) : null) ?? t('genericError'));
    } finally {
      acting.current = false;
    }
  }

  function sendCode() {
    const number = phone.trim();
    if (!E164.test(number)) {
      setMessage(t('dcPhoneNeeds'));
      return;
    }
    return run(async () => {
      const sent = await client.post('/api/admin/v1/drivers/{driver_id}/phone/new-code' as never, {params: {
        driver_id: driverId}, body: {phone: number}} as never) as {challenge_id: string; resend_available_at: string};
      setChallenge(sent.challenge_id);
      setMessage(t('dcCodeSent', {at: utc(sent.resend_available_at)}));
    }, failure => failure.status === 409 ? t('dcSamePhone') : null);
  }

  function changePhone() {
    if (!challenge) return;
    if (!CODE.test(code.trim()) || !identified.trim()) {
      setMessage(t('dcCodeNeeds'));
      return;
    }
    return run(async () => {
      const changed = await client.post('/api/admin/v1/drivers/{driver_id}/phone' as never, {params: {
        driver_id: driverId}, body: {command_id: newId(), expected_version: first.current,
        new_challenge_id: challenge, new_code: code.trim(), reason: identified.trim()}} as never) as
        {phone: string; version: number};
      onPhone(changed.phone, changed.version);
      setChallenge(null);
      setPhone('');
      setCode('');
      setIdentified('');
      setMessage(t('dcPhoneChanged'));
    }, failure => failure.code === 'OTP_INVALID' ? t('dcCodeWrong')
      : failure.status === 409 ? t('dcPhoneTaken') : null);
  }

  function setTerminal() {
    const why = reason.trim();
    if (!why || why.length > 1000) {
      setMessage(t('dcReasonNeeds'));
      return;
    }
    const wanted = Boolean(profile.has_payment_terminal);
    return run(async () => {
      onProfile(await client.post('/api/admin/v1/drivers/{driver_id}/payment-terminal' as never, {params: {
        driver_id: driverId}, body: {command_id: newId(), expected_version: profile.version, has_terminal: wanted,
        reason: why}} as never) as P);
      setReason('');
    }, failure => {
      if (failure.status !== 409) return null;
      void reread().catch(() => undefined);
      return t('dcChanged');
    });
  }

  return (
    <>
      <fieldset>
        <legend>{t('dcPhoneTitle')}</legend>
        <label>{t('dcNewPhone')}<input type="tel" value={phone} onChange={e => setPhone(e.target.value)} /></label>
        <button type="button" onClick={() => void sendCode()}>{t('dcSendCode')}</button>
        {challenge ? (
          <>
            <label>{t('dcCode')}<input inputMode="numeric" value={code} onChange={e => setCode(e.target.value)} />
            </label>
            <label>{t('dcIdentified')}<input value={identified} onChange={e => setIdentified(e.target.value)} />
            </label>
            <button type="button" onClick={() => void changePhone()}>{t('dcChangePhone')}</button>
          </>
        ) : null}
      </fieldset>
      <fieldset>
        <legend>{t('dcTerminal', {state: t(profile.has_payment_terminal ? 'dcTerminalYes' : 'dcTerminalNo')})}</legend>
        <label>{t('dcTerminalReason')}<input value={reason} onChange={e => setReason(e.target.value)} /></label>
        <button type="button" onClick={() => void setTerminal()}>
          {t(profile.has_payment_terminal ? 'dcTerminalOff' : 'dcTerminalOn')}</button>
      </fieldset>
      {message ? <p role="status">{message}</p> : null}
    </>
  );
}
