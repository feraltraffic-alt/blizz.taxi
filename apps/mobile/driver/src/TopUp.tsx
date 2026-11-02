import {useEffect, useRef, useState} from 'react';
import {Text, View} from 'react-native';
import {ApiError} from '@blizz/api-client';
import {Alert, Button, Field, useTheme, type Shared} from '@blizz/mobile-ui';
import {ProviderPage} from './ProviderPage';

type TopUp = {id: string; state: 'PENDING' | 'COMPLETED' | 'FAILED' | 'EXPIRED'; amount_minor: number;
  currency: string; url?: string | null; fields?: Record<string, string> | null; return_url?: string | null;
  failure_reason?: string | null};

/** 1.00 … 10 000.00 with at most two decimals, in minor units; null otherwise (#326 U1). */
function minorOf(text: string): number | null {
  const value = text.trim().replace(',', '.');
  if (!/^\d+(\.\d{1,2})?$/.test(value)) return null;
  const minor = Math.round(Number(value) * 100);
  return minor >= 100 && minor <= 1_000_000 ? minor : null;
}

/**
 * Topping up the balance by card (#326, ADR 0009/0010): an amount, the provider's page, then the top-up read every
 * pollMs until it settles; a completed one reads the balance again.
 */
export function TopUpByCard({client, t, guard, failure, cityId, newId, pollMs, onCompleted}: Shared & {
  cityId: string; newId: () => string; pollMs: number; onCompleted: () => void}) {
  const [text, setText] = useState('');
  const [page, setPage] = useState<TopUp | null>(null);
  const [waiting, setWaiting] = useState<string | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const acting = useRef(false);
  const theme = useTheme();

  useEffect(() => {
    if (!waiting) return;
    let current = true;
    const check = () => {
      guard(() => client.get('/api/driver/v1/balance/card-top-ups/{top_up_id}' as never,
        {params: {top_up_id: waiting}} as never))
        .then(value => {
          const top = value as TopUp;
          if (!current || top.state === 'PENDING') return;
          setWaiting(null);
          if (top.state === 'COMPLETED') {
            setMessage(t('topUpDone', {amount: (top.amount_minor / 100).toFixed(2) + ' ' + top.currency}));
            onCompleted();
          } else if (top.state === 'FAILED') setMessage(t('topUpFailed', {reason: top.failure_reason ?? ''}));
          else setMessage(t('topUpExpired'));
        })
        .catch(() => undefined);
    };
    check();
    const timer = setInterval(check, pollMs);
    return () => {
      current = false;
      clearInterval(timer);
    };
  }, [waiting, client, guard, pollMs, t, onCompleted]);

  async function start() {
    if (acting.current || waiting) return;
    const minor = minorOf(text);
    if (minor === null) {
      setMessage(t('topUpAmount'));
      return;
    }
    acting.current = true;
    setMessage(null);
    try {
      setPage(await guard(() => client.post('/api/driver/v1/balance/card-top-ups' as never, {body: {
        command_id: newId(), city_id: cityId, amount_minor: Math.round(minor / 100)}} as never)) as TopUp);
    } catch (error) {
      setMessage(error instanceof ApiError && error.status === 404 ? t('topUpNoCards') : failure(error));
    } finally {
      acting.current = false;
    }
  }

  return (
    <View style={{gap: 4}}>
      <Field label={t('topUpSum')} value={text} onChange={setText} keyboard="decimal-pad" />
      <Button label={t('topUp')} onPress={() => void start()} disabled={Boolean(waiting)} />
      {waiting ? <Text style={{color: theme.muted}}>{t('topUpWaiting')}</Text> : null}
      {page?.url && page.fields ? (
        <ProviderPage url={page.url} fields={page.fields} returnUrl={page.return_url ?? null} onDone={() => {
          setWaiting(page.id);
          setPage(null);
        }} />
      ) : null}
      <Alert text={message} />
    </View>
  );
}
