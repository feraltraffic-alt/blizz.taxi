import {expect, test} from '@playwright/test';

/** A sandbox number of its own per run and theme, and the code from the sandbox's fake SMS. */
function phone(theme: string): string {
  return '+38067' + (theme === 'dark' ? '9' : '8') + String(Date.now()).slice(-6);
}

type Request = import('@playwright/test').APIRequestContext;
type Point = {lat: number; lon: number};

/**
 * Where each theme's rider stands, with a sandbox driver (seed.sql) of its own: 9 km apart, beyond the 5 km search
 * radius, so each order reaches the driver of its own run only.
 */
const PLACES: Record<string, Point & {driver: string; vehicle: string}> = {
  light: {lat: 50.4501, lon: 30.5234, driver: '+380500000001', vehicle: '5a000000-0000-4000-8000-000000000501'},
  dark: {lat: 50.4300, lon: 30.6400, driver: '+380500000003', vehicle: '5a000000-0000-4000-8000-000000000503'}
};

async function signIn(request: Request, audience: string, phone: string): Promise<Record<string, string>> {
  const device = 'e2e-' + audience.toLowerCase() + '-' + crypto.randomUUID();
  const challenge = await request.post('/auth/v1/otp/challenges', {data: {audience, phone, device_ref: device}});
  expect(challenge.status()).toBe(201);
  const code = ((await (await request.get('/sandbox/v1/otp?phone=' + encodeURIComponent(phone))).json()) as
    {code: string}).code;
  const verified = await request.post('/auth/v1/otp/verify', {data: {challenge_id: (await challenge.json()).challenge_id,
    code, device_ref: device}});
  expect(verified.status()).toBe(200);
  return {Authorization: 'Bearer ' + ((await verified.json()) as {access_token: string}).access_token};
}

/** A sandbox driver online at the rider's spot (through the API, as full-ride.sh does); offline again at the end. */
async function driverOnline(request: Request, place: Point & {driver: string; vehicle: string}) {
  const headers = await signIn(request, 'DRIVER', place.driver);
  let sequence = Date.now();
  const location = () => ({lat: place.lat, lon: place.lon, accuracy_m: 5, recorded_at: new Date().toISOString(),
    sequence: ++sequence});
  const opened = await request.post('/api/driver/v1/work-sessions', {headers, data: {command_id: crypto.randomUUID(),
    vehicle_id: place.vehicle, location: location()}});
  expect(opened.status(), await opened.text()).toBe(201);
  const session = (await opened.json()) as {session_id: string};
  return {
    /** Takes the offer, arrives, starts and completes in cash. */
    async drive() {
      let offer = '';
      await expect.poll(async () => {
        const list = (await (await request.get('/api/driver/v1/offers', {headers})).json()) as {id: string}[];
        offer = list[0]?.id ?? '';
        return offer;
      }, {timeout: 30_000}).not.toBe('');
      const accepted = await request.post('/api/driver/v1/offers/' + offer + '/accept', {headers,
        data: {command_id: crypto.randomUUID()}});
      expect(accepted.status(), await accepted.text()).toBe(200);
      let trip = (await (await request.get('/api/driver/v1/trips/current', {headers})).json()) as
        {id: string; version: number};
      const step = async (action: string, extra: Record<string, unknown> = {}) => {
        const answer = await request.post('/api/driver/v1/trips/' + trip.id + '/' + action, {headers,
          data: {command_id: crypto.randomUUID(), expected_version: trip.version, ...extra}});
        expect(answer.status(), action + ': ' + await answer.text()).toBe(200);
        trip = (await answer.json()) as {id: string; version: number};
      };
      await step('arrive', {exception_reason: 'Проверка E2E'});
      await step('start');
      await step('complete', {reported_at: new Date().toISOString(), cash_received: true});
    },
    async offline() {
      const current = (await (await request.get('/api/driver/v1/work-sessions/current', {headers})).json()) as
        {session_version: number};
      const closed = await request.post('/api/driver/v1/work-sessions/' + session.session_id + '/close', {headers,
        data: {command_id: crypto.randomUUID(), expected_version: current.session_version}});
      expect(closed.status(), await closed.text()).toBe(200);
    }
  };
}

