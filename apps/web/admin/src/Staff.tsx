import {useCallback, useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

type Member = {id: string; login: string; state: string; version: number; profile: {first_name: string;
  last_name: string; role: string}};
type Permission = {code: string; group: string; description: string};

const LOGIN = /^[A-Za-z0-9._-]{3,64}$/;
const ROLE_TEXT: Record<string, string> = {SUPER_ADMIN: 'roleSuperAdmin', ADMIN: 'roleAdmin', OPERATOR: 'roleOperator',
  PLATFORM_OWNER: 'rolePlatformOwner'};

/**
 * Staff for the super admin (#355, REQ-ADM-10): the list, adding a member with the profile, functions and cities
 * (confirmed with the super admin's own password, which is never kept on the screen after a request), and suspend
 * or restore with a reason and the member's version.
 */
export function Staff({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const [staff, setStaff] = useState<Member[] | null>(null);
  const [permissions, setPermissions] = useState<Permission[]>([]);
  const [cities, setCities] = useState<{id: string; name: string}[]>([]);
  const [form, setForm] = useState({first: '', last: '', phone: '', email: '', telegram: '', login: '', initial: '',
    role: 'OPERATOR', reason: '', own: ''});
  const [picked, setPicked] = useState<string[]>([]);
  const [allCities, setAllCities] = useState(false);
  const [cityIds, setCityIds] = useState<string[]>([]);
  const [reasons, setReasons] = useState<Record<string, string>>({});
  /** Per member: a temporary password, the super admin's own password for it, a new internal number (#357). */
  const [temps, setTemps] = useState<Record<string, string>>({});
  const [owns, setOwns] = useState<Record<string, string>>({});
  const [numbers, setNumbers] = useState<Record<string, string>>({});
  const [extensions, setExtensions] = useState<Record<string, {extension: string; version: number}>>({});
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const read = useCallback(async () => {
    setStaff(((await client.get('/api/admin/v1/staff' as never, {} as never)) as {staff: Member[]}).staff);
  }, [client]);

  useEffect(() => {
    read().catch(failure => setError(failure));
    client.get('/api/admin/v1/permissions' as never, {} as never)
      .then(list => setPermissions((list as {permissions: Permission[]}).permissions)).catch(() => undefined);
    client.get('/api/config/v1/bootstrap' as never, {} as never)
      .then(boot => setCities((boot as {cities: {id: string; name: string}[]}).cities)).catch(() => undefined);
    client.get('/api/admin/v1/staff-extensions' as never, {} as never)
      .then(list => setExtensions(Object.fromEntries((list as {extensions: {staff_id: string; extension: string;
        version: number}[]}).extensions.map(e => [e.staff_id, {extension: e.extension, version: e.version}]))))
      .catch(() => undefined);
  }, [client, read]);

  const set = (key: keyof typeof form) => (e: {target: {value: string}}) =>
    setForm(f => ({...f, [key]: e.target.value}));

  async function add() {
    if (acting.current) return;
    const contacts = {...(form.phone.trim() ? {phone: form.phone.trim()} : {}),
      ...(form.email.trim() ? {email: form.email.trim()} : {}), ...(form.telegram.trim() ? {telegram: form.telegram.trim()} : {})};
    if (!form.first.trim() || !form.last.trim() || Object.keys(contacts).length === 0 || !LOGIN.test(form.login.trim())
      || form.initial.length < 12 || !form.reason.trim() || !form.own) {
      setMessage(t('staffNeeds'));
      return;
    }
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      const member = await client.post('/api/admin/v1/staff' as never, {body: {command_id: newId(),
        login: form.login.trim(), initial_password: form.initial, profile: {first_name: form.first.trim(),
          last_name: form.last.trim(), contacts, role: form.role, permissions: picked, all_cities: allCities,
          city_ids: allCities ? [] : cityIds}, reason: form.reason.trim(), password: form.own}} as never) as Member;
      setStaff(list => [...(list ?? []), member]);
      setForm({first: '', last: '', phone: '', email: '', telegram: '', login: '', initial: '', role: 'OPERATOR',
        reason: '', own: ''});
      setPicked([]);
      setCityIds([]);
      setMessage(t('staffAdded'));
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) setMessage(t('loginTaken'));
      else if (failure instanceof ApiError && failure.status === 403) setMessage(t('ownPasswordWrong'));
      else setError(failure);
    } finally {
      // The super admin's own password never stays on the screen after a request (REQ-ADM-10).
      setForm(f => ({...f, own: ''}));
      acting.current = false;
    }
  }

  async function change(m: Member, action: 'suspend' | 'restore') {
    if (acting.current) return;
    const why = (reasons[m.id] ?? '').trim();
    if (!why) {
      setMessage(t('reasonRequired'));
      return;
    }
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      const updated = await client.post(('/api/admin/v1/staff/{staff_id}/' + action) as never, {params: {
        staff_id: m.id}, body: {command_id: newId(), expected_version: m.version, reason: why}} as never) as Member;
      setStaff(list => (list ?? []).map(x => x.id === updated.id ? updated : x));
      setReasons(r => ({...r, [m.id]: ''}));
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('staffChanged'));
        await read().catch(() => undefined);
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  async function reset(m: Member) {
    if (acting.current) return;
    const why = (reasons[m.id] ?? '').trim();
    const temp = temps[m.id] ?? '';
    const own = owns[m.id] ?? '';
    if (temp.length < 12 || !why || !own) {
      setMessage(t('resetNeeds'));
      return;
    }
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      const updated = await client.post('/api/admin/v1/staff/{staff_id}/reset-password' as never, {params: {
        staff_id: m.id}, body: {command_id: newId(), expected_version: m.version, temporary_password: temp,
        reason: why, password: own}} as never) as Member;
      setStaff(list => (list ?? []).map(x => x.id === updated.id ? updated : x));
      setTemps(v => ({...v, [m.id]: ''}));
      setMessage(t('resetDone'));
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 403) setMessage(t('ownPasswordWrong'));
      else if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('staffChanged'));
        await read().catch(() => undefined);
      } else setError(failure);
    } finally {
      // The own password never stays on the screen after a request (REQ-ADM-10).
      setOwns(v => ({...v, [m.id]: ''}));
      acting.current = false;
    }
  }

  async function number(m: Member, remove: boolean) {
    if (acting.current) return;
    const why = (reasons[m.id] ?? '').trim();
    const value = (numbers[m.id] ?? '').trim();
    if (!why || (!remove && !/^[0-9]{2,6}$/.test(value))) {
      setMessage(t('extensionNeeds'));
      return;
    }
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      const saved = await client.post('/api/admin/v1/staff-extensions/{staff_id}' as never, {params: {staff_id: m.id},
        body: {command_id: newId(), expected_version: extensions[m.id]?.version ?? 0,
          extension: remove ? null : value, reason: why}} as never) as {extension: string; version: number};
      setExtensions(all => {
        const next = {...all};
        if (remove) delete next[m.id];
        else next[m.id] = {extension: saved.extension, version: saved.version};
        return next;
      });
      setNumbers(v => ({...v, [m.id]: ''}));
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) setMessage(t('extensionTaken'));
      else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  const name = (m: Member) => m.profile.last_name + ' ' + m.profile.first_name;
  return (
    <section aria-labelledby="staff-title">
      <h1 id="staff-title">{t('navStaff')}</h1>
      <ul>
        {(staff ?? []).map(m => (
          <li key={m.id}>
            <span>{[name(m), m.login, t(ROLE_TEXT[m.profile.role] ?? m.profile.role), t('staff_' + m.state)]
              .join(' · ')}</span>
            <label>{t('reasonFor', {name: name(m)})}
              <input value={reasons[m.id] ?? ''} onChange={e => setReasons(r => ({...r, [m.id]: e.target.value}))} />
            </label>
            {m.state === 'SUSPENDED'
              ? <button type="button" onClick={() => void change(m, 'restore')}>{t('restoreOf', {name: name(m)})}</button>
              : <button type="button" onClick={() => void change(m, 'suspend')}>{t('suspendOf', {name: name(m)})}</button>}
            <span>{extensions[m.id] ? t('extShort', {number: extensions[m.id]!.extension}) : t('noExtension')}</span>
            <label>{t('extensionFor', {name: name(m)})}
              <input value={numbers[m.id] ?? ''} onChange={e => setNumbers(v => ({...v, [m.id]: e.target.value}))} />
            </label>
            <button type="button" onClick={() => void number(m, false)}>{t('saveExtension', {name: name(m)})}</button>
            {extensions[m.id] ? <button type="button" onClick={() => void number(m, true)}>
              {t('removeExtension', {name: name(m)})}</button> : null}
            <label>{t('tempPasswordFor', {name: name(m)})}
              <input type="password" value={temps[m.id] ?? ''}
                onChange={e => setTemps(v => ({...v, [m.id]: e.target.value}))} />
            </label>
            <label>{t('ownPasswordFor', {name: name(m)})}
              <input type="password" value={owns[m.id] ?? ''}
                onChange={e => setOwns(v => ({...v, [m.id]: e.target.value}))} />
            </label>
            <button type="button" onClick={() => void reset(m)}>{t('resetOf', {name: name(m)})}</button>
          </li>
        ))}
      </ul>
      <fieldset>
        <legend>{t('addStaff')}</legend>
        <label>{t('firstName')}<input value={form.first} onChange={set('first')} /></label>
        <label>{t('lastName')}<input value={form.last} onChange={set('last')} /></label>
        <label>{t('phone')}<input value={form.phone} onChange={set('phone')} /></label>
        <label>{t('email')}<input value={form.email} onChange={set('email')} /></label>
        <label>{t('telegram')}<input value={form.telegram} onChange={set('telegram')} /></label>
        <label>{t('newLogin')}<input value={form.login} onChange={set('login')} /></label>
        <label>{t('initialPassword')}<input type="password" value={form.initial} onChange={set('initial')} /></label>
        <label>{t('newRole')}
          <select value={form.role} onChange={set('role')}>
            <option value="OPERATOR">{t('roleOperator')}</option>
            <option value="ADMIN">{t('roleAdmin')}</option>
          </select>
        </label>
        {permissions.map(p => (
          <label key={p.code}>
            <input type="checkbox" checked={picked.includes(p.code)} onChange={e => setPicked(list =>
              e.target.checked ? [...list, p.code] : list.filter(x => x !== p.code))} />
            {p.code + ' — ' + p.description}
          </label>
        ))}
        <label><input type="checkbox" checked={allCities} onChange={e => setAllCities(e.target.checked)} />
          {t('allCities')}</label>
        {allCities ? null : cities.map(c => (
          <label key={c.id}>
            <input type="checkbox" checked={cityIds.includes(c.id)} onChange={e => setCityIds(list =>
              e.target.checked ? [...list, c.id] : list.filter(x => x !== c.id))} />
            {c.name}
          </label>
        ))}
        <label>{t('reason')}<input value={form.reason} onChange={set('reason')} /></label>
        <label>{t('ownPassword')}<input type="password" value={form.own} onChange={set('own')} /></label>
        <button type="button" onClick={() => void add()}>{t('addStaffButton')}</button>
      </fieldset>
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
