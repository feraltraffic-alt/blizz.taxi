import {createRoot} from 'react-dom/client';
import {BrowserRouter} from 'react-router-dom';
import {createApiClient} from '@blizz/api-client';
import {AdminApp} from './App.js';
import {browserRefreshTokens} from './storage.js';

const client = createApiClient({baseUrl: window.location.origin, refreshTokens: browserRefreshTokens(sessionStorage)});
const root = document.getElementById('root');
if (!root) throw new Error('Missing application root');
createRoot(root).render(<BrowserRouter><AdminApp client={client} /></BrowserRouter>);
