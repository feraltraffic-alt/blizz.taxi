import {useCallback, useEffect, useRef, useState} from 'react';
import {Text, View} from 'react-native';
import {ApiError} from '@blizz/api-client';
import {
  Alert, Button, CallButton, Chat, Field, usePushDecider, useTheme, type Locale, type PushPort, type Shared
} from '@blizz/mobile-ui';

type Point = {lat: number; lon: number};
export type Offer = {id: string; order_id: string; seconds_left: number; vehicle_class: string; pickup_label: string;
  dropoff_label: string; payment_method: string; price_minor?: number | null; currency?: string | null;
  expected_earnings_minor?: number | null; comment?: string | null; entrance?: string | null; distance_m?: number | null};
export type Trip = {id: string; order_id?: string; phase: string; version: number; pickup: Point; pickup_label: string; dropoff: Point;
  dropoff_label: string; payment_method: string; price_minor?: number | null; currency?: string | null;
  wallet_minor?: number; discount_minor?: number; comment?: string | null; entrance?: string | null};
type Reason = {code: string; labels: Record<string, string>};
type BroadcastOrder = {order_id: string; vehicle_class: string; pickup_label: string; dropoff_label: string;
  payment_method: string; price_minor?: number | null; currency?: string | null; distance_m: number};

const ENDED = new Set(['COMPLETED', 'ABORTED']);
const money = (minor: number, currency?: string | null) => (minor / 100).toFixed(2) + (currency ? ' ' + currency : '');

type Props = Shared & {newId: () => string; now: () => number; pollMs: number; locale: Locale; push?: PushPort};

/**
 * The driver's work while online (#249): the current trip from the server, also after a restart, or else the open
 * personal offers with their countdown.
 */
export function Dispatch(props: Props) {
  const {client, t, guard, failure, pollMs} = props;
  const [trip, setTrip] = useState<Trip | null | undefined>(undefined);
  const [message, setMessage] = useState<string | null>(null);
  /** The order of the trip this driver just completed, to rate its rider (#460). */
  const [toRate, setToRate] = useState<string | null>(null);

  const load = useCallback(async () => {
    const current = await guard(() => client.get('/api/driver/v1/trips/current')) as Trip | undefined;
    setTrip(current && !ENDED.has(current.phase) ? current : null);
  }, [client, guard]);

  useEffect(() => {
    load().catch(failed => setMessage(failure(failed)));
  }, [load]); // the failure text follows the same texts

  // The rider or a dispatcher may end the trip: the server is asked again while it lasts.
  const onTrip = Boolean(trip);
  useEffect(() => {
    if (!onTrip) return;
    const timer = setInterval(() => {load().catch(() => undefined);}, pollMs);
    return () => clearInterval(timer);
  }, [onTrip, load, pollMs]);

  const moved = useCallback(async () => {
    setMessage(t('tripMoved'));
    await load().catch(failed => setMessage(failure(failed)));
  }, [load, t]); // the failure text follows the same texts

  return (
    <View style={{gap: 16}}>
      {toRate && !trip ? <RateRider {...props} orderId={toRate} close={() => setToRate(null)} /> : null}
      {trip === undefined ? null : trip ? (
        <TripCard {...props} trip={trip} say={setMessage} moved={moved}
          onTrip={next => {
            if (next.phase === 'COMPLETED' && next.order_id) setToRate(next.order_id);
            setTrip(ENDED.has(next.phase) ? null : next);
          }} />
      ) : <Offers {...props} say={setMessage} accepted={() => load().catch(failed => setMessage(failure(failed)))} />}
      <Alert text={message} />
    </View>
  );
}

/**
 * The driver's score of the rider after a completed trip (#460): 1–5 and a comment only staff read, sent once; the
 * server's edit window may have passed.
 */
function RateRider({client, t, guard, failure, newId, orderId, close}: Props & {orderId: string; close: () => void}) {
  const theme = useTheme();
  const [score, setScore] = useState<number | null>(null);
  const [comment, setComment] = useState('');
  const [done, setDone] = useState(false);
  const [note, setNote] = useState<string | null>(null);
  const sending = useRef(false);

  async function send() {
    if (sending.current || done) return;
    const text = comment.trim();
    if (score === null || text.length > 500) {
      setNote(t('rateNeeds'));
      return;
    }
    sending.current = true;
    setNote(null);
    try {
      await guard(() => client.post('/api/driver/v1/orders/{order_id}/rating' as never, {params: {order_id: orderId},
        body: {command_id: newId(), score, ...(text ? {comment: text} : {})}} as never));
      setDone(true);
    } catch (failed) {
      setNote(failed instanceof ApiError && failed.status === 409 ? t('rateClosed') : failure(failed));
    } finally {
      sending.current = false;
    }
  }

  return (
    <View style={{gap: 8}}>
      <Text style={{color: theme.text, fontWeight: '600'}}>{t('rateRider')}</Text>
      {done ? <Text style={{color: theme.text}}>{t('rateThanks')}</Text> : (
        <>
          <View style={{flexDirection: 'row', gap: 6}}>
            {[1, 2, 3, 4, 5].map(n => (
              <Button key={n} label={(score === n ? '● ' : '') + n} accessibilityLabel={t('rateScore', {n})}
                onPress={() => setScore(n)} />
            ))}
          </View>
          <Field label={t('rateComment')} value={comment} onChange={setComment} />
          <Button label={t('rateSend')} onPress={() => void send()} />
        </>
      )}
      <Alert text={note} />
      <Button label={done ? t('rateDone') : t('rateSkip')} onPress={close} />
    </View>
  );
}

