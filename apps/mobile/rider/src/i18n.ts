export type Locale = 'ru' | 'uk' | 'pl';

/** Russian by default; Ukrainian and Polish with the same keys (owner decision 27.10.2026). */
export const translations: Record<Locale, Record<string, string>> = {
  ru: {
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
    profile: 'Профиль',
    accountState: 'Состояние аккаунта',
    signOut: 'Выйти',
    deleteAccount: 'Удалить аккаунт',
    deleteCode: 'Код подтверждения удаления',
    confirmDeletion: 'Подтвердить удаление',
    deletionRequested: 'Запрос на удаление принят.',
    updateTitle: 'Обновите приложение',
    updateText: 'Эта версия больше не поддерживается. Установите новую версию из магазина приложений.'
  },
  uk: {
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
    profile: 'Профіль',
    accountState: 'Стан облікового запису',
    signOut: 'Вийти',
    deleteAccount: 'Видалити обліковий запис',
    deleteCode: 'Код підтвердження видалення',
    confirmDeletion: 'Підтвердити видалення',
    deletionRequested: 'Запит на видалення прийнято.',
    updateTitle: 'Оновіть застосунок',
    updateText: 'Ця версія більше не підтримується. Встановіть нову версію з магазину застосунків.'
  },
  pl: {
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
    profile: 'Profil',
    accountState: 'Stan konta',
    signOut: 'Wyloguj',
    deleteAccount: 'Usuń konto',
    deleteCode: 'Kod potwierdzenia usunięcia',
    confirmDeletion: 'Potwierdź usunięcie',
    deletionRequested: 'Prośba o usunięcie została przyjęta.',
    updateTitle: 'Zaktualizuj aplikację',
    updateText: 'Ta wersja nie jest już obsługiwana. Zainstaluj nową wersję ze sklepu z aplikacjami.'
  }
};

/** Every catalog has every key of the others, and no empty text: a missing key fails here, not on a screen. */
export function validateCatalogs(catalogs: Record<Locale, Record<string, string>>): void {
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

export function translate(locale: Locale, key: string, values: Record<string, string | number> = {}): string {
  const text = translations[locale][key] ?? translations.ru[key] ?? key;
  return text.replace(/\{(\w+)\}/g, (_, name: string) => String(values[name] ?? '{' + name + '}'));
}
