import {expect, test} from '@playwright/test';

const LOGIN = process.env.ADMIN_LOGIN ?? 'admin';
const FIRST = process.env.ADMIN_BOOTSTRAP_PASSWORD ?? 'Sandbox-Admin-2026';
const NEXT = process.env.ADMIN_PASSWORD ?? 'Sandbox-Admin-2026-ok';

test('the sandbox admin signs in, changes the first password, sees the profile and signs out', async ({page}) => {
  const tokens: string[] = [];
  page.on('request', request => {
    if (request.url().includes('/auth/v1/token/refresh')) tokens.push(request.url());
  });
  await page.goto('/');
  await page.getByLabel('Логин').fill(LOGIN);
  await page.getByLabel('Пароль').fill('not-the-password');
  await page.getByRole('button', {name: 'Войти'}).click();
  await expect(page.getByRole('alert')).toHaveText('Неверный логин или пароль.');

  await page.getByLabel('Пароль').fill(FIRST);
  await page.getByRole('button', {name: 'Войти'}).click();
  await expect(page.getByRole('heading', {name: 'Смена пароля'})).toBeVisible();
  await expect(page.getByRole('navigation')).toHaveCount(0);
  await page.getByLabel('Текущий пароль').fill(FIRST);
  await page.getByLabel('Новый пароль').fill(NEXT);
  await page.getByRole('button', {name: 'Сохранить пароль'}).click();

  await expect(page.getByRole('heading', {name: 'Профиль'})).toBeVisible();
  await expect(page.getByText('Суперадминистратор')).toBeVisible();
  await expect(page.getByRole('link', {name: 'Сотрудники'})).toBeVisible();
  const stored = await page.evaluate(() => ({local: localStorage.length, session: Object.keys(sessionStorage)}));
  expect(stored.local).toBe(0);
  expect(stored.session).toEqual(['blizz.admin.refresh']);

  await page.getByRole('button', {name: 'Выйти'}).click();
  await expect(page.getByRole('button', {name: 'Войти'})).toBeVisible();
  expect(await page.evaluate(() => sessionStorage.length)).toBe(0);
  expect(tokens).toEqual([]);
});
