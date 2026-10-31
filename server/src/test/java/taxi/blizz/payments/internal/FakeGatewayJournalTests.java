package taxi.blizz.payments.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * Issue #146: the fault tests' fake bank remembers across a crash of the server. A charge it approved before the
 * crash is still approved when asked after it, and every request is in its journal to be counted.
 */
class FakeGatewayJournalTests {

    private static final Clock CLOCK = Clock.fixed(Instant.parse("2026-10-31T12:00:00Z"), ZoneOffset.UTC);
    private static final Merchant MERCHANT = new Merchant(UUID.randomUUID(), "FAKE", "journal-test", "example.test",
            "unit-secret", "UAH");
    private static final PaymentProvider.Customer CUSTOMER = new PaymentProvider.Customer(null, null, null, null,
            null);

    @Test
    void aChargeBeforeTheCrashIsKnownAfterIt(@TempDir Path dir) throws Exception {
        Path journal = dir.resolve("bank.jsonl");
        FakeProvider before = new FakeProvider(new FakeProvider.Gateway(a -> "unit-secret", CLOCK, journal), CLOCK,
                "http://example.test");
        assertThat(before.charge(MERCHANT, "tip-1", "token", 500, CUSTOMER, "Tip", null).providerStatus())
                .isEqualTo("Approved");

        FakeProvider after = new FakeProvider(new FakeProvider.Gateway(a -> "unit-secret", CLOCK, journal), CLOCK,
                "http://example.test");
        assertThat(after.checkStatus(MERCHANT, "tip-1").providerStatus()).isEqualTo("Approved");
        assertThat(Files.readAllLines(journal)).filteredOn(line -> line.contains("\"kind\":\"request\""))
                .as("the charge and the status check, each once").hasSize(2)
                .anySatisfy(line -> assertThat(line).contains("\"type\":\"CHARGE\"", "\"reference\":\"tip-1\""));
    }

    @Test
    void withoutAJournalTheBankForgets() {
        FakeProvider before = new FakeProvider(new FakeProvider.Gateway(a -> "unit-secret", CLOCK), CLOCK,
                "http://example.test");
        before.charge(MERCHANT, "tip-2", "token", 500, CUSTOMER, "Tip", null);
        FakeProvider after = new FakeProvider(new FakeProvider.Gateway(a -> "unit-secret", CLOCK), CLOCK,
                "http://example.test");
        assertThat(after.checkStatus(MERCHANT, "tip-2").providerStatus()).isNull();
    }
}
