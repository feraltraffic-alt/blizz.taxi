import {spawnSync} from 'node:child_process';
import {mkdirSync, mkdtempSync, writeFileSync} from 'node:fs';
import {tmpdir} from 'node:os';
import {join} from 'node:path';
import {describe, expect, it} from 'vitest';

/** The bundle scanner of #253 (AC-23): each kind of finding is planted in a build of its own and must fail it. */
const SCRIPT = join(__dirname, '..', 'scripts', 'audit', 'bundle-secrets.mjs');

function build(files: Record<string, string>): string {
  const dir = mkdtempSync(join(tmpdir(), 'bundle-'));
  for (const [name, text] of Object.entries(files)) {
    mkdirSync(join(dir, name, '..'), {recursive: true});
    writeFileSync(join(dir, name), text);
  }
  return dir;
}

function scan(...dirs: string[]) {
  const run = spawnSync(process.execPath, [SCRIPT, ...dirs], {encoding: 'utf8'});
  return {status: run.status, out: run.stdout + run.stderr};
}

const clean = {
  'index.html': '<!doctype html><title>Blizz</title><script src="assets/app.js"></script>',
  'assets/app.js': 'const t={password:"Пароль",newPassword:"Новый пароль",token:"x"};' +
    'fetch("/api/operator/v1/me/password");fetch("/auth/v1/token/refresh");const k="refresh_token";'
};

describe('S5: what may be in a bundle', () => {
  it('a clean build passes, words like "password" and "token" included', () => {
    const result = scan(build(clean));
    expect(result.out).toContain('no secrets');
    expect(result.status).toBe(0);
  });

  it('a folder that does not exist fails rather than passing on nothing', () => {
    expect(scan(join(tmpdir(), 'no-such-build-' + Date.now())).status).not.toBe(0);
  });
});

const planted: [string, string, string][] = [
  ['S1', 'PEM private key', '"-----BEGIN ' + 'PRIVATE KEY-----\\nMIIEvQIBADANBg"'],
  ['S1', 'PEM private key', '"-----BEGIN RSA ' + 'PRIVATE KEY-----\\nMIIEpAIBAAKCAQEA"'],
  ['S2', 'AWS access key id', '"AKIA' + 'IOSFODNN7EXAMPLE"'],
  ['S2', 'Google API key', '"AIza' + 'SyA1234567890abcdefghijklmnopqrstuv"'],
  ['S2', 'GitHub token', '"ghp' + '_0123456789abcdefghijklmnopqrstuvwxyz"'],
  ['S2', 'Slack token', '"xox' + 'b-1234567890-abcdefghijkl"'],
  ['S2', 'Stripe live key', '"sk_' + 'live_0123456789abcdefghijklmn"'],
  ['S2', 'signed JWT', '"eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMjM0NTY3ODkwIn0.dozjgNryP4J3jVmNHl0w5N_XgL0n3I9PlFUP0THsR8U"'],
  ['S3', 'server secret name ACCESS_TOKEN_SECRET', 'process.env.ACCESS_TOKEN_SECRET'],
  ['S3', 'server secret name SECRETS_MASTER_KEY', '"SECRETS_MASTER_KEY"'],
  ['S3', 'server secret name STAFF_BOOTSTRAP_PASSWORD', 'env.STAFF_BOOTSTRAP_PASSWORD'],
  ['S3', 'server secret name BLIZZ_ROUTING_GRAPHHOPPER_API_KEY', '"BLIZZ_ROUTING_GRAPHHOPPER_API_KEY"'],
  ['S4', 'sandbox secret value', '"sandbox-only-access-token-secret-not-for-real-use"'],
  ['S4', 'sandbox secret value', '"sandbox-only-otp-secret-not-for-real-use-0123"'],
  ['S4', 'sandbox secret value', '"BTafAxut8u7D3rruCvQv3xUre9M69sCDmY0XHITZGJA="'],
  ['S4', 'sandbox secret value', '"Sandbox-Admin-2026"'],
  ['S4', 'sandbox secret value', '"sandbox-fake-merchant-secret-not-for-real-use"']
];

describe('S1–S4: a planted secret fails the build and is named', () => {
  it.each(planted)('%s: %s', (_id, kind, value) => {
    const dir = build({...clean, 'assets/chunk-42.js': 'export const x=' + value + ';'});
    const result = scan(build(clean), dir);
    expect(result.status).toBe(1);
    expect(result.out).toContain(join('assets', 'chunk-42.js'));
    expect(result.out).toContain(kind);
  });

  it('a secret in a source map or an HTML file is found too', () => {
    const dir = build({...clean, 'assets/app.js.map': '{"sourcesContent":["const k=\\"AKIA' + 'IOSFODNN7EXAMPLE\\""]}',
      'other.html': '<meta name="k" content="sandbox-only-access-token-secret-not-for-real-use">'});
    const result = scan(dir);
    expect(result.status).toBe(1);
    expect(result.out).toContain('app.js.map');
    expect(result.out).toContain('other.html');
  });
});
