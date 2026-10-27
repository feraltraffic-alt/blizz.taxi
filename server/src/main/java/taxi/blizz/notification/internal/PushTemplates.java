package taxi.blizz.notification.internal;

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
            Map.entry("driver.offer", texts(
                    "Новый заказ", "Примите заказ, пока предложение действует",
                    "Нове замовлення", "Прийміть замовлення, поки пропозиція діє",
                    "Nowe zlecenie", "Przyjmij zlecenie, zanim oferta wygaśnie",
                    "New order", "Accept the order before the offer runs out")),
            Map.entry("driver.order-cancelled", texts(
                    "Заказ отменён", "Заказ больше не нужно выполнять",
                    "Замовлення скасовано", "Замовлення більше не потрібно виконувати",
                    "Zlecenie anulowane", "Zlecenie nie jest już aktualne",
                    "Order cancelled", "You no longer need to take this order")));

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

    static boolean supports(String language) {
        return language != null && TEMPLATES.get("driver.offer").containsKey(language);
    }
}
