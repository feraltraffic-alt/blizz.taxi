import type {ApiClient} from '@blizz/api-client';

// Tests-first boundary: the workstation follows after the red CI run.
export function OperatorApp(_props: {client: ApiClient; newId?: () => string; pollMs?: number}) {
  return <main />;
}
