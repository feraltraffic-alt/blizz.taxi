import {useCallback, useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

type City = {id: string; name: string; timezone: string};
type Counts = {created: number; fulfilled: number; cancelled: number; unfulfilled: number; open: number};
type OrderReport = {generated_at: string; days: {date: string; counts: Counts}[]; total: Counts;
  cancellation_reasons: {cancelled_by: string; code: string; count: number}[]};
type Figures = Record<string, number>;
type MoneyReport = {generated_at: string; currency: string; days: {date: string; figures: Figures}[]; total: Figures};
type Export = {id: string; kind: string; city_id: string; from: string; to: string; state: string;
  file_name: string | null};

const DATE = /^(\d{4})-(\d{2})-(\d{2})$/;
const DAY = 86_400_000;
const MONEY = ['fares_minor', 'commission_minor', 'driver_share_minor', 'discounts_minor', 'bonuses_granted_minor',
  'paid_by_card_minor', 'paid_with_bonuses_minor', 'collected_by_drivers_minor', 'tips_minor',
  'rider_debt_change_minor'];

/** A real calendar date as milliseconds of its UTC midnight; null otherwise. */
function dayOf(text: string) {
  const parts = DATE.exec(text.trim());
  if (!parts) return null;
  const [y, m, d] = parts.slice(1).map(Number) as [number, number, number];
  const at = Date.UTC(y, m - 1, d);
  const back = new Date(at);
  return back.getUTCFullYear() === y && back.getUTCMonth() === m - 1 && back.getUTCDate() === d ? at : null;
}

/** Today in the city's own calendar (lessons case 20). */
function today(timeZone: string) {
  return timeZone ? new Date(Date.now()).toISOString().slice(0, 10) : '';
}

const iso = (ms: number) => new Date(ms).toISOString().slice(0, 10);
const ru = (date: string) => date.split('-').reverse().join('.');
const short = (date: string) => date.slice(8, 10) + '.' + date.slice(5, 7);

function amount(minor: number) {
  const abs = Math.abs(minor);
  return (minor < 0 ? '−' : '') + String(Math.floor(abs / 100)).replace(/\B(?=(\d{3})+(?!\d))/g, ' ') + '.'
    + String(abs % 100).padStart(2, '0');
}

function utc(at: string) {
  const when = new Date(at);
  return when.toLocaleDateString('ru-RU', {timeZone: 'UTC'}) + ' '
    + when.toLocaleTimeString('ru-RU', {timeZone: 'UTC', hour: '2-digit', minute: '2-digit'}) + ' UTC';
}

/**
 * Reports for holders of reports.view (#409, REQ-ADM-06/07): a city's orders or money per local day over a period
 * of at most 92 days (the last 7 days of the city's calendar by default), and CSV exports built in the background,
 * each file fetched once since every download is audited.
 */
export function Reports({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const [cities, setCities] = useState<City[]>([]);
  const [cityId, setCityId] = useState('');
  const [kind, setKind] = useState<'ORDERS' | 'FINANCE'>('ORDERS');
  const [from, setFrom] = useState('');
  const [to, setTo] = useState('');
  const [orders, setOrders] = useState<OrderReport | null>(null);
  const [money, setMoney] = useState<MoneyReport | null>(null);
  const [exports, setExports] = useState<Export[]>([]);
  const [files, setFiles] = useState<Record<string, string>>({});
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);
  const urls = useRef<string[]>([]);

  const pick = useCallback((city: City | undefined) => {
    if (!city) return;
    setCityId(city.id);
    const end = today(city.timezone);
    setTo(end);
    setFrom(iso(dayOf(end)! - 6 * DAY));
  }, []);

  const readExports = useCallback(async () => {
    setExports(((await client.get('/api/admin/v1/reports/exports' as never, {} as never)) as {exports: Export[]})
      .exports);
  }, [client]);

  useEffect(() => {
    client.get('/api/config/v1/bootstrap' as never, {} as never).then(boot => {
      const list = (boot as {cities: City[]}).cities;
      setCities(list);
      pick(list[0]);
    }).catch(failure => setError(failure));
    readExports().catch(() => undefined);
  }, [client, pick, readExports]);
  useEffect(() => () => urls.current.forEach(url => URL.revokeObjectURL(url)), []);

  /** The period, or null when the server would refuse it. */
  function period() {
    const start = dayOf(from);
    const end = dayOf(to);
    if (start === null || end === null || end < start || end - start > 93 * DAY || !cityId) {
      setMessage(t('reportNeeds'));
      return null;
    }
    return {city_id: cityId, from: from.trim(), to: to.trim()};
  }

  async function run(work: () => Promise<void>) {
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      await work();
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 403) setMessage(t('reportForbidden'));
      else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  function show() {
    const query = period();
    if (!query) return;
    return run(async () => {
      if (kind === 'ORDERS') {
        setMoney(null);
        setOrders(await client.get('/api/admin/v1/reports/orders' as never, {query} as never) as OrderReport);
      } else {
        setOrders(null);
        setMoney(await client.get('/api/admin/v1/reports/finance' as never, {query} as never) as MoneyReport);
      }
    });
  }

  function exportCsv() {
    const query = period();
    if (!query) return;
    return run(async () => {
      await client.post('/api/admin/v1/reports/exports' as never, {body: {command_id: newId(), kind, ...query}} as never);
      await readExports();
    });
  }

  function download(e: Export) {
    if (files[e.id]) return;
    return run(async () => {
      const blob = await client.get('/api/admin/v1/reports/exports/{export_id}/file' as never, {params: {
        export_id: e.id}} as never) as unknown as Blob;
      const url = URL.createObjectURL(blob);
      urls.current.push(url);
      setFiles(all => ({...all, [e.id]: url}));
    });
  }

  const countLine = (c: Counts) => t('reportCounts', {created: c.created, fulfilled: c.fulfilled,
    cancelled: c.cancelled, unfulfilled: c.unfulfilled, open: c.open});
  const moneyLine = (f: Figures, currency: string) => t('reportTrips', {n: f.trips ?? 0}) + ', '
    + MONEY.map(k => t('report_' + k) + ' ' + amount(f[k] ?? 0)).join(', ') + ' ' + currency;
  const name = (id: string) => cities.find(c => c.id === id)?.name ?? id;
  return (
    <section aria-labelledby="reports-title">
      <h1 id="reports-title">{t('navReports')}</h1>
      <label htmlFor="report-city">{t('reportCity')}</label>
      <select id="report-city" value={cityId} onChange={e => pick(cities.find(c => c.id === e.target.value))}>
        {cities.map(c => <option key={c.id} value={c.id}>{c.name}</option>)}
      </select>
      <label htmlFor="report-kind">{t('reportKind')}</label>
      <select id="report-kind" value={kind} onChange={e => setKind(e.target.value as 'ORDERS' | 'FINANCE')}>
        <option value="ORDERS">{t('reportKind_ORDERS')}</option>
        <option value="FINANCE">{t('reportKind_FINANCE')}</option>
      </select>
      <label>{t('reportFrom')}<input value={from} onChange={e => setFrom(e.target.value)} /></label>
      <label>{t('reportTo')}<input value={to} onChange={e => setTo(e.target.value)} /></label>
      <button type="button" onClick={() => void show()}>{t('reportShow')}</button>
      <button type="button" onClick={() => void exportCsv()}>{t('reportExport')}</button>
      {orders ? (
        <>
          <p>{t('reportTotal') + ': ' + countLine(orders.total)}</p>
          <ul>{orders.days.map(d => <li key={d.date}>{ru(d.date) + ': ' + countLine(d.counts)}</li>)}</ul>
          <ul>{orders.cancellation_reasons.map(r => <li key={r.cancelled_by + r.code}>{r.cancelled_by + ' · ' + r.code
            + ': ' + r.count}</li>)}</ul>
          <p>{t('reportAt', {at: utc(orders.generated_at)})}</p>
        </>
      ) : null}
      {money ? (
        <>
          <p>{t('reportTotal') + ': ' + moneyLine(money.total, money.currency)}</p>
          <ul>{money.days.map(d => <li key={d.date}>{ru(d.date) + ': ' + moneyLine(d.figures, money.currency)}</li>)}</ul>
          <p>{t('reportAt', {at: utc(money.generated_at)})}</p>
        </>
      ) : null}
      <h2>{t('reportExports')}</h2>
      <button type="button" onClick={() => void readExports().catch(failure => setError(failure))}>
        {t('reportRefresh')}</button>
      <ul>
        {exports.map(e => (
          <li key={e.id}>
            <span>{[t('reportKind_' + e.kind), name(e.city_id), short(e.from) + '–' + short(e.to),
              t('exportState_' + e.state)].join(' · ')}</span>
            {files[e.id] ? <a href={files[e.id]} download={e.file_name ?? 'report.csv'}>{e.file_name ?? 'report.csv'}</a>
              : e.state === 'READY' ? <button type="button" onClick={() => void download(e)}>{t('reportDownload')}
              </button> : null}
          </li>
        ))}
      </ul>
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
