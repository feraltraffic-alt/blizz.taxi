import {useCallback, useEffect, useRef, useState} from 'react';
import {Pressable, Text, View} from 'react-native';
import {ApiError} from '@blizz/api-client';
import {
  CallButton, SafetyButton,
  Alert, Button, Chat, Field, Loading, Screen, usePushDecider, useTheme, type PushPort, type Shared
} from '@blizz/mobile-ui';
import {AfterRide} from './After';

export type Point = {lat: number; lon: number};
type Place = {label: string; point: Point};
type VehicleClass = {code: string; name: string};
type Quote = {id: string; amount_minor: number; currency: string; payment_methods?: string[];
  card_hold_minor?: number | null};
type Card = {id: string; masked_pan: string; card_type: string | null};
type Driver = {name: string; make: string; model: string; color: string; registration_number: string};
export type Order = {id: string; status: string; version: number; price_minor?: number | null; currency?: string;
  driver?: Driver | null; pickup_eta?: {seconds: number} | null; payment_method?: string; status_reason?: string | null};

const FINAL = new Set(['FULFILLED', 'CANCELLED', 'UNFULFILLED']);

/**
 * The rider's ride (#248): the order in progress, from the server after a restart too, or a new one from the
 * pickup, the drop-off, a vehicle class and its price.
 */
export function Ride(props: Shared & {newId: () => string; locate: () => Promise<Point>; service: string;
  pollMs: number; onLegal: () => void; onDebts: () => void; push?: PushPort; locale?: string}) {
  const {client, t, guard, failure} = props;
  const [order, setOrder] = useState<Order | null | undefined>(undefined);
  const [error, setError] = useState<string | null>(null);

  useEffect(() => {
    let current = true;
    guard(() => client.get('/api/rider/v1/orders/current'))
      .then(value => {
        // An order that ended before the app opened is history: a new ride starts.
        const first = (value as {orders: Order[]}).orders[0];
        if (current) setOrder(first && !FINAL.has(first.status) ? first : null);
      })
      .catch(failed => {if (current) setError(failure(failed));});
    return () => {current = false;};
  }, [client, guard]); // the failure text follows the same texts

  if (error) return <Screen><Alert text={error} /></Screen>;
  if (order === undefined) return <Loading t={t} />;
  // An order that ends while the rider follows it stays on screen (cancelled, finished) until "New ride".
  if (order) {
    return <Tracker {...props} order={order} onChange={setOrder} onDone={() => setOrder(null)} />;
  }
  return <NewOrder {...props} onOrdered={setOrder} />;
}

function Choice({label, onPress}: {label: string; onPress: () => void}) {
  const theme = useTheme();
  return (
    <Pressable accessibilityRole="button" accessibilityLabel={label} onPress={onPress}
      style={{paddingVertical: 8}}>
      <Text style={{color: theme.text}}>{label}</Text>
    </Pressable>
  );
}

