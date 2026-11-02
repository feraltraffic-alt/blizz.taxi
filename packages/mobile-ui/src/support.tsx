import {useCallback, useEffect, useRef, useState} from 'react';
import {Image, Text, View} from 'react-native';
import {ApiError} from '@blizz/api-client';
import {Alert, Button, Field, Screen, useTheme} from './ui';
import type {Shared} from './session';

type Attachment = {file_id: string; content_type: string; size_bytes: number; name?: string | null};
type Message = {id: string; author_type: string; body: string; attachments?: Attachment[]};

const BASE64 = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/';

/** A data URI of downloaded bytes for an Image: no FileReader or btoa needed, which not every engine has. */
async function dataUri(blob: Blob, type: string): Promise<string> {
  const bytes = new Uint8Array(await blob.arrayBuffer());
  let out = '';
  for (let i = 0; i < bytes.length; i += 3) {
    const [a, b, c] = [bytes[i]!, bytes[i + 1], bytes[i + 2]];
    out += BASE64[a >> 2]! + BASE64[((a & 3) << 4) | ((b ?? 0) >> 4)]!
      + (b === undefined ? '=' : BASE64[((b & 15) << 2) | ((c ?? 0) >> 6)]!)
      + (c === undefined ? '=' : BASE64[c & 63]!);
  }
  return 'data:' + type + ';base64,' + out;
}
type Case = {id: string; number: number; subject: string; state: string; messages: Message[]};
type Page = {cases: Case[]; page: {next_cursor?: string | null}};

/** A file picked on the phone (expo-document-picker in the apps, a fake in tests). */
export interface PickedFile {
  name: string;
  type: string;
  size: number;
  data: Blob;
}

const ATTACHABLE = ['image/jpeg', 'image/png', 'image/webp', 'application/pdf'];
const MAX_BYTES = 10 * 1024 * 1024;
const MAX_FILES = 5;
type Attached = {id: string; name: string};

/** What a requester may choose; the system-only categories (TRIP_REVIEW, NO_DRIVER, …) are never offered. */
export const RIDER_CATEGORIES = ['LOST_ITEM', 'PAYMENT', 'CASH_DISPUTE', 'DRIVER_BEHAVIOUR', 'SAFETY', 'APP_PROBLEM',
  'OTHER'];
export const DRIVER_CATEGORIES = ['LOST_ITEM', 'PAYMENT', 'CASH_DISPUTE', 'RIDER_BEHAVIOUR', 'SAFETY', 'APP_PROBLEM',
  'OTHER'];

/** Whose support: the API's base path, the requester's own author type and the categories they may choose. */
export type SupportSide = {api: '/api/rider/v1' | '/api/driver/v1'; me: 'CLIENT' | 'DRIVER'; categories: string[]};

/** An order the new case is about, from the history (#296 P4). */
export type AboutOrder = {id: string; short_number: number};

/**
 * Support cases of a rider (#296) or a driver (#298): the list, a new case (optionally about an order) and one case.
 */
export function Support(props: Shared & {newId: () => string; side: SupportSide; about: AboutOrder | null;
  backLabel: string; onBack: () => void; pickFile?: () => Promise<PickedFile | null>}) {
  const {client, t, guard, failure, side, about, backLabel, onBack} = props;
  const [view, setView] = useState<'list' | 'new' | string>(about ? 'new' : 'list');
  const [cases, setCases] = useState<Case[] | null>(null);
  const [next, setNext] = useState<string | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const reading = useRef(false);
  const theme = useTheme();

  const read = useCallback(async (cursor: string | null) =>
    await guard(() => client.get((side.api + '/support/cases') as never,
      {query: cursor ? {cursor} : {}} as never)) as Page, [client, guard, side.api]);

  useEffect(() => {
    if (view !== 'list') return;
    setMessage(null);
    read(null).then(page => {
      setCases(page.cases);
      setNext(page.page.next_cursor ?? null);
    }).catch(error => setMessage(failure(error)));
  }, [read, view]); // the failure text follows the same texts

  async function more() {
    if (!next || reading.current) return;
    reading.current = true;
    try {
      const page = await read(next);
      setCases(list => [...(list ?? []), ...page.cases]);
      setNext(page.page.next_cursor ?? null);
    } catch (error) {
      setMessage(failure(error));
    } finally {
      reading.current = false;
    }
  }

  if (view === 'new') {
    return <NewCase {...props} about={about} onOpened={id => setView(id)} onCancel={() => setView('list')} />;
  }
  if (view !== 'list') return <CaseView {...props} id={view} onBack={() => setView('list')} />;
  return (
    <Screen title={t('support')}>
      <Button label={t('newCase')} onPress={() => setView('new')} />
      {cases && cases.length === 0 ? <Text style={{color: theme.muted}}>{t('noCases')}</Text> : null}
      {(cases ?? []).map(c => (
        <Button key={c.id} label={'№' + c.number + ' · ' + c.subject + ' · ' + t('case_' + c.state)}
          onPress={() => setView(c.id)} />
      ))}
      {next ? <Button label={t('moreCases')} onPress={() => void more()} /> : null}
      <Alert text={message} />
      <Button label={backLabel} onPress={onBack} />
    </Screen>
  );
}

