import {useCallback, useEffect, useRef, useState} from 'react';
import {Text, View} from 'react-native';
import {Alert, Button, TopUpByCard, useTheme, type Shared} from '@blizz/mobile-ui';
import {ProviderPage} from './ProviderPage';
import {Transfer} from './Transfer';

type Balance = {currency: string; balance_minor: number; debt_limit_minor: number | null; blocked: boolean};
type Figures = {trips: number; fare_minor: number; commission_minor: number; driver_share_minor: number};
type Earnings = {currency: string; to: string; days: {date: string; figures: Figures}[]; total: Figures;
  pending: {trips: number}};
type Entry = {id: string; kind: string; currency: string; amount_minor: number; reason: string};
type Statement = {entries: Entry[]; page?: {next_cursor: string | null}};
type Rating = {count: number; average_hundredths: number};
type Promotion = {promotion_id: string; name: string; reward_minor: number; currency: string; orders_required: number;
  orders_done: number; period_end: string; rewarded: boolean};

const two = (n: number) => String(n).padStart(2, '0');
const dm = (at: string) => {
  const d = new Date(at);
  return two(d.getDate()) + '.' + two(d.getMonth() + 1) + ' ' + two(d.getHours()) + ':' + two(d.getMinutes());
};

/** Kinds the app has a name for; a new kind is shown by its code (M5). */
const KINDS = new Set(['TRIP_FARE', 'CASH_COLLECTED', 'TERMINAL_COLLECTED', 'DEPOSIT', 'BONUS', 'CARD_TOP_UP',
  'TRANSFER_IN', 'TRANSFER_OUT', 'PROMOTION', 'TIP']);

const amount = (minor: number, currency: string) => (Math.abs(minor) / 100).toFixed(2) + ' ' + currency;
const signed = (minor: number, currency: string) => (minor < 0 ? '−' : '+') + amount(minor, currency);

/**
 * A date days back from now in the city's calendar, as the server counts the days (REQ-DRV-12, #321); the device's
 * own calendar only when the city's time zone is not known.
 */
function day(now: number, back: number, timeZone: string | null): string {
  const at = new Date(now - back * 86_400_000);
  if (timeZone) {
    try {
      // en-CA writes dates as YYYY-MM-DD.
      return new Intl.DateTimeFormat('en-CA', {timeZone, year: 'numeric', month: '2-digit', day: '2-digit'})
        .format(at);
    } catch {
      // An unknown zone: the device's calendar below.
    }
  }
  return at.getFullYear() + '-' + String(at.getMonth() + 1).padStart(2, '0') + '-'
    + String(at.getDate()).padStart(2, '0');
}

/** The city's time zone from the bootstrap; null when it cannot be read. */
async function zoneOf(client: Shared['client'], service: string, cityId: string): Promise<string | null> {
  try {
    const boot = await client.get('/api/config/v1/bootstrap' as never, {query: {service}} as never) as
      {cities?: {id: string; timezone?: string}[]};
    return boot.cities?.find(c => c.id === cityId)?.timezone ?? null;
  } catch {
    return null;
  }
}

/**
 * The driver's money (#257), read only: the balance with the service, the last 7 days of the first admission city,
 * and the journal's movements, a page at a time.
 */
export function Money({client, t, guard, failure, cityId, now, service, newId, pollMs}: Shared & {
  cityId: string | undefined; now: () => number; service: string; newId: () => string; pollMs: number}) {
  const [balances, setBalances] = useState<Balance[] | null>(null);
  const [earnings, setEarnings] = useState<Earnings | null>(null);
  const [entries, setEntries] = useState<Entry[]>([]);
  const [next, setNext] = useState<string | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const [attempt, setAttempt] = useState(0);
  const reading = useRef(false);
  const theme = useTheme();
  const [rating, setRating] = useState<Rating | null>(null);
  const [promotions, setPromotions] = useState<Promotion[] | null>(null);

  // The rating and the promotions are extras: a failure of either leaves the rest of the screen (#341 R3).
  useEffect(() => {
    let current = true;
    client.get('/api/driver/v1/me/rating' as never, {} as never)
      .then(value => {if (current) setRating(value as Rating);}).catch(() => undefined);
    client.get('/api/driver/v1/promotions' as never, {} as never)
      .then(value => {if (current) setPromotions((value as {promotions: Promotion[]}).promotions);})
      .catch(() => undefined);
    return () => {current = false;};
  }, [client]);
  /** A completed top-up reads the balance again (#326 U3). */
  const reload = useCallback(() => setAttempt(a => a + 1), []);

  const load = useCallback(async () => {
    const zone = cityId ? await zoneOf(client, service, cityId) : null;
    const [b, e, h] = await Promise.all([
      guard(() => client.get('/api/driver/v1/balance')),
      cityId ? guard(() => client.get('/api/driver/v1/earnings' as never, {query: {city_id: cityId,
        from: day(now(), 6, zone), to: day(now(), 0, zone)}} as never)) : Promise.resolve(null),
      guard(() => client.get('/api/driver/v1/balance/history' as never, {query: {}} as never))
    ]);
    setBalances((b as {balances: Balance[]}).balances);
    setEarnings(e as Earnings | null);
    setEntries((h as Statement).entries);
    setNext((h as Statement).page?.next_cursor ?? null);
  }, [client, guard, cityId, service]); // the clock only names the days

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
        {query: {cursor: next}} as never)) as Statement;
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
      {rating ? <Text style={{color: theme.text}}>{rating.count > 0 ? t('ratingIs', {average:
        (rating.average_hundredths / 100).toFixed(2), count: rating.count}) : t('noRatings')}</Text> : null}
      {promotions ? (promotions.length === 0 ? <Text style={{color: theme.muted}}>{t('noPromotions')}</Text>
        : promotions.map(p => (
          <Text key={p.promotion_id} style={{color: theme.text}}>
            {t('promotionLine', {name: p.name, done: p.orders_done, required: p.orders_required, until:
              dm(p.period_end)}) + ' · ' + (p.rewarded ? t('rewardPaid') : t('rewardIs', {amount:
              (p.reward_minor / 100).toFixed(2) + ' ' + p.currency}))}
          </Text>
        ))) : null}
      <Transfer client={client} t={t} guard={guard} failure={failure} newId={newId}
        currency={balances[0]?.currency ?? 'UAH'} onSent={reload} />
      {cityId ? <TopUpByCard client={client} t={t} guard={guard} failure={failure} cityId={cityId} newId={newId}
        path="/api/driver/v1/balance/card-top-ups" Page={ProviderPage} pollMs={pollMs} onCompleted={reload} /> : null}
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
