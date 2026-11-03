import {useCallback, useEffect, useRef, useState} from 'react';
import {Link, useParams} from 'react-router-dom';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';
import {instant} from './Legal.js';

type Client = {id: string; phone: string; name?: string | null; account_state: string; version: number;
  block?: {reason: string; until?: string | null; at: string} | null};
type Money = {currency: string; balance_minor?: number; amount_minor?: number};
type Card = {client: Client; current_orders: {id: string; short_number: number; status: string}[];
  latest_orders: {id: string; short_number: number; status: string; created_at: string; pickup_label: string;
    dropoff_label: string; price_minor: number | null; final_price_minor: number | null; currency: string | null}[];
  bonuses: Money[]; debt: Money[]; cases: {id: string; number: number; subject: string; state: string}[]};

const E164 = /^\+[1-9][0-9]{7,14}$/;
const CODE = /^[0-9]{4,8}$/;

function money(minor: number) {
  return String(Math.floor(minor / 100)).replace(/\B(?=(\d{3})+(?!\d))/g, ' ') + '.'
    + String(minor % 100).padStart(2, '0');
}

function utc(at: string) {
  const when = new Date(at);
  return when.toLocaleDateString('ru-RU', {timeZone: 'UTC'}) + ' '
    + when.toLocaleTimeString('ru-RU', {timeZone: 'UTC', hour: '2-digit', minute: '2-digit'}) + ' UTC';
}

const line = (c: Client, t: Translate) => [c.phone, c.name ?? '—', t('cstate_' + c.account_state)].join(' · ');

/** Riders found by 4 digits of the phone or 2 letters of the name (#413), for holders of clients.manage. */
export function ClientSearch({client, t}: {client: ApiClient; t: Translate}) {
  const [query, setQuery] = useState('');
  const [found, setFound] = useState<Client[] | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);

  async function search() {
    const text = query.trim();
    if ((text.match(/[0-9]/g) ?? []).length < 4 && (text.match(/\p{L}/gu) ?? []).length < 2) {
      setMessage(t('clientSearchNeeds'));
      return;
    }
    setMessage(null);
    try {
      setFound(((await client.get('/api/admin/v1/clients' as never, {query: {query: text}} as never)) as
        {clients: Client[]}).clients);
    } catch (failure) {
      setError(failure);
    }
  }

  return (
    <section aria-labelledby="clients-title">
      <h1 id="clients-title">{t('navClients')}</h1>
      <label>{t('clientQuery')}<input value={query} onChange={e => setQuery(e.target.value)} /></label>
      <button type="button" onClick={() => void search()}>{t('clientSearch')}</button>
      <ul>{(found ?? []).map(c => <li key={c.id}><Link to={'/clients/' + c.id}>{line(c, t)}</Link></li>)}</ul>
      {found && found.length === 0 ? <p>{t('clientNone')}</p> : null}
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}

/**
 * A rider's card (#413, REQ-ADM-02): the account, bonuses and debt, orders and support cases; blocking with an
 * optional end in UTC, unblocking, and a new phone set by support after identifying the person (REQ-AUTH-08).
 */
