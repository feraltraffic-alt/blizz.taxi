package taxi.blizz.configuration.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.springframework.web.bind.annotation.*;
import taxi.blizz.configuration.RetentionSettings;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.RetentionPolicy;
import tools.jackson.databind.JsonNode;

@RestController
class RetentionController {
    private final RetentionSettings settings;
    private final StaffAccess staff;
    RetentionController(RetentionSettings settings,StaffAccess staff){this.settings=settings;this.staff=staff;}
    record Change(@NotNull UUID commandId,@NotNull @Min(0) Long expectedVersion,@NotNull JsonNode days,@NotBlank String reason){}
    @GetMapping("/api/admin/v1/retention")
    RetentionSettings.Version current(AccessClaims claims) {
        JdbcRetentionSettings.require(staff,claims.actor());return settings.current();
    }
    @PutMapping("/api/admin/v1/retention")
    RetentionSettings.Version change(AccessClaims claims,@Valid @RequestBody Change body) {
        JdbcRetentionSettings.require(staff,claims.actor());
        Map<String,Integer> days=new LinkedHashMap<>();
        if(!body.days().isObject()||body.days().size()!=RetentionPolicy.KINDS.size())throw invalid();
        for(String kind:RetentionPolicy.KINDS) {
            JsonNode value=body.days().path(kind);
            if(!value.isIntegralNumber()||!value.canConvertToInt()||value.asInt()<0)throw invalid();
            days.put(kind,value.asInt());
        }
        return settings.change(claims.actor(),body.commandId(),body.expectedVersion(),days,body.reason());
    }
    private static DomainException invalid(){return new DomainException(ErrorCode.VALIDATION_FAILED,"Each retention kind requires nonnegative integer days");}
}
