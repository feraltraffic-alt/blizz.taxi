package taxi.blizz.finance.internal;

import org.springframework.stereotype.Service;
import taxi.blizz.finance.FareDeltas;

@Service
class JdbcFareDeltas implements FareDeltas {

    @Override
    public long post(Delta delta) {
        throw new UnsupportedOperationException("issue #142");
    }

    @Override
    public long refundObligation(java.util.UUID orderId) {
        return 0;
    }
}
