export type Locale = 'ru' | 'uk' | 'pl';

/** Russian by default; Ukrainian and Polish with the same keys (owner decision 27.10.2026). */
export const translations: Record<Locale, Record<string, string>> = {
  ru: {
    title: 'Blizz — управление',
    signIn: 'Войти',
    signInTitle: 'Вход для сотрудников',
    login: 'Логин',
    password: 'Пароль',
    wrongCredentials: 'Неверный логин или пароль.',
    lockedOut: 'Слишком много попыток. Повторите через {seconds} с.',
    suspended: 'Учётная запись приостановлена.',
    genericError: 'Не удалось выполнить запрос.',
    correlation: 'Код запроса: {id}',
    passwordChange: 'Смена пароля',
    passwordChangeHint: 'Перед началом работы задайте свой пароль: не короче 12 символов.',
    currentPassword: 'Текущий пароль',
    newPassword: 'Новый пароль',
    savePassword: 'Сохранить пароль',
    passwordTooShort: 'Новый пароль должен быть не короче 12 символов.',
    wrongCurrentPassword: 'Текущий пароль неверен.',
    signOut: 'Выйти',
    profile: 'Профиль',
    role: 'Роль',
    permissions: 'Права',
    cities: 'Города',
    allCities: 'Все города',
    cityCount: 'Городов: {count}',
    loading: 'Загрузка…',
    roleSuperAdmin: 'Суперадминистратор',
    roleAdmin: 'Администратор',
    roleOperator: 'Оператор',
    rolePlatformOwner: 'Владелец платформы',
    navGeo: 'География',
    navStaff: 'Сотрудники',
    navOrders: 'Заказы',
    navReports: 'Отчёты',
    navSettings: 'Настройки',
    navFinance: 'Финансы',
    navLogs: 'Журналы',
    notReady: 'Этот раздел появится позже.'
  },
  uk: {
    title: 'Blizz — керування',
    signIn: 'Увійти',
    signInTitle: 'Вхід для співробітників',
    login: 'Логін',
    password: 'Пароль',
    wrongCredentials: 'Невірний логін або пароль.',
    lockedOut: 'Забагато спроб. Повторіть через {seconds} с.',
    suspended: 'Обліковий запис призупинено.',
    genericError: 'Не вдалося виконати запит.',
    correlation: 'Код запиту: {id}',
    passwordChange: 'Зміна пароля',
    passwordChangeHint: 'Перед початком роботи задайте свій пароль: не коротше 12 символів.',
    currentPassword: 'Поточний пароль',
    newPassword: 'Новий пароль',
    savePassword: 'Зберегти пароль',
    passwordTooShort: 'Новий пароль має бути не коротше 12 символів.',
    wrongCurrentPassword: 'Поточний пароль невірний.',
    signOut: 'Вийти',
    profile: 'Профіль',
    role: 'Роль',
    permissions: 'Права',
    cities: 'Міста',
    allCities: 'Усі міста',
    cityCount: 'Міст: {count}',
    loading: 'Завантаження…',
    roleSuperAdmin: 'Суперадміністратор',
    roleAdmin: 'Адміністратор',
    roleOperator: 'Оператор',
    rolePlatformOwner: 'Власник платформи',
    navGeo: 'Географія',
    navStaff: 'Співробітники',
    navOrders: 'Замовлення',
    navReports: 'Звіти',
    navSettings: 'Налаштування',
    navFinance: 'Фінанси',
    navLogs: 'Журнали',
    notReady: 'Цей розділ з’явиться пізніше.'
  },
  pl: {
    title: 'Blizz — zarządzanie',
    signIn: 'Zaloguj',
    signInTitle: 'Logowanie pracowników',
    login: 'Login',
    password: 'Hasło',
    wrongCredentials: 'Nieprawidłowy login lub hasło.',
    lockedOut: 'Zbyt wiele prób. Spróbuj ponownie za {seconds} s.',
    suspended: 'Konto jest zawieszone.',
    genericError: 'Nie udało się wykonać żądania.',
    correlation: 'Kod żądania: {id}',
    passwordChange: 'Zmiana hasła',
    passwordChangeHint: 'Przed rozpoczęciem pracy ustaw własne hasło: co najmniej 12 znaków.',
    currentPassword: 'Obecne hasło',
    newPassword: 'Nowe hasło',
    savePassword: 'Zapisz hasło',
    passwordTooShort: 'Nowe hasło musi mieć co najmniej 12 znaków.',
    wrongCurrentPassword: 'Obecne hasło jest nieprawidłowe.',
    signOut: 'Wyloguj',
    profile: 'Profil',
    role: 'Rola',
    permissions: 'Uprawnienia',
    cities: 'Miasta',
    allCities: 'Wszystkie miasta',
    cityCount: 'Miast: {count}',
    loading: 'Ładowanie…',
    roleSuperAdmin: 'Superadministrator',
    roleAdmin: 'Administrator',
    roleOperator: 'Operator',
    rolePlatformOwner: 'Właściciel platformy',
    navGeo: 'Geografia',
    navStaff: 'Pracownicy',
    navOrders: 'Zamówienia',
    navReports: 'Raporty',
    navSettings: 'Ustawienia',
    navFinance: 'Finanse',
    navLogs: 'Dzienniki',
    notReady: 'Ta sekcja pojawi się później.'
  }
};

/** Every catalog has every key of the others, and no empty text: a missing key fails here, not on a page. */
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
