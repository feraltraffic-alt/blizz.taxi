import {useEffect, useState} from 'react';
import {Link, Route, Routes} from 'react-router-dom';
import {type AdminMe, type ApiClient} from '@blizz/api-client';
import {Failure, StaffGate, translator} from '@blizz/web-ui';
import {translations} from './i18n.js';
import {DriverCase, DriverQueue} from './Drivers.js';

const t = translator(translations, 'ru');

/** The sections, each shown to holders of its permission; staff management is the super admin's (by role). */
const SECTIONS: {path: string; label: string; permission?: string; role?: string}[] = [
  {path: '/geo', label: 'navGeo', permission: 'geo.manage'},
  {path: '/orders', label: 'navOrders', permission: 'orders.view'},
  {path: '/drivers', label: 'navDrivers', permission: 'driver.review'},
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

  if (error) return <Failure error={error} t={t} />;
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
        {sections.some(s => s.path === '/drivers') ? (
          <>
            <Route path="/drivers" element={<DriverQueue client={client} t={t} />} />
            <Route path="/drivers/:driverId" element={<DriverCase client={client} t={t}
              newId={() => crypto.randomUUID()} />} />
          </>
        ) : null}
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
  return <StaffGate client={client} t={t} audience="ADMIN"><Panel client={client} /></StaffGate>;
}
