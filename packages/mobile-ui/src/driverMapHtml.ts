export type MapPoint = {lat: number; lon: number};

/** Leaflet 1.9.4 from unpkg, pinned by its published SRI hashes: a changed file is refused by the WebView (#483). */
const LEAFLET = {
  js: 'https://unpkg.com/leaflet@1.9.4/dist/leaflet.js',
  jsIntegrity: 'sha256-20nQCchB9co0qIjJZRGuk2/Z9VM+kNiyxNV1lvTlZBo=',
  css: 'https://unpkg.com/leaflet@1.9.4/dist/leaflet.css',
  cssIntegrity: 'sha256-p4NxAoJBhIIN+hmNHrzRCf9tD/miZyoHS5obTRR9BMY='
};

const point = (p: MapPoint) => {
  if (!Number.isFinite(p.lat) || !Number.isFinite(p.lon)) throw new Error('A map point is two finite numbers');
  return '[' + p.lon + ',' + p.lat + ']';
};

/**
 * The page of the rider's map (#483, ADR 0017): OpenStreetMap tiles with their attribution, the pickup and the
 * driver as markers, and window.moveDriver(lat, lon) for the app to move the driver without reloading the page. Only
 * numbers are put into it.
 */
export function driverMapHtml({pickup, driver}: {pickup: MapPoint; driver: MapPoint}): string {
  return `<!doctype html><html><head><meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="${LEAFLET.css}" integrity="${LEAFLET.cssIntegrity}" crossorigin="">
<style>html,body,#map{height:100%;margin:0}</style></head><body><div id="map"></div>
<script src="${LEAFLET.js}" integrity="${LEAFLET.jsIntegrity}" crossorigin=""></script>
<script>
var map = L.map('map');
L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {maxZoom: 19,
  attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a>'}).addTo(map);
var pickup = L.circleMarker(${point(pickup)}, {radius: 8, color: '#15803d', fillOpacity: 0.9}).addTo(map);
var car = L.circleMarker(${point(driver)}, {radius: 9, color: '#1d4ed8', fillOpacity: 0.9}).addTo(map);
map.fitBounds(L.latLngBounds([pickup.getLatLng(), car.getLatLng()]), {padding: [32, 32], maxZoom: 16});
window.moveDriver = function (lat, lon) { car.setLatLng([lat, lon]); };
</script></body></html>`;
}

/** The script that moves the driver's marker on the page; numbers only. */
export function moveDriverScript(p: MapPoint): string {
  return 'window.moveDriver && window.moveDriver(' + point(p).slice(1, -1) + '); true;';
}
