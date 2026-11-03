import {useCallback, useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import type {Translate} from '@blizz/web-ui';
import {minorOf} from './Balance.js';
import {Evidence} from './Evidence.js';
import {decimal} from './Promotions.js';

type Chargeback = {id: string; amount_minor: number; currency: string; bank_reason: string; received_on: string;
  state: 'OPEN' | 'WON' | 'LOST'; resolution_reason: string | null; resolved_at: string | null; version: number};

/** "2026-11-01" → "01.11.2026", without a time zone shift. */
const dmy = (date: string) => date.split('-').reverse().join('.');

/** A real calendar date in YYYY-MM-DD, not after today's UTC date: the day the server checks (JdbcChargebacks). */
function noticeDate(text: string) {
  const value = text.trim();
  if (!/^[0-9]{4}-[0-9]{2}-[0-9]{2}$/.test(value)) return null;
  const parsed = new Date(value + 'T00:00:00Z');
  if (Number.isNaN(parsed.getTime()) || parsed.toISOString().slice(0, 10) !== value) return null;
  return value <= new Date().toISOString().slice(0, 10) ? value : null;
}

/**
 * An order's chargebacks for holders of payments.retry (#426, REQ-PAY-23): what the bank took, recorded by hand in the
 * currency of the card payment, and its outcome recorded once on an open one.
 */
export function Chargebacks({client, t, newId, orderId, currency}: {client: ApiClient; t: Translate;
  newId: () => string; orderId: string; currency: string}) {
  const [list, setList] = useState<Chargeback[] | null>(null);
  const [form, setForm] = useState({amount: '', reason: '', date: ''});
  const [why, setWhy] = useState<Record<string, string>>({});
  const [message, setMessage] = useState<string | null>(null);
  const acting = useRef(false);

  const read = useCallback(async () => {
    try {
      setList(((await client.get('/api/admin/v1/orders/{order_id}/chargebacks' as never,
        {params: {order_id: orderId}} as never)) as {chargebacks: Chargeback[]}).chargebacks);
    } catch {
      setMessage(t('genericError'));
    }
  }, [client, orderId, t]);

  useEffect(() => {
    void read();
  }, [read]);

  async function run(work: () => Promise<void>, refused: (failure: ApiError) => Promise<boolean>) {
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    try {
      await work();
    } catch (failure) {
      if (!(failure instanceof ApiError && await refused(failure))) setMessage(t('genericError'));
    } finally {
      acting.current = false;
    }
  }

  function record() {
    const minor = minorOf(form.amount);
    const reason = form.reason.trim();
    const date = noticeDate(form.date);
    if (minor === null || !reason || reason.length > 500 || date === null) {
      setMessage(t('cbNeeds'));
      return;
    }
    return run(async () => {
      const made = await client.post('/api/admin/v1/orders/{order_id}/chargebacks' as never, {params: {
        order_id: orderId}, body: {command_id: newId(), amount_minor: minor, currency, bank_reason: reason,
        received_on: date}} as never) as Chargeback;
      setList(all => [...(all ?? []), made]);
      setForm({amount: '', reason: '', date: ''});
    }, async failure => {
      if (failure.code !== 'CHARGEBACK_NOT_ALLOWED') return false;
      setMessage(t('cbNotAllowed'));
      return true;
    });
  }

  function resolve(c: Chargeback, outcome: 'WON' | 'LOST') {
    const reason = (why[c.id] ?? '').trim();
    if (!reason || reason.length > 500) {
      setMessage(t('cbResolveNeeds'));
      return;
    }
    return run(async () => {
      const done = await client.post('/api/admin/v1/orders/{order_id}/chargebacks/{chargeback_id}/resolve' as never,
        {params: {order_id: orderId, chargeback_id: c.id}, body: {command_id: newId(), expected_version: c.version,
          outcome, reason}} as never) as Chargeback;
      setList(all => (all ?? []).map(x => x.id === done.id ? done : x));
    }, async failure => {
      if (failure.status !== 409) return false;
      setMessage(t('cbConflict'));
      await read();
      return true;
    });
  }

  const set = (k: keyof typeof form) => (e: {target: {value: string}}) => setForm(f => ({...f, [k]: e.target.value}));
  return (
    <section aria-labelledby="cb-title">
      <h3 id="cb-title">{t('cbTitle')}</h3>
      <ul>
        {(list ?? []).map(c => (
          <li key={c.id}>
            <span>{[dmy(c.received_on), decimal(c.amount_minor) + ' ' + c.currency, c.bank_reason,
              t('cbState_' + c.state), ...(c.resolution_reason ? [c.resolution_reason] : []),
              ...(c.resolved_at ? [dmy(c.resolved_at.slice(0, 10))] : [])].join(' · ')}</span>
            {c.state === 'OPEN' ? (
              <>
                <label>{t('cbResolveReason')}<input value={why[c.id] ?? ''}
                  onChange={e => setWhy(all => ({...all, [c.id]: e.target.value}))} /></label>
                <button type="button" onClick={() => void resolve(c, 'WON')}>{t('cbWon')}</button>
                <button type="button" onClick={() => void resolve(c, 'LOST')}>{t('cbLost')}</button>
              </>
            ) : null}
          </li>
        ))}
      </ul>
      <fieldset>
        <legend>{t('cbRecordTitle', {currency})}</legend>
        <label>{t('cbAmount')}<input inputMode="decimal" value={form.amount} onChange={set('amount')} /></label>
        <label>{t('cbBankReason')}<input value={form.reason} onChange={set('reason')} /></label>
        <label>{t('cbDate')}<input value={form.date} onChange={set('date')} /></label>
        <button type="button" onClick={() => void record()}>{t('cbRecord')}</button>
      </fieldset>
      {message ? <p role="status">{message}</p> : null}
      <Evidence client={client} t={t} orderId={orderId} />
    </section>
  );
}
