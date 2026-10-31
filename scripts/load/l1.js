// L1 load profile (spec 27.1, REQ-NFR-01; issue #146 part 3), run by k6 against the sandbox server:
//   drivers — DRIVERS online in Kyiv, each with a WebSocket, a heartbeat every 4 s (≈ DRIVERS / 4 GPS points a
//             second); an OfferMade on the socket makes the driver read the offer, accept it, drive to the pickup,
//             arrive, start and complete after a short ride
//   riders  — RIDERS WebSockets held open (DRIVERS + RIDERS sockets in all)
//   orders  — ORDER_RATE orders a second, with a BURST_RATE burst of one minute in the middle
// Env: BASE, WS_BASE, TOKENS (tokens.json from tokens.mjs), MINUTES, DRIVERS_PER_VU, ORDER_RATE, BURST_RATE.
import http from 'k6/http';
import exec from 'k6/execution';
import { check } from 'k6';
import { Counter } from 'k6/metrics';
import { setInterval, setTimeout, clearInterval } from 'k6/timers';
import { WebSocket } from 'k6/experimental/websockets';

const BASE = __ENV.BASE || 'http://localhost:8080';
const WS_BASE = __ENV.WS_BASE || 'ws://localhost:8080';
const TOKENS = JSON.parse(open(__ENV.TOKENS || 'tokens.json'));
const MINUTES = Number(__ENV.MINUTES || 15);
const PER_VU = Number(__ENV.DRIVERS_PER_VU || 10);
const ORDER_RATE = Number(__ENV.ORDER_RATE || 2);
const BURST_RATE = Number(__ENV.BURST_RATE || 10);
const DURATION_MS = MINUTES * 60 * 1000;
// Kyiv, inside the sandbox city: drivers and pickups spread over about 7 × 7 km.
const BOX = { lat: [50.42, 50.48], lon: [30.47, 30.57] };
const STEP_M = 250; // per 4 s beat, below the 250 km/h check even with the server's 2 s tolerance

const rides = new Counter('rides_completed');
const accepted = new Counter('offers_accepted');
const lost = new Counter('offers_lost');
const wsFailed = new Counter('ws_failed');

const named = ['heartbeat', 'go_online', 'offers', 'accept', 'trip_current', 'arrive', 'start', 'complete',
               'quote', 'order'];
export const options = {
  scenarios: {
    drivers: { executor: 'per-vu-iterations', exec: 'drivers', vus: Math.ceil(TOKENS.drivers.length / PER_VU),
               iterations: 1, maxDuration: `${MINUTES + 3}m` },
    riders: { executor: 'per-vu-iterations', exec: 'riders', vus: Math.ceil(TOKENS.riders.length / 50),
              iterations: 1, maxDuration: `${MINUTES + 3}m` },
    orders: { executor: 'constant-arrival-rate', exec: 'orders', rate: ORDER_RATE, timeUnit: '1s',
              duration: `${MINUTES}m`, startTime: '60s', preAllocatedVUs: 20, maxVUs: 100 },
    burst: { executor: 'constant-arrival-rate', exec: 'orders', rate: Math.max(BURST_RATE - ORDER_RATE, 1),
             timeUnit: '1s', duration: '1m', startTime: `${60 + Math.floor(MINUTES * 30)}s`, preAllocatedVUs: 20,
             maxVUs: 100 },
  },
  // A threshold per request name puts its percentiles into the summary; the limits are the spec's L2 targets
  // (REQ-NFR-02), reported, not enforced: L1 only records them.
  thresholds: Object.fromEntries(named.map((n) => [`http_req_duration{name:${n}}`, ['p(95)<100000']])),
  summaryTrendStats: ['avg', 'p(50)', 'p(95)', 'p(99)', 'max', 'count'],
};

const uuid = () => 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, (c) => {
  const r = (Math.random() * 16) | 0;
  return (c === 'x' ? r : (r & 0x3) | 0x8).toString(16);
});
const rand = (range) => range[0] + Math.random() * (range[1] - range[0]);
const headers = (token) => ({ Authorization: `Bearer ${token}`, 'Content-Type': 'application/json' });
const metres = (a, b) => {
  const rad = (x) => (x * Math.PI) / 180;
  const h = Math.sin(rad(b.lat - a.lat) / 2) ** 2
    + Math.cos(rad(a.lat)) * Math.cos(rad(b.lat)) * Math.sin(rad(b.lon - a.lon) / 2) ** 2;
  return 2 * 6371000 * Math.asin(Math.sqrt(h));
};
const toward = (from, to, step) => {
  const d = metres(from, to);
  if (d <= step) return { lat: to.lat, lon: to.lon };
  const f = step / d;
  return { lat: from.lat + (to.lat - from.lat) * f, lon: from.lon + (to.lon - from.lon) * f };
};

function post(name, path, token, body) {
  return http.asyncRequest('POST', `${BASE}${path}`, JSON.stringify(body), { headers: headers(token), tags: { name } });
}
function get(name, path, token) {
  return http.asyncRequest('GET', `${BASE}${path}`, null, { headers: headers(token), tags: { name } });
}

class Driver {
  constructor(t) {
    this.t = t;
    this.at = { lat: rand(BOX.lat), lon: rand(BOX.lon) };
    this.sequence = Date.now();
    this.state = 'OFFLINE';
    this.busy = false;
  }

  location() {
    this.sequence += 1;
    return { lat: this.at.lat, lon: this.at.lon, accuracy_m: 5, recorded_at: new Date().toISOString(),
             sequence: this.sequence };
  }

