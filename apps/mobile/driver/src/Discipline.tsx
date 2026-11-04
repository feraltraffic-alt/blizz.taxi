import {useEffect, useState} from 'react';
import {Text, View} from 'react-native';
import {useTheme, type Shared} from '@blizz/mobile-ui';

type Counts = {
  cancellations: {enabled: boolean; last24h: number; pause_after: number; until_pause: number; accepted30d: number;
    cancelled30d: number; rate30d_percent: number | null};
  acceptance: {enabled: boolean; offers7d: number; accepted7d: number; percent7d: number | null; min_offers: number;
    warn_percent: number; pause_percent: number};
  pause: {kind: string; level: number; ends_at: string} | null;
};

const clock = (iso: string) => {
  const at = new Date(iso);
  return String(at.getHours()).padStart(2, '0') + ':' + String(at.getMinutes()).padStart(2, '0');
};

/**
 * The driver's own counts (ADR 0018 B10, B12.2): a pause and when it ends, cancellations after accepting in 24 hours
 * and how many until a pause, the 30-day rate and the 7-day acceptance rate. Read again when {@code refresh} changes
 * (the shift's version: after a pause, a resume, a cancellation); a failure leaves the rest of the screen.
 */
export function Discipline({client, t, refresh}: Shared & {refresh: unknown}) {
  const [counts, setCounts] = useState<Counts | null>(null);
  const theme = useTheme();

  useEffect(() => {
    let current = true;
    client.get('/api/driver/v1/discipline' as never, {} as never)
      .then(value => { if (current) setCounts(value as Counts); })
      .catch(() => undefined);
    return () => {
      current = false;
    };
  }, [client, refresh]);

  if (!counts) return null;
  const c = counts.cancellations;
  const a = counts.acceptance;
  return (
    <View accessibilityLabel={t('dscTitle')}>
      {counts.pause ? (
        <Text style={{color: theme.error}}>{t(counts.pause.kind === 'ACCEPTANCE' ? 'dscPausedAcceptance'
          : 'dscPausedCancellations', {until: clock(counts.pause.ends_at)})}</Text>
      ) : null}
      {c.enabled ? (
        <Text style={{color: c.until_pause <= 1 ? theme.error : theme.muted}}>
          {t('dscToday', {n: c.last24h}) + (counts.pause ? '' : ' ' + (c.until_pause <= 1 ? t('dscNextPauses')
            : t('dscUntilPause', {n: c.until_pause})))}
        </Text>
      ) : null}
      {c.enabled && c.rate30d_percent !== null ? (
        <Text style={{color: theme.muted}}>{t('dscRate', {percent: c.rate30d_percent, cancelled: c.cancelled30d,
          accepted: c.accepted30d})}</Text>
      ) : null}
      {a.enabled ? (
        <Text style={{color: a.percent7d !== null && a.percent7d < a.warn_percent ? theme.error : theme.muted}}>
          {a.percent7d === null ? t('dscAcceptanceFew', {n: a.offers7d, min: a.min_offers})
            : t('dscAcceptance', {percent: a.percent7d, pause: a.pause_percent})}
        </Text>
      ) : null}
    </View>
  );
}