function Offers({client, t, guard, failure, newId, pollMs, push, say, accepted}: Props & {say: (text: string | null) => void;
  accepted: () => void}) {
  const [offer, setOffer] = useState<Offer | null>(null);
  const [polled, setPolled] = useState(false);
  const [left, setLeft] = useState(0);
  const gone = useRef(new Set<string>());
  const commands = useRef(new Map<string, string>());
  const acting = useRef(false);
  const theme = useTheme();

  const poll = useCallback(async () => {
    const list = await guard(() => client.get('/api/driver/v1/offers')) as Offer[];
    const next = list.find(o => !gone.current.has(o.id) && o.seconds_left > 0) ?? null;
    setOffer(next);
    setPolled(true);
    // The server's seconds, never the device clock (REQ-DRV-07): a phone set minutes off still counts right.
    if (next) setLeft(next.seconds_left);
  }, [client, guard]);

  useEffect(() => {
    poll().catch(failed => say(failure(failed)));
    const timer = setInterval(() => {poll().catch(() => undefined);}, pollMs);
    return () => clearInterval(timer);
  }, [poll, pollMs]); // the failure text follows the same texts

  // An offer push while the app is open is not shown: the offers are asked at once and the screen shows it (#264).
  usePushDecider(push, data => {
    if (data.type !== 'driver.offer') return true;
    poll().catch(() => undefined);
    return false;
  });

  const offerId = offer?.id;
  useEffect(() => {
    if (!offerId) return;
    const timer = setInterval(() => setLeft(seconds => seconds - 1), 1000);
    return () => clearInterval(timer);
  }, [offerId]);

  useEffect(() => {
    if (offerId && left <= 0) {
      gone.current.add(offerId);
      setOffer(null);
    }
  }, [offerId, left]);

  async function answer(accept: boolean) {
    if (!offer || acting.current) return;
    acting.current = true;
    say(null);
    const id = offer.id;
    // One command per offer: a repeat after a lost answer is the same accept (T-10).
    const command = commands.current.get(id) ?? newId();
    commands.current.set(id, command);
    try {
      await guard(() => client.post(('/api/driver/v1/offers/{offer_id}/' + (accept ? 'accept' : 'reject')) as never,
        {params: {offer_id: id}, body: {command_id: command}} as never));
      gone.current.add(id);
      setOffer(null);
      if (accept) accepted();
    } catch (failed) {
      if (failed instanceof ApiError && (failed.status === 409 || failed.status === 404)) {
        gone.current.add(id);
        setOffer(null);
        say(t('offerGone'));
      } else say(failure(failed));
    } finally {
      acting.current = false;
    }
  }

  if (!offer) {
    return (
      <View style={{gap: 12}}>
        <Text style={{color: theme.muted}}>{t('waitingOffers')}</Text>
        {polled ? <AllTab client={client} t={t} guard={guard} failure={failure} newId={newId} pollMs={pollMs}
          say={say} accepted={accepted} /> : null}
      </View>
    );
  }
  return (
    <View style={{gap: 12}}>
      <Text style={{color: theme.text, fontWeight: '600'}}>{t('newOffer')}</Text>
      <Text style={{color: theme.text}}>{offer.pickup_label} → {offer.dropoff_label}</Text>
      <Text style={{color: theme.muted}}>{t('secondsLeft', {seconds: Math.max(0, left)})}</Text>
      {offer.price_minor != null ? (
        <Text style={{color: theme.text}}>{t('price', {amount: money(offer.price_minor, offer.currency)})}</Text>
      ) : null}
      {offer.expected_earnings_minor != null ? (
        <Text style={{color: theme.muted}}>{t('earnings', {amount: money(offer.expected_earnings_minor,
          offer.currency)})}</Text>
      ) : null}
      <Text style={{color: theme.muted}}>{t('payment_' + offer.payment_method)} · {offer.vehicle_class}
        {offer.distance_m != null ? ' · ' + t('distance', {meters: offer.distance_m}) : ''}</Text>
      {offer.comment ? <Text style={{color: theme.text}}>{offer.comment}</Text> : null}
      {offer.entrance ? <Text style={{color: theme.text}}>{t('entrance', {entrance: offer.entrance})}</Text> : null}
      <Button label={t('acceptOffer')} onPress={() => void answer(true)} />
      <Button label={t('declineOffer')} onPress={() => void answer(false)} />
    </View>
  );
}

