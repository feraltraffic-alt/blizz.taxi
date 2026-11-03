import {useCallback, useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import type {Translate} from '@blizz/web-ui';
import {Chargebacks} from './Chargebacks.js';
import {decimal} from './Promotions.js';

type Operation = {id: string; type: string; state: string; amount_minor: number; currency: string;
  provider_status: string | null; reason: string | null; retry_of: string | null; initiated_by: string | null;
  created_at: string};

const UNDER_WAY = ['CREATED', 'SENDING', 'PENDING', 'UNKNOWN'];

function utc(at: string) {
  const when = new Date(at);
  return when.toLocaleDateString('ru-RU', {timeZone: 'UTC'}) + ' '
    + when.toLocaleTimeString('ru-RU', {timeZone: 'UTC', hour: '2-digit', minute: '2-digit'}) + ' UTC';
}

/**
 * An order's card operations for holders of payments.retry (#424, REQ-PAY-14): oldest first, and a retry of a charge
 * the provider declined for sure, offered only while no later operation repeats it and nothing else is under way, so
 * a card is never charged twice.
 */
export function PaymentOperations({client, t, newId, orderId}: {client: ApiClient; t: Translate; newId: () => string;
  orderId: string}) {
  const [operations, setOperations] = useState<Operation[] | null>(null);
  const [none, setNone] = useState(false);
  const [reasons, setReasons] = useState<Record<string, string>>({});
  const [message, setMessage] = useState<string | null>(null);
  const acting = useRef(false);

  const read = useCallback(async () => {
    try {
      const answer = await client.get('/api/admin/v1/orders/{order_id}/payment-operations' as never,
        {params: {order_id: orderId}} as never) as {operations: Operation[]};
      setOperations(answer.operations);
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 404) setNone(true);
    }
  }, [client, orderId]);

  useEffect(() => {
    void read();
  }, [read]);

  async function retry(o: Operation) {
    if (acting.current) return;
    const reason = (reasons[o.id] ?? '').trim();
    if (!reason) {
      setMessage(t('retryNeeds'));
      return;
    }
    acting.current = true;
    setMessage(null);
    try {
      const made = await client.post('/api/admin/v1/payment-operations/{operation_id}/retry' as never, {params: {
        operation_id: o.id}, body: {command_id: newId(), reason}} as never) as Operation;
      setOperations(list => [...(list ?? []), made]);
    } catch (failure) {
      if (failure instanceof ApiError && failure.code === 'PAYMENT_UNKNOWN') setMessage(t('retryUnknown'));
      else if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('retryConflict'));
        await read();
      } else setMessage(t('genericError'));
    } finally {
      acting.current = false;
    }
  }

  if (none) return <p>{t('payOpsNone')}</p>;
  if (!operations) return null;
  const busy = operations.some(o => UNDER_WAY.includes(o.state));
  const repeated = new Set(operations.map(o => o.retry_of).filter(Boolean));
  const retryable = (o: Operation) => o.type === 'CHARGE' && o.state === 'DECLINED' && !repeated.has(o.id) && !busy;
  return (
    <section aria-labelledby="payops-title">
      <h2 id="payops-title">{t('payOpsTitle')}</h2>
      <ul>
        {operations.map(o => (
          <li key={o.id}>
            <span>{[utc(o.created_at), t('payOp_' + o.type), decimal(o.amount_minor) + ' ' + o.currency,
              t('payOpState_' + o.state), ...(o.provider_status ? [o.provider_status] : []),
              ...(o.reason ? [o.reason] : []), ...(o.retry_of ? [t('payOpRetry', {who: (o.initiated_by ?? '—')
                .slice(0, 8)})] : [])].join(' · ')}</span>
            {retryable(o) ? (
              <>
                <label>{t('retryReason')}<input value={reasons[o.id] ?? ''}
                  onChange={e => setReasons(all => ({...all, [o.id]: e.target.value}))} /></label>
                <button type="button" onClick={() => void retry(o)}>{t('retryCharge')}</button>
              </>
            ) : null}
          </li>
        ))}
      </ul>
      {message ? <p role="status">{message}</p> : null}
      {operations.length > 0 ? <Chargebacks client={client} t={t} newId={newId} orderId={orderId}
        currency={operations[0]!.currency} /> : null}
    </section>
  );
}
