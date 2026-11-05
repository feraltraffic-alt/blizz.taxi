import type {Catalogs} from '@blizz/web-ui';

/** The texts of an order's evidence export (#430). */
export const evidence: Catalogs = {
  ru: {
    evidenceTitle: 'Доказательства для банка',
    evidenceReason: 'Причина выгрузки',
    evidenceExport: 'Выгрузить доказательства',
    evidenceSave: 'Сохранить файл доказательств',
    evidenceSummary: 'Сформировано {at} · операций по карте {operations} · сообщений чата {chat} · обращений {cases}',
    evidenceNeeds: 'Нужна причина выгрузки до 500 знаков.',
    evidenceFailed: 'Выгрузить не удалось.',
  },
  uk: {
    evidenceTitle: 'Докази для банку',
    evidenceReason: 'Причина вивантаження',
    evidenceExport: 'Вивантажити докази',
    evidenceSave: 'Зберегти файл доказів',
    evidenceSummary: 'Сформовано {at} · операцій за карткою {operations} · повідомлень чату {chat} · звернень {cases}',
    evidenceNeeds: 'Потрібна причина вивантаження до 500 знаків.',
    evidenceFailed: 'Вивантажити не вдалося.',
  },
  pl: {
    evidenceTitle: 'Dowody dla banku',
    evidenceReason: 'Powód eksportu',
    evidenceExport: 'Eksportuj dowody',
    evidenceSave: 'Zapisz plik dowodów',
    evidenceSummary: 'Utworzono {at} · operacji kartą {operations} · wiadomości czatu {chat} · zgłoszeń {cases}',
    evidenceNeeds: 'Potrzebny jest powód eksportu do 500 znaków.',
    evidenceFailed: 'Eksport się nie powiódł.',
  },
  en: {
    evidenceTitle: 'Evidence for the bank',
    evidenceReason: 'Reason for the export',
    evidenceExport: 'Export evidence',
    evidenceSave: 'Save evidence file',
    evidenceSummary: 'Created {at} · card operations {operations} · chat messages {chat} · support cases {cases}',
    evidenceNeeds: 'Needs a reason for the export of up to 500 characters.',
    evidenceFailed: 'Export failed.',
  },
};
