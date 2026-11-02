import type {Catalogs} from '@blizz/web-ui';

export {validateCatalogs} from '@blizz/web-ui';

/** Russian by default; Ukrainian and Polish with the same keys (owner decision 27.10.2026). */
export const translations: Catalogs = {
  ru: {
    signIn: 'Войти', signInTitle: 'Вход оператора', login: 'Логин', password: 'Пароль',
    wrongCredentials: 'Неверный логин или пароль.', lockedOut: 'Слишком много попыток. Повторите через {seconds} с.',
    suspended: 'Учётная запись приостановлена.', genericError: 'Не удалось выполнить запрос.',
    correlation: 'Код запроса: {id}', passwordChange: 'Смена пароля',
    passwordChangeHint: 'Перед началом работы задайте свой пароль: не короче 12 символов.',
    currentPassword: 'Текущий пароль', newPassword: 'Новый пароль', savePassword: 'Сохранить пароль',
    passwordTooShort: 'Новый пароль должен быть не короче 12 символов.', wrongCurrentPassword: 'Текущий пароль неверен.',
    signOut: 'Выйти', loading: 'Загрузка…',
    newOrder: 'Новый заказ по телефону', city: 'Город', noRight: 'У вас нет права создавать заказы в этом городе.',
    callerPhone: 'Телефон звонящего', callerName: 'Имя звонящего', badPhone: 'Номер в формате +380XXXXXXXXX.',
    findCaller: 'Найти клиента', newCaller: 'Новый клиент', knownCaller: 'Клиент: {name}',
    pickup: 'Откуда', dropoff: 'Куда', search: 'Найти', vehicleClass: 'Класс авто', payment: 'Оплата',
    cash: 'Наличные', terminal: 'Терминал', comment: 'Комментарий', price: 'Рассчитать цену',
    priceIs: 'Цена: {amount} {currency}', create: 'Создать заказ', quoteExpired: 'Цена устарела. Рассчитайте снова.',
    cityPaused: 'Приём заказов в городе приостановлен.', cityClosed: 'Город сейчас не работает.',
    order: 'Заказ №{number}', status: 'Статус: {status}', cancel: 'Отменить заказ', reason: 'Причина отмены',
    orderMoved: 'Заказ изменился, пока вы его отменяли. Проверьте его состояние.', another: 'Новый заказ'
  },
  uk: {
    signIn: 'Увійти', signInTitle: 'Вхід оператора', login: 'Логін', password: 'Пароль',
    wrongCredentials: 'Невірний логін або пароль.', lockedOut: 'Забагато спроб. Повторіть через {seconds} с.',
    suspended: 'Обліковий запис призупинено.', genericError: 'Не вдалося виконати запит.',
    correlation: 'Код запиту: {id}', passwordChange: 'Зміна пароля',
    passwordChangeHint: 'Перед початком роботи задайте свій пароль: не коротше 12 символів.',
    currentPassword: 'Поточний пароль', newPassword: 'Новий пароль', savePassword: 'Зберегти пароль',
    passwordTooShort: 'Новий пароль має бути не коротше 12 символів.', wrongCurrentPassword: 'Поточний пароль невірний.',
    signOut: 'Вийти', loading: 'Завантаження…',
    newOrder: 'Нове замовлення телефоном', city: 'Місто', noRight: 'У вас немає права створювати замовлення в цьому місті.',
    callerPhone: 'Телефон абонента', callerName: 'Ім’я абонента', badPhone: 'Номер у форматі +380XXXXXXXXX.',
    findCaller: 'Знайти клієнта', newCaller: 'Новий клієнт', knownCaller: 'Клієнт: {name}',
    pickup: 'Звідки', dropoff: 'Куди', search: 'Знайти', vehicleClass: 'Клас авто', payment: 'Оплата',
    cash: 'Готівка', terminal: 'Термінал', comment: 'Коментар', price: 'Розрахувати ціну',
    priceIs: 'Ціна: {amount} {currency}', create: 'Створити замовлення', quoteExpired: 'Ціна застаріла. Розрахуйте знову.',
    cityPaused: 'Прийом замовлень у місті призупинено.', cityClosed: 'Місто зараз не працює.',
    order: 'Замовлення №{number}', status: 'Статус: {status}', cancel: 'Скасувати замовлення', reason: 'Причина скасування',
    orderMoved: 'Замовлення змінилося, поки ви його скасовували. Перевірте його стан.', another: 'Нове замовлення'
  },
  pl: {
    signIn: 'Zaloguj', signInTitle: 'Logowanie operatora', login: 'Login', password: 'Hasło',
    wrongCredentials: 'Nieprawidłowy login lub hasło.', lockedOut: 'Zbyt wiele prób. Spróbuj ponownie za {seconds} s.',
    suspended: 'Konto jest zawieszone.', genericError: 'Nie udało się wykonać żądania.',
    correlation: 'Kod żądania: {id}', passwordChange: 'Zmiana hasła',
    passwordChangeHint: 'Przed rozpoczęciem pracy ustaw własne hasło: co najmniej 12 znaków.',
    currentPassword: 'Obecne hasło', newPassword: 'Nowe hasło', savePassword: 'Zapisz hasło',
    passwordTooShort: 'Nowe hasło musi mieć co najmniej 12 znaków.', wrongCurrentPassword: 'Obecne hasło jest nieprawidłowe.',
    signOut: 'Wyloguj', loading: 'Ładowanie…',
    newOrder: 'Nowe zamówienie telefoniczne', city: 'Miasto', noRight: 'Nie masz prawa tworzyć zamówień w tym mieście.',
    callerPhone: 'Telefon dzwoniącego', callerName: 'Imię dzwoniącego', badPhone: 'Numer w formacie +48XXXXXXXXX.',
    findCaller: 'Znajdź klienta', newCaller: 'Nowy klient', knownCaller: 'Klient: {name}',
    pickup: 'Skąd', dropoff: 'Dokąd', search: 'Szukaj', vehicleClass: 'Klasa auta', payment: 'Płatność',
    cash: 'Gotówka', terminal: 'Terminal', comment: 'Komentarz', price: 'Oblicz cenę',
    priceIs: 'Cena: {amount} {currency}', create: 'Utwórz zamówienie', quoteExpired: 'Cena jest nieaktualna. Oblicz ponownie.',
    cityPaused: 'Przyjmowanie zamówień w mieście jest wstrzymane.', cityClosed: 'Miasto teraz nie działa.',
    order: 'Zamówienie nr {number}', status: 'Status: {status}', cancel: 'Anuluj zamówienie', reason: 'Powód anulowania',
    orderMoved: 'Zamówienie zmieniło się w trakcie anulowania. Sprawdź jego stan.', another: 'Nowe zamówienie'
  }
};
