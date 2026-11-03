import {useCallback, useEffect, useRef, useState} from 'react';
import {Link} from 'react-router-dom';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

type Change = {id: string; occurred_at: string; actor_type: string; actor_role?: string | null; action: string;
  resource_type: string; resource_id?: string | null; reason?: string | null; before?: string | null;
  after?: string | null; correlation_id: string};
type Entry = {id: string; occurred_at: string; staff_login?: string | null; role?: string | null;
  method?: string | null; path?: string | null; status?: number | null; outcome?: string | null;
  correlation_id?: string | null};
type Found = {type: string; id: string; order_id: string | null; at: string};
type Tab = 'changes' | 'activity';

const ROLES = ['PLATFORM_OWNER', 'SUPER_ADMIN', 'ADMIN', 'OPERATOR'];
const ROLE_TEXT: Record<string, string> = {SUPER_ADMIN: 'roleSuperAdmin', ADMIN: 'roleAdmin', OPERATOR: 'roleOperator',
  PLATFORM_OWNER: 'rolePlatformOwner'};
const UUID = /^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$/i;

function utc(at: string) {
  const when = new Date(at);
  return when.toLocaleDateString('ru-RU', {timeZone: 'UTC'}) + ' '
    + when.toLocaleTimeString('ru-RU', {timeZone: 'UTC', hour: '2-digit', minute: '2-digit'}) + ' UTC';
}

/**
 * The logs for holders of audit.view (#374, REQ-OBS-01/04): what staff changed (with the snapshots as text), what
 * staff did, and everything one request touched. Filters are sent only when filled; "more" keeps them.
 */
