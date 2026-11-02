import {withCommon, type Catalogs} from '@blizz/mobile-ui';

export type {Locale} from '@blizz/mobile-ui';

/** The rider's own texts; the shared ones (sign-in, legal texts, states) come from @blizz/mobile-ui. */
export const translations: Catalogs = withCommon({
  ru: {
    profile: 'Профиль',
    accountState: 'Состояние аккаунта',
    deleteAccount: 'Удалить аккаунт',
    deleteCode: 'Код подтверждения удаления',
    confirmDeletion: 'Подтвердить удаление',
    deletionRequested: 'Запрос на удаление принят.'
  },
  uk: {
    profile: 'Профіль',
    accountState: 'Стан облікового запису',
    deleteAccount: 'Видалити обліковий запис',
    deleteCode: 'Код підтвердження видалення',
    confirmDeletion: 'Підтвердити видалення',
    deletionRequested: 'Запит на видалення прийнято.'
  },
  pl: {
    profile: 'Profil',
    accountState: 'Stan konta',
    deleteAccount: 'Usuń konto',
    deleteCode: 'Kod potwierdzenia usunięcia',
    confirmDeletion: 'Potwierdź usunięcie',
    deletionRequested: 'Prośba o usunięcie została przyjęta.'
  }
});

export {validateCatalogs} from '@blizz/mobile-ui';
