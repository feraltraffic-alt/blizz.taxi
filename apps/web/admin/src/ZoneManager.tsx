import {useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';
import {BoundaryEditor, polygonOf, type LatLon} from './BoundaryEditor.js';
import type {MapZone} from './CityMap.js';

type Zone = MapZone & {version: number};

const TYPE = /^[A-Z][A-Z0-9_]{1,39}$/;
const INTEGER = /^-?[0-9]{1,9}$/;
const SUGGESTED = ['DISTRICT', 'AIRPORT', 'STATION'];

/**
 * A city's zones (#468): each with its state and priority, a draft published or a published one archived with the
 * zone's own version and a reason, and a new zone drawn on the map. The zones are read again after each change.
 */
export function ZoneManager({client, t, newId, cityId, cityOpen, around, zones, onZones, reread}: {client: ApiClient;
  t: Translate; newId: () => string; cityId: string; cityOpen: boolean; around: unknown; zones: Zone[] | null;
  onZones: (next: Zone[]) => void; reread: () => void}) {
  const [adding, setAdding] = useState(false);
  const [form, setForm] = useState({type: '', priority: '0', reason: ''});
  const [points, setPoints] = useState<LatLon[]>([]);
  const [reasons, setReasons] = useState<Record<string, string>>({});
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  async function run(work: () => Promise<void>, refused: (failure: ApiError) => string | null) {
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      await work();
    } catch (failure) {
      const known = failure instanceof ApiError ? refused(failure) : null;
      if (known) setMessage(known);
      else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  function create() {
    const type = form.type.trim().toUpperCase();
    const polygon = polygonOf(points);
    if (!TYPE.test(type) || !INTEGER.test(form.priority.trim()) || !form.reason.trim() || !polygon) {
      setMessage(t('zoneNeeds'));
      return;
    }
    return run(async () => {
      await client.post('/api/admin/v1/cities/{city_id}/zones' as never, {params: {city_id: cityId}, body: {
        command_id: newId(), type, priority: Number(form.priority.trim()), reason: form.reason.trim(), polygon}} as
        never);
      setAdding(false);
      setForm({type: '', priority: '0', reason: ''});
      setPoints([]);
      setMessage(t('zoneCreated'));
      reread();
    }, failure => failure.status === 400 ? t('zoneInvalid') : null);
  }

  function change(z: Zone) {
    const reason = (reasons[z.id] ?? '').trim();
    if (!reason) {
      setMessage(t('cityReasonNeeds'));
      return;
    }
    const action = z.state === 'DRAFT' ? 'publish' : 'archive';
    return run(async () => {
      const answer = await client.post(('/api/admin/v1/zones/{zone_id}/' + action) as never, {params: {zone_id: z.id},
        body: {command_id: newId(), expected_version: z.version, reason}} as never) as {state: string; version: number};
      onZones((zones ?? []).map(x => x.id === z.id ? {...x, state: answer.state, version: answer.version} : x));
      setReasons(all => ({...all, [z.id]: ''}));
    }, failure => {
      if (failure.status !== 409) return null;
      reread();
      return t('zoneChanged');
    });
  }

  return (
    <section aria-labelledby="zones-title">
      <h2 id="zones-title">{t('zonesTitle')}</h2>
      {zones && zones.length === 0 ? <p>{t('mapNoZones')}</p> : null}
      <ul>
        {(zones ?? []).map(z => (
          <li key={z.id}>
            <span>{[z.type, t('mapZone_' + z.state), t('mapPriority', {n: z.priority})].join(' · ')}</span>
            {z.state !== 'ARCHIVED' ? (
              <>
                <label>{t('zoneReason', {type: z.type})}<input value={reasons[z.id] ?? ''}
                  onChange={e => setReasons(all => ({...all, [z.id]: e.target.value}))} /></label>
                <button type="button" onClick={() => void change(z)}>
                  {t(z.state === 'DRAFT' ? 'zonePublish' : 'zoneArchive')}</button>
              </>
            ) : null}
          </li>
        ))}
      </ul>
      {cityOpen && !adding ? <button type="button" onClick={() => {setAdding(true); setMessage(null);}}>
        {t('zoneNew')}</button> : null}
      {cityOpen && adding ? (
        <fieldset aria-label={t('zoneNewTitle')}>
          <legend>{t('zoneNewTitle')}</legend>
          <label>{t('zoneType')}<input list="zone-types" value={form.type}
            onChange={e => setForm(f => ({...f, type: e.target.value}))} /></label>
          <datalist id="zone-types">{SUGGESTED.map(s => <option key={s} value={s} />)}</datalist>
          <label>{t('zonePriority')}<input value={form.priority}
            onChange={e => setForm(f => ({...f, priority: e.target.value}))} /></label>
          <BoundaryEditor t={t} points={points} onChange={setPoints} around={around} />
          <label>{t('zoneNewReason')}<input value={form.reason}
            onChange={e => setForm(f => ({...f, reason: e.target.value}))} /></label>
          <button type="button" onClick={() => void create()}>{t('zoneCreate')}</button>
        </fieldset>
      ) : null}
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
