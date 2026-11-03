import {useCallback, useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

type Merchant = {id: string; provider: string; account: string; domain: string; currency: string; city_ids: string[];
  secret_source: string; secret_hint: string | null};
type Edit = {domain: string; secret: string; cities: string[]; reason: string; own: string};

const CURRENCY = /^[A-Z]{3}$/;

/**
 * The payment merchants for holders of integrations.manage in every city (#394, ADR 0009/0016): the list with the
 * key's hint only, adding one and changing what was changed (the rest stays). The own password and every key typed
 * are emptied after each request; a key is never shown.
 */
export function Merchants({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const [merchants, setMerchants] = useState<Merchant[] | null>(null);
  const [cities, setCities] = useState<{id: string; name: string}[]>([]);
  const [form, setForm] = useState({provider: 'WAYFORPAY', account: '', domain: '', currency: 'UAH', secret: '',
    reason: '', own: ''});
  const [picked, setPicked] = useState<string[]>([]);
  const [editing, setEditing] = useState<Record<string, Edit>>({});
  const [checks, setChecks] = useState<Record<string, {ok: boolean; message: string}>>({});
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const read = useCallback(async () => {
    setMerchants(((await client.get('/api/admin/v1/payment-merchants' as never, {} as never)) as
      {merchants: Merchant[]}).merchants);
  }, [client]);

  useEffect(() => {
    read().catch(failure => setError(failure));
    client.get('/api/config/v1/bootstrap' as never, {} as never)
      .then(boot => setCities((boot as {cities: {id: string; name: string}[]}).cities)).catch(() => undefined);
  }, [client, read]);

  const ordered = (ids: string[]) => [...cities.map(c => c.id).filter(id => ids.includes(id)),
    ...ids.filter(id => !cities.some(c => c.id === id))];

  async function run(work: () => Promise<void>, forget: () => void) {
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      await work();
      setMessage(t('merchSaved'));
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 403) setMessage(t('ownPasswordWrong'));
      else setError(failure);
    } finally {
      forget();
      acting.current = false;
    }
  }

  function add() {
    if (!form.account.trim() || !form.domain.trim() || !CURRENCY.test(form.currency.trim()) || !form.secret
      || !form.reason.trim() || !form.own) {
      setMessage(t('merchNeeds'));
      return;
    }
    return run(async () => {
      const created = await client.post('/api/admin/v1/payment-merchants' as never, {body: {command_id: newId(),
        password: form.own, provider: form.provider, account: form.account.trim(), domain: form.domain.trim(),
        currency: form.currency.trim(), secret: form.secret, city_ids: ordered(picked), reason: form.reason.trim()}
      } as never) as Merchant;
      setMerchants(list => [...(list ?? []), created]);
      setForm(f => ({...f, account: '', domain: '', reason: ''}));
      setPicked([]);
    }, () => setForm(f => ({...f, secret: '', own: ''})));
  }

  function save(m: Merchant) {
    const e = editing[m.id];
    if (!e) return;
    const domain = e.domain.trim() !== m.domain ? e.domain.trim() : null;
    const secret = e.secret ? e.secret : null;
    const same = [...e.cities].sort().join() === [...m.city_ids].sort().join();
    const cityIds = same ? null : ordered(e.cities);
    if ((domain === null && secret === null && cityIds === null) || !e.reason.trim() || !e.own) {
      setMessage(t('merchNothing'));
      return;
    }
    return run(async () => {
      const changed = await client.post('/api/admin/v1/payment-merchants/{merchant_id}/change' as never, {params: {
        merchant_id: m.id}, body: {command_id: newId(), password: e.own, domain, secret, city_ids: cityIds,
        reason: e.reason.trim()}} as never) as Merchant;
      setMerchants(list => (list ?? []).map(x => x.id === changed.id ? changed : x));
      setEditing(all => Object.fromEntries(Object.entries(all).filter(([id]) => id !== m.id)));
    }, () => setEditing(all => all[m.id] ? {...all, [m.id]: {...all[m.id]!, secret: '', own: ''}} : all));
  }

  async function check(m: Merchant) {
    try {
      const answer = await client.post('/api/admin/v1/payment-merchants/{merchant_id}/check' as never, {params: {
        merchant_id: m.id}} as never) as {ok: boolean; message: string};
      setChecks(all => ({...all, [m.id]: answer}));
    } catch (failure) {
      setError(failure);
    }
  }

  const name = (id: string) => cities.find(c => c.id === id)?.name ?? id;
  const key = (m: Merchant) => m.secret_source === 'NONE' ? t('merchNoKey')
    : t('merchKey', {hint: m.secret_hint ?? '', source: t('merchSource_' + m.secret_source)});
  const cityBoxes = (chosen: string[], toggle: (id: string, on: boolean) => void) => cities.map(c => (
    <label key={c.id}><input type="checkbox" checked={chosen.includes(c.id)}
      onChange={e => toggle(c.id, e.target.checked)} />{t('merchCity', {name: c.name})}</label>
  ));
  const set = (k: keyof typeof form) => (e: {target: {value: string}}) => setForm(f => ({...f, [k]: e.target.value}));
  return (
    <section aria-labelledby="merchants-title">
      <h2 id="merchants-title">{t('merchTitle')}</h2>
      <ul>
        {(merchants ?? []).map(m => {
          const e = editing[m.id];
          const change = (next: Partial<Edit>) => setEditing(all => ({...all, [m.id]: {...all[m.id]!, ...next}}));
          return (
            <li key={m.id}>
              <span>{[m.provider, m.account, m.domain, m.currency, t('merchCities', {list: m.city_ids.length
                ? m.city_ids.map(name).join(', ') : '—'}), key(m)].join(' · ')}</span>
              <button type="button" onClick={() => void check(m)}>{t('merchCheck')}</button>
              {checks[m.id] ? <p>{(checks[m.id]!.ok ? '✓ ' : '✗ ') + checks[m.id]!.message}</p> : null}
              {e ? (
                <>
                  <label>{t('merchDomainOf')}<input value={e.domain} onChange={v => change({domain: v.target.value})} />
                  </label>
                  <label>{t('merchNewKey')}<input type="password" autoComplete="off" value={e.secret}
                    onChange={v => change({secret: v.target.value})} /></label>
                  {cityBoxes(e.cities, (id, on) => change({cities: on ? [...e.cities, id]
                    : e.cities.filter(x => x !== id)}))}
                  <label>{t('merchReasonOf')}<input value={e.reason} onChange={v => change({reason: v.target.value})} />
                  </label>
                  <label>{t('merchPasswordOf')}<input type="password" value={e.own}
                    onChange={v => change({own: v.target.value})} /></label>
                  <button type="button" onClick={() => void save(m)}>{t('merchSave')}</button>
                </>
              ) : (
                <button type="button" onClick={() => setEditing(all => ({...all, [m.id]: {domain: m.domain, secret: '',
                  cities: [...m.city_ids], reason: '', own: ''}}))}>{t('merchEdit')}</button>
              )}
            </li>
          );
        })}
      </ul>
      <fieldset>
        <legend>{t('merchAddTitle')}</legend>
        <label htmlFor="merchant-provider">{t('merchProvider')}</label>
        <select id="merchant-provider" value={form.provider} onChange={set('provider')}>
          <option value="WAYFORPAY">WAYFORPAY</option>
          <option value="FAKE">FAKE</option>
        </select>
        <label>{t('merchAccount')}<input value={form.account} onChange={set('account')} /></label>
        <label>{t('merchDomain')}<input value={form.domain} onChange={set('domain')} /></label>
        <label>{t('merchCurrency')}<input value={form.currency} onChange={set('currency')} /></label>
        <label>{t('merchKeyInput')}<input type="password" autoComplete="off" value={form.secret}
          onChange={set('secret')} /></label>
        {cityBoxes(picked, (id, on) => setPicked(list => on ? [...list, id] : list.filter(x => x !== id)))}
        <p>{t('merchMoves')}</p>
        <label>{t('merchReason')}<input value={form.reason} onChange={set('reason')} /></label>
        <label>{t('merchPassword')}<input type="password" value={form.own} onChange={set('own')} /></label>
        <button type="button" onClick={() => void add()}>{t('merchAdd')}</button>
      </fieldset>
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
