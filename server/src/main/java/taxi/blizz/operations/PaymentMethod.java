package taxi.blizz.operations;

/**
 * How the passenger pays; card needs the payment hold flow of S-09 (section 16). SERVICE: the rider pays nothing and
 * the service pays the driver by the tariff — only for the follow-up of an interrupted trip (T-22); never chosen in a
 * request.
 */
public enum PaymentMethod {
    CASH,
    CARD,
    SERVICE
}
