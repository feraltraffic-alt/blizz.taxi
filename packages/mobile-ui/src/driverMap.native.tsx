import {useEffect, useMemo, useRef} from 'react';
import {View} from 'react-native';
import {WebView} from 'react-native-webview';
import {driverMapHtml, moveDriverScript, type MapPoint} from './driverMapHtml';

/**
 * The driver on an OpenStreetMap map on the phone (#483, ADR 0017): the page is made once per order, and each newer
 * position moves the marker in it, so polling never reloads the map.
 */
export function DriverMap({orderId, pickup, driver, label}: {orderId: string; pickup: MapPoint; driver: MapPoint;
  label: string}) {
  const view = useRef<{injectJavaScript(js: string): void} | null>(null);
  const first = useRef(driver);
  const html = useMemo(() => driverMapHtml({pickup, driver: first.current.lat ? driver : driver}),
    [orderId, driver.lat, driver.lon]);
  useEffect(() => {
    view.current?.injectJavaScript(moveDriverScript(driver));
  }, [driver.lat, driver.lon]);
  return (
    <View style={{height: 240}} accessibilityLabel={label}>
      <WebView ref={view as never} originWhitelist={['*']} source={{html}} />
    </View>
  );
}
