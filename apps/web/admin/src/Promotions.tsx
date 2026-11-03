import {useCallback, useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';
import {instant, typed} from './Legal.js';

type Conditions = {city_id: string | null; vehicle_class: string | null; every_nth_trip: number | null;
  days_of_week: string[] | null; time_from: string | null; time_to: string | null; pickup_zone_id: string | null;
  dropoff_zone_id: string | null; starts_at: string | null; ends_at: string | null};
type Promotion = {id: string; name: string; kind: string; value_type: string; value: number; currency: string | null;
  conditions: Conditions; state: string; version: number};
type Form = {name: string; kind: string; type: string; value: string; currency: string; city: string; vclass: string;
  nth: string; days: string[]; from: string; to: string; starts: string; ends: string; reason: string;
  zones: {pickup_zone_id: string | null; dropoff_zone_id: string | null}};

const DAYS = ['MONDAY', 'TUESDAY', 'WEDNESDAY', 'THURSDAY', 'FRIDAY', 'SATURDAY', 'SUNDAY'];
const TIME = /^([01][0-9]|2[0-3]):[0-5][0-9]$/;

/** "12.5" or "12,5" → 1250 basis points; null outside 0.01 … 100 or with more than two decimals. */
function basisPoints(text: string) {
  const parts = /^([0-9]{1,3})(?:[.,]([0-9]{1,2}))?$/.exec(text.trim());
  if (!parts) return null;
  const bp = Number(parts[1]) * 100 + Number((parts[2] ?? '').padEnd(2, '0'));
  return bp >= 1 && bp <= 10000 ? bp : null;
}

/** "50" or "50,5" → minor units; null when not above 0 or with more than two decimals. */
function minor(text: string) {
  const parts = /^([0-9]{1,9})(?:[.,]([0-9]{1,2}))?$/.exec(text.trim());
  if (!parts) return null;
  const value = Number(parts[1]) * 100 + Number((parts[2] ?? '').padEnd(2, '0'));
  return value >= 1 ? value : null;
}

const decimal = (value: number) => Math.floor(value / 100) + '.' + String(value % 100).padStart(2, '0');
const percent = (bp: number) => decimal(bp).replace(/\.?0+$/, '');
const empty = (): Form => ({name: '', kind: 'DISCOUNT', type: 'PERCENT', value: '', currency: '', city: '', vclass: '',
  nth: '', days: [], from: '', to: '', starts: '', ends: '', reason: '', zones: {pickup_zone_id: null,
    dropoff_zone_id: null}});

/**
 * Rider promotions for holders of promotions.manage (#400): the list with the conditions in words, creating one,
 * changing it with the version read (zones, not edited here, are sent back as they were), and stopping it. A percent
 * is sent in basis points and an amount in minor units, both without floating point; moments are UTC.
 */
export function Promotions({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const [archived, setArchived] = useState(false);
  const [promotions, setPromotions] = useState<Promotion[] | null>(null);
  const [cities, setCities] = useState<{id: string; name: string}[]>([]);
  const [form, setForm] = useState<Form>(empty);
  const [editing, setEditing] = useState<Promotion | null>(null);
  const [stops, setStops] = useState<Record<string, string>>({});
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const read = useCallback(async () => {
    setPromotions(((await client.get('/api/admin/v1/promotions' as never, {query: archived
      ? {include_archived: true} : {}} as never)) as {promotions: Promotion[]}).promotions);
  }, [client, archived]);

  useEffect(() => {
    read().catch(failure => setError(failure));
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
        setMessage(t('promoConflict'));
        await read().catch(again => setError(again));
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  /** The draft from the form, or null when the server would refuse it. */
  function draft() {
    const value = form.type === 'PERCENT' ? basisPoints(form.value) : minor(form.value);
    const nth = form.nth.trim() === '' ? null : /^[0-9]{1,4}$/.test(form.nth.trim()) ? Number(form.nth.trim()) : NaN;
    const from = form.from.trim();
    const to = form.to.trim();
    const starts = form.starts.trim() === '' ? null : instant(form.starts);
    const ends = form.ends.trim() === '' ? null : instant(form.ends);
    const name = form.name.trim();
    if (!name || name.length > 120 || value === null || (form.type === 'FIXED' && !/^[A-Z]{3}$/.test(form.currency.trim()))
      || (nth !== null && !(nth >= 2 && nth <= 1000)) || (from === '') !== (to === '')
      || (from !== '' && (!TIME.test(from) || !TIME.test(to))) || (form.starts.trim() !== '' && !starts)
      || (form.ends.trim() !== '' && !ends) || (starts && ends && ends <= starts) || !form.reason.trim()) {
      return null;
    }
    return {name, kind: form.kind, value_type: form.type, value,
      ...(form.type === 'FIXED' ? {currency: form.currency.trim()} : {}),
      conditions: {city_id: form.city || null, vehicle_class: form.vclass.trim() || null, every_nth_trip: nth,
        days_of_week: form.days.length ? DAYS.filter(d => form.days.includes(d)) : null, time_from: from || null,
        time_to: to || null, pickup_zone_id: form.zones.pickup_zone_id, dropoff_zone_id: form.zones.dropoff_zone_id,
        starts_at: starts, ends_at: ends}};
  }

  function save() {
    const promotion = draft();
    if (!promotion) {
      setMessage(t('promoNeeds'));
      return;
    }
    const reason = form.reason.trim();
    return run(async () => {
      if (editing) {
        const changed = await client.post('/api/admin/v1/promotions/{promotion_id}/change' as never, {params: {
          promotion_id: editing.id}, body: {command_id: newId(), expected_version: editing.version, promotion,
          reason}} as never) as Promotion;
        setPromotions(list => (list ?? []).map(p => p.id === changed.id ? changed : p));
      } else {
        const created = await client.post('/api/admin/v1/promotions' as never, {body: {command_id: newId(), promotion,
          reason}} as never) as Promotion;
        setPromotions(list => [...(list ?? []), created]);
      }
      setEditing(null);
      setForm(empty());
      setMessage(t('promoSaved'));
    });
  }

  function stop(p: Promotion) {
    const reason = (stops[p.id] ?? '').trim();
    if (!reason) {
      setMessage(t('promoStopNeeds'));
      return;
    }
    return run(async () => {
      const stopped = await client.post('/api/admin/v1/promotions/{promotion_id}/archive' as never, {params: {
        promotion_id: p.id}, body: {command_id: newId(), expected_version: p.version, reason}} as never) as Promotion;
      setPromotions(list => (list ?? []).map(x => x.id === stopped.id ? stopped : x));
    });
  }

  function edit(p: Promotion) {
    const c = p.conditions;
    setEditing(p);
    setForm({name: p.name, kind: p.kind, type: p.value_type, value: p.value_type === 'PERCENT' ? percent(p.value)
      : decimal(p.value), currency: p.currency ?? '', city: c.city_id ?? '', vclass: c.vehicle_class ?? '',
    nth: c.every_nth_trip == null ? '' : String(c.every_nth_trip), days: [...(c.days_of_week ?? [])],
    from: c.time_from ?? '', to: c.time_to ?? '', starts: c.starts_at ? typed(c.starts_at) : '',
    ends: c.ends_at ? typed(c.ends_at) : '', reason: '', zones: {pickup_zone_id: c.pickup_zone_id,
      dropoff_zone_id: c.dropoff_zone_id}});
  }

  const words = (p: Promotion) => {
    const c = p.conditions;
    return [p.name, t('promoKind_' + p.kind) + ' ' + (p.value_type === 'PERCENT' ? percent(p.value) + ' %'
      : decimal(p.value) + ' ' + (p.currency ?? '')),
    ...(c.city_id ? [cities.find(x => x.id === c.city_id)?.name ?? c.city_id] : []),
    ...(c.vehicle_class ? [c.vehicle_class] : []),
    ...(c.every_nth_trip ? [t('promoNth', {n: c.every_nth_trip})] : []),
    ...(c.days_of_week?.length ? [c.days_of_week.map(d => t('promoDay_' + d)).join(', ')] : []),
    ...(c.time_from && c.time_to ? [c.time_from + '–' + c.time_to] : []),
    ...(c.pickup_zone_id ? [t('promoPickupZone')] : []), ...(c.dropoff_zone_id ? [t('promoDropoffZone')] : []),
    ...(c.starts_at ? [t('promoFrom', {at: typed(c.starts_at)})] : []),
    ...(c.ends_at ? [t('promoTo', {at: typed(c.ends_at)})] : []),
    t(p.state === 'ACTIVE' ? 'promoActive' : 'promoStopped')].join(' · ');
  };
  const set = (key: keyof Omit<Form, 'days' | 'zones'>) => (e: {target: {value: string}}) =>
    setForm(f => ({...f, [key]: e.target.value}));
  return (
    <section aria-labelledby="promo-title">
      <h1 id="promo-title">{t('navPromotions')}</h1>
      <label><input type="checkbox" checked={archived} onChange={e => setArchived(e.target.checked)} />
        {t('promoShowStopped')}</label>
      <ul>
        {(promotions ?? []).map(p => (
          <li key={p.id}>
            <span>{words(p)}</span>
            {p.state === 'ACTIVE' ? (
              <>
                <button type="button" onClick={() => edit(p)}>{t('promoEdit')}</button>
                <label>{t('promoStopReason')}<input value={stops[p.id] ?? ''}
                  onChange={e => setStops(all => ({...all, [p.id]: e.target.value}))} /></label>
                <button type="button" onClick={() => void stop(p)}>{t('promoStop')}</button>
              </>
            ) : null}
          </li>
        ))}
      </ul>
      <fieldset>
        <legend>{editing ? t('promoEditTitle', {name: editing.name}) : t('promoNewTitle')}</legend>
        <label>{t('promoName')}<input value={form.name} onChange={set('name')} /></label>
        <label htmlFor="promo-kind">{t('promoKindLabel')}</label>
        <select id="promo-kind" value={form.kind} onChange={set('kind')}>
          <option value="DISCOUNT">{t('promoKind_DISCOUNT')}</option>
          <option value="BONUS">{t('promoKind_BONUS')}</option>
        </select>
        <label htmlFor="promo-type">{t('promoTypeLabel')}</label>
        <select id="promo-type" value={form.type} onChange={set('type')}>
          <option value="PERCENT">{t('promoPercent')}</option>
          <option value="FIXED">{t('promoFixed')}</option>
        </select>
        <label>{t('promoValue')}<input inputMode="decimal" value={form.value} onChange={set('value')} /></label>
        <label>{t('promoCurrency')}<input value={form.currency} onChange={set('currency')} /></label>
        <label htmlFor="promo-city">{t('promoCity')}</label>
        <select id="promo-city" value={form.city} onChange={set('city')}>
          <option value="">{t('promoAny')}</option>
          {cities.map(c => <option key={c.id} value={c.id}>{c.name}</option>)}
        </select>
        <label>{t('promoClass')}<input value={form.vclass} onChange={set('vclass')} /></label>
        <label>{t('promoNthLabel')}<input inputMode="numeric" value={form.nth} onChange={set('nth')} /></label>
        {DAYS.map(d => (
          <label key={d}><input type="checkbox" checked={form.days.includes(d)} onChange={e => setForm(f => ({...f,
            days: e.target.checked ? [...f.days, d] : f.days.filter(x => x !== d)}))} />{t('promoDay_' + d)}</label>
        ))}
        <label>{t('promoTimeFrom')}<input value={form.from} onChange={set('from')} /></label>
        <label>{t('promoTimeTo')}<input value={form.to} onChange={set('to')} /></label>
        <label>{t('promoStarts')}<input value={form.starts} onChange={set('starts')} /></label>
        <label>{t('promoEnds')}<input value={form.ends} onChange={set('ends')} /></label>
        <label>{t('promoReason')}<input value={form.reason} onChange={set('reason')} /></label>
        <button type="button" onClick={() => void save()}>{editing ? t('promoSave') : t('promoCreate')}</button>
      </fieldset>
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
