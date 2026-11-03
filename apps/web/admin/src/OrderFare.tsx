import {useCallback, useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import type {Translate} from '@blizz/web-ui';
import {decimal} from './Promotions.js';

type Version = {id: string; version: number; amount_minor: number; commission_minor: number;
  driver_share_minor: number; reason: string | null; author_id: string | null};
type Fare = {currency: string; current_version: number; versions: Version[]; refund_obligation_minor: number;
  refund_state: string};

/** "105" or "105,5" → minor units without floating point; null with more than two decimals. */
function minorUnits(text: string) {
  const parts = /^([0-9]{1,9})(?:[.,]([0-9]{1,2}))?$/.exec(text.trim());
  return parts ? Number(parts[1]) * 100 + Number((parts[2] ?? '').padEnd(2, '0')) : null;
}

/**
 * An order's final fare (#422, REQ-PRC-10): every version, a refund owed, and for holders of fares.correct a new
 * version with a reason, confirmed with the own password, which never stays on the screen.
 */
export function OrderFare({client, t, newId, orderId, canCorrect}: {client: ApiClient; t: Translate;
  newId: () => string; orderId: string; canCorrect: boolean}) {
  const [fare, setFare] = useState<Fare | null>(null);
  const [none, setNone] = useState(false);
  const [amount, setAmount] = useState('');
  const [reason, setReason] = useState('');
  const [own, setOwn] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const acting = useRef(false);

  const read = useCallback(async () => {
    try {
      const value = await client.get('/api/admin/v1/orders/{order_id}/fare' as never,
        {params: {order_id: orderId}} as never) as Fare;
      setFare(value);
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 404) setNone(true);
    }
  }, [client, orderId]);

  useEffect(() => {
    void read();
  }, [read]);

  async function correct() {
    if (!fare || acting.current) return;
    const minor = minorUnits(amount);
    const current = fare.versions.find(v => v.version === fare.current_version)?.amount_minor;
    const why = reason.trim();
    if (minor === null || minor === current || !why || why.length > 500 || !own) {
      setMessage(t('fareNeeds'));
      return;
    }
    acting.current = true;
    setMessage(null);
    try {
      setFare(await client.post('/api/admin/v1/orders/{order_id}/fare-corrections' as never, {params: {
        order_id: orderId}, body: {command_id: newId(), expected_version: fare.current_version, amount_minor: minor,
        reason: why, password: own}} as never) as Fare);
      setAmount('');
      setReason('');
      setMessage(t('fareCorrected'));
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 403) setMessage(t('ownPasswordWrong'));
      else if (failure instanceof ApiError && failure.code === 'PAYMENT_PENDING') setMessage(t('farePaymentPending'));
      else if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('fareConflict'));
        await read();
      } else setMessage(t('genericError'));
    } finally {
      setOwn('');
      acting.current = false;
    }
  }

  if (none) return <p>{t('fareNone')}</p>;
  if (!fare) return null;
  return (
    <section aria-labelledby="fare-title">
      <h2 id="fare-title">{t('fareTitle')}</h2>
      <ul>
        {fare.versions.map(v => <li key={v.id}>{['v' + v.version, decimal(v.amount_minor) + ' ' + fare.currency,
          t('fareCommission', {amount: decimal(v.commission_minor)}), t('fareDriver', {amount: decimal(v.driver_share_minor)}),
          ...(v.reason ? [v.reason] : []), ...(v.author_id ? [t('fareAuthor', {id: v.author_id.slice(0, 8)})] : [])]
          .join(' · ')}</li>)}
      </ul>
      {fare.refund_obligation_minor > 0 ? <p>{t('fareRefund', {amount: decimal(fare.refund_obligation_minor) + ' '
        + fare.currency})}</p> : null}
      {canCorrect ? (
        <fieldset>
          <legend>{t('fareCorrectTitle')}</legend>
          <label>{t('fareAmount')}<input inputMode="decimal" value={amount} onChange={e => setAmount(e.target.value)} />
          </label>
          <label>{t('fareReason')}<input value={reason} onChange={e => setReason(e.target.value)} /></label>
          <label>{t('farePassword')}<input type="password" value={own} onChange={e => setOwn(e.target.value)} /></label>
          <button type="button" onClick={() => void correct()}>{t('fareCorrect')}</button>
        </fieldset>
      ) : null}
      {message ? <p role="status">{message}</p> : null}
    </section>
  );
}
