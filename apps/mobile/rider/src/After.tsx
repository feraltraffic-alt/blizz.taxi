import {useCallback, useEffect, useRef, useState} from 'react';
import {Text, View} from 'react-native';
import {ApiError} from '@blizz/api-client';
import {Alert, Button, Field, useTheme, type Shared} from '@blizz/mobile-ui';

type Rating = {order_id: string; score: number};
type Tip = {amount_minor: number; currency: string; method: string; state: string; failure_reason?: string | null};
type TipOptions = {currency: string; presets: {percent: number; amount_minor: number}[]; min_minor: number;
  max_minor: number; method: string | null; open: boolean; tip: Tip | null};

const money = (minor: number, currency: string) => (minor / 100).toFixed(2) + ' ' + currency;

/** After a fulfilled ride (#254): rate the driver, leave a tip. */
export function AfterRide(props: Shared & {orderId: string; newId: () => string; pollMs: number}) {
  return (
    <View style={{gap: 16}}>
      <RateDriver {...props} />
      <LeaveTip {...props} />
    </View>
  );
}

function RateDriver({client, t, guard, failure, orderId, newId}: Shared & {orderId: string; newId: () => string}) {
  const [given, setGiven] = useState<number | null>(null);
  const [thanked, setThanked] = useState(false);
  const [comment, setComment] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const sending = useRef(false);
  const theme = useTheme();
  const path = '/api/rider/v1/orders/{order_id}/rating' as never;

  useEffect(() => {
    guard(() => client.get(path, {params: {order_id: orderId}} as never))
      .then(value => setGiven((value as Rating).score))
      .catch(() => undefined); // 404: not rated yet
  }, [client, guard, orderId]);

  /** One rating at a time: a double tap with a slow answer is one (R1). */
  async function rate(score: number) {
    if (sending.current) return;
    sending.current = true;
    setMessage(null);
    try {
      const saved = await guard(() => client.post(path, {params: {order_id: orderId}, body: {command_id: newId(),
        score, ...(comment.trim() ? {comment: comment.trim()} : {})}} as never)) as Rating;
      setGiven(saved.score);
      setThanked(true);
    } catch (error) {
      setMessage(error instanceof ApiError && error.status === 409 ? t('ratingClosed') : failure(error));
    } finally {
      sending.current = false;
    }
  }

  return (
    <View style={{gap: 8}}>
      <Text style={{color: theme.text, fontWeight: '600'}}>{t('rateDriver')}</Text>
      {given !== null ? <Text style={{color: theme.text}}>{t(thanked ? 'ratingThanks' : 'ratingGiven',
        {score: given})}</Text> : null}
      <View style={{flexDirection: 'row', gap: 8}}>
        {[1, 2, 3, 4, 5].map(score => (
          <View key={score} style={{flex: 1}}>
            <Button label={String(score)} accessibilityLabel={t('score', {score})} onPress={() => void rate(score)} />
          </View>
        ))}
      </View>
      <Field label={t('ratingComment')} value={comment} onChange={setComment} />
      <Alert text={message} />
    </View>
  );
}

function LeaveTip({client, t, guard, failure, orderId, newId, pollMs}: Shared & {orderId: string;
  newId: () => string; pollMs: number}) {
  const [options, setOptions] = useState<TipOptions | null>(null);
  const [left, setLeft] = useState<Tip | null>(null);
  const [own, setOwn] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const sending = useRef(false);
  const theme = useTheme();
  const path = '/api/rider/v1/orders/{order_id}/tip' as never;

  const load = useCallback(async () => {
    const value = await guard(() => client.get(path, {params: {order_id: orderId}} as never)) as TipOptions;
    setOptions(value);
    setLeft(value.tip);
  }, [client, guard, orderId]);

  useEffect(() => {
    load().catch(error => setMessage(failure(error)));
  }, [load]); // the failure text follows the same texts

  // A card tip is PENDING until the bank answers: the tip screen is read again until it settles (R5).
  const pending = left?.state === 'PENDING';
  useEffect(() => {
    if (!pending) return;
    const timer = setInterval(() => {load().catch(() => undefined);}, pollMs);
    return () => clearInterval(timer);
  }, [pending, load, pollMs]);

  /** One tip at a time (R4); each new tip, after a declined one too, has its own command (R6). */
  async function send(amount: number) {
    if (!options || sending.current) return;
    if (!Number.isInteger(amount) || amount < options.min_minor || amount > options.max_minor) {
      setMessage(t('tipBounds', {min: (options.min_minor / 100).toFixed(2),
        max: money(options.max_minor, options.currency)}));
      return;
    }
    sending.current = true;
    setMessage(null);
    try {
      setLeft(await guard(() => client.post(path, {params: {order_id: orderId}, body: {command_id: newId(),
        amount_minor: amount}} as never)) as Tip);
    } catch (error) {
      if (error instanceof ApiError && error.status === 409) {
        setMessage(t('tipClosed'));
        await load().catch(() => undefined);
      } else setMessage(failure(error));
    } finally {
      sending.current = false;
    }
  }

  function ownAmount() {
    const value = Number(own.replace(',', '.'));
    void send(Number.isFinite(value) && own.trim() !== '' ? Math.round(value * 100) : Number.NaN);
  }

  if (!options) return message ? <Alert text={message} /> : null;
  const canTip = options.open && options.method !== null && (!left || left.state === 'FAILED');
  return (
    <View style={{gap: 8}}>
      {left ? <Text style={{color: left.state === 'FAILED' ? theme.error : theme.text}}>{tipState(t, left)}</Text>
        : null}
      {canTip ? (
        <>
          <Text style={{color: theme.text, fontWeight: '600'}}>{t('leaveTip')}</Text>
          {options.presets.map(p => (
            <Button key={p.percent} label={p.percent + ' % — ' + money(p.amount_minor, options.currency)}
              onPress={() => void send(p.amount_minor)} />
          ))}
          <Field label={t('ownTip', {currency: options.currency})} value={own} onChange={setOwn} keyboard="decimal-pad" />
          <Button label={t('sendTip')} onPress={ownAmount} />
        </>
      ) : null}
      <Alert text={message} />
    </View>
  );
}

function tipState(t: Shared['t'], tip: Tip): string {
  const amount = money(tip.amount_minor, tip.currency);
  switch (tip.state) {
    case 'PENDING': return t('tipPending', {amount});
    case 'PAID': return t(tip.method === 'WALLET' ? 'tipPaidWallet' : 'tipPaidCard', {amount});
    case 'FAILED': return t('tipFailed', {reason: tip.failure_reason ?? ''});
    default: return t(tip.method === 'TERMINAL' ? 'tipTerminal' : 'tipCash', {amount});
  }
}
