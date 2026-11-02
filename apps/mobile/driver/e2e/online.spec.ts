import {expect, test} from '@playwright/test';

/** Sandbox drivers admitted in Kyiv (sandbox/seed.sql): one per theme, so their sessions never meet. */
const DRIVERS: Record<string, string> = {light: '+380500000001', dark: '+380500000002'};
/**
 * Where each theme's driver stands: 9 km apart, beyond the 5 km search radius, so each rider's order is offered to
 * the driver of the same run only.
 */
const PLACES: Record<string, {lat: number; lon: number}> = {light: {lat: 50.4501, lon: 30.5234},
  dark: {lat: 50.4300, lon: 30.6400}};

type Request = import('@playwright/test').APIRequestContext;

/** A rider of the sandbox orders a cash ride from the driver's spot through the API, as full-ride.sh does. */
async function riderOrders(request: Request, from: {lat: number; lon: number}):
  Promise<{order: string; headers: Record<string, string>}> {
  // Random, not the clock: the light and dark runs start together and would ask a code for the same number (a 429).
  const phone = '+38067' + String(crypto.getRandomValues(new Uint32Array(1))[0]! % 10_000_000).padStart(7, '0');
  const device = 'e2e-rider-' + crypto.randomUUID();
  const challenge = await request.post('/auth/v1/otp/challenges', {data: {audience: 'CLIENT', phone,
    device_ref: device}});
  expect(challenge.status()).toBe(201);
  const code = ((await (await request.get('/sandbox/v1/otp?phone=' + encodeURIComponent(phone))).json()) as
    {code: string}).code;
  const verified = await request.post('/auth/v1/otp/verify', {data: {challenge_id: (await challenge.json()).challenge_id,
    code, device_ref: device}});
  expect(verified.status()).toBe(200);
  const headers = {Authorization: 'Bearer ' + ((await verified.json()) as {access_token: string}).access_token};
  const to = {lat: from.lat - 0.008, lon: from.lon - 0.01};
  const quote = await request.post('/api/rider/v1/quotes', {headers, data: {command_id: crypto.randomUUID(),
    vehicle_class: 'STANDARD', pickup: from, dropoff: to}});
  expect(quote.status()).toBe(201);
  const order = await request.post('/api/rider/v1/orders', {headers, data: {command_id: crypto.randomUUID(),
    quote_id: ((await quote.json()) as {id: string}).id, vehicle_class: 'STANDARD', pickup: from,
    pickup_label: 'Точка E2E', dropoff: to, dropoff_label: 'Назначение E2E', payment_method: 'CASH'}});
  expect(order.status()).toBe(201);
  return {order: ((await order.json()) as {id: string}).id, headers};
}

