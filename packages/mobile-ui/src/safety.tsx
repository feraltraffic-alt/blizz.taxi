import {useEffect, useState} from 'react';
import {Linking, Text, View} from 'react-native';
import {Alert, Button, useTheme} from './ui';
import type {Shared} from './session';

type Contacts = {emergency_number: string; support_phone: string | null; extra: {label: string; phone: string}[]};

/**
 * The safety button's contacts (#338, REQ-RID-09): the city's emergency number, the service's support phone and the
 * extra contacts, each dialled only when pressed. The service never calls emergency services itself, which the
 * fixed text says; when the contacts cannot be read, 112 is still offered.
 */
export function SafetyContacts({client, t, guard, failure, api}: Shared & {
  api: '/api/rider/v1' | '/api/driver/v1'}) {
  const [contacts, setContacts] = useState<Contacts | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const theme = useTheme();

  useEffect(() => {
    let current = true;
    guard(() => client.get((api + '/safety-contacts') as never, {} as never))
      .then(value => {if (current) setContacts(value as Contacts);})
      .catch(error => {if (current) setMessage(failure(error));});
    return () => {current = false;};
  }, [client, guard, api]); // the failure text follows the same texts

  // A failed read must not leave the rider without the emergency number (F4).
  const shown: Contacts = contacts ?? {emergency_number: '', support_phone: null, extra: []};
  const lines = [...(shown.emergency_number ? [{label: t('safetyEmergency'), phone: shown.emergency_number}] : []),
    ...(shown.support_phone ? [{label: t('safetySupport'), phone: shown.support_phone}] : []), ...shown.extra];

  return (
    <View style={{gap: 6}}>
      <Text style={{color: theme.error, fontWeight: '600'}}>{t('safetyDisclaimer')}</Text>
      {lines.map(line => (
        <View key={line.label + line.phone} style={{gap: 4}}>
          <Text style={{color: theme.text}}>{line.label + ': ' + line.phone}</Text>
          <Button label={t('safetyCall', {label: line.label})}
            onPress={() => void Linking.openURL('tel:' + line.phone).catch(() => undefined)} />
        </View>
      ))}
      <Alert text={message} />
    </View>
  );
}

/** "Безопасность" that opens the contacts in place. */
export function SafetyButton(props: Shared & {api: '/api/rider/v1' | '/api/driver/v1'}) {
  const [open, setOpen] = useState(false);
  return (
    <View style={{gap: 6}}>
      <Button label={open ? props.t('safetyHide') : props.t('safety')} onPress={() => setOpen(o => !o)} />
      {open ? <SafetyContacts {...props} /> : null}
    </View>
  );
}
