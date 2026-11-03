import {useCallback, useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';
import {DAYS} from './Promotions.js';

type TimeRule = {key: string; days_of_week: number[]; start_hour: number; end_hour: number; m: number; g: number};
type Settings = {m: number; g: number; count_cancellations: boolean; reset_day: number; time_rules: TimeRule[]};
type Version = {version: number; settings: Settings; effective_at: string; reason: string};
type RuleForm = {key: string; days: number[]; start: string; end: string; m: string; g: string};
type Account = {staff_id: string; balance: number; fulfilled_count: number; cancelled_count: number;
  period_started_at: string};
type Period = {staff_id: string; period_key: string; points: number};

const whole = (text: string, min: number, max: number) => {
  const n = /^[0-9]{1,6}$/.test(text.trim()) ? Number(text.trim()) : NaN;
  return n >= min && n <= max ? n : null;
};
const day = (at: string) => new Date(at).toLocaleDateString('ru-RU', {timeZone: 'UTC'});

/**
 * Operator bonuses for holders of operator-bonuses.manage (#418): the rules (points per order and per operator-fault
 * cancellation, the reset day, and time rules of which the first that matches wins, so their order is kept as shown),
 * the accounts and the closed periods.
 */
export function OperatorBonuses({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const [current, setCurrent] = useState<Version | null>(null);
  const [base, setBase] = useState({m: '', g: '', count: true, reset: ''});
  const [rules, setRules] = useState<RuleForm[]>([]);
  const [reason, setReason] = useState('');
  const [accounts, setAccounts] = useState<Account[]>([]);
  const [periods, setPeriods] = useState<Period[]>([]);
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const show = useCallback((value: Version) => {
    const s = value.settings;
    setCurrent(value);
    setBase({m: String(s.m), g: String(s.g), count: s.count_cancellations, reset: String(s.reset_day)});
    setRules(s.time_rules.map(r => ({key: r.key, days: [...r.days_of_week], start: String(r.start_hour),
      end: String(r.end_hour), m: String(r.m), g: String(r.g)})));
    setReason('');
  }, []);

  const read = useCallback(async () => {
    show(await client.get('/api/admin/v1/settings/operator-bonuses' as never, {} as never) as Version);
  }, [client, show]);

  useEffect(() => {
    read().catch(failure => setError(failure));
    client.get('/api/admin/v1/operator-bonuses' as never, {} as never)
      .then(v => setAccounts((v as {accounts: Account[]}).accounts)).catch(() => undefined);
    client.get('/api/admin/v1/operator-bonuses/periods' as never, {} as never)
      .then(v => setPeriods((v as {periods: Period[]}).periods)).catch(() => undefined);
  }, [client, read]);

  /** The settings to send, or null when the server would refuse them. */
  function build(): Settings | null {
    const m = whole(base.m, 0, 1_000_000);
    const g = whole(base.g, 0, 1_000_000);
    const reset = whole(base.reset, 1, 28);
    const parsed = rules.map(r => ({key: r.key.trim(), days_of_week: [...r.days].sort((a, b) => a - b),
      start_hour: whole(r.start, 0, 23), end_hour: whole(r.end, 1, 24), m: whole(r.m, 0, 1_000_000),
      g: whole(r.g, 0, 1_000_000)}));
    const keys = parsed.map(r => r.key);
    if (m === null || g === null || reset === null || !reason.trim() || reason.trim().length > 500
      || new Set(keys).size !== keys.length || parsed.some(r => !r.key || r.days_of_week.length === 0
        || r.start_hour === null || r.end_hour === null || r.start_hour >= r.end_hour || r.m === null || r.g === null)) {
      return null;
    }
    return {m, g, count_cancellations: base.count, reset_day: reset, time_rules: parsed as TimeRule[]};
  }

  async function save() {
    if (acting.current || !current) return;
    const settings = build();
    if (!settings) {
      setMessage(t('obNeeds'));
      return;
    }
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      show(await client.post('/api/admin/v1/settings/operator-bonuses' as never, {body: {command_id: newId(),
        expected_version: current.version, settings, reason: reason.trim()}} as never) as Version);
      setMessage(t('obSaved'));
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('obConflict'));
        await read().catch(again => setError(again));
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  if (!current) return error ? <Failure error={error} t={t} /> : <p>{t('loading')}</p>;
  const change = (n: number, next: Partial<RuleForm>) => setRules(list => list.map((r, at) => at === n ? {...r, ...next} : r));
  const up = (n: number) => setRules(list => list.map((r, at) => at === n - 1 ? list[n]! : at === n ? list[n - 1]! : r));
  const field = (n: number, key: 'key' | 'start' | 'end' | 'm' | 'g', label: string) => (
    <label>{t(label)}<input value={rules[n]![key]} onChange={e => change(n, {[key]: e.target.value})} /></label>
  );
  return (
    <section aria-labelledby="ob-title">
      <h1 id="ob-title">{t('navOperatorBonuses')}</h1>
      <p>{t('obVersion', {version: current.version, day: day(current.effective_at), reason: current.reason})}</p>
      <label>{t('obM')}<input value={base.m} onChange={e => setBase(b => ({...b, m: e.target.value}))} /></label>
      <label>{t('obG')}<input value={base.g} onChange={e => setBase(b => ({...b, g: e.target.value}))} /></label>
      <label><input type="checkbox" checked={base.count} onChange={e => setBase(b => ({...b, count: e.target.checked}))} />
        {t('obCount')}</label>
      <label>{t('obReset')}<input value={base.reset} onChange={e => setBase(b => ({...b, reset: e.target.value}))} />
      </label>
      {rules.map((r, n) => (
        <fieldset key={n}>
          <legend>{t('obRule', {n: n + 1})}</legend>
          {field(n, 'key', 'obKey')}
          {DAYS.map((d, i) => (
            <label key={d}><input type="checkbox" checked={r.days.includes(i + 1)} onChange={e => change(n, {
              days: e.target.checked ? [...r.days, i + 1] : r.days.filter(x => x !== i + 1)})} />{t('promoDay_' + d)}
            </label>
          ))}
          {field(n, 'start', 'obStart')}
          {field(n, 'end', 'obEnd')}
          {field(n, 'm', 'obRuleM')}
          {field(n, 'g', 'obRuleG')}
          {n > 0 ? <button type="button" onClick={() => up(n)}>{t('obUp')}</button> : null}
          <button type="button" onClick={() => setRules(list => list.filter((_, at) => at !== n))}>{t('obRemove')}</button>
        </fieldset>
      ))}
      <button type="button" onClick={() => setRules(list => [...list, {key: '', days: [], start: '', end: '', m: '',
        g: ''}])}>{t('obAdd')}</button>
      <label>{t('obReason')}<input value={reason} onChange={e => setReason(e.target.value)} /></label>
      <button type="button" onClick={() => void save()}>{t('obSave')}</button>
      {message ? <p role="status">{message}</p> : null}
      <h2>{t('obAccounts')}</h2>
      <ul>{accounts.map(a => <li key={a.staff_id}>{[a.staff_id.slice(0, 8), t('obPoints', {n: a.balance}),
        t('obDone', {n: a.fulfilled_count}), t('obCancelled', {n: a.cancelled_count}),
        t('obSince', {day: day(a.period_started_at)})].join(' · ')}</li>)}</ul>
      <h2>{t('obPeriods')}</h2>
      <ul>{periods.map(p => <li key={p.staff_id + p.period_key}>{[p.staff_id.slice(0, 8), p.period_key,
        t('obPoints', {n: p.points})].join(' · ')}</li>)}</ul>
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
