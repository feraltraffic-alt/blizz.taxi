import {useEffect, useMemo, useRef, useState} from 'react';
import {ActivityIndicator, Text} from 'react-native';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {
  Alert, Button, Field, LegalGuard, Loading, Screen, SignIn, UpdateScreen, failureText, translator, useAppSession,
  useTheme, useUpgradeGuard, type Locale, type Shared
} from '@blizz/mobile-ui';
import {translations} from './i18n';

/** What the build knows: its taxi service, the installation and the locale (ADR 0016, REQ-API-10). */
export interface AppConfig {
  service: string;
  deviceRef: string;
  locale?: Locale;
  newId?: () => string;
  now?: () => number;
}

export function RiderApp({client, config}: {client: ApiClient; config: AppConfig}) {
  const locale = config.locale ?? 'ru';
  const t = useMemo(() => translator(translations, locale), [locale]);
  const newId = config.newId ?? (() => globalThis.crypto.randomUUID());
  const now = config.now ?? (() => Date.now());
  const {session, restored} = useAppSession(client);
  const {upgrade, guard} = useUpgradeGuard();
  const shared: Shared = {client, t, guard, failure: failureText(t)};

  if (upgrade) return <UpdateScreen t={t} />;
  if (!restored && !session.authenticated) return <Loading t={t} />;
  if (!session.authenticated) {
    return <SignIn {...shared} audience="CLIENT" service={config.service} deviceRef={config.deviceRef} now={now} />;
  }
  return (
    <LegalGuard {...shared} app="rider" service={config.service} locale={locale} newId={newId}>
      <Profile {...shared} newId={newId} />
    </LegalGuard>
  );
}

function Profile({client, t, guard, failure, newId}: Shared & {newId: () => string}) {
  const [me, setMe] = useState<{account_state: string} | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const [deletion, setDeletion] = useState<{challenge_id: string} | null>(null);
  const [code, setCode] = useState('');
  const commandId = useRef(newId());
  const theme = useTheme();

  useEffect(() => {
    let current = true;
    guard(() => client.get('/api/rider/v1/me'))
      .then(value => {if (current) setMe(value as {account_state: string});})
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
      setMe(status);
      setDeletion(null);
      setMessage(t('deletionRequested'));
    } catch (error) {
      setMessage(error instanceof ApiError && error.code === 'OTP_INVALID' ? t('wrongCode') : failure(error));
    }
  }

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
      <Alert text={message} />
    </Screen>
  );
}
