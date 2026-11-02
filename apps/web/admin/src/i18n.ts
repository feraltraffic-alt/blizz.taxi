export type Locale = 'ru' | 'uk' | 'pl';
export const translations: Record<Locale, Record<string, string>> = {ru: {}, uk: {}, pl: {}};

export function validateCatalogs(_catalogs: Record<Locale, Record<string, string>>): void {
  // Tests-first boundary.
}
