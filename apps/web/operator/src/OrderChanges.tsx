import {useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';
import {PlacePicker, type Place, type Point} from './Places.js';

type Order = {id: string; status: string; version: number; payment_method?: string};
type Changed<O> = {order: O; previous_price_minor: number; price_minor: number; currency: string;
  above_hold: boolean};

const CASH_STATUSES = ['AWAITING_PAYMENT', 'SCHEDULED', 'READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE'];
const money = (minor: number, currency: string) => (minor / 100).toFixed(2) + ' ' + currency;

/**
 * Switching a card order to cash (orders.create, REQ-PAY-20) and changing where a trip in progress ends
 * (orders.reassign, REQ-RID-06) (#309). Each needs a reason that is audited, carries the order's version, and is
 * offered only with its right and in its states; one command at a time.
 */
export function OrderChanges<O extends Order>({client, t, order, rights, near, newId, onChange, refresh}: {
  client: ApiClient; t: Translate; order: O; rights: Set<string>; near: Point; newId: () => string;
  onChange: (order: O) => void; refresh: () => Promise<void>}) {
  const canCash = rights.has('orders.create') && order.payment_method !== 'X'
    && CASH_STATUSES.includes(order.status);
  const canMove = rights.has('orders.reassign') && order.status === 'IN_SERVICE';
  const [cashReason, setCashReason] = useState('');
  const [place, setPlace] = useState<Place | null>(null);
  const [moveReason, setMoveReason] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const [aboveHold, setAboveHold] = useState(false);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  async function once(action: () => Promise<void>) {
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    setAboveHold(false);
    setError(null);
    try {
      await action();
    } catch (failure) {
      if (!(failure instanceof ApiError)) setError(failure);
      else if (failure.code === 'PAYMENT_UNKNOWN') setMessage(t('holdUnknown'));
      else if (failure.code === 'DROPOFF_OUTSIDE_CITY') setMessage(t('dropoffOutside'));
      else if (failure.status === 503) setMessage(t('noRoute'));
      else if (failure.status === 409) {
        setMessage(t('orderChanged'));
        await refresh().catch(() => undefined);
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  function toCash() {
    const why = cashReason.trim();
    if (!why || why.length > 500) {
      setMessage(t('reasonNeeded'));
      return;
    }
    return once(async () => {
      onChange(await client.post('/api/operator/v1/orders/{order_id}/switch-to-cash' as never, {params: {
        order_id: order.id}, body: {command_id: newId(), expected_version: order.version, reason: why}} as never) as O);
      setCashReason('');
    });
  }

  function move() {
    const why = moveReason.trim();
    if (!place || !why || why.length > 500) {
      setMessage(t('destinationNeeds'));
      return;
    }
    return once(async () => {
      const changed = await client.post('/api/operator/v1/orders/{order_id}/destination' as never, {params: {
        order_id: order.id}, body: {command_id: newId(), dropoff: place.point,
        dropoff_label: place.label, reason: why}} as never) as Changed<O>;
      onChange(changed.order);
      setMessage(t('newPrice', {now: money(changed.price_minor, changed.currency),
        before: money(changed.previous_price_minor, changed.currency)}));
      setAboveHold(changed.above_hold);
      setMoveReason('');
    });
  }

  if (!canCash && !canMove) return null;
  return (
    <section aria-label={t('orderChanges')}>
      {canCash ? (
        <fieldset>
          <legend>{t('toCash')}</legend>
          <label>
            {t('cashReason')}
            <input value={cashReason} onChange={e => setCashReason(e.target.value)} />
          </label>
          <button type="button" onClick={() => void toCash()}>{t('toCash')}</button>
        </fieldset>
      ) : null}
      {canMove ? (
        <fieldset>
          <legend>{t('changeDestination')}</legend>
          <PlacePicker client={client} t={t} label={t('newDestination')} near={near} callerPhone="" value={place}
            onPick={setPlace} />
          <label>
            {t('destinationReason')}
            <input value={moveReason} onChange={e => setMoveReason(e.target.value)} />
          </label>
          <button type="button" onClick={() => void move()}>{t('changeDestination')}</button>
        </fieldset>
      ) : null}
      {message ? <p role="status">{message}</p> : null}
      {aboveHold ? <p role="alert">{t('aboveHold')}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
