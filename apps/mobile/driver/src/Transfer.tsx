import {useEffect, useRef, useState} from 'react';
import {Text, View} from 'react-native';
import {ApiError} from '@blizz/api-client';
import {Alert, Button, Field, useTheme, type Shared} from '@blizz/mobile-ui';

type Rule = {currency: string; enabled: boolean; max_per_transfer_minor: number; max_per_day_minor: number;
  min_balance_after_minor: number};
type Draft = {phone: string; minor: number; comment: string};

const E164 = /^\+[1-9][0-9]{7,14}$/;
const money = (minor: number, currency: string) => (minor / 100).toFixed(2) + ' ' + currency;

/** An amount with at most two decimals, in minor units; null otherwise. */
function minorOf(text: string): number | null {
  const value = text.trim().replace(',', '.');
  if (!/^\d+(\.\d{1,2})?$/.test(value)) return null;
  const minor = Math.round(Number(value) * 100);
  return minor > 0 ? minor : null;
}

/**
 * Sending part of the balance to another driver (#343, ADR 0010): the rules of the currency, the form checked on the
 * phone, and a confirmation step before anything is sent, since money leaves the account.
 */
export function Transfer({client, t, guard, failure, newId, currency, onSent}: Shared & {newId: () => string;
  currency: string; onSent: () => void}) {
  const [rule, setRule] = useState<Rule | null>(null);
  const [phone, setPhone] = useState('');
  const [sum, setSum] = useState('');
  const [comment, setComment] = useState('');
  const [draft, setDraft] = useState<Draft | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const sending = useRef(false);
  const command = useRef(newId());
  const draftNow = useRef<Draft | null>(null);
  const theme = useTheme();

  useEffect(() => {
    let current = true;
    client.get('/api/driver/v1/transfer-rules' as never, {} as never)
      .then(value => {
        const rules = (value as {rules: Rule[]}).rules;
        if (current) setRule(rules.find(r => r.currency === currency) ?? null);
      })
      .catch(() => undefined);
    return () => {current = false;};
  }, [client, currency]);

  function review() {
    if (!rule) return;
    const minor = minorOf(sum);
    if (!E164.test(phone.trim()) || minor === null || minor > rule.max_per_transfer_minor || comment.length > 200) {
      setMessage(t('transferCheck', {max: money(rule.max_per_transfer_minor, rule.currency)}));
      return;
    }
    setMessage(null);
    command.current = newId();
    setDraft({phone: phone.trim(), minor, comment: comment.trim()});
    draftNow.current = {phone: phone.trim(), minor, comment: comment.trim()};
    void send();
  }

  async function send() {
    const d = draftNow.current ?? draft;
    if (!d || !rule || sending.current) return;
    sending.current = true;
    setMessage(null);
    try {
      await guard(() => client.post('/api/driver/v1/transfers' as never, {body: {command_id: command.current,
        to_phone: d.phone, currency: rule.currency, amount_minor: d.minor,
        ...(d.comment ? {comment: d.comment} : {})}} as never));
      setMessage(t('transferSent', {amount: money(d.minor, rule.currency)}));
      setDraft(null);
      setSum('');
      setComment('');
      onSent();
    } catch (error) {
      if (!(error instanceof ApiError)) setMessage(failure(error));
      else if (error.status === 404) setMessage(t('transferNoDriver'));
      else if (error.status === 422) setMessage(t('transferInsufficient', {min: money(rule.min_balance_after_minor,
        rule.currency)}));
      else if (error.status === 400) setMessage(t('transferLimit'));
      else if (error.status === 409) setMessage(t('transferOff'));
      else setMessage(failure(error));
      setDraft(null);
    } finally {
      sending.current = false;
    }
  }

  if (!rule) return null;
  if (!rule.enabled) return <Text style={{color: theme.muted}}>{t('transfersDisabled')}</Text>;
  return (
    <View style={{gap: 4}}>
      <Text style={{color: theme.text}}>{t('transferRules', {once: money(rule.max_per_transfer_minor, rule.currency),
        day: money(rule.max_per_day_minor, rule.currency)})}</Text>
      {draft ? (
        <>
          <Text style={{color: theme.text}}>{t('transferConfirmText', {amount: money(draft.minor, rule.currency),
            phone: draft.phone})}</Text>
          <Button label={t('transferConfirm')} onPress={() => void send()} />
          <Button label={t('transferCancel')} onPress={() => setDraft(null)} />
        </>
      ) : (
        <>
          <Field label={t('transferPhone')} value={phone} onChange={setPhone} keyboard="phone-pad" />
          <Field label={t('transferSum')} value={sum} onChange={setSum} keyboard="decimal-pad" />
          <Field label={t('transferComment')} value={comment} onChange={setComment} />
          <Button label={t('transferDo')} onPress={review} />
        </>
      )}
      <Alert text={message} />
    </View>
  );
}
