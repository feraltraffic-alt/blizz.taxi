// The L1 run's numbers as Markdown (REQ-NFR-04, issue #146 part 3): request percentiles and errors from k6's
// summary.json; CPU, memory, GC, database connections and locks, queue lag and the invariant gauges from the scrapes.
// Usage: node report.mjs > report.md   (in the directory with summary.json, metrics.prom, process.tsv, database.tsv)
import { readFileSync } from 'node:fs';

const summary = JSON.parse(readFileSync('summary.json', 'utf8'));
const metric = (name) => summary.metrics[name]?.values ?? {};
const ms = (v) => (v === undefined ? '–' : v < 10 ? v.toFixed(1) : Math.round(v).toString());
const out = [];

out.push('## Requests (k6)', '', '| Request | count | p50 ms | p95 ms | p99 ms | max ms |', '|---|---|---|---|---|---|');
for (const name of ['heartbeat', 'go_online', 'offers', 'accept', 'trip_current', 'arrive', 'start', 'complete',
                    'quote', 'order']) {
  const v = metric(`http_req_duration{name:${name}}`);
  out.push(`| ${name} | ${v.count ?? 0} | ${ms(v['p(50)'])} | ${ms(v['p(95)'])} | ${ms(v['p(99)'])} | ${ms(v.max)} |`);
}
const failed = metric('http_req_failed');
const total = metric('http_reqs');
out.push('', `Requests: ${total.count ?? 0} (${(total.rate ?? 0).toFixed(1)}/s), failed (status ≥ 400 or no answer): `
  + `${((failed.rate ?? 0) * 100).toFixed(2)} %.`);
out.push(`Checks passed: ${((metric('checks').rate ?? 0) * 100).toFixed(2)} %. Offers accepted: `
  + `${metric('offers_accepted').count ?? 0}, lost to another driver or expiry: ${metric('offers_lost').count ?? 0}; `
  + `rides completed: ${metric('rides_completed').count ?? 0}; WebSocket errors: ${metric('ws_failed').count ?? 0}; `
  + `WebSocket sessions: ${metric('ws_sessions').count ?? 0}.`);
const checks = summary.root_group?.checks ?? [];
const failing = checks.filter((c) => c.fails > 0).map((c) => `${c.name} ${c.fails}/${c.passes + c.fails}`);
if (failing.length) out.push(`Failed checks: ${failing.join(', ')}.`);

// Scrapes: "# scrape <time>" then Prometheus lines.
const scrapes = [];
for (const line of readFileSync('metrics.prom', 'utf8').split('\n')) {
  if (line.startsWith('# scrape ')) scrapes.push({ time: Number(line.slice(9)), values: [] });
  else if (line && scrapes.length) {
    const space = line.lastIndexOf(' ');
    scrapes.at(-1).values.push([line.slice(0, space), Number(line.slice(space + 1))]);
  }
}
const series = (prefix, filter = () => true) => scrapes.map((s) => s.values
  .filter(([k]) => (k === prefix || k.startsWith(`${prefix}{`)) && filter(k)).reduce((a, [, v]) => a + v, 0));
const max = (list) => (list.length ? Math.max(...list) : NaN);
const last = (list) => (list.length ? list.at(-1) : NaN);

const gcCount = series('jvm_gc_pause_seconds_count');
const gcSum = series('jvm_gc_pause_seconds_sum');
const gcMax = scrapes.map((s) => max(s.values.filter(([k]) => k.startsWith('jvm_gc_pause_seconds_max')).map(([, v]) => v)));
const heap = series('jvm_memory_used_bytes', (k) => k.includes('area="heap"'));
const proc = readFileSync('process.tsv', 'utf8').trim().split('\n').slice(1).map((l) => l.split('\t').map(Number));
const db = readFileSync('database.tsv', 'utf8').trim().split('\n').slice(1).map((l) => l.split('\t').map(Number));
const col = (rows, i) => rows.map((r) => r[i]).filter((v) => !Number.isNaN(v));

out.push('', '## Server and database (every 10 s)', '', '| Measure | max | at the end |', '|---|---|---|');
const row = (label, list, f = (v) => String(Math.round(v * 100) / 100)) =>
  out.push(`| ${label} | ${f(max(list))} | ${f(last(list))} |`);
row('Server CPU, % of one core (ps)', col(proc, 1));
row('Server RSS, MB', col(proc, 2));
row('Server threads', col(proc, 3));
row('Host CPU use (system_cpu_usage)', series('system_cpu_usage'));
row('Heap used, MB', heap.map((v) => v / 1048576));
row('GC pauses (count, cumulative)', gcCount);
row('GC pause time, s (cumulative)', gcSum);
row('Longest GC pause, s (recent max)', gcMax.filter((v) => Number.isFinite(v)));
row('Hikari active connections', series('hikaricp_connections_active'));
row('Hikari threads waiting for a connection', series('hikaricp_connections_pending'));
row('Hikari connection timeouts (cumulative)', series('hikaricp_connections_timeout_total'));
row('Database connections (pg_stat_activity)', col(db, 1));
row('Database sessions idle in transaction', col(db, 3));
row('Locks waited for (pg_locks not granted)', col(db, 4));
row('Locks held', col(db, 5));
row('Outbox pending events (queue lag)', series('blizz_outbox_pending'));
row('Oldest pending outbox event, s', series('blizz_outbox_oldest_seconds'));
row('Outbox events failed', series('blizz_outbox_failed'));
row('Drivers online (server gauge)', series('blizz_drivers_online'));
row('Orders searching', series('blizz_orders_searching'));
row('Assignments active', series('blizz_assignments_active'));
row('Orders created (cumulative)', series('blizz_orders_created_total'));
row('Orders unfulfilled (cumulative)', series('blizz_orders_unfulfilled_total'));

const violations = series('blizz_invariant_violations');
const runs = scrapes.map((s) => s.values.filter(([k]) => k.startsWith('blizz_invariant_last_success'))
  .map(([, v]) => v));
out.push('', '## Invariants during the run', '',
  `Scans with a violation: ${violations.filter((v) => v > 0).length} of ${violations.length}; the largest sum of `
  + `violations in one scrape: ${max(violations)}. The five checks were last clean at `
  + `${new Date(1000 * Math.min(...(runs.at(-1) ?? [0]))).toISOString()} (the oldest of the five).`);
process.stdout.write(out.join('\n') + '\n');
