import {useCallback, useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

type Version = {id: string; audience: string; kind: string; number: number; state: string;
  texts: Record<string, string>; acceptance_required: boolean; effective_from: string; version: number};
type Form = {audience: string; kind: string; texts: Record<string, string>; accept: boolean; from: string};

const AUDIENCES = ['RIDER', 'DRIVER'];
const KINDS = ['TERMS', 'PRIVACY_NOTICE', 'DRIVER_AGREEMENT'];
const LANGUAGES = ['uk', 'pl', 'ru', 'en'];
const MOMENT = /^(\d{4})-(\d{2})-(\d{2}) (\d{2}):(\d{2})$/;

/** "2026-11-10 09:00" in UTC from an instant. */
function typed(at: string) {
  return new Date(at).toISOString().slice(0, 16).replace('T', ' ');
}

/** "2026-11-10 09:00" read as UTC → "2026-11-10T09:00:00Z"; null when it is not a real moment. */
function instant(text: string) {
  const parts = MOMENT.exec(text.trim());
  if (!parts) return null;
  const [y, mo, d, h, mi] = parts.slice(1).map(Number) as [number, number, number, number, number];
  const at = new Date(Date.UTC(y, mo - 1, d, h, mi));
  return at.getUTCFullYear() === y && at.getUTCMonth() === mo - 1 && at.getUTCDate() === d && h < 24 && mi < 60
    ? at.toISOString().replace('.000Z', 'Z') : null;
}

const empty = (): Form => ({audience: 'RIDER', kind: 'TERMS', texts: {}, accept: false,
  from: typed(new Date(Date.now()).toISOString())});

/**
 * The legal texts for holders of legal.manage (#388): versions by audience and kind, drafts written per language and
 * changed with the version read, and publishing, which is final and therefore ticked first. Moments are UTC.
 */
export function Legal({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const [filter, setFilter] = useState({audience: '', kind: ''});
  const [versions, setVersions] = useState<Version[] | null>(null);
  const [form, setForm] = useState<Form>(empty);
  const [editing, setEditing] = useState<Version | null>(null);
  const [sure, setSure] = useState<Record<string, boolean>>({});
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const read = useCallback(async () => {
    const query = {...(filter.audience ? {audience: filter.audience} : {}),
      ...(filter.kind ? {kind: filter.kind} : {})};
    const answer = await client.get('/api/admin/v1/legal-documents' as never, {query} as never) as
      {versions: Version[]};
    setVersions(answer.versions);
  }, [client, filter]);

  useEffect(() => {
    read().catch(failure => setError(failure));
  }, [read]);

  async function run(work: () => Promise<void>) {
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      await work();
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('legalConflict'));
        await read().catch(again => setError(again));
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  function save() {
    const texts = Object.fromEntries(Object.entries(form.texts).filter(([, v]) => v.trim() !== ''));
    const from = instant(form.from);
    if (Object.keys(texts).length === 0 || Object.values(texts).some(v => v.length > 200000) || !from
      || (form.audience === 'RIDER' && form.kind === 'DRIVER_AGREEMENT')) {
      setMessage(t('legalNeeds'));
      return;
    }
    return run(async () => {
      if (editing) {
        const changed = await client.post('/api/admin/v1/legal-documents/{version_id}' as never, {params: {
          version_id: editing.id}, body: {command_id: newId(), expected_version: editing.version, texts,
          acceptance_required: form.accept, effective_from: from}} as never) as Version;
        setVersions(list => (list ?? []).map(v => v.id === changed.id ? changed : v));
      } else {
        const created = await client.post('/api/admin/v1/legal-documents' as never, {body: {command_id: newId(),
          audience: form.audience, kind: form.kind, texts, acceptance_required: form.accept, effective_from: form.from}
        } as never) as Version;
        setVersions(list => [created, ...(list ?? [])]);
      }
      setEditing(null);
      setForm(empty());
      setMessage(t('legalSaved'));
    });
  }

  function publish(v: Version) {
    if (sure[v.id] === undefined && v.number < 0) {
      setMessage(t('legalTickFirst'));
      return;
    }
    return run(async () => {
      const published = await client.post('/api/admin/v1/legal-documents/{version_id}/publish' as never, {params: {
        version_id: v.id}, body: {command_id: newId(), expected_version: v.version}} as never) as Version;
      setVersions(list => (list ?? []).map(x => x.id === published.id ? published : x));
    });
  }

  function edit(v: Version) {
    setEditing(v);
    setForm({audience: v.audience, kind: v.kind, texts: {...v.texts}, accept: v.acceptance_required,
      from: typed(v.effective_from)});
  }

  const line = (v: Version) => ['№ ' + v.number, t('legalState_' + v.state), t('legalFrom', {at: typed(v.effective_from)
    .split(' ').map((p, i) => i === 0 ? p.split('-').reverse().join('.') : p).join(' ')}),
  t('legalLanguages', {list: Object.keys(v.texts).join(', ')}), t(v.acceptance_required ? 'legalAccept' : 'legalNoAccept')]
    .join(' · ');
  const kinds = KINDS.filter(k => form.audience === 'DRIVER' || k !== 'DRIVER_AGREEMENT');
  return (
    <section aria-labelledby="legal-title">
      <h1 id="legal-title">{t('navLegal')}</h1>
      <label htmlFor="legal-show-audience">{t('legalShowAudience')}</label>
      <select id="legal-show-audience" value={filter.audience}
        onChange={e => setFilter(f => ({...f, audience: e.target.value}))}>
        <option value="">{t('legalAll')}</option>
        {AUDIENCES.map(a => <option key={a} value={a}>{t('legalAudience_' + a)}</option>)}
      </select>
      <label htmlFor="legal-show-kind">{t('legalShowKind')}</label>
      <select id="legal-show-kind" value={filter.kind} onChange={e => setFilter(f => ({...f, kind: e.target.value}))}>
        <option value="">{t('legalAll')}</option>
        {KINDS.map(k => <option key={k} value={k}>{t('legalKind_' + k)}</option>)}
      </select>
      <ul>
        {(versions ?? []).map(v => (
          <li key={v.id}>
            <span>{line(v)}</span>
            {v.state === 'DRAFT' ? (
              <>
                <button type="button" onClick={() => edit(v)}>{t('legalEdit')}</button>
                <label><input type="checkbox" checked={Boolean(sure[v.id])}
                  onChange={e => setSure(all => ({...all, [v.id]: e.target.checked}))} />{t('legalSure')}</label>
                <button type="button" onClick={() => void publish(v)}>{t('legalPublish')}</button>
              </>
            ) : null}
          </li>
        ))}
      </ul>
      <fieldset>
        <legend>{editing ? t('legalEditTitle', {n: editing.number}) : t('legalNewTitle')}</legend>
        <label htmlFor="legal-audience">{t('legalAudienceLabel')}</label>
        <select id="legal-audience" value={form.audience} disabled={Boolean(editing)}
          onChange={e => setForm(f => ({...f, audience: e.target.value,
            kind: e.target.value === 'RIDER' && f.kind === 'DRIVER_AGREEMENT' ? 'TERMS' : f.kind}))}>
          {AUDIENCES.map(a => <option key={a} value={a}>{t('legalAudience_' + a)}</option>)}
        </select>
        <label htmlFor="legal-kind">{t('legalKindLabel')}</label>
        <select id="legal-kind" value={form.kind} disabled={Boolean(editing)}
          onChange={e => setForm(f => ({...f, kind: e.target.value}))}>
          {kinds.map(k => <option key={k} value={k}>{t('legalKind_' + k)}</option>)}
        </select>
        {LANGUAGES.map(lang => (
          <label key={lang}>{t('legalText', {lang})}<textarea value={form.texts[lang] ?? ''}
            onChange={e => setForm(f => ({...f, texts: {...f.texts, [lang]: e.target.value}}))} /></label>
        ))}
        <label><input type="checkbox" checked={form.accept}
          onChange={e => setForm(f => ({...f, accept: e.target.checked}))} />{t('legalMustAccept')}</label>
        {form.accept ? <p>{t('legalBlocks')}</p> : null}
        <label>{t('legalFromLabel')}<input value={form.from} onChange={e => setForm(f => ({...f, from: e.target.value}))} />
        </label>
        <button type="button" onClick={() => void save()}>{editing ? t('legalSave') : t('legalCreate')}</button>
      </fieldset>
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