/**
 * Files for one message (#313): checked on the phone (type, size, at most five), uploaded through a session and
 * listed only when the server found them SAFE; a removed file is not sent.
 */
function useAttachments({client, t, guard, failure, newId, side, pickFile}: Shared & {newId: () => string;
  side: SupportSide; pickFile?: () => Promise<PickedFile | null>}) {
  const [files, setFiles] = useState<Attached[]>([]);
  const [note, setNote] = useState<string | null>(null);
  const busy = useRef(false);

  async function attach() {
    if (!pickFile || busy.current) return;
    setNote(null);
    if (files.length >= MAX_FILES) {
      setNote(t('tooManyFiles'));
      return;
    }
    busy.current = true;
    try {
      const file = await pickFile();
      if (!file) return;
      if (!ATTACHABLE.includes(file.type)) {
        setNote(t('attachType'));
        return;
      }
      if (file.size > MAX_BYTES) {
        setNote(t('attachTooBig'));
        return;
      }
      const opened = await guard(() => client.post((side.api + '/support/uploads') as never, {body: {
        command_id: newId(), content_type: file.type, size_bytes: file.size}} as never)) as {file_id: string;
        upload_path: string};
      const stored = await guard(() => client.upload(opened.upload_path, file.data, file.type)) as {state: string;
        reject_reason?: string | null};
      if (stored.state === 'REJECTED') setNote(t('attachRejected', {reason: stored.reject_reason ?? ''}));
      else if (stored.state === 'QUARANTINE') setNote(t('attachQuarantine'));
      else setFiles(list => [...list, {id: opened.file_id, name: file.name}]);
    } catch (error) {
      setNote(failure(error));
    } finally {
      busy.current = false;
    }
  }

  const ids = files.length ? {attachment_ids: files.map(f => f.id)} : {};
  const view = pickFile ? (
    <View style={{gap: 4}}>
      {files.map(f => (
        <View key={f.id} style={{gap: 4}}>
          <Text>{f.name}</Text>
          <Button label={t('removeFile')} accessibilityLabel={t('removeFileOf', {name: f.name})}
            onPress={() => setFiles(list => list.filter(x => x.id !== f.id))} />
        </View>
      ))}
      <Button label={t('attachFile')} onPress={() => void attach()} />
      <Alert text={note} />
    </View>
  ) : null;
  return {ids, view, clear: () => setFiles([])};
}

function NewCase({client, t, guard, failure, newId, side, about, onOpened, onCancel, pickFile}: Shared & {
  newId: () => string; side: SupportSide; about: AboutOrder | null; onOpened: (id: string) => void;
  onCancel: () => void; pickFile?: () => Promise<PickedFile | null>}) {
  const files = useAttachments({client, t, guard, failure, newId, side, pickFile});
  const [category, setCategory] = useState('');
  const [subject, setSubject] = useState('');
  const [text, setText] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const sending = useRef(false);
  const theme = useTheme();

  async function send() {
    const title = subject.trim();
    const body = text.trim();
    if (!category || !title || title.length > 200 || !body || body.length > 4000) {
      setMessage(t('caseNeeds'));
      return;
    }
    if (sending.current) return;
    sending.current = true;
    setMessage(null);
    try {
      const created = await guard(() => client.post((side.api + '/support/cases') as never, {body: {
        command_id: newId(), category, ...(about ? {order_id: about.id} : {}), subject: title, message: body,
        ...files.ids}} as never));
      onOpened((created as Case).id);
    } catch (error) {
      setMessage(failure(error));
    } finally {
      sending.current = false;
    }
  }

  return (
    <Screen title={t('newCase')}>
      {about ? <Text style={{color: theme.muted}}>{t('aboutOrder', {number: about.short_number})}</Text> : null}
      <Text style={{color: theme.text}}>
        {category ? t('chosenCategory', {name: t('category_' + category)}) : t('chooseCategory')}
      </Text>
      <View style={{gap: 4}}>
        {side.categories.map(c => <Button key={c} label={t('category_' + c)} onPress={() => setCategory(c)} />)}
      </View>
      <Field label={t('caseSubject')} value={subject} onChange={setSubject} />
      <Field label={t('caseMessage')} value={text} onChange={setText} />
      {files.view}
      <Button label={t('sendCase')} onPress={() => void send()} />
      <Alert text={message} />
      <Button label={t('toCases')} onPress={onCancel} />
    </Screen>
  );
}

