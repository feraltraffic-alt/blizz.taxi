import {withCommon, type Catalogs} from '@blizz/mobile-ui';

export type {Locale} from '@blizz/mobile-ui';

/** The driver's own texts; the shared ones (sign-in, legal texts, states) come from @blizz/mobile-ui. */
export const translations: Catalogs = withCommon({
  ru: {
    home: 'Работа',
    goOnline: 'Выйти на линию',
    goOffline: 'Уйти с линии',
    online: 'Вы на линии',
    offlineNow: 'Вы не на линии',
    connectionLost: 'Связь с сервером потеряна. Пробуем снова…',
    notAdmitted: 'Выход на линию откроется после допуска.',
    review: 'Проверка документов: {status}',
    noCities: 'Вас ещё не допустили ни в один город.',
    cities: 'Городов допуска: {count}',
    noVehicle: 'Нет одобренного автомобиля.',
    document: '{type}: {decision}',
    refused: 'Сервер не позволил выйти на линию: {reason}',
    otherDevice: 'Вы уже на линии на другом устройстве.',
    noCityHere: 'Здесь нет города, в котором вы допущены.',
    noLocation: 'Не удалось определить местоположение.',
    reviewNOT_SUBMITTED: 'не отправлены',
    reviewIN_REVIEW: 'на проверке',
    reviewCHANGES_REQUIRED: 'нужны исправления',
    reviewAPPROVED: 'допущен',
    reviewREJECTED: 'отказано',
    reviewSUSPENDED: 'приостановлен',
    reviewEXPIRED: 'истёк срок'
  },
  uk: {
    home: 'Робота',
    goOnline: 'Вийти на лінію',
    goOffline: 'Піти з лінії',
    online: 'Ви на лінії',
    offlineNow: 'Ви не на лінії',
    connectionLost: 'Зв’язок із сервером втрачено. Пробуємо знову…',
    notAdmitted: 'Вихід на лінію відкриється після допуску.',
    review: 'Перевірка документів: {status}',
    noCities: 'Вас ще не допустили до жодного міста.',
    cities: 'Міст допуску: {count}',
    noVehicle: 'Немає схваленого автомобіля.',
    document: '{type}: {decision}',
    refused: 'Сервер не дозволив вийти на лінію: {reason}',
    otherDevice: 'Ви вже на лінії на іншому пристрої.',
    noCityHere: 'Тут немає міста, у якому вас допущено.',
    noLocation: 'Не вдалося визначити місцезнаходження.',
    reviewNOT_SUBMITTED: 'не надіслано',
    reviewIN_REVIEW: 'на перевірці',
    reviewCHANGES_REQUIRED: 'потрібні виправлення',
    reviewAPPROVED: 'допущено',
    reviewREJECTED: 'відмовлено',
    reviewSUSPENDED: 'призупинено',
    reviewEXPIRED: 'минув строк'
  },
  pl: {
    home: 'Praca',
    goOnline: 'Rozpocznij pracę',
    goOffline: 'Zakończ pracę',
    online: 'Jesteś na linii',
    offlineNow: 'Nie jesteś na linii',
    connectionLost: 'Utracono połączenie z serwerem. Ponawiamy…',
    notAdmitted: 'Praca będzie możliwa po dopuszczeniu.',
    review: 'Weryfikacja dokumentów: {status}',
    noCities: 'Nie dopuszczono Cię jeszcze w żadnym mieście.',
    cities: 'Miast dopuszczenia: {count}',
    noVehicle: 'Brak zatwierdzonego samochodu.',
    document: '{type}: {decision}',
    refused: 'Serwer nie pozwolił rozpocząć pracy: {reason}',
    otherDevice: 'Jesteś już na linii na innym urządzeniu.',
    noCityHere: 'Tu nie ma miasta, w którym jesteś dopuszczony.',
    noLocation: 'Nie udało się ustalić lokalizacji.',
    reviewNOT_SUBMITTED: 'nie wysłano',
    reviewIN_REVIEW: 'w weryfikacji',
    reviewCHANGES_REQUIRED: 'wymagane poprawki',
    reviewAPPROVED: 'dopuszczony',
    reviewREJECTED: 'odmowa',
    reviewSUSPENDED: 'zawieszony',
    reviewEXPIRED: 'wygasło'
  }
});

export {validateCatalogs} from '@blizz/mobile-ui';
