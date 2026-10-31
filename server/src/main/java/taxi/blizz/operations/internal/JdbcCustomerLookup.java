package taxi.blizz.operations.internal;

import org.springframework.stereotype.Service;
import taxi.blizz.operations.CustomerLookup;
import taxi.blizz.platform.Actor;

/** See {@link CustomerLookup}. */
@Service
class JdbcCustomerLookup implements CustomerLookup {

    @Override
    public Customer lookup(Actor staff, String phone) {
        throw new UnsupportedOperationException("issue #176, part A");
    }
}
