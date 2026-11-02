import {useCallback, useEffect, useRef, useState} from 'react';
import {Pressable, Text, View} from 'react-native';
import {ApiError} from '@blizz/api-client';
import {Alert, Button, Field, Loading, Screen, useTheme, type Shared} from '@blizz/mobile-ui';

export type Point = {lat: number; lon: number};
type Place = {label: string; point: Point};
type VehicleClass = {code: string; name: string};
type Quote = {id: string; amount_minor: number; currency: string};
type Driver = {name: string; make: string; model: string; color: string; registration_number: string};
export type Order = {id: string; status: string; version: number; price_minor?: number | null; currency?: string;
  driver?: Driver | null; pickup_eta?: {seconds: number} | null};

const FINAL = new Set(['FULFILLED', 'CANCELLED', 'UNFULFILLED']);

/**
 * The rider's ride (#248): the order in progress, from the server after a restart too, or a new one from the
 * pickup, the drop-off, a vehicle class and its price.
 */
export function Ride(props: Shared & {newId: () => string; locate: () => Promise<Point>; service: string;
  pollMs: number; onLegal: () => void}) {
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

function NewOrder({client, t, guard, failure, newId, locate, service, onLegal, onOrdered}: Shared & {
  newId: () => string; locate: () => Promise<Point>; service: string; onLegal: () => void;
  onOrdered: (order: Order) => void}) {
  const [near, setNear] = useState<Point | null>(null);
  const [pickup, setPickup] = useState<Place | null>(null);
  const [dropoff, setDropoff] = useState<Place | null>(null);
  const [target, setTarget] = useState<'pickup' | 'dropoff'>('pickup');
  const [query, setQuery] = useState('');
  const [places, setPlaces] = useState<Place[]>([]);
  const [classes, setClasses] = useState<VehicleClass[]>([]);
  const [vehicleClass, setVehicleClass] = useState<string | null>(null);
  const [quote, setQuote] = useState<Quote | null>(null);
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
        setPickup({label: t('here'), point: here});
        setTarget('dropoff'); // the pickup is here: the search is for where to go
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
      orderCommand.current = newId();
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
        payment_method: 'CASH'
      }} as never)) as Order);
    } catch (failed) {
      if (failed instanceof ApiError && failed.code === 'QUOTE_EXPIRED') {
        setQuote(null);
        setMessage(t('quoteExpired'));
      } else if (failed instanceof ApiError && failed.code === 'ACCEPTANCE_REQUIRED') onLegal();
      else if (failed instanceof ApiError && failed.code === 'RIDER_HAS_DEBT') setMessage(t('hasDebt'));
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
      <Button label={t('orderRide')} onPress={() => void order()} disabled={busy || !quote} />
      <Alert text={message} />
    </Screen>
  );
}

function Tracker({client, t, guard, failure, newId, pollMs, order, onChange, onDone}: Shared & {
  newId: () => string; pollMs: number; order: Order; onChange: (order: Order) => void; onDone: () => void}) {
  const [reasons, setReasons] = useState<{code: string; labels: Record<string, string>}[]>([]);
  const [reason, setReason] = useState<string | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const theme = useTheme();

  const refresh = useCallback(async () => {
    onChange(await guard(() => client.get('/api/rider/v1/orders/{order_id}' as never,
      {params: {order_id: order.id}} as never)) as Order);
  }, [client, guard, order.id, onChange]);

  useEffect(() => {
    const timer = setInterval(() => {refresh().catch(failed => setMessage(failure(failed)));}, pollMs);
    return () => clearInterval(timer);
  }, [refresh, pollMs]); // the failure text follows the same texts

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

  const finished = FINAL.has(order.status);
  return (
    <Screen title={t('yourRide')}>
      <Text style={{color: theme.text}}>{t('status_' + order.status)}</Text>
      {order.driver ? (
        <Text style={{color: theme.text}}>
          {order.driver.name}: {order.driver.color} {order.driver.make} {order.driver.model},{' '}
          {order.driver.registration_number}
        </Text>
      ) : null}
      {order.pickup_eta ? <Text style={{color: theme.muted}}>{t('eta', {minutes: Math.max(1,
        Math.round(order.pickup_eta.seconds / 60))})}</Text> : null}
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
