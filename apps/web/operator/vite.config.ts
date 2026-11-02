import {defineConfig} from 'vite';

/** The API on the same origin (the page's CSP allows only 'self'): the dev server and the preview proxy it. */
const api = {'/api': 'http://127.0.0.1:8080', '/auth': 'http://127.0.0.1:8080'};

export default defineConfig({
  server: {proxy: api},
  preview: {proxy: api, port: 4176, strictPort: true}
});
