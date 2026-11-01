package taxi.blizz.notification.internal;

import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.springframework.context.annotation.Profile;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccountDirectory;
import taxi.blizz.identity.PhoneNumber;
import taxi.blizz.platform.SubjectType;

/**
 * {@code GET /sandbox/v1/pushes?phone=…&after=…}: the pushes the server handed to the FAKE provider for the active
 * devices of the rider and/or driver with that phone, oldest first, at most {@value #LIMIT}. Sandbox only, no auth
 * (like {@code /sandbox/v1/otp}); only the end of a device token is shown. A device signed out since then is not
 * a device of the person any more, so its pushes are no longer listed.
 */
@RestController
@Profile("sandbox")
class SandboxPushController {

    static final int LIMIT = 100;
    static final int TOKEN_SUFFIX = 6;

    record Push(OffsetDateTime at, String tokenSuffix, String title, String body, Map<String, String> data) {
    }

    private final AccountDirectory accounts;
    private final PushDevices devices;
    private final FakePushProvider fake;

    SandboxPushController(AccountDirectory accounts, PushDevices devices, FakePushProvider fake) {
        this.accounts = accounts;
        this.devices = devices;
        this.fake = fake;
    }

    @GetMapping("/sandbox/v1/pushes")
    List<Push> pushes(@RequestParam String phone,
                      @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
                      OffsetDateTime after) {
        PhoneNumber number = PhoneNumber.parse(phone);
        Set<String> tokens = new HashSet<>();
        // The sandbox's first service (ADR 0016); the scenarios sign in there.
        java.util.UUID first = taxi.blizz.identity.Services.DEFAULT_ID;
        accounts.clientByPhone(first, number).ifPresent(id -> tokens.addAll(tokens(SubjectType.CLIENT, id)));
        accounts.driverByPhone(first, number).ifPresent(id -> tokens.addAll(tokens(SubjectType.DRIVER, id)));
        if (tokens.isEmpty()) {
            return List.of();
        }
        return fake.sent().stream()
                .filter(sent -> tokens.contains(sent.token()))
                .filter(sent -> after == null || sent.at().isAfter(after))
                .limit(LIMIT)
                .map(sent -> new Push(sent.at(), suffix(sent.token()), sent.title(), sent.body(), sent.data()))
                .toList();
    }

    private List<String> tokens(SubjectType type, UUID id) {
        return devices.targets(type.name(), id).stream().map(PushDevices.Target::token).toList();
    }

    /** The last {@value #TOKEN_SUFFIX} characters; a token that short shows only its second half. */
    static String suffix(String token) {
        int keep = token.length() > TOKEN_SUFFIX ? TOKEN_SUFFIX : token.length() / 2;
        return token.substring(token.length() - keep);
    }
}
