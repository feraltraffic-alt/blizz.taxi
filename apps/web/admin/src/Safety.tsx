import {useCallback, useEffect, useRef, useState} from 'react';
import {Link} from 'react-router-dom';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

type Extra = {label: Record<string, string>; phone: string};
type Version = {city_id: string; version: number; emergency_number: string; support_phone: string | null;
  extra: Extra[]; reason: string | null};

const EMERGENCY = /^[0-9]{2,6}$/;
const E164 = /^\+[1-9][0-9]{7,14}$/;
const MAX_EXTRA = 5;

/**
 * A city's safety contacts for holders of settings.manage (#381, REQ-RID-09): the emergency number, the support phone
 * and up to five more contacts, each labelled at least in the service's default language. What the server would
 * refuse is refused here first; every save carries the version that was read.
 */
export function SafetyContactsSettings({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const [cities, setCities] = useState<{id: string; name: string}[]>([]);
  const [languages, setLanguages] = useState<{main: string; enabled: string[]}>({main: 'uk', enabled: ['uk']});
  const [cityId, setCityId] = useState('');
  const [current, setCurrent] = useState<Version | null>(null);
  const [emergency, setEmergency] = useState('');
  const [support, setSupport] = useState('');
  const [extra, setExtra] = useState<Extra[]>([]);
  const [reason, setReason] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  useEffect(() => {
    client.get('/api/config/v1/bootstrap' as never, {} as never).then(boot => {
      const value = boot as {cities: {id: string; name: string}[]; languages?: {default_language: string;
        enabled: string[]}};
      setCities(value.cities);
      if (value.languages) setLanguages({main: value.languages.default_language, enabled: value.languages.enabled});
      if (value.cities[0]) setCityId(value.cities[0].id);
    }).catch(failure => setError(failure));
  }, [client]);

  const show = useCallback((value: Version) => {
    setCurrent(value);
    setEmergency(value.emergency_number);
    setSupport(value.support_phone ?? '');
    setExtra(value.extra.map(e => ({label: {...e.label}, phone: e.phone})));
    setReason('');
  }, []);

  const read = useCallback(async (id: string) => {
    show(await client.get('/api/admin/v1/settings/safety-contacts/{city_id}' as never,
      {params: {city_id: id}} as never) as Version);
  }, [client, show]);

  useEffect(() => {
    if (!cityId) return;
    setCurrent(null);
    read(cityId).catch(failure => setError(failure));
  }, [cityId, read]);

  async function save() {
    if (!current || acting.current) return;
    const phone = support.trim();
    const cleaned = extra.map(e => ({label: Object.fromEntries(Object.entries(e.label).map(([k, v]) => [k, v.trim()] as const)
      .filter(([, v]) => v !== '')), phone: e.phone.trim()}));
    const why = reason.trim();
    if (!EMERGENCY.test(emergency.trim()) || (phone && !E164.test(phone))
      || cleaned.some(e => !E164.test(e.phone) || !e.label[languages.main]
        || Object.values(e.label).some(v => String(v).length > 80))
      || !why || why.length > 500) {
      setMessage(t('safetyNeeds'));
      return;
    }
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      show(await client.post('/api/admin/v1/settings/safety-contacts/{city_id}' as never, {params: {city_id: cityId},
        body: {command_id: newId(), expected_version: current.version, emergency_number: emergency.trim(),
          support_phone: phone || null, extra: cleaned, reason: why}} as never) as Version);
      setMessage(t('safetySaved'));
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('safetyConflict'));
        await read(cityId).catch(again => setError(again));
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  const change = (n: number, over: Partial<Extra>) =>
    setExtra(list => list.map((e, at) => at === n ? {...e, ...over} : e));
  const shownLanguages = (e: Extra) => [...languages.enabled,
    ...Object.keys(e.label).filter(k => !languages.enabled.includes(k))];
  return (
    <section aria-labelledby="settings-title">
      <h1 id="settings-title">{t('navSettings')}</h1>
      <p><Link to="/settings/cancel-reasons">{t('settingsCancelReasons')}</Link></p>
      <p><Link to="/settings/service">{t('settingsService')}</Link></p>
      <p><Link to="/settings/call-lines">{t('settingsCallLines')}</Link></p>
      <h2>{t('safetyContactsTitle')}</h2>
      <label htmlFor="safety-city">{t('ordersCity')}</label>
      <select id="safety-city" value={cityId} onChange={e => setCityId(e.target.value)}>
        {cities.map(c => <option key={c.id} value={c.id}>{c.name}</option>)}
      </select>
      {current ? (
        <>
          {current.version > 0 ? <p>{t('safetyVersion', {version: current.version, reason: current.reason ?? '—'})}</p>
            : null}
          <label>{t('emergencyNumber')}<input inputMode="numeric" value={emergency}
            onChange={e => setEmergency(e.target.value)} /></label>
          <label>{t('supportPhone')}<input type="tel" value={support} onChange={e => setSupport(e.target.value)} />
          </label>
          {extra.map((e, n) => (
            <fieldset key={n}>
              <legend>{t('extraN', {n: n + 1})}</legend>
              {shownLanguages(e).map(lang => (
                <label key={lang}>{t('extraLabel', {n: n + 1, lang})}
                  <input value={e.label[lang] ?? ''} onChange={v => change(n, {label: {...e.label, [lang]: v.target.value}})} />
                </label>
              ))}
              <label>{t('extraPhone', {n: n + 1})}
                <input type="tel" value={e.phone} onChange={v => change(n, {phone: v.target.value})} /></label>
              <button type="button" onClick={() => setExtra(list => list.filter((_, at) => at !== n))}>
                {t('removeExtra', {n: n + 1})}</button>
            </fieldset>
          ))}
          <button type="button" disabled={extra.length >= MAX_EXTRA}
            onClick={() => setExtra(list => [...list, {label: {}, phone: ''}])}>{t('addExtra')}</button>
          <label>{t('safetyReason')}<input value={reason} onChange={e => setReason(e.target.value)} /></label>
          <button type="button" onClick={() => void save()}>{t('saveSafety')}</button>
        </>
      ) : error ? null : <p>{t('loading')}</p>}
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