test('a sandbox driver signs in by a code, goes online, takes an offer, drives it to the end and goes offline',
  async ({page, context, request}, info) => {
  const phone = DRIVERS[info.project.name] ?? '+380500000003';
  const place = PLACES[info.project.name] ?? PLACES.light!;
  await context.setGeolocation({latitude: place.lat, longitude: place.lon, accuracy: 10});
  await page.goto('/');
  await page.getByLabel('Номер телефона').fill(phone);
  await page.screenshot({path: info.outputPath('1-phone.png'), fullPage: true});
  await page.getByRole('button', {name: 'Получить код'}).click();
  await expect(page.getByLabel('Код из сообщения')).toBeVisible();
  let code = '';
  await expect.poll(async () => {
    const answer = await request.get('/sandbox/v1/otp?phone=' + encodeURIComponent(phone));
    code = answer.ok() ? ((await answer.json()) as {code?: string}).code ?? '' : '';
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
  await expect(page.getByText('Вы не на линии')).toBeVisible();
  await expect(page.getByText('Проверка документов: допущен')).toBeVisible();
  await page.screenshot({path: info.outputPath('4-offline.png'), fullPage: true});
  await page.getByRole('button', {name: 'Выйти на линию'}).click();
  await expect(page.getByText('Вы на линии')).toBeVisible();
  await page.screenshot({path: info.outputPath('5-online.png'), fullPage: true});

  // A ride from the driver's spot, offered to this driver, accepted and driven to the end in cash (#249).
  await expect(page.getByText('Ждём предложений…')).toBeVisible();
  const rider = await riderOrders(request, place);
  await expect(page.getByText('Точка E2E → Назначение E2E')).toBeVisible({timeout: 30_000});
  await page.screenshot({path: info.outputPath('6-offer.png'), fullPage: true});
  await page.getByRole('button', {name: 'Принять', exact: true}).click();
  await expect(page.getByText('Едете к пассажиру')).toBeVisible();

  // The order chat (#262): the rider writes through the API, the driver reads it and answers in the app.
  const wrote = await request.post('/api/rider/v1/orders/' + rider.order + '/messages', {headers: rider.headers,
    data: {command_id: crypto.randomUUID(), body: 'Я у входа в метро'}});
  expect(wrote.status(), await wrote.text()).toBe(201);
  await expect(page.getByText('Пассажир: Я у входа в метро')).toBeVisible({timeout: 15_000});
  await page.getByLabel('Сообщение', {exact: true}).fill('Буду через 3 минуты');
  await page.getByRole('button', {name: 'Отправить', exact: true}).click();
  await expect(page.getByText('Вы: Буду через 3 минуты')).toBeVisible();
  const read = await request.get('/api/rider/v1/orders/' + rider.order + '/messages?after=0', {headers: rider.headers});
  expect(((await read.json()) as {messages: {sender_role: string; body: string}[]}).messages
    .map(m => m.sender_role + ': ' + m.body)).toEqual(['RIDER: Я у входа в метро', 'DRIVER: Буду через 3 минуты']);
  await page.screenshot({path: info.outputPath('7a-chat.png'), fullPage: true});
  await page.screenshot({path: info.outputPath('7-to-pickup.png'), fullPage: true});
  await page.getByRole('button', {name: 'Я на месте', exact: true}).click();
  const confirm = page.getByRole('button', {name: 'Подтвердить прибытие', exact: true});
  await expect(page.getByText('Ждёте пассажира').or(confirm)).toBeVisible();
  if (await confirm.isVisible()) {
    // The server may not trust the position yet (a stale or inaccurate one): the driver confirms with a reason.
    await page.screenshot({path: info.outputPath('7b-far.png'), fullPage: true});
    await page.getByLabel('Почему вы на месте', {exact: true}).fill('Проверка E2E');
    await confirm.click();
  }
  await expect(page.getByText('Ждёте пассажира')).toBeVisible();
  await page.screenshot({path: info.outputPath('8-waiting.png'), fullPage: true});
  await page.getByRole('button', {name: 'Начать поездку', exact: true}).click();
  await expect(page.getByText('Везёте пассажира')).toBeVisible();
  await expect(page.getByText(/^Получить наличными: /)).toBeVisible();
  await page.screenshot({path: info.outputPath('9-in-progress.png'), fullPage: true});
  await page.getByRole('button', {name: 'Завершить поездку', exact: true}).click();
  await page.getByRole('button', {name: /^Наличные получены: /}).click();
  await expect(page.getByText('Ждём предложений…')).toBeVisible();
  await page.screenshot({path: info.outputPath('10-completed.png'), fullPage: true});

  // A second ride: the driver declines the offer; nobody else is near, so the order comes to the ALL tab, where the
  // driver takes it, and then cancels it at the passenger's request (#256).
  await riderOrders(request, place);
  await expect(page.getByText('Точка E2E → Назначение E2E')).toBeVisible({timeout: 30_000});
  await page.getByRole('button', {name: 'Отклонить', exact: true}).click();
  await expect(page.getByText('Все заказы рядом')).toBeVisible({timeout: 30_000});
  await page.screenshot({path: info.outputPath('11-all-tab.png'), fullPage: true});
  await page.getByRole('button', {name: 'Взять', exact: true}).first().click();
  await expect(page.getByText('Едете к пассажиру')).toBeVisible();
  await page.getByRole('button', {name: '○ Пассажир попросил отменить', exact: true}).click();
  await page.getByRole('button', {name: 'Отменить поездку', exact: true}).click();
  await expect(page.getByText('Ждём предложений…')).toBeVisible();
  await page.screenshot({path: info.outputPath('12-cancelled.png'), fullPage: true});
  await page.getByRole('button', {name: 'Уйти с линии'}).click();
  await expect(page.getByText('Вы не на линии')).toBeVisible();
  expect(await page.evaluate(() => localStorage.length)).toBe(0);
});
