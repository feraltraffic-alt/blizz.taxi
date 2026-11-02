import {useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

type Party = 'CALLER' | 'DRIVER' | 'RIDER';
type Order = {id: string; status: string; payer_client_id?: string | null};

/**
 * Click-to-call from an order (#304): the server rings my phone, then the other side; the number never reaches the
 * panel. After a 503 the answer may be lost, so the retry is the same command (it never rings twice); a new press
 * after a definite answer (a call, a FAILED call or a 409) is a new command.
 */
export function OrderCalls({client, t, order, newId}: {client: ApiClient; t: Translate; order: Order;
  newId: () => string}) {
  const [message, setMessage] = useState<string | null>(null);
  const [retry, setRetry] = useState<Party | null>(null);
  const [error, setError] = useState<unknown>(null);
  const pending = useRef<{to: Party; command: string} | null>(null);
  const acting = useRef(false);

  const parties: Party[] = ['CALLER', ...(['ASSIGNED', 'IN_SERVICE'].includes(order.status) ? ['DRIVER' as const]
    : []), ...(order.payer_client_id ? ['RIDER' as const] : [])];

  async function call(to: Party, again: boolean) {
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    setError(null);
    setRetry(null);
    const command = again && pending.current?.to === to ? pending.current.command : newId();
    pending.current = {to, command};
    try {
      const placed = await client.post('/api/operator/v1/orders/{order_id}/calls' as never,
        {params: {order_id: order.id}, body: {command_id: command, to}} as never) as {state: string};
      pending.current = null;
      setMessage(placed.state === 'FAILED' ? t('callFailed') : t('phoneRinging'));
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 503) {
        setMessage(t('callUnsure'));
        setRetry(to);
      } else {
        pending.current = null;
        if (failure instanceof ApiError && failure.status === 409) setMessage(t('cannotCall'));
        else setError(failure);
      }
    } finally {
      acting.current = false;
    }
  }

  return (
    <section aria-label={t('orderCalls')}>
      {parties.map(p => <button key={p} type="button" onClick={() => void call(p, false)}>{t('callTo_' + p)}</button>)}
      {retry ? <button type="button" onClick={() => void call(retry, true)}>{t('retryCall')}</button> : null}
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
