import {useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

type Holder = {driver_name?: string | null};
type Order = {id: string; status: string; version: number; reservation?: Holder | null};
type Reason = {code: string; labels: Record<string, string>};

/**
 * Interrupting a trip in progress (orders.interrupt, T-22) with an optional car sent for the rider, and taking the
 * reserving driver off a pre-order (orders.reassign, ADR 0006) (#311). Audited reasons; one command at a time.
 */
export function OrderTrip<O extends Order>({client, t, order, rights, newId, onChange, refresh}: {client: ApiClient;
  t: Translate; order: O; rights: Set<string>; newId: () => string; onChange: (order: O) => void;
  refresh: () => Promise<void>}) {
  const canInterrupt = rights.has('orders.interrupt') && order.status === 'IN_SERVICE';
  const canUnreserve = rights.has('orders.reassign') && order.status === 'SCHEDULED' && Boolean(order.reservation);
  const [reasons, setReasons] = useState<Reason[]>([]);
  const [reasonCode, setReasonCode] = useState('');
  const [comment, setComment] = useState('');
  const [followUp, setFollowUp] = useState(true);
  const [unreserveReason, setUnreserveReason] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  useEffect(() => {
    if (!canInterrupt) return;
    let current = true;
    client.get('/api/operator/v1/cancel-reasons' as never, {} as never)
      .then(list => {if (current) setReasons((list as {reasons: Reason[]}).reasons);})
      .catch(failure => {if (current) setError(failure);});
    return () => {current = false;};
  }, [client, canInterrupt]);

  async function once(action: () => Promise<void>) {
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      await action();
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('orderChanged'));
        await refresh().catch(() => undefined);
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  function interrupt() {
    if (!reasonCode || comment.length > 500) {
      setMessage(t('interruptNeeds'));
      return;
    }
    return once(async () => {
      const result = await client.post('/api/operator/v1/orders/{order_id}/interrupt' as never, {params: {
        order_id: order.id}, body: {command_id: newId(), expected_version: order.version, reason_code: reasonCode,
        ...(comment.trim() ? {comment: comment.trim()} : {}), follow_up: followUp}} as never) as {order: O;
        follow_up: {short_number: number} | null};
      onChange(result.order);
      if (result.follow_up) setMessage(t('followUpSent', {number: result.follow_up.short_number}));
    });
  }

  function unreserve() {
    const why = unreserveReason.trim();
    if (!why || why.length > 500) {
      setMessage(t('reasonNeeded'));
      return;
    }
    return once(async () => {
      onChange(await client.post('/api/operator/v1/orders/{order_id}/remove-reservation' as never, {params: {
        order_id: order.id}, body: {command_id: newId(), reason: why}} as never) as O);
      setUnreserveReason('');
    });
  }

  if (!canInterrupt && !canUnreserve && !message) return null;
  return (
    <section aria-label={t('orderTrip')}>
      {canInterrupt ? (
        <fieldset>
          <legend>{t('interrupt')}</legend>
          <label>
            {t('interruptReason')}
            <select value={reasonCode} onChange={e => setReasonCode(e.target.value)}>
              <option value="" />
              {reasons.map(r => <option key={r.code} value={r.code}>{r.labels.ru ?? r.labels.uk ?? r.code}</option>)}
            </select>
          </label>
          <label>
            {t('interruptComment')}
            <input value={comment} onChange={e => setComment(e.target.value)} />
          </label>
          <label>
            <input type="checkbox" checked={followUp} onChange={e => setFollowUp(e.target.checked)} />
            {t('followUp')}
          </label>
          <button type="button" onClick={() => void interrupt()}>{t('interrupt')}</button>
        </fieldset>
      ) : null}
      {canUnreserve ? (
        <fieldset>
          <legend>{t('unreserve')}</legend>
          <p>{t('reservedBy', {name: order.reservation?.driver_name ?? t('noName')})}</p>
          <label>
            {t('unreserveReason')}
            <input value={unreserveReason} onChange={e => setUnreserveReason(e.target.value)} />
          </label>
          <button type="button" onClick={() => void unreserve()}>{t('unreserve')}</button>
        </fieldset>
      ) : null}
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
