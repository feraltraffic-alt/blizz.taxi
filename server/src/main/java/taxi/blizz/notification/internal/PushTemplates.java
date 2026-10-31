package taxi.blizz.notification.internal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Optional;

/**
 * The texts of pushes in the languages of the apps (REQ-NTF-07). No names, phones, addresses or prices:
 * a push may show on a locked screen. The version goes with every notification, so a changed text can be told apart.
 */
final class PushTemplates {

    static final int VERSION = 1;

    record Text(String title, String body) {
    }

    private static Map<String, Text> texts(String ru, String ruBody, String uk, String ukBody, String pl,
                                           String plBody, String en, String enBody) {
        return Map.of("ru", new Text(ru, ruBody), "uk", new Text(uk, ukBody), "pl", new Text(pl, plBody),
                "en", new Text(en, enBody));
    }

    private static final Map<String, Map<String, Text>> TEMPLATES = Map.ofEntries(
            Map.entry("rider.driver-assigned", texts(
                    "Водитель найден", "Машина едет к вам",
                    "Водія знайдено", "Машина їде до вас",
                    "Kierowca znaleziony", "Samochód jedzie do Ciebie",
                    "Driver found", "Your car is on its way")),
            Map.entry("rider.driver-arrived", texts(
                    "Водитель на месте", "Машина ждёт вас",
                    "Водій на місці", "Машина чекає на вас",
                    "Kierowca na miejscu", "Samochód na Ciebie czeka",
                    "Your driver is here", "The car is waiting for you")),
            Map.entry("rider.trip-completed", texts(
                    "Поездка завершена", "Спасибо, что выбрали нас",
                    "Поїздку завершено", "Дякуємо, що обрали нас",
                    "Przejazd zakończony", "Dziękujemy za przejazd",
                    "Trip completed", "Thank you for riding with us")),
            Map.entry("rider.order-cancelled", texts(
                    "Заказ отменён", "Откройте приложение, чтобы узнать подробности",
                    "Замовлення скасовано", "Відкрийте застосунок, щоб дізнатися подробиці",
                    "Zamówienie anulowane", "Otwórz aplikację, aby zobaczyć szczegóły",
                    "Order cancelled", "Open the app for details")),
            Map.entry("rider.no-driver", texts(
                    "Машина не найдена", "Свободных машин нет. Попробуйте ещё раз",
                    "Машину не знайдено", "Вільних машин немає. Спробуйте ще раз",
                    "Brak samochodu", "Brak wolnych samochodów. Spróbuj ponownie",
                    "No car found", "No cars are free right now. Please try again")),
            Map.entry("rider.payment-declined", texts(
                    "Оплата картой не прошла", "Выберите другую карту или оплату наличными",
                    "Оплата карткою не пройшла", "Оберіть іншу картку або оплату готівкою",
                    "Płatność kartą odrzucona", "Wybierz inną kartę lub płatność gotówką",
                    "Card payment declined", "Choose another card or pay in cash")),
            Map.entry("rider.trip-interrupted", texts(
                    "Поездка прервана", "Мы ищем для вас другую машину",
                    "Поїздку перервано", "Ми шукаємо для вас іншу машину",
                    "Przejazd przerwany", "Szukamy dla Ciebie innego samochodu",
                    "Trip interrupted", "We are finding you another car")),
            Map.entry("rider.destination-changed", texts(
                    "Маршрут изменён", "Новый адрес и цена — в приложении",
                    "Маршрут змінено", "Нова адреса й ціна — у застосунку",
                    "Trasa zmieniona", "Nowy adres i cena są w aplikacji",
                    "Route changed", "The new destination and price are in the app")),
            Map.entry("driver.destination-changed", texts(
                    "Новый адрес назначения", "Откройте заказ, чтобы увидеть маршрут",
                    "Нова адреса призначення", "Відкрийте замовлення, щоб побачити маршрут",
                    "Nowy cel podróży", "Otwórz zlecenie, aby zobaczyć trasę",
                    "New destination", "Open the order to see the route")),
            Map.entry("driver.offer", texts(
                    "Новый заказ", "Примите заказ, пока предложение действует",
                    "Нове замовлення", "Прийміть замовлення, поки пропозиція діє",
                    "Nowe zlecenie", "Przyjmij zlecenie, zanim oferta wygaśnie",
                    "New order", "Accept the order before the offer runs out")),
            Map.entry("driver.order-cancelled", texts(
                    "Заказ отменён", "Заказ больше не нужно выполнять",
                    "Замовлення скасовано", "Замовлення більше не потрібно виконувати",
                    "Zlecenie anulowane", "Zlecenie nie jest już aktualne",
                    "Order cancelled", "You no longer need to take this order")),
            // {type} and {date}: see document(...) below.
            Map.entry("driver.document-expiring", texts(
                    "Документ скоро закончится", "{type} действует до {date}. Загрузите новый в приложении",
                    "Документ скоро закінчується", "{type} діє до {date}. Завантажте новий у застосунку",
                    "Dokument wkrótce wygaśnie", "{type}: ważność do {date}. Prześlij nowy w aplikacji",
                    "Document expires soon", "{type} is valid until {date}. Upload a new one in the app")));

