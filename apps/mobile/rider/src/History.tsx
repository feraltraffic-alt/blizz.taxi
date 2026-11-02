import {useCallback, useEffect, useRef, useState} from 'react';
import {Text, View} from 'react-native';
import {Alert, Button, Chat, Screen, useTheme, type Shared} from '@blizz/mobile-ui';
import {AfterRide} from './After';

type Item = {id: string; short_number: number; status: string; created_at: string; pickup_label: string;
  dropoff_label: string; price_minor: number | null; final_price_minor: number | null; currency: string | null;
  driver: {name: string} | null; chat_available: boolean};
type Page = {items: Item[]; page: {next_cursor: string | null}};

const two = (n: number) => String(n).padStart(2, '0');
/** The device's local date and time of an order. */
function when(at: string): string {
  const d = new Date(at);
  return two(d.getDate()) + '.' + two(d.getMonth() + 1) + '.' + d.getFullYear() + ' ' + two(d.getHours()) + ':'
    + two(d.getMinutes());
}

/** The rider's orders, newest first, a page at a time (#267); an order opens with its rating, tip and chat. */
export function History(props: Shared & {newId: () => string; pollMs: number; onBack: () => void}) {
  const {client, t, guard, failure, onBack} = props;
  const [items, setItems] = useState<Item[] | null>(null);
  const [next, setNext] = useState<string | null>(null);
  const [open, setOpen] = useState<Item | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const [attempt, setAttempt] = useState(0);
  const reading = useRef(false);
  const theme = useTheme();

  const read = useCallback(async (cursor: string | null) => {
    return await guard(() => client.get('/api/rider/v1/orders' as never,
      {query: cursor ? {cursor} : {}} as never)) as Page;
  }, [client, guard]);

  useEffect(() => {
    setMessage(null);
    read(null).then(first => {
      setItems(first.items);
      setNext(first.page.next_cursor);
    }).catch(error => setMessage(failure(error)));
  }, [read, attempt]); // the failure text follows the same texts

  /** The next page by its cursor, once at a time. */
  async function more() {
    if (!next || reading.current) return;
    reading.current = true;
    try {
      const page = await read(next);
      setItems(list => [...(list ?? []), ...page.items]);
      setNext(page.page.next_cursor);
    } catch (error) {
      setMessage(failure(error));
    } finally {
      reading.current = false;
    }
  }

  const meta = (o: Item) => {
    const price = o.final_price_minor ?? o.price_minor;
    return ['№ ' + o.short_number, t('status_' + o.status),
      ...(price !== null && o.currency ? [(price / 100).toFixed(2) + ' ' + o.currency] : []),
      ...(o.driver ? [o.driver.name] : [])].join(' · ');
  };

  if (open) {
    return (
      <Screen title={open.pickup_label + ' → ' + open.dropoff_label}>
        <Text style={{color: theme.text}}>{meta(open)}</Text>
        <Text style={{color: theme.muted}}>{when(open.created_at)}</Text>
        {open.status === 'FULFILLED' ? <AfterRide {...props} orderId={open.id} /> : null}
        {open.chat_available ? <Chat {...props} path="/api/rider/v1/orders/{order_id}/messages"
          params={{order_id: open.id}} me="RIDER" /> : null}
        <Button label={t('back')} onPress={() => setOpen(null)} />
      </Screen>
    );
  }
  return (
    <Screen title={t('history')}>
      {items === null ? (
        <>
          <Alert text={message} />
          {message ? <Button label={t('retry')} onPress={() => setAttempt(a => a + 1)} /> : null}
        </>
      ) : (
        <>
          {items.length === 0 ? <Text style={{color: theme.muted}}>{t('noHistory')}</Text> : null}
          {items.map(o => (
            <View key={o.id} style={{gap: 4}}>
              <Button label={o.pickup_label + ' → ' + o.dropoff_label} onPress={() => setOpen(o)} />
              <Text style={{color: theme.text}}>{meta(o)}</Text>
              <Text style={{color: theme.muted}}>{when(o.created_at)}</Text>
            </View>
          ))}
          {next ? <Button label={t('moreHistory')} onPress={() => void more()} /> : null}
          <Alert text={message} />
        </>
      )}
      <Button label={t('toRide')} onPress={onBack} />
    </Screen>
  );
}
