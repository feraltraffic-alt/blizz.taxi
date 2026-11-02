import {useCallback, useEffect, useState} from 'react';
import {Text, View} from 'react-native';
import {Alert, Button, Screen, TopUpByCard, useTheme, type Shared} from '@blizz/mobile-ui';
import {ProviderPage} from './ProviderPage';

type Wallet = {balances: {currency: string; available_minor: number}[]; entries: {id: string; kind: string;
  currency: string; amount_minor: number; reason: string}[]};
type City = {id: string; name: string};

/** Kinds the app has a name for; a new kind is shown by its code. */
const KINDS = new Set(['STAFF_TOP_UP', 'CARD_TOP_UP', 'PROMOTION', 'TRIP_PAYMENT', 'TIP']);
const amount = (minor: number, currency: string) => (Math.abs(minor) / 100).toFixed(2) + ' ' + currency;

/**
 * The rider's bonus account (#334, ADR 0009): the available balance, the movements, and a card top-up through the
 * shared form; with several cities the rider chooses whose merchant takes the money.
 */
export function WalletScreen({client, t, guard, failure, newId, service, pollMs, onBack}: Shared & {
  newId: () => string; service: string; pollMs: number; onBack: () => void}) {
  const [wallet, setWallet] = useState<Wallet | null>(null);
  const [cities, setCities] = useState<City[]>([]);
  const [cityId, setCityId] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const theme = useTheme();

  const read = useCallback(async () => {
    setWallet(await guard(() => client.get('/api/rider/v1/wallet' as never, {} as never)) as Wallet);
  }, [client, guard]);

  useEffect(() => {
    read().catch(error => setMessage(failure(error)));
  }, [read]); // the failure text follows the same texts

  useEffect(() => {
    client.get('/api/config/v1/bootstrap' as never, {query: {service}} as never)
      .then(boot => {
        const list = (boot as {cities: City[]}).cities;
        setCities(list);
        setCityId(id => id || list[0]?.id || '');
      })
      .catch(() => setCities([]));
  }, [client, service]);

  const reload = useCallback(() => {void read().catch(() => undefined);}, [read]);

  return (
    <Screen title={t('wallet')}>
      {(wallet?.balances ?? []).map(b => (
        <Text key={b.currency} style={{color: theme.text, fontWeight: '600'}}>
          {t('walletAvailable', {amount: amount(b.available_minor, b.currency)})}
        </Text>
      ))}
      {cities.length > 1 ? (
        <View style={{gap: 4}}>
          {cities.map(c => (
            <Button key={c.id} label={(c.id === cityId ? '● ' : '') + t('walletCity', {city: c.name})}
              accessibilityLabel={t('walletCity', {city: c.name})} onPress={() => setCityId(c.id)} />
          ))}
        </View>
      ) : null}
      {cityId ? <TopUpByCard client={client} t={t} guard={guard} failure={failure} cityId={cityId} newId={newId}
        path="/api/rider/v1/wallet/card-top-ups" Page={ProviderPage} pollMs={pollMs} onCompleted={reload} /> : null}
      {(wallet?.entries ?? []).map(e => (
        <Text key={e.id} style={{color: theme.text}}>
          {(e.amount_minor < 0 ? '−' : '+') + amount(e.amount_minor, e.currency) + ' · '
            + (KINDS.has(e.kind) ? t('walletKind_' + e.kind) : e.kind) + ' · ' + e.reason}
        </Text>
      ))}
      <Alert text={message} />
      <Button label={t('toProfile')} onPress={onBack} />
    </Screen>
  );
}
