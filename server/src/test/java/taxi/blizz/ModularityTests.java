package taxi.blizz;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

/**
 * Module boundaries and absence of cycles are checked on every build (REQ-ENG-04).
 */
class ModularityTests {

    private final ApplicationModules modules = ApplicationModules.of(BlizzTaxiApplication.class);

    @Test
    void verifiesModularStructure() {
        modules.verify();
    }
}
