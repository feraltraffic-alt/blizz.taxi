import {expect, test, type APIRequestContext} from '@playwright/test';

const ADMIN = process.env.ADMIN_LOGIN ?? 'admin';
const ADMIN_FIRST = process.env.ADMIN_BOOTSTRAP_PASSWORD ?? 'Sandbox-Admin-2026';
const ADMIN_PASSWORD = process.env.ADMIN_PASSWORD ?? 'Sandbox-Admin-2026-ok';

/** The sandbox admin's token: the changed password, or the first one changed once. */
async function adminToken(request: APIRequestContext): Promise<string> {
  const signIn = (password: string) => request.post('/auth/v1/staff/sign-in',
    {data: {login: ADMIN, password, audience: 'ADMIN', device_ref: 'e2e'}});
  let answer = await signIn(ADMIN_PASSWORD);
  if (!answer.ok()) {
    const first = await (await signIn(ADMIN_FIRST)).json() as {access_token: string};
    await request.post('/api/admin/v1/me/password', {headers: {Authorization: 'Bearer ' + first.access_token},
      data: {current_password: ADMIN_FIRST, new_password: ADMIN_PASSWORD}});
    answer = await signIn(ADMIN_PASSWORD);
  }
  return (await answer.json() as {access_token: string}).access_token;
}

test('an operator signs in, takes a phone order in Kyiv, sees it and cancels it', async ({page, request}, info) => {
  const token = await adminToken(request);
  const boot = await (await request.get('/api/config/v1/bootstrap')).json() as {cities: {id: string; code: string}[]};
  const kyiv = boot.cities.find(c => c.code === 'kyiv') ?? boot.cities[0]!;
  const login = 'e2e-operator-' + Date.now();
  const first = 'Operator-First-2026';
  const created = await request.post('/api/admin/v1/staff', {headers: {Authorization: 'Bearer ' + token}, data: {
    command_id: crypto.randomUUID(), login, initial_password: first, password: ADMIN_PASSWORD,
    reason: 'Web E2E operator (#245)',
    profile: {first_name: 'Ірина', last_name: 'Оператор', contacts: {email: login + '@example.invalid'},
      role: 'OPERATOR', permissions: ['orders.create', 'orders.view', 'orders.cancel'], all_cities: false,
      city_ids: [kyiv.id]}
  }});
  expect(created.status(), await created.text()).toBe(201);

  await page.goto('/');
  await page.getByLabel('Логин').fill(login);
  await page.getByLabel('Пароль').fill(first);
  await page.getByRole('button', {name: 'Войти'}).click();
  await page.getByLabel('Текущий пароль').fill(first);
  await page.getByLabel('Новый пароль').fill('Operator-Next-2026-ok');
  await page.getByRole('button', {name: 'Сохранить пароль'}).click();

  // What the page shows, in the log, when the form does not come (an artifact cannot always be fetched).
  const form = page.getByRole('heading', {name: 'Новый заказ по телефону'});
  if (!await form.isVisible({timeout: 10_000}).catch(() => false)) {
    console.log('PAGE AFTER PASSWORD CHANGE:', await page.locator('body').innerText());
  }
  await expect(form).toBeVisible();
  await page.getByLabel('Телефон звонящего').fill('+38067' + String(Date.now()).slice(-7));
  await page.getByLabel('Откуда').fill('Хрещатик');
  await page.getByRole('button', {name: 'Найти'}).first().click();
  await page.locator('fieldset').nth(0).getByRole('listitem').first().getByRole('button').click();
  await page.getByLabel('Куда').fill('Вокзал');
  await page.getByRole('button', {name: 'Найти'}).nth(1).click();
  await page.locator('fieldset').nth(1).getByRole('listitem').first().getByRole('button').click();
  await page.getByRole('button', {name: 'Рассчитать цену'}).click();
  await expect(page.getByText(/^Цена: /)).toBeVisible();
  await page.screenshot({path: info.outputPath('1-priced.png'), fullPage: true});
  await page.getByRole('button', {name: 'Создать заказ'}).click();

  await expect(page.getByText(/^Заказ №\d+/)).toBeVisible();
  await expect(page.getByText(/^Статус: /)).toBeVisible();
  await page.screenshot({path: info.outputPath('2-order.png'), fullPage: true});
  await page.getByLabel('Причина отмены').selectOption({index: 1});
  await page.getByRole('button', {name: 'Отменить заказ'}).click();
  await expect(page.getByText('Статус: CANCELLED')).toBeVisible();
  await page.screenshot({path: info.outputPath('3-cancelled.png'), fullPage: true});
});
