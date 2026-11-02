import {useEffect, useMemo, useRef, useState} from 'react';
import {ActivityIndicator, Text} from 'react-native';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {
  Alert, Button, DataExports, Field, LegalGuard, Loading, PhoneChange, RIDER_CATEGORIES, Screen, SignIn, Support, UpdateScreen, failureText,
  translator, useAppSession, usePushDevice, useTheme, useUpgradeGuard, type AboutOrder, type Locale, type PickedFile,
  type PushPort, type Shared
} from '@blizz/mobile-ui';
import {translations} from './i18n';
import {Ride, type Point} from './Ride';
import {History} from './History';
import {Cards} from './Cards';
import {Debts} from './Debts';

/** What the build knows: its taxi service, the installation and the locale (ADR 0016, REQ-API-10). */
export interface AppConfig {
  service: string;
  deviceRef: string;
  /** The device's location; a refusal falls back to the service's first city (#248). */
  locate?: () => Promise<Point>;
  pollMs?: number;
  locale?: Locale;
  newId?: () => string;
  now?: () => number;
  /** The phone's pushes (#264); none in the web build. */
  push?: PushPort;
  /** Picks a file to attach to a support message (#313); none: no attaching. */
  pickFile?: () => Promise<PickedFile | null>;
}

export type {PickedFile} from '@blizz/mobile-ui';

export function RiderApp({client, config}: {client: ApiClient; config: AppConfig}) {
  const locale = config.locale ?? 'ru';
  const t = useMemo(() => translator(translations, locale), [locale]);
  const newId = config.newId ?? (() => globalThis.crypto.randomUUID());
  const now = config.now ?? (() => Date.now());
  const {session, restored} = useAppSession(client);
  const {upgrade, guard} = useUpgradeGuard();
  const shared: Shared = {client, t, guard, failure: failureText(t)};
  const [tab, setTab] = useState<Tab>('ride');
  /** A new round of the legal texts after the server said one must be accepted (ACCEPTANCE_REQUIRED, #248 E6). */
  const [legalRound, setLegalRound] = useState(0);

  if (upgrade) return <UpdateScreen t={t} />;
  if (!restored && !session.authenticated) return <Loading t={t} />;
  if (!session.authenticated) {
    return <SignIn {...shared} audience="CLIENT" service={config.service} deviceRef={config.deviceRef} now={now} />;
  }
  return (
    <LegalGuard key={legalRound} {...shared} app="rider" service={config.service} locale={locale} newId={newId}>
      <Home shared={shared} config={config} newId={newId} locale={locale} tab={tab} setTab={setTab}
        onLegal={() => setLegalRound(r => r + 1)} />
    </LegalGuard>
  );
}

/** The rider's side of support (#296). */
const RIDER_SIDE = {api: '/api/rider/v1', me: 'CLIENT', categories: RIDER_CATEGORIES} as const;

type Tab = 'ride' | 'profile' | 'history' | 'cards' | 'support' | 'phone' | 'data' | 'debts';

