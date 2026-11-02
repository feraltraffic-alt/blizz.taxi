import {useCallback, useEffect, useMemo, useRef, useState} from 'react';
import {Text} from 'react-native';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {
  Alert, Button, LegalGuard, Loading, Screen, SignIn, UpdateScreen, failureText, translator, useAppSession,
  useTheme, useUpgradeGuard, type Locale, type Shared
} from '@blizz/mobile-ui';
import {translations} from './i18n';

export interface Position {
  lat: number;
  lon: number;
  accuracy_m?: number;
}

/** What the build and the device give: the service, the installation, the location, the heartbeat interval. */
export interface AppConfig {
  service: string;
  deviceRef: string;
  locate: () => Promise<Position>;
  heartbeatMs?: number;
  locale?: Locale;
  newId?: () => string;
  now?: () => number;
}

type Profile = {account_state: string; review_status: string; admission_city_ids: string[];
  vehicles: {id: string; state: string}[]; documents: {type: string; decision: string; decision_reason?: string}[]};
type Availability = {session_id?: string | null; session_version: number; session_state: string};

export function DriverApp({client, config}: {client: ApiClient; config: AppConfig}) {
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
    return <SignIn {...shared} audience="DRIVER" service={config.service} deviceRef={config.deviceRef} now={now} />;
  }
  return (
    <LegalGuard {...shared} app="driver" service={config.service} locale={locale} newId={newId}>
      <Work {...shared} config={config} newId={newId} now={now} />
    </LegalGuard>
  );
}

/** Admitted means: an active account, an approved review, at least one city and an approved vehicle. */
function admitted(profile: Profile): boolean {
  return profile.account_state === 'ACTIVE' && profile.review_status === 'APPROVED'
    && profile.admission_city_ids.length > 0 && profile.vehicles.some(v => v.state === 'APPROVED');
}

function Work({client, t, guard, failure, config, newId, now}: Shared & {config: AppConfig; newId: () => string;
  now: () => number}) {
  const [profile, setProfile] = useState<Profile | null>(null);
  const [availability, setAvailability] = useState<Availability | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const [lost, setLost] = useState(false);
  const [busy, setBusy] = useState(false);
  const [attempt, setAttempt] = useState(0);
  const sequence = useRef(now());
  const theme = useTheme();

  /** The server's state, never the app's memory: also after a restart (E5). */
  const load = useCallback(async () => {
    const [p, a] = await Promise.all([
      guard(() => client.get('/api/driver/v1/profile')),
      guard(() => client.get('/api/driver/v1/work-sessions/current'))
    ]);
    setProfile(p as Profile);
    setAvailability(a as Availability);
  }, [client, guard]);

  useEffect(() => {
    setMessage(null);
    load().catch(error => setMessage(failure(error)));
  }, [load, attempt]); // the failure text follows the same texts

  async function location() {
    const position = await config.locate();
    sequence.current = Math.max(sequence.current + 1, now());
    return {lat: position.lat, lon: position.lon, accuracy_m: position.accuracy_m,
      recorded_at: new Date(now()).toISOString(), sequence: sequence.current};
  }

  const online = availability?.session_state === 'OPEN' && availability.session_id;

  useEffect(() => {
    if (!online) return;
    const id = availability.session_id as string;
    const timer = setInterval(() => {
      location()
        .then(where => guard(() => client.post('/api/driver/v1/work-sessions/{id}/heartbeat' as never,
          {params: {id}, body: {location: where}} as never)))
        .then(answer => {
          setLost(false);
          setAvailability(answer as Availability);
        })
        .catch(error => {
          // The session stays as the server keeps it; a lost connection is shown and the next beat retries (E6).
          if (error instanceof ApiError && error.status === 0) setLost(true);
          else setMessage(failure(error));
        });
    }, config.heartbeatMs ?? 15_000);
    return () => clearInterval(timer);
  }, [online, availability?.session_id]); // the beat restarts only with another session

  async function goOnline() {
    if (!profile) return;
    const vehicle = profile.vehicles.find(v => v.state === 'APPROVED');
    if (!vehicle) return;
    setBusy(true);
    setMessage(null);
    try {
      let where;
      try {
        where = await location();
      } catch {
        setMessage(t('noLocation'));
        return;
      }
      setAvailability(await guard(() => client.post('/api/driver/v1/work-sessions', {body: {
        command_id: newId(), vehicle_id: vehicle.id, location: where
      }})) as Availability);
    } catch (error) {
      if (error instanceof ApiError && error.code === 'STATE_CONFLICT') {
        setMessage(t('otherDevice'));
        await load().catch(() => undefined);
      } else if (error instanceof ApiError && error.status === 422) {
        setMessage(t('noCityHere'));
      } else if (error instanceof ApiError && (error.status === 403 || error.status === 409)) {
        setMessage(t('refused', {reason: error.code}));
      } else setMessage(failure(error));
    } finally {
      setBusy(false);
    }
  }

  async function goOffline() {
    if (!availability?.session_id) return;
    setBusy(true);
    setMessage(null);
    try {
      setAvailability(await guard(() => client.post('/api/driver/v1/work-sessions/{id}/close' as never, {
        params: {id: availability.session_id}, body: {command_id: newId(), expected_version: availability.session_version}
      } as never)) as Availability);
    } catch (error) {
      setMessage(failure(error));
      await load().catch(() => undefined);
    } finally {
      setBusy(false);
    }
  }

  if (!profile || !availability) {
    return message ? (
      <Screen>
        <Alert text={message} />
        <Button label={t('retry')} onPress={() => setAttempt(a => a + 1)} />
      </Screen>
    ) : <Loading t={t} />;
  }
  const canWork = admitted(profile);
  return (
    <Screen title={t('home')}>
      <Text style={{color: theme.text}}>{online ? t('online') : t('offlineNow')}</Text>
      <Text style={{color: theme.muted}}>{t('review', {status: t('review' + profile.review_status)})}</Text>
      <Text style={{color: theme.muted}}>
        {profile.admission_city_ids.length === 0 ? t('noCities') : t('cities', {count: profile.admission_city_ids.length})}
      </Text>
      {!profile.vehicles.some(v => v.state === 'APPROVED') ? <Text style={{color: theme.muted}}>{t('noVehicle')}</Text>
        : null}
      {profile.documents.filter(d => d.decision !== 'ACCEPTED').map(d => (
        <Text key={d.type} style={{color: theme.muted}}>
          {t('document', {type: d.type, decision: d.decision})}{d.decision_reason ? ' — ' + d.decision_reason : ''}
        </Text>
      ))}
      {online ? <Button label={t('goOffline')} onPress={() => void goOffline()} disabled={busy} />
        : canWork ? <Button label={t('goOnline')} onPress={() => void goOnline()} disabled={busy} />
          : <Text style={{color: theme.muted}}>{t('notAdmitted')}</Text>}
      {lost ? <Text style={{color: theme.error}}>{t('connectionLost')}</Text> : null}
      <Alert text={message} />
      <Button label={t('signOut')} onPress={() => void client.logout()} />
    </Screen>
  );
}
