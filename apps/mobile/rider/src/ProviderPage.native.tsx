import {Modal, View} from 'react-native';
import {WebView} from 'react-native-webview';
import {Button} from '@blizz/mobile-ui';

type Props = {url: string; fields: Record<string, string>; returnUrl: string | null; onDone: () => void;
  closeLabel?: string};

/**
 * The provider's page with 3-D Secure on the phone (#269): the form is POSTed in a WebView, which closes when it
 * reaches the return address (or the rider closes it); the app then reads the binding until it settles.
 */
export function ProviderPage({url, fields, returnUrl, onDone, closeLabel}: Props) {
  const body = Object.entries(fields).map(([k, v]) => encodeURIComponent(k) + '=' + encodeURIComponent(v)).join('&');
  return (
    <Modal visible animationType="slide" onRequestClose={onDone}>
      <View style={{flex: 1}}>
        <WebView source={{uri: url, method: 'POST', body,
          headers: {'Content-Type': 'application/x-www-form-urlencoded'}}}
          onNavigationStateChange={state => {
            if (returnUrl && state.url.startsWith(returnUrl)) onDone();
          }} />
        <Button label={closeLabel ?? '×'} onPress={onDone} />
      </View>
    </Modal>
  );
}