function TripCard({client, t, guard, failure, newId, now, locale, pollMs, trip, say, moved, onTrip}: Props & {trip: Trip;
  say: (text: string | null) => void; moved: () => Promise<void>; onTrip: (trip: Trip) => void}) {
  const [reasons, setReasons] = useState<Reason[]>([]);
  const [reason, setReason] = useState<string | null>(null);
  const [farAway, setFarAway] = useState<string | null>(null);
  const [why, setWhy] = useState('');
  const [confirming, setConfirming] = useState(false);
  const [busy, setBusy] = useState(false);
  const acting = useRef(false);
  const theme = useTheme();
  const beforeStart = trip.phase === 'TO_PICKUP' || trip.phase === 'WAITING';

  useEffect(() => {
    if (!beforeStart) return;
    guard(() => client.get('/api/driver/v1/cancel-reasons'))
      .then(list => setReasons((list as {reasons: Reason[]}).reasons))
      .catch(() => undefined);
  }, [beforeStart, client, guard]);

  /** One command at a time: a double tap with a slow answer sends one (E3). */
  async function run(action: string, extra: Record<string, unknown> = {}) {
    if (acting.current) return;
    acting.current = true;
    setBusy(true);
    say(null);
    try {
      const next = await guard(() => client.post(('/api/driver/v1/trips/{trip_id}/' + action) as never, {
        params: {trip_id: trip.id}, body: {command_id: newId(), expected_version: trip.version, ...extra}
      } as never)) as Trip;
      setFarAway(null);
      setConfirming(false);
      onTrip(next);
    } catch (failed) {
      if (action === 'arrive' && failed instanceof ApiError
        && (failed.code === 'PICKUP_TOO_FAR' || failed.code === 'LOCATION_NOT_FRESH')) {
        setFarAway(failed.code);
      } else if (action === 'no-show' && failed instanceof ApiError && failed.status === 409) {
        say(t('noShowEarly'));
      } else if (failed instanceof ApiError && failed.status === 409) {
        await moved();
      } else say(failure(failed));
    } finally {
      acting.current = false;
      setBusy(false);
    }
  }

  const toCollect = (trip.price_minor ?? 0) - (trip.wallet_minor ?? 0) - (trip.discount_minor ?? 0);
  const cash = trip.payment_method === 'CASH' || trip.payment_method === 'TERMINAL';
  const amount = money(Math.max(0, toCollect), trip.currency);

  function complete(received: boolean) {
    void run('complete', {reported_at: new Date(now()).toISOString(), ...(received ? {cash_received: true} : {})});
  }

  return (
    <View style={{gap: 12}}>
      <Text style={{color: theme.text, fontWeight: '600'}}>{t('phase_' + trip.phase)}</Text>
      <Text style={{color: theme.text}}>{trip.pickup_label} → {trip.dropoff_label}</Text>
      {trip.comment ? <Text style={{color: theme.text}}>{trip.comment}</Text> : null}
      {trip.entrance ? <Text style={{color: theme.text}}>{t('entrance', {entrance: trip.entrance})}</Text> : null}
      {cash && trip.price_minor != null ? (
        <Text style={{color: theme.text}}>{t(trip.payment_method === 'CASH' ? 'collectCash' : 'collectTerminal',
          {amount})}</Text>
      ) : null}
      {trip.phase === 'TO_PICKUP' ? (
        <>
          <Button label={t('arrived')} onPress={() => void run('arrive')} disabled={busy} />
          {farAway ? (
            <>
              <Text style={{color: theme.error}}>{t(farAway === 'PICKUP_TOO_FAR' ? 'tooFar' : 'notFresh')}</Text>
              <Field label={t('whyHere')} value={why} onChange={setWhy} />
              <Button label={t('confirmArrival')} disabled={busy || why.trim() === ''}
                onPress={() => void run('arrive', {exception_reason: why.trim()})} />
            </>
          ) : null}
        </>
      ) : null}
      {trip.phase === 'WAITING' ? (
        <>
          <Button label={t('startTrip')} onPress={() => void run('start')} disabled={busy} />
          <Button label={t('noShow')} onPress={() => void run('no-show')} disabled={busy} />
        </>
      ) : null}
      {trip.phase === 'IN_PROGRESS' ? (
        confirming ? (
          <Button label={t(trip.payment_method === 'CASH' ? 'cashReceived' : 'terminalPaid', {amount})}
            onPress={() => complete(true)} disabled={busy} />
        ) : (
          <Button label={t('completeTrip')} disabled={busy}
            onPress={() => {if (cash) setConfirming(true); else complete(false);}} />
        )
      ) : null}
      <CallButton client={client} t={t} guard={guard} failure={failure} path="/api/driver/v1/trips/{trip_id}/call"
        params={{trip_id: trip.id}} label={t('callRider')} />
      <Chat client={client} t={t} guard={guard} failure={failure} path="/api/driver/v1/trips/{trip_id}/messages"
        params={{trip_id: trip.id}} me="DRIVER" newId={newId} pollMs={pollMs} />
      {beforeStart ? (
        <>
          {reasons.map(r => (
            <Button key={r.code} label={(r.code === reason ? '● ' : '○ ') + (r.labels[locale] ?? r.labels.ru ?? r.code)}
              onPress={() => setReason(r.code)} />
          ))}
          <Button label={t('cancelTrip')} disabled={busy || !reason}
            onPress={() => void run('cancel', {reason_code: reason})} />
        </>
      ) : null}
    </View>
  );
}