export function ClientCardPage({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const {clientId = ''} = useParams();
  const [card, setCard] = useState<Card | null>(null);
  const [reason, setReason] = useState('');
  const [until, setUntil] = useState('');
  const [phone, setPhone] = useState('');
  const [challenge, setChallenge] = useState<string | null>(null);
  const [code, setCode] = useState('');
  const [identified, setIdentified] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const read = useCallback(async () => {
    setCard(await client.get('/api/admin/v1/clients/{client_id}' as never, {params: {client_id: clientId}} as never) as
      Card);
  }, [client, clientId]);

  useEffect(() => {
    read().catch(failure => setError(failure));
  }, [read]);

  async function run(work: () => Promise<void>, refusal: (failure: ApiError) => string | null) {
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

  const conflict = (failure: ApiError) => {
    if (failure.status !== 409) return null;
    void read().catch(again => setError(again));
    return t('clientConflict');
  };

  function block(action: 'block' | 'unblock') {
    if (!card) return;
    const why = reason.trim();
    const end = until.trim() === '' ? null : instant(until);
    if (!why || why.length > 500 || (action === 'block' && until.trim() !== ''
      && (!end || new Date(end).getTime() <= Date.now()))) {
      setMessage(t('clientBlockNeeds'));
      return;
    }
    const version = card.client.version;
    return run(async () => {
      const changed = await client.post(('/api/admin/v1/clients/{client_id}/' + action) as never, {params: {
        client_id: clientId}, body: {command_id: newId(), expected_version: version, reason: why,
        ...(action === 'block' && end ? {until: end} : {})}} as never) as Client;
      setCard(c => c ? {...c, client: changed} : c);
      setReason('');
      setUntil('');
    }, conflict);
  }

  function sendCode() {
    const number = phone.trim();
    if (!E164.test(number)) {
      setMessage(t('clientPhoneNeeds'));
      return;
    }
    return run(async () => {
      const sent = await client.post('/api/admin/v1/clients/{client_id}/phone/new-code' as never, {params: {
        client_id: clientId}, body: {phone: number}} as never) as {challenge_id: string; resend_available_at: string};
      setChallenge(sent.challenge_id);
      setMessage(t('clientCodeSent', {at: utc(sent.resend_available_at)}));
    }, failure => failure.status === 409 ? t('clientSamePhone') : null);
  }

  function changePhone() {
    if (!card || !challenge) return;
    if (!CODE.test(code.trim()) || !identified.trim()) {
      setMessage(t('clientCodeNeeds'));
      return;
    }
    const version = card.client.version;
    return run(async () => {
      const changed = await client.post('/api/admin/v1/clients/{client_id}/phone' as never, {params: {
        client_id: clientId}, body: {command_id: newId(), expected_version: version, new_challenge_id: challenge,
        new_code: code.trim(), reason: identified.trim()}} as never) as {phone: string; version: number};
      setCard(c => c ? {...c, client: {...c.client, phone: changed.phone, version: changed.version}} : c);
      setChallenge(null);
      setPhone('');
      setCode('');
      setIdentified('');
      setMessage(t('clientPhoneChanged'));
    }, failure => failure.code === 'OTP_INVALID' ? t('clientCodeWrong')
      : failure.status === 409 ? t('clientPhoneTaken') : null);
  }

  if (!card) return error ? <Failure error={error} t={t} /> : <p>{t('loading')}</p>;
  const c = card.client;
  const sums = (list: Money[], key: 'balance_minor' | 'amount_minor') => list.length
    ? list.map(m => money(m[key] ?? 0) + ' ' + m.currency).join(', ') : t('clientNothing');
  return (
    <section aria-labelledby="client-title">
      <h1 id="client-title">{line(c, t)}</h1>
      {c.block ? <p>{t('clientBlocked', {reason: c.block.reason, until: c.block.until
        ? t('clientUntil', {at: utc(c.block.until)}) : t('clientUntilUnblocked')})}</p> : null}
      <p>{t('clientBonuses', {list: sums(card.bonuses, 'balance_minor')})}</p>
      <p>{t('clientDebt', {list: sums(card.debt, 'amount_minor')})}</p>
      <h2>{t('clientOrders')}</h2>
      <ul>
        {card.current_orders.map(o => <li key={o.id}>{'№ ' + o.short_number + ' · ' + o.status}</li>)}
        {card.latest_orders.map(o => {
          const price = o.final_price_minor ?? o.price_minor;
          return <li key={o.id}>{['№ ' + o.short_number, new Date(o.created_at).toLocaleDateString('ru-RU',
            {timeZone: 'UTC'}), o.pickup_label + ' → ' + o.dropoff_label, o.status,
          price == null || !o.currency ? '—' : money(price) + ' ' + o.currency].join(' · ')}</li>;
        })}
      </ul>
      <h2>{t('clientCases')}</h2>
      <ul>{card.cases.map(k => <li key={k.id}>{t('clientCase', {n: k.number}) + ' · ' + k.subject + ' · ' + k.state}</li>)}
      </ul>
      <fieldset>
        <legend>{t('clientBlockTitle')}</legend>
        <label>{t('clientReason')}<input value={reason} onChange={e => setReason(e.target.value)} /></label>
        {c.account_state === 'BLOCKED' ? (
          <button type="button" onClick={() => void block('unblock')}>{t('clientUnblock')}</button>
        ) : (
          <>
            <label>{t('clientBlockUntil')}<input value={until} onChange={e => setUntil(e.target.value)} /></label>
            <button type="button" onClick={() => void block('block')}>{t('clientBlock')}</button>
          </>
        )}
      </fieldset>
      <fieldset>
        <legend>{t('clientPhoneTitle')}</legend>
        <label>{t('clientNewPhone')}<input type="tel" value={phone} onChange={e => setPhone(e.target.value)} /></label>
        <button type="button" onClick={() => void sendCode()}>{t('clientSendCode')}</button>
        {challenge ? (
          <>
            <label>{t('clientCode')}<input inputMode="numeric" value={code} onChange={e => setCode(e.target.value)} />
            </label>
            <label>{t('clientIdentified')}<input value={identified} onChange={e => setIdentified(e.target.value)} />
            </label>
            <button type="button" onClick={() => void changePhone()}>{t('clientChangePhone')}</button>
          </>
        ) : null}
      </fieldset>
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
