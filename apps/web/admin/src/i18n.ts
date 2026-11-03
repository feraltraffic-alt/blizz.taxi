import type {Catalogs} from '@blizz/web-ui';
import {core} from './i18n/core.js';
import {paymentOperations} from './i18n/paymentOperations.js';
import {orderFare} from './i18n/orderFare.js';
import {support} from './i18n/support.js';
import {operatorBonuses} from './i18n/operatorBonuses.js';
import {finance} from './i18n/finance.js';
import {clients} from './i18n/clients.js';
import {serviceSettings} from './i18n/serviceSettings.js';
import {reports} from './i18n/reports.js';
import {callLines} from './i18n/callLines.js';
import {risk} from './i18n/risk.js';
import {driverPromotions} from './i18n/driverPromotions.js';
import {promotions} from './i18n/promotions.js';
import {integrations} from './i18n/integrations.js';
import {merchants} from './i18n/merchants.js';
import {flags} from './i18n/flags.js';
import {cancelReasons} from './i18n/cancelReasons.js';
import {deletions} from './i18n/deletions.js';
import {legal} from './i18n/legal.js';

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
export const translations: Catalogs = joinCatalogs({core, paymentOperations, orderFare, support, operatorBonuses, finance, clients, serviceSettings, reports, callLines, risk, driverPromotions, promotions, cancelReasons, deletions, legal, integrations, merchants, flags});

export {validateCatalogs} from '@blizz/web-ui';
