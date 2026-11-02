import type {ApiClient} from '@blizz/api-client';
import type {Locale} from './i18n';

export interface AppConfig {
  service: string;
  deviceRef: string;
  locale?: Locale;
  newId?: () => string;
  now?: () => number;
}

// Tests-first boundary: the screens follow after the red CI run.
export function RiderApp(_props: {client: ApiClient; config: AppConfig}) {
  return null;
}
