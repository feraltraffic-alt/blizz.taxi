import {useCallback, useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

type Side = 'RIDER' | 'DRIVER' | 'STAFF' | 'REASSIGN';
type Reason = {id: string; audience: Side; code: string; labels: Record<string, string>;
  driver_outcome: string | null; operator_fault?: boolean; active: boolean; sort_order: number; version: number};
type Draft = {labels: Record<string, string>; outcome: string; fault: boolean; active: boolean; order: string;
  why: string};

const SIDES: Side[] = ['RIDER', 'DRIVER', 'STAFF', 'REASSIGN'];
const CODE = /^[A-Z][A-Z0-9_]{1,39}$/i;
const ORDER = /^[0-9]{1,5}$/;

/** Drops empty labels; null when the default language is missing or a label is too long. */
function labelsOf(labels: Record<string, string>, main: string) {
  const kept = Object.fromEntries(Object.entries(labels).map(([k, v]) => [k, v.trim()] as const)
    .filter(([, v]) => v !== ''));
  return kept[main] && Object.values(kept).every(v => v.length <= 80) ? kept : null;
}

/**
 * The cancellation reasons of every side for holders of settings.manage (#385, REQ-CAN-01): the list by side and
 * order, adding a reason, and changing one with the version read. A driver's reason has an outcome, a staff reason
 * may be the operator's fault, and other sides send neither.
 */
export function CancelReasons({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const [reasons, setReasons] = useState<Reason[] | null>(null);
  const [languages, setLanguages] = useState<{main: string; enabled: string[]}>({main: 'uk', enabled: ['uk']});
  const [side, setSide] = useState<Side>('RIDER');
  const [code, setCode] = useState('');
  const [draft, setDraft] = useState<Draft>({labels: {}, outcome: '', fault: false, active: true, order: '0', why: ''});
  const [editing, setEditing] = useState<Record<string, Draft>>({});
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const read = useCallback(async () => {
    setReasons(((await client.get('/api/admin/v1/settings/cancel-reasons' as never, {} as never)) as
      {reasons: Reason[]}).reasons);
  }, [client]);

  useEffect(() => {
    read().catch(failure => setError(failure));
    client.get('/api/config/v1/bootstrap' as never, {} as never).then(boot => {
      const value = boot as {languages?: {default_language: string; enabled: string[]}};
      if (value.languages) setLanguages({main: value.languages.default_language, enabled: value.languages.enabled});
    }).catch(() => undefined);
  }, [client, read]);

  /** The fields of a side: an outcome for drivers, the operator's fault for staff, nothing for the others. */
  const extras = (of: Side, d: Draft) => ({...(of !== 'STAFF' ? {driver_outcome: d.outcome || null} : {}),
    ...(of === 'STAFF' ? {operator_fault: d.fault} : {})});
  const valid = (of: Side, d: Draft) => {
    const why = d.why.trim();
    return labelsOf(d.labels, languages.main) !== null && (of !== 'DRIVER' || d.outcome !== '')
      && ORDER.test(d.order.trim()) && Number(d.order.trim()) <= 10000 && why !== '' && why.length <= 500;
  };

  async function run(work: () => Promise<void>, conflict: string, reread: boolean) {
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      await work();
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t(conflict));
        if (reread) await read().catch(again => setError(again));
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  function add() {
    if (!CODE.test(code.trim()) || !valid(side, draft)) {
      setMessage(t('reasonNeeds'));
      return;
    }
    return run(async () => {
      const created = await client.post('/api/admin/v1/settings/cancel-reasons' as never, {body: {command_id: newId(),
        audience: side, code: code.trim(), labels: labelsOf(draft.labels, languages.main), ...extras(side, draft),
        active: draft.active, sort_order: Number(draft.order.trim()), reason: draft.why.trim()}} as never) as Reason;
      setReasons(list => [...(list ?? []), created]);
      setCode('');
      setDraft({labels: {}, outcome: '', fault: false, active: true, order: '0', why: ''});
      setMessage(t('reasonAdded'));
    }, 'reasonCodeTaken', false);
  }

  function save(r: Reason) {
    const d = editing[r.id];
    if (!d) return;
    if (!valid(r.audience, d)) {
      setMessage(t('reasonNeeds'));
      return;
    }
    return run(async () => {
      const changed = await client.post('/api/admin/v1/settings/cancel-reasons/{reason_id}' as never, {params: {
        reason_id: r.id}, body: {command_id: newId(), expected_version: r.version,
        labels: labelsOf(d.labels, languages.main), ...extras(r.audience, d), active: d.active,
        sort_order: Number(d.order.trim()), reason: d.why.trim()}} as never) as Reason;
      setReasons(list => (list ?? []).map(x => x.id === changed.id ? changed : x));
      setEditing(all => Object.fromEntries(Object.entries(all).filter(([id]) => id !== r.id)));
    }, 'reasonChanged', true);
  }

  const outcome = (r: Reason) => r.driver_outcome ? [t('outcome_' + r.driver_outcome)] : [];
  const line = (r: Reason) => [r.code, r.labels[languages.main] ?? Object.values(r.labels)[0] ?? '—',
    t(r.active ? 'reasonActive' : 'reasonHidden'), t('reasonOrder', {n: r.sort_order}), ...outcome(r),
    ...(r.operator_fault ? [t('operatorFault')] : [])].join(' · ');
  const labelInputs = (d: Draft, change: (labels: Record<string, string>) => void, name: (lang: string) => string) =>
    [...languages.enabled, ...Object.keys(d.labels).filter(k => !languages.enabled.includes(k))].map(lang => (
      <label key={lang}>{name(lang)}
        <input value={d.labels[lang] ?? ''} onChange={e => change({...d.labels, [lang]: e.target.value})} /></label>
    ));
  const sideFields = (of: Side, d: Draft, set: (d: Draft) => void, id: string, suffix: string) => (
    <>
      {of === 'DRIVER' ? (
        <>
          <label htmlFor={'outcome-' + id}>{t('outcomeLabel') + suffix}</label>
          <select id={'outcome-' + id} value={d.outcome} onChange={e => set({...d, outcome: e.target.value})}>
            <option value="">—</option>
            <option value="RETURN_TO_SEARCH">{t('outcome_RETURN_TO_SEARCH')}</option>
            <option value="CANCEL_ORDER">{t('outcome_CANCEL_ORDER')}</option>
          </select>
        </>
      ) : null}
      {of === 'STAFF' ? <label><input type="checkbox" checked={d.fault}
        onChange={e => set({...d, fault: e.target.checked})} />{t('operatorFaultBox') + suffix}</label> : null}
    </>
  );
  const sorted = [...(reasons ?? [])].sort((a, b) => a.sort_order - b.sort_order);
  return (
    <section aria-labelledby="reasons-title">
      <h1 id="reasons-title">{t('cancelReasonsTitle')}</h1>
      {SIDES.map(s => (
        <div key={s}>
          <h2>{t('side_' + s)}</h2>
          <ul>
            {sorted.filter(r => r.audience === s).map(r => {
              const d = editing[r.id];
              const set = (next: Draft) => setEditing(all => ({...all, [r.id]: next}));
              return (
                <li key={r.id}>
                  <span>{line(r)}</span>
                  {d ? (
                    <>
                      {labelInputs(d, labels => set({...d, labels}), lang => t('reasonTextOf', {code: r.code, lang}))}
                      {sideFields(r.audience, d, set, r.id, ': ' + r.code)}
                      <label><input type="checkbox" checked={d.active} onChange={e => set({...d,
                        active: e.target.checked})} />{t('activeOf', {code: r.code})}</label>
                      <label>{t('orderOf', {code: r.code})}<input value={d.order}
                        onChange={e => set({...d, order: e.target.value})} /></label>
                      <label>{t('whyOf', {code: r.code})}<input value={d.why}
                        onChange={e => set({...d, why: e.target.value})} /></label>
                      <button type="button" onClick={() => void save(r)}>{t('saveOf', {code: r.code})}</button>
                    </>
                  ) : (
                    <button type="button" onClick={() => setEditing(all => ({...all, [r.id]: {labels: {...r.labels},
                      outcome: r.driver_outcome ?? '', fault: Boolean(r.operator_fault), active: r.active,
                      order: String(r.sort_order), why: ''}}))}>{t('editReason', {code: r.code})}</button>
                  )}
                </li>
              );
            })}
          </ul>
        </div>
      ))}
      <fieldset>
        <legend>{t('addReasonTitle')}</legend>
        <label htmlFor="reason-side">{t('sideLabel')}</label>
        <select id="reason-side" value={side} onChange={e => setSide(e.target.value as Side)}>
          {SIDES.map(s => <option key={s} value={s}>{t('side_' + s)}</option>)}
        </select>
        <label>{t('codeLabel')}<input value={code} onChange={e => setCode(e.target.value)} /></label>
        {labelInputs(draft, labels => setDraft(d => ({...d, labels})), lang => t('reasonText', {lang}))}
        {sideFields(side, draft, setDraft, 'new', '')}
        <label><input type="checkbox" checked={draft.active}
          onChange={e => setDraft(d => ({...d, active: e.target.checked}))} />{t('activeBox')}</label>
        <label>{t('orderLabel')}<input value={draft.order} onChange={e => setDraft(d => ({...d, order: e.target.value}))} />
        </label>
        <label>{t('listReason')}<input value={draft.why} onChange={e => setDraft(d => ({...d, why: e.target.value}))} />
        </label>
        <button type="button" onClick={() => void add()}>{t('addReason')}</button>
      </fieldset>
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
