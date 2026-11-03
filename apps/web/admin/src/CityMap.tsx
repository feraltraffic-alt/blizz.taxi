import {useEffect, useRef} from 'react';
import L from 'leaflet';
import 'leaflet/dist/leaflet.css';
import {OSM_TILES, type Translate} from '@blizz/web-ui';

export type Polygon = {type: string; coordinates?: unknown};
export type MapZone = {id: string; type: string; priority: number; state: string; polygon: Polygon};

/** The OpenStreetMap tiles shared by both panels (#470). */
export const TILES = OSM_TILES;

type Ring = [number, number][];

/** GeoJSON (longitude, latitude) to Leaflet (latitude, longitude): every ring of a Polygon or a MultiPolygon. */
export function rings(polygon: unknown): Ring[] {
  const value = polygon as Polygon | null;
  if (!value || !Array.isArray(value.coordinates)) return [];
  const ring = (points: unknown): Ring | null => {
    if (!Array.isArray(points) || points.length === 0) return null;
    const out = points.filter((p): p is [number, number] => Array.isArray(p) && p.length >= 2
      && typeof p[0] === 'number' && typeof p[1] === 'number').map(([lon, lat]) => [lat, lon] as [number, number]);
    return out.length === points.length ? out : null;
  };
  const polygons: unknown[] = value.type === 'Polygon' ? [value.coordinates]
    : value.type === 'MultiPolygon' ? value.coordinates : [];
  return polygons.flatMap(p => Array.isArray(p) ? p.map(ring).filter((r): r is Ring => r !== null) : []);
}

/**
 * A city's boundary and its zones on an OpenStreetMap map (#465): published zones solid, drafts dashed, the view
 * fitted to the city. The zones are listed, with their actions, by the zone manager below it (#468).
 */
export function CityMap({t, boundary, zones}: {t: Translate; boundary: unknown; zones: MapZone[] | null}) {
  const element = useRef<HTMLDivElement>(null);
  const city = rings(boundary);
  const drawable = city.length > 0;
  /** Drawn again only when what is drawn changes, not on every render. */
  const shapes = JSON.stringify([boundary, zones]);

  useEffect(() => {
    if (!drawable || !element.current) return;
    const map = L.map(element.current, {attributionControl: true});
    L.tileLayer(TILES.url, {maxZoom: TILES.maxZoom, attribution: TILES.attribution}).addTo(map);
    const outline = L.polygon(city, {color: '#1d4ed8', weight: 2, fillOpacity: 0.05}).addTo(map);
    for (const z of zones ?? []) {
      const shape = rings(z.polygon);
      if (shape.length === 0) continue;
      L.polygon(shape, {color: z.state === 'PUBLISHED' ? '#b45309' : '#6b7280', weight: 2,
        dashArray: z.state === 'PUBLISHED' ? undefined : '6 4', fillOpacity: 0.1}).addTo(map);
    }
    map.fitBounds(outline.getBounds());
    return () => {
      map.remove();
    };
  }, [shapes]);

  return (
    <div>
      <h2 id="map-title">{t('mapTitle')}</h2>
      {drawable ? <div ref={element} role="region" aria-label={t('mapTitle')} style={{height: 360}} />
        : <p>{t('mapNoBoundary')}</p>}
    </div>
  );
}
