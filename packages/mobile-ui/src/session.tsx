import {useCallback, useEffect, useRef, useState, type ReactNode} from 'react';
import {ActivityIndicator, Text} from 'react-native';
import {ApiError, UpgradeRequiredError, type ApiClient, type Session} from '@blizz/api-client';
import {Alert, Button, Field, Screen, useTheme} from './ui';
import type {Locale, Translate} from './i18n';

export type Guard = <T>(action: () => Promise<T>) => Promise<T>;

/** What a screen needs from its app: the client, the texts, the 426 guard and the failure text. */
export interface Shared {
  client: ApiClient;
  t: Translate;
  guard: Guard;
  failure: (error: unknown) => string;
}

/** The session as the client sees it, restored from the stored refresh token once at start. */
export function useAppSession(client: ApiClient) {
  const [session, setSession] = useState(() => client.sessionSnapshot());
  const [restored, setRestored] = useState(session.authenticated);
  useEffect(() => client.subscribe(() => setSession(client.sessionSnapshot())), [client]);
  useEffect(() => {
    if (restored) return;
    let current = true;
    client.restoreSession().catch(() => undefined).finally(() => {if (current) setRestored(true);});
    return () => {current = false;};
  }, [client, restored]);
  return {session, restored};
}

/** A 426 on any action blocks the app on the update screen, with no way around it (REQ-API-10). */
export function useUpgradeGuard(): {upgrade: boolean; guard: Guard} {
  const [upgrade, setUpgrade] = useState(false);
  const guard = useCallback(async <T,>(action: () => Promise<T>): Promise<T> => {
    try {
      return await action();
    } catch (error) {
      if (error instanceof UpgradeRequiredError) setUpgrade(true);
      throw error;
    }
  }, []) as Guard;
  return {upgrade, guard};
}

/** No connection, or a failure the screen cannot explain: a generic text with the request's correlation id. */
export function failureText(t: Translate) {
  return (error: unknown): string => {
    if (error instanceof ApiError && error.status === 0) return t('offline');
    const id = error instanceof ApiError ? error.correlation_id : null;
    return t('genericError') + (id ? ' ' + t('correlation', {id}) : '');
  };
}

export function UpdateScreen({t}: {t: Translate}) {
  const theme = useTheme();
  return <Screen title={t('updateTitle')}><Text style={{color: theme.muted}}>{t('updateText')}</Text></Screen>;
}

export function Loading({t}: {t: Translate}) {
  return <Screen><ActivityIndicator accessibilityLabel={t('loading')} /></Screen>;
}

type Challenge = {challenge_id: string; expires_at: string; resend_available_at: string; channel?: 'SMS' | 'VOICE'};

/**
 * Sign-in by a one-time code (audience CLIENT or DRIVER) in the app's taxi service: the code by SMS or a call as the
 * server answers, a resend only after resend_available_at, and an expired code told apart by its expires_at.
 */
export function SignIn({client, t, guard, failure, audience, service, deviceRef, now}: Shared & {
  audience: 'CLIENT' | 'DRIVER'; service: string; deviceRef: string; now: () => number}) {
  const [phone, setPhone] = useState('');
  const [phoneError, setPhoneError] = useState<string | null>(null);
  const [challenge, setChallenge] = useState<Challenge | null>(null);
  const [code, setCode] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const [busy, setBusy] = useState(false);
  const [clock, setClock] = useState(now());
  const theme = useTheme();

  useEffect(() => {
    if (!challenge) return;
    const timer = setInterval(() => setClock(now()), 1000);
    return () => clearInterval(timer);
  }, [challenge, now]);

  async function ask(channel?: 'VOICE') {
    setBusy(true);
    setMessage(null);
    setPhoneError(null);
    try {
      const issued = await guard(() => client.post('/auth/v1/otp/challenges', {body: {
        audience, phone, device_ref: deviceRef, service, channel: channel ?? null
      }})) as Challenge;
      setChallenge(issued);
      setCode('');
      setClock(now());
    } catch (error) {
      if (error instanceof ApiError && error.code === 'PHONE_COUNTRY_NOT_SERVED') setPhoneError(t('countryNotServed'));
      else if (error instanceof ApiError && error.status === 400) setPhoneError(t('phoneTooShort'));
      else if (error instanceof ApiError && error.status === 429) {
        setMessage(t('tryAgainIn', {seconds: error.retryAfterSeconds ?? 60}));
      } else setMessage(failure(error));
    } finally {
      setBusy(false);
    }
  }

  async function verify() {
    if (!challenge) return;
    if (Date.parse(challenge.expires_at) <= now()) {
      setMessage(t('codeExpired'));
      return;
    }
    setBusy(true);
    setMessage(null);
    try {
      const session = await guard(() => client.post('/auth/v1/otp/verify', {body: {
        challenge_id: challenge.challenge_id, code, device_ref: deviceRef
      }})) as Session;
      client.startSession(session);
    } catch (error) {
      if (error instanceof ApiError && error.code === 'OTP_INVALID') {
        setMessage(Date.parse(challenge.expires_at) <= now() ? t('codeExpired') : t('wrongCode'));
      } else if (error instanceof ApiError && error.status === 429) {
        setMessage(t('tryAgainIn', {seconds: error.retryAfterSeconds ?? 60}));
      } else setMessage(failure(error));
    } finally {
      setBusy(false);
    }
  }

  if (!challenge) {
    return (
      <Screen title={t('signInTitle')}>
        <Field label={t('phone')} value={phone} onChange={setPhone} keyboard="phone-pad" error={phoneError} />
        <Button label={t('getCode')} onPress={() => void ask()} disabled={busy || phone.trim() === ''} />
        <Alert text={message} />
      </Screen>
    );
  }
  const wait = Math.max(0, Math.ceil((Date.parse(challenge.resend_available_at) - clock) / 1000));
  const expired = Date.parse(challenge.expires_at) <= clock;
  return (
    <Screen title={t('signInTitle')}>
      <Text style={{color: theme.muted}}>{challenge.channel === 'VOICE' ? t('codeByCall') : t('codeBySms')}</Text>
      <Field label={t('code')} value={code} onChange={setCode} keyboard="number-pad" />
      <Button label={t('confirm')} onPress={() => void verify()} disabled={busy || code.length < 4} />
      {wait > 0 ? <Text style={{color: theme.muted}}>{t('resendIn', {seconds: wait})}</Text> : null}
      <Button label={t('resend')} onPress={() => void ask()} disabled={busy || wait > 0} />
      <Button label={t('callMe')} onPress={() => void ask('VOICE')} disabled={busy || wait > 0} />
      <Alert text={expired && !message ? t('codeExpired') : message} />
    </Screen>
  );
}

