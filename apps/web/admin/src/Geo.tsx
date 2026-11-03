import {useCallback, useEffect, useRef, useState} from 'react';
import {Link, useParams} from 'react-router-dom';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';
import {CityMap, type MapZone} from './CityMap.js';
import {CityForm} from './CityForm.js';

type City = {id: string; code: string; name: string; currency: string; timezone: string; state: string;
  priority: number; version: number; polygon?: unknown};
type Interval = {days_of_week: number[]; from: string; to: string};
type Operations = {working_hours: Interval[]; payment_methods: string[]; return_zone_meters: number;
  dropoff_outside_city: {allowed: boolean; max_distance_km: number | null}; orders_paused: boolean;
  pause_reason: string | null; version: number};
type Dropoff = 'NONE' | 'LIMIT' | 'FORBIDDEN';

const METHODS = ['CASH', 'CARD', 'TERMINAL'];
const DAYS = [1, 2, 3, 4, 5, 6, 7];
const TIME = /^([01][0-9]|2[0-3]):[0-5][0-9]$/;
const WHOLE = /^[0-9]+$/;
const MAX_INTERVALS = 14;

async function cities(client: ApiClient) {
  return ((await client.get('/api/admin/v1/cities' as never, {} as never)) as {cities: City[]}).cities;
}