function NewOrder({client, t, guard, failure, newId, locate, service, onLegal, onDebts, onOrdered, locale}: Shared & {
  newId: () => string; locate: () => Promise<Point>; service: string; onLegal: () => void; onDebts: () => void;
  locale?: string;
  onOrdered: (order: Order) => void}) {
  /** RIDER_HAS_DEBT: the way to pay it (#332 D6). */
  const [debt, setDebt] = useState(false);
  const [near, setNear] = useState<Point | null>(null);
  const [pickup, setPickup] = useState<Place | null>(null);
  const [dropoff, setDropoff] = useState<Place | null>(null);
  const [target, setTarget] = useState<'pickup' | 'dropoff'>('pickup');
  const [query, setQuery] = useState('');
  const [places, setPlaces] = useState<Place[]>([]);
  const [classes, setClasses] = useState<VehicleClass[]>([]);
  const [vehicleClass, setVehicleClass] = useState<string | null>(null);
  const [quote, setQuote] = useState<Quote | null>(null);
  const [card, setCard] = useState<Card | null>(null);
  const [byCard, setByCard] = useState(false);
  const [message, setMessage] = useState<string | null>(null);
  const [busy, setBusy] = useState(false);
  /** One command per quote: a double tap or a retry is the same order (E4). */
  const orderCommand = useRef<string | null>(null);
  const ordering = useRef(false);
  const theme = useTheme();

  useEffect(() => {
    let current = true;
    locate()
      .then(here => {
        if (!current) return;
        setNear(here);
        const located = {label: t('here'), point: here};
        setPickup(located);
        setTarget('dropoff'); // the pickup is here: the search is for where to go
        // The driver needs an address, not "here" (#345): the point's name, unless the rider chose a pickup meanwhile.
        client.get('/api/rider/v1/places/reverse' as never, {query: {lat: here.lat, lon: here.lon,
          ...(locale ? {language: locale} : {})}} as never)
          .then(place => {
            const label = (place as {label?: string} | undefined)?.label;
            if (current && label) setPickup(chosen => chosen === located ? {label, point: here} : chosen);
          })
          .catch(() => undefined);
      })
      // No location: the address search starts from the point of the service's first city (E2, #243).
      .catch(() => client.get('/api/config/v1/bootstrap' as never, {query: {service}} as never)
        .then(boot => {
          const city = (boot as {cities: {center: Point}[]}).cities[0];
          if (current && city) setNear(city.center);
        })
        .catch(failed => {if (current) setMessage(failure(failed));}));
    return () => {current = false;};
  }, [locate, client, service, t]); // the failure text follows the same texts

  useEffect(() => {
    if (!pickup) return;
    let current = true;
    setQuote(null);
    setMessage(null);
    guard(() => client.get('/api/rider/v1/vehicle-classes', {query: {lat: pickup.point.lat, lon: pickup.point.lon}}))
      .then(value => {
        if (!current) return;
        const found = value as VehicleClass[];
        setClasses(found);
        setVehicleClass(found[0]?.code ?? null);
      })
      .catch(failed => {
        if (!current) return;
        setClasses([]);
        setMessage(failed instanceof ApiError && failed.status === 422 ? t('outsideCities') : failure(failed));
      });
    return () => {current = false;};
  }, [client, guard, pickup]); // the texts follow the same locale

  async function search() {
    if (!near) return;
    setMessage(null);
    try {
      const answer = await guard(() => client.get('/api/rider/v1/places' as never,
        {query: {lat: near.lat, lon: near.lon, query, limit: 10}} as never)) as {places: Place[]};
      setPlaces(answer.places);
    } catch (failed) {
      setMessage(failure(failed));
    }
  }

  async function price() {
    if (!pickup || !dropoff || !vehicleClass) return;
    setBusy(true);
    setMessage(null);
    try {
      const priced = await guard(() => client.post('/api/rider/v1/quotes', {body: {
        command_id: newId(), vehicle_class: vehicleClass, pickup: pickup.point, dropoff: dropoff.point
      }})) as Quote;
      setQuote(priced);
      setByCard(false);
      orderCommand.current = newId();
      // A card is offered only when the city takes cards for this quote and the rider has saved one (#271).
      setCard(priced.payment_methods?.includes('CARD')
        ? await guard(() => client.get('/api/rider/v1/cards')).then(v => (v as {cards: Card[]}).cards[0] ?? null)
          .catch(() => null)
        : null);
    } catch (failed) {
      setMessage(failed instanceof ApiError && failed.status === 422 ? t('outsideCities') : failure(failed));
    } finally {
      setBusy(false);
    }
  }

  async function order() {
    if (!quote || !pickup || !dropoff || !vehicleClass || ordering.current) return;
    ordering.current = true;
    setBusy(true);
    setMessage(null);
    try {
      onOrdered(await guard(() => client.post('/api/rider/v1/orders', {body: {
        command_id: orderCommand.current as string, quote_id: quote.id, vehicle_class: vehicleClass,
        pickup: pickup.point, pickup_label: pickup.label, dropoff: dropoff.point, dropoff_label: dropoff.label,
        payment_method: byCard && card ? 'CARD' : 'CASH'
      }} as never)) as Order);
    } catch (failed) {
      if (failed instanceof ApiError && failed.code === 'QUOTE_EXPIRED') {
        setQuote(null);
        setMessage(t('quoteExpired'));
      } else if (failed instanceof ApiError && failed.code === 'ACCEPTANCE_REQUIRED') onLegal();
      else if (failed instanceof ApiError && failed.code === 'RIDER_HAS_DEBT') {
        setMessage(t('hasDebt'));
        setDebt(true);
      }
      else setMessage(failure(failed));
    } finally {
      ordering.current = false;
      setBusy(false);
    }
  }

  return (
    <Screen title={t('newRide')}>
      <Text style={{color: theme.muted}}>{t('from')}: {pickup?.label ?? '—'}</Text>
      <Text style={{color: theme.muted}}>{t('to')}: {dropoff?.label ?? '—'}</Text>
      <View style={{flexDirection: 'row', gap: 12}}>
        <Choice label={t('choosePickup')} onPress={() => {setTarget('pickup'); setPlaces([]);}} />
        <Choice label={t('chooseDropoff')} onPress={() => {setTarget('dropoff'); setPlaces([]);}} />
      </View>
      <Field label={target === 'pickup' ? t('pickupSearch') : t('dropoffSearch')} value={query} onChange={setQuery} />
      <Button label={t('search')} onPress={() => void search()} disabled={!near || query.trim().length < 3} />
      {places.map(p => (
        <Choice key={p.label + p.point.lat + p.point.lon} label={p.label} onPress={() => {
          if (target === 'pickup') setPickup(p); else setDropoff(p);
          setQuote(null);
          setPlaces([]);
          setQuery('');
          if (target === 'pickup') setTarget('dropoff');
        }} />
      ))}
      {classes.map(c => (
        <Choice key={c.code} label={(c.code === vehicleClass ? '● ' : '○ ') + c.name}
          onPress={() => {setVehicleClass(c.code); setQuote(null);}} />
      ))}
      <Button label={t('getPrice')} onPress={() => void price()} disabled={busy || !pickup || !dropoff || !vehicleClass} />
      {quote ? <Text style={{color: theme.text}}>{t('priceIs', {amount: (quote.amount_minor / 100).toFixed(2),
        currency: quote.currency})}</Text> : null}
      {quote && card ? (
        <>
          <Choice label={(byCard ? '○ ' : '● ') + t('payCash')} onPress={() => setByCard(false)} />
          <Choice label={(byCard ? '● ' : '○ ') + t('payCard', {card: (card.card_type ? card.card_type + ' ' : '')
            + card.masked_pan})} onPress={() => setByCard(true)} />
          {byCard && quote.card_hold_minor != null ? <Text style={{color: theme.muted}}>{t('cardHold', {amount:
            (quote.card_hold_minor / 100).toFixed(2) + ' ' + quote.currency})}</Text> : null}
        </>
      ) : null}
      <Button label={t('orderRide')} onPress={() => void order()} disabled={busy || !quote} />
      <Alert text={message} />
      {debt ? <Button label={t('payTheDebt')} onPress={onDebts} /> : null}
    </Screen>
  );
}

