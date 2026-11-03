import type {MapPoint} from './driverMapHtml';

/** The web build (end-to-end runs only) has no WebView: the line under the map tells where the driver is (#483). */
export function DriverMap(_props: {orderId: string; pickup: MapPoint; driver: MapPoint; label: string}) {
  return null;
}
