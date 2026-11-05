// Mints access tokens for the seeded load subjects (issue #146 part 3), as the server signs them: HS256 with the
// sandbox's access-token secret, its instance id as issuer. The device sessions are in seed.sql.
// Usage: node tokens.mjs DRIVERS RIDERS > tokens.json   (ACCESS_TOKEN_SECRET, INSTANCE_ID, SERVICE_ID from the environment)
import { createHash, createHmac } from 'node:crypto';

const secret = process.env.ACCESS_TOKEN_SECRET ?? 'sandbox-only-access-token-secret-not-for-real-use';
const instance = process.env.INSTANCE_ID ?? '00000000-0000-4000-8000-00000000005a';
// The taxi service of the seeded subjects and their device sessions (ADR 0016): the first one. A token without it no
// longer matches its session, so every request of a run was refused with 401 from 01.11 on.
const service = process.env.SERVICE_ID ?? '5e000000-0000-4000-8000-000000000001';
const [drivers, riders] = process.argv.slice(2).map(Number);

// PostgreSQL's md5(text)::uuid
const uuid = (text) => createHash('md5').update(text).digest('hex')
  .replace(/^(.{8})(.{4})(.{4})(.{4})(.{12})$/, '$1-$2-$3-$4-$5');
const b64 = (value) => Buffer.from(typeof value === 'string' ? value : JSON.stringify(value)).toString('base64url');
const now = Math.floor(Date.now() / 1000);

function token(type, audience, id, sid) {
  const head = b64({ alg: 'HS256' });
  const body = b64({ iss: instance, sub: id, aud: audience, iat: now, exp: now + 6 * 3600, jti: uuid(`jti-${sid}`),
                     sub_type: type, sid, iid: instance, svc: service });
  const signature = createHmac('sha256', secret).update(`${head}.${body}`).digest('base64url');
  return `${head}.${body}.${signature}`;
}

const out = { drivers: [], riders: [] };
for (let n = 1; n <= drivers; n++) {
  const id = uuid(`load-driver-${n}`);
  out.drivers.push({ id, vehicle: uuid(`load-vehicle-${n}`),
                     token: token('DRIVER', 'driver', id, uuid(`load-session-driver-${n}`)) });
}
for (let n = 1; n <= riders; n++) {
  const id = uuid(`load-rider-${n}`);
  out.riders.push({ id, token: token('CLIENT', 'rider', id, uuid(`load-session-rider-${n}`)) });
}
process.stdout.write(JSON.stringify(out));