/**
 * The ALL tab (#256, REQ-DRV-08): orders nobody took as a personal offer, near the driver. Shown only while no
 * personal offer is open; polled at the screen's pace, which stays within the server's 120 reads a minute.
 */
function AllTab({client, t, guard, failure, newId, pollMs, say, accepted}: Shared & {newId: () => string;
  pollMs: number; say: (text: string | null) => void; accepted: () => void}) {
  const [orders, setOrders] = useState<BroadcastOrder[]>([]);
  const [listError, setListError] = useState<string | null>(null);
  const gone = useRef(new Set<string>());
  const commands = useRef(new Map<string, string>());
  const acting = useRef(false);
  const theme = useTheme();

  const text = useCallback((error: unknown) => error instanceof ApiError && error.status === 429 ? t('tooOften')
    : failure(error), [t]); // the failure text follows the same texts

  // A failed read is said under the list, never over what the screen said last (an offer gone, a trip moved).
  const read = useCallback(async () => {
    try {
      const list = await guard(() => client.get('/api/driver/v1/broadcast-orders' as never, {} as never)) as
        BroadcastOrder[];
      setOrders(list.filter(o => !gone.current.has(o.order_id)));
      setListError(null);
    } catch (error) {
      setListError(text(error));
    }
  }, [client, guard, text]);

  useEffect(() => {
    void read();
    const timer = setInterval(() => {void read();}, pollMs);
    return () => clearInterval(timer);
  }, [read, pollMs]);

  /** One claim at a time (A5), one command per order: a repeat after a lost answer is the same claim. */
  async function take(orderId: string) {
    if (acting.current) return;
    acting.current = true;
    say(null);
    const command = commands.current.get(orderId) ?? newId();
    commands.current.set(orderId, command);
    try {
      await guard(() => client.post('/api/driver/v1/orders/{order_id}/claim' as never,
        {params: {order_id: orderId}, body: {command_id: command}} as never));
      accepted();
    } catch (error) {
      if (error instanceof ApiError && error.code === 'ORDER_ALREADY_ASSIGNED') {
        gone.current.add(orderId);
        setOrders(list => list.filter(o => o.order_id !== orderId));
        say(t('alreadyTaken'));
      } else if (error instanceof ApiError && error.code === 'PICKUP_TOO_FAR') {
        say(t('claimTooFar'));
        await read();
      } else if (error instanceof ApiError && error.code === 'STATE_CONFLICT') {
        say(t('shiftElsewhere'));
      } else say(text(error));
    } finally {
      acting.current = false;
    }
  }

  if (orders.length === 0) return listError ? <Alert text={listError} /> : null;
  return (
    <View style={{gap: 12}}>
      <Text style={{color: theme.text, fontWeight: '600'}}>{t('allOrders')}</Text>
      <Alert text={listError} />
      {orders.map(o => (
        <View key={o.order_id} style={{gap: 6}}>
          <Text style={{color: theme.text}}>{o.pickup_label} → {o.dropoff_label}</Text>
          <Text style={{color: theme.muted}}>
            {t('distance', {meters: o.distance_m})} · {o.vehicle_class} · {t('payment_' + o.payment_method)}
            {o.price_minor != null ? ' · ' + money(o.price_minor, o.currency) : ''}
          </Text>
          <Button label={t('takeOrder')} onPress={() => void take(o.order_id)} />
        </View>
      ))}
    </View>
  );
}
