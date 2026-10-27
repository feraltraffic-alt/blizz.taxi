package taxi.blizz.operations;

/**
 * How the passenger pays; card needs the payment hold flow of S-09 (section 16). SERVICE: the rider pays nothing and
 * the service pays the driver by the tariff — only for the follow-up of an interrupted trip (T-22); never chosen in a
 * request. TERMINAL: by card at the driver's own terminal, money to the driver like cash and the commission from
 * the driver's balance — only in phone orders, offered to drivers with a terminal (owner decision 27.10.2026).
 */
public enum PaymentMethod {
    CASH,
    CARD,
    SERVICE,
    TERMINAL
}
