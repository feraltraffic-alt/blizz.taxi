import {useCallback, useEffect, useRef, useState} from 'react';
import {Text, View} from 'react-native';
import {ApiError} from '@blizz/api-client';
import {Alert, Button, Screen, useTheme, type Shared} from '@blizz/mobile-ui';
import {ProviderPage} from './ProviderPage';

type Card = {id: string; masked_pan: string; card_type: string | null};
type Binding = {id: string; state: 'PENDING' | 'COMPLETED' | 'FAILED' | 'EXPIRED'; url?: string | null;
  fields?: Record<string, string> | null; return_url?: string | null; failure_reason?: string | null};

/**
 * The rider's saved cards (#269): listed by the masked number, removed, and added through the provider's page; the
 * binding is read until it settles. Paying by card comes next.
 */
export function Cards({client, t, guard, failure, newId, service, pollMs, onBack}: Shared & {newId: () => string;
  service: string; pollMs: number; onBack: () => void}) {
  const [cards, setCards] = useState<Card[] | null>(null);
  const [page, setPage] = useState<Binding | null>(null);
  const [waiting, setWaiting] = useState<string | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const [attempt, setAttempt] = useState(0);
  const [cities, setCities] = useState<{id: string; name: string}[]>([]);
  const acting = useRef(false);
  const theme = useTheme();

  const list = useCallback(async () => {
    setCards(((await guard(() => client.get('/api/rider/v1/cards'))) as {cards: Card[]}).cards);
  }, [client, guard]);

  useEffect(() => {
    setMessage(null);
    list().catch(error => setMessage(failure(error)));
  }, [list, attempt]); // the failure text follows the same texts

  // A card is bound for one city's merchant: with several cities the rider says which (#271 found an order in Kyiv
  // refused for a card bound in the bootstrap's first city).
  useEffect(() => {
    client.get('/api/config/v1/bootstrap' as never, {query: {service}} as never)
      .then(boot => setCities((boot as {cities: {id: string; name: string}[]}).cities))
      .catch(() => setCities([]));
  }, [client, service]);

  // After the provider's page: the binding is read until it is no longer PENDING.
  useEffect(() => {
    if (!waiting) return;
    let current = true;
    const timer = setInterval(() => {
      guard(() => client.get('/api/rider/v1/card-bindings/{binding_id}' as never,
        {params: {binding_id: waiting}} as never))
        .then(async value => {
          const binding = value as Binding;
          if (!current || binding.state === 'PENDING') return;
          setWaiting(null);
          if (binding.state === 'COMPLETED') {
            setMessage(t('cardAdded'));
            await list().catch(() => undefined);
          } else if (binding.state === 'FAILED') {
            setMessage(t('cardFailed', {reason: binding.failure_reason ?? ''}));
          } else setMessage(t('cardExpired'));
        })
        .catch(() => undefined);
    }, pollMs);
    return () => {
      current = false;
      clearInterval(timer);
    };
  }, [waiting, client, guard, list, pollMs, t]);

  /** One binding at a time (K4), for the chosen city. */
  async function add(city: {id: string} | undefined) {
    if (acting.current || waiting) return;
    acting.current = true;
    setMessage(null);
    try {
      if (!city) {
        setMessage(t('noCardsHere'));
        return;
      }
      const binding = await guard(() => client.post('/api/rider/v1/card-bindings', {body: {command_id: newId(),
        city_id: city.id}} as never)) as Binding;
      setPage(binding);
    } catch (error) {
      setMessage(error instanceof ApiError && error.status === 404 ? t('noCardsHere') : failure(error));
    } finally {
      acting.current = false;
    }
  }

  async function remove(card: Card) {
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    try {
      await guard(() => client.post('/api/rider/v1/cards/{card_id}/remove' as never, {params: {card_id: card.id},
        body: {command_id: newId()}} as never));
      setCards(list => (list ?? []).filter(c => c.id !== card.id));
    } catch (error) {
      setMessage(failure(error));
    } finally {
      acting.current = false;
    }
  }

  return (
    <Screen title={t('cards')}>
      {cards === null ? (message ? <Button label={t('retry')} onPress={() => setAttempt(a => a + 1)} /> : null) : (
        <>
          {cards.length === 0 ? <Text style={{color: theme.muted}}>{t('noCards')}</Text> : null}
          {cards.map(c => (
            <View key={c.id} style={{gap: 4}}>
              <Text style={{color: theme.text}}>{(c.card_type ? c.card_type + ' ' : '') + c.masked_pan}</Text>
              <Button label={t('removeCard')} accessibilityLabel={t('removeCardOf', {pan: c.masked_pan})}
                onPress={() => void remove(c)} />
            </View>
          ))}
          {cities.length > 1 ? cities.map(city => (
            <Button key={city.id} label={t('addCardIn', {city: city.name})} onPress={() => void add(city)}
              disabled={Boolean(waiting)} />
          )) : <Button label={t('addCard')} onPress={() => void add(cities[0])} disabled={Boolean(waiting)} />}
          {waiting ? <Text style={{color: theme.muted}}>{t('cardWaiting')}</Text> : null}
        </>
      )}
      {page?.url && page.fields ? (
        <ProviderPage url={page.url} fields={page.fields} returnUrl={page.return_url ?? null} onDone={() => {
          setWaiting(page.id);
          setPage(null);
        }} />
      ) : null}
      <Alert text={message} />
      <Button label={t('back')} onPress={onBack} />
    </Screen>
  );
}
