package taxi.blizz.operations.internal;

import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;
import taxi.blizz.operations.RiderObligations;
import taxi.blizz.payments.CardTopUps;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/** See {@link RiderObligations}. */
@Service
class JdbcRiderObligations implements RiderObligations {

    @Override
    public List<Obligation> list(Actor rider) {
        return List.of();
    }

    @Override
    public CardTopUps.TopUp startRepayment(Actor rider, UUID commandId, UUID orderId, Long amountMinor) {
        throw new DomainException(ErrorCode.NOT_FOUND, "Nothing is owed on this order");
    }

    @Override
    public CardTopUps.TopUp payment(Actor rider, UUID paymentId) {
        throw new DomainException(ErrorCode.NOT_FOUND, "Payment not found");
    }
}
