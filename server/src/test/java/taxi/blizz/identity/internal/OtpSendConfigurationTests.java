package taxi.blizz.identity.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

/** Audit 29.10.2026: outside tests and the sandbox a code is sent on a thread of its own, not the request's. */
class OtpSendConfigurationTests {

    @Test
    void codesLeaveTheRequestThreadUnlessTheyAreSentInTheRequest() throws Exception {
        Thread request = Thread.currentThread();
        CompletableFuture<Thread> sentOn = new CompletableFuture<>();
        OtpSendConfiguration.of(false).execute(() -> sentOn.complete(Thread.currentThread()));
        Thread sender = sentOn.get(5, TimeUnit.SECONDS);
        assertThat(sender).isNotSameAs(request);
        assertThat(sender.isVirtual()).isTrue();

        CompletableFuture<Thread> inRequest = new CompletableFuture<>();
        OtpSendConfiguration.of(true).execute(() -> inRequest.complete(Thread.currentThread()));
        assertThat(inRequest.getNow(null)).isSameAs(request);
    }
}
