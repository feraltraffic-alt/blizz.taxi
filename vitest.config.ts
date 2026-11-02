import {defineConfig} from 'vitest/config';

export default defineConfig({
  test: {
    projects: [
      {test: {name: 'audit', include: ['test/**/*.test.ts'], environment: 'node'}},
      {test: {name: 'api', include: ['packages/api-client/test/**/*.test.ts'], environment: 'node'}},
      {test: {name: 'admin', include: ['apps/web/admin/test/**/*.test.tsx'], environment: 'jsdom',
        setupFiles: ['apps/web/admin/test/setup.ts']}},
      {test: {name: 'operator', include: ['apps/web/operator/test/**/*.test.tsx'], environment: 'jsdom',
        setupFiles: ['apps/web/operator/test/setup.ts']}}
    ]
  }
});
