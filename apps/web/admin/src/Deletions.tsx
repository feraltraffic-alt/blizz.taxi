import {useCallback, useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

type Amount = {currency: string; amount_minor: number};
type Request = {id: string; previous_state: string; requested_at: string; blocked: boolean; lines: string[]};
type Kind = 'client' | 'driver';

const PATH: Record<Kind, string> = {client: '/api/admin/v1/client-deletions', driver: '/api/admin/v1/driver-deletions'};

function money(a: Amount) {
  return String(Math.floor(a.amount_minor / 100)).replace(/\B(?=(\d{3})+(?!\d))/g, ' ') + '.'
    + String(a.amount_minor % 100).padStart(2, '0') + ' ' + a.currency;
}

/**
 * One side's deletion requests (#386, REQ-PRV-04): oldest first with what blocks each, completed only when nothing
 * blocks and the irreversibility is ticked, or rejected; both with a reason.
 */
function Requests({client, t, newId, kind}: {client: ApiClient; t: Translate; newId: () => string; kind: Kind}) {
  const [requests, setRequests] = useState<Request[] | null>(null);
  const [next, setNext] = useState<string | null>(null);
  const [reasons, setReasons] = useState<Record<string, string>>({});
  const [sure, setSure] = useState<Record<string, boolean>>({});
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const shape = useCallback((raw: Record<string, unknown>): Request => {
    const b = raw.blockers as Record<string, unknown>;
    const debt = (b.debt as Amount[]).map(a => t('delDebt', {amount: money(a)}));
    const lines = kind === 'client' ? [
      ...(b.active_order_id ? [t('delActiveOrder')] : []), ...debt,
      ...((b.open_support_cases as number) > 0 ? [t('delCases', {n: b.open_support_cases as number})] : []),
      ...(b.bonuses_to_burn as Amount[]).map(a => t('delBonuses', {amount: money(a)}))
    ] : [
      ...((b.active_work as string[]).length ? [t('delWork', {work: (b.active_work as string[])
        .map(w => t('delWork_' + w)).join(', ')})] : []), ...debt,
      ...((b.open_cash_disputes as number) > 0 ? [t('delDisputes', {n: b.open_cash_disputes as number})] : [])
    ];
    return {id: String(kind === 'client' ? raw.client_id : raw.driver_id), previous_state: String(raw.previous_state),
      requested_at: String(raw.requested_at), blocked: Boolean(b.blocked), lines};
  }, [kind, t]);

  const read = useCallback(async (cursor: string | null) => {
    const page = await client.get(PATH[kind] as never, {query: cursor ? {cursor} : {}} as never) as
      {requests: Record<string, unknown>[]; page: {next_cursor?: string | null}};
    setRequests(old => [...(cursor ? old ?? [] : []), ...page.requests.map(shape)]);
    setNext(page.page.next_cursor ?? null);
  }, [client, kind, shape]);

  useEffect(() => {
    read(null).catch(failure => setError(failure));
  }, [read]);

  async function decide(r: Request, action: 'complete' | 'reject') {
    if (acting.current) return;
    const why = (reasons[r.id] ?? '').trim();
    if (!why || why.length > 500 || (action === 'complete' && r.blocked)) {
      setMessage(t('delNeeds'));
      return;
    }
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      await client.post((PATH[kind] + '/{id}/' + action) as never, {params: {id: r.id},
        body: {command_id: newId(), reason: why}} as never);
      setRequests(list => (list ?? []).filter(x => x.id !== r.id));
      setMessage(t(action === 'complete' ? 'delCompleted' : 'delRejected'));
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('delConflict'));
        await read(null).catch(again => setError(again));
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  return (
    <section aria-labelledby={'del-' + kind}>
      <h2 id={'del-' + kind}>{t(kind === 'client' ? 'delRiders' : 'delDrivers')}</h2>
      {requests && requests.length === 0 ? <p>{t('delNone')}</p> : null}
      <ul>
        {(requests ?? []).map(r => (
          <li key={r.id}>
            <span>{[r.id.slice(0, 8), t('delRequested', {day: new Date(r.requested_at).toLocaleDateString('ru-RU',
              {timeZone: 'UTC'})}), t('delReturns', {state: t('delState_' + r.previous_state)})].join(' · ')}</span>
            {r.lines.map(line => <p key={line}>{line}</p>)}
            <label>{t('delReason')}<input value={reasons[r.id] ?? ''}
              onChange={e => setReasons(all => ({...all, [r.id]: e.target.value}))} /></label>
            <label><input type="checkbox" checked={Boolean(sure[r.id])} disabled={r.blocked}
              onChange={e => setSure(all => ({...all, [r.id]: e.target.checked}))} />{t('delSure')}</label>
            <button type="button" disabled={r.blocked} onClick={() => void decide(r, 'complete')}>{t('delComplete')}
            </button>
            <button type="button" onClick={() => void decide(r, 'reject')}>{t('delReject')}</button>
          </li>
        ))}
      </ul>
      {next ? <button type="button" onClick={() => void read(next).catch(failure => setError(failure))}>
        {t(kind === 'client' ? 'delMoreRiders' : 'delMoreDrivers')}</button> : null}
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}

/** Account deletion requests (#386): each side shown to the holders of its permission only. */
export function Deletions({client, t, newId, clients, drivers}: {client: ApiClient; t: Translate;
  newId: () => string; clients: boolean; drivers: boolean}) {
  return (
    <section aria-labelledby="deletions-title">
      <h1 id="deletions-title">{t('navDeletions')}</h1>
      {clients ? <Requests client={client} t={t} newId={newId} kind="client" /> : null}
      {drivers ? <Requests client={client} t={t} newId={newId} kind="driver" /> : null}
    </section>
  );
}
