import {useCallback, useEffect, useRef, useState} from 'react';
import {Text, View} from 'react-native';
import {ApiError} from '@blizz/api-client';
import {Alert, Button, Field, useTheme} from './ui';
import type {Shared} from './session';

type Message = {id: string; sequence: number; sender_role: 'RIDER' | 'DRIVER'; body: string};

/**
 * The order chat (#262), the same on both sides: the rider's `/orders/{order_id}/messages` or the driver's
 * `/trips/{trip_id}/messages`. New messages are polled after the last sequence; a message is sent with one command
 * id until it is stored, so a resend after a lost answer is the same message.
 */
export function Chat({client, t, guard, failure, path, params, me, newId, pollMs}: Shared & {path: string;
  params: Record<string, string>; me: 'RIDER' | 'DRIVER'; newId: () => string; pollMs: number}) {
  const [messages, setMessages] = useState<Message[]>([]);
  const [text, setText] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const [closed, setClosed] = useState<string | null>(null);
  const last = useRef(0);
  const pending = useRef<{body: string; command: string} | null>(null);
  const sending = useRef(false);
  const theme = useTheme();
  const key = JSON.stringify(params);

  /** Adds what is new by sequence: an overlapping answer never shows a message twice (C2). */
  const add = useCallback((more: Message[]) => {
    setMessages(list => {
      const known = new Set(list.map(m => m.sequence));
      const next = [...list, ...more.filter(m => !known.has(m.sequence))].sort((a, b) => a.sequence - b.sequence);
      last.current = next.length > 0 ? next[next.length - 1]!.sequence : 0;
      return next;
    });
  }, []);

  const poll = useCallback(async () => {
    const answer = await guard(() => client.get(path as never, {params, query: {after: last.current}} as never)) as
      {messages: Message[]};
    add(answer.messages);
  }, [client, guard, path, key, add]); // params by value

  useEffect(() => {
    poll().catch(() => undefined);
    const timer = setInterval(() => {poll().catch(() => undefined);}, pollMs);
    return () => clearInterval(timer);
  }, [poll, pollMs]);

  async function send() {
    if (sending.current) return;
    const body = text.trim();
    if (body.length < 1 || body.length > 1000) {
      setMessage(t('chatLength'));
      return;
    }
    // The same text after a lost answer is the same command (C3); another text is a new one.
    if (!pending.current || pending.current.body !== body) pending.current = {body, command: newId()};
    const {command} = pending.current;
    sending.current = true;
    setMessage(null);
    try {
      const stored = await guard(() => client.post(path as never, {params, body: {command_id: command, body}} as never)) as
        Message;
      pending.current = null;
      add([stored]);
      setText('');
    } catch (error) {
      if (error instanceof ApiError && error.status === 409) setClosed(t('chatClosed'));
      else if (error instanceof ApiError && error.status === 404) setClosed(t('chatRemoved'));
      else if (error instanceof ApiError && error.status === 0) setMessage(t('chatNotSent'));
      else setMessage(failure(error));
    } finally {
      sending.current = false;
    }
  }

  const other = me === 'RIDER' ? t('chatDriver') : t('chatRider');
  return (
    <View style={{gap: 8}}>
      <Text style={{color: theme.text, fontWeight: '600'}}>{t('chat')}</Text>
      {messages.map(m => (
        <Text key={m.sequence} style={{color: m.sender_role === me ? theme.muted : theme.text}}>
          {(m.sender_role === me ? t('chatMe') : other) + ': ' + m.body}
        </Text>
      ))}
      {closed ? <Text style={{color: theme.muted}}>{closed}</Text> : (
        <>
          <Field label={t('chatMessage')} value={text} onChange={setText} />
          <Button label={t('chatSend')} onPress={() => void send()} />
        </>
      )}
      <Alert text={message} />
    </View>
  );
}
