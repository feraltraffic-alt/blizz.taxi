import {useCallback, useEffect, useRef, useState} from 'react';
import {Link, useParams} from 'react-router-dom';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';
import {OrderFare} from './OrderFare.js';
import {TripFacts} from './TripFacts.js';
import {OrderRefunds} from './Refunds.js';
import {PaymentOperations} from './PaymentOperations.js';

type City = {id: string; name: string; currency: string; timezone: string};
type Overview = {total: number; by_status: {status: string; count: number}[]};
type Row = {id: string; short_number: number; city_id: string; status: string; created_at: string;
  vehicle_class: string; payment_method: string; price_minor: number | null; final_price_minor: number | null;
  currency: string | null; accounting: string | null};
type Event = {sequence: number; type: string; occurred_at: string; reason: string | null;
  actor: {type: string; name: string | null; role: string | null}};

const STATUSES = ['SCHEDULED', 'AWAITING_PAYMENT', 'READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE', 'FULFILLED',
  'CANCELLED', 'UNFULFILLED'];
const E164 = /^\+[1-9][0-9]{7,14}$/;
const WHOLE = /^[1-9][0-9]{0,17}$/;
const ROLE_TEXT: Record<string, string> = {SUPER_ADMIN: 'roleSuperAdmin', ADMIN: 'roleAdmin', OPERATOR: 'roleOperator'};

/** Today's date in the city's own calendar (lessons case 20), never the browser's. */
function today(timeZone: string) {
  return new Intl.DateTimeFormat('en-CA', {timeZone, year: 'numeric', month: '2-digit', day: '2-digit'})
    .format(new Date(Date.now()));
}

/** "03.11.2026 14:05" in the given zone. */
function moment(at: string, timeZone: string) {
  const when = new Date(at);
  return when.toLocaleDateString('ru-RU', {timeZone}) + ' '
    + when.toLocaleTimeString('ru-RU', {timeZone, hour: '2-digit', minute: '2-digit'});
}

function money(minor: number) {
  return String(Math.floor(minor / 100)).replace(/\B(?=(\d{3})+(?!\d))/g, ' ') + '.'
    + String(minor % 100).padStart(2, '0');
}

/**
 * Orders for holders of orders.view (#368, REQ-ADM-01): a city's day by status, and a search by status, phones and the
 * short number, a page at a time. A city outside the staff member's scope is said so.
 */
