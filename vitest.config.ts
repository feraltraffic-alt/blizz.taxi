import {defineConfig} from 'vitest/config';

export default defineConfig({
  test: {
    projects: [
      {test: {name: 'api', include: ['packages/api-client/test/**/*.test.ts'], environment: 'node'}},
      {test: {name: 'admin', include: ['apps/web/admin/test/**/*.test.tsx'], environment: 'jsdom',
        setupFiles: ['apps/web/admin/test/setup.ts']}}
    ]
  }
});
