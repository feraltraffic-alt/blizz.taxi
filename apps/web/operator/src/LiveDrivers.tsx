import type {ApiClient} from '@blizz/api-client';
import {LiveBoard, type Translate} from '@blizz/web-ui';

/** The cars on the line (#286, REQ-OPS-01): the shared live board (#482) on the operator's API. */
export function LiveDrivers({client, t, cities, pollMs}: {client: ApiClient; t: Translate;
  cities: {id: string; name: string; center?: {lat: number; lon: number}}[]; pollMs: number}) {
  return <LiveBoard client={client} t={t} cities={cities} pollMs={pollMs} api="/api/operator/v1" />;
}
