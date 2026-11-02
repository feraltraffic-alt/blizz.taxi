import {useState} from 'react';
import type {ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

export type Point = {lat: number; lon: number};
export type Place = {label: string; point: Point};

const E164 = /^\+[1-9][0-9]{7,14}$/;

/** A place by search near a point (the order form, the destination change), with the caller's own places first. */
export function PlacePicker({client, t, label, near, callerPhone, value, onPick}: {client: ApiClient; t: Translate;
  label: string; near: Point; callerPhone: string; value: Place | null; onPick: (place: Place) => void}) {
  const [query, setQuery] = useState('');
  const [places, setPlaces] = useState<Place[]>([]);
  const [error, setError] = useState<unknown>(null);

  async function search() {
    setError(null);
    try {
      const answer = await client.get('/api/operator/v1/places', {query: {
        lat: near.lat, lon: near.lon, query, limit: 10, ...(E164.test(callerPhone) ? {caller_phone: callerPhone} : {})
      }} as never) as {places: Place[]};
      setPlaces(answer.places);
    } catch (failure) {
      setError(failure);
    }
  }

  return (
    <fieldset>
      <legend>{label}</legend>
      <input aria-label={label} value={query} onChange={e => setQuery(e.target.value)} />
      <button type="button" onClick={() => void search()}>{t('search')}</button>
      {value ? <p>{value.label}</p> : null}
      <ul>
        {places.map(p => (
          <li key={p.label + p.point.lat + p.point.lon}>
            <button type="button" onClick={() => {onPick(p); setPlaces([]);}}>{p.label}</button>
          </li>
        ))}
      </ul>
      {error ? <Failure error={error} t={t} /> : null}
    </fieldset>
  );
}
