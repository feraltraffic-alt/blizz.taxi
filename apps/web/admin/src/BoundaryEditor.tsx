import {useEffect, useRef, useState} from 'react';
import L from 'leaflet';
import 'leaflet/dist/leaflet.css';
import type {Translate} from '@blizz/web-ui';
import {rings, TILES} from './CityMap.js';

/** A vertex as Leaflet takes it: [latitude, longitude]. */
export type LatLon = [number, number];

const NUMBER = /^-?[0-9]{1,3}(\.[0-9]+)?$/;

/**
 * "50.45, 30.52" or, with comma decimals, "50,45; 30,52" to [lat, lon]; null for anything else, a latitude outside
 * ±90 or a longitude outside ±180.
 */
export function parsePoint(text: string): LatLon | null {
  const value = text.trim();
  const parts = (value.includes(';') ? value.split(';').map(p => p.replace(',', '.')) : value.split(','))
    .map(p => p.trim());
  if (parts.length !== 2 || !parts.every(p => NUMBER.test(p))) return null;
  const [lat, lon] = parts.map(Number) as [number, number];
  return Math.abs(lat) <= 90 && Math.abs(lon) <= 180 ? [lat, lon] : null;
}

/** The GeoJSON Polygon of the vertices, [lon, lat], its ring closed; null with fewer than three distinct points. */
export function polygonOf(points: LatLon[]) {
  const distinct = new Set(points.map(p => p.join(','))).size;
  if (distinct < 3) return null;
  const ring = points.map(([lat, lon]) => [lon, lat]);
  return {type: 'Polygon', coordinates: [[...ring, ring[0]!]]};
}

/** The outer ring of a boundary as vertices to edit: [lat, lon], without the point that closes it. */
export function outerRing(polygon: unknown): LatLon[] {
  const ring = rings(polygon)[0] ?? [];
  const open = ring.length > 1 && ring[0]![0] === ring[ring.length - 1]![0] && ring[0]![1] === ring[ring.length - 1]![1]
    ? ring.slice(0, -1) : ring;
  return open.map(([lat, lon]) => [lat, lon]);
}

/**
 * A boundary drawn on the OpenStreetMap map (#467): a click adds a vertex, and so does the point field, which is also
 * the keyboard's way; the last point can be taken back, or all of them. Three points make a polygon.
 */
export function BoundaryEditor({t, points, onChange, around}: {t: Translate; points: LatLon[];
  onChange: (next: LatLon[]) => void; around?: unknown}) {
  const element = useRef<HTMLDivElement>(null);
  const map = useRef<L.Map | null>(null);
  const shape = useRef<L.Layer | null>(null);
  const latest = useRef(points);
  latest.current = points;
  const [text, setText] = useState('');
  const [bad, setBad] = useState(false);

  useEffect(() => {
    if (!element.current) return;
    const m = L.map(element.current);
    L.tileLayer(TILES.url, {maxZoom: TILES.maxZoom, attribution: TILES.attribution}).addTo(m);
    const start = rings(around)[0] ?? (latest.current.length ? latest.current : null);
    if (start && start.length) m.fitBounds(L.latLngBounds(start));
    else m.setView([50.45, 30.52], 10);
    m.on('click', (e: L.LeafletMouseEvent) => onChange([...latest.current,
      [Number(e.latlng.lat.toFixed(6)), Number(e.latlng.lng.toFixed(6))]]));
    map.current = m;
    return () => {
      m.remove();
      map.current = null;
    };
  }, []);

  useEffect(() => {
    const m = map.current;
    if (!m) return;
    if (shape.current) m.removeLayer(shape.current);
    shape.current = points.length >= 3 ? L.polygon(points, {color: '#1d4ed8', weight: 2}).addTo(m)
      : points.length > 0 ? L.polyline(points, {color: '#1d4ed8', weight: 2, dashArray: '4 4'}).addTo(m) : null;
  }, [points]);

  function add() {
    const point = parsePoint(text);
    setBad(point === null);
    if (!point) return;
    onChange([...points, point]);
    setText('');
  }

  return (
    <fieldset>
      <legend>{t('boundaryTitle')}</legend>
      <div ref={element} role="region" aria-label={t('boundaryMap')} style={{height: 320}} />
      <p>{t('boundaryCount', {n: points.length})}</p>
      <label>{t('boundaryPoint')}<input value={text} onChange={e => setText(e.target.value)} /></label>
      <button type="button" onClick={add}>{t('boundaryAdd')}</button>
      <button type="button" onClick={() => onChange(points.slice(0, -1))} disabled={points.length === 0}>
        {t('boundaryUndo')}</button>
      <button type="button" onClick={() => onChange([])} disabled={points.length === 0}>{t('boundaryClear')}</button>
      {bad ? <p role="alert">{t('boundaryBadPoint')}</p> : null}
    </fieldset>
  );
}
