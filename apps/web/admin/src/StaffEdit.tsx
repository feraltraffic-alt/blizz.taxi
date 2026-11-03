import {useCallback, useEffect, useRef, useState} from 'react';
import {Link, useParams} from 'react-router-dom';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

type Profile = {first_name: string; last_name: string; contacts: {phone?: string | null; email?: string | null;
  telegram?: string | null}; role: string; permissions?: string[]; all_cities?: boolean; city_ids?: string[]};
type Member = {id: string; login: string; profile: Profile; version: number};
type Permission = {code: string; description: string};
type Form = {first: string; last: string; phone: string; email: string; telegram: string; role: string;
  permissions: string[]; allCities: boolean; cityIds: string[]};

const TELEGRAM = /^@?[A-Za-z0-9_]{5,32}$/;
const ROLES = ['OPERATOR', 'ADMIN', 'SUPER_ADMIN'];
const ROLE_TEXT: Record<string, string> = {SUPER_ADMIN: 'roleSuperAdmin', ADMIN: 'roleAdmin', OPERATOR: 'roleOperator',
  PLATFORM_OWNER: 'rolePlatformOwner'};

const formOf = (p: Profile): Form => ({first: p.first_name, last: p.last_name, phone: p.contacts.phone ?? '',
  email: p.contacts.email ?? '', telegram: p.contacts.telegram ?? '', role: p.role,
  permissions: [...(p.permissions ?? [])], allCities: Boolean(p.all_cities), cityIds: [...(p.city_ids ?? [])]});

/** What only the own password may change (REQ-ADM-10): the role, the functions, the cities. */
const rights = (f: Form) => JSON.stringify([f.role, [...f.permissions].sort(), f.allCities,
  f.allCities ? [] : [...f.cityIds].sort()]);

/**
 * One staff member's profile for the super admin (#370): names and contacts, and the role, functions and cities,
 * which need the super admin's own password. The password never stays on the screen after a request.
 */
export function StaffEdit({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const {staffId = ''} = useParams();
  const [member, setMember] = useState<Member | null>(null);
  const [form, setForm] = useState<Form | null>(null);
  const [permissions, setPermissions] = useState<Permission[]>([]);
  const [cities, setCities] = useState<{id: string; name: string}[]>([]);
  const [reason, setReason] = useState('');
  const [own, setOwn] = useState('');
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const show = useCallback((value: Member) => {
    setMember(value);
    setForm(formOf(value.profile));
  }, []);

  const read = useCallback(async () => {
    show(await client.get('/api/admin/v1/staff/{staff_id}' as never, {params: {staff_id: staffId}} as never) as Member);
  }, [client, staffId, show]);

  useEffect(() => {
    read().catch(failure => setError(failure));
    client.get('/api/admin/v1/permissions' as never, {} as never)
      .then(list => setPermissions((list as {permissions: Permission[]}).permissions)).catch(() => undefined);
    client.get('/api/config/v1/bootstrap' as never, {} as never)
      .then(boot => setCities((boot as {cities: {id: string; name: string}[]}).cities)).catch(() => undefined);
  }, [client, read]);

  async function save() {
    if (!member || !form || acting.current) return;
    const contacts = {...(form.phone.trim() ? {phone: form.phone.trim()} : {}),
      ...(form.email.trim() ? {email: form.email.trim()} : {}),
      ...(form.telegram.trim() ? {telegram: form.telegram.trim()} : {})};
    const sensitive = rights(form) !== rights(formOf(member.profile));
    if (!form.first.trim() || !form.last.trim() || Object.keys(contacts).length === 0
      || (contacts.telegram && !TELEGRAM.test(contacts.telegram)) || !reason.trim() || (sensitive && !own)) {
      setMessage(t('editNeeds'));
      return;
    }
    const known = permissions.map(p => p.code);
    const ticked = [...known.filter(c => form.permissions.includes(c)),
      ...form.permissions.filter(c => !known.includes(c))];
    const cityIds = form.allCities ? [] : [...cities.map(c => c.id).filter(id => form.cityIds.includes(id)),
      ...form.cityIds.filter(id => !cities.some(c => c.id === id))];
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      const value = await client.post('/api/admin/v1/staff/{staff_id}/update' as never, {params: {staff_id: staffId},
        body: {command_id: newId(), expected_version: member.version, profile: {first_name: form.first.trim(),
          last_name: form.last.trim(), contacts, role: form.role, permissions: ticked, all_cities: form.allCities,
          city_ids: cityIds}, reason: reason.trim(), password: own}} as never) as Member;
      show(value);
      setReason('');
      setMessage(t('editSaved'));
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 403) setMessage(t('ownPasswordWrong'));
      else if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('memberChanged'));
        await read().catch(again => setError(again));
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  if (!form || !member) return error ? <Failure error={error} t={t} /> : <p>{t('loading')}</p>;
  const set = (key: 'first' | 'last' | 'phone' | 'email' | 'telegram' | 'role') =>
    (e: {target: {value: string}}) => setForm(f => f ? {...f, [key]: e.target.value} : f);
  const roles = ROLES.includes(form.role) ? ROLES : [...ROLES, form.role];
  return (
    <section aria-labelledby="edit-title">
      <h1 id="edit-title">{member.profile.last_name + ' ' + member.profile.first_name + ' · ' + member.login}</h1>
      <label>{t('firstName')}<input value={form.first} onChange={set('first')} /></label>
      <label>{t('lastName')}<input value={form.last} onChange={set('last')} /></label>
      <label>{t('phone')}<input value={form.phone} onChange={set('phone')} /></label>
      <label>{t('email')}<input value={form.email} onChange={set('email')} /></label>
      <label>{t('telegram')}<input value={form.telegram} onChange={set('telegram')} /></label>
      <label htmlFor="edit-role">{t('role')}</label>
      <select id="edit-role" value={form.role} onChange={set('role')}>
        {roles.map(r => <option key={r} value={r}>{t(ROLE_TEXT[r] ?? r)}</option>)}
      </select>
      {permissions.map(p => (
        <label key={p.code}>
          <input type="checkbox" checked={form.permissions.includes(p.code)} onChange={e => setForm(f => f ? {...f,
            permissions: e.target.checked ? [...f.permissions, p.code] : f.permissions.filter(x => x !== p.code)}
            : f)} />
          {p.code + ' — ' + p.description}
        </label>
      ))}
      <label><input type="checkbox" checked={form.allCities}
        onChange={e => setForm(f => f ? {...f, allCities: e.target.checked} : f)} />{t('allCities')}</label>
      {form.allCities ? null : cities.map(c => (
        <label key={c.id}>
          <input type="checkbox" checked={form.cityIds.includes(c.id)} onChange={e => setForm(f => f ? {...f,
            cityIds: e.target.checked ? [...f.cityIds, c.id] : f.cityIds.filter(x => x !== c.id)} : f)} />
          {c.name}
        </label>
      ))}
      <label>{t('reason')}<input value={reason} onChange={e => setReason(e.target.value)} /></label>
      <label>{t('ownPassword')}<input type="password" value={own} onChange={e => setOwn(e.target.value)} /></label>
      <button type="button" onClick={() => void save()}>{t('saveChanges')}</button>
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
      <p><Link to="/staff">{t('toStaff')}</Link></p>
    </section>
  );
}
