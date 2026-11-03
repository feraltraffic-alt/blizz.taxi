import {useCallback, useEffect, useRef, useState} from 'react';
import {Link} from 'react-router-dom';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

type Flag = {id: string; driver_id: string; city_id: string | null; kind: string; state: string;
  evidence: Record<string, unknown>; raised_at: string; reason: string | null; review_reason: string | null;
  version: number};

const UUID = /^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$/i;

function utc(at: string) {
  const when = new Date(at);
  return when.toLocaleDateString('ru-RU', {timeZone: 'UTC'}) + ' '
    + when.toLocaleTimeString('ru-RU', {timeZone: 'UTC', hour: '2-digit', minute: '2-digit'}) + ' UTC';
}

/**
 * Driver risk flags for holders of drivers.risk (#405): newest first, open by default, the evidence in words (never
 * coordinates), reviewed with a reason and the version, and raised by hand. A flag blocks nothing by itself.
 */
export function Risk({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const [filter, setFilter] = useState({state: 'OPEN', city: ''});
  const [flags, setFlags] = useState<Flag[] | null>(null);
  const [next, setNext] = useState<string | null>(null);
  const [cities, setCities] = useState<{id: string; name: string}[]>([]);
  const [reasons, setReasons] = useState<Record<string, string>>({});
  const [raise, setRaise] = useState({driver: '', city: '', reason: ''});
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const query = useCallback(() => ({...(filter.state ? {state: filter.state} : {}),
    ...(filter.city ? {city_id: filter.city} : {})}), [filter]);

  const read = useCallback(async (cursor: string | null) => {
    const page = await client.get('/api/admin/v1/driver-risk-flags' as never, {query: {...(cursor ? {} : query()),
      ...(cursor ? {cursor} : {})}} as never) as {flags: Flag[]; page: {next_cursor?: string | null}};
    setFlags(old => cursor ? [...(old ?? []), ...page.flags] : page.flags);
    setNext(page.page.next_cursor ?? null);
  }, [client, query]);

  useEffect(() => {
    read(null).catch(failure => setError(failure));
  }, [read]);
  useEffect(() => {
    client.get('/api/config/v1/bootstrap' as never, {} as never)
      .then(boot => setCities((boot as {cities: {id: string; name: string}[]}).cities)).catch(() => undefined);
  }, [client]);

  async function run(work: () => Promise<void>) {
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      await work();
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('riskConflict'));
        await read(null).catch(again => setError(again));
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  function review(f: Flag, action: 'confirm' | 'dismiss') {
    const reason = (reasons[f.id] ?? '').trim();
    if (!reason || reason.length > 1000) {
      setMessage(t('riskReviewNeeds'));
      return;
    }
    return run(async () => {
      const changed = await client.post(('/api/admin/v1/driver-risk-flags/{flag_id}/' + 'dismiss') as never, {params: {
        flag_id: f.id}, body: {command_id: newId(), expected_version: f.version, reason}} as never) as Flag;
      setFlags(list => (list ?? []).map(x => x.id === changed.id ? changed : x));
      if (action === 'confirm') setMessage(t('riskConfirmedNote'));
    });
  }

  function raiseFlag() {
    const driver = raise.driver.trim();
    const reason = raise.reason.trim();
    if (!UUID.test(driver) || !raise.city || !reason || reason.length > 1000) {
      setMessage(t('riskRaiseNeeds'));
      return;
    }
    return run(async () => {
      const raised = await client.post('/api/admin/v1/driver-risk-flags' as never, {body: {command_id: newId(),
        driver_id: driver, city_id: raise.city, reason}} as never) as Flag;
      setFlags(list => [raised, ...(list ?? [])]);
      setRaise({driver: '', city: '', reason: ''});
    });
  }

  const evidence = (f: Flag) => {
    const e = f.evidence ?? {};
    if (f.kind === 'IMPOSSIBLE_MOVEMENT' && e.speed_kph != null) {
      return [t('riskMovement', {speed: String(e.speed_kph), metres: String(e.distance_m), seconds: String(e.seconds)})];
    }
    if (f.kind === 'DUPLICATE_DOCUMENT') return [t('riskDuplicate')];
    return [];
  };
  const line = (f: Flag) => [t('riskKind_' + f.kind), t('riskState_' + f.state), utc(f.raised_at), ...evidence(f),
    ...(f.reason ? [f.reason] : []), ...(f.review_reason ? [t('riskDecision', {reason: f.review_reason})] : [])]
    .join(' · ');
  return (
    <section aria-labelledby="risk-title">
      <h1 id="risk-title">{t('navRisk')}</h1>
      <label htmlFor="risk-state">{t('riskStateFilter')}</label>
      <select id="risk-state" value={filter.state} onChange={e => setFilter(f => ({...f, state: e.target.value}))}>
        <option value="">{t('riskAny')}</option>
        {['OPEN', 'CONFIRMED', 'DISMISSED'].map(s => <option key={s} value={s}>{t('riskState_' + s)}</option>)}
      </select>
      <label htmlFor="risk-city">{t('riskCityFilter')}</label>
      <select id="risk-city" value={filter.city} onChange={e => setFilter(f => ({...f, city: e.target.value}))}>
        <option value="">{t('riskAny')}</option>
        {cities.map(c => <option key={c.id} value={c.id}>{c.name}</option>)}
      </select>
      <ul>
        {(flags ?? []).map(f => (
          <li key={f.id}>
            <span>{line(f)}</span>
            <Link to={'/drivers/' + f.driver_id}>{t('riskDriver')}</Link>
            {f.state === 'OPEN' ? (
              <>
                <label>{t('riskReason')}<input value={reasons[f.id] ?? ''}
                  onChange={e => setReasons(all => ({...all, [f.id]: e.target.value}))} /></label>
                <button type="button" onClick={() => void review(f, 'confirm')}>{t('riskConfirm')}</button>
                <button type="button" onClick={() => void review(f, 'dismiss')}>{t('riskDismiss')}</button>
              </>
            ) : null}
          </li>
        ))}
      </ul>
      {next ? <button type="button" onClick={() => void read(next).catch(failure => setError(failure))}>
        {t('riskMore')}</button> : null}
      <fieldset>
        <legend>{t('riskRaiseTitle')}</legend>
        <label>{t('riskDriverId')}<input value={raise.driver}
          onChange={e => setRaise(r => ({...r, driver: e.target.value}))} /></label>
        <label htmlFor="risk-new-city">{t('riskNewCity')}</label>
        <select id="risk-new-city" value={raise.city} onChange={e => setRaise(r => ({...r, city: e.target.value}))}>
          <option value="">—</option>
          {cities.map(c => <option key={c.id} value={c.id}>{c.name}</option>)}
        </select>
        <label>{t('riskWhy')}<input value={raise.reason} onChange={e => setRaise(r => ({...r, reason: e.target.value}))} />
        </label>
        <button type="button" onClick={() => void raiseFlag()}>{t('riskRaise')}</button>
      </fieldset>
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
