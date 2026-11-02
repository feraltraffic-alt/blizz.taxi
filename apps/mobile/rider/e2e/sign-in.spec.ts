import {expect, test} from '@playwright/test';

/** A sandbox number of its own per run and theme, and the code from the sandbox's fake SMS. */
function phone(theme: string): string {
  return '+38067' + (theme === 'dark' ? '9' : '8') + String(Date.now()).slice(-6);
}

test('a rider signs in by a code, accepts the texts in force and sees the profile', async ({page, request},
  info) => {
  const number = phone(info.project.name);
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
  await page.getByRole('button', {name: 'Отменить поездку', exact: true}).click();
  await expect(page.getByText('Заказ отменён')).toBeVisible();
  await page.getByRole('button', {name: 'Новая поездка', exact: true}).click();
  await page.getByRole('button', {name: 'Профиль', exact: true}).click();
  await expect(page.getByText(/Состояние аккаунта/)).toBeVisible();
  await page.screenshot({path: info.outputPath('4-profile.png'), fullPage: true});
  expect(await page.evaluate(() => localStorage.length)).toBe(0);

  await page.getByRole('button', {name: 'Выйти'}).click();
  await expect(page.getByLabel('Номер телефона')).toBeVisible();
});
