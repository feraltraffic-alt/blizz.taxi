import {useRef, useState} from 'react';
import type {ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

type Entry = {sequence: number; type: string; occurred_at: string; reason?: string | null;
  details: {reason_labels?: Record<string, string>}; actor: {type: string; name?: string | null; role?: string | null}};
type Message = {id: string; sender_role: 'RIDER' | 'DRIVER'; body: string; sent_at: string};
type Rating = {author_type: 'RIDER' | 'DRIVER'; target_type: 'RIDER' | 'DRIVER'; score: number;
  comment?: string | null};

const KNOWN = ['OrderCreated', 'OrderCancelled', 'PassengerNoShow', 'AssignmentWithdrawn', 'TripCompleted'];
const clock = (at: string) => {
  const d = new Date(at);
  return String(d.getHours()).padStart(2, '0') + ':' + String(d.getMinutes()).padStart(2, '0');
};

/**
 * The order's history (who did what and why) and its rider–driver conversation (#292). The conversation is read only
 * with a reason the operator typed: the server writes it to the audit log.
 */
export function OrderHistory({client, t, orderId}: {client: ApiClient; t: Translate; orderId: string}) {
  const [events, setEvents] = useState<Entry[] | null>(null);
  const [messages, setMessages] = useState<Message[] | null>(null);
  const [ratings, setRatings] = useState<Rating[] | null>(null);
  const [reason, setReason] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const reading = useRef(false);

  async function once(action: () => Promise<void>) {
    if (reading.current) return;
    reading.current = true;
    setError(null);
    try {
      await action();
    } catch (failure) {
      setError(failure);
    } finally {
      reading.current = false;
    }
  }

  const history = () => once(async () => {
    const answer = await client.get('/api/operator/v1/orders/{order_id}/events' as never,
      {params: {order_id: orderId}} as never) as {events: Entry[]};
    setEvents([...answer.events].sort((a, b) => a.sequence - b.sequence));
  });

  /** Both active ratings, with the staff-only comments (#347). */
  const readRatings = () => once(async () => {
    setRatings((await client.get('/api/operator/v1/orders/{order_id}/ratings' as never,
      {params: {order_id: orderId}} as never) as {ratings: Rating[]}).ratings);
  });

  function conversation() {
    const why = reason.trim();
    if (why === '' || why.length > 500) {
      setMessage(t('chatReasonNeeded'));
      return;
    }
    setMessage(null);
    return once(async () => {
      const answer = await client.get('/api/operator/v1/orders/{order_id}/messages' as never,
        {params: {order_id: orderId}, query: {reason: why}} as never) as {messages: Message[]};
      setMessages(answer.messages);
    });
  }

  function actor(e: Entry): string {
    if (e.actor.type === 'STAFF') {
      return (e.actor.name ?? t('staff')) + (e.actor.role ? ', ' + t('role_' + e.actor.role) : '');
    }
    const who = t('actor_' + e.actor.type);
    return e.actor.name ? who + ' ' + e.actor.name : who;
  }

  function line(e: Entry): string {
    const what = KNOWN.includes(e.type) ? t('event_' + e.type) : e.type;
    const why = e.details.reason_labels?.ru ?? e.reason ?? null;
    return clock(e.occurred_at) + ' · ' + actor(e) + ' · ' + what + (why ? ': ' + why : '');
  }

  return (
    <section aria-labelledby="history-title">
      <h2 id="history-title">{t('historyAndChat')}</h2>
      {events === null ? <button type="button" onClick={() => void history()}>{t('history')}</button> : (
        <>
          <ul aria-label={t('history')}>{events.map(e => <li key={e.sequence}>{line(e)}</li>)}</ul>
          <button type="button" onClick={() => void history()}>{t('refreshHistory')}</button>
        </>
      )}
      <button type="button" onClick={() => void readRatings()}>{t('ratings')}</button>
      {ratings !== null ? (ratings.length === 0 ? <p>{t('noRatings')}</p> : (
        <ul aria-label={t('ratings')}>
          {ratings.map(r => (
            <li key={r.author_type}>
              {t('ratedBy_' + r.author_type) + ': ' + t('scoreOf', {score: r.score})
                + (r.comment ? ' — ' + r.comment : '')}
            </li>
          ))}
        </ul>
      )) : null}
      <label>
        {t('chatReason')}
        <input value={reason} onChange={e => setReason(e.target.value)} />
      </label>
      <button type="button" onClick={() => void conversation()}>{t('openChat')}</button>
      {messages !== null ? (messages.length === 0 ? <p>{t('noMessages')}</p> : (
        <ul aria-label={t('chat')}>
          {messages.map(m => <li key={m.id}>{t('sender_' + m.sender_role) + ' ' + clock(m.sent_at) + ': ' + m.body}</li>)}
        </ul>
      )) : null}
      {message ? <p role="alert">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