test('a rider signs in, orders and cancels, rides to the end, rates and tips, and sees the profile', async ({page, context,
  request}, info) => {
  const number = phone(info.project.name);
  const place = PLACES[info.project.name] ?? PLACES.light!;
  await context.setGeolocation({latitude: place.lat, longitude: place.lon, accuracy: 10});
  await page.goto('/');
  await page.getByLabel('Номер телефона').fill(number);
  await page.screenshot({path: info.outputPath('1-phone.png'), fullPage: true});
  await page.getByRole('button', {name: 'Получить код'}).click();
  await expect(page.getByLabel('Код из сообщения')).toBeVisible();

  let code = '';
  await expect.poll(async () => {
    const answer = await request.get('/sandbox/v1/otp?phone=' + encodeURIComponent(number));
    if (!answer.ok()) return '';
    const body = await answer.json() as {code?: string};
    code = body.code ?? '';
    return code;
  }, {timeout: 20_000}).not.toBe('');
  await page.getByLabel('Код из сообщения').fill(code);
  await page.screenshot({path: info.outputPath('2-code.png'), fullPage: true});
  await page.getByRole('button', {name: 'Подтвердить'}).click();

  const accept = page.getByRole('button', {name: 'Принимаю'});
  for (let i = 0; i < 5 && await accept.isVisible({timeout: 5_000}).catch(() => false); i++) {
    await page.screenshot({path: info.outputPath('3-legal-' + i + '.png'), fullPage: true});
    await accept.click();
  }
  // A ride in Kyiv from here to the station, priced, ordered and cancelled (#248).
  await expect(page.getByText('Куда поедем?')).toBeVisible();
  await page.getByLabel('Поиск адреса назначения', {exact: true}).fill('Вокзал');
  await page.getByRole('button', {name: 'Найти', exact: true}).click();
  await page.getByRole('button', {name: /^Вокзал/}).first().click();
  await page.getByRole('button', {name: 'Узнать цену', exact: true}).click();
  await expect(page.getByText(/^Цена: /)).toBeVisible();
  await page.screenshot({path: info.outputPath('5-priced.png'), fullPage: true});
  await page.getByRole('button', {name: 'Заказать', exact: true}).click();
  await expect(page.getByText('Ищем водителя')).toBeVisible();
  await page.screenshot({path: info.outputPath('6-searching.png'), fullPage: true});
  await page.getByRole('button', {name: /^○ /}).first().click();
  // The search moves the order on (its version grows with each offer), so a cancel may meet a 409: the app reloads
  // the order and says so, and the rider presses again, as a person would.
  const cancelled = page.getByText('Заказ отменён');
  for (let i = 0; i < 3 && !await cancelled.isVisible(); i++) {
    const answer = page.waitForResponse(r => r.url().includes('/cancel') && r.request().method() === 'POST');
    await page.getByRole('button', {name: 'Отменить поездку', exact: true}).click();
    const response = await answer;
    console.log('CANCEL', response.status(), (await response.text()).slice(0, 300));
    await expect(cancelled.or(page.getByText(/^Заказ изменился/))).toBeVisible();
  }
  await expect(cancelled).toBeVisible();
  await page.getByRole('button', {name: 'Новая поездка', exact: true}).click();

  // A second ride, which a sandbox driver drives to the end; then the rating and a tip in cash (#254).
  const driver = await driverOnline(request, place);
  try {
    await page.getByLabel('Поиск адреса назначения', {exact: true}).fill('Вокзал');
    await page.getByRole('button', {name: 'Найти', exact: true}).click();
    await page.getByRole('button', {name: /^Вокзал/}).first().click();
    await page.getByRole('button', {name: 'Узнать цену', exact: true}).click();
    await page.getByRole('button', {name: 'Заказать', exact: true}).click();
    await driver.drive();
    await expect(page.getByText('Поездка завершена')).toBeVisible({timeout: 30_000});
    await page.screenshot({path: info.outputPath('7-fulfilled.png'), fullPage: true});
    await page.getByRole('button', {name: 'Оценка 5', exact: true}).click();
    await expect(page.getByText('Спасибо за оценку: 5')).toBeVisible();
    await page.getByRole('button', {name: /^10 % — /}).click();
    await expect(page.getByText(/передайте их водителю наличными/)).toBeVisible();
    await page.screenshot({path: info.outputPath('8-rated-and-tipped.png'), fullPage: true});
  } finally {
    await driver.offline();
  }
  await page.getByRole('button', {name: 'Новая поездка', exact: true}).click();

  // The ride in the history (#267): fulfilled first, the cancelled one after it; it opens with its rating.
  await page.getByRole('button', {name: 'Мои поездки', exact: true}).click();
  await expect(page.getByText(/ · Поездка завершена · /)).toBeVisible();
  await expect(page.getByText(/ · Заказ отменён/)).toBeVisible();
  await page.screenshot({path: info.outputPath('9-history.png'), fullPage: true});
  await page.getByRole('button', {name: / → Вокзал/}).first().click();
  await expect(page.getByText('Ваша оценка: 5')).toBeVisible();
  await page.getByRole('button', {name: 'Назад', exact: true}).click();
  await page.getByRole('button', {name: 'Поездка', exact: true}).click();
  await page.getByRole('button', {name: 'Профиль', exact: true}).click();
  await expect(page.getByText(/Состояние аккаунта/)).toBeVisible();

  // A card (#269): the sandbox's FAKE provider page opens in a new tab, completes the binding and the card is listed.
  await page.getByRole('button', {name: 'Мои карты', exact: true}).click();
  await expect(page.getByText('Карт пока нет.')).toBeVisible();
  const providerPage = page.waitForEvent('popup');
  await page.getByRole('button', {name: 'Добавить карту: Київ', exact: true}).click();
  const popup = await providerPage;
  console.log('PROVIDER PAGE', popup.url());
  await expect(page.getByText('Карта добавлена.')).toBeVisible({timeout: 30_000});
  await expect(page.getByText(/\*{2,}\d{4}/)).toBeVisible();
  await page.screenshot({path: info.outputPath('10-cards.png'), fullPage: true});
  await popup.close();
  await page.getByRole('button', {name: 'Назад', exact: true}).click();
  await expect(page.getByText(/Состояние аккаунта/)).toBeVisible();

  // A ride by card (#271): the sandbox's bank holds the price, then the search starts; the rider cancels it.
  await page.getByRole('button', {name: 'Поездка', exact: true}).click();
  await page.getByLabel('Поиск адреса назначения', {exact: true}).fill('Вокзал');
  await page.getByRole('button', {name: 'Найти', exact: true}).click();
  await page.getByRole('button', {name: /^Вокзал/}).first().click();
  await page.getByRole('button', {name: 'Узнать цену', exact: true}).click();
  await page.getByRole('button', {name: /^○ Картой /}).click();
  await expect(page.getByText(/^На карте заблокируем /)).toBeVisible();
  const cardOrder = page.waitForResponse(r => r.url().endsWith('/api/rider/v1/orders') && r.request().method() === 'POST');
  await page.getByRole('button', {name: 'Заказать', exact: true}).click();
  const cardAnswer = await cardOrder;
  console.log('CARD ORDER', cardAnswer.status(), (await cardAnswer.text()).slice(0, 400));
  const searching = page.getByText('Ищем водителя');
  if (!await searching.isVisible({timeout: 30_000}).catch(() => false)) {
    console.log('PAGE AFTER CARD ORDER:', await page.locator('body').innerText());
  }
  await expect(searching).toBeVisible();
  await expect(page.getByText('Оплата: картой')).toBeVisible();
  await page.screenshot({path: info.outputPath('11-card-order.png'), fullPage: true});
  const reasonByCard = page.getByRole('button', {name: /^○ /}).first();
  await reasonByCard.click();
  const cardCancelled = page.getByText('Заказ отменён');
  for (let i = 0; i < 3 && !await cardCancelled.isVisible(); i++) {
    await page.getByRole('button', {name: 'Отменить поездку', exact: true}).click();
    await expect(cardCancelled.or(page.getByText(/^Заказ изменился/))).toBeVisible();
  }
  await expect(cardCancelled).toBeVisible();
  await page.getByRole('button', {name: 'Новая поездка', exact: true}).click();
  await page.getByRole('button', {name: 'Профиль', exact: true}).click();
  await expect(page.getByText(/Состояние аккаунта/)).toBeVisible();
  await page.screenshot({path: info.outputPath('4-profile.png'), fullPage: true});
  expect(await page.evaluate(() => localStorage.length)).toBe(0);

  await page.getByRole('button', {name: 'Выйти'}).click();
  await expect(page.getByLabel('Номер телефона')).toBeVisible();
});
