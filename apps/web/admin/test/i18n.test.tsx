import {describe, expect, it} from 'vitest';
import {readdirSync, readFileSync} from 'node:fs';
import {join as path} from 'node:path';
import * as i18n from '../src/i18n.js';

/** Texts per section (#377): I1–I3 of the issue. */
type Catalogs = Record<'ru' | 'uk' | 'pl', Record<string, string>>;
const join = (i18n as unknown as {joinCatalogs?: (parts: Record<string, Catalogs>) => Catalogs}).joinCatalogs;
const snapshot = JSON.parse(readFileSync(path(process.cwd(),
  'apps/web/admin/test/fixtures/i18n-snapshot.json'), 'utf8')) as Catalogs;

describe('I1: nothing lost', () => {
  it('every text of 03.11 is still there, unchanged, in every language; new sections only add', () => {
    for (const locale of ['ru', 'uk', 'pl'] as const) {
      expect(Object.keys(snapshot[locale])).toHaveLength(306);
      expect(i18n.translations[locale]).toMatchObject(snapshot[locale]);
    }
  });
});

describe('I2: a key in two files', () => {
  it('is refused, naming the key and both files', () => {
    expect(join).toBeTypeOf('function');
    const part = {ru: {save: 'a'}, uk: {save: 'b'}, pl: {save: 'c'}};
    expect(() => join!({core: part, geo: part})).toThrow(/save.*core.*geo|save.*geo.*core/);
  });
});

describe('I3: a key missing from a language', () => {
  it('is refused, naming the key and the language', () => {
    expect(join).toBeTypeOf('function');
    expect(() => join!({geo: {ru: {save: 'a', more: 'b'}, uk: {save: 'b', more: 'c'}, pl: {save: 'c'}}}))
      .toThrow(/more.*pl/);
  });

  it('a key only in another language than ru is refused as well', () => {
    expect(() => join!({geo: {ru: {save: 'a'}, uk: {save: 'b', extra: 'x'}, pl: {save: 'c'}}})).toThrow(/extra/);
  });

  it('two good files join', () => {
    expect(join!({core: {ru: {a: '1'}, uk: {a: '2'}, pl: {a: '3'}}, geo: {ru: {b: '4'}, uk: {b: '5'}, pl: {b: '6'}}}))
      .toEqual({ru: {a: '1', b: '4'}, uk: {a: '2', b: '5'}, pl: {a: '3', b: '6'}});
  });
});

/** The section files, read from the folder itself, so a file the module forgets is noticed (#441). */
const folder = path(process.cwd(), 'apps/web/admin/src/i18n');
const files = readdirSync(folder).filter(name => name.endsWith('.ts'));

describe('I4: every file is joined', () => {
  it.each(files)('%s', async name => {
    const module = await import('../src/i18n/' + name.replace(/\.ts$/, '.js')) as Record<string, Catalogs>;
    const parts = Object.values(module);
    expect(parts.length).toBeGreaterThan(0);
    for (const part of parts) {
      for (const locale of ['ru', 'uk', 'pl'] as const) {
        expect(i18n.translations[locale]).toMatchObject(part[locale]);
      }
    }
  });
});

describe('I5: no list to keep', () => {
  it('i18n.ts names no section file', () => {
    const source = readFileSync(path(process.cwd(), 'apps/web/admin/src/i18n.ts'), 'utf8');
    expect(source).not.toMatch(/from '\.\/i18n\//);
    expect(files.length).toBeGreaterThan(10);
  });
});
