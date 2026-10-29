package taxi.blizz.identity.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Where a one-time code is handed to the SMS or call provider after its challenge is committed: a virtual thread of
 * its own, so the request returns and gives its database connection back at once (audit 29.10.2026). Tests and the
 * sandbox send in the request ({@code blizz.otp.send-in-request}), so a code can be read right after asking for it.
 */
@Configuration(proxyBeanMethods = false)
class OtpSendConfiguration {

    static final String EXECUTOR = "otpSendExecutor";

    @Bean(name = EXECUTOR, destroyMethod = "")
    Executor otpSendExecutor(@Value("${blizz.otp.send-in-request:false}") boolean inRequest) {
        return of(inRequest);
    }

    static Executor of(boolean inRequest) {
        return inRequest ? Runnable::run : Executors.newVirtualThreadPerTaskExecutor();
    }
}
