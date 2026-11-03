import {useCallback, useEffect, useRef, useState, type FormEvent} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, StaffGate, translator, type Translate} from '@blizz/web-ui';
import {translations} from './i18n.js';
import {LiveDrivers} from './LiveDrivers.js';
import {Support} from './Support.js';
import {OrderHistory} from './OrderHistory.js';
import {OrderActions} from './OrderActions.js';
import {Calls, type FromCall} from './Calls.js';
import {OrderCalls} from './OrderCalls.js';
import {PlacePicker, type Place, type Point} from './Places.js';
import {OrderChanges} from './OrderChanges.js';
import {OrderTrip} from './OrderTrip.js';
import {MyDay} from './MyDay.js';
import {CardPop, type Live} from './CardPop.js';

export type {LiveSocket} from './CardPop.js';

const t: Translate = translator(translations, 'ru');
const E164 = /^\+[1-9][0-9]{7,14}$/;

type City = {id: string; name: string; center: Point};
type Quote = {id: string; amount_minor: number; currency: string};
type Order = {id: string; short_number: number; status: string; version: number; city_id?: string;
  payer_client_id?: string | null; payment_method?: string; reservation?: {driver_name?: string | null} | null};

/** The operator workstation (#245): the shared staff gate, then a phone order and its status. */
export function OperatorApp({client, newId = () => crypto.randomUUID(), pollMs = 5000, live}: {client: ApiClient;
  newId?: () => string; pollMs?: number; live?: Live}) {
  return (
    <StaffGate client={client} t={t} audience="OPERATOR">
      <Workstation client={client} newId={newId} pollMs={pollMs} live={live} />
    </StaffGate>
  );
}

