import {useCallback, useEffect, useRef, useState, type ReactNode} from 'react';
import {ActivityIndicator, Pressable, ScrollView, StyleSheet, Text, TextInput, useColorScheme, View} from 'react-native';
import {ApiError, UpgradeRequiredError, type ApiClient, type Session} from '@blizz/api-client';
import {translate, type Locale} from './i18n';

/** What the build knows: its taxi service, the installation and the locale (ADR 0016, REQ-API-10). */
export interface AppConfig {
  service: string;
  deviceRef: string;
  locale?: Locale;
  newId?: () => string;
  now?: () => number;
}

type Challenge = {challenge_id: string; expires_at: string; resend_available_at: string; channel?: 'SMS' | 'VOICE'};
type LegalDoc = {version_id: string; audience: string; kind: string; acceptance_required: boolean; accepted: boolean;
  languages: string[]};

const palette = {
  light: {background: '#FFFFFF', text: '#111827', muted: '#4B5563', accent: '#F5B700', onAccent: '#111827',
    error: '#B91C1C', border: '#D1D5DB'},
  dark: {background: '#111827', text: '#F9FAFB', muted: '#D1D5DB', accent: '#F5B700', onAccent: '#111827',
    error: '#FCA5A5', border: '#374151'}
};

function useTheme() {
  return palette[useColorScheme() === 'dark' ? 'dark' : 'light'];
}

function Button({label, onPress, disabled}: {label: string; onPress: () => void; disabled?: boolean}) {
  const theme = useTheme();
  return (
    <Pressable accessibilityRole="button" accessibilityLabel={label} accessibilityState={{disabled: Boolean(disabled)}}
      disabled={disabled} onPress={onPress}
      style={[styles.button, {backgroundColor: theme.accent, opacity: disabled ? 0.5 : 1}]}>
      <Text style={[styles.buttonText, {color: theme.onAccent}]}>{label}</Text>
    </Pressable>
  );
}

function Field({label, value, onChange, keyboard, error}: {label: string; value: string;
  onChange: (value: string) => void; keyboard?: 'phone-pad' | 'number-pad'; error?: string | null}) {
  const theme = useTheme();
  return (
    <View style={styles.field}>
      <Text style={{color: theme.muted}}>{label}</Text>
      <TextInput accessibilityLabel={label} value={value} onChangeText={onChange} keyboardType={keyboard}
        style={[styles.input, {color: theme.text, borderColor: error ? theme.error : theme.border}]} />
      {error ? <Text accessibilityRole="alert" style={{color: theme.error}}>{error}</Text> : null}
    </View>
  );
}

function Screen({title, children}: {title?: string; children: ReactNode}) {
  const theme = useTheme();
  return (
    <ScrollView style={{backgroundColor: theme.background}} contentContainerStyle={styles.screen}>
      {title ? <Text accessibilityRole="header" style={[styles.title, {color: theme.text}]}>{title}</Text> : null}
      {children}
    </ScrollView>
  );
}

export function RiderApp({client, config}: {client: ApiClient; config: AppConfig}) {
  const locale = config.locale ?? 'ru';
  const t = useCallback((key: string, values?: Record<string, string | number>) => translate(locale, key, values),
    [locale]);
  const newId = config.newId ?? (() => globalThis.crypto.randomUUID());
  const now = config.now ?? (() => Date.now());
  const theme = useTheme();

  const [session, setSession] = useState(() => client.sessionSnapshot());
  const [restored, setRestored] = useState(session.authenticated);
  const [upgrade, setUpgrade] = useState(false);
  useEffect(() => client.subscribe(() => setSession(client.sessionSnapshot())), [client]);
  useEffect(() => {
    if (restored) return;
    let current = true;
    client.restoreSession().catch(() => undefined).finally(() => {if (current) setRestored(true);});
    return () => {current = false;};
  }, [client, restored]);

  /** A 426 on any action blocks the app on the update screen, with no way around it (REQ-API-10). */
  const guard = useCallback(async <T,>(action: () => Promise<T>): Promise<T> => {
    try {
      return await action();
    } catch (error) {
      if (error instanceof UpgradeRequiredError) setUpgrade(true);
      throw error;
    }
  }, []);

  const failure = (error: unknown): string => {
    if (error instanceof ApiError && error.status === 0) return t('offline');
    const id = error instanceof ApiError ? error.correlation_id : null;
    return t('genericError') + (id ? ' ' + t('correlation', {id}) : '');
  };

  if (upgrade) {
    return <Screen title={t('updateTitle')}><Text style={{color: theme.muted}}>{t('updateText')}</Text></Screen>;
  }
  if (!restored && !session.authenticated) {
    return <Screen><ActivityIndicator accessibilityLabel={t('loading')} /></Screen>;
  }
  if (!session.authenticated) {
    return <SignIn client={client} config={config} t={t} guard={guard} failure={failure} now={now} />;
  }
  return <SignedIn client={client} t={t} guard={guard} failure={failure} newId={newId} locale={locale}
    service={config.service} />;
}