function Tracker({client, t, guard, failure, newId, pollMs, push, order, onChange, onDone}: Shared & {
  newId: () => string; pollMs: number; push?: PushPort; order: Order; onChange: (order: Order) => void;
  onDone: () => void}) {
  const [reasons, setReasons] = useState<{code: string; labels: Record<string, string>}[]>([]);
  const [reason, setReason] = useState<string | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const theme = useTheme();

  const refresh = useCallback(async () => {
    onChange(await guard(() => client.get('/api/rider/v1/orders/{order_id}' as never,
      {params: {order_id: order.id}} as never)) as Order);
  }, [client, guard, order.id, onChange]);

  // A push about this order that is not newer than what is shown is stale and stays hidden (AC-19); a newer one is
  // shown and the order is read at once. Pushes about other orders are none of this screen's business.
  usePushDecider(push, data => {
    if (data.order_id !== order.id) return true;
    if (!(Number(data.order_version) > order.version)) return false;
    refresh().catch(() => undefined);
    return true;
  });

  // An ended order changes no more: the server is no longer asked.
  const ended = FINAL.has(order.status);
  useEffect(() => {
    if (ended) return;
    const timer = setInterval(() => {refresh().catch(failed => setMessage(failure(failed)));}, pollMs);
    return () => clearInterval(timer);
  }, [refresh, pollMs, ended]); // the failure text follows the same texts

  useEffect(() => {
    guard(() => client.get('/api/rider/v1/cancel-reasons' as never, {} as never))
      .then(list => setReasons((list as {reasons: {code: string; labels: Record<string, string>}[]}).reasons))
      .catch(() => undefined);
  }, [client, guard]);

  async function cancel() {
    if (!reason) return;
    setMessage(null);
    try {
      onChange(await guard(() => client.post('/api/rider/v1/orders/{order_id}/cancel' as never, {
        params: {order_id: order.id}, body: {command_id: newId(), expected_version: order.version, reason_code: reason}
      } as never)) as Order);
    } catch (failed) {
      if (failed instanceof ApiError && failed.status === 409) {
        setMessage(t('orderMoved'));
        await refresh().catch(() => undefined);
      } else setMessage(failure(failed));
    }
  }

  const switching = useRef(false);
  /** A card order not finished may be paid in cash instead (REQ-PAY-20); the hold is then released. */
  async function payInCash() {
    if (switching.current) return;
    switching.current = true;
    setMessage(null);
    try {
      onChange(await guard(() => client.post('/api/rider/v1/orders/{order_id}/switch-to-cash' as never, {
        params: {order_id: order.id}, body: {command_id: newId(), expected_version: order.version}
      } as never)) as Order);
    } catch (failed) {
      if (failed instanceof ApiError && failed.code === 'PAYMENT_UNKNOWN') setMessage(t('paymentUnknown'));
      else if (failed instanceof ApiError && failed.status === 409) await refresh().catch(() => undefined);
      else setMessage(failure(failed));
    } finally {
      switching.current = false;
    }
  }

  const finished = FINAL.has(order.status);
  const paymentEnd = order.status === 'UNFULFILLED' && (order.status_reason === 'PAYMENT_DECLINED'
    || order.status_reason === 'PAYMENT_TIMEOUT') ? order.status_reason : null;
  return (
    <Screen title={t('yourRide')}>
      <Text style={{color: theme.text}}>{t('status_' + order.status)}</Text>
      <SafetyButton client={client} t={t} guard={guard} failure={failure} api="/api/rider/v1" />
      {paymentEnd ? <Text style={{color: theme.error}}>{t(paymentEnd === 'PAYMENT_DECLINED' ? 'paymentDeclined'
        : 'paymentTimeout')}</Text> : null}
      {order.payment_method ? <Text style={{color: theme.muted}}>{t(order.payment_method === 'CARD'
        ? 'paidByCard' : 'paidInCash')}</Text> : null}
      {order.payment_method === 'CARD' && !finished
        ? <Button label={t('switchToCash')} onPress={() => void payInCash()} /> : null}
      {order.driver ? (
        <Text style={{color: theme.text}}>
          {order.driver.name}: {order.driver.color} {order.driver.make} {order.driver.model},{' '}
          {order.driver.registration_number}
        </Text>
      ) : null}
      {order.status === 'ASSIGNED' || order.status === 'IN_SERVICE' || order.status === 'SEARCHING' ? <CallButton client={client} t={t} guard={guard}
        failure={failure} path="/api/rider/v1/orders/{order_id}/call" params={{order_id: order.id}}
        label={t('callDriver')} /> : null}
      {order.pickup_eta ? <Text style={{color: theme.muted}}>{t('eta', {minutes: Math.max(1,
        Math.round(order.pickup_eta.seconds / 60))})}</Text> : null}
      {order.driver ? <Chat client={client} t={t} guard={guard} failure={failure}
        path="/api/rider/v1/orders/{order_id}/messages" params={{order_id: order.id}} me="RIDER" newId={newId}
        pollMs={pollMs} /> : null}
      {order.status === 'FULFILLED' ? <AfterRide client={client} t={t} guard={guard} failure={failure}
        orderId={order.id} newId={newId} pollMs={pollMs} /> : null}
      {finished ? <Button label={t('newRideAgain')} onPress={onDone} /> : (
        <>
          {reasons.map(r => (
            <Choice key={r.code} label={(r.code === reason ? '● ' : '○ ') + (r.labels.ru ?? r.labels.uk ?? r.code)}
              onPress={() => setReason(r.code)} />
          ))}
          <Button label={t('cancelRide')} onPress={() => void cancel()} disabled={!reason} />
        </>
      )}
      <Alert text={message} />
    </Screen>
  );
}
