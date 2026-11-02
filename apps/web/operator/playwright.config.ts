import {defineConfig} from '@playwright/test';

/** One run against the real server of the sandbox profile (#245): the panel is served by `vite preview`. */
export default defineConfig({
  testDir: './e2e',
  timeout: 90_000,
  reporter: [['list'], ['html', {open: 'never', outputFolder: 'playwright-report'}]],
  use: {baseURL: 'http://127.0.0.1:4176', trace: 'on'},
  webServer: {
    command: 'npm run preview --workspace @blizz/operator',
    url: 'http://127.0.0.1:4176',
    reuseExistingServer: false,
    timeout: 60_000
  }
});
