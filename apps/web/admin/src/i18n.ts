import type {Catalogs} from '@blizz/web-ui';

export type {Locale} from '@blizz/web-ui';

const LOCALES = ['ru', 'uk', 'pl', 'en'] as const;

/**
 * Joins the texts of the sections, one file each (#377). Refuses, when the module loads, a key given by two files and a
 * key missing from one language, naming them, so a mistake never reaches a screen as a bare key.
 */
export function joinCatalogs(parts: Record<string, Catalogs>): Catalogs {
  const joined: Catalogs = {ru: {}, uk: {}, pl: {}, en: {}};
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

/**
 * Every file of `i18n/`, each section's texts (#441): a new section adds its own file and never this one, so two branches
 * adding sections do not collide here. Each export is joined under its own name.
 */
const sections = import.meta.glob<Record<string, Catalogs>>('./i18n/*.ts', {eager: true});

/** Russian by default; Ukrainian, Polish and English with the same keys (owner decision 27.10.2026). */
export const translations: Catalogs = joinCatalogs(Object.fromEntries(Object.values(sections)
  .flatMap(module => Object.entries(module))));

export {validateCatalogs} from '@blizz/web-ui';
