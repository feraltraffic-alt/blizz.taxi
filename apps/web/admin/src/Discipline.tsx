import {useCallback, useEffect, useRef, useState} from 'react';
import {Link} from 'react-router-dom';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

type DriverRules = {enabled: boolean; grace_seconds: number; warn_after: number; pause_after: number;
  first_pause_minutes: number; second_pause_minutes: number; escalation_days: number; rate_flag_percent: number;
  rate_flag_min_accepted: number; uncounted_flag_above: number; uncounted_flag_days: number};
type OfferRules = {missed_enabled: boolean; missed_in_row: number; acceptance_enabled: boolean;
  acceptance_min_offers: number; acceptance_warn_percent: number; acceptance_pause_percent: number;
  far_pickup_meters: number};
type PickupRules = {max_minutes: number; routed_candidates: number};
type FaultRules = {client_free_minutes: number; driver_late_minutes: number;
  driver_late_without_promise_minutes: number; count_late_cancellations: boolean};
type Version = {version: number; settings: Record<string, unknown> & {driver_discipline?: DriverRules | null;
  offer_discipline?: OfferRules | null; pickup_time?: PickupRules | null; cancellation_fault?: FaultRules | null}};

/** ADR 0018: the defaults of the server, shown until the service saves its own. */
export const DRIVER_DEFAULTS: DriverRules = {enabled: true, grace_seconds: 30, warn_after: 3, pause_after: 5,
  first_pause_minutes: 30, second_pause_minutes: 120, escalation_days: 7, rate_flag_percent: 20,
  rate_flag_min_accepted: 20, uncounted_flag_above: 5, uncounted_flag_days: 7};
export const OFFER_DEFAULTS: OfferRules = {missed_enabled: true, missed_in_row: 3, acceptance_enabled: true,
  acceptance_min_offers: 20, acceptance_warn_percent: 50, acceptance_pause_percent: 30, far_pickup_meters: 3000};

/** ADR 0020 and ADR 0019: the defaults of the server. */
export const PICKUP_DEFAULTS: PickupRules = {max_minutes: 15, routed_candidates: 10};
export const FAULT_DEFAULTS: FaultRules = {client_free_minutes: 2, driver_late_minutes: 5,
  driver_late_without_promise_minutes: 15, count_late_cancellations: false};

/** Each number with its bounds, as the server checks them. */
const DRIVER_FIELDS: [keyof DriverRules, number, number][] = [['grace_seconds', 0, 600], ['warn_after', 1, 49],
  ['pause_after', 2, 50], ['first_pause_minutes', 1, 1440], ['second_pause_minutes', 1, 1440],
  ['escalation_days', 1, 30], ['rate_flag_percent', 1, 100], ['rate_flag_min_accepted', 1, 1000],
  ['uncounted_flag_above', 1, 100], ['uncounted_flag_days', 1, 30]];
const OFFER_FIELDS: [keyof OfferRules, number, number][] = [['missed_in_row', 1, 20], ['acceptance_min_offers', 1, 1000],
  ['acceptance_warn_percent', 2, 100], ['acceptance_pause_percent', 1, 99], ['far_pickup_meters', 100, 100000]];

const PICKUP_FIELDS: [keyof PickupRules, number, number][] = [['max_minutes', 1, 120], ['routed_candidates', 1, 20]];
const FAULT_FIELDS: [keyof FaultRules, number, number][] = [['client_free_minutes', 0, 60],
  ['driver_late_minutes', 1, 120], ['driver_late_without_promise_minutes', 1, 180]];

const number = (text: string, min: number, max: number) => {
  const n = /^[0-9]{1,6}$/.test(text.trim()) ? Number(text.trim()) : NaN;
  return n >= min && n <= max ? n : null;
};

/** The numbers of a form, or null when one is out of bounds or the pairs do not hold (warn < pause, first ≤ second). */
export function driverRules(enabled: boolean, text: Record<string, string>): DriverRules | null {
  const values = Object.fromEntries(DRIVER_FIELDS.map(([k, min, max]) => [k, number(text[k] ?? '', min, max)]));
  if (Object.values(values).some(v => v === null)) return null;
  const rules = {enabled, ...values} as DriverRules;
  return rules.warn_after < rules.pause_after && rules.first_pause_minutes <= rules.second_pause_minutes
    ? rules : null;
}

