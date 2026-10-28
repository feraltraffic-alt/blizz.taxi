// REQ-OBS-02: validate the final management-port scrape, including closed label sets.
import { readFileSync } from 'node:fs';

const definitions = {
  blizz_orders_created_total: { channel: ['APP', 'WEB', 'PHONE'], preorder: ['true', 'false'] },
  blizz_orders_cancelled_total: { by: ['RIDER', 'STAFF', 'DRIVER'], reason: ['CHANGED_MIND', 'WAIT_TOO_LONG',
    'WRONG_ADDRESS', 'OTHER_TRANSPORT', 'NO_SHOW', 'PASSENGER_ASKED', 'VEHICLE_PROBLEM', 'CANNOT_REACH',
    'DUPLICATE', 'NO_CARS', 'TEST_ORDER', 'OTHER'] },
  blizz_orders_unfulfilled_total: {},
  blizz_dispatch_first_offer_seconds_count: {},
  blizz_dispatch_assigned_seconds_count: { source: ['OFFER', 'BROADCAST', 'RESERVATION'] },
  blizz_offers_total: { outcome: ['ACCEPTED', 'DECLINED', 'EXPIRED', 'REVOKED'] },
  blizz_dispatch_excluded_total: { reason: ['STALE_LOCATION', 'PAUSED', 'NOT_ADMITTED', 'CLASS', 'PAYMENT',
    'RESTRICTED', 'PREVIOUS_DRIVER', 'ALREADY_OFFERED', 'BUSY', 'TOO_FAR'] },
  blizz_sms_sent_total: { purpose: ['OTP', 'CALLER'], state: ['SENT', 'FAILED', 'UNKNOWN'] },
};
const uuid = /[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}/i;
const phone = /\+?\d{9,15}/;

function validate(text) {
  const totals = Object.fromEntries(Object.keys(definitions).map(name => [name, 0]));
  for (const line of text.split('\n').filter(line => line.startsWith('blizz_'))) {
    const sample = /^(\w+)(?:\{(.*)\})?\s+(\S+)(?:\s+.*)?$/.exec(line);
    if (!sample) throw Error(`Unrecognized metric sample: ${line}`);
    const [, name, labels = '', raw] = sample;
    const tags = Object.fromEntries([...labels.matchAll(/(\w+)="((?:[^"\\]|\\.)*)"/g)].map(m => [m[1], m[2]]));
    for (const value of Object.values(tags)) {
      if (uuid.test(value) || phone.test(value)) throw Error(`Id/phone in ${name} label`);
    }
    const expected = definitions[name] ?? definitions[name.replace(/_(sum|max|bucket)$/, '_count')];
    if (name.endsWith('_bucket')) delete tags.le;
    if (!expected) continue; // Existing gauges and timer sum/max/bucket samples are not required counters.
    if (Object.keys(tags).sort().join() !== Object.keys(expected).sort().join()) throw Error(`Wrong tags: ${name}`);
    for (const [key, allowed] of Object.entries(expected)) {
      if (!allowed.includes(tags[key])) throw Error(`Unbounded ${key} in ${name}`);
    }
    const value = Number(raw);
    if (!Number.isFinite(value) || value < 0) throw Error(`Invalid value: ${name}`);
    if (Object.hasOwn(totals, name)) totals[name] += value;
  }
  for (const [name, total] of Object.entries(totals)) {
    if (total <= 0) throw Error(`Missing or zero metric: ${name}`);
  }
  return totals;
}

if (process.argv.includes('--self-test')) {
  const valid = Object.entries(definitions).map(([name, tags]) => `${name}{${Object.entries(tags)
    .map(([key, values]) => `${key}="${values[0]}"`).join(',')}} 1`).join('\n');
  validate(valid);
  const withTimerSum = validate(valid + '\nblizz_dispatch_assigned_seconds_sum{source="RESERVATION"} 0');
  if (Object.keys(withTimerSum).length !== Object.keys(definitions).length) throw Error('Unexpected totals');
  for (const bad of [valid.replace('blizz_offers_total', 'missing'), valid.replace('outcome="ACCEPTED"', 'outcome="ARBITRARY"'),
    valid.replace('preorder="true"', 'preorder="+380671234567"'), valid.replace('channel="APP"', 'channel="12345678-abcd-abcd-abcd-123456789abc"'),
    valid.replace('purpose="OTP"', 'purpose="OTP",extra="CUSTOM"'), valid.replace(/ 1/g, ' 0'), valid.replace(/ 1/g, ' NaN'),
    valid + '\nblizz_outbox_pending{type="12345678-abcd-abcd-abcd-123456789abc"} 1',
    valid + '\nblizz_dispatch_assigned_seconds_sum{source="CUSTOM"} 1']) {
    let failed = false;
    try { validate(bad); } catch { failed = true; }
    if (!failed) throw Error('Validator accepted deliberately invalid metrics');
  }
  console.log('Metric validator: good scrape accepted; missing, unknown, id/phone, extra, zero and NaN rejected');
} else {
  console.log(JSON.stringify(validate(readFileSync(0, 'utf8')), null, 2));
}
