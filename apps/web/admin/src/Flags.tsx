import {useCallback, useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

type Flag = {key: string; description: string; owner: string; review_by: string; default_enabled: boolean;
  enabled: boolean; version: number; reason: string | null; changed_at: string | null};

const day = (date: string) => date.split('-').reverse().join('.');

function utc(at: string) {
  const when = new Date(at);
  return when.toLocaleDateString('ru-RU', {timeZone: 'UTC'}) + ' '
    + when.toLocaleTimeString('ru-RU', {timeZone: 'UTC', hour: '2-digit', minute: '2-digit'}) + ' UTC';
}

/**
 * The server's feature switches for holders of flags.manage (#395, REQ-ENG-14): each with its owner, review date and
 * last change, switched to the opposite with a reason and the version read. A flag whose review date is before
 * today's UTC date is marked overdue.
 */
export function Flags({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const [flags, setFlags] = useState<Flag[] | null>(null);
  const [reasons, setReasons] = useState<Record<string, string>>({});
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const read = useCallback(async () => {
    setFlags(((await client.get('/api/admin/v1/feature-flags' as never, {} as never)) as {flags: Flag[]}).flags);
  }, [client]);

  useEffect(() => {
    read().catch(failure => setError(failure));
  }, [read]);

  async function flip(f: Flag) {
    if (acting.current) return;
    const why = (reasons[f.key] ?? '').trim();
    if (!why || why.length > 500) {
      setMessage(t('flagNeeds'));
      return;
    }
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      const changed = await client.post('/api/admin/v1/feature-flags/{key}/change' as never, {params: {key: f.key},
        body: {command_id: newId(), expected_version: f.version, enabled: f.enabled, reason: why}} as never) as Flag;
      setFlags(list => (list ?? []).map(x => x.key === changed.key ? changed : x));
      setReasons(all => ({...all, [f.key]: ''}));
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('flagConflict'));
        await read().catch(again => setError(again));
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  const today = new Date(Date.now()).toISOString().slice(0, 10);
  const state = (on: boolean) => t(on ? 'flagOn' : 'flagOff');
  return (
    <section aria-labelledby="flags-title">
      <h1 id="flags-title">{t('navFlags')}</h1>
      <p>{t('flagNoStop')}</p>
      <ul>
        {(flags ?? []).map(f => (
          <li key={f.key}>
            <span>{[f.key, state(f.enabled) + ' ' + t('flagDefault', {state: state(f.default_enabled)}),
              t('flagOwner', {owner: f.owner}), t('flagReview', {day: day(f.review_by)}), f.description].join(' · ')}</span>
            {f.review_by <= today ? <p>{t('flagOverdue')}</p> : null}
            {f.version > 0 && f.changed_at ? <p>{t('flagChanged', {at: utc(f.changed_at), reason: f.reason ?? '—'})}</p>
              : null}
            <label>{t('flagReason', {key: f.key})}<input value={reasons[f.key] ?? ''}
              onChange={e => setReasons(all => ({...all, [f.key]: e.target.value}))} /></label>
            <button type="button" onClick={() => void flip(f)}>{t(f.enabled ? 'flagTurnOff' : 'flagTurnOn',
              {key: f.key})}</button>
          </li>
        ))}
      </ul>
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
