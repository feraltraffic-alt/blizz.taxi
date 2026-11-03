import {useEffect, useRef, useState} from 'react';
import {useParams} from 'react-router-dom';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

type Grant = {id: string; staff_id: string; permissions: string[]; reason: string; expires_at: string;
  active: boolean};
type Activity = {at: string; method: string | null; path: string | null; status: number | null};
type Member = {id: string; login: string; profile: {first_name: string; last_name: string}};

const WHOLE = /^[0-9]{1,3}$/;

/** "03.11.2026 15:30" in UTC. */
function utc(at: string) {
  const when = new Date(at);
  return when.toLocaleDateString('ru-RU', {timeZone: 'UTC'}) + ' '
    + when.toLocaleTimeString('ru-RU', {timeZone: 'UTC', hour: '2-digit', minute: '2-digit'});
}

/**
 * Giving a staff member emergency access (#373, REQ-SEC-10): functions from the catalog, cities, 5 to 480 minutes and a
 * reason, confirmed with the super admin's own password, which never stays on the screen. Never to oneself.
 */
export function EmergencyGive({client, t, newId, meId}: {client: ApiClient; t: Translate; newId: () => string;
  meId: string}) {
  const {staffId = ''} = useParams();
  const [member, setMember] = useState<Member | null>(null);
  const [permissions, setPermissions] = useState<{code: string; description: string}[]>([]);
  const [cities, setCities] = useState<{id: string; name: string}[]>([]);
  const [picked, setPicked] = useState<string[]>([]);
  const [allCities, setAllCities] = useState(false);
  const [cityIds, setCityIds] = useState<string[]>([]);
  const [minutes, setMinutes] = useState('60');
  const [reason, setReason] = useState('');
  const [own, setOwn] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);
  const self = staffId === meId;

  useEffect(() => {
    if (self) return;
    client.get('/api/admin/v1/staff/{staff_id}' as never, {params: {staff_id: staffId}} as never)
      .then(value => setMember(value as Member)).catch(failure => setError(failure));
    client.get('/api/admin/v1/permissions' as never, {} as never)
      .then(list => setPermissions((list as {permissions: {code: string; description: string}[]}).permissions))
      .catch(() => undefined);
    client.get('/api/config/v1/bootstrap' as never, {} as never)
      .then(boot => setCities((boot as {cities: {id: string; name: string}[]}).cities)).catch(() => undefined);
  }, [client, staffId, self]);

  async function give() {
    if (acting.current) return;
    const why = reason.trim();
    const length = WHOLE.test(minutes.trim()) ? Number(minutes.trim()) : NaN;
    if (picked.length === 0 || (!allCities && cityIds.length === 0) || !(length >= 5 && length <= 480)
      || why.length < 10 || why.length > 500 || !own) {
      setMessage(t('grantNeeds'));
      return;
    }
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      const granted = await client.post('/api/admin/v1/staff/{staff_id}/emergency-grants' as never, {params: {
        staff_id: staffId}, body: {command_id: newId(), permissions: permissions.map(p => p.code)
        .filter(c => picked.includes(c)), all_cities: allCities,
      ...(allCities ? {} : {city_ids: cities.map(c => c.id).filter(id => cityIds.includes(id))}),
      minutes: length, reason: why, password: own}} as never) as Grant;
      setMessage(t('grantDone', {until: utc(granted.expires_at)}));
      setPicked([]);
      setReason('');
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 403) setMessage(t('ownPasswordWrong'));
      else if (failure instanceof ApiError && failure.status === 409) setMessage(t('grantInactive'));
      else setError(failure);
    } finally {
      setOwn('');
      acting.current = false;
    }
  }

  if (self) return <p role="status">{t('grantSelf')}</p>;
  return (
    <section aria-labelledby="give-title">
      <h1 id="give-title">{member ? t('grantOf', {name: member.profile.last_name + ' ' + member.profile.first_name})
        : t('navEmergency')}</h1>
      {permissions.map(p => (
        <label key={p.code}>
          <input type="checkbox" checked={picked.includes(p.code)} onChange={e => setPicked(list =>
            e.target.checked ? [...list, p.code] : list.filter(x => x !== p.code))} />
          {p.code + ' — ' + p.description}
        </label>
      ))}
      <label><input type="checkbox" checked={allCities} onChange={e => setAllCities(e.target.checked)} />
        {t('allCities')}</label>
      {allCities ? null : cities.map(c => (
        <label key={c.id}>
          <input type="checkbox" checked={cityIds.includes(c.id)} onChange={e => setCityIds(list =>
            e.target.checked ? [...list, c.id] : list.filter(x => x !== c.id))} />
          {c.name}
        </label>
      ))}
      <label>{t('grantMinutes')}<input inputMode="numeric" value={minutes} onChange={e => setMinutes(e.target.value)} />
      </label>
      <label>{t('reason')}<input value={reason} onChange={e => setReason(e.target.value)} /></label>
      <label>{t('ownPassword')}<input type="password" value={own} onChange={e => setOwn(e.target.value)} /></label>
      <button type="button" onClick={() => void give()}>{t('grantButton')}</button>
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}

