import {ApiError, type ApiClient} from '@blizz/api-client';

export type TrackPoint = {sequence: number; lat: number; lon: number; accuracy_m: number; recorded_at: string};
type Batch = {command_id: string; points: TrackPoint[]};

const PER_BATCH = 100;

/**
 * The GPS points of heartbeats lost to the network, uploaded later as location batches (#456, REQ-GEO-02, REQ-GEO-05,
 * T-14). Kept in memory only, never on disk, at most {@code limit} points (the oldest go first). A batch keeps its
 * command_id until its 200, so a retry after a lost answer is deduplicated by the server; a 429 waits Retry-After; any
 * other refusal drops that batch, which could never be taken, so it does not block the rest.
 */
export function createTrackBuffer(client: ApiClient, newId: () => string, now: () => number, limit = 1000) {
  let points: TrackPoint[] = [];
  let pending: Batch | null = null;
  let notBefore = 0;
  let flushing = false;

  return {
    push(point: TrackPoint) {
      points.push(point);
      const over = points.length + (pending?.points.length ?? 0) - limit;
      if (over > 0) points = points.slice(over);
    },
    clear() {
      points = [];
      pending = null;
      notBefore = 0;
    },
    async flush() {
      if (flushing || now() < notBefore) return;
      flushing = true;
      try {
        while (pending || points.length > 0) {
          if (!pending) {
            pending = {command_id: newId(), points: points.slice(0, PER_BATCH)};
            points = points.slice(PER_BATCH);
          }
          const batch = pending;
          try {
            await client.post('/api/driver/v1/location-batches' as never, {body: batch} as never);
            if (pending === batch) pending = null;
          } catch (error) {
            if (!(error instanceof ApiError) || error.status === 0) {
              if (pending) pending = {...pending, command_id: newId()};
              return;
            }
            if (error.status === 429) {
              notBefore = now() + (error.retryAfterSeconds ?? 60) * 1000;
              return;
            }
            if (error.status >= 500) return;
            if (pending === batch) pending = null;
          }
        }
      } finally {
        flushing = false;
      }
    }
  };
}
