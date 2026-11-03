import {useCallback, useEffect, useRef, useState} from 'react';
import {Link, useParams} from 'react-router-dom';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

type Item = {driver_id: string; name?: string | null; phone?: string | null; since: string};
type Doc = {id: string; type: string; decision: string; number?: string | null; valid_to?: string | null};
type Vehicle = {id: string; registration_number: string; make: string; model: string; state: string};
type Profile = {id: string; review_status: string; version: number; name?: string | null; documents: Doc[];
  vehicles: Vehicle[]};
type Case = {profile: Profile; phone?: string | null; history: {from: string; to: string; reason: string; at: string}[];
  duplicates?: {document_id: string}[]};
type Decision = 'APPROVE' | 'REQUEST_CHANGES' | 'REJECT';

const day = (at: string) => new Date(at).toLocaleDateString('ru-RU');

/** The review queue (#351): drivers in review, oldest first, a page at a time. */
export function DriverQueue({client, t}: {client: ApiClient; t: Translate}) {
  const [items, setItems] = useState<Item[] | null>(null);
  const [next, setNext] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const reading = useRef(false);

  const read = useCallback(async (after: string | null) => await client.get('/api/admin/v1/drivers' as never,
    {query: after ? {after} : {}} as never) as {drivers: Item[]; page: {next_cursor?: string | null}}, [client]);

  useEffect(() => {
    read(null).then(page => {
      setItems(page.drivers);
      setNext(page.page.next_cursor ?? null);
    }).catch(failure => setError(failure));
  }, [read]);

  async function more() {
    if (!next || reading.current) return;
    reading.current = true;
    try {
      const page = await read(next);
      setItems(list => [...(list ?? []), ...page.drivers]);
      setNext(page.page.next_cursor ?? null);
    } catch (failure) {
      setError(failure);
    } finally {
      reading.current = false;
    }
  }

  return (
    <section aria-labelledby="queue-title">
      <h1 id="queue-title">{t('navDrivers')}</h1>
      {items && items.length === 0 ? <p>{t('queueEmpty')}</p> : null}
      <ul>
        {(items ?? []).map(d => (
          <li key={d.driver_id}>
            <Link to={'/drivers/' + d.driver_id}>
              {[d.name ?? t('noName'), d.phone ?? '—', t('since', {day: day(d.since)})].join(' · ')}
            </Link>
          </li>
        ))}
      </ul>
      {next ? <button type="button" onClick={() => void more()}>{t('more')}</button> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}

/**
 * One driver's case (#351): documents (each scan opened once, every opening audited), vehicles, the history, the
 * duplicate files, and the decision with the driver's version.
 */
export function DriverCase({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const {driverId = ''} = useParams();
  const [item, setItem] = useState<Case | null>(null);
  const [scans, setScans] = useState<Record<string, {url: string; type: string}>>({});
  const [decision, setDecision] = useState<Decision | ''>('');
  const [classes, setClasses] = useState('');
  const [rejected, setRejected] = useState<string[]>([]);
  const [reason, setReason] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);
  const urls = useRef<string[]>([]);

  const read = useCallback(async () => {
    setItem(await client.get('/api/admin/v1/drivers/{driver_id}' as never,
      {params: {driver_id: driverId}} as never) as Case);
  }, [client, driverId]);

  useEffect(() => {
    read().catch(failure => setError(failure));
  }, [read]);
  useEffect(() => () => urls.current.forEach(url => URL.revokeObjectURL(url)), []);

  async function open(doc: Doc) {
    if (scans[doc.id] || acting.current) return;
    acting.current = true;
    setError(null);
    try {
      const blob = await client.get('/api/admin/v1/drivers/{driver_id}/documents/{document_id}/file' as never,
        {params: {driver_id: driverId, document_id: doc.id}} as never) as unknown as Blob;
      const url = URL.createObjectURL(blob);
      urls.current.push(url);
      setScans(all => ({...all, [doc.id]: {url, type: blob.type}}));
    } catch (failure) {
      setError(failure);
    } finally {
      acting.current = false;
    }
  }

  async function decide() {
    if (!item || acting.current) return;
    const why = reason.trim();
    const granted = classes.split(',').map(c => c.trim()).filter(Boolean);
    if (!decision || !why || why.length > 1000 || (decision === 'APPROVE' && granted.length === 0)) {
      setMessage(t('decisionNeeds'));
      return;
    }
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      await client.post('/api/admin/v1/drivers/{driver_id}/decision' as never, {params: {driver_id: driverId},
        body: {command_id: newId(), expected_version: item.profile.version, decision, reason: why,
          ...(decision === 'APPROVE' ? {vehicle_classes: granted} : {}),
          ...(decision === 'REQUEST_CHANGES' && rejected.length ? {rejected_documents: rejected} : {})}} as never);
      setMessage(t('decided'));
      setDecision('');
      setReason('');
      setRejected([]);
      await read();
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('driverChanged'));
        await read().catch(() => undefined);
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  if (!item) return error ? <Failure error={error} t={t} /> : <p>{t('loading')}</p>;
  const p = item.profile;
  const docName = (id: string) => t('doc_' + (p.documents.find(d => d.id === id)?.type ?? 'OTHER'));
  return (
    <section aria-labelledby="case-title">
      <h1 id="case-title">{(p.name ?? t('noName')) + (item.phone ? ' · ' + item.phone : '')}</h1>
      <p>{t('reviewStatus', {status: t('review_' + p.review_status)})}</p>
      <h2>{t('vehiclesTitle')}</h2>
      <ul>{p.vehicles.map(v => <li key={v.id}>{v.make + ' ' + v.model + ' ' + v.registration_number + ' · '
        + t('vehicle_' + v.state)}</li>)}</ul>
      <h2>{t('documentsTitle')}</h2>
      <ul>
        {p.documents.map(d => (
          <li key={d.id}>
            <span>{[t('doc_' + d.type), t('decision_' + d.decision), ...(d.number ? ['№ ' + d.number] : []),
              ...(d.valid_to ? [t('validTo', {day: d.valid_to})] : [])].join(' · ')}</span>
            {scans[d.id] ? (scans[d.id]!.type.startsWith('image/') ? <img src={scans[d.id]!.url} alt={t('doc_' + d.type)} />
              : <a href={scans[d.id]!.url} download>{t('downloadScan', {doc: t('doc_' + d.type)})}</a>)
              : <button type="button" onClick={() => void open(d)}>{t('openScan', {doc: t('doc_' + d.type)})}</button>}
            {decision === 'REQUEST_CHANGES' ? (
              <label>
                <input type="checkbox" checked={rejected.includes(d.id)} onChange={e => setRejected(list =>
                  e.target.checked ? [...list, d.id] : list.filter(x => x !== d.id))} />
                {t('rejectDoc', {doc: t('doc_' + d.type)})}
              </label>
            ) : null}
          </li>
        ))}
      </ul>
      {(item.duplicates ?? []).map(dup => <p key={dup.document_id} role="alert">{t('duplicateFile',
        {doc: docName(dup.document_id)})}</p>)}
      <h2>{t('historyTitle')}</h2>
      <ul>{item.history.map((h, i) => <li key={i}>{day(h.at) + ' · ' + h.from + ' → ' + h.to + ' · ' + h.reason}</li>)}</ul>
      {p.review_status === 'IN_REVIEW' ? (
        <fieldset>
          <legend>{t('decisionTitle')}</legend>
          {(['APPROVE', 'REQUEST_CHANGES', 'REJECT'] as const).map(d => (
            <label key={d}>
              <input type="radio" name="decision" checked={decision === d} onChange={() => setDecision(d)} />
              {t('decide_' + d)}
            </label>
          ))}
          {decision === 'APPROVE' ? (
            <label>{t('classesInput')}<input value={classes} onChange={e => setClasses(e.target.value)} /></label>
          ) : null}
          <label>{t('decisionReason')}<textarea value={reason} onChange={e => setReason(e.target.value)} /></label>
          <button type="button" onClick={() => void decide()}>{t('decideButton')}</button>
        </fieldset>
      ) : null}
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
      <p><Link to="/drivers">{t('toQueue')}</Link></p>
    </section>
  );
}
