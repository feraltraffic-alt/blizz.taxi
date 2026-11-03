import {afterAll, afterEach, beforeAll, describe, expect, it} from 'vitest';
import {render, screen, waitFor, within} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {http, HttpResponse} from 'msw';
import {setupServer} from 'msw/node';
import {createApiClient} from '@blizz/api-client';
import {browserRefreshTokens, parsePoint} from '@blizz/web-ui';
import {OperatorApp} from '../src/App.js';
import {cid, me, problem, session} from '../../../../test/fixtures.js';

/** Pick a pickup or destination on the map (#472): P1–P5 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear();});
afterAll(() => server.close());

const KYIV = {id: '5a000000-0000-4000-8000-000000000001', code: 'kyiv', name: 'Київ', currency: 'UAH',
  timezone: 'Europe/Kyiv', working_hours: [], payment_methods: ['CASH'], orders_paused: false,
  center: {lat: 50.45, lon: 30.52}};
const operator = {...me, effective_permissions: ['orders.create', 'orders.view', 'orders.cancel']};

function handlers(reverse: () => Response) {
  const asked: {lat: string | null; lon: string | null}[] = [];
  server.use(
    http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [KYIV]})),
    http.get(origin + '/api/operator/v1/me', () => HttpResponse.json(operator as never)),
    http.get(origin + '/api/operator/v1/vehicle-classes', () => HttpResponse.json([{code: 'STANDARD',
      name: 'Стандарт'}])),
    http.get(origin + '/api/operator/v1/cancel-reasons', () => HttpResponse.json({reasons: []})),
    http.get(origin + '/api/operator/v1/places/reverse', ({request}) => {
      const q = new URL(request.url).searchParams;
      asked.push({lat: q.get('lat'), lon: q.get('lon')});
      return reverse();
    }));
  return asked;
}

function mount() {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage, 'test'),
    correlationId: () => cid, initialSession: session});
  render(<OperatorApp client={api} pollMs={60_000} />);
}

async function onMap(user: ReturnType<typeof userEvent.setup>, point: string) {
  const box = (await screen.findByLabelText('Откуда')).closest('fieldset') as HTMLElement;
  await user.click(within(box).getByRole('button', {name: 'Указать на карте'}));
  expect(within(box).getByRole('region', {name: 'Карта для выбора точки'})).toBeTruthy();
  await user.type(within(box).getByLabelText('Точка: широта, долгота'), point);
  await user.click(within(box).getByRole('button', {name: 'Найти адрес точки'}));
  return box;
}

const place = {source: 'OWN', label: 'Ворота парку Шевченка', street: 'Володимирська', house: '1',
  point: {lat: 50.4415, lon: 30.5131}};

describe('P1: picking on the map', () => {
  it('asks places/reverse with the point, rounded to 6 decimals', async () => {
    const asked = handlers(() => HttpResponse.json(place as never));
    const user = userEvent.setup();
    mount();
    await onMap(user, '50.44151234567, 30.5131');
    await waitFor(() => expect(asked).toEqual([{lat: '50.441512', lon: '30.5131'}]));
  });

  it('the shared parser', () => {
    expect(parsePoint('50,45; 30,52')).toEqual([50.45, 30.52]);
    expect(parsePoint('91, 1')).toBeNull();
  });
});

describe('P2: 200', () => {
  it('the returned place is picked and the map closes', async () => {
    handlers(() => HttpResponse.json(place as never));
    const user = userEvent.setup();
    mount();
    const box = await onMap(user, '50.4415, 30.5131');
    expect(await within(box).findByText('Ворота парку Шевченка')).toBeTruthy();
    expect(within(box).queryByRole('region', {name: 'Карта для выбора точки'})).toBeNull();
  });
});

describe('P3: 204', () => {
  it('the point itself is picked, labelled with its coordinates', async () => {
    handlers(() => new HttpResponse(null, {status: 204}));
    const user = userEvent.setup();
    mount();
    const box = await onMap(user, '50.45, 30.52');
    expect(await within(box).findByText('Точка на карте 50.450000, 30.520000')).toBeTruthy();
  });
});

describe('P4: 422', () => {
  it('outside the service: said, nothing picked', async () => {
    handlers(() => HttpResponse.json(problem(422, 'OUTSIDE_SERVICE_AREA'), {status: 422}));
    const user = userEvent.setup();
    mount();
    const box = await onMap(user, '48.0, 20.0');
    expect(await within(box).findByText('Точка вне городов службы.')).toBeTruthy();
    expect(within(box).queryByText(/^Точка на карте/)).toBeNull();
  });
});

describe('P5: a wrong point', () => {
  it('nothing is asked', async () => {
    const asked = handlers(() => HttpResponse.json(place as never));
    const user = userEvent.setup();
    mount();
    const box = await onMap(user, 'парк');
    expect(await within(box).findByText('Точка — «широта, долгота», например 50.45, 30.52.')).toBeTruthy();
    expect(asked).toHaveLength(0);
  });
});
