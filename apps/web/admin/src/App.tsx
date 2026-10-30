import type {ApiClient} from '@blizz/api-client';

// Tests-first boundary. Behavior is implemented only after the required red CI run.
export function AdminApp(_props: {client: ApiClient}) {
  return <main><h1>Blizz</h1></main>;
}
