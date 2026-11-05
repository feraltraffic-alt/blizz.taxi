import {useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

type Order = {id: string; status: string; version: number; cancellation?: {fault?: string | null} | null};

const FAULTS = ['CLIENT_FREE', 'CLIENT', 'DRIVER', 'OPERATOR', 'NONE'];

/**
 * Who is at fault for a cancelled order (ADR 0019): shown to everyone who sees the order, and set again, with a
 * comment, by holders of orders.fault. The server counts or uncounts the driver's cancellation and the operator's
 * points; a change by someone else meanwhile reads the order again.
 */
export function OrderFault<O extends Order>({client, t, order, rights, newId, onChange, refresh}: {client: ApiClient;
  t: Translate; order: O; rights: Set<string>; newId: () => string; onChange: (order: O) => void;
  refresh: () => Promise<void>}) {
  const [fault, setFault] = useState('');
  const [comment, setComment] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);
  if (order.status !== 'CANCELLED' || !order.cancellation) return null;
  const now = order.cancellation.fault ?? null;
  const canChange = rights.has('orders.fault');

  async function change() {
    const why = comment.trim();
    if (!fault || fault === now || why === '' || why.length > 500) {
      setMessage(t('faultNeeds'));
      return;
    }
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      onChange(await client.post('/api/operator/v1/orders/{order_id}/cancellation-fault' as never,
        {params: {order_id: order.id}, body: {command_id: newId(), expected_version: order.version, fault,
          comment: why}} as never) as O);
      setFault('');
      setComment('');
      setMessage(t('faultChanged'));
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('orderChanged'));
        await refresh().catch(() => undefined);
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  return (
    <div>
      <p>{t('faultIs', {fault: now ? t('fault_' + now) : t('faultUnknown')})}</p>
      {canChange ? (
        <>
          <label>{t('faultNew')}
            <select value={fault} onChange={e => setFault(e.target.value)}>
              <option value="" />
              {FAULTS.filter(f => f !== now).map(f => <option key={f} value={f}>{t('fault_' + f)}</option>)}
            </select>
          </label>
          <label>{t('faultComment')}<input value={comment} onChange={e => setComment(e.target.value)} /></label>
          <button type="button" onClick={() => void change()}>{t('faultChange')}</button>
        </>
      ) : null}
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </div>
  );
}
