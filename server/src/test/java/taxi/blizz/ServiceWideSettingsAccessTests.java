package taxi.blizz;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.configuration.CancelReasons;
import taxi.blizz.configuration.FeatureFlags;
import taxi.blizz.configuration.Integrations;
import taxi.blizz.configuration.LegalDocuments;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.finance.DriverBalances;
import taxi.blizz.finance.DriverDebts;
import taxi.blizz.operatorbonus.OperatorBonuses;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;

/**
 * Issue #215, access rule: a setting of the whole taxi service is changed only by its super admin or by staff holding
 * the permission in every city of the service. Staff with every permission in one city are refused each change.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class ServiceWideSettingsAccessTests {

    static final String[] RIGHTS = {ServiceSettings.MANAGE_PERMISSION, FeatureFlags.MANAGE_PERMISSION,
            LegalDocuments.MANAGE_PERMISSION, Integrations.MANAGE_PERMISSION, DriverDebts.MANAGE_PERMISSION,
            OperatorBonuses.MANAGE_PERMISSION};

    @Autowired ServiceSettings settings;
    @Autowired FeatureFlags flags;
    @Autowired LegalDocuments legal;
    @Autowired Integrations integrations;
    @Autowired CancelReasons reasons;
    @Autowired DriverDebts debts;
    @Autowired DriverBalances balances;
    @Autowired OperatorBonuses bonuses;
    @Autowired JdbcClient jdbc;

    private Actor staffOfOneCity() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, city_scope, state,
                                                created_at, updated_at)
                        values (:id, :login, 'One city', 'ADMIN', :permissions, false, :scope, 'ACTIVE', now(),
                                now())""")
                .param("id", id).param("login", "one-city-" + id).param("permissions", RIGHTS)
                .param("scope", new UUID[] {UUID.randomUUID()}).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private static void refused(String what, ThrowingCallable change) {
        assertThatThrownBy(change).as(what).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.ACCESS_DENIED);
    }

    @Test
    void staffOfOneCityChangeNoSettingOfTheWholeService() {
        Actor one = staffOfOneCity();
        UUID id = UUID.randomUUID();
        refused("service settings", () -> settings.change(one, id, 0, settings.of(one).settings(), "x"));
        refused("a feature flag", () -> flags.change(one, id, FeatureFlags.Flag.CARD_PAYMENTS.key(), 0, true, "x"));
        LegalDocuments.Draft draft = new LegalDocuments.Draft(Map.of("uk", "x"), false, null);
        refused("a legal draft", () -> legal.createDraft(one, id, LegalDocuments.Audience.RIDER,
                LegalDocuments.Kind.PRIVACY_NOTICE, draft));
        refused("a legal draft update", () -> legal.updateDraft(one, id, UUID.randomUUID(), 0, draft));
        refused("a legal publication", () -> legal.publish(one, id, UUID.randomUUID(), 0));
        refused("the keys", () -> integrations.change(one, id, "password",
                List.of(new Integrations.Change(Integrations.MAPS_PROVIDER, "OSM")), "x"));
        refused("a key check", () -> integrations.check(one, Integrations.MAPS));
        refused("a cancel reason", () -> reasons.create(one, id, new CancelReasons.Draft(
                CancelReasons.Audience.RIDER, "ONE_CITY", Map.of("uk", "x"), null, true, 1), "x"));
        refused("a cancel reason update", () -> reasons.update(one, id, UUID.randomUUID(), 0,
                new CancelReasons.Draft(null, null, Map.of("uk", "x"), null, true, 1), "x"));
        refused("a debt limit", () -> debts.setLimit(one, id, "UAH", 100L, 0, "x"));
        refused("a transfer rule", () -> balances.setTransferRule(one, id,
                new DriverBalances.TransferRule("UAH", true, 100, 1000, 0, 0), 0, "x"));
        refused("operator bonus rules", () -> bonuses.changeSettings(one, id, 0,
                new OperatorBonuses.Settings(1, 1, true, 1, List.of()), "x"));
    }
}
