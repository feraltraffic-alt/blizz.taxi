import {useCallback, useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

type Service = {id: string; code: string; name: string; state: 'ACTIVE' | 'SUSPENDED'; version: number;
  created_at: string};

const CODE = /^[a-z0-9][a-z0-9-]{1,39}$/;
const EMPTY = {code: '', name: '', login: '', initial: '', first: '', last: '', reason: '', own: ''};
const day = (at: string) => new Date(at).toLocaleDateString('ru-RU', {timeZone: 'UTC'});

/**
 * The server's taxi services, for the platform owner only (#448, ADR 0016): a new one with its first super admin,
 * confirmed with the owner's own password, and suspending or resuming one against its version. Neither password stays
 * on the screen after a request, whatever the answer.
 */
export function Services({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const [services, setServices] = useState<Service[] | null>(null);
  const [form, setForm] = useState(EMPTY);
  const [reasons, setReasons] = useState<Record<string, string>>({});
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const read = useCallback(async () => {
    setServices(((await client.get('/api/admin/v1/services' as never, {} as never)) as {services: Service[]})
      .services);
  }, [client]);

  useEffect(() => {
    read().catch(failure => setError(failure));
  }, [read]);

  async function run(work: () => Promise<void>, refusal: (failure: ApiError) => string | null, after = () => {}) {
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      await work();
    } catch (failure) {
      const known = failure instanceof ApiError ? refusal(failure) : null;
      if (known) setMessage(known);
      else setError(failure);
    } finally {
      after();
      acting.current = false;
    }
  }

  function create() {
    const f = Object.fromEntries(Object.entries(form).map(([k, v]) => [k, k === 'initial' || k === 'own' ? v
      : v.trim()])) as typeof EMPTY;
    if (!CODE.test(f.code) || !f.name || f.name.length > 120 || !f.login || !f.first || !f.last || !f.initial
      || f.initial.length > 128 || !f.reason || !f.own || f.own.length > 128) {
      setMessage(t('taxiSvcNeeds'));
      return;
    }
    return run(async () => {
      const made = await client.post('/api/admin/v1/services' as never, {body: {command_id: newId(), code: f.code,
        name: f.name, super_admin: {login: f.login, initial_password: f.initial, first_name: f.first,
          last_name: f.last}, reason: f.reason, password: f.own}} as never) as Service;
      setServices(list => [...(list ?? []), made].sort((a, b) => a.code.localeCompare(b.code)));
      setForm(EMPTY);
      setMessage(t('taxiSvcCreated'));
    }, failure => failure.status === 403 ? t('ownPasswordWrong') : failure.status === 409 ? t('taxiSvcTaken') : null,
    () => setForm(old => ({...old})));
  }

  function change(s: Service) {
    const reason = (reasons[s.id] ?? '').trim();
    if (!reason) {
      setMessage(t('taxiSvcReasonNeeds'));
      return;
    }
    const action = s.state === 'ACTIVE' ? 'suspend' : 'resume';
    return run(async () => {
      const changed = await client.post(('/api/admin/v1/services/{service_id}/' + action) as never, {params: {
        service_id: s.id}, body: {command_id: newId(), expected_version: s.version, reason}} as never) as Service;
      setServices(list => (list ?? []).map(x => x.id === changed.id ? changed : x));
      setReasons(all => ({...all, [s.id]: ''}));
    }, failure => {
      if (failure.status !== 409) return null;
      void read().catch(again => setError(again));
      return t('taxiSvcConflict');
    });
  }

  const field = (key: keyof typeof EMPTY, label: string, secret = false) => (
    <label>{t(label)}<input type={secret ? 'password' : 'text'} autoComplete={secret ? 'new-password' : 'off'}
      value={form[key]} onChange={e => setForm(old => ({...old, [key]: e.target.value}))} /></label>
  );
  return (
    <section aria-labelledby="svc-title">
      <h1 id="svc-title">{t('navServices')}</h1>
      <ul>
        {(services ?? []).map(s => (
          <li key={s.id}>
            <span>{[s.code, s.name, t('taxiSvcState_' + s.state), t('taxiSvcSince', {day: day(s.created_at)})].join(' · ')}
            </span>
            {s.state === 'ACTIVE' ? <p>{t('taxiSvcSuspendWarning')}</p> : null}
            <label>{t('taxiSvcReason', {code: s.code})}<input value={reasons[s.id] ?? ''}
              onChange={e => setReasons(all => ({...all, [s.id]: e.target.value}))} /></label>
            <button type="button" onClick={() => void change(s)}>
              {t(s.state === 'ACTIVE' ? 'taxiSvcSuspend' : 'taxiSvcResume')}</button>
          </li>
        ))}
      </ul>
      <fieldset>
        <legend>{t('taxiSvcCreateTitle')}</legend>
        {field('code', 'taxiSvcCode')}
        {field('name', 'taxiSvcName')}
        {field('login', 'taxiSvcLogin')}
        {field('initial', 'taxiSvcInitial', true)}
        {field('first', 'taxiSvcFirst')}
        {field('last', 'taxiSvcLast')}
        {field('reason', 'taxiSvcCreateReason')}
        {field('own', 'taxiSvcOwn', true)}
        <button type="button" onClick={() => void create()}>{t('taxiSvcCreate')}</button>
      </fieldset>
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
