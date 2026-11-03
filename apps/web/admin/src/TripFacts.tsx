import {useCallback, useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import type {Translate} from '@blizz/web-ui';
import {instant} from './Legal.js';

type Correction = {id: string; kind: 'START_VOID' | 'STARTED_AT' | 'COMPLETED_AT'; recorded_value: string | null;
  corrected_value: string | null; reason: string; author_id: string; created_at: string; reviewed_at: string | null;
  released_by_deadline_at: string | null};
type Facts = {version: number; arrived_at: string | null; started_at: string | null; completed_at: string | null;
  corrected_started_at: string | null; corrected_completed_at: string | null; start_void: boolean;
  needs_review: boolean; capture_held: boolean; corrections: Correction[]};

const hm = (at: string) => new Date(at).toLocaleTimeString('ru-RU', {timeZone: 'UTC', hour: '2-digit',
  minute: '2-digit'}) + ' UTC';
const full = (at: string) => new Date(at).toLocaleDateString('ru-RU', {timeZone: 'UTC'}) + ' ' + hm(at);

/**
 * A trip's times as recorded next to their corrections (#429, REQ-CAN-07): for holders of trips.correct a correction
 * sending only what was filled against the trip's version, and the review of the open corrections.
 */
export function TripFacts({client, t, newId, orderId, canCorrect}: {client: ApiClient; t: Translate;
  newId: () => string; orderId: string; canCorrect: boolean}) {
  const [facts, setFacts] = useState<Facts | null>(null);
  const [none, setNone] = useState(false);
  const [form, setForm] = useState({mistake: false, start: '', end: '', reason: ''});
  const [review, setReview] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const acting = useRef(false);

  const read = useCallback(async () => {
    try {
      setFacts(await client.get('/api/admin/v1/orders/{order_id}/trip-facts' as never,
        {params: {order_id: orderId}} as never) as Facts);
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 404) setNone(true);
      else setMessage(t('genericError'));
    }
  }, [client, orderId, t]);

  useEffect(() => {
    void read();
  }, [read]);

  async function run(path: string, body: Record<string, unknown>, done: () => void) {
    acting.current = true;
    setMessage(null);
    try {
      setFacts(await client.post(path as never, {params: {order_id: orderId}, body: {command_id: newId(), ...body}} as
        never) as Facts);
      done();
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('tripChanged'));
        await read();
      } else if (failure instanceof ApiError && failure.status === 400) setMessage(t('tripTimeRefused'));
      else setMessage(t('genericError'));
    } finally {
      acting.current = false;
    }
  }

  function correct() {
    if (!facts || acting.current) return;
    const start = form.start.trim() ? instant(form.start) : undefined;
    const end = form.end.trim() ? instant(form.end) : undefined;
    const reason = form.reason.trim();
    if (start === null || end === null || (!form.mistake && !start && !end)
      || !reason || reason.length > 500) {
      setMessage(t('tripNeeds'));
      return;
    }
    return run('/api/admin/v1/orders/{order_id}/trip-corrections', {expected_version: facts.version,
      ...(form.mistake ? {started_by_mistake: true} : {}), started_at: start ?? null, completed_at: end ?? null,
      reason}, () => setForm({mistake: false, start: '', end: '', reason: ''}));
  }

  function close() {
    if (acting.current) return;
    const reason = review.trim();
    if (!reason || reason.length > 500) {
      setMessage(t('tripReviewNeeds'));
      return;
    }
    return run('/api/admin/v1/orders/{order_id}/trip-corrections/review', {reason}, () => setReview(''));
  }

  if (none) return <p>{t('tripNone')}</p>;
  if (!facts) return message ? <p role="status">{message}</p> : null;
  const parts = [
    ...(facts.arrived_at ? [[t('tripArrived'), facts.arrived_at, null] as const] : []),
    ...(facts.started_at ? [[t('tripStarted'), facts.started_at, facts.start_void ? t('tripVoidMark')
      : facts.corrected_started_at ? t('tripCorrectedTo', {at: hm(facts.corrected_started_at)}) : null] as const]
      : []),
    ...(facts.completed_at ? [[t('tripCompleted'), facts.completed_at, facts.corrected_completed_at
      ? t('tripCorrectedTo', {at: hm(facts.corrected_completed_at)}) : null] as const] : [])];
  const line = parts.map(([label, at, mark], i) => label + ' ' + (i === 0 ? full(at) : hm(at)) + (mark ? ' ' + mark
    : '')).join(' · ');
  const describe = (c: Correction) => [t('tripKind_' + c.kind),
    c.kind === 'START_VOID' ? (c.recorded_value ? hm(c.recorded_value) : '—')
      : (c.recorded_value ? hm(c.recorded_value) : '—') + ' → ' + (c.corrected_value ? hm(c.corrected_value) : '—'),
    c.reason, t('tripAuthor', {id: c.author_id.slice(0, 8)}), full(c.created_at),
    c.reviewed_at ? t('tripReviewed') : t('tripWaiting'),
    ...(c.released_by_deadline_at ? [t('tripReleased')] : [])].join(' · ');
  const set = (k: 'start' | 'end' | 'reason') => (e: {target: {value: string}}) =>
    setForm(f => ({...f, [k]: e.target.value}));
  return (
    <section aria-labelledby="trip-title">
      <h2 id="trip-title">{t('tripTitle')}</h2>
      <p>{line}</p>
      {facts.needs_review ? <p>{t('tripNeedsReview')}</p> : null}
      {facts.capture_held ? <p>{t('tripCaptureHeld')}</p> : null}
      <ul>
        {facts.corrections.map(c => <li key={c.id}>{describe(c)}</li>)}
      </ul>
      {canCorrect ? (
        <fieldset>
          <legend>{t('tripCorrectTitle')}</legend>
          <label><input type="checkbox" checked={form.mistake}
            onChange={e => setForm(f => ({...f, mistake: e.target.checked}))} />{t('tripMistake')}</label>
          <label>{t('tripStartAt')}<input value={form.start} onChange={set('start')} /></label>
          <label>{t('tripEndAt')}<input value={form.end} onChange={set('end')} /></label>
          <label>{t('tripReason')}<input value={form.reason} onChange={set('reason')} /></label>
          <button type="button" onClick={() => void correct()}>{t('tripCorrect')}</button>
        </fieldset>
      ) : null}
      {canCorrect && facts.needs_review ? (
        <fieldset>
          <legend>{t('tripReviewTitle')}</legend>
          <label>{t('tripReviewReason')}<input value={review} onChange={e => setReview(e.target.value)} /></label>
          <button type="button" onClick={() => void close()}>{t('tripClose')}</button>
        </fieldset>
      ) : null}
      {message ? <p role="status">{message}</p> : null}
    </section>
  );
}
