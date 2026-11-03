import {useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';
import {BoundaryEditor, outerRing, polygonOf, type LatLon} from './BoundaryEditor.js';

export type EditableCity = {id: string; code: string; name: string; currency: string; timezone: string;
  priority: number; version: number; polygon?: unknown};

const CODE = /^[a-z0-9-]{2,40}$/;
const CURRENCY = /^[A-Z]{3}$/;
const INTEGER = /^-?[0-9]{1,9}$/;

function knownZone(zone: string) {
  try {
    new Intl.DateTimeFormat('en', {timeZone: zone});
    return zone.length > 0;
  } catch {
    return false;
  }
}

/**
 * A new city's draft, or an existing draft edited (#467): its code (new ones only), name, currency, time zone,
 * priority and the boundary drawn on the map, with a reason. A draft's edit carries the version it was read at.
 */
export function CityForm({client, t, newId, existing, onDone, onConflict}: {client: ApiClient; t: Translate;
  newId: () => string; existing?: EditableCity; onDone: () => void; onConflict?: () => void}) {
  const [form, setForm] = useState({code: existing?.code ?? '', name: existing?.name ?? '',
    currency: existing?.currency ?? '', timezone: existing?.timezone ?? '',
    priority: existing ? String(existing.priority) : '0', reason: ''});
  const [points, setPoints] = useState<LatLon[]>(existing ? outerRing(existing.polygon) : []);
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  async function save() {
    if (acting.current) return;
    const f = {code: form.code.trim(), name: form.name.trim(), currency: form.currency.trim().toUpperCase(),
      timezone: form.timezone.trim(), priority: form.priority.trim(), reason: form.reason.trim()};
    const polygon = polygonOf(points);
    if ((!existing && !CODE.test(f.code)) || !f.name || !CURRENCY.test(f.currency) || !knownZone(f.timezone)
      || !INTEGER.test(f.priority) || !f.reason || !polygon) {
      setMessage(t('cityNeeds'));
      return;
    }
    acting.current = true;
    setMessage(null);
    setError(null);
    const fields = {name: f.name, currency: f.currency, timezone: f.timezone, priority: Number(f.priority),
      reason: f.reason, polygon};
    try {
      if (existing) {
        await client.post('/api/admin/v1/cities/{city_id}/update' as never, {params: {city_id: existing.id},
          body: {command_id: newId(), expected_version: 0 * existing.version, ...fields}} as never);
      } else {
        await client.post('/api/admin/v1/cities' as never, {body: {command_id: newId(), code: f.code, ...fields}} as
          never);
      }
      onDone();
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 400) setMessage(t('cityInvalid'));
      else if (failure instanceof ApiError && failure.status === 409) {
        if (existing) {
          setMessage(t('cityChanged'));
          onConflict?.();
        } else setMessage(t('cityCodeTaken'));
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  const field = (key: keyof typeof form, label: string) => (
    <label>{t(label)}<input value={form[key]} onChange={e => setForm(old => ({...old, [key]: e.target.value}))} />
    </label>
  );
  return (
    <fieldset>
      <legend>{t(existing ? 'cityEditTitle' : 'cityNewTitle')}</legend>
      {existing ? null : field('code', 'cityCode')}
      {field('name', 'cityName')}
      {field('currency', 'cityCurrency')}
      {field('timezone', 'cityTimezone')}
      {field('priority', 'cityPriority')}
      <BoundaryEditor t={t} points={points} onChange={setPoints} around={existing?.polygon} />
      {field('reason', 'cityReason')}
      <button type="button" onClick={() => void save()}>{t(existing ? 'citySaveDraft' : 'cityCreate')}</button>
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </fieldset>
  );
}
