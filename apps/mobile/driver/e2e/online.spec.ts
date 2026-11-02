import {expect, test} from '@playwright/test';

/** Sandbox drivers admitted in Kyiv (sandbox/seed.sql): one per theme, so their sessions never meet. */
const DRIVERS: Record<string, string> = {light: '+380500000001', dark: '+380500000002'};

test('a sandbox driver signs in by a code, accepts the texts, goes online and offline', async ({page, request},
  info) => {
  const phone = DRIVERS[info.project.name] ?? '+380500000003';
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
  await page.getByRole('button', {name: 'Уйти с линии'}).click();
  await expect(page.getByText('Вы не на линии')).toBeVisible();
  expect(await page.evaluate(() => localStorage.length)).toBe(0);
});