type LegalDoc = {version_id: string; audience: string; kind: string; acceptance_required: boolean; accepted: boolean;
  languages: string[]};

/**
 * The texts in force that must be accepted block everything else until accepted (REQ-PRV-08): one at a time, with
 * one command id per text, so a double tap or a retry is the same acceptance.
 */
export function LegalGuard({client, t, guard, failure, app, service, locale, newId, children}: Shared & {
  app: 'rider' | 'driver'; service: string; locale: Locale; newId: () => string; children: ReactNode}) {
  const [docs, setDocs] = useState<LegalDoc[] | null>(null);
  const [error, setError] = useState<string | null>(null);
  const [attempt, setAttempt] = useState(0);
  const path = app === 'rider' ? '/api/rider/v1/legal' : '/api/driver/v1/legal';

  useEffect(() => {
    let current = true;
    setError(null);
    guard(() => client.get(path as never, {} as never))
      .then(value => {if (current) setDocs((value as {documents: LegalDoc[]}).documents);})
      .catch(failed => {if (current) setError(failure(failed));});
    return () => {current = false;};
  }, [client, guard, attempt, path]); // the failure text follows the same texts

  if (error) {
    return (
      <Screen>
        <Alert text={error} />
        <Button label={t('retry')} onPress={() => setAttempt(a => a + 1)} />
      </Screen>
    );
  }
  if (!docs) return <Loading t={t} />;
  const pending = docs.find(d => d.acceptance_required && !d.accepted);
  if (!pending) return <>{children}</>;
  return <LegalText key={pending.version_id} doc={pending} client={client} t={t} guard={guard} failure={failure}
    app={app} service={service} locale={locale} newId={newId}
    onAccepted={() => setDocs(all => all?.map(d => d.version_id === pending.version_id ? {...d, accepted: true} : d)
      ?? null)} />;
}

function LegalText({doc, client, t, guard, failure, app, service, locale, newId, onAccepted}: Shared & {
  doc: LegalDoc; app: 'rider' | 'driver'; service: string; locale: Locale; newId: () => string;
  onAccepted: () => void}) {
  const language = doc.languages.includes(locale) ? locale : doc.languages[0] ?? 'uk';
  const [text, setText] = useState<string | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const [sending, setSending] = useState(false);
  const commandId = useRef(newId());
  const inFlight = useRef(false);
  const theme = useTheme();

  useEffect(() => {
    let current = true;
    guard(() => client.get('/api/config/v1/legal/{audience}/{kind}' as never, {
      params: {audience: doc.audience.toLowerCase(), kind: doc.kind.toLowerCase()}, query: {language, service}
    } as never))
      .then(value => {if (current) setText((value as {text: string}).text);})
      .catch(failed => {if (current) setMessage(failure(failed));});
    return () => {current = false;};
  }, [client, guard, doc, language, service]); // the failure text follows the same texts

  async function accept() {
    inFlight.current = true;
    setSending(true);
    setMessage(null);
    try {
      const path = app === 'rider' ? '/api/rider/v1/legal/acceptances' : '/api/driver/v1/legal/acceptances';
      await guard(() => client.post(path as never, {body: {
        command_id: commandId.current, version_id: doc.version_id, language
      }} as never));
      onAccepted();
    } catch (error) {
      setMessage(failure(error));
    } finally {
      inFlight.current = false;
      setSending(false);
    }
  }

  void sending; // mutation: the button stays enabled while an acceptance is on its way
  return (
    <Screen title={t('legalTitle')}>
      {text === null && !message ? <ActivityIndicator accessibilityLabel={t('loading')} /> : null}
      {text !== null ? <Text style={{color: theme.text}}>{text}</Text> : null}
      <Button label={t('accept')} onPress={() => void accept()} disabled={text === null} />
      <Alert text={message} />
    </Screen>
  );
}
