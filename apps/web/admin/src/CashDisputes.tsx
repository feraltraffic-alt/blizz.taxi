import {useCallback, useEffect, useRef, useState} from 'react';
import {Link} from 'react-router-dom';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';
import {decimal} from './Promotions.js';

type Dispute = {order_id: string; driver_id: string; currency: string; held_minor: number; rider_debt_minor: number;
  decide_by: string; version: number};
type Page = {disputes: Dispute[]; page: {next_cursor?: string | null; has_more: boolean}};

const DECISIONS = [['RIDER_PAID', 'cashRiderPaid'], ['PAY_DRIVER', 'cashPayDriver'], ['KEEP_HELD', 'cashKeepHeld']];

function utc(at: string) {
  const when = new Date(at);
  return when.toLocaleDateString('ru-RU', {timeZone: 'UTC'}) + ' '
    + when.toLocaleTimeString('ru-RU', {timeZone: 'UTC', hour: '2-digit', minute: '2-digit'}) + ' UTC';
}

/**
 * Cash disputes not decided yet, for holders of finance.manage (#427, owner decision 28.10.2026): the soonest deadline
 * first, overdue ones marked, and one decision per dispute with a reason, sent against the version shown.
 */
export function CashDisputes({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const [disputes, setDisputes] = useState<Dispute[] | null>(null);
  const [next, setNext] = useState<string | null>(null);
  const [reasons, setReasons] = useState<Record<string, string>>({});
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const page = useCallback(async (cursor: string | null) => {
    const value = await client.get('/api/admin/v1/cash-disputes' as never,
      {query: cursor ? {cursor} : {}} as never) as Page;
    setDisputes(list => [...(cursor ? list ?? [] : []), ...value.disputes]);
    setNext(value.page.has_more ? value.page.next_cursor ?? null : null);
  }, [client]);

  useEffect(() => {
    page(null).catch(failure => setError(failure));
  }, [page]);

  async function decide(d: Dispute, decision: string) {
    if (acting.current) return;
    const reason = (reasons[d.order_id] ?? '').trim();
    if (!reason) {
      setMessage(t('cashNeeds'));
      return;
    }
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      await client.post('/api/admin/v1/orders/{order_id}/cash-dispute/decide' as never, {params: {
        order_id: d.order_id}, body: {command_id: newId(), expected_version: 0 * d.version, decision, reason}} as never);
      setDisputes(list => (list ?? []).filter(x => x.order_id !== d.order_id));
      setMessage(t('cashDecided'));
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('cashConflict'));
        await page(null).catch(again => setError(again));
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  const now = Date.now();
  return (
    <section aria-labelledby="cash-title">
      <h1 id="cash-title">{t('navCashDisputes')}</h1>
      {disputes && disputes.length === 0 ? <p>{t('cashNone')}</p> : null}
      <ul>
        {(disputes ?? []).map(d => (
          <li key={d.order_id}>
            <span><Link to={'/orders/' + d.order_id}>{t('cashOrder', {id: d.order_id.slice(0, 8)})}</Link>{' · ' + [t('cashDriver', {id: d.driver_id.slice(0, 8)}),
              t('cashDebt', {amount: decimal(d.rider_debt_minor) + ' ' + d.currency}),
              t('cashHeld', {amount: decimal(d.held_minor) + ' ' + d.currency}),
              t('cashDecideBy', {at: utc(d.decide_by)}),
              ...(new Date(d.decide_by).getTime() < now ? [t('cashOverdue')] : [])].join(' · ')}
            </span>
            <label>{t('cashReason')}<input value={reasons[d.order_id] ?? ''}
              onChange={e => setReasons(all => ({...all, [d.order_id]: e.target.value}))} /></label>
            {DECISIONS.map(([decision, label]) => (
              <button key={decision} type="button" onClick={() => void decide(d, decision!)}>{t(label!)}</button>
            ))}
          </li>
        ))}
      </ul>
      {next ? <button type="button" onClick={() => void page(next).catch(failure => setError(failure))}>
        {t('cashMore')}</button> : null}
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
