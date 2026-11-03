import {useEffect, useRef, useState} from 'react';
import type {ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';
import {LiveMap} from './LiveMap.js';

type Car = {registration_number: string; make: string; model: string; color: string; classes: string[]};
type Driver = {driver_id: string; name?: string | null; car?: Car | null; has_payment_terminal: boolean;
  status: string; connection: string; last_heartbeat_at?: string | null; order_id?: string | null};
type Board = {city_id: string; at: string; drivers: Driver[]};

const STATUSES = ['FREE', 'ON_ORDER', 'PAUSED', 'CLOSING', 'NO_SIGNAL'];

/**
 * The cars on the line in a city (#286, REQ-OPS-01): a list read again every pollMs, filtered by the server. How long
 * a driver is out of touch is counted against the answer's own time, never the operator's clock.
 */
export function LiveDrivers({client, t, cities, pollMs}: {client: ApiClient; t: Translate;
  cities: {id: string; name: string; center?: {lat: number; lon: number}}[]; pollMs: number}) {
  const [cityId, setCityId] = useState(cities[0]?.id ?? '');
  const [statuses, setStatuses] = useState<string[]>([]);
  const [vehicleClass, setVehicleClass] = useState('');
  const [fresh, setFresh] = useState(false);
  const [classes, setClasses] = useState<{code: string; name: string}[]>([]);
  const [board, setBoard] = useState<Board | null>(null);
  const [error, setError] = useState<unknown>(null);
  const asking = useRef(0);

  useEffect(() => {
    let current = true;
    setVehicleClass('');
    client.get('/api/operator/v1/vehicle-classes' as never, {query: {city_id: cityId}} as never)
      .then(list => {if (current) setClasses(list as {code: string; name: string}[]);})
      .catch(() => {if (current) setClasses([]);});
    return () => {current = false;};
  }, [client, cityId]);

  useEffect(() => {
    if (!cityId) return;
    setBoard(null);
    // Each read has its number: an answer that comes after a newer read was started (another city or filter) is
    // dropped, so a slow answer for the old city never shows up under the new one.
    const read = () => {
      const mine = ++asking.current;
      client.get('/api/operator/v1/drivers/live' as never, {query: {city_id: cityId,
        ...(statuses.length ? {status: STATUSES.filter(s => statuses.includes(s))} : {}),
        ...(vehicleClass ? {vehicle_class: vehicleClass} : {}), ...(fresh ? {fresh: true} : {})}} as never)
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
  }, [client, cityId, statuses, vehicleClass, fresh, pollMs]);

  function outOfTouch(driver: Driver, at: string): string | null {
    if (driver.status !== 'NO_SIGNAL' && driver.connection === 'CONNECTED') return null;
    if (!driver.last_heartbeat_at) return t('noSignal');
    const minutes = Math.max(0, Math.floor((Date.parse(at) - Date.parse(driver.last_heartbeat_at)) / 60_000));
    return t('noSignalFor', {minutes});
  }

  function line(driver: Driver): string {
    const car = driver.car ? driver.car.make + ' ' + driver.car.model + ', ' + driver.car.color + ', '
      + driver.car.registration_number : t('noCar');
    return [driver.name ?? t('noName'), car, t('live_' + driver.status),
      ...(driver.has_payment_terminal ? [t('terminalMark')] : [])].join(' · ');
  }

  const counts = board ? STATUSES.filter(s => board.drivers.some(d => d.status === s))
    .map(s => t('live_' + s) + ': ' + board.drivers.filter(d => d.status === s).length) : [];

  return (
    <section aria-labelledby="live-title">
      <h1 id="live-title">{t('liveDrivers')}</h1>
      <label>
        {t('city')}
        <select value={cityId} onChange={e => setCityId(e.target.value)}>
          {cities.map(c => <option key={c.id} value={c.id}>{c.name}</option>)}
        </select>
      </label>
      <fieldset>
        <legend>{t('liveStatus')}</legend>
        {STATUSES.map(s => (
          <label key={s}>
            <input type="checkbox" checked={statuses.includes(s)} onChange={e => setStatuses(list => e.target.checked
              ? [...list, s] : list.filter(x => x !== s))} />
            {t('live_' + s)}
          </label>
        ))}
      </fieldset>
      <label>
        {t('vehicleClass')}
        <select value={vehicleClass} onChange={e => setVehicleClass(e.target.value)}>
          <option value="">{t('anyClass')}</option>
          {classes.map(c => <option key={c.code} value={c.code}>{c.name}</option>)}
        </select>
      </label>
      <label>
        <input type="checkbox" checked={fresh} onChange={e => setFresh(e.target.checked)} />
        {t('freshOnly')}
      </label>
      {error ? <Failure error={error} t={t} /> : null}
      {board ? <LiveMap t={t} drivers={board.drivers} center={cities.find(c => c.id === cityId)?.center} /> : null}
      {board ? (
        board.drivers.length === 0 ? <p>{t('noCars')}</p> : (
          <>
            <p>{[t('total', {count: board.drivers.length}), ...counts].join(' · ')}</p>
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
