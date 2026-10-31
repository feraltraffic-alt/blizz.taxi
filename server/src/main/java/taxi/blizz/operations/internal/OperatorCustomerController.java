package taxi.blizz.operations.internal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.operations.CustomerLookup;

@RestController
@RequestMapping("/api/operator/v1/customers")
class OperatorCustomerController {

    private final CustomerLookup customers;

    OperatorCustomerController(CustomerLookup customers) {
        this.customers = customers;
    }

    /** Registry 22.2: one rider by their exact phone, audited (issue #176). */
    @GetMapping("/lookup")
    CustomerLookup.Customer lookup(AccessClaims claims, @RequestParam String phone) {
        return customers.lookup(claims.actor(), phone);
    }
}