/** The emergency access given (#373): active first, with ending one early and what was done with it. */
export function EmergencyList({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const [grants, setGrants] = useState<Grant[] | null>(null);
  const [logins, setLogins] = useState<Record<string, string>>({});
  const [reasons, setReasons] = useState<Record<string, string>>({});
  const [activity, setActivity] = useState<Record<string, Activity[]>>({});
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  useEffect(() => {
    client.get('/api/admin/v1/emergency-grants' as never, {} as never)
      .then(list => setGrants((list as {grants: Grant[]}).grants)).catch(failure => setError(failure));
    client.get('/api/admin/v1/staff' as never, {} as never)
      .then(list => setLogins(Object.fromEntries((list as {staff: Member[]}).staff.map(m => [m.id, m.login]))))
      .catch(() => undefined);
  }, [client]);

  async function end(grant: Grant) {
    if (acting.current) return;
    const why = (reasons[grant.id] ?? '').trim();
    if (!why || why.length > 500) {
      setMessage(t('revokeNeeds'));
      return;
    }
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      const ended = await client.post('/api/admin/v1/emergency-grants/{grant_id}/revoke' as never, {params: {
        grant_id: grant.id}, body: {command_id: newId(), reason: why}} as never) as Grant;
      setGrants(list => (list ?? []).map(g => g.id === ended.id ? ended : g));
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) setMessage(t('grantEnded'));
      else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  async function show(grant: Grant) {
    try {
      const answer = await client.get('/api/admin/v1/emergency-grants/{grant_id}/activity' as never, {params: {
        grant_id: grant.id}} as never) as {activity: Activity[]};
      setActivity(all => ({...all, [grant.id]: answer.activity}));
    } catch (failure) {
      setError(failure);
    }
  }

  const sorted = [...(grants ?? [])].sort((a, b) => Number(b.active) - Number(a.active));
  return (
    <section aria-labelledby="grants-title">
      <h1 id="grants-title">{t('navEmergency')}</h1>
      <ul>
        {sorted.map(g => {
          const who = logins[g.staff_id] ?? g.staff_id;
          return (
            <li key={g.id}>
              <span>{[who, g.permissions.join(', '), t('until', {at: utc(g.expires_at)}),
                t(g.active ? 'grantActive' : 'grantOver'), g.reason].join(' · ')}</span>
              {g.active ? (
                <>
                  <label>{t('revokeReason', {who})}
                    <input value={reasons[g.id] ?? ''} onChange={e => setReasons(r => ({...r, [g.id]: e.target.value}))} />
                  </label>
                  <button type="button" onClick={() => void end(g)}>{t('revokeOf', {who})}</button>
                </>
              ) : null}
              <button type="button" onClick={() => void show(g)}>{t('activityOf', {who})}</button>
              {activity[g.id] ? (
                <ul>{activity[g.id]!.map((a, i) => <li key={i}>{[utc(a.at) + ' UTC',
                  (a.method ?? '') + ' ' + (a.path ?? ''), String(a.status ?? '—')].join(' · ')}</li>)}</ul>
              ) : null}
            </li>
          );
        })}
      </ul>
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}

/** The emergency access given to me and until when (#373 G7); nothing on a failed read. */
export function MyGrants({client, t}: {client: ApiClient; t: Translate}) {
  const [grants, setGrants] = useState<Grant[] | null>(null);

  useEffect(() => {
    client.get('/api/admin/v1/me/emergency-grants' as never, {} as never)
      .then(list => setGrants((list as {grants: Grant[]}).grants.filter(g => g.active))).catch(() => undefined);
  }, [client]);

  if (!grants) return null;
  if (grants.length === 0) return <p>{t('myGrantsNone')}</p>;
  return (
    <>
      {grants.map(g => <p key={g.id}>{t('myGrant', {permissions: g.permissions.join(', '),
        until: utc(g.expires_at)})}</p>)}
    </>
  );
}