  async start() {
    const open = await post('go_online', '/api/driver/v1/work-sessions', this.t.token,
                            { command_id: uuid(), vehicle_id: this.t.vehicle, location: this.location() });
    if (!check(open, { 'went online': (r) => r.status === 201 })) return;
    this.session = open.json('session_id');
    this.state = 'FREE';
    this.ws = new WebSocket(`${WS_BASE}/ws/v1/driver`, ['blizz.v1', `blizz.bearer.${this.t.token}`]);
    this.ws.onerror = () => wsFailed.add(1);
    this.ws.onmessage = (m) => {
      const event = JSON.parse(m.data);
      if (event.type === 'OfferMade' && this.state === 'FREE') this.takeOffer();
    };
    // Spread the beats over the 4 s, as phones would be.
    setTimeout(() => { this.beats = setInterval(() => this.beat(), 4000); }, Math.random() * 4000);
  }

  async beat() {
    if (this.busy) return;
    this.busy = true;
    try {
      if (this.state === 'TO_PICKUP') this.at = toward(this.at, this.pickup, STEP_M);
      else if (this.state === 'FREE') this.at = toward(this.at, { lat: rand(BOX.lat), lon: rand(BOX.lon) }, 20);
      const r = await post('heartbeat', `/api/driver/v1/work-sessions/${this.session}/heartbeat`, this.t.token,
                           { location: this.location() });
      check(r, { 'heartbeat 2xx': (x) => x.status >= 200 && x.status < 300 });
      if (this.state === 'TO_PICKUP' && metres(this.at, this.pickup) < 50) await this.arrive();
    } finally {
      this.busy = false;
    }
  }

  async takeOffer() {
    this.state = 'TAKING';
    const list = await get('offers', '/api/driver/v1/offers', this.t.token);
    const offer = list.status === 200 ? (list.json() || [])[0] : null;
    if (!offer) { this.state = 'FREE'; lost.add(1); return; }
    const r = await post('accept', `/api/driver/v1/offers/${offer.id}/accept`, this.t.token, { command_id: uuid() });
    if (r.status !== 200) { this.state = 'FREE'; lost.add(1); return; }
    accepted.add(1);
    this.pickup = offer.pickup;
    this.trip = r.json('trip_id');
    this.state = 'TO_PICKUP';
  }

  async trip_now() {
    const r = await get('trip_current', '/api/driver/v1/trips/current', this.t.token);
    return r.status === 200 ? r.json() : null;
  }

  async arrive() {
    let trip = await this.trip_now();
    if (!trip) { this.state = 'FREE'; return; }
    let r = await post('arrive', `/api/driver/v1/trips/${trip.id}/arrive`, this.t.token,
                       { command_id: uuid(), expected_version: trip.version });
    if (!check(r, { 'arrived': (x) => x.status === 200 })) { this.state = 'FREE'; return; }
    trip = r.json();
    r = await post('start', `/api/driver/v1/trips/${trip.id}/start`, this.t.token,
                   { command_id: uuid(), expected_version: trip.version });
    if (!check(r, { 'started': (x) => x.status === 200 })) { this.state = 'FREE'; return; }
    trip = r.json();
    this.state = 'RIDING';
    // A short ride: complete it after 20-40 s, standing still meanwhile (the fare is the quoted one).
    setTimeout(async () => {
      const done = await post('complete', `/api/driver/v1/trips/${trip.id}/complete`, this.t.token,
                              { command_id: uuid(), expected_version: trip.version,
                                reported_at: new Date().toISOString(), cash_received: true });
      if (check(done, { 'completed': (x) => x.status === 200 })) rides.add(1);
      this.state = 'FREE';
    }, 20000 + Math.random() * 20000);
  }

  stop() {
    if (this.beats) clearInterval(this.beats);
    if (this.ws) this.ws.close();
  }
}

export async function drivers() {
  const first = (exec.vu.idInScenario - 1) * PER_VU;
  const mine = TOKENS.drivers.slice(first, first + PER_VU).map((t) => new Driver(t));
  for (const d of mine) await d.start();
  setTimeout(() => mine.forEach((d) => d.stop()), DURATION_MS + 60000);
}

export function riders() {
  const first = (exec.vu.idInScenario - 1) * 50;
  const sockets = TOKENS.riders.slice(first, first + 50).map((t) => {
    const ws = new WebSocket(`${WS_BASE}/ws/v1/rider`, ['blizz.v1', `blizz.bearer.${t.token}`]);
    ws.onerror = () => wsFailed.add(1);
    return ws;
  });
  const ping = setInterval(() => sockets.forEach((ws) => { if (ws.readyState === 1) ws.send('ping'); }), 30000);
  setTimeout(() => { clearInterval(ping); sockets.forEach((ws) => ws.close()); }, DURATION_MS + 60000);
}

export function orders() {
  const rider = TOKENS.riders[exec.scenario.iterationInTest % TOKENS.riders.length];
  const pickup = { lat: rand(BOX.lat), lon: rand(BOX.lon) };
  const dropoff = { lat: rand(BOX.lat), lon: rand(BOX.lon) };
  const quote = http.post(`${BASE}/api/rider/v1/quotes`, JSON.stringify({ command_id: uuid(),
    vehicle_class: 'STANDARD', pickup, dropoff }), { headers: headers(rider.token), tags: { name: 'quote' } });
  if (!check(quote, { 'quoted': (r) => r.status === 201 })) return;
  const order = http.post(`${BASE}/api/rider/v1/orders`, JSON.stringify({ command_id: uuid(),
    quote_id: quote.json('id'), vehicle_class: 'STANDARD', pickup, pickup_label: 'Load test', dropoff,
    dropoff_label: 'Load test', payment_method: 'CASH' }), { headers: headers(rider.token), tags: { name: 'order' } });
  check(order, { 'ordered': (r) => r.status === 201 });
}

export function handleSummary(data) {
  return { 'summary.json': JSON.stringify(data, null, 1) };
}