export function Logs({client, t}: {client: ApiClient; t: Translate}) {
  const [tab, setTab] = useState<Tab>('changes');
  const [filters, setFilters] = useState({role: '', action: '', resourceType: '', resourceId: '', kind: ''});
  const [query, setQuery] = useState<Record<string, string>>({});
  const [changes, setChanges] = useState<Change[] | null>(null);
  const [entries, setEntries] = useState<Entry[] | null>(null);
  const [next, setNext] = useState<string | null>(null);
  const [open, setOpen] = useState<string | null>(null);
  const [typed, setTyped] = useState('');
  const [trail, setTrail] = useState<Found[] | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const reading = useRef(false);

  const fail = useCallback((failure: unknown) => {
    if (failure instanceof ApiError && failure.status === 403) setMessage(t('logsForbidden'));
    else setError(failure);
  }, [t]);

  const read = useCallback(async (which: Tab, sent: Record<string, string>, cursor: string | null) => {
    if (reading.current) return;
    reading.current = true;
    setMessage(null);
    setError(null);
    try {
      const path = which === 'changes' ? '/api/admin/v1/logs/changes' : '/api/admin/v1/logs/activity';
      const page = await client.get(path as never, {query: {...sent, ...(cursor ? {cursor} : {})}} as never) as
        {changes?: Change[]; entries?: Entry[]; page: {next_cursor?: string | null}};
      if (which === 'changes') setChanges(old => cursor ? [...(old ?? []), ...(page.changes ?? [])] : page.changes ?? []);
      else setEntries(old => cursor ? [...(old ?? []), ...(page.entries ?? [])] : page.entries ?? []);
      setNext(page.page.next_cursor ?? null);
      setQuery(sent);
    } catch (failure) {
      fail(failure);
    } finally {
      reading.current = false;
    }
  }, [client, fail]);

  useEffect(() => {
    void read(tab, {}, null);
  }, [read, tab]);

  function show() {
    const sent = tab === 'changes'
      ? {...(filters.role ? {role: filters.role} : {}), ...(filters.action.trim() ? {action: filters.action.trim()} : {}),
        ...(filters.resourceType.trim() ? {resource_type: filters.resourceType.trim()} : {}),
        ...(filters.resourceId.trim() ? {resource_id: filters.resourceId.trim()} : {})}
      : {...(filters.role ? {role: filters.role} : {}), ...(filters.kind ? {kind: filters.kind} : {})};
    return read(tab, sent, null);
  }

  async function follow(id: string) {
    if (!UUID.test(id)) {
      setMessage(t('correlationNeeds'));
      return;
    }
    setMessage(null);
    try {
      const answer = await client.get('/api/admin/v1/logs/correlation/{correlation_id}' as never,
        {params: {correlation_id: id}} as never) as {found: Found[]};
      setTrail(answer.found);
    } catch (failure) {
      fail(failure);
    }
  }

  const role = (code?: string | null) => code ? t(ROLE_TEXT[code] ?? code) : '—';
  const set = (key: keyof typeof filters) => (e: {target: {value: string}}) =>
    setFilters(f => ({...f, [key]: e.target.value}));
  const pick = (which: Tab) => {
    setNext(null);
    setTab(which);
  };
  return (
    <section aria-labelledby="logs-title">
      <h1 id="logs-title">{t('navLogs')}</h1>
      <button type="button" aria-pressed={tab === 'changes'} onClick={() => pick('changes')}>{t('logsChanges')}</button>
      <button type="button" aria-pressed={tab === 'activity'} onClick={() => pick('activity')}>{t('logsActivity')}
      </button>
      <fieldset>
        <label htmlFor="logs-role">{t('role')}</label>
        <select id="logs-role" value={filters.role} onChange={set('role')}>
          <option value="">{t('logsAny')}</option>
          {ROLES.map(r => <option key={r} value={r}>{role(r)}</option>)}
        </select>
        {tab === 'changes' ? (
          <>
            <label>{t('logsAction')}<input value={filters.action} onChange={set('action')} /></label>
            <label>{t('logsResourceType')}<input value={filters.resourceType} onChange={set('resourceType')} /></label>
            <label>{t('logsResourceId')}<input value={filters.resourceId} onChange={set('resourceId')} /></label>
          </>
        ) : (
          <>
            <label htmlFor="logs-kind">{t('logsKind')}</label>
            <select id="logs-kind" value={filters.kind} onChange={set('kind')}>
              <option value="">{t('logsAny')}</option>
              <option value="REQUEST">{t('logsRequests')}</option>
              <option value="SIGN_IN">{t('logsSignIns')}</option>
            </select>
          </>
        )}
        <button type="button" onClick={() => void show()}>{t('logsShow')}</button>
      </fieldset>
      {tab === 'changes' ? (
        <ul>
          {(changes ?? []).map(c => (
            <li key={c.id}>
              <span>{[utc(c.occurred_at), c.actor_role ? role(c.actor_role) : c.actor_type, c.action,
                c.resource_type + (c.resource_id ? ' ' + c.resource_id : ''), ...(c.reason ? [c.reason] : [])]
                .join(' · ')}</span>
              <button type="button" onClick={() => setOpen(o => o === c.id ? null : c.id)}>{t('logsDetails')}</button>
              <button type="button" onClick={() => void follow(c.correlation_id)}>{t('logsTrail')}</button>
              {open === c.id ? (
                <>
                  <pre>{c.before ?? '—'}</pre>
                  <pre>{c.after ?? '—'}</pre>
                </>
              ) : null}
            </li>
          ))}
        </ul>
      ) : (
        <ul>
          {(entries ?? []).map(e => (
            <li key={e.id}>
              <span>{[utc(e.occurred_at), e.staff_login ?? '—', role(e.role), (e.method ?? '') + ' ' + (e.path ?? ''),
                String(e.status ?? '—'), e.outcome ?? '—'].join(' · ')}</span>
              {e.correlation_id ? <button type="button" onClick={() => void follow(e.correlation_id!)}>
                {t('logsTrail')}</button> : null}
            </li>
          ))}
        </ul>
      )}
      {next ? <button type="button" onClick={() => void read(tab, query, next)}>{t('more')}</button> : null}
      <label>{t('correlationId')}<input value={typed} onChange={e => setTyped(e.target.value)} /></label>
      <button type="button" onClick={() => void follow(typed.trim())}>{t('findCorrelation')}</button>
      {trail ? (
        <ul>
          {trail.map(f => (
            <li key={f.type + f.id}>
              <span>{[utc(f.at), f.type, f.id].join(' · ')}</span>
              {f.order_id ? <> <Link to={'/orders/' + f.order_id}>{t('logsOrder')}</Link></> : null}
            </li>
          ))}
        </ul>
      ) : null}
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
