import {useCallback, useEffect, useRef, useState} from 'react';
import {Text, View} from 'react-native';
import {ApiError} from '@blizz/api-client';
import {Alert, Button, Screen, useTheme, type Shared} from '@blizz/mobile-ui';

type Preorder = {order_id: string; short_number: number; pickup_at: string; pickup_label: string;
  dropoff_label: string; price_minor: number | null; currency: string | null; payment_method: string};
type Reservation = {id: string; state: string; order: Preorder; confirm_from: string; confirm_until: string;
  drop_until: string};
type Reason = {code: string; labels: Record<string, string>};

const two = (n: number) => String(n).padStart(2, '0');
const hm = (at: string) => {
  const d = new Date(at);
  return two(d.getHours()) + ':' + two(d.getMinutes());
};
const dm = (at: string) => {
  const d = new Date(at);
  return two(d.getDate()) + '.' + two(d.getMonth() + 1) + ' ' + hm(at);
};

/**
 * Pre-orders by reservation (#324, ADR 0006): the ones the driver can take, and the driver's own reservations with
 * "on my way" and giving back. The windows are the server's: shown, never enforced by the phone's clock (case 20).
 */
export function Preorders({client, t, guard, failure, newId, locale, onTrip, onBack}: Shared & {newId: () => string;
  locale: string; onTrip: () => void; onBack: () => void}) {
  const [available, setAvailable] = useState<Preorder[] | null>(null);
  const [mine, setMine] = useState<Reservation[]>([]);
  const [reasons, setReasons] = useState<Reason[]>([]);
  const [reason, setReason] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const acting = useRef(false);
  const theme = useTheme();

  const read = useCallback(async () => {
    const [list, own] = await Promise.all([
      guard(() => client.get('/api/driver/v1/preorders' as never, {} as never)),
      guard(() => client.get('/api/driver/v1/preorders/reservations' as never, {} as never))]);
    setAvailable((list as {preorders: Preorder[]}).preorders);
    setMine((own as {reservations: Reservation[]}).reservations.filter(r => r.state === 'RESERVED'));
  }, [client, guard]);

  useEffect(() => {
    read().catch(error => setMessage(failure(error)));
    client.get('/api/driver/v1/cancel-reasons' as never, {} as never)
      .then(list => setReasons((list as {reasons: Reason[]}).reasons)).catch(() => setReasons([]));
  }, [read, client]); // the failure text follows the same texts

  async function once(action: () => Promise<void>, refused: (code: string) => string) {
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    try {
      await action();
    } catch (error) {
      if (error instanceof ApiError && error.status === 409) {
        setMessage(refused(error.code));
        await read().catch(() => undefined);
      } else setMessage(failure(error));
    } finally {
      acting.current = false;
    }
  }

  const reserve = (p: Preorder) => once(async () => {
    await guard(() => client.post('/api/driver/v1/preorders/{order_id}/reserve' as never,
      {params: {order_id: p.order_id}, body: {command_id: newId()}} as never));
    await read();
  }, code => code === 'ORDER_ALREADY_ASSIGNED' ? t('preorderTaken') : t('preorderRefused'));

  const confirm = (r: Reservation) => once(async () => {
    await guard(() => client.post('/api/driver/v1/preorders/reservations/{reservation_id}/confirm' as never,
      {params: {reservation_id: r.id}, body: {command_id: newId()}} as never));
    onTrip();
  }, () => t('confirmWindow', {from: hm(r.confirm_from), until: hm(r.confirm_until)}));

  function drop(r: Reservation) {
    if (!reason) {
      setMessage(t('dropReasonNeeded'));
      return;
    }
    return once(async () => {
      await guard(() => client.post('/api/driver/v1/preorders/reservations/{reservation_id}/drop' as never,
        {params: {reservation_id: r.id}, body: {command_id: newId()}} as never));
      setReason('');
      await read();
    }, () => t('dropTooLate'));
  }

  const price = (p: Preorder) => p.price_minor !== null && p.currency
    ? [(p.price_minor / 100).toFixed(2) + ' ' + p.currency] : [];
  const label = (r: Reason) => r.labels[locale] ?? r.labels.ru ?? r.code;

  return (
    <Screen title={t('preorders')}>
      <Text style={{color: theme.text}}>{t('myPreorders')}</Text>
      {mine.length === 0 ? <Text style={{color: theme.muted}}>{t('noMyPreorders')}</Text> : null}
      {mine.map(r => (
        <View key={r.id} style={{gap: 4}}>
          <Text style={{color: theme.text}}>{dm(r.order.pickup_at) + ' · ' + r.order.pickup_label + ' → '
            + r.order.dropoff_label}</Text>
          <Text style={{color: theme.muted}}>{t('confirmFromUntil', {from: hm(r.confirm_from),
            until: hm(r.confirm_until)})}</Text>
          <Text style={{color: theme.muted}}>{t('dropUntil', {until: hm(r.drop_until)})}</Text>
          {Date.now() >= Date.parse(r.confirm_from) ? <Button label={t('onMyWay')} onPress={() => void confirm(r)} />
            : null}
          <View style={{gap: 4}}>
            {reasons.map(x => <Button key={x.code} label={label(x)} onPress={() => setReason(x.code)} />)}
          </View>
          {reason ? <Text style={{color: theme.muted}}>{t('dropReason', {reason: label(reasons.find(x =>
            x.code === reason) ?? {code: reason, labels: {}})})}</Text> : null}
          <Button label={t('dropPreorder')} onPress={() => void drop(r)} />
        </View>
      ))}
      <Text style={{color: theme.text}}>{t('availablePreorders')}</Text>
      {available && available.length === 0 ? <Text style={{color: theme.muted}}>{t('noPreorders')}</Text> : null}
      {(available ?? []).map(p => (
        <View key={p.order_id} style={{gap: 4}}>
          <Text style={{color: theme.text}}>{[dm(p.pickup_at), p.pickup_label + ' → ' + p.dropoff_label, ...price(p),
            t('pay_' + p.payment_method)].join(' · ')}</Text>
          <Button label={t('takePreorder')} onPress={() => void reserve(p)} />
        </View>
      ))}
      <Alert text={message} />
      <Button label={t('home')} onPress={onBack} />
    </Screen>
  );
}
