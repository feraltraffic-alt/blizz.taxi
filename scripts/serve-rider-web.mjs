// The rider app's web build for the end-to-end run (#137): static files from apps/mobile/rider/dist, and the API on
// the same origin, proxied to the server at 127.0.0.1:8080.
import {createServer, request} from 'node:http';
import {readFile} from 'node:fs/promises';
import {extname, join, normalize} from 'node:path';

const root = join(process.cwd(), 'apps/mobile/rider/dist');
const types = {'.html': 'text/html', '.js': 'text/javascript', '.css': 'text/css', '.json': 'application/json',
  '.png': 'image/png', '.ico': 'image/x-icon', '.ttf': 'font/ttf'};
const port = Number(process.env.PORT ?? 4174);

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
