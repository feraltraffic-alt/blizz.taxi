import {useCallback, useEffect, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';
import {amount} from './Balance.js';

type City = {id: string; name: string; timezone?: string};
type Figures = Record<string, number>;
type Earnings = {currency: string; days: {date: string; figures: Figures}[]; total: Figures; balance_minor: number;
  pending: {trips: number; fare_minor: number}};

const DAY = 24 * 3600 * 1000;
/** Shown only when not 0, in this order, after the main figures. */
const OPTIONAL = ['tips', 'bonuses', 'top_ups', 'transfers_in', 'transfers_out', 'adjustments', 'held'];

/** Today in the city's time zone (lessons case 20), as YYYY-MM-DD. */
function today(timeZone: string) {
  return new Intl.DateTimeFormat('en-CA', {timeZone, year: 'numeric', month: '2-digit', day: '2-digit'})
    .format(new Date(Date.now()));
}

/** A real calendar date in YYYY-MM-DD as UTC milliseconds, or null. */
function dayOf(text: string) {
  const value = text.trim();
  if (!/^[0-9]{4}-[0-9]{2}-[0-9]{2}$/.test(value)) return null;
  const at = new Date(value + 'T00:00:00Z');
  return Number.isNaN(at.getTime()) || at.toISOString().slice(0, 10) !== value ? null : at.getTime();
}

const minus = (date: string, days: number) => new Date(dayOf(date)! - days * DAY).toISOString().slice(0, 10);
const signed = (minor: number) => (minor < 0 ? '−' : '+') + amount(minor);
const money = (minor: number) => (minor < 0 ? '−' : '') + amount(minor);
const dmy = (date: string) => date.split('-').reverse().join('.');

/**
 * A driver's earnings per day for holders of finance.manage (#436, REQ-DRV-12): in a city's calendar and currency,
 * by default the last 7 days ending today in that city's time zone; at most 92 days after the first.
 */
export function DriverEarnings({client, t, driverId, cities, admitted}: {client: ApiClient; t: Translate;
  driverId: string; cities: City[]; admitted: string[]}) {
  const [cityId, setCityId] = useState('');
  const [from, setFrom] = useState('');
  const [to, setTo] = useState('');
  const [earnings, setEarnings] = useState<Earnings | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);

  const ask = useCallback(async (city: string, first: string, last: string) => {
    setMessage(null);
    setError(null);
    try {
      setEarnings(await client.get('/api/admin/v1/drivers/{driver_id}/earnings' as never, {params: {
        driver_id: driverId}, query: {city_id: city, from: first, to: last}} as never) as Earnings);
    } catch (failure) {
      setEarnings(null);
      if (failure instanceof ApiError && failure.status === 403) setMessage(t('earnForbidden'));
      else setError(failure);
    }
  }, [client, driverId, t]);

  const pick = useCallback((city: City | undefined) => {
    if (!city) return;
    const last = today(city.timezone ?? 'UTC');
    const first = minus(last, 6);
    setCityId(city.id);
    setFrom(first);
    setTo(last);
    void ask(city.id, first, last);
  }, [ask]);

  useEffect(() => {
    if (cityId || cities.length === 0) return;
    pick(cities.find(c => admitted.includes(c.id)) ?? cities[0]);
  }, [cities, admitted, cityId, pick]);

  function show() {
    const first = dayOf(from);
    const last = dayOf(to);
    if (first === null || last === null || first > last || last - first > 92 * DAY) {
      setMessage(t('earnNeeds'));
      return;
    }
    void ask(cityId, from.trim(), to.trim());
  }

  const line = (head: string, f: Figures, currency: string) => [head, t('earnTrips', {n: f.trips ?? 0}),
    t('earnFare', {amount: money(f.fare_minor ?? 0)}), t('earnCommission', {amount: money(f.commission_minor ?? 0)}),
    t('earnShare', {amount: money(f.driver_share_minor ?? 0)}), t('earnCash', {amount: money(f.cash_minor ?? 0)}),
    t('earnCashless', {amount: money(f.cashless_minor ?? 0)}),
    ...OPTIONAL.filter(k => (f[k + '_minor'] ?? 0) !== 0).map(k => t('earn_' + k, {amount: money(f[k + '_minor']!)})),
    t('earnNet', {amount: signed(f.net_minor ?? 0) + ' ' + currency})].join(' · ');
  return (
    <fieldset>
      <legend>{t('earnTitle')}</legend>
      <label htmlFor="earn-city">{t('earnCity')}</label>
      <select id="earn-city" value={cityId} onChange={e => pick(cities.find(c => c.id === e.target.value))}>
        {cities.map(c => <option key={c.id} value={c.id}>{c.name}</option>)}
      </select>
      <label>{t('earnFrom')}<input value={from} onChange={e => setFrom(e.target.value)} /></label>
      <label>{t('earnTo')}<input value={to} onChange={e => setTo(e.target.value)} /></label>
      <button type="button" onClick={show}>{t('earnShow')}</button>
      {earnings ? (
        <>
          {earnings.days.length === 0 ? <p>{t('earnNone')}</p> : (
            <ul>
              {earnings.days.map(d => <li key={d.date}>{line(dmy(d.date), d.figures, earnings.currency)}</li>)}
              <li>{line(t('earnTotal'), earnings.total, earnings.currency)}</li>
            </ul>
          )}
          <p>{t('earnBalance', {amount: money(earnings.balance_minor) + ' ' + earnings.currency})}</p>
          {earnings.pending.trips > 0 ? <p>{t('earnPending', {n: earnings.pending.trips,
            amount: amount(earnings.pending.fare_minor) + ' ' + earnings.currency})}</p> : null}
        </>
      ) : null}
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </fieldset>
  );
}
