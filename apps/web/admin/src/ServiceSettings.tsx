import {useCallback, useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';
import {decimal} from './Promotions.js';

type Settings = Record<string, unknown> & {
  brand: Record<string, string | null>; languages: {default_language: string; enabled: string[]};
  calls: {mode: string; service_phone?: string | null}; ratings?: {edit_window_hours: number};
  tips?: {window_hours: number}; orders?: {active_per_payer: number};
  cash_not_received?: {credit_driver: boolean; driver_share_percent: number};
  staff_top_ups?: {daily_max_per_staff_minor?: Record<string, number>} | null;
  rider_debts?: {allowed_minor?: Record<string, number>} | null};
type Version = {version: number; settings: Settings; reason?: string | null};

const LANGUAGES = ['uk', 'pl', 'ru', 'en'];
const COLOR = /^#[0-9A-Fa-f]{6}$/;
const E164 = /^\+[1-9][0-9]{7,14}$/;
const BRAND = ['service_name', 'primary_color', 'on_primary_color', 'accent_color', 'logo_url', 'support_phone',
  'support_email', 'support_telegram', 'privacy_policy_url', 'terms_url'];

/** WCAG contrast of two #RRGGBB colours. */
function contrast(a: string, b: string) {
  const lum = (hex: string) => {
    const [r, g, bl] = [1, 3, 5].map(i => parseInt(hex.slice(i, i + 2), 16) / 255)
      .map(c => c <= 0.03928 ? c / 12.92 : ((c + 0.055) / 1.055) ** 2.4) as [number, number, number];
    return 0.2126 * r + 0.7152 * g + 0.0722 * bl;
  };
  const [hi, lo] = [lum(a), lum(b)].sort((x, y) => y - x) as [number, number];
  return (hi + 0.05) / (lo + 0.05);
}

/** "1500.5" → 150050 minor units without floating point; null when not a number with at most two decimals. */
function minorUnits(text: string) {
  const parts = /^([0-9]{1,10})(?:[.,]([0-9]{1,2}))?$/.exec(text.trim());
  return parts ? Number(parts[1]) * 100 + Number((parts[2] ?? '').padEnd(2, '0')) : null;
}

const whole = (text: string, min: number, max: number) => {
  const n = /^[0-9]{1,4}$/.test(text.trim()) ? Number(text.trim()) : NaN;
  return n >= min && n <= max ? n : null;
};

/**
 * The service's settings for holders of settings.manage (#411, REQ-TEN-06/07): the brand, languages, how calls work,
 * rating and tip windows, the active-order limit, cash not received, staff top-up limits and rider debts per
 * currency. The whole settings go back with every change; what this screen does not edit goes back as it was read.
 */
export function ServiceSettings({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const [current, setCurrent] = useState<Version | null>(null);
  const [currencies, setCurrencies] = useState<string[]>([]);
  const [brand, setBrand] = useState<Record<string, string>>({});
  const [languages, setLanguages] = useState({main: 'uk', enabled: [] as string[]});
  const [calls, setCalls] = useState({mode: 'DIRECT', phone: ''});
  const [numbers, setNumbers] = useState({rating: '', tips: '', active: '', share: ''});
  const [credit, setCredit] = useState(true);
  const [limits, setLimits] = useState<Record<string, string>>({});
  const [debts, setDebts] = useState<Record<string, string>>({});
  const [reason, setReason] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const show = useCallback((value: Version) => {
    const s = value.settings;
    setCurrent(value);
    setBrand(Object.fromEntries(BRAND.map(k => [k, s.brand[k] ?? ''])));
    setLanguages({main: s.languages.default_language, enabled: [...s.languages.enabled]});
    setCalls({mode: s.calls.mode, phone: s.calls.service_phone ?? ''});
    setNumbers({rating: String(s.ratings?.edit_window_hours ?? 24), tips: String(s.tips?.window_hours ?? 24),
      active: String(s.orders?.active_per_payer ?? 3), share: String(s.cash_not_received?.driver_share_percent ?? 100)});
    setCredit(s.cash_not_received?.credit_driver ?? true);
    setLimits(Object.fromEntries(Object.entries(s.staff_top_ups?.daily_max_per_staff_minor ?? {})
      .map(([c, v]) => [c, decimal(v)])));
    setDebts(Object.fromEntries(Object.entries(s.rider_debts?.allowed_minor ?? {}).map(([c, v]) => [c, decimal(v)])));
    setReason('');
  }, []);

  const read = useCallback(async () => {
    show(await client.get('/api/admin/v1/settings' as never, {} as never) as Version);
  }, [client, show]);

  useEffect(() => {
    read().catch(failure => setError(failure));
    client.get('/api/config/v1/bootstrap' as never, {} as never)
      .then(boot => setCurrencies([...new Set((boot as {cities: {currency: string}[]}).cities.map(c => c.currency))]))
      .catch(() => undefined);
  }, [client, read]);

  /** The whole settings to send, or null when the server would refuse them. */
  function build(): Settings | null {
    if (!current) return null;
    const b = Object.fromEntries(BRAND.map(k => [k, (brand[k] ?? '').trim() || null])) as Record<string, string | null>;
    const rating = whole(numbers.rating, 1, 720);
    const tips = whole(numbers.tips, 1, 720);
    const active = whole(numbers.active, 1, 10);
    const share = whole(numbers.share, 0, 100);
    const limitEntries = Object.entries(limits).filter(([, v]) => v.trim() !== '').map(([c, v]) => [c, minorUnits(v)]);
    const debtEntries = all().map(c => [c, (debts[c] ?? '').trim() === '' ? 0 : minorUnits(debts[c]!)]);
    const colors = COLOR.test(b.primary_color ?? '') && COLOR.test(b.on_primary_color ?? '')
      && (!b.accent_color || COLOR.test(b.accent_color));
    if (!b.service_name || b.service_name.length > 60 || !colors
      || contrast(b.primary_color!, b.on_primary_color!) < 4.5 || !languages.enabled.includes(languages.main)
      || (calls.mode === 'VIA_SERVICE_NUMBERS' && !E164.test(calls.phone.trim())) || rating === null || tips === null
      || active === null || share === null || limitEntries.some(([, v]) => v === null || v === 0)
      || debtEntries.some(([, v]) => v === null) || !reason.trim()) {
      return null;
    }
    return {...current.settings, brand: b,
      languages: {default_language: languages.main, enabled: LANGUAGES.filter(l => languages.enabled.includes(l))},
      calls: {mode: calls.mode, service_phone: calls.phone.trim() || null}, ratings: {edit_window_hours: rating},
      tips: {window_hours: tips}, orders: {active_per_payer: active},
      cash_not_received: {credit_driver: credit, driver_share_percent: credit ? share : 0},
      staff_top_ups: {daily_max_per_staff_minor: Object.fromEntries(limitEntries)},
      rider_debts: {allowed_minor: Object.fromEntries(debtEntries)}};
  }

  async function save() {
    if (acting.current) return;
    const settings = build();
    if (!settings || !current) {
      setMessage(t('svcNeeds'));
      return;
    }
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      show(await client.post('/api/admin/v1/settings' as never, {body: {command_id: newId(),
        expected_version: current.version, settings, reason: reason.trim()}} as never) as Version);
      setMessage(t('svcSaved'));
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('svcConflict'));
        await read().catch(again => setError(again));
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  function all() {
    return [...new Set([...currencies, ...Object.keys(limits), ...Object.keys(debts)])];
  }

  if (!current) return error ? <Failure error={error} t={t} /> : <p>{t('loading')}</p>;
  const field = (key: string) => (
    <label key={key}>{t('svc_' + key)}<input value={brand[key] ?? ''}
      onChange={e => setBrand(all => ({...all, [key]: e.target.value}))} /></label>
  );
  const num = (key: keyof typeof numbers, label: string) => (
    <label>{t(label)}<input inputMode="numeric" value={numbers[key]}
      onChange={e => setNumbers(n => ({...n, [key]: e.target.value}))} /></label>
  );
  return (
    <section aria-labelledby="svc-title">
      <h1 id="svc-title">{t('svcTitle')}</h1>
      {current.version > 0 ? <p>{t('svcVersion', {version: current.version, reason: current.reason ?? '—'})}</p> : null}
      <fieldset>
        <legend>{t('svcBrand')}</legend>
        {BRAND.map(field)}
      </fieldset>
      <fieldset>
        <legend>{t('svcLanguages')}</legend>
        <label htmlFor="svc-language">{t('svcDefaultLanguage')}</label>
        <select id="svc-language" value={languages.main} onChange={e => setLanguages(l => ({...l, main: e.target.value}))}>
          {LANGUAGES.map(l => <option key={l} value={l}>{l}</option>)}
        </select>
        {LANGUAGES.map(l => (
          <label key={l}><input type="checkbox" checked={languages.enabled.includes(l)} onChange={e => setLanguages(x =>
            ({...x, enabled: e.target.checked ? [...x.enabled, l] : x.enabled.filter(y => y !== l)}))} />{l}</label>
        ))}
      </fieldset>
      <fieldset>
        <legend>{t('svcCalls')}</legend>
        <label htmlFor="svc-calls">{t('svcCallMode')}</label>
        <select id="svc-calls" value={calls.mode} onChange={e => setCalls(c => ({...c, mode: e.target.value}))}>
          <option value="VIA_SERVICE_NUMBERS">{t('svcVia')}</option>
          <option value="DIRECT">{t('svcDirect')}</option>
        </select>
        {calls.mode === 'DIRECT' ? <p>{t('svcDirectWarning')}</p> : null}
        <label>{t('svcServicePhone')}<input type="tel" value={calls.phone}
          onChange={e => setCalls(c => ({...c, phone: e.target.value}))} /></label>
      </fieldset>
      <fieldset>
        <legend>{t('svcRules')}</legend>
        {num('rating', 'svcRatingWindow')}
        {num('tips', 'svcTipsWindow')}
        {num('active', 'svcActive')}
        <label><input type="checkbox" checked={credit} onChange={e => setCredit(e.target.checked)} />
          {t('svcCredit')}</label>
        {num('share', 'svcShare')}
        {all().map(c => (
          <div key={c}>
            <label>{t('svcLimit', {currency: c})}<input inputMode="decimal" value={limits[c] ?? ''}
              onChange={e => setLimits(l => ({...l, [c]: e.target.value}))} /></label>
            <label>{t('svcDebt', {currency: c})}<input inputMode="decimal" value={debts[c] ?? ''}
              onChange={e => setDebts(d => ({...d, [c]: e.target.value}))} /></label>
          </div>
        ))}
      </fieldset>
      <label>{t('svcReason')}<input value={reason} onChange={e => setReason(e.target.value)} /></label>
      <button type="button" onClick={() => void save()}>{t('svcSave')}</button>
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
