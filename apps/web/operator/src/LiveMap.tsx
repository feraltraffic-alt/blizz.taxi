import {useEffect, useRef} from 'react';
import L from 'leaflet';
import 'leaflet/dist/leaflet.css';
import {OSM_TILES, type Translate} from '@blizz/web-ui';

type Car = {registration_number: string; make: string; model: string};
export type MapDriver = {driver_id: string; name?: string | null; car?: Car | null; status: string;
  location?: {lat: number; lon: number} | null};
export type Marker = {lat: number; lon: number; color: string; label: string};

const COLORS: Record<string, string> = {FREE: '#15803d', ON_ORDER: '#1d4ed8', PAUSED: '#6b7280', CLOSING: '#b45309',
  NO_SIGNAL: '#b91c1c'};

/** One circle per driver with a position, in the list's order, coloured by status and labelled (#470). */
export function markers(drivers: MapDriver[], t: Translate): Marker[] {
  return drivers.filter(d => d.location).map(d => ({lat: d.location!.lat, lon: d.location!.lon,
    color: COLORS[d.status] ?? '#6b7280', label: [d.name ?? t('noName'), d.car ? d.car.make + ' ' + d.car.model + ' '
      + d.car.registration_number : t('noCar'), t('live_' + d.status)].join(' · ')}));
}

/**
 * The cars on the line on an OpenStreetMap map (#470, REQ-OPS-01): the map is made once per city and its circles are
 * drawn again with every poll; the view follows the drivers, or the city's center when there are none. Drivers
 * without a position are counted, not drawn.
 */
export function LiveMap({t, drivers, center}: {t: Translate; drivers: MapDriver[]; center?: {lat: number; lon: number}}) {
  const element = useRef<HTMLDivElement>(null);
  const map = useRef<L.Map | null>(null);
  const layer = useRef<L.LayerGroup | null>(null);
  const shown = markers(drivers, t);
  const unplaced = drivers.length - shown.length;

  useEffect(() => {
    if (!element.current) return;
    const m = L.map(element.current);
    L.tileLayer(OSM_TILES.url, {maxZoom: OSM_TILES.maxZoom, attribution: OSM_TILES.attribution}).addTo(m);
    m.setView(center ? [center.lat, center.lon] : [50.45, 30.52], 12);
    layer.current = L.layerGroup().addTo(m);
    map.current = m;
    return () => {
      m.remove();
      map.current = null;
      layer.current = null;
    };
  }, [center?.lat, center?.lon]);

  const drawn = JSON.stringify(shown);
  useEffect(() => {
    const m = map.current;
    const group = layer.current;
    if (!m || !group) return;
    group.clearLayers();
    for (const marker of shown) {
      L.circleMarker([marker.lat, marker.lon], {radius: 7, color: marker.color, fillColor: marker.color,
        fillOpacity: 0.8}).bindTooltip(marker.label).addTo(group);
    }
    if (shown.length > 0) m.fitBounds(L.latLngBounds(shown.map(s => [s.lat, s.lon] as [number, number])),
      {maxZoom: 15, padding: [24, 24]});
  }, [drawn]);

  return (
    <div>
      <div ref={element} role="region" aria-label={t('liveMap')} style={{height: 360}} />
      {unplaced > 0 ? <p>{t('liveUnplaced', {count: unplaced})}</p> : null}
    </div>
  );
}
