import {useCallback, useEffect, useRef, useState} from 'react';
import {Text, View} from 'react-native';
import {ApiError} from '@blizz/api-client';
import {Alert, Button, Screen, useTheme, type Shared} from '@blizz/mobile-ui';
import {ProviderPage} from './ProviderPage';

type Payment = {id: string; state: 'PENDING' | 'COMPLETED' | 'FAILED' | 'EXPIRED'; amount_minor: number;
  currency: string; url?: string | null; fields?: Record<string, string> | null; return_url?: string | null;
  failure_reason?: string | null};
type Obligation = {order_id: string; currency: string; owed_minor: number; paid_minor: number;
  remainder_minor: number};

const money = (minor: number) => (minor / 100).toFixed(2);

/**
 * What the rider still owes (#332, REQ-PAY-18): each obligation and its card repayment for the whole remainder
 * through the provider's page; the payment is read every pollMs until it settles, then the list again.
 */
export function Debts({client, t, guard, failure, newId, pollMs, onBack}: Shared & {newId: () => string;
  pollMs: number; onBack: () => void}) {
  const [items, setItems] = useState<Obligation[] | null>(null);
  const [page, setPage] = useState<Payment | null>(null);
  const [waiting, setWaiting] = useState<string | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const acting = useRef(false);
  const theme = useTheme();

  const read = useCallback(async () => {
    setItems(((await guard(() => client.get('/api/rider/v1/obligations' as never, {} as never))) as
      {items: Obligation[]}).items);
  }, [client, guard]);

  useEffect(() => {
    read().catch(error => setMessage(failure(error)));
  }, [read]); // the failure text follows the same texts

  useEffect(() => {
    if (!waiting) return;
    let current = true;
    const check = () => {
      guard(() => client.get('/api/rider/v1/payments/{payment_id}' as never, {params: {payment_id: waiting}} as never))
        .then(value => {
          const paid = value as Payment;
          if (!current || paid.state === 'PENDING') return;
          setWaiting(null);
          if (paid.state === 'COMPLETED') {
            setMessage(t('debtPaid', {amount: money(paid.amount_minor) + ' ' + paid.currency}));
            void read().catch(() => undefined);
          } else if (paid.state === 'FAILED') setMessage(t('payFailed', {reason: paid.failure_reason ?? ''}));
          else setMessage(t('payExpired'));
        })
        .catch(() => undefined);
    };
    check();
    const timer = setInterval(check, pollMs);
    return () => {
      current = false;
      clearInterval(timer);
    };
  }, [waiting, client, guard, pollMs, t, read]);

  async function pay(item: Obligation) {
    if (acting.current || waiting) return;
    acting.current = true;
    setMessage(null);
    try {
      setPage(await guard(() => client.post('/api/rider/v1/obligations/{order_id}/payment-sessions' as never,
        {params: {order_id: item.order_id}, body: {command_id: newId()}} as never)) as Payment);
    } catch (error) {
      setMessage(error instanceof ApiError && error.status === 409 ? t('payOpen') : failure(error));
    } finally {
      acting.current = false;
    }
  }

  return (
    <Screen title={t('debts')}>
      {items && items.length === 0 ? <Text style={{color: theme.muted}}>{t('noDebts')}</Text> : null}
      {(items ?? []).map(item => (
        <View key={item.order_id} style={{gap: 4}}>
          <Text style={{color: theme.error}}>{t('debtLine', {left: money(item.remainder_minor) + ' ' + item.currency,
            paid: money(item.paid_minor), owed: money(item.owed_minor)})}</Text>
          <Button label={t('payDebt', {amount: money(item.remainder_minor) + ' ' + item.currency})}
            onPress={() => void pay(item)} disabled={Boolean(waiting)} />
        </View>
      ))}
      {waiting ? <Text style={{color: theme.muted}}>{t('payWaiting')}</Text> : null}
      {page?.url && page.fields ? (
        <ProviderPage url={page.url} fields={page.fields} returnUrl={page.return_url ?? null} onDone={() => {
          setWaiting(page.id);
          setPage(null);
        }} />
      ) : null}
      <Alert text={message} />
      <Button label={t('toProfile')} onPress={onBack} />
    </Screen>
  );
}
