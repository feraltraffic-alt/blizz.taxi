import {useEffect, useState, type FormEvent, type ReactNode} from 'react';
import {Link, Route, Routes} from 'react-router-dom';
import {ApiError, type AdminMe, type ApiClient, type SessionSnapshot} from '@blizz/api-client';
import {translate, type Locale} from './i18n.js';

const LOCALE: Locale = 'ru';
const t = (key: string, values?: Record<string, string | number>) => translate(LOCALE, key, values);

/** A request that failed in a way the page cannot explain: a generic text with the request's correlation id. */
function Failure({error}: {error: unknown}) {
  const id = error instanceof ApiError ? error.correlation_id : undefined;
  return (
    <p role="alert">
      {t('genericError')}
      {id ? <> {t('correlation', {id})}</> : null}
    </p>
  );
}

function useSession(client: ApiClient): SessionSnapshot {
  const [snapshot, setSnapshot] = useState(() => client.sessionSnapshot());
  useEffect(() => client.subscribe(() => setSnapshot(client.sessionSnapshot())), [client]);
  return snapshot;
}

function SignIn({client}: {client: ApiClient}) {
  const [login, setLogin] = useState('');
  const [password, setPassword] = useState('');
  const [message, setMessage] = useState<ReactNode>(null);
  const [busy, setBusy] = useState(false);

  async function submit(event: FormEvent) {
    event.preventDefault();
    setBusy(true);
    setMessage(null);
    try {
      await client.signIn({login, password, audience: 'ADMIN'});
    } catch (error) {
      if (error instanceof ApiError && error.status === 401) {
        // The same words for an unknown login and a wrong password: the panel never tells which logins exist.
        setMessage(<p role="alert">{t('wrongCredentials')}</p>);
      } else if (error instanceof ApiError && error.status === 429) {
        setMessage(<p role="alert">{t('lockedOut', {seconds: error.retryAfterSeconds ?? 60})}</p>);
      } else if (error instanceof ApiError && error.status === 403) {
        setMessage(<p role="alert">{t('suspended')}</p>);
      } else {
        setMessage(<Failure error={error} />);
      }
    } finally {
      setBusy(false);
    }
  }

  return (
    <form onSubmit={submit} aria-labelledby="sign-in-title">
      <h1 id="sign-in-title">{t('signInTitle')}</h1>
      <label>
        {t('login')}
        <input value={login} onChange={e => setLogin(e.target.value)} autoComplete="username" required />
      </label>
      <label>
        {t('password')}
        <input type="password" value={password} onChange={e => setPassword(e.target.value)}
          autoComplete="current-password" required />
      </label>
      <button type="submit" disabled={busy}>{t('signIn')}</button>
      {message}
    </form>
  );
}

function PasswordChange({client}: {client: ApiClient}) {
  const [current, setCurrent] = useState('');
  const [next, setNext] = useState('');
  const [message, setMessage] = useState<ReactNode>(null);

  async function submit(event: FormEvent) {
    event.preventDefault();
    if (next.length < 12) {
      setMessage(<p role="alert">{t('passwordTooShort')}</p>);
      return;
    }
    setMessage(null);
    try {
      await client.changePassword({current_password: current, new_password: next});
    } catch (error) {
      setMessage(error instanceof ApiError && error.status === 401
        ? <p role="alert">{t('wrongCurrentPassword')}</p> : <Failure error={error} />);
    }
  }

  return (
    <form onSubmit={submit} aria-labelledby="password-title">
      <h1 id="password-title">{t('passwordChange')}</h1>
      <p>{t('passwordChangeHint')}</p>
      <label>
        {t('currentPassword')}
        <input type="password" value={current} onChange={e => setCurrent(e.target.value)}
          autoComplete="current-password" required />
      </label>
      <label>
        {t('newPassword')}
        <input type="password" value={next} onChange={e => setNext(e.target.value)} autoComplete="new-password"
          required />
      </label>
      <button type="submit">{t('savePassword')}</button>
      {message}
    </form>
  );
}