export function Orders({client, t}: {client: ApiClient; t: Translate}) {
  const [cities, setCities] = useState<City[]>([]);
  const [cityId, setCityId] = useState('');
  const [date, setDate] = useState('');
  const [overview, setOverview] = useState<Overview | null>(null);
  const [filters, setFilters] = useState({statuses: [] as string[], rider: '', driver: '', number: ''});
  const [sent, setSent] = useState<Record<string, string | string[]> | null>(null);
  const [rows, setRows] = useState<Row[] | null>(null);
  const [next, setNext] = useState<string | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const reading = useRef(false);

  useEffect(() => {
    client.get('/api/config/v1/bootstrap' as never, {} as never).then(boot => {
      const list = (boot as {cities: City[]}).cities;
      setCities(list);
      if (list[0]) {
        setCityId(list[0].id);
        setDate(today(list[0].timezone));
      }
    }).catch(failure => setError(failure));
  }, [client]);

  const refusal = useCallback((failure: unknown) => {
    if (failure instanceof ApiError && failure.status === 403) setMessage(t('ordersForbidden'));
    else setError(failure);
  }, [t]);

  useEffect(() => {
    if (!cityId || !/^\d{4}-\d{2}-\d{2}$/.test(date)) return;
    let current = true;
    setOverview(null);
    client.get('/api/admin/v1/orders/overview' as never, {query: {city_id: cityId, date}} as never)
      .then(value => {if (current) setOverview(value as Overview);})
      .catch(failure => {if (current) refusal(failure);});
    return () => {current = false;};
  }, [client, cityId, date, refusal]);

  function pickCity(id: string) {
    setCityId(id);
    const city = cities.find(c => c.id === id);
    if (city) setDate(today(city.timezone));
  }

  async function search(query: Record<string, string | string[]>, cursor: string | null) {
    if (reading.current) return;
    reading.current = true;
    setMessage(null);
    setError(null);
    try {
      const page = await client.get('/api/admin/v1/orders' as never, {query: {...query,
        ...(cursor ? {cursor} : {})}} as never) as {orders: Row[]; page: {next_cursor?: string | null}};
      setRows(old => cursor ? [...(old ?? []), ...page.orders] : page.orders);
      setNext(page.page.next_cursor ?? null);
      setSent(query);
    } catch (failure) {
      refusal(failure);
    } finally {
      reading.current = false;
    }
  }

  function find() {
    const rider = filters.rider.trim();
    const driver = filters.driver.trim();
    const number = filters.number.trim();
    if ((rider && !E164.test(rider)) || (driver && !E164.test(driver)) || (number && !WHOLE.test(number))) {
      setMessage(t('ordersNeeds'));
      return;
    }
    return search({...(cityId ? {city_id: cityId} : {}),
      ...(filters.statuses.length ? {status: STATUSES.filter(s => filters.statuses.includes(s))} : {}),
      ...(rider ? {rider_phone: rider} : {}), ...(driver ? {driver_phone: driver} : {}),
      ...(number ? {short_number: number} : {})}, null);
  }

  const zone = (id: string) => cities.find(c => c.id === id)?.timezone ?? 'UTC';
  const price = (r: Row) => {
    const minor = r.final_price_minor ?? r.price_minor;
    return minor == null || !r.currency ? '—' : money(minor) + ' ' + r.currency;
  };
  const set = (key: 'rider' | 'driver' | 'number') => (e: {target: {value: string}}) =>
    setFilters(f => ({...f, [key]: e.target.value}));
  return (
    <section aria-labelledby="orders-title">
      <h1 id="orders-title">{t('navOrders')}</h1>
      <label htmlFor="orders-city">{t('ordersCity')}</label>
      <select id="orders-city" value={cityId} onChange={e => pickCity(e.target.value)}>
        {cities.map(c => <option key={c.id} value={c.id}>{c.name}</option>)}
      </select>
      <label>{t('ordersDate')}<input type="date" value={date} onChange={e => setDate(e.target.value)} /></label>
      {overview ? (
        <>
          <p>{t('ordersTotal', {count: overview.total})}</p>
          <ul>{overview.by_status.map(s => <li key={s.status}>{t('order_' + s.status) + ': ' + s.count}</li>)}</ul>
        </>
      ) : null}
      <fieldset>
        <legend>{t('ordersSearch')}</legend>
        {STATUSES.map(s => (
          <label key={s}>
            <input type="checkbox" checked={filters.statuses.includes(s)} onChange={e => setFilters(f => ({...f,
              statuses: e.target.checked ? [...f.statuses, s] : f.statuses.filter(x => x !== s)}))} />
            {t('order_' + s)}
          </label>
        ))}
        <label>{t('ordersRiderPhone')}<input type="tel" value={filters.rider} onChange={set('rider')} /></label>
        <label>{t('ordersDriverPhone')}<input type="tel" value={filters.driver} onChange={set('driver')} /></label>
        <label>{t('shortNumber')}<input inputMode="numeric" value={filters.number} onChange={set('number')} /></label>
        <button type="button" onClick={() => void find()}>{t('findOrders')}</button>
      </fieldset>
      {rows ? (
        <ul>
          {rows.map(r => (
            <li key={r.id}>
              <Link to={'/orders/' + r.id}>{['№ ' + r.short_number, moment(r.created_at, zone(r.city_id)),
                t('order_' + r.status), r.vehicle_class, r.payment_method, price(r),
                ...(r.accounting === 'PENDING' ? [t('notPosted')] : [])].join(' · ')}</Link>
            </li>
          ))}
        </ul>
      ) : null}
      {rows && rows.length === 0 ? <p>{t('noOrders')}</p> : null}
      {next && sent ? <button type="button" onClick={() => void search(sent, next)}>{t('more')}</button> : null}
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}

/** One order's history (#368): every event, oldest first, with who did it and why. Times in UTC. */
export function OrderTimeline({client, t, newId, canCorrect, canRetry, canTrips, canRefund = false,
  seeRefunds = false}: {client: ApiClient; t: Translate; newId: () => string; canCorrect: boolean; canRetry: boolean;
  canTrips: boolean; canRefund?: boolean; seeRefunds?: boolean}) {
  const {orderId = ''} = useParams();
  const [events, setEvents] = useState<Event[] | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);

  useEffect(() => {
    client.get('/api/admin/v1/orders/{order_id}/timeline' as never, {params: {order_id: orderId}} as never)
      .then(value => setEvents([...(value as {events: Event[]}).events].sort((a, b) => a.sequence - b.sequence)))
      .catch(failure => {
        if (failure instanceof ApiError && failure.status === 403) setMessage(t('ordersForbidden'));
        else setError(failure);
      });
  }, [client, orderId, t]);

  const who = (e: Event) => e.actor.name
    ? e.actor.name + (e.actor.role ? ' (' + t(ROLE_TEXT[e.actor.role] ?? e.actor.role) + ')' : '')
    : t('actor_' + e.actor.type);
  return (
    <section aria-labelledby="order-title">
      <h1 id="order-title">{t('orderTitle')}</h1>
      <ul>
        {(events ?? []).map(e => <li key={e.sequence}>{[moment(e.occurred_at, 'UTC') + ' UTC', e.type, who(e),
          ...(e.reason ? [e.reason] : [])].join(' · ')}</li>)}
      </ul>
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
      <TripFacts client={client} t={t} newId={newId} orderId={orderId} canCorrect={canTrips} />
      <OrderFare client={client} t={t} newId={newId} orderId={orderId} canCorrect={canCorrect} />
      {canRetry ? <PaymentOperations client={client} t={t} newId={newId} orderId={orderId} /> : null}
      {seeRefunds ? <OrderRefunds client={client} t={t} newId={newId} orderId={orderId} canRequest={canRefund} />
        : null}
      <p><Link to="/orders">{t('toOrders')}</Link></p>
    </section>
  );
}
