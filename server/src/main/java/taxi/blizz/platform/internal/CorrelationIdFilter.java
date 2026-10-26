package taxi.blizz.platform.internal;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import taxi.blizz.platform.CorrelationId;

/** Takes {@code X-Correlation-Id} from the request (or generates one) and returns it (REQ-OBS-01). */
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
class CorrelationIdFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws ServletException, IOException {
        UUID id = parse(request.getHeader(CorrelationId.HEADER));
        response.setHeader(CorrelationId.HEADER, id.toString());
        try (CorrelationId.Scope ignored = CorrelationId.open(id)) {
            chain.doFilter(request, response);
        }
    }

    private static UUID parse(String header) {
        if (header != null) {
            try {
                return UUID.fromString(header.trim());
            } catch (IllegalArgumentException ignored) {
                // A malformed id from the client is replaced rather than trusted.
            }
        }
        return UUID.randomUUID();
    }
}
