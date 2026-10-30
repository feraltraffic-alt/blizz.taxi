package taxi.blizz.platform.internal;

import jakarta.validation.ConstraintViolationException;
import java.net.URI;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.HandlerMethodValidationException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import taxi.blizz.platform.CorrelationId;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.RateLimitedException;

/** Contract-shaped HTTP errors, without exposing exception details (REQ-API-07, REQ-SEC-08). */
@RestControllerAdvice
class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(ApiExceptionHandler.class);

    /** When a client may try again after a 503: a provider is down or its breaker is open (REQ-API-08). */
    private final java.time.Duration unavailableRetryAfter;

    ApiExceptionHandler(@org.springframework.beans.factory.annotation.Value(
            "${blizz.api.unavailable-retry-after:PT30S}") java.time.Duration unavailableRetryAfter) {
        this.unavailableRetryAfter = unavailableRetryAfter;
    }

    @ExceptionHandler(DomainException.class)
    ResponseEntity<Object> domain(DomainException exception, WebRequest request) {
        return respond(exception, exception.code(), exception.code().httpStatus(), new HttpHeaders(), request);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    ResponseEntity<Object> constraintViolation(ConstraintViolationException exception, WebRequest request) {
        ProblemDetail problem = problem(exception, ErrorCode.VALIDATION_FAILED, 400);
        problem.setProperty("field_errors", exception.getConstraintViolations().stream()
                .map(v -> Map.of("field", v.getPropertyPath().toString(),
                        "code", v.getConstraintDescriptor().getAnnotation().annotationType().getSimpleName()))
                .toList());
        return response(problem, new HttpHeaders());
    }

    @ExceptionHandler(Exception.class)
    ResponseEntity<Object> unexpected(Exception exception, WebRequest request) {
        return respond(exception, ErrorCode.INTERNAL_ERROR, 500, new HttpHeaders(), request);
    }

    @Override
    protected ResponseEntity<Object> handleExceptionInternal(
            Exception exception, Object body, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        ErrorCode code = status.value() == 404 ? ErrorCode.NOT_FOUND
                : status.is5xxServerError() ? ErrorCode.INTERNAL_ERROR : ErrorCode.VALIDATION_FAILED;
        return respond(exception, code, status.value(), headers, request);
    }

    private ResponseEntity<Object> respond(
            Exception exception, ErrorCode code, int status, HttpHeaders headers, WebRequest request) {
        ProblemDetail problem = problem(exception, code, status);
        if (exception instanceof taxi.blizz.platform.ConflictException conflict) {
            problem.setProperty("current_version", conflict.currentVersion());
        }
        if (exception instanceof taxi.blizz.platform.UpgradeRequiredException upgrade) {
            problem.setProperty("minimum_version", upgrade.minimumVersion());
        }
        java.time.Duration retryAfter = exception instanceof RateLimitedException limited ? limited.retryAfter()
                : status == 503 ? unavailableRetryAfter : null;
        if (retryAfter != null) {
            long seconds = retryAfter.toSeconds();
            if (retryAfter.getNano() != 0) seconds++; // Round up, never suggest an early retry.
            problem.setProperty("retryable", true);
            problem.setProperty("retry_after_seconds", seconds);
            headers = new HttpHeaders(headers);
            headers.set(HttpHeaders.RETRY_AFTER, Long.toString(seconds));
        }
        if (exception instanceof MethodArgumentNotValidException invalid) {
            problem.setProperty("field_errors", invalid.getBindingResult().getAllErrors().stream()
                    .map(error -> fieldError(error instanceof FieldError field ? field.getField() : "",
                            error)).toList());
        } else if (exception instanceof HandlerMethodValidationException invalid && status == 400) {
            problem.setProperty("field_errors", invalid.getParameterValidationResults().stream()
                    .flatMap(result -> result.getResolvableErrors().stream().map(error -> {
                        String name = result.getMethodParameter().getParameterName();
                        return fieldError(name != null ? name : "arg" + result.getMethodParameter().getParameterIndex(),
                                error);
                    })).toList());
        }
        // Keep Spring's transport headers (e.g. Allow) and observation/error handling.
        return super.handleExceptionInternal(exception, problem, problemHeaders(headers), HttpStatusCode.valueOf(problem.getStatus()), request);
    }

    private static ProblemDetail problem(Exception exception, ErrorCode code, int status) {
        String correlationId = CorrelationId.currentOrNew().toString();
        if (status >= 500) {
            log.error("HTTP error correlation_id={}", correlationId, exception);
        }
        ProblemDetail problem = ProblemDetail.forStatus(status);
        String words = code.name().toLowerCase(Locale.ROOT).replace('_', ' ');
        problem.setType(URI.create("https://errors.blizz.taxi/" + words.replace(' ', '-')));
        problem.setTitle(Character.toUpperCase(words.charAt(0)) + words.substring(1));
        problem.setProperty("code", code.name());
        problem.setProperty("correlation_id", correlationId);
        // No exception message, rejected value, retry guess or provider internals in the response.
        return problem;
    }

    private static Map<String, String> fieldError(String field, MessageSourceResolvable error) {
        String[] codes = error.getCodes();
        return Map.of("field", field, "code", codes != null && codes.length > 0 ? codes[codes.length - 1] : "Invalid");
    }

    private static HttpHeaders problemHeaders(HttpHeaders headers) {
        HttpHeaders result = new HttpHeaders();
        result.putAll(headers);
        result.setContentType(MediaType.APPLICATION_PROBLEM_JSON);
        return result;
    }

    private static ResponseEntity<Object> response(ProblemDetail problem, HttpHeaders headers) {
        return new ResponseEntity<>(problem, problemHeaders(headers), HttpStatusCode.valueOf(problem.getStatus()));
    }
}