/** The cities for holders of geo.manage (#359): each with its currency, time zone and state. */
export function CityList({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const [list, setList] = useState<City[] | null>(null);
  const [adding, setAdding] = useState(false);
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);

  const read = useCallback(() => {
    cities(client).then(setList).catch(failure => setError(failure));
  }, [client]);

  useEffect(() => {
    read();
  }, [read]);

  return (
    <section aria-labelledby="cities-title">
      <h1 id="cities-title">{t('navGeo')}</h1>
      <ul>
        {(list ?? []).map(c => (
          <li key={c.id}>
            <Link to={'/geo/' + c.id}>{[c.name, c.currency, c.timezone, t('cityState_' + c.state)].join(' · ')}</Link>
          </li>
        ))}
      </ul>
      {adding ? <CityForm client={client} t={t} newId={newId} onDone={() => {
        setAdding(false);
        setMessage(t('cityCreated'));
        read();
      }} /> : <button type="button" onClick={() => {setAdding(true); setMessage(null);}}>{t('cityNew')}</button>}
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}

/**
 * How a city takes orders (#359, REQ-TEN-03/05/06, REQ-DS-07): the working hours in the city's own time zone, the
 * payment methods, the return zone, drop-off outside the city, and the pause of new orders. Every change carries the
 * version that was read and a reason; what the server would refuse is refused here first.
 */
export function CityOperations({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const {cityId = ''} = useParams();
  const [city, setCity] = useState<City | null>(null);
  const [zones, setZones] = useState<MapZone[] | null>(null);
  const [editing, setEditing] = useState(false);
  const [stateReason, setStateReason] = useState('');
  const [cityMessage, setCityMessage] = useState<string | null>(null);
  const [ops, setOps] = useState<Operations | null>(null);
  const [intervals, setIntervals] = useState<Interval[]>([]);
  const [methods, setMethods] = useState<string[]>([]);
  const [zone, setZone] = useState('');
  const [dropoff, setDropoff] = useState<Dropoff>('NONE');
  const [km, setKm] = useState('');
  const [reason, setReason] = useState('');
  const [pauseReason, setPauseReason] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  /** Shows what the server holds now and puts it into the form. */
  const show = useCallback((value: Operations) => {
    setOps(value);
    setIntervals(value.working_hours.map(i => ({...i, days_of_week: [...i.days_of_week]})));
    setMethods([...value.payment_methods]);
    setZone(String(value.return_zone_meters));
    const limit = value.dropoff_outside_city.max_distance_km;
    setDropoff(!value.dropoff_outside_city.allowed ? 'FORBIDDEN' : limit == null ? 'NONE' : 'LIMIT');
    setKm(limit == null ? '' : String(limit));
    setReason('');
  }, []);

  const read = useCallback(async () => {
    show(await client.get('/api/admin/v1/cities/{city_id}/operations' as never,
      {params: {city_id: cityId}} as never) as Operations);
  }, [client, cityId, show]);

  useEffect(() => {
    read().catch(failure => setError(failure));
    readCity();
    client.get('/api/admin/v1/cities/{city_id}/zones' as never, {params: {city_id: cityId}} as never)
      .then(value => setZones((value as {zones: MapZone[]}).zones)).catch(() => setZones(null));
  }, [client, cityId, read]);

  /** The city as the server holds it now: its draft, state and version (#467). */
  function readCity() {
    cities(client).then(list => setCity(list.find(c => c.id === cityId) ?? null)).catch(() => undefined);
  }

  /** Publishes a draft or archives a published city, with the version read and a reason (#467). */
  async function changeState(action: 'publish' | 'archive') {
    if (!city || acting.current) return;
    if (!stateReason.trim()) {
      setCityMessage(t('cityReasonNeeds'));
      return;
    }
    acting.current = true;
    setCityMessage(null);
    try {
      const answer = await client.post(('/api/admin/v1/cities/{city_id}/' + action) as never, {params: {
        city_id: cityId}, body: {command_id: newId(), expected_version: city.version,
        reason: stateReason.trim()}} as never) as {state: string; version: number};
      setCity(c => c ? {...c, state: answer.state, version: answer.version} : c);
      setStateReason('');
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setCityMessage(t('cityChanged'));
        readCity();
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  /** Runs one command at a time; a conflict is told and the city is read again. */
  async function act(command: () => Promise<Operations>, done: string | null) {
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      show(await command());
      setPauseReason('');
      setMessage(done ? t(done) : null);
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('cityConflict'));
        await read().catch(again => setError(again));
      } else {
        setError(failure);
      }
    } finally {
      acting.current = false;
    }
  }

  function save() {
    if (!ops) return;
    const zoneOk = WHOLE.test(zone.trim()) && Number(zone.trim()) <= 50000;
    const kmOk = dropoff !== 'LIMIT' || (WHOLE.test(km.trim()) && Number(km.trim()) >= 1 && Number(km.trim()) <= 1000);
    if (methods.length === 0 || intervals.length > MAX_INTERVALS || intervals.some(i => i.days_of_week.length === 0
      || !TIME.test(i.from) || !TIME.test(i.to)) || !zoneOk || !kmOk || !reason.trim()) {
      setMessage(t('operationsNeeds'));
      return;
    }
    const version = ops.version;
    return act(async () => await client.post('/api/admin/v1/cities/{city_id}/operations' as never, {
      params: {city_id: cityId}, body: {command_id: newId(), expected_version: version,
        working_hours: intervals.map(i => ({days_of_week: [...i.days_of_week].sort((a, b) => a - b), from: i.from,
          to: i.to})),
        payment_methods: METHODS.filter(m => methods.includes(m)), return_zone_meters: Number(zone.trim()),
        dropoff_outside_city: {allowed: dropoff !== 'FORBIDDEN',
          max_distance_km: dropoff === 'LIMIT' ? Number(km.trim()) : null},
        reason: reason.trim()}} as never) as Operations, 'operationsSaved');
  }

  function pause(action: 'pause' | 'resume') {
    if (!ops) return;
    if (!pauseReason.trim()) {
      setMessage(t('pauseNeeds'));
      return;
    }
    const version = ops.version;
    return act(async () => await client.post(('/api/admin/v1/cities/{city_id}/operations/' + action) as never, {
      params: {city_id: cityId}, body: {command_id: newId(), expected_version: version, reason: pauseReason.trim()}
    } as never) as Operations, null);
  }

  const change = (n: number, over: Partial<Interval>) =>
    setIntervals(list => list.map((i, at) => at === n ? {...i, ...over} : i));
  const hours = (i: Interval) => i.days_of_week.map(d => t('day_' + d)).join(', ') + ' ' + i.from + '–' + i.to;
  const limit = ops?.dropoff_outside_city;

  return (
    <section aria-labelledby="city-title">
      <h1 id="city-title">{city ? city.name + ' · ' + city.timezone : t('navGeo')}</h1>
      {ops ? (
        <>
          {ops.working_hours.length === 0 ? <p>{t('hoursAround')}</p> : (
            <>
              <p>{t('hours')}</p>
              <ul>{ops.working_hours.map((i, n) => <li key={n}>{hours(i)}</li>)}</ul>
            </>
          )}
          <p>{t('methodsNow', {methods: ops.payment_methods.map(m => t('payShort_' + m)).join(', ')})}</p>
          <p>{t('zoneNow', {meters: ops.return_zone_meters})}</p>
          <p>{t('dropoffNow', {rule: !limit?.allowed ? t('dropoffForbidden') : limit.max_distance_km == null
            ? t('dropoffNone') : t('dropoffUpTo', {km: limit.max_distance_km})})}</p>
          <p>{ops.orders_paused ? t('pausedNow', {reason: ops.pause_reason ?? ''}) : t('openNow')}</p>

          <fieldset>
            <legend>{t('changeOperations')}</legend>
            {intervals.map((i, n) => (
              <fieldset key={n}>
                <legend>{t('intervalN', {n: n + 1})}</legend>
                {DAYS.map(d => (
                  <label key={d}>
                    <input type="checkbox" aria-label={t('dayOfInterval', {day: t('day_' + d), n: n + 1})}
                      checked={i.days_of_week.includes(d)} onChange={e => change(n, {days_of_week: e.target.checked
                        ? [...i.days_of_week, d] : i.days_of_week.filter(x => x !== d)})} />
                    {t('day_' + d)}
                  </label>
                ))}
                <label>{t('fromOf', {n: n + 1})}
                  <input value={i.from} placeholder="08:00" onChange={e => change(n, {from: e.target.value})} /></label>
                <label>{t('toOf', {n: n + 1})}
                  <input value={i.to} placeholder="22:00" onChange={e => change(n, {to: e.target.value})} /></label>
                <button type="button" onClick={() => setIntervals(list => list.filter((_, at) => at !== n))}>
                  {t('removeInterval', {n: n + 1})}</button>
              </fieldset>
            ))}
            <button type="button" disabled={intervals.length >= MAX_INTERVALS}
              onClick={() => setIntervals(list => [...list, {days_of_week: [], from: '', to: ''}])}>
              {t('addInterval')}</button>
            {METHODS.map(m => (
              <label key={m}>
                <input type="checkbox" checked={methods.includes(m)} onChange={e => setMethods(list =>
                  e.target.checked ? [...list, m] : list.filter(x => x !== m))} />
                {t('pay_' + m)}
              </label>
            ))}
            <label>{t('zoneMeters')}<input inputMode="numeric" value={zone} onChange={e => setZone(e.target.value)} />
            </label>
            <label htmlFor="city-dropoff">{t('dropoff')}</label>
            <select id="city-dropoff" value={dropoff} onChange={e => setDropoff(e.target.value as Dropoff)}>
              <option value="NONE">{t('dropoffNone')}</option>
              <option value="LIMIT">{t('dropoffLimit')}</option>
              <option value="FORBIDDEN">{t('dropoffForbidden')}</option>
            </select>
            {dropoff === 'LIMIT' ? <label>{t('limitKm')}
              <input inputMode="numeric" value={km} onChange={e => setKm(e.target.value)} /></label> : null}
            <label>{t('changeReason')}<input value={reason} onChange={e => setReason(e.target.value)} /></label>
            <button type="button" onClick={() => void save()}>{t('save')}</button>
          </fieldset>

          <fieldset>
            <legend>{t('pauseTitle')}</legend>
            <label>{t('pauseReason')}
              <input value={pauseReason} onChange={e => setPauseReason(e.target.value)} /></label>
            {ops.orders_paused
              ? <button type="button" onClick={() => void pause('resume')}>{t('resumeOrders')}</button>
              : <button type="button" onClick={() => void pause('pause')}>{t('pauseOrders')}</button>}
          </fieldset>
        </>
      ) : error ? null : <p>{t('loading')}</p>}
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
      {city ? (
        <section aria-labelledby="city-state-title">
          <h2 id="city-state-title">{t('cityStateLine', {state: t('cityState_' + city.state)})}</h2>
          {city.state === 'DRAFT' && !editing ? <button type="button" onClick={() => {setEditing(true);
            setCityMessage(null);}}>{t('cityEdit')}</button> : null}
          {editing ? <CityForm key={city.version} client={client} t={t} newId={newId} existing={city}
            onDone={() => {setEditing(false); setCityMessage(t('cityDraftSaved')); readCity();}}
            onConflict={readCity} /> : null}
          {city.state !== 'ARCHIVED' ? (
            <>
              <label>{t('cityStateReason')}<input value={stateReason} onChange={e => setStateReason(e.target.value)} />
              </label>
              <button type="button" onClick={() => void changeState(city.state === 'DRAFT' ? 'publish' : 'archive')}>
                {t(city.state === 'DRAFT' ? 'cityPublish' : 'cityArchive')}</button>
            </>
          ) : null}
          {cityMessage ? <p role="status">{cityMessage}</p> : null}
        </section>
      ) : null}
      {city ? <CityMap t={t} boundary={city.polygon} zones={zones} /> : null}
    </section>
  );
}
