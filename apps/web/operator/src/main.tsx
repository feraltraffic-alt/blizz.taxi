import {createRoot} from 'react-dom/client';
import {createApiClient} from '@blizz/api-client';
import {browserRefreshTokens} from '@blizz/web-ui';
import {OperatorApp} from './App.js';

const client = createApiClient({baseUrl: window.location.origin,
  refreshTokens: browserRefreshTokens(sessionStorage, 'blizz.operator.refresh')});
const root = document.getElementById('root');
if (!root) throw new Error('Missing application root');
createRoot(root).render(<OperatorApp client={client} />);

// Mutation (#253): a server secret that must never ship; the Web job must fail on it.
(globalThis as Record<string, unknown>).leak = 'sandbox-only-access-token-secret-not-for-real-use';
