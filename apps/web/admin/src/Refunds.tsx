import {useCallback, useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';
import {minorOf} from './Balance.js';
import {decimal} from './Promotions.js';

type Refund = {id: string; currency: string; amount_minor: number; card_minor: number; bonus_minor: number;
  reason_code: string; reason_labels: Record<string, string>; fault: string; comment: string | null; state: string;
  requested_at: string; decision_reason: string | null; order_id: string; version: number};
type Refundable = {currency: string | null; money_minor: number; bonus_minor: number; refunded_minor: number;
  left_minor: number; minimum_minor: number; to_card: boolean; until: string | null; default_fault: string | null;
  rider_warning: boolean; rider_refunds: number};
type Reason = {code: string; labels: Record<string, string>; fault: string | null};
type Limit = {currency: string; per_refund_minor: number; daily_minor: number; used_minor: number; version: number};

const FAULTS = ['DRIVER', 'OPERATOR', 'NONE', 'CLIENT', 'CLIENT_FREE'];
const when = (iso: string) => new Date(iso).toLocaleString('ru-RU', {dateStyle: 'short', timeStyle: 'short'});
const label = (labels: Record<string, string>, code: string) => labels.ru ?? labels.uk ?? Object.values(labels)[0] ?? code;

/** The server's refusal in words: the staff member's limit, or what the order allows. */
function refusal(failure: unknown, t: Translate) {
  if (failure instanceof ApiError && (failure.code === 'REFUND_LIMIT' || failure.code === 'REFUND_NOT_ALLOWED')) {
    return t(failure.code === 'REFUND_LIMIT' ? 'rfLimit' : 'rfNotAllowed');
  }
  return null;
}

/**
 * An order's refunds in its card (ADR 0018 part A, #512): what the order allows, its refunds, and a request — the
 * amount, where the money goes (the card only for a card trip; bonuses need the rider's consent), the reason with its
 * fault, another fault or the reason OTHER with a comment. A staff member's request waits for a confirmation.
 */
export function OrderRefunds({client, t, newId, orderId, canRequest}: {client: ApiClient; t: Translate;
  newId: () => string; orderId: string; canRequest: boolean}) {
  const [allows, setAllows] = useState<Refundable | null>(null);
  const [list, setList] = useState<Refund[]>([]);
  const [reasons, setReasons] = useState<Reason[]>([]);
  const [form, setForm] = useState({amount: '', destination: 'CARD', agreed: false, reason: '', fault: '',
    comment: ''});
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const read = useCallback(async () => {
    const value = await client.get('/api/admin/v1/orders/{order_id}/refunds' as never,
      {params: {order_id: orderId}} as never) as {refundable: Refundable; refunds: Refund[]};
    setAllows(value.refundable);
    setList(value.refunds);
    if (!value.refundable.to_card) setForm(f => ({...f, destination: 'BONUSES'}));
  }, [client, orderId]);

  useEffect(() => {
    read().catch(failure => {
      if (!(failure instanceof ApiError && (failure.status === 403 || failure.status === 422))) setError(failure);
    });
    if (canRequest) {
      client.get('/api/admin/v1/refund-reasons' as never, {} as never)
        .then(value => setReasons((value as {reasons: Reason[]}).reasons)).catch(failure => setError(failure));
    }
  }, [client, read, canRequest]);

  async function request() {
    const amount = minorOf(form.amount);
    const comment = form.comment.trim();
    if (!allows || amount === null || !form.reason || (form.destination === 'BONUSES' && !form.agreed)
      || ((form.reason === 'OTHER' || form.fault) && !comment) || (form.reason === 'OTHER' && !form.fault)
      || comment.length > 500) {
      setMessage(t('rfNeeds'));
      return;
    }
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      const done = await client.post('/api/admin/v1/orders/{order_id}/refunds' as never, {params: {order_id: orderId},
        body: {command_id: newId(), amount_minor: amount, destination: form.destination,
          rider_agreed: form.agreed, reason_code: form.reason, ...(form.fault ? {fault: form.fault} : {}),
          ...(comment ? {comment} : {})}} as never) as {refund: Refund; rider_warning: boolean; rider_refunds: number};
      setMessage(t(done.refund.state === 'REQUESTED' ? 'rfRequested' : 'rfApproved')
        + (done.rider_warning ? ' ' + t('rfRiderWarning', {n: done.rider_refunds}) : ''));
      setForm(f => ({...f, amount: '', comment: '', fault: ''}));
      await read();
    } catch (failure) {
      const words = refusal(failure, t);
      if (words) setMessage(words);
      else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  if (!allows) return error ? <Failure error={error} t={t} /> : null;
  const currency = allows.currency ?? '';
  return (
    <section aria-labelledby="refunds-title">
      <h2 id="refunds-title">{t('rfTitle')}</h2>
      <p>{t('rfAllows', {money: decimal(allows.money_minor), bonus: decimal(allows.bonus_minor),
        refunded: decimal(allows.refunded_minor), left: decimal(allows.left_minor), currency})}</p>
      {allows.until ? <p>{t('rfUntil', {until: when(allows.until)})}</p> : null}
      {allows.rider_warning ? <p role="alert">{t('rfRiderWarning', {n: allows.rider_refunds})}</p> : null}
      <ul>
        {list.map(r => <li key={r.id}>{[when(r.requested_at), decimal(r.amount_minor) + ' ' + r.currency,
          t('rfState_' + r.state), label(r.reason_labels, r.reason_code), t('rfFault_' + r.fault),
          ...(r.card_minor > 0 ? [t('rfToCard', {sum: decimal(r.card_minor)})] : []),
          ...(r.bonus_minor > 0 ? [t('rfToBonuses', {sum: decimal(r.bonus_minor)})] : []),
          ...(r.decision_reason ? [r.decision_reason] : [])].join(' · ')}</li>)}
      </ul>
      {canRequest && allows.left_minor > 0 ? (
        <fieldset>
          <legend>{t('rfNew')}</legend>
          <label>{t('rfAmount', {currency})}<input inputMode="decimal" value={form.amount}
            onChange={e => setForm(f => ({...f, amount: e.target.value}))} /></label>
          <label htmlFor="refund-destination">{t('rfDestination')}</label>
          <select id="refund-destination" value={form.destination}
            onChange={e => setForm(f => ({...f, destination: e.target.value}))}>
            {allows.to_card ? <option value="CARD">{t('rfCard')}</option> : null}
            <option value="BONUSES">{t('rfBonuses')}</option>
          </select>
          {form.destination === 'BONUSES' ? <label><input type="checkbox" checked={form.agreed}
            onChange={e => setForm(f => ({...f, agreed: e.target.checked}))} />{t('rfAgreed')}</label> : null}
          <label htmlFor="refund-reason">{t('rfReason')}</label>
          <select id="refund-reason" value={form.reason} onChange={e => setForm(f => ({...f, reason: e.target.value}))}>
            <option value="" />
            {reasons.map(r => <option key={r.code} value={r.code}>{label(r.labels, r.code)}</option>)}
          </select>
          <label htmlFor="refund-fault">{t('rfFault')}</label>
          <select id="refund-fault" value={form.fault} onChange={e => setForm(f => ({...f, fault: e.target.value}))}>
            <option value="">{t('rfFaultUsual')}</option>
            {FAULTS.map(f => <option key={f} value={f}>{t('rfFault_' + f)}</option>)}
          </select>
          <label>{t('rfComment')}<input value={form.comment}
            onChange={e => setForm(f => ({...f, comment: e.target.value}))} /></label>
          <button type="button" onClick={() => void request()}>{t('rfRequest')}</button>
        </fieldset>
      ) : null}
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}

/**
 * The requests waiting for a confirmation in the caller's cities, not the caller's own (A3): confirm as asked, or
 * reject with a reason. The amount is never changed here.
 */
export function WaitingRefunds({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const [list, setList] = useState<Refund[] | null>(null);
  const [why, setWhy] = useState<Record<string, string>>({});
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const read = useCallback(async () => {
    setList(((await client.get('/api/admin/v1/refunds/waiting' as never, {} as never)) as {refunds: Refund[]})
      .refunds);
  }, [client]);

  useEffect(() => {
    read().catch(failure => setError(failure));
  }, [read]);

  async function decide(r: Refund, action: 'confirm' | 'reject') {
    const reason = (why[r.id] ?? '').trim();
    if (action === 'reject' && (!reason || reason.length > 500)) {
      setMessage(t('rfRejectNeeds'));
      return;
    }
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      await client.post(('/api/admin/v1/refunds/{refund_id}/' + action) as never, {params: {refund_id: r.id},
        body: {command_id: newId(), expected_version: r.version, ...(action === 'reject' ? {reason} : {})}} as never);
      setMessage(t(action === 'confirm' ? 'rfConfirmed' : 'rfRejected'));
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) setMessage(t('rfChanged'));
      else setError(failure);
    } finally {
      acting.current = false;
      await read().catch(again => setError(again));
    }
  }

  return (
    <section aria-labelledby="waiting-title">
      <h1 id="waiting-title">{t('rfWaitingTitle')}</h1>
      {list && list.length === 0 ? <p>{t('rfNoneWaiting')}</p> : null}
      <ul>
        {(list ?? []).map(r => (
          <li key={r.id}>
            <span>{[when(r.requested_at), decimal(r.amount_minor) + ' ' + r.currency,
              label(r.reason_labels, r.reason_code), t('rfFault_' + r.fault), ...(r.comment ? [r.comment] : [])]
              .join(' · ')}</span>
            <button type="button" onClick={() => void decide(r, 'confirm')}>{t('rfConfirm')}</button>
            <label>{t('rfRejectReason')}<input value={why[r.id] ?? ''}
              onChange={e => setWhy(w => ({...w, [r.id]: e.target.value}))} /></label>
            <button type="button" onClick={() => void decide(r, 'reject')}>{t('rfReject')}</button>
          </li>
        ))}
      </ul>
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}

/**
 * A staff member's refund limits (A2), set by the super admin in the staff card: per currency, one refund and the last
 * 24 hours; no limit, no refunds. A new currency starts from 500 and 3000.
 */
export function StaffRefundLimits({client, t, newId, staffId}: {client: ApiClient; t: Translate;
  newId: () => string; staffId: string}) {
  const [limits, setLimits] = useState<Limit[]>([]);
  const [form, setForm] = useState({currency: 'UAH', per: '500', daily: '3000', reason: ''});
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const read = useCallback(async () => {
    setLimits(((await client.get('/api/admin/v1/staff/{staff_id}/refund-limits' as never,
      {params: {staff_id: staffId}} as never)) as {limits: Limit[]}).limits);
  }, [client, staffId]);

  useEffect(() => {
    read().catch(failure => setError(failure));
  }, [read]);

  async function save() {
    const currency = form.currency.trim().toUpperCase();
    const per = minorOf(form.per);
    const daily = minorOf(form.daily);
    const reason = form.reason.trim();
    if (!/^[A-Z]{3}$/.test(currency) || per === null || daily === null || daily < per || !reason) {
      setMessage(t('rfLimitNeeds'));
      return;
    }
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      await client.post('/api/admin/v1/staff/{staff_id}/refund-limits' as never, {params: {staff_id: staffId},
        body: {command_id: newId(), currency, per_refund_minor: per, daily_minor: daily,
          expected_version: limits.find(l => l.currency === currency)?.version ?? 0, reason}} as never);
      setMessage(t('rfLimitSaved'));
      setForm(f => ({...f, reason: ''}));
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) setMessage(t('rfChanged'));
      else setError(failure);
    } finally {
      acting.current = false;
      await read().catch(again => setError(again));
    }
  }

  return (
    <fieldset>
      <legend>{t('rfLimitsTitle')}</legend>
      {limits.length === 0 ? <p>{t('rfNoLimits')}</p> : null}
      <ul>{limits.map(l => <li key={l.currency}>{t('rfLimitLine', {currency: l.currency,
        per: decimal(l.per_refund_minor), daily: decimal(l.daily_minor), used: decimal(l.used_minor)})}</li>)}</ul>
      <label>{t('rfLimitCurrency')}<input value={form.currency}
        onChange={e => setForm(f => ({...f, currency: e.target.value}))} /></label>
      <label>{t('rfLimitPer')}<input inputMode="decimal" value={form.per}
        onChange={e => setForm(f => ({...f, per: e.target.value}))} /></label>
      <label>{t('rfLimitDaily')}<input inputMode="decimal" value={form.daily}
        onChange={e => setForm(f => ({...f, daily: e.target.value}))} /></label>
      <label>{t('rfLimitReason')}<input value={form.reason}
        onChange={e => setForm(f => ({...f, reason: e.target.value}))} /></label>
      <button type="button" onClick={() => void save()}>{t('rfLimitSave')}</button>
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </fieldset>
  );
}

type RefundRules = {minimum_minor: Record<string, number>; default_per_refund_minor: Record<string, number>;
  default_daily_minor: Record<string, number>; rider_warning_count: number; rider_warning_days: number;
  staff_days: number; super_admin_days: number; refund_tips: boolean; card_for_cash: boolean;
  show_reason_to_rider: boolean; reminder_hours: number; close_after_days: number; bonus_validity_days: number};
type SettingsVersion = {version: number; settings: Record<string, unknown> & {refunds?: RefundRules | null}};

/** ADR 0018: the server's defaults, shown until the service saves its own. */
export const REFUND_DEFAULTS: RefundRules = {minimum_minor: {UAH: 1000}, default_per_refund_minor: {UAH: 50000},
  default_daily_minor: {UAH: 300000}, rider_warning_count: 3, rider_warning_days: 30, staff_days: 30,
  super_admin_days: 180, refund_tips: false, card_for_cash: false, show_reason_to_rider: false, reminder_hours: 4,
  close_after_days: 7, bonus_validity_days: 0};
const COUNTS: [keyof RefundRules, number, number][] = [['rider_warning_count', 1, 100], ['rider_warning_days', 1, 365],
  ['staff_days', 1, 3650], ['super_admin_days', 1, 3650], ['reminder_hours', 1, 168], ['close_after_days', 1, 90]];
const SUMS = ['minimum_minor', 'default_per_refund_minor', 'default_daily_minor'] as const;

/**
 * The service's refund rules (ADR 0018 A2–A9), for holders of settings.manage: per currency the minimum and the limits
 * a staff card starts with; the warning, the terms, tips, the reason to the rider, the reminder and the close. A
 * card refund of a cash trip and bonus validity are not built, so they stay off and 0.
 */
export function RefundSettings({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const [current, setCurrent] = useState<SettingsVersion | null>(null);
  const [currency, setCurrency] = useState('UAH');
  const [text, setText] = useState<Record<string, string>>({});
  const [flags, setFlags] = useState({tips: false, reason: false});
  const [why, setWhy] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const show = useCallback((value: SettingsVersion, code: string) => {
    const r = value.settings.refunds ?? REFUND_DEFAULTS;
    setCurrent(value);
    setText({...Object.fromEntries(COUNTS.map(([k]) => [k, String(r[k])])),
      ...Object.fromEntries(SUMS.map(k => [k, r[k][code] === undefined ? '' : decimal(r[k][code]!)]))});
    setFlags({tips: r.refund_tips, reason: r.show_reason_to_rider});
    setWhy('');
  }, []);

  const read = useCallback(async () => {
    show(await client.get('/api/admin/v1/settings' as never, {} as never) as SettingsVersion, currency);
  }, [client, show, currency]);

  useEffect(() => {
    read().catch(failure => setError(failure));
  }, [read]);

  async function save() {
    if (acting.current || !current) return;
    const r = current.settings.refunds ?? REFUND_DEFAULTS;
    const counts = Object.fromEntries(COUNTS.map(([k, min, max]) => {
      const n = /^[0-9]{1,4}$/.test((text[k] ?? '').trim()) ? Number(text[k]!.trim()) : NaN;
      return [k, n >= min && n <= max ? n : null];
    }));
    const sums = Object.fromEntries(SUMS.map(k => [k, minorOf(text[k] ?? '')]));
    if (Object.values(counts).some(v => v === null) || Object.values(sums).some(v => v === null)
      || !/^[A-Z]{3}$/.test(currency) || (counts.super_admin_days as number) < (counts.staff_days as number)
      || (sums.default_daily_minor as number) < (sums.default_per_refund_minor as number) || !why.trim()) {
      setMessage(t('rfSettingsNeeds'));
      return;
    }
    const refunds: RefundRules = {...r, ...(counts as Partial<RefundRules>), refund_tips: flags.tips,
      show_reason_to_rider: flags.reason, card_for_cash: false, bonus_validity_days: 0,
      ...Object.fromEntries(SUMS.map(k => [k, {...r[k], [currency]: sums[k] as number}]))};
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      show(await client.post('/api/admin/v1/settings' as never, {body: {command_id: newId(),
        expected_version: current.version, settings: {...current.settings, refunds}, reason: why.trim()}} as never) as
        SettingsVersion, currency);
      setMessage(t('rfSettingsSaved'));
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('rfChanged'));
        await read().catch(again => setError(again));
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  const field = (key: string) => (
    <label key={key}>{t('rfs_' + key)}<input inputMode="decimal" value={text[key] ?? ''}
      onChange={e => setText(v => ({...v, [key]: e.target.value}))} /></label>
  );
  return (
    <section aria-labelledby="refund-settings-title">
      <h1 id="refund-settings-title">{t('rfSettingsTitle')}</h1>
      {current ? (
        <>
          <label>{t('rfLimitCurrency')}<input value={currency}
            onChange={e => setCurrency(e.target.value.trim().toUpperCase())} /></label>
          {SUMS.map(field)}
          {COUNTS.map(([k]) => field(k))}
          <label><input type="checkbox" checked={flags.tips}
            onChange={e => setFlags(f => ({...f, tips: e.target.checked}))} />{t('rfs_refund_tips')}</label>
          <label><input type="checkbox" checked={flags.reason}
            onChange={e => setFlags(f => ({...f, reason: e.target.checked}))} />{t('rfs_show_reason_to_rider')}</label>
          <label>{t('rfLimitReason')}<input value={why} onChange={e => setWhy(e.target.value)} /></label>
          <button type="button" onClick={() => void save()}>{t('rfSettingsSave')}</button>
        </>
      ) : null}
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