function Workstation({client, newId, pollMs, live}: {client: ApiClient; newId: () => string; pollMs: number;
  live?: Live}) {
  const [cities, setCities] = useState<City[] | null>(null);
  const [rights, setRights] = useState<Set<string> | null>(null);
  const [cityId, setCityId] = useState('');
  const [order, setOrder] = useState<Order | null>(null);
  const [view, setView] = useState<'order' | 'live' | 'support' | 'calls' | 'day'>('order');
  const [fromCall, setFromCall] = useState<FromCall | null>(null);
  const [myId, setMyId] = useState('');
  const [error, setError] = useState<unknown>(null);

  useEffect(() => {
    let current = true;
    Promise.all([client.get('/api/config/v1/bootstrap' as never, {} as never), client.get('/api/operator/v1/me')])
      .then(([boot, me]) => {
        if (!current) return;
        // Only the cities of the operator's scope: all of the service's, or the ones granted.
        const member = me as {effective_permissions: string[]; member: {id: string; profile: {all_cities: boolean;
          city_ids?: string[]}}};
        setMyId(member.member.id);
        const scope = member.member.profile;
        const list = (boot as {cities: City[]}).cities
          .filter(c => scope.all_cities || (scope.city_ids ?? []).includes(c.id));
        setCities(list);
        setCityId(list[0]?.id ?? '');
        setRights(new Set(member.effective_permissions));
      })
      .catch(failure => {if (current) setError(failure);});
    return () => {current = false;};
  }, [client]);

  if (error) return <Failure error={error} t={t} />;
  if (!cities || !rights) return <p>{t('loading')}</p>;
  const city = cities.find(c => c.id === cityId);
  return (
    <>
      {/* The card-pop needs calls.answer (#306 W1). */}
      {live && rights.has('calls.answer') ? <CardPop client={client} t={t} live={live} newId={newId}
        onOrder={call => {setFromCall(call); setOrder(null); setView('order');}} /> : null}
      <nav>
        {/* The board needs orders.view; without it nothing is offered or asked (#286 L5). */}
        {view !== 'order' ? <button type="button" onClick={() => setView('order')}>{t('toOrders')}</button> : null}
        {rights.has('orders.view') && view !== 'live'
          ? <button type="button" onClick={() => setView('live')}>{t('liveDrivers')}</button> : null}
        {view !== 'day' ? <button type="button" onClick={() => setView('day')}>{t('myDay')}</button> : null}
        {/* The calls panel needs calls.answer or calls.listen (#300 K5). */}
        {(rights.has('calls.answer') || rights.has('calls.listen')) && view !== 'calls'
          ? <button type="button" onClick={() => setView('calls')}>{t('calls')}</button> : null}
        {/* The support queue needs support.manage (#288 S8). */}
        {rights.has('support.manage') && view !== 'support'
          ? <button type="button" onClick={() => setView('support')}>{t('support')}</button> : null}
        <button type="button" onClick={() => void client.logout()}>{t('signOut')}</button>
      </nav>
      {view === 'day' ? <MyDay client={client} t={t} rights={rights} cities={cities} pollMs={pollMs} /> :
      view === 'calls' && (rights.has('calls.answer') || rights.has('calls.listen')) ? <Calls client={client} t={t}
        rights={rights} me={myId} newId={newId} pollMs={pollMs}
        onOrder={call => {setFromCall(call); setOrder(null); setView('order');}} /> :
      view === 'live' && rights.has('orders.view') ? <LiveDrivers client={client} t={t} cities={cities}
        pollMs={pollMs} /> : view === 'support' && rights.has('support.manage') ? <Support client={client} t={t}
        cities={cities} me={myId} newId={newId} /> : order ? <OrderView client={client} order={order} onChange={setOrder} newId={newId} pollMs={pollMs}
        rights={rights} near={(cities.find(c => c.id === order.city_id) ?? cities[0])?.center ?? {lat: 0, lon: 0}}
        onDone={() => setOrder(null)} /> : (
        <section aria-labelledby="new-order">
          <h1 id="new-order">{t('newOrder')}</h1>
          <label>
            {t('city')}
            <select value={cityId} onChange={e => setCityId(e.target.value)}>
              {cities.map(c => <option key={c.id} value={c.id}>{c.name}</option>)}
            </select>
          </label>
          {/* The server checks the city too; the form is shown only to a holder of orders.create (E1). */}
          {rights.has('orders.create') && city ? <OrderForm key={city.id + (fromCall?.id ?? '')} client={client}
            city={city} newId={newId} call={fromCall} onCreated={created => {setFromCall(null); setOrder(created);}} /> : <p role="alert">{t('noRight')}</p>}
        </section>
      )}
    </>
  );
}

