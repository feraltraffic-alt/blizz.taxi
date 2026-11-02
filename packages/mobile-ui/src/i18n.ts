export type Locale = 'ru' | 'uk' | 'pl';
export type Catalogs = Record<Locale, Record<string, string>>;
export type Translate = (key: string, values?: Record<string, string | number>) => string;

/** The texts of the shared screens (sign-in, legal texts, states); each app adds its own keys. */
export const commonTranslations: Catalogs = {
  ru: {
    chat: 'Чат',
    chatMe: 'Вы',
    chatDriver: 'Водитель',
    chatRider: 'Пассажир',
    chatMessage: 'Сообщение',
    chatSend: 'Отправить',
    chatLength: 'Сообщение — от 1 до 1000 знаков.',
    chatClosed: 'Чат закрыт. Напишите в поддержку.',
    chatRemoved: 'Вы больше не на этом заказе.',
    chatNotSent: 'Не отправлено.',
    signInTitle: 'Вход',
    phone: 'Номер телефона',
    getCode: 'Получить код',
    code: 'Код из сообщения',
    codeByCall: 'Код продиктует звонок',
    codeBySms: 'Код отправлен в SMS',
    confirm: 'Подтвердить',
    resend: 'Отправить код ещё раз',
    resendIn: 'Новый код через {seconds} с',
    callMe: 'Позвоните мне',
    wrongCode: 'Неверный код.',
    codeExpired: 'Срок действия кода истёк. Получите новый код.',
    phoneTooShort: 'Проверьте номер: он слишком короткий.',
    countryNotServed: 'Мы пока не работаем с номерами этой страны.',
    tryAgainIn: 'Слишком много попыток. Повторите через {seconds} с.',
    loading: 'Загрузка…',
    offline: 'Нет связи с сервером. Проверьте интернет.',
    retry: 'Повторить',
    genericError: 'Не удалось выполнить запрос.',
    correlation: 'Код запроса: {id}',
    legalTitle: 'Условия сервиса',
    accept: 'Принимаю',
    signOut: 'Выйти',
    updateTitle: 'Обновите приложение',
    updateText: 'Эта версия больше не поддерживается. Установите новую версию из магазина приложений.'
  },
  uk: {
    chat: 'Чат',
    chatMe: 'Ви',
    chatDriver: 'Водій',
    chatRider: 'Пасажир',
    chatMessage: 'Повідомлення',
    chatSend: 'Надіслати',
    chatLength: 'Повідомлення — від 1 до 1000 знаків.',
    chatClosed: 'Чат закрито. Напишіть у підтримку.',
    chatRemoved: 'Ви більше не на цьому замовленні.',
    chatNotSent: 'Не надіслано.',
    signInTitle: 'Вхід',
    phone: 'Номер телефону',
    getCode: 'Отримати код',
    code: 'Код з повідомлення',
    codeByCall: 'Код продиктує дзвінок',
    codeBySms: 'Код надіслано в SMS',
    confirm: 'Підтвердити',
    resend: 'Надіслати код ще раз',
    resendIn: 'Новий код через {seconds} с',
    callMe: 'Зателефонуйте мені',
    wrongCode: 'Невірний код.',
    codeExpired: 'Термін дії коду минув. Отримайте новий код.',
    phoneTooShort: 'Перевірте номер: він закороткий.',
    countryNotServed: 'Ми поки не працюємо з номерами цієї країни.',
    tryAgainIn: 'Забагато спроб. Повторіть через {seconds} с.',
    loading: 'Завантаження…',
    offline: 'Немає зв’язку з сервером. Перевірте інтернет.',
    retry: 'Повторити',
    genericError: 'Не вдалося виконати запит.',
    correlation: 'Код запиту: {id}',
    legalTitle: 'Умови сервісу',
    accept: 'Приймаю',
    signOut: 'Вийти',
    updateTitle: 'Оновіть застосунок',
    updateText: 'Ця версія більше не підтримується. Встановіть нову версію з магазину застосунків.'
  },
  pl: {
    chat: 'Czat',
    chatMe: 'Ty',
    chatDriver: 'Kierowca',
    chatRider: 'Pasażer',
    chatMessage: 'Wiadomość',
    chatSend: 'Wyślij',
    chatLength: 'Wiadomość — od 1 do 1000 znaków.',
    chatClosed: 'Czat zamknięty. Napisz do pomocy.',
    chatRemoved: 'Nie jesteś już przy tym zleceniu.',
    chatNotSent: 'Nie wysłano.',
    signInTitle: 'Logowanie',
    phone: 'Numer telefonu',
    getCode: 'Pobierz kod',
    code: 'Kod z wiadomości',
    codeByCall: 'Kod poda połączenie głosowe',
    codeBySms: 'Kod wysłano SMS-em',
    confirm: 'Potwierdź',
    resend: 'Wyślij kod ponownie',
    resendIn: 'Nowy kod za {seconds} s',
    callMe: 'Zadzwońcie do mnie',
    wrongCode: 'Nieprawidłowy kod.',
    codeExpired: 'Kod wygasł. Pobierz nowy kod.',
    phoneTooShort: 'Sprawdź numer: jest za krótki.',
    countryNotServed: 'Nie obsługujemy jeszcze numerów z tego kraju.',
    tryAgainIn: 'Zbyt wiele prób. Spróbuj ponownie za {seconds} s.',
    loading: 'Ładowanie…',
    offline: 'Brak połączenia z serwerem. Sprawdź internet.',
    retry: 'Ponów',
    genericError: 'Nie udało się wykonać żądania.',
    correlation: 'Kod żądania: {id}',
    legalTitle: 'Warunki usługi',
    accept: 'Akceptuję',
    signOut: 'Wyloguj',
    updateTitle: 'Zaktualizuj aplikację',
    updateText: 'Ta wersja nie jest już obsługiwana. Zainstaluj nową wersję ze sklepu z aplikacjami.'
  }
};

/** The shared texts and the app's own, one catalog per language. */
export function withCommon(own: Catalogs): Catalogs {
  // An app's key with a shared key's name would silently change a shared screen (the legal "accept" once became
  // the driver's "accept the offer", #249): refuse it.
  const shadowed = Object.values(own).flatMap(catalog => Object.keys(catalog))
    .filter(key => key in commonTranslations.ru);
  if (shadowed.length > 0) throw new Error('App texts shadow shared ones: ' + [...new Set(shadowed)].join(', '));
  return {ru: {...commonTranslations.ru, ...own.ru}, uk: {...commonTranslations.uk, ...own.uk},
    pl: {...commonTranslations.pl, ...own.pl}};
}

/** Every catalog has every key of the others, and no empty text: a missing key fails here, not on a screen. */
export function validateCatalogs(catalogs: Catalogs): void {
  const keys = new Set<string>();
  for (const catalog of Object.values(catalogs)) Object.keys(catalog).forEach(key => keys.add(key));
  const problems: string[] = [];
  for (const [locale, catalog] of Object.entries(catalogs)) {
    for (const key of keys) {
      if (!catalog[key]) problems.push(locale + ' misses ' + key);
    }
  }
  if (problems.length > 0) throw new Error('Translation catalogs differ: ' + problems.join('; '));
}

export function translator(catalogs: Catalogs, locale: Locale): Translate {
  return (key, values = {}) => {
    const text = catalogs[locale][key] ?? catalogs.ru[key] ?? key;
    return text.replace(/\{(\w+)\}/g, (_, name: string) => String(values[name] ?? '{' + name + '}'));
  };
}
