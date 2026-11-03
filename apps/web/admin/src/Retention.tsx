import {useCallback, useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

const KINDS = ['sessions', 'sign_in_codes', 'code_deliveries', 'upload_sessions', 'quarantined_files',
  'call_recordings'] as const;
type Kind = typeof KINDS[number];
type Days = Record<Kind, number>;
type Version = {version: number; days: Days; changed_by: string | null; reason: string | null;
  changed_at: string | null};

const MAX = 2147483647;
const utc = (at: string) => {
  const when = new Date(at);
  return when.toLocaleDateString('ru-RU', {timeZone: 'UTC'}) + ' '
    + when.toLocaleTimeString('ru-RU', {timeZone: 'UTC', hour: '2-digit', minute: '2-digit'}) + ' UTC';
};

/** A whole number of days from 0 to the contract's maximum, or null. */
function daysOf(text: string) {
  const value = text.trim();
  return /^[0-9]{1,10}$/.test(value) && Number(value) <= MAX ? Number(value) : null;
}

/** Shorter means deleting sooner: a lower number, or any number where 0 kept the kind forever. */
const shorter = (before: number, after: number) => after !== 0 && (before === 0 || after < before);

/**
 * The service's retention of technical data, for holders of retention.manage (#443, ADR 0016): all six terms sent
 * together against the version read; a term made shorter deletes data on the next cleanup run for good, so it is named
 * and needs an explicit confirmation.
 */
export function Retention({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const [current, setCurrent] = useState<Version | null>(null);
  const [form, setForm] = useState<Record<Kind, string> | null>(null);
  const [reason, setReason] = useState('');
  const [confirmed, setConfirmed] = useState(false);
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const show = (value: Version) => {
    setCurrent(value);
    setForm(Object.fromEntries(KINDS.map(k => [k, String(value.days[k])])) as Record<Kind, string>);
    setConfirmed(false);
  };

  const read = useCallback(async () => {
    show(await client.get('/api/admin/v1/retention' as never, {} as never) as Version);
  }, [client]);

  useEffect(() => {
    read().catch(failure => setError(failure));
  }, [read]);

  if (!current || !form) return error ? <Failure error={error} t={t} /> : <p>{t('loading')}</p>;
  const parsed = KINDS.map(k => [k, daysOf(form[k])] as const);
  const shortened = parsed.filter(([k, v]) => v !== null && shorter(current.days[k], v)).map(([k]) => k);

  async function save() {
    if (acting.current || !current) return;
    if (parsed.some(([, v]) => v === null)) {
      setMessage(t('retNeeds'));
      return;
    }
    const days = Object.fromEntries(parsed) as Days;
    if (KINDS.every(k => days[k] === current.days[k])) {
      setMessage(t('retNothing'));
      return;
    }
    if (!reason.trim()) {
      setMessage(t('retReasonNeeds'));
      return;
    }
    if (shortened.length > 0 && !confirmed) {
      setMessage(t('retConfirmNeeds'));
      return;
    }
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      show(await client.put('/api/admin/v1/retention' as never, {body: {command_id: newId(),
        expected_version: current.version, days, reason: reason.trim()}} as never) as Version);
      setReason('');
      setMessage(t('retSaved'));
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('retConflict'));
        await read().catch(again => setError(again));
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  const term = (days: number) => days === 0 ? t('retForever') : t('retDays', {n: days});
  return (
    <section aria-labelledby="ret-title">
      <h1 id="ret-title">{t('navRetention')}</h1>
      <p>{[t('retVersion', {n: current.version}), ...(current.version === 0 ? [t('retDefaults')] : [
        ...(current.changed_by ? [t('retBy', {id: current.changed_by.slice(0, 8)})] : []),
        ...(current.changed_at ? [utc(current.changed_at)] : []), ...(current.reason ? [current.reason] : [])])]
        .join(' · ')}</p>
      <ul>{KINDS.map(k => <li key={k}>{t('ret_' + k) + ': ' + term(current.days[k])}</li>)}</ul>
      <p>{t('retFixed')}</p>
      <fieldset>
        <legend>{t('retChange')}</legend>
        {KINDS.map(k => (
          <label key={k}>{t('retInput', {kind: t('ret_' + k)})}<input inputMode="numeric" value={form[k]}
            onChange={e => setForm(f => f ? {...f, [k]: e.target.value} : f)} /></label>
        ))}
        {shortened.length > 0 ? (
          <>
            <p role="alert">{t('retShorter', {list: shortened.map(k => t('ret_' + k)).join(', ')})}</p>
            <label><input type="checkbox" checked={confirmed} onChange={e => setConfirmed(e.target.checked)} />
              {t('retConfirm')}</label>
          </>
        ) : null}
        <label>{t('retReason')}<input value={reason} onChange={e => setReason(e.target.value)} /></label>
        <button type="button" onClick={() => void save()}>{t('retSave')}</button>
      </fieldset>
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
