import {useEffect, useState} from 'react';
import type {ApiClient} from '@blizz/api-client';
import {LiveBoard, type Translate} from '@blizz/web-ui';

type City = {id: string; name: string; center?: {lat: number; lon: number}};

/**
 * The admin panel's live map of the drivers (#482, REQ-ADM-01, ADR 0017): the board shared with the operator panel,
 * on the admin API. The admin API has no vehicle classes list, so the board has no class filter here.
 */
export function LivePage({client, t, pollMs = 5_000}: {client: ApiClient; t: Translate; pollMs?: number}) {
  const [cities, setCities] = useState<City[] | null>(null);

  useEffect(() => {
    client.get('/api/config/v1/bootstrap' as never, {} as never)
      .then(boot => setCities((boot as {cities: City[]}).cities)).catch(() => setCities([]));
  }, [client]);

  if (!cities) return <p>{t('loading')}</p>;
  return <LiveBoard client={client} t={t} cities={cities} pollMs={pollMs} api="/api/admin/v1" classes={false} />;
}
