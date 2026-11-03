import {useEffect, useState} from 'react';
import type {ApiClient} from '@blizz/api-client';
import {Support, type Translate} from '@blizz/web-ui';

/** Support cases for holders of support.manage (#420): the operator's screen on the admin API. */
export function SupportCases({client, t, me, newId}: {client: ApiClient; t: Translate; me: string;
  newId: () => string}) {
  const [cities, setCities] = useState<{id: string; name: string}[] | null>(null);

  useEffect(() => {
    client.get('/api/config/v1/bootstrap' as never, {} as never)
      .then(boot => setCities((boot as {cities: {id: string; name: string}[]}).cities)).catch(() => setCities([]));
  }, [client]);

  if (!cities) return <p>{t('loading')}</p>;
  return <Support client={client} t={t} cities={cities} me={me} newId={newId} api="/api/operator/v1" />;
}
