import {useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

type Order = {id: string; status: string; version: number; city_id?: string};
type Reason = {code: string; labels: Record<string, string>};
type Driver = {driver_id: string; name?: string | null; car?: {registration_number: string} | null};

/**
 * Taking the driver off an ASSIGNED order (orders.reassign) and offering a SEARCHING order to a chosen free driver
 * (orders.offer, audited) (#294). Each is offered only with its right and in its status; one command at a time.
 */
export function OrderActions<O extends Order>({client, t, order, rights, newId, onChange, refresh}: {client: ApiClient;
  t: Translate; order: O; rights: Set<string>; newId: () => string; onChange: (order: O) => void;
  refresh: () => Promise<void>}) {
  const canRevoke = rights.has('orders.reassign') && order.status === 'ASSIGNED';
  const canOffer = rights.has('orders.offer') && order.status === 'SEARCHING' && Boolean(order.city_id);
  const [reasons, setReasons] = useState<Reason[]>([]);
  const [reasonCode, setReasonCode] = useState('');
  const [comment, setComment] = useState('');
  const [drivers, setDrivers] = useState<Driver[]>([]);
  const [driverId, setDriverId] = useState('');
  const [offerReason, setOfferReason] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  useEffect(() => {
    if (!canRevoke) return;
    let current = true;
    client.get('/api/operator/v1/reassign-reasons' as never, {} as never)
      .then(list => {if (current) setReasons((list as {reasons: Reason[]}).reasons);})
      .catch(failure => {if (current) setError(failure);});
    return () => {current = false;};
  }, [client, canRevoke]);

  useEffect(() => {
    if (!canOffer) return;
    let current = true;
    client.get('/api/operator/v1/drivers/live' as never, {query: {city_id: order.city_id, status: ['FREE']}} as never)
      .then(board => {if (current) setDrivers((board as {drivers: Driver[]}).drivers);})
      .catch(failure => {if (current) setError(failure);});
    return () => {current = false;};
  }, [client, canOffer, order.city_id]);

  async function command(path: string, body: Record<string, unknown>) {
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      onChange(await client.post(('/api/operator/v1/orders/{order_id}/' + path) as never,
        {params: {order_id: order.id}, body: {command_id: newId(), ...body}} as never) as O);
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        if (failure.code === 'DRIVER_NOT_ELIGIBLE') setMessage(t('driverNotEligible'));
        else if (failure.code === 'DRIVER_BUSY') setMessage(t('driverBusy'));
        else {
          setMessage(t('orderChanged'));
          await refresh().catch(() => undefined);
        }
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  function revoke() {
    if (!reasonCode || comment.length > 500) {
      setMessage(t('revokeReasonNeeded'));
      return;
    }
    return command('revoke-assignment', {expected_version: order.version, reason_code: reasonCode,
      ...(comment.trim() ? {comment: comment.trim()} : {})});
  }

  function offer() {
    const why = offerReason.trim();
    if (!driverId || why === '' || why.length > 500) {
      setMessage(t('offerNeeds'));
      return;
    }
    return command('manual-offers', {driver_id: driverId, reason: why});
  }

  if (!canRevoke && !canOffer) return null;
  return (
    <section aria-label={t('driverActions')}>
      {canRevoke ? (
        <fieldset>
          <legend>{t('revokeDriver')}</legend>
          <label>
            {t('revokeReason')}
            <select value={reasonCode} onChange={e => setReasonCode(e.target.value)}>
              <option value="" />
              {reasons.map(r => <option key={r.code} value={r.code}>{r.labels.ru ?? r.labels.uk ?? r.code}</option>)}
            </select>
          </label>
          <label>
            {t('revokeComment')}
            <input value={comment} onChange={e => setComment(e.target.value)} />
          </label>
          <button type="button" onClick={() => void revoke()}>{t('revokeDriver')}</button>
        </fieldset>
      ) : null}
      {canOffer ? (
        <fieldset>
          <legend>{t('offerOrder')}</legend>
          <label>
            {t('offerDriver')}
            <select value={driverId} onChange={e => setDriverId(e.target.value)}>
              <option value="" />
              {drivers.map(d => (
                <option key={d.driver_id} value={d.driver_id}>
                  {(d.name ?? t('noName')) + ' · ' + (d.car ? d.car.registration_number : t('noCar'))}
                </option>
              ))}
            </select>
          </label>
          <label>
            {t('offerReason')}
            <input value={offerReason} onChange={e => setOfferReason(e.target.value)} />
          </label>
          <button type="button" onClick={() => void offer()}>{t('offerOrder')}</button>
        </fieldset>
      ) : null}
      {message ? <p role="alert">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
