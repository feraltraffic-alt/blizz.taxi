import {useCallback, useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

type Entry = {id: string; at: string; kind: string; currency: string; amount_minor: number; reason: string};
type Statement = {balances: {currency: string; balance_minor: number}[]; entries: Entry[];
  page?: {next_cursor?: string | null}};

const MAX_MINOR = 10_000_000;

/** "150", "150.5", "150,50" → minor units without floating point; null when not 0.01 … 100 000.00 (#364 M4, M5). */
export function minorOf(text: string): number | null {
  const parts = /^([0-9]{1,6})(?:[.,]([0-9]{1,2}))?$/.exec(text.trim());
  if (!parts) return null;
  const minor = Number(parts[1]) * 100 + Number((parts[2] ?? '').padStart(2, '0'));
  return minor >= 1 && minor <= MAX_MINOR ? minor : null;
}

/** 125050 → "1 250.50"; the sign is the caller's. */
function amount(minor: number) {
  const abs = Math.abs(minor);
  const whole = String(Math.floor(abs / 100)).replace(/\B(?=(\d{3})+(?!\d))/g, ' ');
  return whole + '.' + String(abs % 100).padStart(2, '0');
}

const day = (at: string) => new Date(at).toLocaleDateString('ru-RU');

/**
 * A driver's balance for finance staff (#364, ADR 0010): the balance per currency, the movements a page at a time, and
 * a top-up (a deposit the driver paid in, or a bonus of the service) with a reason. The amount is typed in major
 * units and sent in minor units.
 */
export function DriverBalance({client, t, newId, driverId, currencies}: {client: ApiClient; t: Translate;
  newId: () => string; driverId: string; currencies: string[]}) {
  const [statement, setStatement] = useState<Statement | null>(null);
  const [next, setNext] = useState<string | null>(null);
  const [form, setForm] = useState({amount: '', currency: '', kind: 'DEPOSIT', reference: '', reason: ''});
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const read = useCallback(async (cursor: string | null) => await client.get(
    '/api/admin/v1/drivers/{driver_id}/balance' as never, {params: {driver_id: driverId},
      query: cursor ? {cursor} : {}} as never) as Statement, [client, driverId]);

  useEffect(() => {
    read(null).then(value => {
      setStatement(value);
      setNext(value.page?.next_cursor ?? null);
    }).catch(failure => setError(failure));
  }, [read]);

  const choices = [...new Set([...(statement?.balances ?? []).map(b => b.currency), ...currencies])];
  const currency = choices.includes(form.currency) ? form.currency : choices[0] ?? '';
  const set = (key: keyof typeof form) => (e: {target: {value: string}}) =>
    setForm(f => ({...f, [key]: e.target.value}));

  async function more() {
    if (!next || acting.current) return;
    acting.current = true;
    try {
      const page = await read(next);
      setStatement(old => old ? {...old, entries: [...old.entries, ...page.entries]} : page);
      setNext(page.page?.next_cursor ?? null);
    } catch (failure) {
      setError(failure);
    } finally {
      acting.current = false;
    }
  }

  async function topUp() {
    if (acting.current) return;
    const minor = minorOf(form.amount);
    const why = form.reason.trim();
    if (minor === null || !currency || !why || why.length > 500) {
      setMessage(t('topUpNeeds'));
      return;
    }
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      const value = await client.post('/api/admin/v1/drivers/{driver_id}/balance/top-ups' as never, {params: {
        driver_id: driverId}, body: {command_id: newId(), currency, amount_minor: minor, kind: form.kind,
        ...(form.reference.trim() ? {reference: form.reference.trim()} : {}), reason: why}} as never) as Statement;
      setStatement(value);
      setNext(null);
      setForm(f => ({...f, amount: '', reference: '', reason: ''}));
      setMessage(t('topUpDone'));
    } catch (failure) {
      if (failure instanceof ApiError && failure.code === 'TOP_UP_DAILY_LIMIT') setMessage(t('topUpLimit'));
      else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  const kind = (code: string) => t('kind_' + code) === 'kind_' + code ? code : t('kind_' + code);
  const signed = (minor: number) => (minor < 0 ? '−' : '+') + amount(minor);
  return (
    <section aria-labelledby="balance-title">
      <h2 id="balance-title">{t('balanceTitle')}</h2>
      {statement ? (
        <>
          <p>{t('balanceNow', {balance: statement.balances.length ? statement.balances.map(b =>
            (b.balance_minor < 0 ? '−' : '') + amount(b.balance_minor) + ' ' + b.currency).join(', ') : '0'})}</p>
          <ul>
            {statement.entries.map(e => <li key={e.id}>{[day(e.at), kind(e.kind), signed(e.amount_minor) + ' '
              + e.currency, e.reason].join(' · ')}</li>)}
          </ul>
          {next ? <button type="button" onClick={() => void more()}>{t('moreEntries')}</button> : null}
          <fieldset>
            <legend>{t('topUpTitle')}</legend>
            <label>{t('topUpAmount')}<input inputMode="decimal" value={form.amount} onChange={set('amount')} /></label>
            <label htmlFor="top-up-currency">{t('topUpCurrency')}</label>
            <select id="top-up-currency" value={currency} onChange={set('currency')}>
              {choices.map(c => <option key={c} value={c}>{c}</option>)}
            </select>
            <label htmlFor="top-up-kind">{t('topUpKind')}</label>
            <select id="top-up-kind" value={form.kind} onChange={set('kind')}>
              <option value="DEPOSIT">{t('topUpDeposit')}</option>
              <option value="BONUS">{t('topUpBonus')}</option>
            </select>
            <label>{t('topUpReference')}<input value={form.reference} onChange={set('reference')} /></label>
            <label>{t('topUpReason')}<input value={form.reason} onChange={set('reason')} /></label>
            <button type="button" onClick={() => void topUp()}>{t('topUpButton')}</button>
          </fieldset>
        </>
      ) : error ? null : <p>{t('loading')}</p>}
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
