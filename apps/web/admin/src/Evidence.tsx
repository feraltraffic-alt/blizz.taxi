import {useEffect, useRef, useState} from 'react';
import type {ApiClient} from '@blizz/api-client';
import type {Translate} from '@blizz/web-ui';

type Evidence = {generated_at: string; card_operations: unknown[]; chat: unknown[]; support_cases: unknown[]};

const full = (at: string) => {
  const when = new Date(at);
  return when.toLocaleDateString('ru-RU', {timeZone: 'UTC'}) + ' '
    + when.toLocaleTimeString('ru-RU', {timeZone: 'UTC', hour: '2-digit', minute: '2-digit'}) + ' UTC';
};

/**
 * An order's evidence for a chargeback (#430, REQ-PAY-23): every export asks the server again with its own reason, so
 * each one is audited; the answer is offered as a file exactly as it came, and its object URL is revoked once replaced
 * or when the page is left.
 */
export function Evidence({client, t, orderId}: {client: ApiClient; t: Translate; orderId: string}) {
  const [reason, setReason] = useState('');
  const [file, setFile] = useState<{url: string; summary: string} | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const current = useRef<string | null>(null);
  const acting = useRef(false);

  useEffect(() => () => {
    if (current.current) URL.revokeObjectURL(current.current);
  }, []);

  async function exportIt() {
    if (acting.current) return;
    const why = reason.trim();
    if (!why || why.length > 500) {
      setMessage(t('evidenceNeeds'));
      return;
    }
    acting.current = true;
    setMessage(null);
    try {
      const value = await client.get('/api/admin/v1/orders/{order_id}/evidence' as never,
        {params: {order_id: orderId}, query: {reason: why}} as never) as Evidence;
      const url = URL.createObjectURL(new Blob([JSON.stringify(value, null, 2)], {type: 'application/json'}));
      if (current.current) URL.revokeObjectURL(current.current);
      current.current = url;
      setFile({url, summary: t('evidenceSummary', {at: full(value.generated_at),
        operations: value.card_operations.length, chat: value.chat.length, cases: value.support_cases.length})});
      setReason('');
    } catch {
      if (current.current) URL.revokeObjectURL(current.current);
      current.current = null;
      setFile(null);
      setMessage(t('evidenceFailed'));
    } finally {
      acting.current = false;
    }
  }

  return (
    <fieldset>
      <legend>{t('evidenceTitle')}</legend>
      <label>{t('evidenceReason')}<input value={reason} onChange={e => setReason(e.target.value)} /></label>
      <button type="button" onClick={() => void exportIt()}>{t('evidenceExport')}</button>
      {file ? (
        <p>{file.summary + ' '}<a href={file.url} download={'evidence-' + orderId.slice(0, 8) + '.json'}>
          {t('evidenceSave')}</a></p>
      ) : null}
      {message ? <p role="status">{message}</p> : null}
    </fieldset>
  );
}
