import {useEffect, useState} from 'react';
import type {ApiClient} from '@blizz/api-client';
import type {Translate} from '@blizz/web-ui';

type Bonus = {balance: number; fulfilled_count: number; cancelled_count: number; period_started_at: string};
type Grant = {id: string; permissions: string[]; reason: string; expires_at: string; active: boolean};
type Operator = {staff_id: string; name?: string | null; status: string; extension?: string | null};

const two = (n: number) => String(n).padStart(2, '0');
const dm = (at: string) => {
  const d = new Date(at);
  return two(d.getDate()) + '.' + two(d.getMonth() + 1);
};
const dmhm = (at: string) => dm(at) + ' ' + two(new Date(at).getHours()) + ':' + two(new Date(at).getMinutes());

/**
 * My day (#349): my points for phone orders (ADR 0011), my active emergency access (REQ-SEC-10), and for a supervisor
 * (calls.supervise) the operators of a city with their call status, read every pollMs.
 */
export function MyDay({client, t, rights, cities, pollMs}: {client: ApiClient; t: Translate; rights: Set<string>;
  cities: {id: string; name: string}[]; pollMs: number}) {
  const [bonus, setBonus] = useState<Bonus | null>(null);
  const [grants, setGrants] = useState<Grant[] | null>(null);
  const supervise = rights.has('calls.supervise');
  const [cityId, setCityId] = useState(cities[0]?.id ?? '');
  const [operators, setOperators] = useState<Operator[] | null>(null);

  useEffect(() => {
    let current = true;
    client.get('/api/operator/v1/me/bonus' as never, {} as never)
      .then(value => {if (current) setBonus(value as Bonus);}).catch(() => undefined);
    client.get('/api/operator/v1/me/emergency-grants' as never, {} as never)
      .then(value => {if (current) setGrants((value as {grants: Grant[]}).grants);}).catch(() => setGrants([]));
    return () => {current = false;};
  }, [client]);

  useEffect(() => {
    if (!supervise || !cityId) return;
    let current = true;
    const read = () => {
      client.get('/api/operator/v1/operators' as never, {query: {city_id: cityId}} as never)
        .then(value => {if (current) setOperators((value as {operators: Operator[]}).operators);})
        .catch(() => undefined);
    };
    read();
    const timer = setInterval(read, pollMs);
    return () => {
      current = false;
      clearInterval(timer);
    };
  }, [client, supervise, cityId, pollMs]);

  const active = (grants ?? []).filter(g => g.active);
  return (
    <section aria-labelledby="my-day-title">
      <h1 id="my-day-title">{t('myDay')}</h1>
      {bonus ? <p>{t('myPoints', {points: bonus.balance, done: bonus.fulfilled_count,
        cancelled: bonus.cancelled_count, since: dm(bonus.period_started_at)})}</p> : null}
      {grants !== null ? (active.length === 0 ? <p>{t('noEmergency')}</p> : active.map(g => (
        <p key={g.id}>{t('emergencyUntil', {until: dmhm(g.expires_at), rights: g.permissions.join(', '),
          reason: g.reason})}</p>
      ))) : null}
      {supervise ? (
        <>
          <h2>{t('cityOperators')}</h2>
          <label>
            {t('city')}
            <select value={cityId} onChange={e => setCityId(e.target.value)}>
              {cities.map(c => <option key={c.id} value={c.id}>{c.name}</option>)}
            </select>
          </label>
          {operators && operators.length === 0 ? <p>{t('noOperators')}</p> : null}
          <ul aria-label={t('cityOperators')}>
            {(operators ?? []).map(o => (
              <li key={o.staff_id}>{[o.name ?? t('noName'), t('callStatus_' + o.status),
                ...(o.extension ? [t('extShort', {number: o.extension})] : [])].join(' · ')}</li>
            ))}
          </ul>
        </>
      ) : null}
    </section>
  );
}