function OrderForm({client, city, newId, call, onCreated}: {client: ApiClient; city: City; newId: () => string;
  call: FromCall | null; onCreated: (order: Order) => void}) {
  const [phone, setPhone] = useState(call?.phone ?? '');
  const [phoneError, setPhoneError] = useState(false);
  const [name, setName] = useState('');
  const [caller, setCaller] = useState<string | null>(null);
  const [pickup, setPickup] = useState<Place | null>(null);
  const [dropoff, setDropoff] = useState<Place | null>(null);
  const [classes, setClasses] = useState<{code: string; name: string}[] | null>(null);
  const [vehicleClass, setVehicleClass] = useState('');
  const [payment, setPayment] = useState<'CASH' | 'TERMINAL'>('CASH');
  const [comment, setComment] = useState('');
  const [quote, setQuote] = useState<Quote | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const [busy, setBusy] = useState(false);
  /** One command per quote: a double click or a retry is the same order (E4). */
  const orderCommand = useRef<string | null>(null);
  const creating = useRef(false);

  // The city's orderable classes (#251); the form is mounted again for another city.
  useEffect(() => {
    let current = true;
    client.get('/api/operator/v1/vehicle-classes', {query: {city_id: city.id}} as never)
      .then(list => {
        if (!current) return;
        const options = list as {code: string; name: string}[];
        setClasses(options);
        setVehicleClass(options[0]?.code ?? '');
      })
      .catch(failure => {if (current) setError(failure);});
    return () => {current = false;};
  }, [client, city.id]);

  const checkPhone = () => {
    const ok = E164.test(phone);
    setPhoneError(!ok);
    return ok;
  };

  async function lookup() {
    if (!checkPhone()) return;
    setError(null);
    try {
      const found = await client.get('/api/operator/v1/customers/lookup', {query: {phone}} as never) as {name: string};
      setCaller(t('knownCaller', {name: found.name}));
      if (!name) setName(found.name);
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 404) setCaller(t('newCaller'));
      else setError(failure);
    }
  }

  async function price() {
    if (!pickup || !dropoff) return;
    setBusy(true);
    setMessage(null);
    setError(null);
    try {
      const priced = await client.post('/api/operator/v1/quotes', {body: {
        command_id: newId(), vehicle_class: vehicleClass, pickup: pickup.point, dropoff: dropoff.point
      }} as never) as Quote;
      setQuote(priced);
      orderCommand.current = newId();
    } catch (failure) {
      setError(failure);
    } finally {
      setBusy(false);
    }
  }

  async function create(event: FormEvent) {
    event.preventDefault();
    if (!checkPhone() || !quote || !pickup || !dropoff || creating.current) return;
    creating.current = true;
    setBusy(true);
    setMessage(null);
    setError(null);
    try {
      onCreated(await client.post('/api/operator/v1/orders', {body: {
        command_id: orderCommand.current, quote_id: quote.id, vehicle_class: vehicleClass,
        pickup: pickup.point, pickup_label: pickup.label, dropoff: dropoff.point, dropoff_label: dropoff.label,
        payment_method: payment, caller: {phone, ...(name.trim() ? {name: name.trim()} : {})},
        ...(comment.trim() ? {comment: comment.trim()} : {}),
        // The call it is made during (#300 K4): the server links the order to it.
        ...(call ? {call_id: call.id} : {})
      }} as never) as Order);
    } catch (failure) {
      if (failure instanceof ApiError && (failure.code === 'QUOTE_EXPIRED' || failure.code === 'QUOTE_MISMATCH')) {
        // Never the old price: a new quote, with a new command for its order (E3).
        setQuote(null);
        setMessage(t('quoteExpired'));
      } else if (failure instanceof ApiError && failure.code === 'CITY_PAUSED') setMessage(t('cityPaused'));
      else if (failure instanceof ApiError && failure.code === 'CITY_CLOSED') setMessage(t('cityClosed'));
      else setError(failure);
    } finally {
      creating.current = false;
      setBusy(false);
    }
  }

  return (
    <form onSubmit={create}>
      {call ? <p>{t('orderForCall', {phone: call.phone ?? t('hiddenNumber')})}</p> : null}
      <label>
        {t('callerPhone')}
        <input value={phone} onChange={e => setPhone(e.target.value.trim())} onBlur={() => phone && checkPhone()} />
      </label>
      {phoneError ? <p role="alert">{t('badPhone')}</p> : null}
      <button type="button" onClick={() => void lookup()}>{t('findCaller')}</button>
      {caller ? <p>{caller}</p> : null}
      <label>
        {t('callerName')}
        <input value={name} onChange={e => setName(e.target.value)} />
      </label>
      <PlacePicker client={client} t={t} label={t('pickup')} near={city.center} callerPhone={phone} value={pickup}
        onPick={p => {setPickup(p); setQuote(null);}} />
      <PlacePicker client={client} t={t} label={t('dropoff')} near={city.center} callerPhone={phone} value={dropoff}
        onPick={p => {setDropoff(p); setQuote(null);}} />
      <label>
        {t('vehicleClass')}
        <select value={vehicleClass} onChange={e => {setVehicleClass(e.target.value); setQuote(null);}}>
          {(classes ?? []).map(c => <option key={c.code} value={c.code}>{c.name}</option>)}
        </select>
      </label>
      {classes && classes.length === 0 ? <p role="alert">{t('noClasses')}</p> : null}
      <label>
        {t('payment')}
        <select value={payment} onChange={e => setPayment(e.target.value as 'CASH' | 'TERMINAL')}>
          <option value="CASH">{t('cash')}</option>
          <option value="TERMINAL">{t('terminal')}</option>
        </select>
      </label>
      <label>
        {t('comment')}
        <input value={comment} onChange={e => setComment(e.target.value)} />
      </label>
      <button type="button" onClick={() => void price()} disabled={busy || !pickup || !dropoff || !vehicleClass}>{t('price')}</button>
      {quote ? <p>{t('priceIs', {amount: (quote.amount_minor / 100).toFixed(2), currency: quote.currency})}</p> : null}
      <button type="submit" disabled={busy || !quote}>{t('create')}</button>
      {message ? <p role="alert">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </form>
  );
}

