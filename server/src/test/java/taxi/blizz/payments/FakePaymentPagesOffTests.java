package taxi.blizz.payments;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestcontainersConfiguration;

/** On a server without FAKE merchants the fake provider's pages do not exist (audit of 28.10.2026). */
@SpringBootTest(properties = "blizz.payments.fake-merchants-allowed=false")
@Import(TestcontainersConfiguration.class)
class FakePaymentPagesOffTests {

    @Autowired WebApplicationContext context;

    @Test
    void theFakePagesAnswerNotFound() throws Exception {
        var mvc = MockMvcBuilders.webAppContextSetup(context).build();
        for (String path : new String[]{"/payments/v1/fake/verify", "/payments/v1/fake/pay"}) {
            int status = mvc.perform(post(path).contentType(MediaType.APPLICATION_FORM_URLENCODED)
                    .content("merchantAccount=x&orderReference=y")).andReturn().getResponse().getStatus();
            assertThat(status).as(path).isEqualTo(404);
        }
    }
}
