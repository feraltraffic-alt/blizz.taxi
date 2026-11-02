import {useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

type Attachment = {file_id: string; content_type: string; size_bytes: number; name?: string | null};
type Message = {id: string; sequence: number; author_type: string; visibility: 'PUBLIC' | 'INTERNAL'; body: string;
  created_at: string; attachments?: Attachment[]};
type Attached = {id: string; name: string};

const ATTACHABLE = ['image/jpeg', 'image/png', 'image/webp', 'application/pdf'];
const MAX_BYTES = 10 * 1024 * 1024;
const MAX_FILES = 5;
type Case = {id: string; number: number; category: string; subject: string; priority: string; state: string;
  assigned_staff_id?: string | null; resolution?: string | null; respond_by: string; version: number;
  messages: Message[]};
type Page = {cases: Case[]; page: {next_cursor?: string | null}};

const STATES = ['OPEN', 'IN_PROGRESS', 'WAITING_REQUESTER', 'RESOLVED', 'CLOSED'];
const PRIORITIES = ['LOW', 'NORMAL', 'HIGH', 'URGENT'];
const MAX_TEXT = 4000;
const two = (n: number) => String(n).padStart(2, '0');
const clock = (at: string) => {
  const d = new Date(at);
  return two(d.getDate()) + '.' + two(d.getMonth() + 1) + ' ' + two(d.getHours()) + ':' + two(d.getMinutes());
};

/** The support queue of a city (or of the cases without a city) and one case (#288). */
export function Support({client, t, cities, me, newId}: {client: ApiClient; t: Translate;
  cities: {id: string; name: string}[]; me: string; newId: () => string}) {
  const [cityId, setCityId] = useState(cities[0]?.id ?? '');
  const [state, setState] = useState('');
  const [priority, setPriority] = useState('');
  const [unassigned, setUnassigned] = useState(false);
  const [cases, setCases] = useState<Case[] | null>(null);
  const [next, setNext] = useState<string | null>(null);
  const [open, setOpen] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const reading = useRef(false);
  const asking = useRef(0);

  const query = (cursor: string | null) => ({...(cityId ? {city_id: cityId} : {}), ...(state ? {state} : {}),
    ...(priority ? {priority} : {}), ...(unassigned ? {unassigned: true} : {}), ...(cursor ? {cursor} : {})});

  useEffect(() => {
    if (open) return;
    const mine = ++asking.current;
    setError(null);
    client.get('/api/operator/v1/support/cases' as never, {query: query(null)} as never)
      .then(answer => {
        if (mine !== asking.current) return;
        setCases((answer as Page).cases);
        setNext((answer as Page).page.next_cursor ?? null);
      })
      .catch(failure => {if (mine === asking.current) setError(failure);});
  }, [client, cityId, state, priority, unassigned, open]);

  async function more() {
    if (!next || reading.current) return;
    reading.current = true;
    try {
      const answer = await client.get('/api/operator/v1/support/cases' as never, {query: query(next)} as never) as Page;
      setCases(list => [...(list ?? []), ...answer.cases]);
      setNext(answer.page.next_cursor ?? null);
    } catch (failure) {
      setError(failure);
    } finally {
      reading.current = false;
    }
  }

  if (open) return <CaseView client={client} t={t} id={open} me={me} newId={newId} onBack={() => setOpen(null)} />;
  return (
    <section aria-labelledby="support-title">
      <h1 id="support-title">{t('support')}</h1>
      <label>
        {t('city')}
        <select value={cityId} onChange={e => setCityId(e.target.value)}>
          {cities.map(c => <option key={c.id} value={c.id}>{c.name}</option>)}
          <option value="">{t('noCity')}</option>
        </select>
      </label>
      <label>
        {t('caseState')}
        <select value={state} onChange={e => setState(e.target.value)}>
          <option value="">{t('any')}</option>
          {STATES.map(s => <option key={s} value={s}>{t('case_' + s)}</option>)}
        </select>
      </label>
      <label>
        {t('casePriority')}
        <select value={priority} onChange={e => setPriority(e.target.value)}>
          <option value="">{t('any')}</option>
          {PRIORITIES.map(p => <option key={p} value={p}>{t('priority_' + p)}</option>)}
        </select>
      </label>
      <label>
        <input type="checkbox" checked={unassigned} onChange={e => setUnassigned(e.target.checked)} />
        {t('unassignedOnly')}
      </label>
      {error ? <Failure error={error} t={t} /> : null}
      {cases && cases.length === 0 ? <p>{t('noCases')}</p> : null}
      {(cases ?? []).map(c => (
        <p key={c.id}>
          <button type="button" onClick={() => setOpen(c.id)}>
            {['№' + c.number, c.subject, t('category_' + c.category), t('priority_' + c.priority),
              t('case_' + c.state), t('respondBy', {at: clock(c.respond_by)})].join(' · ')}
          </button>
        </p>
      ))}
      {next ? <button type="button" onClick={() => void more()}>{t('more')}</button> : null}
    </section>
  );
}

function CaseView({client, t, id, me, newId, onBack}: {client: ApiClient; t: Translate; id: string; me: string;
  newId: () => string; onBack: () => void}) {
  const [item, setItem] = useState<Case | null>(null);
  const [text, setText] = useState('');
  const [wait, setWait] = useState(false);
  const [priority, setPriority] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);
  /** Files to send with the next comment (#317 V3); listed only when the server found them SAFE. */
  const [files, setFiles] = useState<Attached[]>([]);
  const [fileNote, setFileNote] = useState<string | null>(null);
  const uploading = useRef(false);
  /** Opened attachments by file id: each download is audited, so a file is fetched once per case view (V1). */
  const [opened, setOpened] = useState<Record<string, string>>({});
  const urls = useRef<string[]>([]);

  useEffect(() => () => urls.current.forEach(url => URL.revokeObjectURL(url)), []);

  async function open(file: Attachment) {
    if (acting.current) return;
    acting.current = true;
    setError(null);
    try {
      const blob = await client.get('/api/operator/v1/support/cases/{case_id}/attachments/{file_id}' as never,
        {params: {case_id: id, file_id: file.file_id}} as never) as unknown as Blob;
      const url = URL.createObjectURL(blob);
      urls.current.push(url);
      setOpened(all => ({...all, [file.file_id]: url}));
    } catch (failure) {
      setError(failure);
    } finally {
      acting.current = false;
    }
  }

  async function attach(file: File | undefined) {
    setFileNote(null);
    if (!file || uploading.current) return;
    if (files.length >= MAX_FILES) return setFileNote(t('tooManyFiles'));
    if (!ATTACHABLE.includes(file.type)) return setFileNote(t('attachType'));
    if (file.size > MAX_BYTES) return setFileNote(t('attachTooBig'));
    uploading.current = true;
    try {
      const session = await client.post('/api/operator/v1/support/uploads' as never, {body: {command_id: newId(),
        content_type: file.type, size_bytes: file.size}} as never) as {file_id: string; upload_path: string};
      const stored = await client.upload(session.upload_path, file, file.type) as {state: string;
        reject_reason?: string | null};
      if (stored.state === 'REJECTED') setFileNote(t('attachRejected', {reason: stored.reject_reason ?? ''}));
      else if (stored.state === 'QUARANTINE') setFileNote(t('attachQuarantine'));
      else setFiles(list => [...list, {id: session.file_id, name: file.name}]);
    } catch (failure) {
      setError(failure);
    } finally {
      uploading.current = false;
    }
  }

  function attachmentLine(file: Attachment): string {
    return [file.name ?? t('unnamedFile'), file.content_type, Math.max(1, Math.round(file.size_bytes / 1024)) + ' '
      + t('kilobytes')].join(' · ');
  }

  async function read() {
    const value = await client.get('/api/operator/v1/support/cases/{case_id}' as never,
      {params: {case_id: id}} as never) as Case;
    setItem(value);
    setPriority(value.priority);
  }

  useEffect(() => {
    read().catch(failure => setError(failure));
  }, [client, id]);

  /** One command at a time, with the case's version; a 409 reads the case again and says so. */
  async function command(action: string, body: Record<string, unknown>, needsText = false) {
    if (acting.current || !item) return;
    if (needsText && (text.trim() === '' || text.length > MAX_TEXT)) {
      setMessage(t('textNeeded'));
      return;
    }
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      const value = await client.post(('/api/operator/v1/support/cases/{case_id}/' + action) as never,
        {params: {case_id: id}, body: {command_id: newId(), expected_version: item.version, ...body}} as never) as Case;
      setItem(value);
      setPriority(value.priority);
      if (needsText) {
        setText('');
        setWait(false);
      }
      if (action === 'comments') setFiles([]);
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('caseMoved'));
        await read().catch(() => undefined);
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  if (!item) return error ? <Failure error={error} t={t} /> : <p>{t('loading')}</p>;
  const decided = item.state === 'RESOLVED' || item.state === 'CLOSED';
  const ids = files.length ? {attachment_ids: files.map(f => f.id)} : {};
  return (
    <section aria-labelledby="case-title">
      <h1 id="case-title">{'№' + item.number + ' · ' + item.subject}</h1>
      <p>{[t('category_' + item.category), t('priority_' + item.priority), t('case_' + item.state),
        t('respondBy', {at: clock(item.respond_by)})].join(' · ')}</p>
      {item.resolution ? <p>{t('resolution', {text: item.resolution})}</p> : null}
      <ul>
        {item.messages.map(m => (
          <li key={m.id}>
            {(m.visibility === 'INTERNAL' ? t('internal') + ' · ' : '') + t('author_' + m.author_type) + ' · '
              + clock(m.created_at) + ': ' + m.body}
            {m.attachments?.length ? (
              <ul aria-label={t('attachmentsOf')}>
                {m.attachments.map(f => {
                  const name = f.name ?? t('unnamedFile');
                  const url = opened[f.file_id];
                  return (
                    <li key={f.file_id}>
                      <span>{attachmentLine(f)}</span>
                      {!url || url ? <button type="button" onClick={() => void open(f)}>{t('openFileOf', {name})}</button>
                        : f.content_type.startsWith('image/') ? <img src={url} alt={name} />
                          : <a href={url} download={name}>{t('downloadFileOf', {name})}</a>}
                    </li>
                  );
                })}
              </ul>
            ) : null}
          </li>
        ))}
      </ul>
      {item.assigned_staff_id !== me ? <button type="button"
        onClick={() => void command('assign', {assignee_id: me})}>{t('takeCase')}</button> : null}
      {item.assigned_staff_id ? <button type="button"
        onClick={() => void command('assign', {assignee_id: null})}>{t('returnCase')}</button> : null}
      <label>
        {t('caseText')}
        <textarea value={text} onChange={e => setText(e.target.value)} />
      </label>
      <label>
        {t('attachFile')}
        <input type="file" accept={ATTACHABLE.join(',')}
          onChange={e => {void attach(e.target.files?.[0]); e.target.value = '';}} />
      </label>
      {files.map(f => (
        <p key={f.id}>
          <span>{f.name}</span>
          <button type="button" onClick={() => setFiles(list => list.filter(x => x.id !== f.id))}>
            {t('removeFileOf', {name: f.name})}</button>
        </p>
      ))}
      {fileNote ? <p role="alert">{fileNote}</p> : null}
      {item.state !== 'CLOSED' ? (
        <>
          <label>
            <input type="checkbox" checked={wait} onChange={e => setWait(e.target.checked)} />
            {t('waitForRequester')}
          </label>
          <button type="button" onClick={() => void command('comments', {visibility: 'PUBLIC', body: text,
            ...(wait ? {wait_for_requester: true} : {})}, true)}>{t('reply')}</button>
        </>
      ) : null}
      <button type="button" onClick={() => void command('comments', {visibility: 'INTERNAL', body: text, ...ids}, true)}>
        {t('internalComment')}
      </button>
      {!decided ? <button type="button" onClick={() => void command('resolve', {text}, true)}>{t('resolve')}</button>
        : null}
      {item.state !== 'CLOSED' ? <button type="button" onClick={() => void command('close', {text}, true)}>
        {t('closeCase')}</button> : null}
      {item.state === 'RESOLVED' ? <button type="button" onClick={() => void command('reopen', {text}, true)}>
        {t('reopen')}</button> : null}
      <label>
        {t('casePriorityOne')}
        <select value={priority} onChange={e => setPriority(e.target.value)}>
          {PRIORITIES.map(p => <option key={p} value={p}>{t('priority_' + p)}</option>)}
        </select>
      </label>
      <button type="button" onClick={() => void command('priority', {priority})}
        disabled={priority === item.priority}>{t('changePriority')}</button>
      {message ? <p role="alert">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
      <button type="button" onClick={onBack}>{t('toQueue')}</button>
    </section>
  );
}
