import {useCallback, useEffect, useRef, useState} from 'react';
import {Link, useParams} from 'react-router-dom';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';
import {decimal} from './Promotions.js';

type Run = {id: string; merchant_id: string; day: string; partial: boolean; state: string;
  local_count?: number | null; provider_count?: number | null; item_count?: number | null;
  open_count?: number | null; failure_code?: string | null; attempts?: number};
type Item = {id: string; kind: string; reference_display?: string | null; local_type?: string | null;
  local_state?: string | null; local_amount_minor?: number | null; local_currency?: string | null;
  provider_type?: string | null; provider_state?: string | null; provider_status?: string | null;
  provider_amount_minor?: number | null; provider_currency?: string | null; fee_minor?: number | null;
  provider_at?: string | null; state: 'OPEN' | 'RESOLVED'; decision?: string | null; reason?: string | null;
  version: number};

const DECISIONS = [['EXPLAINED', 'reconExplain'], ['CORRECTED_BY_HAND', 'reconCorrected'],
  ['ESCALATED', 'reconEscalate']];

const dmy = (date: string) => date.split('-').reverse().join('.');
const utc = (at: string) => {
  const when = new Date(at);
  return when.toLocaleDateString('ru-RU', {timeZone: 'UTC'}) + ' '
    + when.toLocaleTimeString('ru-RU', {timeZone: 'UTC', hour: '2-digit', minute: '2-digit'}) + ' UTC';
};

/** What a run found, in words; a FAILED or RUNNING run never shows its missing counts as zeros. */
function runWords(r: Run, t: Translate) {
  const counts = [t('reconCounts', {local: r.local_count ?? 0, provider: r.provider_count ?? 0})];
  const found = r.state === 'FAILED' ? [t('reconFailed', {code: r.failure_code ?? '—', attempts: r.attempts ?? 1}),
    ...counts]
    : r.state === 'RUNNING' ? [t('reconRunning')]
      : r.state === 'CLEAN' ? [t('reconClean'), ...counts]
        : [t('reconOpen', {open: r.open_count ?? '—', all: r.item_count ?? '—'}), ...counts];
  return [t('reconMerchant', {id: r.merchant_id.slice(0, 8)}), ...found, ...(r.partial ? [t('reconPartial')] : [])];
}

/** The daily card reconciliation runs for holders of payments.retry (#431, REQ-LED-07), newest first. */
export function Reconciliations({client, t}: {client: ApiClient; t: Translate}) {
  const [runs, setRuns] = useState<Run[] | null>(null);
  const [next, setNext] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);

  const page = useCallback(async (cursor: string | null) => {
    const value = await client.get('/api/admin/v1/payment-reconciliations' as never,
      {query: cursor ? {cursor} : {}} as never) as {runs: Run[]; next_cursor?: string | null};
    setRuns(list => [...(cursor ? list ?? [] : []), ...value.runs]);
    setNext(value.next_cursor ?? null);
  }, [client]);

  useEffect(() => {
    page(null).catch(failure => setError(failure));
  }, [page]);

  return (
    <section aria-labelledby="recon-title">
      <h1 id="recon-title">{t('navReconciliations')}</h1>
      {runs && runs.length === 0 ? <p>{t('reconNone')}</p> : null}
      <ul>
        {(runs ?? []).map(r => (
          <li key={r.id}><span><Link to={'/reconciliations/' + r.id}>{dmy(r.day)}</Link>
            {' · ' + runWords(r, t).join(' · ')}</span></li>
        ))}
      </ul>
      {next ? <button type="button" onClick={() => void page(next).catch(failure => setError(failure))}>
        {t('reconMore')}</button> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}

/** One run and its differences, ordered by id, with a decision recorded once on an open one. */
export function ReconciliationRun({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const {runId = ''} = useParams();
  const [run, setRun] = useState<Run | null>(null);
  const [items, setItems] = useState<Item[]>([]);
  const [next, setNext] = useState<string | null>(null);
  const [reasons, setReasons] = useState<Record<string, string>>({});
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const page = useCallback(async (after: string | null) => {
    const value = await client.get('/api/admin/v1/payment-reconciliations/{run_id}' as never, {params: {run_id: runId},
      query: after ? {cursor: after} : {}} as never) as {run: Run; items: Item[]; next?: string | null};
    setRun(value.run);
    setItems(list => [...(after ? list : []), ...value.items]);
    setNext(value.next ?? null);
  }, [client, runId]);

  useEffect(() => {
    page(null).catch(failure => setError(failure));
  }, [page]);

  async function resolve(i: Item, decision: string) {
    if (acting.current) return;
    const reason = (reasons[i.id] ?? '').trim();
    if (!reason || reason.length > 500) {
      setMessage(t('reconNeeds'));
      return;
    }
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      const done = await client.post('/api/admin/v1/payment-reconciliations/items/{item_id}/resolve' as never,
        {params: {item_id: i.id}, body: {command_id: newId(), expected_version: i.version, decision, reason}} as
        never) as Item;
      setItems(list => list.map(x => x.id === done.id ? done : x));
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('reconConflict'));
        await page(null).catch(again => setError(again));
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  const side = (label: string, type?: string | null, state?: string | null, status?: string | null,
    minor?: number | null, currency?: string | null) => {
    const words = [type, state, status, ...(minor != null ? [decimal(minor) + (currency ? ' ' + currency : '')] : [])]
      .filter(Boolean);
    return words.length ? [label + ' ' + words.join(' ')] : [];
  };
  const describe = (i: Item) => [t('reconKind_' + i.kind), ...(i.reference_display ? [i.reference_display] : []),
    ...side(t('reconOurs'), i.local_type, i.local_state, null, i.local_amount_minor, i.local_currency),
    ...side(t('reconBanks'), i.provider_type, i.provider_state, i.provider_status, i.provider_amount_minor,
      i.provider_currency),
    ...(i.fee_minor != null ? [t('reconFee', {amount: decimal(i.fee_minor)})] : []),
    ...(i.provider_at ? [utc(i.provider_at)] : []),
    ...(i.decision ? [t('reconDecision_' + i.decision)] : []), ...(i.reason ? [i.reason] : [])].join(' · ');
  return (
    <section aria-labelledby="run-title">
      <h1 id="run-title">{t('reconRunTitle')}</h1>
      {run ? <p>{[dmy(run.day), ...runWords(run, t)].join(' · ')}</p> : null}
      <ul>
        {items.map(i => (
          <li key={i.id}>
            <span>{describe(i)}</span>
            {i.state === 'OPEN' ? (
              <>
                <label>{t('reconReason')}<input value={reasons[i.id] ?? ''}
                  onChange={e => setReasons(all => ({...all, [i.id]: e.target.value}))} /></label>
                {DECISIONS.map(([decision, label]) => (
                  <button key={decision} type="button" onClick={() => void resolve(i, decision!)}>{t(label!)}</button>
                ))}
              </>
            ) : null}
          </li>
        ))}
      </ul>
      {next ? <button type="button" onClick={() => void page(next).catch(failure => setError(failure))}>
        {t('reconMore')}</button> : null}
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
      <p><Link to="/reconciliations">{t('reconBack')}</Link></p>
    </section>
  );
}
