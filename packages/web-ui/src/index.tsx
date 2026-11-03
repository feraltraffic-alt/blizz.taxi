import {useEffect, useState, type FormEvent, type ReactNode} from 'react';
import {ApiError, type ApiClient, type SessionSnapshot} from '@blizz/api-client';

export type Locale = 'ru' | 'uk' | 'pl';
export type Catalogs = Record<Locale, Record<string, string>>;
export type Translate = (key: string, values?: Record<string, string | number>) => string;

/** The keys the shared staff screens use; every panel's catalog has them (checked by validateCatalogs). */
export const AUTH_KEYS = ['signIn', 'signInTitle', 'login', 'password', 'wrongCredentials', 'lockedOut', 'suspended',
  'genericError', 'correlation', 'passwordChange', 'passwordChangeHint', 'currentPassword', 'newPassword',
  'savePassword', 'passwordTooShort', 'wrongCurrentPassword', 'signOut', 'loading'] as const;

/**
 * Every catalog has every key of the others and the shared screens' keys, with no empty text: a missing key fails
 * here, not on a page.
 */
export function validateCatalogs(catalogs: Catalogs, required: readonly string[] = AUTH_KEYS): void {
  const keys = new Set<string>(required);
  for (const catalog of Object.values(catalogs)) Object.keys(catalog).forEach(key => keys.add(key));
  const problems: string[] = [];
  for (const [locale, catalog] of Object.entries(catalogs)) {
    for (const key of keys) {
      if (!catalog[key]) problems.push(locale + ' misses ' + key);
    }
  }
  if (problems.length > 0) throw new Error('Translation catalogs differ: ' + problems.join('; '));
}

export function translator(catalogs: Catalogs, locale: Locale): Translate {
  return (key, values = {}) => {
    const text = catalogs[locale][key] ?? catalogs.ru[key] ?? key;
    return text.replace(/\{(\w+)\}/g, (_, name: string) => String(values[name] ?? '{' + name + '}'));
  };
}

/** A request that failed in a way the page cannot explain: a generic text with the request's correlation id. */
export function Failure({error, t}: {error: unknown; t: Translate}) {
  const id = error instanceof ApiError ? error.correlation_id : undefined;
  return (
    <p role="alert">
      {t('genericError')}
      {id ? <> {t('correlation', {id})}</> : null}
    </p>
  );
}

export function useSession(client: ApiClient): SessionSnapshot {
  const [snapshot, setSnapshot] = useState(() => client.sessionSnapshot());
  useEffect(() => client.subscribe(() => setSnapshot(client.sessionSnapshot())), [client]);
  return snapshot;
}

function SignIn({client, t, audience}: {client: ApiClient; t: Translate; audience: 'ADMIN' | 'OPERATOR'}) {
  const [login, setLogin] = useState('');
  const [password, setPassword] = useState('');
  const [message, setMessage] = useState<ReactNode>(null);
  const [busy, setBusy] = useState(false);

  async function submit(event: FormEvent) {
    event.preventDefault();
    setBusy(true);
    setMessage(null);
    try {
      await client.signIn({login, password, audience});
    } catch (error) {
      if (error instanceof ApiError && error.status === 401) {
        // The same words for an unknown login and a wrong password: the panel never tells which logins exist.
        setMessage(<p role="alert">{t('wrongCredentials')}</p>);
      } else if (error instanceof ApiError && error.status === 429) {
        setMessage(<p role="alert">{t('lockedOut', {seconds: error.retryAfterSeconds ?? 60})}</p>);
      } else if (error instanceof ApiError && error.status === 403) {
        setMessage(<p role="alert">{t('suspended')}</p>);
      } else {
        setMessage(<Failure error={error} t={t} />);
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

function PasswordChange({client, t}: {client: ApiClient; t: Translate}) {
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
        ? <p role="alert">{t('wrongCurrentPassword')}</p> : <Failure error={error} t={t} />);
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

/**
 * A staff panel's gate (#136, #245): the session restored from the tab, sign-in with the panel's audience, the
 * forced password change before anything else, then the panel.
 */
export function StaffGate({client, t, audience, children}: {client: ApiClient; t: Translate;
  audience: 'ADMIN' | 'OPERATOR'; children: ReactNode}) {
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
  else if (!session.authenticated) content = <SignIn client={client} t={t} audience={audience} />;
  else if (session.passwordChangeRequired) content = <PasswordChange client={client} t={t} />;
  else content = children;
  return <main>{content}</main>;
}

/** The refresh token in the tab's sessionStorage, never localStorage (#136); the access token stays in memory. */
export function browserRefreshTokens(storage: Storage, key: string) {
  return {
    read: () => {
      try {
        return storage.getItem(key);
      } catch {
        return null;
      }
    },
    write: (value: string | null) => {
      try {
        if (value) storage.setItem(key, value);
        else storage.removeItem(key);
      } catch {
        // A blocked storage: the session lasts as long as this page.
      }
    }
  };
}

export {Support} from './support.js';