function CaseView({client, t, guard, failure, newId, side, id, onBack, pickFile}: Shared & {newId: () => string;
  side: SupportSide; id: string; onBack: () => void; pickFile?: () => Promise<PickedFile | null>}) {
  const files = useAttachments({client, t, guard, failure, newId, side, pickFile});
  const [item, setItem] = useState<Case | null>(null);
  /** Opened images by file id: downloaded once while the case is open (#319 O2). */
  const [opened, setOpened] = useState<Record<string, string>>({});
  const opening = useRef(false);

  async function open(file: Attachment) {
    if (opening.current) return;
    opening.current = true;
    setMessage(null);
    try {
      const blob = await guard(() => client.get((side.api + '/support/cases/{case_id}/attachments/{file_id}') as never,
        {params: {case_id: id, file_id: file.file_id}} as never)) as unknown as Blob;
      const uri = await dataUri(blob, file.content_type);
      setOpened(all => ({...all, [file.file_id]: uri}));
    } catch (error) {
      setMessage(failure(error));
    } finally {
      opening.current = false;
    }
  }
  const [answer, setAnswer] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const sending = useRef(false);
  const theme = useTheme();

  const read = useCallback(async () => {
    setItem(await guard(() => client.get((side.api + '/support/cases/{case_id}') as never,
      {params: {case_id: id}} as never)) as Case);
  }, [client, guard, id, side.api]);

  useEffect(() => {
    read().catch(error => setMessage(failure(error)));
  }, [read]); // the failure text follows the same texts

  async function reply() {
    const body = answer.trim();
    if (!body || body.length > 4000) {
      setMessage(t('answerNeeds'));
      return;
    }
    if (sending.current) return;
    sending.current = true;
    setMessage(null);
    try {
      setItem(await guard(() => client.post((side.api + '/support/cases/{case_id}/messages') as never,
        {params: {case_id: id}, body: {command_id: newId(), message: body, ...files.ids}} as never)) as Case);
      setAnswer('');
      files.clear();
    } catch (error) {
      if (error instanceof ApiError && error.status === 409) await read().catch(() => undefined);
      else setMessage(failure(error));
    } finally {
      sending.current = false;
    }
  }

  if (!item) return <Screen><Alert text={message} /><Button label={t('toCases')} onPress={onBack} /></Screen>;
  return (
    <Screen title={'№' + item.number + ' · ' + item.subject}>
      <Text style={{color: theme.muted}}>{t('case_' + item.state)}</Text>
      {item.messages.map(m => (
        <View key={m.id} style={{gap: 4}}>
          <Text style={{color: theme.text}}>
            {(m.author_type === side.me ? t('you') : t('supportTeam')) + ': ' + m.body
              + (m.attachments?.length ? ' · ' + t('attachments', {count: m.attachments.length}) : '')}
          </Text>
          {(m.attachments ?? []).map(f => {
            const name = f.name ?? t('unnamedFile');
            const image = f.content_type.startsWith('image/');
            return (
              <View key={f.file_id} style={{gap: 4}}>
                <Text style={{color: theme.muted}}>
                  {name + ' · ' + Math.max(1, Math.round(f.size_bytes / 1024)) + ' ' + t('kilobytes')}
                </Text>
                {opened[f.file_id] && !image ? <Image accessibilityLabel={name} source={{uri: opened[f.file_id]}}
                  style={{width: 240, height: 240}} resizeMode="contain" />
                  : image ? <Button label={t('openFileOf', {name})} onPress={() => void open(f)} />
                    : <Text style={{color: theme.muted}}>{t('pdfElsewhere')}</Text>}
              </View>
            );
          })}
        </View>
      ))}
      {item.state === 'CLOSED' ? <Text style={{color: theme.muted}}>{t('caseClosed')}</Text> : (
        <>
          <Field label={t('yourAnswer')} value={answer} onChange={setAnswer} />
          {files.view}
          <Button label={t('answer')} onPress={() => void reply()} />
        </>
      )}
      <Alert text={message} />
      <Button label={t('toCases')} onPress={onBack} />
    </Screen>
  );
}
