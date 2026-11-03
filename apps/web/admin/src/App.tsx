import {useEffect, useState} from 'react';
import {Link, Route, Routes} from 'react-router-dom';
import {type AdminMe, type ApiClient} from '@blizz/api-client';
import {Failure, StaffGate, translator} from '@blizz/web-ui';
import {translations} from './i18n.js';
import {DriverCase, DriverQueue} from './Drivers.js';
import {CityList, CityOperations} from './Geo.js';
import {Staff} from './Staff.js';
import {Wallets} from './Wallets.js';
import {StaffEdit} from './StaffEdit.js';
import {OrderTimeline, Orders} from './Orders.js';
import {EmergencyGive, EmergencyList, MyGrants} from './Emergency.js';
import {Logs} from './Logs.js';
import {SafetyContactsSettings} from './Safety.js';
import {Integrations} from './Integrations.js';
import {CancelReasons} from './CancelReasons.js';
import {CallLines} from './CallLines.js';
import {ServiceSettings} from './ServiceSettings.js';
import {Deletions} from './Deletions.js';
import {Legal} from './Legal.js';
import {Promotions} from './Promotions.js';
import {Finance} from './Finance.js';
import {OtpDeliveries} from './OtpDeliveries.js';
import {SupportCases} from './SupportCases.js';
import {OperatorBonuses} from './OperatorBonuses.js';
import {ClientCardPage, ClientSearch} from './Clients.js';
import {Reports} from './Reports.js';
import {Risk} from './Risk.js';
import {DriverPromotions} from './DriverPromotions.js';
import {Flags} from './Flags.js';

const t = translator(translations, 'ru');

/** The sections, each shown to holders of its permission; staff management is the super admin's (by role). */
const SECTIONS: {path: string; label: string; permission?: string | string[]; role?: string}[] = [
  {path: '/geo', label: 'navGeo', permission: 'geo.manage'},
  {path: '/orders', label: 'navOrders', permission: 'orders.view'},
  {path: '/clients', label: 'navClients', permission: 'clients.manage'},
  {path: '/support', label: 'support', permission: 'support.manage'},
  {path: '/otp-deliveries', label: 'navOtpDeliveries', permission: 'support.manage'},
  {path: '/drivers', label: 'navDrivers', permission: 'driver.review'},
  {path: '/risk', label: 'navRisk', permission: 'drivers.risk'},
  {path: '/staff', label: 'navStaff', role: 'SUPER_ADMIN'},
  {path: '/emergency', label: 'navEmergency', role: 'SUPER_ADMIN'},
  {path: '/reports', label: 'navReports', permission: 'reports.view'},
  {path: '/finance', label: 'navFinance', permission: 'finance.manage'},
  {path: '/operator-bonuses', label: 'navOperatorBonuses', permission: 'operator-bonuses.manage'},
  {path: '/wallets', label: 'navWallets', permission: 'wallets.manage'},
  {path: '/settings', label: 'navSettings', permission: 'settings.manage'},
  {path: '/promotions', label: 'navPromotions', permission: 'promotions.manage'},
  {path: '/driver-promotions', label: 'navDriverPromotions', permission: 'promotions.manage'},
  {path: '/flags', label: 'navFlags', permission: 'flags.manage'},
  {path: '/deletions', label: 'navDeletions', permission: ['clients.delete', 'drivers.delete']},
  {path: '/legal', label: 'navLegal', permission: 'legal.manage'},
  {path: '/integrations', label: 'navIntegrations', permission: 'integrations.manage'},
  {path: '/logs', label: 'navLogs', permission: 'audit.view'}
];

const ROLES: Record<string, string> = {
  SUPER_ADMIN: 'roleSuperAdmin', ADMIN: 'roleAdmin', OPERATOR: 'roleOperator', PLATFORM_OWNER: 'rolePlatformOwner'
};

