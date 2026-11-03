import {useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

type Attempt = {id: string; audience: string; channel: string; provider: string; state: string;
  provider_ref: string | null; error: string | null; attempted_at: string};

const at = (value: string) => {
  const when = new Date(value);
  return when.toLocaleDateString('ru-RU', {timeZone: 'UTC'}) + ' '
    + when.toLocaleTimeString('ru-RU', {timeZone: 'UTC'}) + ' UTC';
};

/**
 * How sign-in codes reached a phone, for holders of support.manage (#434, ADR 0012 Q-18): every attempt newest first,
 * its channel, provider and outcome, with the provider's error for one that failed or got no answer. Never the code.
 */
export function OtpDeliveries({client, t}: {client: ApiClient; t: Translate}) {
  const [phone, setPhone] = useState('');
  const [found, setFound] = useState<Attempt[] | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  async function search() {
    if (acting.current) return;
    const value = phone.trim();
    if (!value) {
      setMessage(t('otpNeeds'));
      return;
    }
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      setFound(((await client.get('/api/admin/v1/otp-deliveries' as never,
        {query: {phone: value, limit: 50}} as never)) as {deliveries: Attempt[]}).deliveries);
    } catch (failure) {
      setFound(null);
      if (failure instanceof ApiError && failure.status === 400) setMessage(t('otpBadPhone'));
      else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  const describe = (a: Attempt) => [at(a.attempted_at), t('otpAudience_' + a.audience), a.channel, a.provider,
    t('otpState_' + a.state), ...(a.provider_ref ? [t('otpRef', {ref: a.provider_ref})] : []),
    ...(a.state === 'FAILED' && a.error ? [t('otpError', {error: a.error})] : [])].join(' · ');
  return (
    <section aria-labelledby="otp-title">
      <h1 id="otp-title">{t('navOtpDeliveries')}</h1>
      <label>{t('otpPhone')}<input type="tel" value={phone} onChange={e => setPhone(e.target.value)} /></label>
      <button type="button" onClick={() => void search()}>{t('otpSearch')}</button>
      {found && found.length === 0 ? <p>{t('otpNone')}</p> : null}
      <ul>
        {(found ?? []).map(a => <li key={a.id}>{describe(a)}</li>)}
      </ul>
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
