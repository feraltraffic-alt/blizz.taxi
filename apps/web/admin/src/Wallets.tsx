import {useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';
import {amount, day, minorOf} from './Balance.js';

type Entry = {id: string; at: string; kind: string; currency: string; amount_minor: number; reason: string};
type Wallet = {client_id: string; balances: {currency: string; balance_minor: number; reserved_minor: number;
  available_minor: number}[]; entries: Entry[]; page?: {next_cursor?: string | null}};

const E164 = /^\+?[1-9][0-9]{7,14}$/;

/**
 * A rider's bonus account for holders of wallets.manage (#365): found by phone, read a page of movements at a time,
 * and topped up with a reason the rider sees (the service's expense).
 */
export function Wallets({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const [phone, setPhone] = useState('');
  const [wallet, setWallet] = useState<Wallet | null>(null);
  const [next, setNext] = useState<string | null>(null);
  const [cities, setCities] = useState<string[]>([]);
  const [form, setForm] = useState({amount: '', currency: '', reason: ''});
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  useEffect(() => {
    client.get('/api/config/v1/bootstrap' as never, {} as never)
      .then(boot => setCities((boot as {cities: {currency: string}[]}).cities.map(c => c.currency)))
      .catch(() => setCities([]));
  }, [client]);

  /** One request at a time; what it needs to say on a known refusal comes from `refusal`. */
  async function act(work: () => Promise<void>, refusal: (failure: ApiError) => string | null = () => null) {
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      await work();
    } catch (failure) {
      const known = failure instanceof ApiError ? refusal(failure) : null;
      if (known) setMessage(known);
      else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  const read = async (clientId: string, cursor: string | null) => await client.get(
    '/api/admin/v1/rider-wallets/{client_id}' as never, {params: {client_id: clientId},
      query: cursor ? {cursor} : {}} as never) as Wallet;

  function find() {
    const typed = phone.trim();
    if (!E164.test(typed)) {
      setMessage(t('phoneNeeds'));
      return;
    }
    return act(async () => {
      setWallet(null);
      const found = await client.get('/api/admin/v1/rider-wallets' as never, {query: {phone: typed}} as never) as
        {client_id: string};
      const value = await read(found.client_id, null);
      setWallet(value);
      setNext(value.page?.next_cursor ?? null);
    }, failure => failure.status === 404 ? t('riderNotFound') : null);
  }

  function more() {
    if (!wallet || !next) return;
    return act(async () => {
      const page = await read(wallet.client_id, next);
      setWallet(old => old ? {...old, entries: [...old.entries, ...page.entries]} : page);
      setNext(page.page?.next_cursor ?? null);
    });
  }

  const choices = [...new Set([...(wallet?.balances ?? []).map(b => b.currency), ...cities])];
  const currency = choices.includes(form.currency) ? form.currency : choices[0] ?? '';

  function topUp() {
    if (!wallet) return;
    const minor = minorOf(form.amount);
    const why = form.reason.trim();
    if (minor === null || !currency || !why || why.length > 500) {
      setMessage(t('topUpNeeds'));
      return;
    }
    return act(async () => {
      const value = await client.post('/api/admin/v1/rider-wallets/{client_id}/top-ups' as never, {params: {
        client_id: wallet.client_id}, body: {command_id: newId(), currency, amount_minor: minor, reason: why}
      } as never) as Wallet;
      setWallet(value);
      setNext(null);
      setForm(f => ({...f, amount: ''}));
      setMessage(t('bonusDone'));
    }, failure => failure.code === 'TOP_UP_DAILY_LIMIT' ? t('topUpLimit') : null);
  }

  const kind = (code: string) => t('kind_' + code) === 'kind_' + code ? code : t('kind_' + code);
  const set = (key: keyof typeof form) => (e: {target: {value: string}}) =>
    setForm(f => ({...f, [key]: e.target.value}));
  return (
    <section aria-labelledby="wallets-title">
      <h1 id="wallets-title">{t('navWallets')}</h1>
      <label>{t('riderPhone')}<input type="tel" value={phone} onChange={e => setPhone(e.target.value)} /></label>
      <button type="button" onClick={() => void find()}>{t('find')}</button>
      {wallet ? (
        <>
          {wallet.balances.length === 0 ? <p>{t('noBonuses')}</p> : wallet.balances.map(b => (
            <p key={b.currency}>{t('bonusesNow', {balance: amount(b.balance_minor) + ' ' + b.currency,
              available: amount(b.available_minor), reserved: amount(b.reserved_minor)})}</p>
          ))}
          <ul>
            {wallet.entries.map(e => <li key={e.id}>{[day(e.at), kind(e.kind), (e.amount_minor < 0 ? '−' : '+')
              + amount(e.amount_minor) + ' ' + e.currency, e.reason].join(' · ')}</li>)}
          </ul>
          {next ? <button type="button" onClick={() => void more()}>{t('moreEntries')}</button> : null}
          <fieldset>
            <legend>{t('bonusTitle')}</legend>
            <label>{t('topUpAmount')}<input inputMode="decimal" value={form.amount} onChange={set('amount')} /></label>
            <label htmlFor="bonus-currency">{t('topUpCurrency')}</label>
            <select id="bonus-currency" value={currency} onChange={set('currency')}>
              {choices.map(c => <option key={c} value={c}>{c}</option>)}
            </select>
            <label>{t('bonusReason')}<input value={form.reason} onChange={set('reason')} /></label>
            <button type="button" onClick={() => void topUp()}>{t('bonusButton')}</button>
          </fieldset>
        </>
      ) : null}
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
