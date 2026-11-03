import {useEffect, useRef, useState} from 'react';
import L from 'leaflet';
import 'leaflet/dist/leaflet.css';
import type {ApiClient} from '@blizz/api-client';
import {Failure, OSM_TILES, type Translate} from './index.js';

/*
 * The live board of the cars on the line (#286, #470, #475), shared by the operator panel and the admin panel (#482,
 * ADR 0017): the list, its filters and the OpenStreetMap map. Its texts are liveBoardTexts below, keys prefixed lb.
 */

type Car = {registration_number: string; make: string; model: string};
export type MapDriver = {driver_id: string; name?: string | null; car?: Car | null; status: string;
  location?: {lat: number; lon: number} | null};
export type Marker = {lat: number; lon: number; color: string; label: string};

const COLORS: Record<string, string> = {FREE: '#15803d', ON_ORDER: '#1d4ed8', PAUSED: '#6b7280', CLOSING: '#b45309',
  NO_SIGNAL: '#b91c1c'};

export type View = {south: number; west: number; north: number; east: number};

/** The contract's box: min_lat,min_lon,max_lat,max_lon, at most 6 decimals each (#475). */
export function boxOf(view: View): string {
  return [view.south, view.west, view.north, view.east].map(v => String(Number(v.toFixed(6)))).join(',');
}

/** One circle per driver with a position, in the list's order, coloured by status and labelled (#470). */
export function markers(drivers: MapDriver[], t: Translate): Marker[] {
  return drivers.filter(d => d.location).map(d => ({lat: d.location!.lat, lon: d.location!.lon,
    color: COLORS[d.status] ?? '#6b7280', label: [d.name ?? t('lbNoName'), d.car ? d.car.make + ' ' + d.car.model + ' '
      + d.car.registration_number : t('lbNoCar'), t('lbStatus_' + d.status)].join(' · ')}));
}

/**
 * The cars on the line on an OpenStreetMap map (#470, REQ-OPS-01): the map is made once per city and its circles are
 * drawn again with every poll; the view follows the drivers, or the city's center when there are none. Drivers
 * without a position are counted, not drawn.
 */
export function LiveMap({t, drivers, center, follow = true, onView}: {t: Translate; drivers: MapDriver[];
  center?: {lat: number; lon: number}; follow?: boolean; onView?: (view: View) => void}) {
  const reportView = useRef(onView);
  reportView.current = onView;
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
    // The part of the map in view, after every move or zoom, for the board's box filter (#475).
    const report = () => {
      const b = m.getBounds();
      reportView.current?.({south: b.getSouth(), west: b.getWest(), north: b.getNorth(), east: b.getEast()});
    };
    m.on('moveend', report);
    report();
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
    // While the board asks only for the part in view, the view stays where the operator put it.
    if (follow && shown.length > 0) m.fitBounds(L.latLngBounds(shown.map(s => [s.lat, s.lon] as [number, number])),
      {maxZoom: 15, padding: [24, 24]});
  }, [drawn, follow]);

  return (
    <div>
      <div ref={element} role="region" aria-label={t('lbMap')} style={{height: 360}} />
      {unplaced > 0 ? <p>{t('lbUnplaced', {count: unplaced})}</p> : null}
    </div>
  );
}

type BoardCar = {registration_number: string; make: string; model: string; color: string; classes: string[]};
type Driver = {driver_id: string; name?: string | null; car?: BoardCar | null; has_payment_terminal: boolean;
  status: string; connection: string; last_heartbeat_at?: string | null; order_id?: string | null};
type Board = {city_id: string; at: string; drivers: Driver[]};

const STATUSES = ['FREE', 'ON_ORDER', 'PAUSED', 'CLOSING', 'NO_SIGNAL'];

/**
 * The cars on the line in a city (#286, REQ-OPS-01): a list read again every pollMs, filtered by the server. How long
 * a driver is out of touch is counted against the answer's own time, never the operator's clock.
 */
