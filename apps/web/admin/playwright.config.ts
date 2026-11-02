import {defineConfig} from '@playwright/test';

/** One run against the real server of the sandbox profile (#136): the panel is served by `vite preview`. */
export default defineConfig({
  testDir: './e2e',
  timeout: 60_000,
  reporter: [['list'], ['html', {open: 'never', outputFolder: 'playwright-report'}]],
  use: {baseURL: 'http://127.0.0.1:4173', trace: 'on'},
  webServer: {
    command: 'npm run preview --workspace @blizz/admin',
    url: 'http://127.0.0.1:4173',
    reuseExistingServer: false,
    timeout: 60_000
  }
});
