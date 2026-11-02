import {expect, test} from '@playwright/test';

/**
 * A new driver gets admitted documents in from the phone (#315): the web build against the sandbox server, from a new
 * number to "submitted for review". The files are real PNGs the server checks (structure, the sandbox antivirus).
 */

/** A 1×1 PNG: small, valid, nothing for the scanner to refuse. */
const PNG = Buffer.from('iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAYAAAAfFcSJAAAADUlEQVR42mNkYPhfDwAChwGA60e6kgAAAABJRU5ErkJggg==',
  'base64');

test('a new driver adds a car, uploads the three documents and submits them for review', async ({page, request}, info) => {
  // Never a seed driver (+38050000000x): random, so the light and dark runs never share a number.
  const phone = '+38063' + String(crypto.getRandomValues(new Uint32Array(1))[0]! % 10_000_000).padStart(7, '0');
  const plate = 'AA' + String(crypto.getRandomValues(new Uint16Array(1))[0]! % 10_000).padStart(4, '0') + 'EE';
  const shot = (name: string) => page.screenshot({path: info.outputPath(name + '.png'), fullPage: true});

  // E1: a new number signs in, accepts the texts and has nothing submitted yet.
  await page.goto('/');
  await page.getByLabel('Номер телефона').fill(phone);
  await page.getByRole('button', {name: 'Получить код'}).click();
  await expect(page.getByLabel('Код из сообщения')).toBeVisible();
  let code = '';
  await expect.poll(async () => {
    const answer = await request.get('/sandbox/v1/otp?phone=' + encodeURIComponent(phone));
    code = answer.ok() ? ((await answer.json()) as {code?: string}).code ?? '' : '';
    return code;
  }, {timeout: 20_000}).not.toBe('');
  await page.getByLabel('Код из сообщения').fill(code);
  await page.getByRole('button', {name: 'Подтвердить'}).click();
  const accept = page.getByRole('button', {name: 'Принимаю'});
  for (let i = 0; i < 5 && await accept.isVisible({timeout: 5_000}).catch(() => false); i++) await accept.click();
  await expect(page.getByText('Проверка документов: не отправлены')).toBeVisible();
  await shot('1-new-driver');

  // E2: the car.
  await page.getByRole('button', {name: 'Документы и автомобиль'}).click();
  await page.getByLabel('Госномер').fill(plate);
  await page.getByLabel('Марка').fill('Skoda');
  await page.getByLabel('Модель').fill('Octavia');
  await page.getByLabel('Цвет').fill('белый');
  await page.getByLabel('Год выпуска').fill('2019');
  await page.getByRole('button', {name: 'Добавить автомобиль'}).click();
  await expect(page.getByText('Skoda Octavia ' + plate + ' — черновик')).toBeVisible();
  await shot('2-car');

  // E3: each document through the browser's file chooser, checked and attached by the real server.
  for (const [type, file] of [['Водительское удостоверение', 'license.png'], ['Техпаспорт', 'registration.png'],
    ['Страховка', 'insurance.png']] as const) {
    const chooser = page.waitForEvent('filechooser');
    await page.getByRole('button', {name: 'Загрузить: ' + type}).click();
    // MUTATION: a PDF with active content, which the server must refuse.
    await (await chooser).setFiles({name: file.replace('.png', '.pdf'), mimeType: 'application/pdf',
      buffer: Buffer.from('%PDF-1.4\n1 0 obj << /OpenAction << /S /JavaScript /JS (app.alert(1)) >> >> endobj\n%%EOF\n')});
    await expect(page.getByText(/Файл не принят/)).toBeVisible({timeout: 20_000});
    await shot('mutation-refused');
    await expect(page.getByText(type + ': на проверке')).toBeVisible({timeout: 20_000});
  }
  await shot('3-documents');

  // E4: submitted.
  await page.getByRole('button', {name: 'Отправить на проверку'}).click();
  await expect(page.getByText('Проверка документов: на проверке')).toBeVisible();
  await expect(page.getByRole('button', {name: 'Отправить на проверку'})).toHaveCount(0);
  await shot('4-submitted');
});