    /** Names of driver document types in the push texts ({@code driver.DocumentType}). */
    private static final Map<String, Map<String, String>> DOCUMENT_TYPES = Map.of(
            "DRIVER_LICENSE", Map.of("ru", "Водительское удостоверение", "uk", "Посвідчення водія",
                    "pl", "Prawo jazdy", "en", "Driving licence"),
            "IDENTITY", Map.of("ru", "Удостоверение личности", "uk", "Посвідчення особи",
                    "pl", "Dokument tożsamości", "en", "Identity document"),
            "TAXI_PERMIT", Map.of("ru", "Разрешение на такси", "uk", "Дозвіл на таксі",
                    "pl", "Licencja taxi", "en", "Taxi permit"),
            "VEHICLE_REGISTRATION", Map.of("ru", "Техпаспорт", "uk", "Техпаспорт",
                    "pl", "Dowód rejestracyjny", "en", "Vehicle registration"),
            "INSURANCE", Map.of("ru", "Страховка", "uk", "Страховка",
                    "pl", "Ubezpieczenie", "en", "Insurance"),
            "OTHER", Map.of("ru", "Документ", "uk", "Документ", "pl", "Dokument", "en", "Document"));

    private static final DateTimeFormatter DAY_MONTH_YEAR = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    private PushTemplates() {
    }

    static boolean exists(String template) {
        return TEMPLATES.containsKey(template);
    }

    /** The text in the language, or in the fallback language; empty for an unknown template. */
    static Optional<Text> text(String template, String language, String fallback) {
        Map<String, Text> byLanguage = TEMPLATES.get(template);
        if (byLanguage == null) {
            return Optional.empty();
        }
        Text text = byLanguage.get(language);
        if (text == null) {
            text = byLanguage.getOrDefault(fallback, byLanguage.get("en"));
        }
        return Optional.of(text);
    }

    /**
     * The text of {@code driver.document-expiring} with the document type and its last day filled in, in the
     * language of {@code text} (dates as dd.MM.yyyy, in English as yyyy-MM-dd).
     */
    static Text document(Text text, String language, String documentType, LocalDate validTo) {
        Map<String, String> names = DOCUMENT_TYPES.getOrDefault(documentType, DOCUMENT_TYPES.get("OTHER"));
        String type = names.getOrDefault(language, names.get("en"));
        String date = "en".equals(language) ? validTo.toString() : DAY_MONTH_YEAR.format(validTo);
        return new Text(text.title().replace("{type}", type).replace("{date}", date),
                text.body().replace("{type}", type).replace("{date}", date));
    }

    static boolean supports(String language) {
        return language != null && TEMPLATES.get("driver.offer").containsKey(language);
    }
}