function OrderView({client, order, onChange, newId, pollMs, onDone, rights, near}: {client: ApiClient; order: Order;
  onChange: (order: Order) => void; newId: () => string; pollMs: number; onDone: () => void; rights: Set<string>;
  near: Point}) {
  const canView = rights.has('orders.view');
  const [reasons, setReasons] = useState<{code: string; labels: Record<string, string>}[]>([]);
  const [reason, setReason] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);

  const refresh = useCallback(async () => {
    onChange(await client.get('/api/operator/v1/orders/{order_id}' as never,
      {params: {order_id: order.id}} as never) as Order);
  }, [client, order.id, onChange]);

  useEffect(() => {
    const timer = setInterval(() => {refresh().catch(failure => setError(failure));}, pollMs);
    return () => clearInterval(timer);
  }, [refresh, pollMs]);

  useEffect(() => {
    client.get('/api/operator/v1/cancel-reasons' as never, {} as never)
      .then(list => setReasons((list as {reasons: {code: string; labels: Record<string, string>}[]}).reasons))
      .catch(failure => setError(failure));
  }, [client]);

  async function cancel() {
    if (!reason) return;
    setMessage(null);
    setError(null);
    try {
      onChange(await client.post('/api/operator/v1/orders/{order_id}/cancel' as never, {params: {order_id: order.id},
        body: {command_id: newId(), expected_version: order.version, reason_code: reason}} as never) as Order);
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('orderMoved'));
        await refresh().catch(() => undefined);
      } else setError(failure);
    }
  }

  return (
    <section aria-labelledby="order-title">
      <h1 id="order-title">{t('order', {number: order.short_number})}</h1>
      <p>{t('status', {status: order.status})}</p>
      {order.payment_method ? <p>{t('paymentIs', {method: t('pay_' + order.payment_method)})}</p> : null}
      <label>
        {t('reason')}
        <select value={reason} onChange={e => setReason(e.target.value)}>
          <option value="" />
          {reasons.map(r => <option key={r.code} value={r.code}>{r.labels.ru ?? r.labels.uk ?? r.code}</option>)}
        </select>
      </label>
      <button type="button" onClick={() => void cancel()} disabled={!reason}>{t('cancel')}</button>
      <button type="button" onClick={onDone}>{t('another')}</button>
      <OrderChanges client={client} t={t} order={order} rights={rights} near={near} newId={newId}
        onChange={onChange} refresh={refresh} />
      <OrderTrip client={client} t={t} order={order} rights={rights} newId={newId} onChange={onChange}
        refresh={refresh} />
      <OrderActions client={client} t={t} order={order} rights={rights} newId={newId} onChange={onChange}
        refresh={refresh} />
      {/* The history and the conversation need orders.view (#292 H5). */}
      {canView ? <OrderCalls client={client} t={t} order={order} newId={newId} /> : null}
      {canView ? <OrderHistory client={client} t={t} orderId={order.id} /> : null}
      {message ? <p role="alert">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
