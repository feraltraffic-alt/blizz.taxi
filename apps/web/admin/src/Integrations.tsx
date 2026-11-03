import {useCallback, useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';
import {Merchants} from './Merchants.js';

type Provider = {provider: string; state: string; last_success_at: string | null; last_failure_at: string | null;
  last_failure_kind: string | null};
type Field = {name: string; group: string; kind: string; label: string; description: string; for_apps: boolean;
  set: boolean; value: string | null; hint: string | null};

function utc(at: string) {
  const when = new Date(at);
  return when.toLocaleDateString('ru-RU', {timeZone: 'UTC'}) + ' '
    + when.toLocaleTimeString('ru-RU', {timeZone: 'UTC', hour: '2-digit', minute: '2-digit'}) + ' UTC';
}

/**
 * The integrations for holders of integrations.manage (#391, ADR 0016): the providers' health, the keys and settings
 * of the service, and a connection check per group. A secret is never shown or filled in; what is typed into one, and
 * the own password, are emptied after every request. Only the fields edited are sent.
 */
export function Integrations({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const [health, setHealth] = useState<{instance: string; providers: Provider[]} | null>(null);
  const [fields, setFields] = useState<Field[] | null>(null);
  const [edits, setEdits] = useState<Record<string, string | null>>({});
  const [reason, setReason] = useState('');
  const [own, setOwn] = useState('');
  const [checks, setChecks] = useState<Record<string, {ok: boolean; message: string}>>({});
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const read = useCallback(async () => {
    setFields(((await client.get('/api/admin/v1/integrations' as never, {} as never)) as {fields: Field[]}).fields);
  }, [client]);

  useEffect(() => {
    read().catch(failure => setError(failure));
    client.get('/api/admin/v1/integrations/health' as never, {} as never)
      .then(value => setHealth(value as {instance: string; providers: Provider[]})).catch(() => undefined);
  }, [client, read]);

  async function save() {
    if (acting.current) return;
    const changes = Object.entries(edits).map(([name, value]) => ({name, value}));
    if (changes.length === 0 || !reason.trim() || !own) {
      setMessage(t('intNeeds'));
      return;
    }
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      await client.post('/api/admin/v1/integrations' as never, {body: {command_id: newId(), password: own, changes,
        reason: reason.trim()}} as never);
      setReason('');
      setMessage(t('intSaved'));
      await read();
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 403) setMessage(t('ownPasswordWrong'));
      else if (failure instanceof ApiError && failure.status === 409) setMessage(t('intNoMasterKey'));
      else setError(failure);
    } finally {
      // Neither the password nor a typed secret stays on the screen, whatever the answer.
      setOwn('');
      setEdits({});
      acting.current = false;
    }
  }

  async function check(group: string) {
    try {
      const answer = await client.post('/api/admin/v1/integrations/{group}/check' as never,
        {params: {group}} as never) as {ok: boolean; message: string};
      setChecks(all => ({...all, [group]: {ok: answer.ok, message: answer.message}}));
    } catch (failure) {
      setError(failure);
    }
  }

  const describe = (f: Field) => [f.label + ' — ' + f.description, ...(f.for_apps ? [t('intForApps')] : []),
    ...(f.kind === 'SECRET' ? [f.set ? t('intSecretSet', {hint: f.hint ?? ''}) : t('intNotSet')]
      : f.set ? [] : [t('intNotSet')])].join(' · ');
  const shown = (f: Field) => f.name in edits ? edits[f.name] ?? '' : f.kind === 'SECRET' ? '' : f.value ?? '';
  const edit = (f: Field, value: string) => setEdits(all => {
    const next = {...all};
    if (f.kind !== 'SECRET' && value === (f.value ?? '')) delete next[f.name];
    else if (f.kind === 'SECRET' && value === '') delete next[f.name];
    else next[f.name] = value;
    return next;
  });
  const groups = [...new Set((fields ?? []).map(f => f.group))];
  return (
    <section aria-labelledby="int-title">
      <h1 id="int-title">{t('navIntegrations')}</h1>
      {health ? (
        <>
          <p>{t('intInstance', {instance: health.instance})}</p>
          <ul>
            {health.providers.map(p => (
              <li key={p.provider}>{[p.provider, t('intState_' + p.state),
                ...(p.last_success_at ? [t('intSuccess', {at: utc(p.last_success_at)})] : []),
                ...(p.last_failure_at ? [t('intFailure', {at: utc(p.last_failure_at)})
                  + (p.last_failure_kind ? ' (' + p.last_failure_kind + ')' : '')] : [])].join(' · ')}</li>
            ))}
          </ul>
        </>
      ) : null}
      {groups.map(group => (
        <fieldset key={group}>
          <legend>{group}</legend>
          {(fields ?? []).filter(f => f.group === group).map(f => (
            <div key={f.name}>
              <span>{describe(f)}</span>
              <label>{t('intNewValue', {label: f.label})}
                <input type={f.kind === 'SECRET' ? 'password' : 'text'} autoComplete="off" value={shown(f)}
                  onChange={e => edit(f, e.target.value)} /></label>
              {f.set ? <button type="button" onClick={() => setEdits(all => ({...all, [f.name]: null}))}>
                {t('intRemove', {label: f.label})}</button> : null}
              {f.name in edits && edits[f.name] === null ? <span>{t('intWillRemove')}</span> : null}
            </div>
          ))}
          <button type="button" onClick={() => void check(group)}>{t('intCheck', {group})}</button>
          {checks[group] ? <p>{(checks[group]!.ok ? '✓ ' : '✗ ') + checks[group]!.message}</p> : null}
        </fieldset>
      ))}
      <label>{t('intReason')}<input value={reason} onChange={e => setReason(e.target.value)} /></label>
      <label>{t('intPassword')}<input type="password" value={own} onChange={e => setOwn(e.target.value)} /></label>
      <button type="button" onClick={() => void save()}>{t('intSave')}</button>
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
      <Merchants client={client} t={t} newId={newId} />
    </section>
  );
}
