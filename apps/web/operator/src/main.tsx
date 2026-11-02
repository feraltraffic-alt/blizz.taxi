import {createRoot} from 'react-dom/client';
import {createApiClient} from '@blizz/api-client';
import {browserRefreshTokens} from '@blizz/web-ui';
import {OperatorApp, type LiveSocket} from './App.js';

const client = createApiClient({baseUrl: window.location.origin,
  refreshTokens: browserRefreshTokens(sessionStorage, 'blizz.operator.refresh')});
const root = document.getElementById('root');
if (!root) throw new Error('Missing application root');
// The live channel of the same host: the card-pop of ringing calls (#306).
const live = {url: (window.location.protocol === 'https:' ? 'wss://' : 'ws://') + window.location.host + '/ws/v1/operator',
  // The card-pop only assigns the handlers it reads, which a browser WebSocket has.
  open: (url: string, protocols: string[]) => new WebSocket(url, protocols) as unknown as LiveSocket};
createRoot(root).render(<OperatorApp client={client} live={live} />);
