import {useCallback, useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

type Recording = {state: 'PENDING' | 'STORED' | 'NONE'; duration_seconds?: number | null};
type Call = {id: string; state: string; caller_phone?: string | null; answered_by?: string | null;
  order_ids: string[]; started_at: string; recording?: Recording | null};
type Status = {status: string; extension?: string | null};

/** A call an order is made from (#300 K4): the order carries its id and the form gets the caller's number. */
export type FromCall = {id: string; phone: string | null};

const STATUSES = ['AVAILABLE', 'BREAK', 'OFFLINE'];
const clock = (at: string) => {
  const d = new Date(at);
  return String(d.getHours()).padStart(2, '0') + ':' + String(d.getMinutes()).padStart(2, '0');
};

/**
 * The calls panel (#300): my status for the card-pop, the call log read every pollMs, taking a ringing call and
 * making an order from a call I took. Status and taking need calls.answer; the log is shown with calls.listen too.
 */
export function Calls({client, t, rights, me, newId, pollMs, onOrder}: {client: ApiClient; t: Translate;
  rights: Set<string>; me: string; newId: () => string; pollMs: number; onOrder: (call: FromCall) => void}) {
  const canAnswer = rights.has('calls.answer');
  const [status, setStatus] = useState<Status | null>(null);
  const [calls, setCalls] = useState<Call[] | null>(null);
  const [ringing, setRinging] = useState(false);
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);
  const asking = useRef(0);
  /** Recordings fetched in this panel, by call: every fetch is an audited listening (#302 R2). */
  const [players, setPlayers] = useState<Record<string, string>>({});
  const urls = useRef<string[]>([]);

  useEffect(() => () => urls.current.forEach(url => URL.revokeObjectURL(url)), []);

  useEffect(() => {
    if (!canAnswer) return;
    client.get('/api/operator/v1/me/call-status' as never, {} as never)
      .then(answer => setStatus(answer as Status)).catch(failure => setError(failure));
  }, [client, canAnswer]);

  const read = useCallback(async () => {
    const mine = ++asking.current;
    const answer = await client.get('/api/operator/v1/calls' as never,
      {query: ringing ? {state: 'RINGING'} : {}} as never) as {calls: Call[]};
    if (mine === asking.current) setCalls(answer.calls);
  }, [client, ringing]);

  useEffect(() => {
    const tick = () => {read().catch(failure => setError(failure));};
    tick();
    const timer = setInterval(tick, pollMs);
    return () => {
      clearInterval(timer);
      asking.current++;
    };
  }, [read, pollMs]);

  async function once(action: () => Promise<void>) {
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      await action();
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('callGone'));
        await read().catch(() => undefined);
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  const change = (next: string) => once(async () => {
    setStatus(await client.post('/api/operator/v1/me/call-status' as never,
      {body: {command_id: newId(), status: next}} as never) as Status);
  });

  const take = (call: Call) => once(async () => {
    const taken = await client.post('/api/operator/v1/calls/{call_id}/answer' as never,
      {params: {call_id: call.id}, body: {command_id: newId()}} as never) as Call;
    setCalls(list => (list ?? []).map(c => c.id === taken.id ? taken : c));
  });

  const listen = (call: Call) => once(async () => {
    if (players[call.id]) return;
    const blob = await client.get('/api/operator/v1/calls/{call_id}/recording' as never,
      {params: {call_id: call.id}} as never) as unknown as Blob;
    const url = URL.createObjectURL(blob);
    urls.current.push(url);
    setPlayers(all => ({...all, [call.id]: url}));
  });

  function recording(call: Call): string | null {
    const r = call.recording;
    if (!r) return null;
    if (r.state !== 'STORED') return t(r.state === 'PENDING' ? 'recordingPending' : 'recordingNone');
    const seconds = r.duration_seconds ?? 0;
    return t('recordingLength', {length: Math.floor(seconds / 60) + ':' + String(seconds % 60).padStart(2, '0')});
  }

  function line(call: Call): string {
    return [clock(call.started_at), call.caller_phone ?? t('hiddenNumber'), t('call_' + call.state),
      ...(call.order_ids.length ? [t('callOrders', {count: call.order_ids.length})] : []),
      ...(recording(call) ? [recording(call)!] : [])].join(' · ');
  }

  return (
    <section aria-labelledby="calls-title">
      <h1 id="calls-title">{t('calls')}</h1>
      {canAnswer && status ? (
        <>
          <p>{t('myCallStatus', {status: t('callStatus_' + status.status)}) + ' · '
            + (status.extension ? t('extension', {number: status.extension}) : t('noExtension'))}</p>
          {STATUSES.filter(s => s !== status.status).map(s => (
            <button key={s} type="button" onClick={() => void change(s)}>{t('setStatus_' + s)}</button>
          ))}
        </>
      ) : null}
      <label>
        <input type="checkbox" checked={ringing} onChange={e => setRinging(e.target.checked)} />
        {t('ringingOnly')}
      </label>
      {calls && calls.length === 0 ? <p>{t('noCalls')}</p> : null}
      {calls ? (
        <ul aria-label={t('calls')}>
          {calls.map(c => (
            <li key={c.id}>
              <span>{line(c)}</span>
              {canAnswer && c.state === 'RINGING'
                ? <button type="button" onClick={() => void take(c)}>{t('takeCall')}</button> : null}
              {rights.has('orders.create') && c.state === 'ANSWERED' && c.answered_by === me
                ? <button type="button" onClick={() => onOrder({id: c.id, phone: c.caller_phone ?? null})}>
                  {t('orderFromCall')}</button> : null}
              {players[c.id] ? <audio controls src={players[c.id]} aria-label={t('callRecording')} />
                : rights.has('calls.listen') && c.recording?.state === 'STORED'
                  ? <button type="button" onClick={() => void listen(c)}>{t('listen')}</button> : null}
            </li>
          ))}
        </ul>
      ) : null}
      {message ? <p role="alert">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