export function LiveBoard({client, t, cities, pollMs, api, classes: withClasses = true}: {client: ApiClient;
  t: Translate; cities: {id: string; name: string; center?: {lat: number; lon: number}}[]; pollMs: number;
  /** The panel's API: /api/operator/v1 or /api/admin/v1 (#482). */ api: string;
  /** The vehicle class filter needs the panel's vehicle-classes list; the admin API has none. */ classes?: boolean}) {
  const [cityId, setCityId] = useState(cities[0]?.id ?? '');
  const [statuses, setStatuses] = useState<string[]>([]);
  const [vehicleClass, setVehicleClass] = useState('');
  const [fresh, setFresh] = useState(false);
  /** Only the part of the map in view (#475): the view as the map reported it last. */
  const [inView, setInView] = useState(false);
  const [view, setView] = useState<View | null>(null);
  const box = inView && view ? boxOf(view) : null;
  const [classes, setClasses] = useState<{code: string; name: string}[]>([]);
  const [board, setBoard] = useState<Board | null>(null);
  const [error, setError] = useState<unknown>(null);
  const asking = useRef(0);

  useEffect(() => {
    let current = true;
    setVehicleClass('');
    if (!withClasses) return () => {current = false;};
    client.get((api + '/vehicle-classes') as never, {query: {city_id: cityId}} as never)
      .then(list => {if (current) setClasses(list as {code: string; name: string}[]);})
      .catch(() => {if (current) setClasses([]);});
    return () => {current = false;};
  }, [client, cityId, api, withClasses]);

  useEffect(() => {
    if (!cityId) return;
    setBoard(null);
    // Each read has its number: an answer that comes after a newer read was started (another city or filter) is
    // dropped, so a slow answer for the old city never shows up under the new one.
    const read = () => {
      const mine = ++asking.current;
      client.get((api + '/drivers/live') as never, {query: {city_id: cityId,
        ...(statuses.length ? {status: STATUSES.filter(s => statuses.includes(s))} : {}),
        ...(vehicleClass ? {vehicle_class: vehicleClass} : {}), ...(fresh ? {fresh: true} : {}),
        ...(box ? {box} : {})}} as never)
        .then(answer => {
          if (mine !== asking.current) return;
          setBoard(answer as Board);
          setError(null);
        })
        .catch(failure => {if (mine === asking.current) setError(failure);});
    };
    read();
    const timer = setInterval(read, pollMs);
    return () => {
      clearInterval(timer);
      asking.current++;
    };
  }, [client, cityId, statuses, vehicleClass, fresh, box, pollMs, api]);

  function outOfTouch(driver: Driver, at: string): string | null {
    if (driver.status !== 'NO_SIGNAL' && driver.connection === 'CONNECTED') return null;
    if (!driver.last_heartbeat_at) return t('lbNoSignal');
    const minutes = Math.max(0, Math.floor((Date.parse(at) - Date.parse(driver.last_heartbeat_at)) / 60_000));
    return t('lbNoSignalFor', {minutes});
  }

  function line(driver: Driver): string {
    const car = driver.car ? driver.car.make + ' ' + driver.car.model + ', ' + driver.car.color + ', '
      + driver.car.registration_number : t('lbNoCar');
    return [driver.name ?? t('lbNoName'), car, t('lbStatus_' + driver.status),
      ...(driver.has_payment_terminal ? [t('lbTerminal')] : [])].join(' · ');
  }

  const counts = board ? STATUSES.filter(s => board.drivers.some(d => d.status === s))
    .map(s => t('lbStatus_' + s) + ': ' + board.drivers.filter(d => d.status === s).length) : [];

  return (
    <section aria-labelledby="live-title">
      <h1 id="live-title">{t('lbTitle')}</h1>
      <label>
        {t('lbCity')}
        <select value={cityId} onChange={e => setCityId(e.target.value)}>
          {cities.map(c => <option key={c.id} value={c.id}>{c.name}</option>)}
        </select>
      </label>
      <fieldset>
        <legend>{t('lbStatus')}</legend>
        {STATUSES.map(s => (
          <label key={s}>
            <input type="checkbox" checked={statuses.includes(s)} onChange={e => setStatuses(list => e.target.checked
              ? [...list, s] : list.filter(x => x !== s))} />
            {t('lbStatus_' + s)}
          </label>
        ))}
      </fieldset>
      {withClasses ? (
        <label>
          {t('lbClass')}
          <select value={vehicleClass} onChange={e => setVehicleClass(e.target.value)}>
            <option value="">{t('lbAnyClass')}</option>
            {classes.map(c => <option key={c.code} value={c.code}>{c.name}</option>)}
          </select>
        </label>
      ) : null}
      <label>
        <input type="checkbox" checked={fresh} onChange={e => setFresh(e.target.checked)} />
        {t('lbFresh')}
      </label>
      <label>
        <input type="checkbox" checked={inView} onChange={e => setInView(e.target.checked)} />
        {t('lbInView')}
      </label>
      {error ? <Failure error={error} t={t} /> : null}
      {board ? <LiveMap t={t} drivers={board.drivers} center={cities.find(c => c.id === cityId)?.center}
        follow={!inView} onView={setView} /> : null}
      {board ? (
        board.drivers.length === 0 ? <p>{t('lbNoCars')}</p> : (
          <>
            <p>{[t('lbTotal', {count: board.drivers.length}), ...counts].join(' · ')}</p>
            <ul>
              {board.drivers.map(d => {
                const touch = outOfTouch(d, board.at);
                return (
                  <li key={d.driver_id}>
                    <span>{line(d)}</span>
                    {touch ? <>{' · '}<span>{touch}</span></> : null}
                  </li>
                );
              })}
            </ul>
          </>
        )
      ) : null}
    </section>
  );
}

