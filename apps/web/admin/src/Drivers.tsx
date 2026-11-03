import {useCallback, useEffect, useRef, useState} from 'react';
import {Link, useParams} from 'react-router-dom';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';
import {DriverEarnings} from './DriverEarnings.js';
import {DriverBalance} from './Balance.js';

type Item = {driver_id: string; name?: string | null; phone?: string | null; since: string};
type Doc = {id: string; type: string; decision: string; number?: string | null; valid_to?: string | null};
type Vehicle = {id: string; registration_number: string; make: string; model: string; state: string};
type Profile = {id: string; account_state?: string; review_status: string; version: number; name?: string | null;
  documents: Doc[]; vehicles: Vehicle[]; admission_city_ids?: string[]};
type Case = {profile: Profile; phone?: string | null; history: {from: string; to: string; reason: string; at: string}[];
  duplicates?: {document_id: string}[]};
type Decision = 'APPROVE' | 'REQUEST_CHANGES' | 'REJECT';
type AccountAction = 'block' | 'unblock' | 'suspend' | 'reinstate';
const STATUSES = ['IN_REVIEW', 'NOT_SUBMITTED', 'CHANGES_REQUIRED', 'APPROVED', 'REJECTED', 'SUSPENDED', 'EXPIRED'];

const day = (at: string) => new Date(at).toLocaleDateString('ru-RU');

/** The review queue (#351): drivers in a review status (#363; in review by default), oldest first, a page at a time. */
export function DriverQueue({client, t}: {client: ApiClient; t: Translate}) {
  const [status, setStatus] = useState('IN_REVIEW');
  const [items, setItems] = useState<Item[] | null>(null);
  const [next, setNext] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const reading = useRef(false);

  /** The next page by the opaque `cursor` (#361); `after` is the deprecated timestamp of the first version. */
  const read = useCallback(async (cursor: string | null) => await client.get('/api/admin/v1/drivers' as never,
    {query: {status, ...(cursor ? {cursor} : {})}} as never) as {drivers: Item[]; page: {next_cursor?: string | null}},
  [client, status]);

  useEffect(() => {
    let current = true;
    setItems(null);
    setNext(null);
    read(null).then(page => {
      if (!current) return;
      setItems(page.drivers);
      setNext(page.page.next_cursor ?? null);
    }).catch(failure => {if (current) setError(failure);});
    return () => {current = false;};
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
      <label>{t('statusFilter')}
        <select value={status} onChange={e => setStatus(e.target.value)}>
          {STATUSES.map(s => <option key={s} value={s}>{t('review_' + s)}</option>)}
        </select>
      </label>
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
export function DriverCase({client, t, newId, finance = false}: {client: ApiClient; t: Translate; newId: () => string;
  /** The staff member holds finance.manage: the balance and its top-up are shown (#364). */
  finance?: boolean}) {
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
  /** The service's cities and the ticked admission cities (#353). */
  const [cities, setCities] = useState<{id: string; name: string; currency?: string; timezone?: string}[]>([]);
  const [admitted, setAdmitted] = useState<string[]>([]);
  const [cityReason, setCityReason] = useState('');
  /** The reason for a block, a suspension or their reversal (#363). */
  const [accountReason, setAccountReason] = useState('');

  useEffect(() => {
    client.get('/api/config/v1/bootstrap' as never, {} as never)
      .then(boot => setCities((boot as {cities: {id: string; name: string; currency?: string; timezone?: string}[]})
        .cities))
      .catch(() => setCities([]));
  }, [client]);

  const read = useCallback(async () => {
    const value = await client.get('/api/admin/v1/drivers/{driver_id}' as never,
      {params: {driver_id: driverId}} as never) as Case;
    setItem(value);
    setAdmitted(value.profile.admission_city_ids ?? []);
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

  async function saveCities() {
    if (!item || acting.current) return;
    const before = [...(item.profile.admission_city_ids ?? [])].sort().join();
    const why = cityReason.trim();
    if (!why || why.length > 500 || [...admitted].sort().join() === before) {
      setMessage(t('citiesNeed'));
      return;
    }
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      const changed = await client.put('/api/admin/v1/drivers/{driver_id}/admission-cities' as never, {params: {
        driver_id: driverId}, body: {command_id: newId(), expected_version: item.profile.version,
        city_ids: cities.map(c => c.id).filter(id => admitted.includes(id)), reason: why}} as never) as Profile;
      setItem(old => old ? {...old, profile: changed} : old);
      setAdmitted(changed.admission_city_ids ?? []);
      setCityReason('');
      setMessage(t('citiesSaved'));
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('driverChanged'));
        await read().catch(() => undefined);
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  /** Blocks or unblocks the account, suspends or reinstates the admission (#363), with the version read. */
  async function account(action: AccountAction) {
    if (!item || acting.current) return;
    const why = accountReason.trim();
    if (!why || why.length > 1000) {
      setMessage(t('accountNeeds'));
      return;
    }
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      const changed = await client.post(('/api/admin/v1/drivers/{driver_id}/' + action) as never, {params: {
        driver_id: driverId}, body: {command_id: newId(), expected_version: item.profile.version, reason: why}
      } as never) as Profile;
      setItem(old => old ? {...old, profile: changed} : old);
      setAccountReason('');
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
      {p.account_state ? <p>{t('accountState', {state: t('account_' + p.account_state)})}</p> : null}
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
      {cities.length ? (
        <fieldset>
          <legend>{t('admissionCities')}</legend>
          {cities.map(c => (
            <label key={c.id}>
              <input type="checkbox" checked={admitted.includes(c.id)} onChange={e => setAdmitted(list =>
                e.target.checked ? [...list, c.id] : list.filter(x => x !== c.id))} />
              {c.name}
            </label>
          ))}
          <label>{t('citiesReason')}<input value={cityReason} onChange={e => setCityReason(e.target.value)} /></label>
          <button type="button" onClick={() => void saveCities()}>{t('saveCities')}</button>
        </fieldset>
      ) : null}
      {finance ? <DriverBalance client={client} t={t} newId={newId} driverId={driverId}
        currencies={cities.flatMap(c => c.currency ? [c.currency] : [])} /> : null}
      {finance ? <DriverEarnings client={client} t={t} driverId={driverId} cities={cities}
        admitted={p.admission_city_ids ?? []} /> : null}
      <fieldset>
        <legend>{t('accountTitle')}</legend>
        <label>{t('accountReason')}
          <input value={accountReason} onChange={e => setAccountReason(e.target.value)} /></label>
        {p.account_state === 'ACTIVE'
          ? <button type="button" onClick={() => void account('block')}>{t('blockAccount')}</button> : null}
        {p.account_state === 'BLOCKED'
          ? <button type="button" onClick={() => void account('unblock')}>{t('unblockAccount')}</button> : null}
        {p.review_status === 'APPROVED'
          ? <button type="button" onClick={() => void account('suspend')}>{t('suspendDriver')}</button> : null}
        {p.review_status === 'SUSPENDED'
          ? <button type="button" onClick={() => void account('reinstate')}>{t('reinstateDriver')}</button> : null}
      </fieldset>
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
      <p><Link to="/drivers">{t('toQueue')}</Link></p>
    </section>
  );
}