export function offerRules(missed: boolean, acceptance: boolean, text: Record<string, string>): OfferRules | null {
  const values = Object.fromEntries(OFFER_FIELDS.map(([k, min, max]) => [k, number(text[k] ?? '', min, max)]));
  if (Object.values(values).some(v => v === null)) return null;
  const rules = {missed_enabled: missed, acceptance_enabled: acceptance, ...values} as OfferRules;
  return rules.acceptance_warn_percent > rules.acceptance_pause_percent ? rules : null;
}

/** The pickup time rules of a form (ADR 0020), or null when a number is out of bounds. */
export function pickupRules(text: Record<string, string>): PickupRules | null {
  const values = Object.fromEntries(PICKUP_FIELDS.map(([k, min, max]) => [k, number(text[k] ?? '', min, max)]));
  return Object.values(values).some(v => v === null) ? null : values as PickupRules;
}

/** Who is at fault for a cancellation (ADR 0019), or null when a number is out of bounds. */
export function faultRules(count: boolean, text: Record<string, string>): FaultRules | null {
  const values = Object.fromEntries(FAULT_FIELDS.map(([k, min, max]) => [k, number(text[k] ?? '', min, max)]));
  return Object.values(values).some(v => v === null) ? null
    : {count_late_cancellations: count, ...values} as FaultRules;
}

const asText = (rules: object) => Object.fromEntries(Object.entries(rules)
  .filter(([, v]) => typeof v === 'number').map(([k, v]) => [k, String(v)]));

/**
 * The service's rules for drivers who cancel accepted orders and who decline or miss offers (ADR 0018 B, B12), for
 * holders of settings.manage. Every number of the decision is here with the server's bounds; the rest of the settings
 * go back as they were read.
 */
