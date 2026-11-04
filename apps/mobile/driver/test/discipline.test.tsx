import {render, screen} from '@testing-library/react-native';
import {createApiClient} from '@blizz/api-client';
import {translator} from '@blizz/mobile-ui';
import {Discipline} from '../src/Discipline';
import {translations} from '../src/i18n';

/** The driver's own cancellations, acceptance and pause (ADR 0018 B10, #487). */
const cid = '10000000-0000-4000-8000-000000000001';
const session = {
  session_id: '10000000-0000-4000-8000-000000000002', subject: {type: 'DRIVER', id: '10000000-0000-4000-8000-000000000003'},
  audience: 'driver', access_token: 'test-only-access', refresh_token: 'test-only-refresh',
  access_expires_at: '2099-01-01T00:00:00Z', refresh_expires_at: '2099-01-01T00:00:00Z', password_change_required: false
};
const t = translator(translations, 'ru');

const counts = (over: Record<string, unknown> = {}) => ({
  cancellations: {enabled: true, last24h: 3, warn_after: 3, pause_after: 5, until_pause: 2, accepted30d: 10,
    cancelled30d: 3, rate30d_percent: 30},
  acceptance: {enabled: true, offers7d: 25, accepted7d: 10, percent7d: 40, min_offers: 20, warn_percent: 50,
    pause_percent: 30},
  pause: null, ...over});

async function mount(status: number, body: unknown) {
  const fetch = jest.fn(async () => new Response(JSON.stringify(body), {status,
    headers: {'Content-Type': 'application/json'}}));
  const client = createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: {read: () => null, write: () => {}},
    fetch: fetch as unknown as typeof globalThis.fetch, correlationId: () => cid, initialSession: session as never});
  await render(<Discipline client={client} t={t} guard={((work: () => unknown) => work()) as never} failure={() => ''} refresh={1} />);
  return fetch;
}

it('shows the cancellations of the day, how many until a pause, the rate and the acceptance', async () => {
  const fetch = await mount(200, counts());
  expect(await screen.findByText('Отказов от принятых заказов за сутки: 3. Пауза — после ещё 2.')).toBeTruthy();
  expect(screen.getByText('За 30 дней: 30 % отказов (3 из 10).')).toBeTruthy();
  expect(screen.getByText('Принято предложений за 7 дней: 40 %. Ниже 30 % — пауза.')).toBeTruthy();
  expect(String((fetch.mock.calls[0] as unknown[])[0])).toContain('/api/driver/v1/discipline');
});

it('the next cancellation pauses: says so', async () => {
  await mount(200, counts({cancellations: {...counts().cancellations, last24h: 4, until_pause: 1}}));
  expect(await screen.findByText('Отказов от принятых заказов за сутки: 4. Следующий отказ поставит новые заказы на паузу.'))
    .toBeTruthy();
});

it('a pause shows when it ends and why', async () => {
  const ends = new Date(2026, 10, 4, 10, 30).toISOString();
  await mount(200, counts({pause: {kind: 'ACCEPTANCE', level: 1, ends_at: ends}}));
  expect(await screen.findByText('Новые заказы на паузе до 10:30: вы принимаете мало заказов')).toBeTruthy();
});

it('few offers: the percent waits for the minimum; a part switched off is not shown', async () => {
  await mount(200, counts({acceptance: {...counts().acceptance, offers7d: 4, percent7d: null},
    cancellations: {...counts().cancellations, enabled: false}}));
  expect(await screen.findByText('Предложений за 7 дней: 4; процент считается от 20.')).toBeTruthy();
  expect(screen.queryByText(/Отказов от принятых заказов/)).toBeNull();
});

it('a failure shows nothing and breaks nothing', async () => {
  await mount(500, {code: 'INTERNAL', correlation_id: cid});
  await new Promise(resolve => setTimeout(resolve, 20));
  expect(screen.queryByLabelText('Отказы и принятие заказов')).toBeNull();
});
