import {defineConfig} from '@playwright/test';

/** One run of the rider app's web build against the real server of the sandbox profile (#137). */
export default defineConfig({
  testDir: './e2e',
  timeout: 90_000,
  reporter: [['list'], ['html', {open: 'never', outputFolder: 'playwright-report'}]],
  use: {baseURL: 'http://127.0.0.1:4174', trace: 'on'},
  projects: [
    {name: 'light', use: {colorScheme: 'light'}},
    {name: 'dark', use: {colorScheme: 'dark'}}
  ],
  webServer: {command: 'node scripts/serve-rider-web.mjs', cwd: '../../..', url: 'http://127.0.0.1:4174',
    reuseExistingServer: false, timeout: 30_000}
});
