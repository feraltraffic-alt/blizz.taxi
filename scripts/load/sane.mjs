// Did the load run load anything? (05.11.2026: from 01.11 every request of L1 was refused with 401 and the run still
// read "success", because L1 records and does not gate.) Exits 1, naming the reason, when more than 5 % of requests
// failed, no ride was completed, or more than 1 % of the WebSockets failed. The numbers themselves still do not gate.
// Usage: node sane.mjs   (in the directory with k6's summary.json)
import { readFileSync } from 'node:fs';

const summary = JSON.parse(readFileSync('summary.json', 'utf8'));
const metric = (name) => summary.metrics[name]?.values ?? {};
const failedRate = metric('http_req_failed').rate ?? 1;
const rides = metric('rides_completed').count ?? 0;
const sessions = metric('ws_sessions').count ?? 0;
const wsFailed = metric('ws_failed').count ?? 0;
const problems = [];
if (failedRate > 0.05) problems.push(`${(failedRate * 100).toFixed(1)} % of the requests failed (at most 5 %)`);
if (rides === 0) problems.push('no ride was completed');
if (sessions === 0 || wsFailed > sessions * 0.01) problems.push(`${wsFailed} of ${sessions} WebSockets failed (at most 1 %)`);
if (problems.length) {
  console.log(`The run did not load the server: ${problems.join('; ')}.`);
  process.exit(1);
}
console.log(`The run loaded the server: ${(failedRate * 100).toFixed(2)} % failed, ${rides} rides, ${wsFailed} of ${sessions} WebSockets failed.`);
