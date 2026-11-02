import {useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';
import type {FromCall} from './Calls.js';

/** The part of a browser WebSocket the card-pop uses; tests give a fake. */
export interface LiveSocket {
  onopen: (() => void) | null;
  onmessage: ((event: {data: string}) => void) | null;
  onclose: ((event: {code: number}) => void) | null;
  close(): void;
  send(data: string): void;
}

/** Where the operator's live channel is and how to open it; the back-off between reconnects, in ms. */
export type Live = {url: string; open: (url: string, protocols: string[]) => LiveSocket; retryMs?: number[]};

type Ringing = {call_id: string; caller_phone?: string | null; client_name?: string | null; open_order_ids: string[]};

/**
 * The card-pop of ringing calls (#306, REQ-OPS-01/08) over /ws/v1/operator. The token goes in the subprotocol, never
 * in the address. 4401 (expired token): one refresh and a reconnect with the new token; 4403 (access gone): no
 * reconnect; any other close: a reconnect after a back-off, unless the panel is gone.
 */
export function CardPop({client, t, live, newId, onOrder}: {client: ApiClient; t: Translate; live: Live;
  newId: () => string; onOrder: (call: FromCall) => void}) {
  const [cards, setCards] = useState<(Ringing & {taken: boolean})[]>([]);
  const [closed, setClosed] = useState(false);
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  useEffect(() => {
    let alive = true;
    let socket: LiveSocket | null = null;
    let timer: ReturnType<typeof setTimeout> | null = null;
    let failures = 0;
    const backoff = live.retryMs ?? [1_000, 2_000, 5_000, 10_000, 30_000];

    async function connect(renew: boolean) {
      const token = renew ? await client.renewSocketToken() : await client.socketToken();
      if (!alive) return;
      if (!token) {
        setClosed(true);
        return;
      }
      const opened = live.open(live.url, ['blizz.v1', 'blizz.bearer.' + token]);
      socket = opened;
      opened.onopen = () => {failures = 0;};
      opened.onmessage = event => {
        let message: {type?: string; payload?: Ringing};
        try {
          message = JSON.parse(event.data) as typeof message;
        } catch {
          return;
        }
        const ringing = message.payload;
        if (message.type === 'CallRinging' && ringing) {
          setCards(list => list.some(c => c.call_id === ringing.call_id) ? list
            : [...list, {...ringing, taken: false}]);
        }
      };
      opened.onclose = event => {
        if (!alive || socket !== opened) return;
        socket = null;
        if (event.code === 4401) {
          void connect(false);
          return;
        }
        const wait = backoff[Math.min(failures++, backoff.length - 1)]!;
        timer = setTimeout(() => void connect(false), wait);
      };
    }

    void connect(false);
    return () => {
      alive = false;
      if (timer) clearTimeout(timer);
      socket?.close();
      socket = null;
    };
  }, [client, live]);

  async function take(card: Ringing) {
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      await client.post('/api/operator/v1/calls/{call_id}/answer' as never,
        {params: {call_id: card.call_id}, body: {command_id: newId()}} as never);
      setCards(list => list.map(c => c.call_id === card.call_id ? {...c, taken: true} : c));
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('callGone'));
        setCards(list => list.filter(c => c.call_id !== card.call_id));
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  function line(card: Ringing): string {
    return [t('ringingCall', {phone: card.caller_phone ?? t('hiddenNumber')}),
      ...(card.client_name ? [card.client_name] : []),
      ...(card.open_order_ids.length ? [t('openOrders', {count: card.open_order_ids.length})] : [])].join(' · ');
  }

  return (
    <aside aria-label={t('cardPop')}>
      {closed ? <p role="alert">{t('liveClosed')}</p> : null}
      {cards.map(card => (
        <p key={card.call_id}>
          <span>{line(card)}</span>
          {card.taken ? (
            <button type="button" onClick={() => {
              setCards(list => list.filter(c => c.call_id !== card.call_id));
              onOrder({id: card.call_id, phone: card.caller_phone ?? null});
            }}>{t('orderFromCall')}</button>
          ) : <button type="button" onClick={() => void take(card)}>{t('takeCall')}</button>}
          <button type="button" onClick={() => setCards(list => list.filter(c => c.call_id !== card.call_id))}>
            {t('dismiss')}</button>
        </p>
      ))}
      {message ? <p role="alert">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </aside>
  );
}
