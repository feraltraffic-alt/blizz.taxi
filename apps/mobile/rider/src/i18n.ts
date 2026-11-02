import {withCommon, type Catalogs} from '@blizz/mobile-ui';

export type {Locale} from '@blizz/mobile-ui';

/** The rider's own texts; the shared ones (sign-in, legal texts, states) come from @blizz/mobile-ui. */
export const translations: Catalogs = withCommon({
  ru: {
    newRide: 'Куда поедем?', here: 'Здесь', from: 'Откуда', to: 'Куда', choosePickup: 'Изменить «откуда»',
    chooseDropoff: 'Выбрать «куда»', pickupSearch: 'Поиск адреса подачи', dropoffSearch: 'Поиск адреса назначения',
    search: 'Найти', getPrice: 'Узнать цену', priceIs: 'Цена: {amount} {currency}', orderRide: 'Заказать',
    quoteExpired: 'Цена устарела. Узнайте цену снова.', outsideCities: 'Здесь мы пока не работаем.',
    hasDebt: 'Сначала погасите долг за прошлую поездку.', yourRide: 'Ваша поездка', cancelRide: 'Отменить поездку',
    orderMoved: 'Заказ изменился, пока вы его отменяли. Проверьте его состояние.', newRideAgain: 'Новая поездка',
    eta: 'Водитель будет через {minutes} мин', toProfile: 'Профиль', toRide: 'Поездка',
    status_SCHEDULED: 'Заказ на потом принят', status_AWAITING_PAYMENT: 'Ожидаем оплату',
    status_READY: 'Заказ принят', status_SEARCHING: 'Ищем водителя', status_ASSIGNED: 'Водитель едет к вам',
    status_IN_SERVICE: 'В пути', status_FULFILLED: 'Поездка завершена', status_CANCELLED: 'Заказ отменён',
    status_UNFULFILLED: 'Водителя не нашлось',
    profile: 'Профиль',
    accountState: 'Состояние аккаунта',
    deleteAccount: 'Удалить аккаунт',
    deleteCode: 'Код подтверждения удаления',
    confirmDeletion: 'Подтвердить удаление',
    deletionRequested: 'Запрос на удаление принят.'
  },
  uk: {
    newRide: 'Куди їдемо?', here: 'Тут', from: 'Звідки', to: 'Куди', choosePickup: 'Змінити «звідки»',
    chooseDropoff: 'Вибрати «куди»', pickupSearch: 'Пошук адреси подачі', dropoffSearch: 'Пошук адреси призначення',
    search: 'Знайти', getPrice: 'Дізнатися ціну', priceIs: 'Ціна: {amount} {currency}', orderRide: 'Замовити',
    quoteExpired: 'Ціна застаріла. Дізнайтеся ціну знову.', outsideCities: 'Тут ми поки не працюємо.',
    hasDebt: 'Спершу погасіть борг за минулу поїздку.', yourRide: 'Ваша поїздка', cancelRide: 'Скасувати поїздку',
    orderMoved: 'Замовлення змінилося, поки ви його скасовували. Перевірте його стан.', newRideAgain: 'Нова поїздка',
    eta: 'Водій буде за {minutes} хв', toProfile: 'Профіль', toRide: 'Поїздка',
    status_SCHEDULED: 'Замовлення на потім прийнято', status_AWAITING_PAYMENT: 'Очікуємо оплату',
    status_READY: 'Замовлення прийнято', status_SEARCHING: 'Шукаємо водія', status_ASSIGNED: 'Водій їде до вас',
    status_IN_SERVICE: 'У дорозі', status_FULFILLED: 'Поїздку завершено', status_CANCELLED: 'Замовлення скасовано',
    status_UNFULFILLED: 'Водія не знайшлося',
    profile: 'Профіль',
    accountState: 'Стан облікового запису',
    deleteAccount: 'Видалити обліковий запис',
    deleteCode: 'Код підтвердження видалення',
    confirmDeletion: 'Підтвердити видалення',
    deletionRequested: 'Запит на видалення прийнято.'
  },
  pl: {
    newRide: 'Dokąd jedziemy?', here: 'Tutaj', from: 'Skąd', to: 'Dokąd', choosePickup: 'Zmień „skąd”',
    chooseDropoff: 'Wybierz „dokąd”', pickupSearch: 'Szukaj adresu odbioru', dropoffSearch: 'Szukaj adresu docelowego',
    search: 'Szukaj', getPrice: 'Sprawdź cenę', priceIs: 'Cena: {amount} {currency}', orderRide: 'Zamów',
    quoteExpired: 'Cena jest nieaktualna. Sprawdź cenę ponownie.', outsideCities: 'Tu jeszcze nie działamy.',
    hasDebt: 'Najpierw spłać dług za poprzedni przejazd.', yourRide: 'Twój przejazd', cancelRide: 'Anuluj przejazd',
    orderMoved: 'Zamówienie zmieniło się w trakcie anulowania. Sprawdź jego stan.', newRideAgain: 'Nowy przejazd',
    eta: 'Kierowca będzie za {minutes} min', toProfile: 'Profil', toRide: 'Przejazd',
    status_SCHEDULED: 'Zamówienie na później przyjęte', status_AWAITING_PAYMENT: 'Czekamy na płatność',
    status_READY: 'Zamówienie przyjęte', status_SEARCHING: 'Szukamy kierowcy', status_ASSIGNED: 'Kierowca jedzie do Ciebie',
    status_IN_SERVICE: 'W drodze', status_FULFILLED: 'Przejazd zakończony', status_CANCELLED: 'Zamówienie anulowane',
    status_UNFULFILLED: 'Nie znaleziono kierowcy',
    profile: 'Profil',
    accountState: 'Stan konta',
    deleteAccount: 'Usuń konto',
    deleteCode: 'Kod potwierdzenia usunięcia',
    confirmDeletion: 'Potwierdź usunięcie',
    deletionRequested: 'Prośba o usunięcie została przyjęta.'
  }
});

export {validateCatalogs} from '@blizz/mobile-ui';