/** The sections, each shown to holders of its permission; staff management is the super admin's (by role). */
const SECTIONS: {path: string; label: string; permission?: string; role?: string}[] = [
  {path: '/geo', label: 'navGeo', permission: 'geo.manage'},
  {path: '/orders', label: 'navOrders', permission: 'orders.view'},
  {path: '/staff', label: 'navStaff', role: 'SUPER_ADMIN'},
  {path: '/reports', label: 'navReports', permission: 'reports.view'},
  {path: '/finance', label: 'navFinance', permission: 'finance.manage'},
  {path: '/settings', label: 'navSettings', permission: 'settings.manage'},
  {path: '/logs', label: 'navLogs', permission: 'audit.view'}
];

const ROLES: Record<string, string> = {
  SUPER_ADMIN: 'roleSuperAdmin', ADMIN: 'roleAdmin', OPERATOR: 'roleOperator', PLATFORM_OWNER: 'rolePlatformOwner'
};

function Profile({me}: {me: AdminMe}) {
  const profile = me.member.profile;
  return (
    <section aria-labelledby="profile-title">
      <h1 id="profile-title">{t('profile')}</h1>
      <p>{me.member.login}</p>
      <dl>
        <dt>{t('role')}</dt>
        <dd>{t(ROLES[profile.role] ?? profile.role)}</dd>
        <dt>{t('cities')}</dt>
        <dd>{profile.all_cities ? t('allCities') : t('cityCount', {count: profile.city_ids?.length ?? 0})}</dd>
        <dt>{t('permissions')}</dt>
        <dd>
          <ul>{me.effective_permissions.map(permission => <li key={permission}>{permission}</li>)}</ul>
        </dd>
      </dl>
    </section>
  );
}

function Panel({client}: {client: ApiClient}) {
  const [me, setMe] = useState<AdminMe | null>(null);
  const [error, setError] = useState<unknown>(null);

  useEffect(() => {
    let current = true;
    client.get('/api/admin/v1/me')
      .then(value => {if (current) setMe(value as AdminMe);})
      .catch(failure => {if (current) setError(failure);});
    return () => {current = false;};
  }, [client]);

  if (error) return <Failure error={error} />;
  if (!me) return <p>{t('loading')}</p>;
  const role = me.member.profile.role;
  const permissions = new Set(me.effective_permissions);
  const sections = SECTIONS.filter(s => (s.permission && (permissions.has(s.permission) || role === 'SUPER_ADMIN'))
    || (s.role && s.role === role));
  const profile = me.member.profile;
  return (
    <>
      <header>
        <p>{[profile.first_name, profile.last_name].filter(Boolean).join(' ')}</p>
      </header>
      <nav>
        <ul>
          <li><Link to="/">{t('profile')}</Link></li>
          {sections.map(s => <li key={s.path}><Link to={s.path}>{t(s.label)}</Link></li>)}
        </ul>
        <button type="button" onClick={() => void client.logout()}>{t('signOut')}</button>
      </nav>
      <Routes>
        <Route path="/" element={<Profile me={me} />} />
        <Route path="*" element={<p>{t('notReady')}</p>} />
      </Routes>
    </>
  );
}

/**
 * The admin panel (#136): staff sign-in, the forced password change before anything else, then the panel with the
 * staff member's profile and the sections their permissions open.
 */
export function AdminApp({client}: {client: ApiClient}) {
  const session = useSession(client);
  const [restored, setRestored] = useState(session.authenticated);

  useEffect(() => {
    if (restored) return;
    let current = true;
    client.restoreSession().catch(() => undefined).finally(() => {if (current) setRestored(true);});
    return () => {current = false;};
  }, [client, restored]);

  let content: ReactNode;
  if (!restored && !session.authenticated) content = <p>{t('loading')}</p>;
  else if (!session.authenticated) content = <SignIn client={client} />;
  else if (session.passwordChangeRequired) content = <PasswordChange client={client} />;
  else content = <Panel client={client} />;
  return <main>{content}</main>;
}
