import type {Shared} from '@blizz/mobile-ui';

export type Point = {lat: number; lon: number};

// Tests-first boundary: the ride screens follow after the red CI run.
export function Ride(_props: Shared & {newId: () => string; locate: () => Promise<Point>; service: string;
  pollMs: number; onLegal: () => void}) {
  return null;
}
