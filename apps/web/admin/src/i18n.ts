import type {Catalogs} from '@blizz/web-ui';
import {core} from './i18n/core.js';
import {cancelReasons} from './i18n/cancelReasons.js';
import {deletions} from './i18n/deletions.js';

export type {Locale} from '@blizz/web-ui';

const LOCALES = ['ru', 'uk', 'pl'] as const;

/**
 * Joins the texts of the sections, one file each (#377). Refuses, when the module loads, a key given by two files and a
 * key missing from one language, naming them, so a mistake never reaches a screen as a bare key.
 */
export function joinCatalogs(parts: Record<string, Catalogs>): Catalogs {
  const joined: Catalogs = {ru: {}, uk: {}, pl: {}};
  const owner: Record<string, string> = {};
  for (const [name, part] of Object.entries(parts)) {
    const keys = new Set(LOCALES.flatMap(locale => Object.keys(part[locale] ?? {})));
    for (const key of keys) {
      const missing = LOCALES.filter(locale => !(key in (part[locale] ?? {})));
      if (missing.length) throw new Error('Text "' + key + '" of ' + name + ' is missing in ' + missing.join(', '));
      if (owner[key]) throw new Error('Text "' + key + '" is in both ' + owner[key] + ' and ' + name);
      owner[key] = name;
      for (const locale of LOCALES) joined[locale][key] = part[locale][key]!;
    }
  }
  return joined;
}

/** Russian by default; Ukrainian and Polish with the same keys (owner decision 27.10.2026). */
export const translations: Catalogs = joinCatalogs({core, cancelReasons, deletions});

export {validateCatalogs} from '@blizz/web-ui';
