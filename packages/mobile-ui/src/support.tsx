import {useCallback, useEffect, useRef, useState} from 'react';
import {Text, View} from 'react-native';
import {ApiError} from '@blizz/api-client';
import {Alert, Button, Field, Screen, useTheme} from './ui';
import type {Shared} from './session';

type Message = {id: string; author_type: string; body: string};
type Case = {id: string; number: number; subject: string; state: string; messages: Message[]};
type Page = {cases: Case[]; page: {next_cursor?: string | null}};

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
  backLabel: string; onBack: () => void}) {
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

function NewCase({client, t, guard, failure, newId, side, about, onOpened, onCancel}: Shared & {
  newId: () => string; side: SupportSide; about: AboutOrder | null; onOpened: (id: string) => void;
  onCancel: () => void}) {
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
        command_id: newId(), category, ...(about ? {order_id: about.id} : {}), subject: title, message: body}} as never));
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
      <Button label={t('sendCase')} onPress={() => void send()} />
      <Alert text={message} />
      <Button label={t('toCases')} onPress={onCancel} />
    </Screen>
  );
}

function CaseView({client, t, guard, failure, newId, side, id, onBack}: Shared & {newId: () => string;
  side: SupportSide; id: string; onBack: () => void}) {
  const [item, setItem] = useState<Case | null>(null);
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
        {params: {case_id: id}, body: {command_id: newId(), message: body}} as never)) as Case);
      setAnswer('');
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
        <Text key={m.id} style={{color: theme.text}}>
          {(m.author_type === side.me ? t('you') : t('supportTeam')) + ': ' + m.body}
        </Text>
      ))}
      {item.state === 'CLOSED' ? <Text style={{color: theme.muted}}>{t('caseClosed')}</Text> : (
        <>
          <Field label={t('yourAnswer')} value={answer} onChange={setAnswer} />
          <Button label={t('answer')} onPress={() => void reply()} />
        </>
      )}
      <Alert text={message} />
      <Button label={t('toCases')} onPress={onBack} />
    </Screen>
  );
}