function Profile({me, client}: {me: AdminMe; client: ApiClient}) {
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
      <MyGrants client={client} t={t} />
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
  const holds = (p: string | string[]) => [p].flat().some(one => permissions.has(one)) || role === 'SUPER_ADMIN';
  const sections = SECTIONS.filter(s => (s.permission && holds(s.permission)) || (s.role && s.role === role));
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
        <Route path="/" element={<Profile me={me} client={client} />} />
        {role === 'SUPER_ADMIN' ? <Route path="/staff" element={<Staff client={client} t={t}
          newId={() => crypto.randomUUID()} />} /> : null}
        {sections.some(s => s.path === '/wallets') ? <Route path="/wallets" element={<Wallets client={client} t={t}
          newId={() => crypto.randomUUID()} />} /> : null}
        {role === 'SUPER_ADMIN' ? <Route path="/staff/:staffId" element={<StaffEdit client={client} t={t}
          newId={() => crypto.randomUUID()} />} /> : null}
        {role === 'SUPER_ADMIN' ? <Route path="/staff/:staffId/emergency" element={<EmergencyGive client={client}
          t={t} newId={() => crypto.randomUUID()} meId={me.member.id} />} /> : null}
        {role === 'SUPER_ADMIN' ? <Route path="/emergency" element={<EmergencyList client={client} t={t}
          newId={() => crypto.randomUUID()} />} /> : null}
        {sections.some(s => s.path === '/geo') ? (
          <>
            <Route path="/geo" element={<CityList client={client} t={t} />} />
            <Route path="/geo/:cityId" element={<CityOperations client={client} t={t}
              newId={() => crypto.randomUUID()} />} />
          </>
        ) : null}
        {sections.some(s => s.path === '/settings') ? <Route path="/settings" element={<SafetyContactsSettings
          client={client} t={t} newId={() => crypto.randomUUID()} />} /> : null}
        {sections.some(s => s.path === '/settings') ? <Route path="/settings/cancel-reasons" element={<CancelReasons
          client={client} t={t} newId={() => crypto.randomUUID()} />} /> : null}
        {sections.some(s => s.path === '/deletions') ? <Route path="/deletions" element={<Deletions client={client}
          t={t} newId={() => crypto.randomUUID()} clients={holds('clients.delete')} drivers={holds('drivers.delete')} />}
        /> : null}
        {sections.some(s => s.path === '/legal') ? <Route path="/legal" element={<Legal client={client} t={t}
          newId={() => crypto.randomUUID()} />} /> : null}
        {sections.some(s => s.path === '/integrations') ? <Route path="/integrations" element={<Integrations
          client={client} t={t} newId={() => crypto.randomUUID()} />} /> : null}
        {sections.some(s => s.path === '/flags') ? <Route path="/flags" element={<Flags client={client} t={t}
          newId={() => crypto.randomUUID()} />} /> : null}
        {sections.some(s => s.path === '/promotions') ? <Route path="/promotions" element={<Promotions client={client}
          t={t} newId={() => crypto.randomUUID()} />} /> : null}
        {sections.some(s => s.path === '/driver-promotions') ? <Route path="/driver-promotions" element={
          <DriverPromotions client={client} t={t} newId={() => crypto.randomUUID()} />} /> : null}
        {sections.some(s => s.path === '/risk') ? <Route path="/risk" element={<Risk client={client} t={t}
          newId={() => crypto.randomUUID()} />} /> : null}
        {sections.some(s => s.path === '/settings') ? <Route path="/settings/call-lines" element={<CallLines
          client={client} t={t} newId={() => crypto.randomUUID()} />} /> : null}
        {sections.some(s => s.path === '/reports') ? <Route path="/reports" element={<Reports client={client} t={t}
          newId={() => crypto.randomUUID()} />} /> : null}
        {sections.some(s => s.path === '/settings') ? <Route path="/settings/service" element={<ServiceSettings
          client={client} t={t} newId={() => crypto.randomUUID()} />} /> : null}
        {sections.some(s => s.path === '/clients') ? (
          <>
            <Route path="/clients" element={<ClientSearch client={client} t={t} />} />
            <Route path="/clients/:clientId" element={<ClientCardPage client={client} t={t}
              newId={() => crypto.randomUUID()} />} />
          </>
        ) : null}
        {sections.some(s => s.path === '/finance') ? <Route path="/finance" element={<Finance client={client} t={t}
          newId={() => crypto.randomUUID()} />} /> : null}
        {sections.some(s => s.path === '/operator-bonuses') ? <Route path="/operator-bonuses" element={
          <OperatorBonuses client={client} t={t} newId={() => crypto.randomUUID()} />} /> : null}
        {sections.some(s => s.path === '/otp-deliveries') ? <Route path="/otp-deliveries" element={<OtpDeliveries
          client={client} t={t} />} /> : null}
        {sections.some(s => s.path === '/support') ? <Route path="/support" element={<SupportCases client={client}
          t={t} me={me.member.id} newId={() => crypto.randomUUID()} />} /> : null}
        {sections.some(s => s.path === '/logs') ? <Route path="/logs" element={<Logs client={client} t={t} />} />
          : null}
        {sections.some(s => s.path === '/orders') ? (
          <>
            <Route path="/orders" element={<Orders client={client} t={t} />} />
            <Route path="/orders/:orderId" element={<OrderTimeline client={client} t={t}
              newId={() => crypto.randomUUID()} canCorrect={holds('fares.correct')}
              canRetry={holds('payments.retry')} />} />
          </>
        ) : null}
        {sections.some(s => s.path === '/drivers') ? (
          <>
            <Route path="/drivers" element={<DriverQueue client={client} t={t} />} />
            <Route path="/drivers/:driverId" element={<DriverCase client={client} t={t}
              finance={permissions.has('finance.manage') || role === 'SUPER_ADMIN'}
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
