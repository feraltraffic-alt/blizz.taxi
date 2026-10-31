package taxi.blizz.identity.internal;

import org.springframework.stereotype.Service;
import taxi.blizz.identity.ClientLookup;

/** See {@link ClientLookup}. */
@Service
class JdbcClientLookup implements ClientLookup {

    @Override
    public Lookup byPhone(String phone) {
        throw new UnsupportedOperationException("issue #176, part A");
    }
}
