import type {ApiClient} from '@blizz/api-client';
import type {Locale} from '@blizz/mobile-ui';

export interface Position {
  lat: number;
  lon: number;
  accuracy_m?: number;
}

export interface AppConfig {
  service: string;
  deviceRef: string;
  locate: () => Promise<Position>;
  heartbeatMs?: number;
  locale?: Locale;
  newId?: () => string;
  now?: () => number;
}

// Tests-first boundary: the screens follow after the red CI run.
export function DriverApp(_props: {client: ApiClient; config: AppConfig}) {
  return null;
}