/** Signed in, the texts accepted: the phone registers for pushes (#264) and the tabs are shown. */
function Home({shared, config, newId, locale, tab, setTab, onLegal}: {shared: Shared; config: AppConfig;
  newId: () => string; locale: Locale; tab: Tab; setTab: (tab: Tab) => void; onLegal: () => void}) {
  const [about, setAbout] = useState<AboutOrder | null>(null);
  const {signOut} = usePushDevice(shared.client, config.push, '/api/rider/v1', newId, locale);
  const t = shared.t;
  if (tab === 'cards') {
    return <Cards {...shared} newId={newId} service={config.service} pollMs={config.pollMs ?? 5000}
      onBack={() => setTab('profile')} />;
  }
  if (tab === 'debts') {
    return <Debts {...shared} newId={newId} pollMs={config.pollMs ?? 5000} onBack={() => setTab('profile')} />;
  }
  if (tab === 'data') {
    return <DataExports {...shared} newId={newId} api="/api/rider/v1" pollMs={config.pollMs ?? 5000}
      backLabel={t('toProfile')} onBack={() => setTab('profile')} />;
  }
  if (tab === 'phone') {
    return <PhoneChange {...shared} newId={newId} api="/api/rider/v1" backLabel={t('toProfile')}
      onBack={() => setTab('profile')} />;
  }
  if (tab === 'history') {
    return <History {...shared} newId={newId} pollMs={config.pollMs ?? 5000} onBack={() => setTab('ride')}
      onSupport={order => {setAbout(order); setTab('support');}} />;
  }
  if (tab === 'support') {
    return <Support {...shared} newId={newId} side={RIDER_SIDE} about={about} backLabel={t('toRide')}
      pickFile={config.pickFile}
      onBack={() => {setAbout(null); setTab('ride');}} />;
  }
  return tab === 'profile' ? (
    <>
      <Profile {...shared} newId={newId} signOut={signOut} onCards={() => setTab('cards')}
        onPhone={() => setTab('phone')} onData={() => setTab('data')} onDebts={() => setTab('debts')} />
      <Button label={t('toRide')} onPress={() => setTab('ride')} />
    </>
  ) : (
    <>
      <Ride {...shared} newId={newId} service={config.service} pollMs={config.pollMs ?? 5000} push={config.push}
        locate={config.locate ?? (() => Promise.reject(new Error('No location')))} onLegal={onLegal}
        onDebts={() => setTab('debts')} />
      <Button label={t('toHistory')} onPress={() => setTab('history')} />
      <Button label={t('support')} onPress={() => setTab('support')} />
      <Button label={t('toProfile')} onPress={() => setTab('profile')} />
    </>
  );
}

function Profile({client, t, guard, failure, newId, signOut, onCards, onPhone, onData, onDebts}: Shared & {
  newId: () => string; signOut: () => Promise<void>; onCards: () => void; onPhone: () => void; onData: () => void;
  onDebts: () => void}) {
  const [me, setMe] = useState<{account_state: string; phone?: string | null; name?: string | null} | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const [deletion, setDeletion] = useState<{challenge_id: string} | null>(null);
  const [code, setCode] = useState('');
  const commandId = useRef(newId());
  const theme = useTheme();

  useEffect(() => {
    let current = true;
    guard(() => client.get('/api/rider/v1/me'))
      .then(value => {if (current) setMe(value as {account_state: string; phone: string | null; name: string | null});})
      .catch(failed => {if (current) setMessage(failure(failed));});
    return () => {current = false;};
  }, [client, guard]); // the failure text follows the same texts

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
      setMe(old => ({...old, ...status}));
      setDeletion(null);
      setMessage(t('deletionRequested'));
    } catch (error) {
      setMessage(error instanceof ApiError && error.code === 'OTP_INVALID' ? t('wrongCode') : failure(error));
    }
  }

  return (
    <Screen title={t('profile')}>
      {me?.name ? <Text style={{color: theme.text, fontSize: 20}}>{me.name}</Text> : null}
      {me?.phone ? <Text style={{color: theme.text}}>{me.phone}</Text> : null}
      {me ? <Text style={{color: theme.muted}}>{t('accountState')}: {me.account_state}</Text>
        : !message ? <ActivityIndicator accessibilityLabel={t('loading')} /> : null}
      {deletion ? (
        <>
          <Field label={t('deleteCode')} value={code} onChange={setCode} keyboard="number-pad" />
          <Button label={t('confirmDeletion')} onPress={() => void confirmDeletion()} disabled={code.length < 4} />
        </>
      ) : <Button label={t('deleteAccount')} onPress={() => void askDeletion()} />}
      <Button label={t('myCards')} onPress={onCards} />
      <Button label={t('pcChange')} onPress={onPhone} />
      <Button label={t('exTitle')} onPress={onData} />
      <Button label={t('debts')} onPress={onDebts} />
      <Button label={t('signOut')} onPress={() => void signOut()} />
      <Alert text={message} />
    </Screen>
  );
}
