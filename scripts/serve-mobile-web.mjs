// A mobile app's web build for its end-to-end run (#137, #237): `node scripts/serve-mobile-web.mjs <app> <port>`
// serves the static files of apps/mobile/<app>/dist, and the API on the same origin, proxied to 127.0.0.1:8080.
import {createServer, request} from 'node:http';
import {readFile} from 'node:fs/promises';
import {extname, join, normalize} from 'node:path';

const [app = 'rider', portArg = '4174'] = process.argv.slice(2);
const root = join(process.cwd(), 'apps/mobile', app, 'dist');
const types = {'.html': 'text/html', '.js': 'text/javascript', '.css': 'text/css', '.json': 'application/json',
  '.png': 'image/png', '.ico': 'image/x-icon', '.ttf': 'font/ttf'};
const port = Number(portArg);

createServer(async (req, res) => {
  const url = new URL(req.url ?? '/', 'http://localhost');
  if (/^\/(api|auth|sandbox)\//.test(url.pathname)) {
    const upstream = request({host: '127.0.0.1', port: 8080, path: req.url, method: req.method, headers: req.headers},
      answer => {res.writeHead(answer.statusCode ?? 502, answer.headers); answer.pipe(res);});
    upstream.on('error', () => {res.writeHead(502); res.end();});
    req.pipe(upstream);
    return;
  }
  const path = normalize(url.pathname).replace(/^(\.\.[/\\])+/, '');
  for (const file of [join(root, path), join(root, 'index.html')]) {
    try {
      const body = await readFile(file);
      res.writeHead(200, {'Content-Type': types[extname(file)] ?? 'application/octet-stream'});
      res.end(body);
      return;
    } catch {
      // the next candidate: a path of the app falls back to index.html
    }
  }
  res.writeHead(404);
  res.end();
}).listen(port, '127.0.0.1');
