import {useCallback, useEffect, useRef, useState} from 'react';
import {Text, View} from 'react-native';
import {Alert, Button, useTheme, type Shared} from '@blizz/mobile-ui';

type Balance = {currency: string; balance_minor: number; debt_limit_minor: number | null; blocked: boolean};
type Figures = {trips: number; fare_minor: number; commission_minor: number; driver_share_minor: number};
type Earnings = {currency: string; to: string; days: {date: string; figures: Figures}[]; total: Figures;
  pending: {trips: number}};
type Entry = {id: string; kind: string; currency: string; amount_minor: number; reason: string};
type Statement = {entries: Entry[]; page?: {next_cursor: string | null}};

/** Kinds the app has a name for; a new kind is shown by its code (M5). */
const KINDS = new Set(['TRIP_FARE', 'CASH_COLLECTED', 'TERMINAL_COLLECTED', 'DEPOSIT', 'BONUS', 'CARD_TOP_UP',
  'TRANSFER_IN', 'TRANSFER_OUT', 'PROMOTION', 'TIP']);

const amount = (minor: number, currency: string) => (Math.abs(minor) / 100).toFixed(2) + ' ' + currency;
const signed = (minor: number, currency: string) => (minor < 0 ? '−' : '+') + amount(minor, currency);

/** The device's calendar date, days back from now. */
function day(now: number, back: number): string {
  const date = new Date(now - back * 86_400_000);
  return date.getFullYear() + '-' + String(date.getMonth() + 1).padStart(2, '0') + '-'
    + String(date.getDate()).padStart(2, '0');
}

/**
 * The driver's money (#257), read only: the balance with the service, the last 7 days of the first admission city,
 * and the journal's movements, a page at a time.
 */
export function Money({client, t, guard, failure, cityId, now}: Shared & {cityId: string | undefined;
  now: () => number}) {
  const [balances, setBalances] = useState<Balance[] | null>(null);
  const [earnings, setEarnings] = useState<Earnings | null>(null);
  const [entries, setEntries] = useState<Entry[]>([]);
  const [next, setNext] = useState<string | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const [attempt, setAttempt] = useState(0);
  const reading = useRef(false);
  const theme = useTheme();

  const load = useCallback(async () => {
    const [b, e, h] = await Promise.all([
      guard(() => client.get('/api/driver/v1/balance')),
      cityId ? guard(() => client.get('/api/driver/v1/earnings' as never, {query: {city_id: cityId,
        from: day(now(), 6), to: day(now(), 0)}} as never)) : Promise.resolve(null),
      guard(() => client.get('/api/driver/v1/balance/history' as never, {query: {}} as never))
    ]);
    setBalances((b as {balances: Balance[]}).balances);
    setEarnings(e as Earnings | null);
    setEntries((h as Statement).entries);
    setNext((h as Statement).page?.next_cursor ?? null);
  }, [client, guard, cityId]); // the clock only names the days

  useEffect(() => {
    setMessage(null);
    load().catch(error => setMessage(failure(error)));
  }, [load, attempt]); // the failure text follows the same texts

  /** The next page by its cursor, once at a time (M4). */
  async function more() {
    if (!next || reading.current) return;
    reading.current = true;
    try {
      const page = await guard(() => client.get('/api/driver/v1/balance/history' as never,
        {query: {}} as never)) as Statement;
      setEntries(list => [...list, ...page.entries]);
      setNext(page.page?.next_cursor ?? null);
    } catch (error) {
      setMessage(failure(error));
    } finally {
      reading.current = false;
    }
  }

  if (!balances) {
    return (
      <View style={{gap: 12}}>
        <Alert text={message} />
        {message ? <Button label={t('retry')} onPress={() => setAttempt(a => a + 1)} /> : null}
      </View>
    );
  }
  const today = earnings?.days.find(d => d.date === earnings.to)?.figures;
  return (
    <View style={{gap: 12}}>
      {balances.map(b => (
        <View key={b.currency} style={{gap: 4}}>
          <Text style={{color: b.balance_minor < 0 ? theme.error : theme.text, fontWeight: '600'}}>
            {b.balance_minor > 0 ? t('owedToYou', {amount: amount(b.balance_minor, b.currency)})
              : b.balance_minor < 0 ? t('youOwe', {amount: amount(b.balance_minor, b.currency)})
                : t('balanceZero', {amount: amount(0, b.currency)})}
          </Text>
          {b.debt_limit_minor !== null ? (
            <Text style={{color: theme.muted}}>{t('debtLimit', {amount: amount(b.debt_limit_minor, b.currency)})}</Text>
          ) : null}
          {b.blocked ? <Text style={{color: theme.error}}>{t('blockedByDebt')}</Text> : null}
        </View>
      ))}
      {earnings ? (
        <>
          <Text style={{color: theme.text}}>{t('week', {trips: earnings.total.trips,
            fare: amount(earnings.total.fare_minor, earnings.currency),
            commission: amount(earnings.total.commission_minor, earnings.currency),
            share: amount(earnings.total.driver_share_minor, earnings.currency)})}</Text>
          {today ? <Text style={{color: theme.text}}>{t('today', {trips: today.trips,
            fare: amount(today.fare_minor, earnings.currency),
            share: amount(today.driver_share_minor, earnings.currency)})}</Text> : null}
          {earnings.pending.trips > 0 ? (
            <Text style={{color: theme.muted}}>{t('pendingTrips', {trips: earnings.pending.trips})}</Text>
          ) : null}
        </>
      ) : null}
      <Text style={{color: theme.text, fontWeight: '600'}}>{t('movements')}</Text>
      {entries.length === 0 ? <Text style={{color: theme.muted}}>{t('noMovements')}</Text> : null}
      {entries.map(e => (
        <Text key={e.id} style={{color: theme.text}}>
          {signed(e.amount_minor, e.currency) + ' · ' + (KINDS.has(e.kind) ? t('kind_' + e.kind) : e.kind) + ' · '
            + e.reason}
        </Text>
      ))}
      {next ? <Button label={t('moreMovements')} onPress={() => void more()} /> : null}
      <Button label={t('refresh')} onPress={() => setAttempt(a => a + 1)} />
      <Alert text={message} />
    </View>
  );
}