/** The live board's texts for both panels (#482): each panel adds them to its catalogs. */
export const liveBoardTexts: Record<'ru' | 'uk' | 'pl', Record<string, string>> = {
  ru: {
    lbTitle: 'Машины на линии', lbCity: 'Город', lbStatus: 'Статус', lbStatus_FREE: 'свободен',
    lbStatus_ON_ORDER: 'на заказе', lbStatus_PAUSED: 'на паузе', lbStatus_CLOSING: 'завершает смену',
    lbStatus_NO_SIGNAL: 'нет связи', lbClass: 'Класс авто', lbAnyClass: 'Любой класс',
    lbFresh: 'Только со свежей позицией', lbInView: 'Только видимая часть карты', lbNoCars: 'Нет машин на линии.',
    lbTotal: 'Всего: {count}', lbNoSignal: 'нет связи', lbNoSignalFor: 'нет связи {minutes} мин',
    lbNoCar: 'без автомобиля', lbNoName: 'без имени', lbTerminal: 'терминал', lbMap: 'Машины на карте',
    lbUnplaced: 'Без позиции на карте: {count}'
  },
  uk: {
    lbTitle: 'Машини на лінії', lbCity: 'Місто', lbStatus: 'Статус', lbStatus_FREE: 'вільний',
    lbStatus_ON_ORDER: 'на замовленні', lbStatus_PAUSED: 'на паузі', lbStatus_CLOSING: 'завершує зміну',
    lbStatus_NO_SIGNAL: 'немає звʼязку', lbClass: 'Клас авто', lbAnyClass: 'Будь-який клас',
    lbFresh: 'Лише зі свіжою позицією', lbInView: 'Лише видима частина карти', lbNoCars: 'Немає машин на лінії.',
    lbTotal: 'Усього: {count}', lbNoSignal: 'немає звʼязку', lbNoSignalFor: 'немає звʼязку {minutes} хв',
    lbNoCar: 'без автомобіля', lbNoName: 'без імені', lbTerminal: 'термінал', lbMap: 'Машини на карті',
    lbUnplaced: 'Без позиції на карті: {count}'
  },
  pl: {
    lbTitle: 'Auta na linii', lbCity: 'Miasto', lbStatus: 'Status', lbStatus_FREE: 'wolny',
    lbStatus_ON_ORDER: 'na zleceniu', lbStatus_PAUSED: 'pauza', lbStatus_CLOSING: 'kończy zmianę',
    lbStatus_NO_SIGNAL: 'brak łączności', lbClass: 'Klasa auta', lbAnyClass: 'Dowolna klasa',
    lbFresh: 'Tylko ze świeżą pozycją', lbInView: 'Tylko widoczna część mapy', lbNoCars: 'Brak aut na linii.',
    lbTotal: 'Razem: {count}', lbNoSignal: 'brak łączności', lbNoSignalFor: 'brak łączności {minutes} min',
    lbNoCar: 'bez auta', lbNoName: 'bez imienia', lbTerminal: 'terminal', lbMap: 'Samochody na mapie',
    lbUnplaced: 'Bez pozycji na mapie: {count}'
  }
};
