import {useCallback, useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

type Rule = {currency: string; enabled: boolean; max_per_transfer_minor: number; max_per_day_minor: number;
  min_balance_after_minor: number; version: number};
type Form = {enabled: boolean; perTransfer: string; perDay: string; minAfter: string; reason: string};

/** "-100" or "750,5" → minor units without floating point; null when not a number with at most two decimals. */
function signedMinor(text: string) {
  const parts = /^(-?)([0-9]{1,10})(?:[.,]([0-9]{1,2}))?$/.exec(text.trim());
  if (!parts) return null;
  const value = Number(parts[2]) * 100 + Number((parts[3] ?? '').padEnd(2, '0'));
  return parts[1] ? -value : value;
}

function amount(minor: number) {
  const abs = Math.abs(minor);
  return (minor < 0 ? '−' : '') + String(Math.floor(abs / 100)).replace(/\B(?=(\d{3})+(?!\d))/g, ' ') + '.'
    + String(abs % 100).padStart(2, '0');
}

const plain = (minor: number) => (minor < 0 ? '-' : '') + Math.floor(Math.abs(minor) / 100) + '.'
  + String(Math.abs(minor) % 100).padStart(2, '0');

const formOf = (rule: Rule | undefined): Form => rule ? {enabled: rule.enabled, perTransfer: plain(rule.max_per_transfer_minor),
  perDay: plain(rule.max_per_day_minor), minAfter: plain(rule.min_balance_after_minor), reason: ''}
  : {enabled: false, perTransfer: '', perDay: '', minAfter: '0', reason: ''};

/**
 * Finance for holders of finance.manage (#416, ADR 0010): the limits of transfers between drivers per currency, a
 * rule's currencies and those of the service's cities without one yet. Amounts are typed in major units and sent in
 * minor units without floating point; each change carries the rule's version, or 0 for a new rule.
 */
export function Finance({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const [rules, setRules] = useState<Rule[] | null>(null);
  const [currencies, setCurrencies] = useState<string[]>([]);
  const [forms, setForms] = useState<Record<string, Form>>({});
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const read = useCallback(async () => {
    const list = ((await client.get('/api/admin/v1/settings/driver-transfers' as never, {} as never)) as
      {rules: Rule[]}).rules;
    setRules(list);
    setForms(Object.fromEntries(list.map(r => [r.currency, formOf(r)])));
  }, [client]);

  useEffect(() => {
    read().catch(failure => setError(failure));
    client.get('/api/config/v1/bootstrap' as never, {} as never)
      .then(boot => setCurrencies([...new Set((boot as {cities: {currency: string}[]}).cities.map(c => c.currency))]))
      .catch(() => undefined);
  }, [client, read]);

  async function save(currency: string) {
    if (acting.current) return;
    const rule = (rules ?? []).find(r => r.currency === currency);
    const form = forms[currency] ?? formOf(rule);
    const perTransfer = signedMinor(form.perTransfer);
    const perDay = signedMinor(form.perDay);
    const minAfter = signedMinor(form.minAfter);
    if (perTransfer === null || perTransfer < 1 || perDay === null || perDay < 1 || perDay < perTransfer
      || minAfter === null || minAfter < 0 || !form.reason.trim()) {
      setMessage(t('transferNeeds'));
      return;
    }
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      const saved = await client.post('/api/admin/v1/settings/driver-transfers/{currency}' as never, {params: {currency},
        body: {command_id: newId(), expected_version: 0, enabled: form.enabled,
          max_per_transfer_minor: perTransfer, max_per_day_minor: perDay, min_balance_after_minor: minAfter,
          reason: form.reason.trim()}} as never) as Rule;
      setRules(list => [...(list ?? []).filter(r => r.currency !== currency), saved]);
      setForms(all => ({...all, [currency]: formOf(saved)}));
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('transferConflict'));
        await read().catch(again => setError(again));
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  if (!rules) return error ? <Failure error={error} t={t} /> : <p>{t('loading')}</p>;
  const all = [...new Set([...rules.map(r => r.currency), ...currencies])];
  return (
    <section aria-labelledby="finance-title">
      <h1 id="finance-title">{t('navFinance')}</h1>
      <h2>{t('transfersTitle')}</h2>
      {all.map(currency => {
        const rule = rules.find(r => r.currency === currency);
        const form = forms[currency] ?? formOf(rule);
        const set = (next: Partial<Form>) => setForms(f => ({...f, [currency]: {...form, ...next}}));
        return (
          <fieldset key={currency}>
            <legend>{t('transfersIn', {currency})}</legend>
            <p>{rule ? [t(rule.enabled ? 'transfersOn' : 'transfersOff'),
              t('transferPer', {amount: amount(rule.max_per_transfer_minor)}),
              t('transferDay', {amount: amount(rule.max_per_day_minor)}),
              t('transferMin', {amount: amount(rule.min_balance_after_minor)})].join(' · ') : t('transferNoRule')}</p>
            <label><input type="checkbox" checked={form.enabled} onChange={e => set({enabled: e.target.checked})} />
              {t('transferEnabled')}</label>
            <label>{t('transferPerLabel')}<input inputMode="decimal" value={form.perTransfer}
              onChange={e => set({perTransfer: e.target.value})} /></label>
            <label>{t('transferDayLabel')}<input inputMode="decimal" value={form.perDay}
              onChange={e => set({perDay: e.target.value})} /></label>
            <label>{t('transferMinLabel')}<input inputMode="decimal" value={form.minAfter}
              onChange={e => set({minAfter: e.target.value})} /></label>
            <label>{t('reason')}<input value={form.reason} onChange={e => set({reason: e.target.value})} /></label>
            <button type="button" onClick={() => void save(currency)}>{t('transferSave')}</button>
          </fieldset>
        );
      })}
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