export function DisciplineSettings({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const [current, setCurrent] = useState<Version | null>(null);
  const [driver, setDriver] = useState<Record<string, string>>({});
  const [offers, setOffers] = useState<Record<string, string>>({});
  const [pickup, setPickup] = useState<Record<string, string>>({});
  const [fault, setFault] = useState<Record<string, string>>({});
  const [switches, setSwitches] = useState({cancellations: true, missed: true, acceptance: true, countLate: false});
  const [reason, setReason] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const show = useCallback((value: Version) => {
    const d = value.settings.driver_discipline ?? DRIVER_DEFAULTS;
    const o = value.settings.offer_discipline ?? OFFER_DEFAULTS;
    const p = value.settings.pickup_time ?? PICKUP_DEFAULTS;
    const f = value.settings.cancellation_fault ?? FAULT_DEFAULTS;
    setCurrent(value);
    setDriver(asText(d));
    setOffers(asText(o));
    setPickup(asText(p));
    setFault(asText(f));
    setSwitches({cancellations: d.enabled, missed: o.missed_enabled, acceptance: o.acceptance_enabled,
      countLate: f.count_late_cancellations});
    setReason('');
  }, []);

  const read = useCallback(async () => {
    show(await client.get('/api/admin/v1/settings' as never, {} as never) as Version);
  }, [client, show]);

  useEffect(() => {
    read().catch(failure => setError(failure));
  }, [read]);

  async function save() {
    if (acting.current || !current) return;
    const d = driverRules(switches.cancellations, driver);
    const o = offerRules(switches.missed, switches.acceptance, offers);
    const p = pickupRules(pickup);
    const f = faultRules(switches.countLate, fault);
    if (!d || !o || !p || !f || !reason.trim()) {
      setMessage(t('dscNeeds'));
      return;
    }
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      show(await client.post('/api/admin/v1/settings' as never, {body: {command_id: newId(),
        expected_version: current.version, settings: {...current.settings, driver_discipline: d, offer_discipline: o,
          pickup_time: p, cancellation_fault: f},
        reason: reason.trim()}} as never) as Version);
      setMessage(t('dscSaved'));
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('dscConflict'));
        await read().catch(again => setError(again));
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  const field = (values: Record<string, string>, set: (v: Record<string, string>) => void, key: string) => (
    <label key={key}>{t('dsc_' + key)}
      <input inputMode="numeric" value={values[key] ?? ''} onChange={e => set({...values, [key]: e.target.value})} />
    </label>
  );

  return (
    <section aria-labelledby="discipline-title">
      <h1 id="discipline-title">{t('dscTitle')}</h1>
      {current ? (
        <>
          <fieldset>
            <legend>{t('dscCancellations')}</legend>
            <label><input type="checkbox" checked={switches.cancellations}
              onChange={e => setSwitches(s => ({...s, cancellations: e.target.checked}))} />{t('dscCancellationsOn')}
            </label>
            {DRIVER_FIELDS.map(([k]) => field(driver, setDriver, k))}
          </fieldset>
          <fieldset>
            <legend>{t('dscOffers')}</legend>
            <label><input type="checkbox" checked={switches.missed}
              onChange={e => setSwitches(s => ({...s, missed: e.target.checked}))} />{t('dscMissedOn')}</label>
            <label><input type="checkbox" checked={switches.acceptance}
              onChange={e => setSwitches(s => ({...s, acceptance: e.target.checked}))} />{t('dscAcceptanceOn')}</label>
            {OFFER_FIELDS.map(([k]) => field(offers, setOffers, k))}
          </fieldset>
          <fieldset>
            <legend>{t('dscPickup')}</legend>
            {PICKUP_FIELDS.map(([k]) => field(pickup, setPickup, k))}
          </fieldset>
          <fieldset>
            <legend>{t('dscFault')}</legend>
            {FAULT_FIELDS.map(([k]) => field(fault, setFault, k))}
            <label><input type="checkbox" checked={switches.countLate}
              onChange={e => setSwitches(s => ({...s, countLate: e.target.checked}))} />{t('dscCountLate')}</label>
          </fieldset>
          <label>{t('dscReason')}<input value={reason} onChange={e => setReason(e.target.value)} /></label>
          <button type="button" onClick={() => void save()}>{t('dscSave')}</button>
        </>
      ) : null}
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}

type Counts = {cancellations: {enabled: boolean; last24h: number; pause_after: number; until_pause: number;
  accepted30d: number; cancelled30d: number; rate30d_percent: number | null};
  acceptance: {enabled: boolean; offers7d: number; accepted7d: number; percent7d: number | null; min_offers: number};
  pause: {id: string; kind: string; level: number; ends_at: string} | null};
type Card = Counts & {recent: {order_id: string; reason_code: string; counted: boolean; not_counted_why: string | null;
  cancelled_at: string}[]};
type Pause = {id: string; kind: string; level: number; starts_at: string; ends_at: string; active: boolean;
  lift_reason: string | null; version: number};

const when = (iso: string) => new Date(iso).toLocaleString('ru-RU', {dateStyle: 'short', timeStyle: 'short'});

/**
 * A driver's cancellations after accepting, acceptance rate and pauses for holders of drivers.risk (ADR 0018 B8,
 * B11): the counts the driver sees, the cancellations of 30 days with their reasons, and an active pause to lift with a
 * reason.
 */
export function DriverDiscipline({client, t, newId, driverId}: {client: ApiClient; t: Translate; newId: () => string;
  driverId: string}) {
  const [card, setCard] = useState<Card | null>(null);
  const [pauses, setPauses] = useState<Pause[]>([]);
  const [reason, setReason] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const read = useCallback(async () => {
    setCard(await client.get('/api/admin/v1/drivers/{driver_id}/discipline' as never,
      {params: {driver_id: driverId}} as never) as Card);
    setPauses(((await client.get('/api/admin/v1/driver-pauses' as never,
      {query: {driver_id: driverId}} as never)) as {pauses: Pause[]}).pauses);
  }, [client, driverId]);

  useEffect(() => {
    read().catch(failure => setError(failure));
  }, [read]);

  async function lift(pause: Pause) {
    if (acting.current) return;
    if (!reason.trim()) {
      setMessage(t('dscLiftNeeds'));
      return;
    }
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      await client.post('/api/admin/v1/driver-pauses/{pause_id}/lift' as never, {params: {pause_id: pause.id},
        body: {command_id: newId(), expected_version: pause.version, reason: reason.trim()}} as never);
      setReason('');
      setMessage(t('dscLifted'));
      await read();
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('dscLiftConflict'));
        await read().catch(again => setError(again));
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  const active = pauses.find(p => p.active);
  return (
    <section aria-labelledby="driver-discipline-title">
      <h2 id="driver-discipline-title">{t('dscCardTitle')}</h2>
      {card ? (
        <>
          <p>{t('dscCardCancellations', {n: card.cancellations.last24h, pause: card.cancellations.pause_after,
            cancelled: card.cancellations.cancelled30d, accepted: card.cancellations.accepted30d,
            rate: card.cancellations.rate30d_percent ?? '—'})}</p>
          <p>{card.acceptance.percent7d === null
            ? t('dscCardAcceptanceFew', {n: card.acceptance.offers7d, min: card.acceptance.min_offers})
            : t('dscCardAcceptance', {percent: card.acceptance.percent7d, accepted: card.acceptance.accepted7d,
              n: card.acceptance.offers7d})}</p>
          {active ? (
            <div>
              <p role="status">{t('dscPausedUntil', {kind: t('dscKind_' + active.kind), level: active.level,
                until: when(active.ends_at)})}</p>
              <label>{t('dscLiftReason')}<input value={reason} onChange={e => setReason(e.target.value)} /></label>
              <button type="button" onClick={() => void lift(active)}>{t('dscLift')}</button>
            </div>
          ) : <p>{t('dscNoPause')}</p>}
          {card.recent.length ? (
            <table>
              <caption>{t('dscRecent')}</caption>
              <thead><tr><th>{t('dscWhen')}</th><th>{t('dscReasonCode')}</th><th>{t('dscCounted')}</th></tr></thead>
              <tbody>
                {card.recent.map(r => (
                  <tr key={r.order_id + r.cancelled_at}>
                    <td><Link to={'/orders/' + r.order_id}>{when(r.cancelled_at)}</Link></td>
                    <td>{r.reason_code}</td>
                    <td>{r.counted ? t('dscYes') : t('dscNot_' + (r.not_counted_why ?? 'OFF'))}</td>
                  </tr>
                ))}
              </tbody>
            </table>
          ) : <p>{t('dscNoRecent')}</p>}
          {pauses.filter(p => !p.active).length ? (
            <ul aria-label={t('dscPastPauses')}>
              {pauses.filter(p => !p.active).map(p => (
                <li key={p.id}>{t('dscPastPause', {kind: t('dscKind_' + p.kind), level: p.level,
                  from: when(p.starts_at), until: when(p.ends_at)})}{p.lift_reason
                  ? ' · ' + t('dscLiftedBecause', {reason: p.lift_reason}) : ''}</li>
              ))}
            </ul>
          ) : null}
        </>
      ) : null}
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}

type City = {id: string; name: string};
type Report = {min_accepted: number; drivers: {driver_id: string; accepted: number; cancelled: number;
  rate_percent: number}[]};

/** The drivers of a city with the highest cancellation rates of 30 days (ADR 0018 B11), for holders of drivers.risk. */
export function CancellationReport({client, t, cities}: {client: ApiClient; t: Translate; cities: City[]}) {
  const [cityId, setCityId] = useState('');
  const [report, setReport] = useState<Report | null>(null);
  const [error, setError] = useState<unknown>(null);

  useEffect(() => {
    if (!cityId && cities[0]) setCityId(cities[0].id);
  }, [cities, cityId]);

  useEffect(() => {
    if (!cityId) return;
    setReport(null);
    setError(null);
    client.get('/api/admin/v1/reports/driver-cancellations' as never, {query: {city_id: cityId}} as never)
      .then(value => setReport(value as Report)).catch(failure => setError(failure));
  }, [client, cityId]);

  return (
    <section aria-labelledby="cancellation-report-title">
      <h2 id="cancellation-report-title">{t('dscReportTitle')}</h2>
      <label htmlFor="cancellation-report-city">{t('dscReportCity')}</label>
      <select id="cancellation-report-city" value={cityId} onChange={e => setCityId(e.target.value)}>
        {cities.map(c => <option key={c.id} value={c.id}>{c.name}</option>)}
      </select>
      {report ? (
        report.drivers.length ? (
          <table>
            <caption>{t('dscReportCaption', {min: report.min_accepted})}</caption>
            <thead><tr><th>{t('dscReportDriver')}</th><th>{t('dscReportRate')}</th><th>{t('dscReportOf')}</th></tr></thead>
            <tbody>
              {report.drivers.map(d => (
                <tr key={d.driver_id}>
                  <td><Link to={'/drivers/' + d.driver_id}>{d.driver_id.slice(0, 8)}</Link></td>
                  <td>{d.rate_percent} %</td>
                  <td>{t('dscReportCounts', {cancelled: d.cancelled, accepted: d.accepted})}</td>
                </tr>
              ))}
            </tbody>
          </table>
        ) : <p>{t('dscReportEmpty', {min: report.min_accepted})}</p>
      ) : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