type Common = {
  client: ApiClient;
  t: (key: string, values?: Record<string, string | number>) => string;
  guard: <T>(action: () => Promise<T>) => Promise<T>;
  failure: (error: unknown) => string;
};

function SignIn({client, config, t, guard, failure, now}: Common & {config: AppConfig; now: () => number}) {
  const [phone, setPhone] = useState('');
  const [phoneError, setPhoneError] = useState<string | null>(null);
  const [challenge, setChallenge] = useState<Challenge | null>(null);
  const [code, setCode] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const [busy, setBusy] = useState(false);
  const [clock, setClock] = useState(now());

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
        audience: 'CLIENT', phone, device_ref: config.deviceRef, service: config.service, channel: channel ?? null
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
        challenge_id: challenge.challenge_id, code, device_ref: config.deviceRef
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

  const theme = useTheme();
  if (!challenge) {
    return (
      <Screen title={t('signInTitle')}>
        <Field label={t('phone')} value={phone} onChange={setPhone} keyboard="phone-pad" error={phoneError} />
        <Button label={t('getCode')} onPress={() => void ask()} disabled={busy || phone.trim() === ''} />
        {message ? <Text accessibilityRole="alert" style={{color: theme.error}}>{message}</Text> : null}
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
      {expired && !message ? <Text accessibilityRole="alert" style={{color: theme.error}}>{t('codeExpired')}</Text>
        : null}
      {message ? <Text accessibilityRole="alert" style={{color: theme.error}}>{message}</Text> : null}
    </Screen>
  );
}

function SignedIn({client, t, guard, failure, newId, locale, service}: Common & {newId: () => string;
  locale: Locale; service: string}) {
  const [docs, setDocs] = useState<LegalDoc[] | null>(null);
  const [error, setError] = useState<string | null>(null);
  const [attempt, setAttempt] = useState(0);

  useEffect(() => {
    let current = true;
    setError(null);
    guard(() => client.get('/api/rider/v1/legal'))
      .then(value => {if (current) setDocs((value as {documents: LegalDoc[]}).documents);})
      .catch(failed => {if (current) setError(failure(failed));});
    return () => {current = false;};
  }, [client, guard, attempt]);

  const theme = useTheme();
  if (error) {
    return (
      <Screen>
        <Text accessibilityRole="alert" style={{color: theme.error}}>{error}</Text>
        <Button label={t('retry')} onPress={() => setAttempt(a => a + 1)} />
      </Screen>
    );
  }
  if (!docs) return <Screen><ActivityIndicator accessibilityLabel={t('loading')} /></Screen>;
  const pending = docs.find(d => d.acceptance_required && !d.accepted);
  if (pending) {
    return <LegalGate key={pending.version_id} doc={pending} client={client} t={t} guard={guard} failure={failure}
      newId={newId} locale={locale} service={service}
      onAccepted={() => setDocs(all => all?.map(d => d.version_id === pending.version_id
        ? {...d, accepted: true} : d) ?? null)} />;
  }
  return <Profile client={client} t={t} guard={guard} failure={failure} newId={newId} />;
}

function LegalGate({doc, client, t, guard, failure, newId, locale, service, onAccepted}: Common & {doc: LegalDoc;
  newId: () => string; locale: Locale; service: string; onAccepted: () => void}) {
  const language = doc.languages.includes(locale) ? locale : doc.languages[0] ?? 'uk';
  const [text, setText] = useState<string | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const [sending, setSending] = useState(false);
  /** One command for this text: a double tap or a retry is the same acceptance (REQ-PRV-08, #137 E4). */
  const commandId = useRef(newId());
  const inFlight = useRef(false);

  useEffect(() => {
    let current = true;
    guard(() => client.get('/api/config/v1/legal/{audience}/{kind}' as never, {
      params: {audience: doc.audience.toLowerCase(), kind: doc.kind.toLowerCase()}, query: {language, service}
    } as never))
      .then(value => {if (current) setText((value as {text: string}).text);})
      .catch(failed => {if (current) setMessage(failure(failed));});
    return () => {current = false;};
  }, [client, guard, doc, language]);

  async function accept() {
    inFlight.current = true;
    setSending(true);
    setMessage(null);
    try {
      await guard(() => client.post('/api/rider/v1/legal/acceptances', {body: {
        command_id: commandId.current, version_id: doc.version_id, language: language as 'uk'
      }}));
      onAccepted();
    } catch (error) {
      setMessage(failure(error));
    } finally {
      inFlight.current = false;
      setSending(false);
    }
  }

  const theme = useTheme();
  void sending; // mutation: the button stays enabled while an acceptance is on its way
  return (
    <Screen title={t('legalTitle')}>
      {text === null && !message ? <ActivityIndicator accessibilityLabel={t('loading')} /> : null}
      {text !== null ? <Text style={{color: theme.text}}>{text}</Text> : null}
      <Button label={t('accept')} onPress={() => void accept()} disabled={text === null} />
      {message ? <Text accessibilityRole="alert" style={{color: theme.error}}>{message}</Text> : null}
    </Screen>
  );
}

function Profile({client, t, guard, failure, newId}: Common & {newId: () => string}) {
  const [me, setMe] = useState<{account_state: string} | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const [deletion, setDeletion] = useState<{challenge_id: string} | null>(null);
  const [code, setCode] = useState('');
  const commandId = useRef(newId());

  useEffect(() => {
    let current = true;
    guard(() => client.get('/api/rider/v1/me'))
      .then(value => {if (current) setMe(value as {account_state: string});})
      .catch(failed => {if (current) setMessage(failure(failed));});
    return () => {current = false;};
  }, [client, guard]);

  async function askDeletion() {
    try {
      setDeletion(await guard(() => client.post('/api/rider/v1/me/deletion-request/challenge')) as
        {challenge_id: string});
    } catch (error) {
      setMessage(failure(error));
    }
  }

  async function confirmDeletion() {
    if (!deletion) return;
    try {
      const status = await guard(() => client.post('/api/rider/v1/me/deletion-request', {body: {
        command_id: commandId.current, challenge_id: deletion.challenge_id, otp_code: code
      }})) as {account_state: string};
      setMe(status);
      setDeletion(null);
      setMessage(t('deletionRequested'));
    } catch (error) {
      setMessage(error instanceof ApiError && error.code === 'OTP_INVALID' ? t('wrongCode') : failure(error));
    }
  }

  const theme = useTheme();
  return (
    <Screen title={t('profile')}>
      {me ? <Text style={{color: theme.text}}>{t('accountState')}: {me.account_state}</Text>
        : !message ? <ActivityIndicator accessibilityLabel={t('loading')} /> : null}
      {deletion ? (
        <>
          <Field label={t('deleteCode')} value={code} onChange={setCode} keyboard="number-pad" />
          <Button label={t('confirmDeletion')} onPress={() => void confirmDeletion()} disabled={code.length < 4} />
        </>
      ) : <Button label={t('deleteAccount')} onPress={() => void askDeletion()} />}
      <Button label={t('signOut')} onPress={() => void client.logout()} />
      {message ? <Text accessibilityRole="alert" style={{color: theme.error}}>{message}</Text> : null}
    </Screen>
  );
}

const styles = StyleSheet.create({
  screen: {padding: 24, gap: 16, flexGrow: 1},
  title: {fontSize: 24, fontWeight: '700'},
  field: {gap: 6},
  input: {borderWidth: 1, borderRadius: 12, paddingHorizontal: 14, paddingVertical: 12, fontSize: 18},
  button: {borderRadius: 12, paddingVertical: 14, alignItems: 'center'},
  buttonText: {fontSize: 17, fontWeight: '600'}
});
