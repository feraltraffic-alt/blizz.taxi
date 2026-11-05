import {liveBoardTexts, type Catalogs} from '@blizz/web-ui';

/** The admin panel's live map (#482): the shared board's texts and the section's name. */
export const liveBoard: Catalogs = {
  ru: {...liveBoardTexts.ru, navLive: 'Карта машин'},
  uk: {...liveBoardTexts.uk, navLive: 'Мапа машин'},
  pl: {...liveBoardTexts.pl, navLive: 'Mapa aut'},
  en: {...liveBoardTexts.en, navLive: 'Vehicle map'},
};
