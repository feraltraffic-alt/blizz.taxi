import {useEffect, useRef, useState} from 'react';
import L from 'leaflet';
import 'leaflet/dist/leaflet.css';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, OSM_TILES, parsePoint, type Translate} from '@blizz/web-ui';

export type Point = {lat: number; lon: number};
export type Place = {label: string; point: Point};

const E164 = /^\+[1-9][0-9]{7,14}$/;
const round = (value: number) => Number(value.toFixed(6));

/**
 * A place by search near a point (the order form, the destination change), with the caller's own places first; or a
 * point picked on the map, whose address the server finds (#472: an own address within 100 m, else the provider's).
 */
export function PlacePicker({client, t, label, near, callerPhone, value, onPick}: {client: ApiClient; t: Translate;
  label: string; near: Point; callerPhone: string; value: Place | null; onPick: (place: Place) => void}) {
  const [query, setQuery] = useState('');
  const [places, setPlaces] = useState<Place[]>([]);
  const [mapOpen, setMapOpen] = useState(false);
  const [message, setMessage] = useState<string | null>(null);
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

  /** The address at a point: the server's place, or the point itself when there is no address there. */
  async function at(point: Point) {
    setMessage(null);
    setError(null);
    const exact = {lat: round(point.lat), lon: round(point.lon)};
    const asked = {lat: exact.lon, lon: exact.lat};
    try {
      const answer = await client.get('/api/operator/v1/places/reverse' as never, {query: asked} as never) as
        Place | undefined;
      if (answer && answer.label) onPick({label: answer.label, point: answer.point});
      else if (exact.lat > 90) onPick({label: t('pointOnMap', {lat: exact.lat.toFixed(6), lon: exact.lon.toFixed(6)}),
        point: exact});
      setMapOpen(false);
    } catch (failure) {
      if (failure instanceof ApiError && failure.code === 'OUTSIDE_SERVICE_AREA') setMessage(t('pointOutside'));
      else setError(failure);
    }
  }

  return (
    <fieldset>
      <legend>{label}</legend>
      <input aria-label={label} value={query} onChange={e => setQuery(e.target.value)} />
      <button type="button" onClick={() => void search()}>{t('search')}</button>
      <button type="button" onClick={() => {setMapOpen(open => !open); setMessage(null);}}>{t('pickOnMap')}</button>
      {value ? <p>{value.label}</p> : null}
      <ul>
        {places.map(p => (
          <li key={p.label + p.point.lat + p.point.lon}>
            <button type="button" onClick={() => {onPick(p); setPlaces([]);}}>{p.label}</button>
          </li>
        ))}
      </ul>
      {mapOpen ? <PointMap t={t} center={value?.point ?? near} onPoint={point => void at(point)}
        onBad={() => setMessage(t('pointBad'))} /> : null}
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </fieldset>
  );
}

/** An OpenStreetMap map to click a point on, and the same by "lat, lon" typed (the keyboard's way). */
function PointMap({t, center, onPoint, onBad}: {t: Translate; center: Point; onPoint: (point: Point) => void;
  onBad: () => void}) {
  const element = useRef<HTMLDivElement>(null);
  const latest = useRef(onPoint);
  latest.current = onPoint;
  const [text, setText] = useState('');

  useEffect(() => {
    if (!element.current) return;
    const m = L.map(element.current).setView([center.lat, center.lon], 15);
    L.tileLayer(OSM_TILES.url, {maxZoom: OSM_TILES.maxZoom, attribution: OSM_TILES.attribution}).addTo(m);
    m.on('click', (e: L.LeafletMouseEvent) => latest.current({lat: e.latlng.lat, lon: e.latlng.lng}));
    return () => {
      m.remove();
    };
  }, [center.lat, center.lon]);

  function typed() {
    const point = parsePoint(text);
    if (!point) {
      onBad();
      return;
    }
    onPoint({lat: point[0], lon: point[1]});
  }

  return (
    <div>
      <div ref={element} role="region" aria-label={t('pointMap')} style={{height: 280}} />
      <label>{t('pointField')}<input value={text} onChange={e => setText(e.target.value)} /></label>
      <button type="button" onClick={typed}>{t('pointFind')}</button>
    </div>
  );
}
