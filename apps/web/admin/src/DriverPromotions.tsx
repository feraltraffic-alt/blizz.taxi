import {useCallback, useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';
import {instant, typed} from './Legal.js';
import {DAYS, TIME, decimal, minor} from './Promotions.js';

type Terms = {name: string; reward_minor: number; currency: string; city_id: string | null; period_days: number;
  orders_required: number; days_of_week: string[] | null; time_from: string | null; time_to: string | null;
  payment_method: string | null; repeat: string; starts_at: string; ends_at: string | null};
type DriverPromotion = {id: string; terms: Terms; state: string; version: number};
type Form = {name: string; reward: string; currency: string; city: string; days: string; orders: string;
  week: string[]; from: string; to: string; payment: string; repeat: string; starts: string; ends: string;
  reason: string};

const WHOLE = /^[0-9]{1,6}$/;
const empty = (): Form => ({name: '', reward: '', currency: '', city: '', days: '', orders: '', week: [], from: '',
  to: '', payment: '', repeat: 'ONCE', starts: '', ends: '', reason: ''});

/**
 * Driver promotions for holders of promotions.manage (#403, ADR 0010): "complete N orders in D days and get a reward
 * on the balance", listed in words, created, changed with the version read and stopped. The reward is sent in minor
 * units without floating point and the moments in UTC, parsed as for rider promotions (#400).
 */
export function DriverPromotions({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const [archived, setArchived] = useState(false);
  const [promotions, setPromotions] = useState<DriverPromotion[] | null>(null);
  const [cities, setCities] = useState<{id: string; name: string}[]>([]);
  const [form, setForm] = useState<Form>(empty);
  const [editing, setEditing] = useState<DriverPromotion | null>(null);
  const [stops, setStops] = useState<Record<string, string>>({});
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const read = useCallback(async () => {
    setPromotions(((await client.get('/api/admin/v1/driver-promotions' as never, {query: archived
      ? {include_archived: true} : {}} as never)) as {promotions: DriverPromotion[]}).promotions);
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

  /** The terms from the form, or null when the server would refuse them. */
  function terms(): Terms | null {
    const name = form.name.trim();
    const reward = minor(form.reward);
    const days = WHOLE.test(form.days.trim()) ? Number(form.days.trim()) : NaN;
    const orders = WHOLE.test(form.orders.trim()) ? Number(form.orders.trim()) : NaN;
    const from = form.from.trim();
    const to = form.to.trim();
    const starts = instant(form.starts);
    const ends = form.ends.trim() === '' ? null : instant(form.ends);
    if (!name || name.length > 120 || reward === null || !/^[A-Z]{3}$/.test(form.currency.trim())
      || !(days >= 1 && days <= 366) || !(orders >= 1) || (from === '') !== (to === '')
      || (from !== '' && (!TIME.test(from) || !TIME.test(to))) || !starts || (form.ends.trim() !== '' && !ends)
      || (ends !== null && ends <= starts) || !form.reason.trim()) {
      return null;
    }
    return {name, reward_minor: Math.floor(reward / 100) * 100, currency: form.currency.trim(), city_id: form.city || null, period_days: days,
      orders_required: orders, days_of_week: form.week.length ? DAYS.filter(d => form.week.includes(d)) : null,
      time_from: from || null, time_to: to || null, payment_method: form.payment || null, repeat: form.repeat && 'ONCE',
      starts_at: starts, ends_at: ends};
  }

  function save() {
    const promotion = terms();
    if (!promotion) {
      setMessage(t('dpromoNeeds'));
      return;
    }
    const reason = form.reason.trim();
    return run(async () => {
      if (editing) {
        const changed = await client.post('/api/admin/v1/driver-promotions/{promotion_id}/change' as never, {params: {
          promotion_id: editing.id}, body: {command_id: newId(), expected_version: editing.version, promotion,
          reason}} as never) as DriverPromotion;
        setPromotions(list => (list ?? []).map(p => p.id === changed.id ? changed : p));
      } else {
        const created = await client.post('/api/admin/v1/driver-promotions' as never, {body: {command_id: newId(),
          promotion, reason}} as never) as DriverPromotion;
        setPromotions(list => [...(list ?? []), created]);
      }
      setEditing(null);
      setForm(empty());
      setMessage(t('promoSaved'));
    });
  }

  function stop(p: DriverPromotion) {
    const reason = (stops[p.id] ?? '').trim();
    if (!reason) {
      setMessage(t('promoStopNeeds'));
      return;
    }
    return run(async () => {
      const stopped = await client.post('/api/admin/v1/driver-promotions/{promotion_id}/archive' as never, {params: {
        promotion_id: p.id}, body: {command_id: newId(), expected_version: p.version, reason}} as never) as
        DriverPromotion;
      setPromotions(list => (list ?? []).map(x => x.id === stopped.id ? stopped : x));
    });
  }

  function edit(p: DriverPromotion) {
    const x = p.terms;
    setEditing(p);
    setForm({name: x.name, reward: decimal(x.reward_minor), currency: x.currency, city: x.city_id ?? '',
      days: String(x.period_days), orders: String(x.orders_required), week: [...(x.days_of_week ?? [])],
      from: x.time_from ?? '', to: x.time_to ?? '', payment: x.payment_method ?? '', repeat: x.repeat,
      starts: typed(x.starts_at), ends: x.ends_at ? typed(x.ends_at) : '', reason: ''});
  }

  const words = (p: DriverPromotion) => {
    const x = p.terms;
    return [x.name, t('dpromoGoal', {orders: x.orders_required, days: x.period_days,
      reward: decimal(x.reward_minor) + ' ' + x.currency}), t('dpromoRepeat_' + x.repeat),
    ...(x.city_id ? [cities.find(c => c.id === x.city_id)?.name ?? x.city_id] : []),
    ...(x.payment_method ? [t('dpromoPay_' + x.payment_method)] : []),
    ...(x.days_of_week?.length ? [x.days_of_week.map(d => t('promoDay_' + d)).join(', ')] : []),
    ...(x.time_from && x.time_to ? [x.time_from + '–' + x.time_to] : []),
    t('promoFrom', {at: typed(x.starts_at)}), ...(x.ends_at ? [t('promoTo', {at: typed(x.ends_at)})] : []),
    t(p.state === 'ACTIVE' ? 'promoActive' : 'promoStopped')].join(' · ');
  };
  const set = (key: keyof Omit<Form, 'week'>) => (e: {target: {value: string}}) =>
    setForm(f => ({...f, [key]: e.target.value}));
  return (
    <section aria-labelledby="dpromo-title">
      <h1 id="dpromo-title">{t('navDriverPromotions')}</h1>
      <label><input type="checkbox" checked={archived} onChange={e => setArchived(e.target.checked)} />
        {t('dpromoShowStopped')}</label>
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
        <legend>{editing ? t('promoEditTitle', {name: editing.terms.name}) : t('dpromoNewTitle')}</legend>
        <label>{t('dpromoName')}<input value={form.name} onChange={set('name')} /></label>
        <label>{t('dpromoReward')}<input inputMode="decimal" value={form.reward} onChange={set('reward')} /></label>
        <label>{t('dpromoCurrency')}<input value={form.currency} onChange={set('currency')} /></label>
        <label htmlFor="dpromo-city">{t('dpromoCity')}</label>
        <select id="dpromo-city" value={form.city} onChange={set('city')}>
          <option value="">{t('promoAny')}</option>
          {cities.map(c => <option key={c.id} value={c.id}>{c.name}</option>)}
        </select>
        <label>{t('dpromoDays')}<input inputMode="numeric" value={form.days} onChange={set('days')} /></label>
        <label>{t('dpromoOrders')}<input inputMode="numeric" value={form.orders} onChange={set('orders')} /></label>
        {DAYS.map(d => (
          <label key={d}><input type="checkbox" checked={form.week.includes(d)} onChange={e => setForm(f => ({...f,
            week: e.target.checked ? [...f.week, d] : f.week.filter(x => x !== d)}))} />{t('promoDay_' + d)}</label>
        ))}
        <label>{t('dpromoFrom')}<input value={form.from} onChange={set('from')} /></label>
        <label>{t('dpromoTo')}<input value={form.to} onChange={set('to')} /></label>
        <label htmlFor="dpromo-payment">{t('dpromoPayment')}</label>
        <select id="dpromo-payment" value={form.payment} onChange={set('payment')}>
          <option value="">{t('promoAny')}</option>
          {['CASH', 'CARD', 'TERMINAL'].map(m => <option key={m} value={m}>{t('dpromoPay_' + m)}</option>)}
        </select>
        <label htmlFor="dpromo-repeat">{t('dpromoRepeatLabel')}</label>
        <select id="dpromo-repeat" value={form.repeat} onChange={set('repeat')}>
          <option value="ONCE">{t('dpromoRepeat_ONCE')}</option>
          <option value="EVERY_PERIOD">{t('dpromoRepeat_EVERY_PERIOD')}</option>
        </select>
        <label>{t('dpromoStarts')}<input value={form.starts} onChange={set('starts')} /></label>
        <label>{t('dpromoEnds')}<input value={form.ends} onChange={set('ends')} /></label>
        <label>{t('dpromoReason')}<input value={form.reason} onChange={set('reason')} /></label>
        <button type="button" onClick={() => void save()}>{editing ? t('dpromoSave') : t('dpromoCreate')}</button>
      </fieldset>
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
