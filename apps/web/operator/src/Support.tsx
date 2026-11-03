import type {ApiClient} from '@blizz/api-client';
import {Support as SharedSupport, type Translate} from '@blizz/web-ui';

/** The support screen of the operator workstation (#288), shared with the admin panel since #420. */
export function Support(props: {client: ApiClient; t: Translate; cities: {id: string; name: string}[]; me: string;
  newId: () => string}) {
  return <SharedSupport {...props} api="/api/operator/v1" />;
}
