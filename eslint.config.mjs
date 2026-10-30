import js from '@eslint/js';
import tseslint from 'typescript-eslint';
import globals from 'globals';

export default [
  {ignores: ['**/dist/**', '**/node_modules/**', 'packages/api-client/src/generated/**', '**/test-results/**']},
  js.configs.recommended,
  ...tseslint.configs.recommended,
  {
    files: ['**/*.{ts,tsx,mjs}'],
    languageOptions: {globals: {...globals.browser, ...globals.node}},
    rules: {
      '@typescript-eslint/no-unused-vars': ['error', {argsIgnorePattern: '^_'}],
      '@typescript-eslint/no-empty-object-type': 'off'
    }
  }
];
