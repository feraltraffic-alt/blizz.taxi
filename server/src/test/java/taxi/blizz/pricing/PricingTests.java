package taxi.blizz.pricing;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.math.BigDecimal;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.transaction.IllegalTransactionStateException;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.TariffService.Change;
import taxi.blizz.pricing.TariffService.Draft;
import taxi.blizz.pricing.TariffService.Revision;
import taxi.blizz.pricing.TariffService.Terms;
import taxi.blizz.pricing.TariffService.VehicleClassDraft;

@SpringBootTest
@Import({TestcontainersConfiguration.class, PricingTests.Fakes.class})
class PricingTests {
    private static final Instant NOW = Instant.parse("2026-10-26T12:00:00Z");
    private static final Terms TERMS = new Terms(2000, new BigDecimal("1000"), new BigDecimal("100"), 5000,
            3, new BigDecimal("100"), 500, new BigDecimal("0.15"));
    private static final Actor PAYER = new Actor(SubjectType.CLIENT, UUID.randomUUID());

    @Autowired TariffService tariffs;
    @Autowired QuoteService quotes;
    @Autowired JdbcClient jdbc;
    @Autowired TestClock clock;
    @Autowired FakeRoutes routes;
    @Autowired TransactionTemplate tx;
    @Autowired IdempotentCommands commands;
    Actor manager;
    UUID city;
    UUID classId;
    List<UUID> cities = new ArrayList<>();
    List<UUID> staffIds = new ArrayList<>();

    @BeforeEach
    void setUp() {
        clock.current = NOW;
        routes.calls.set(0);
        routes.next = new RouteEstimator.Estimate(7500, 900);
        manager = staff("ACTIVE", TariffService.MANAGE_PERMISSION);
        city = city("UAH");
        classId = vehicleClass(city);
    }

    @AfterEach
    void cleanUp() {
        // Module-owned test data only. TRUNCATE bypasses the deliberate published-tariff DELETE guard.
        jdbc.sql("truncate quote, tariff_version, vehicle_class").update();
        for (UUID id : cities) {
            jdbc.sql("delete from city where id = :id").param("id", id).update();
        }
    }

    @Test
    void quoteStoresExactPriceRouteTermsAndFiveMinuteExpiry() {
        Revision tariff = published(TERMS);
        QuoteService.Request request = request(PAYER);
        UUID commandId = UUID.randomUUID();
        QuoteService.Quote quote = quotes.create(commandId, request);
        assertThat(quote.amountMinor()).isEqualTo(11000);
        assertThat(quote.currency()).isEqualTo("UAH");
        assertThat(quote.tariffVersionId()).isEqualTo(tariff.id());
        assertThat(quote.pricingPolicyVersion()).isEqualTo(1);
        assertThat(quote.terms().commissionRate()).isEqualByComparingTo("0.15");
        assertThat(quote.terms().freeWaitingMinutes()).isEqualTo(3);
        assertThat(quote.terms().cancellationFeeMinor()).isEqualTo(500);
        assertThat(quote.request()).isEqualTo(request);
        assertThat(quote.route()).isEqualTo(new RouteEstimator.Estimate(7500, 900));
        assertThat(quote.expiresAt()).isEqualTo(NOW.plusSeconds(300));
        assertThat(quote.fingerprint()).hasSize(64).isEqualTo(request.fingerprint());
        routes.next = new RouteEstimator.Estimate(9000, 1200);
        assertThat(quotes.create(commandId, request)).isEqualTo(quote);
        assertThat(routes.calls).hasValue(2);
    }

    @Test
    void oldQuoteKeepsItsTermsAfterArchivingAndPublishingANewTariff() {
        Revision original = published(TERMS);
        QuoteService.Quote old = quotes.create(UUID.randomUUID(), request(PAYER));
        tariffs.archive(change(original));
        Terms nextTerms = new Terms(4000, new BigDecimal("2000"), new BigDecimal("200"), 5000,
                0, BigDecimal.ZERO, 0, new BigDecimal("0.30"));
        Revision next = published(nextTerms);
        QuoteService.Quote latest = quotes.create(UUID.randomUUID(), request(PAYER));
        assertThat(latest.tariffVersionId()).isEqualTo(next.id());
        assertThat(latest.amountMinor()).isEqualTo(22000);
        QuoteService.Quote consumed = quotes.consume(old.id(), PAYER, old.fingerprint());
        assertThat(consumed).isEqualTo(old);
        assertThat(consumed.amountMinor()).isEqualTo(11000);
        assertThat(consumed.terms().commissionRate()).isEqualByComparingTo("0.15");
    }

    @Test
    void overlappingRangesAreRejectedButAdjacentRangesAreAllowed() {
        Revision first = tariffs.publish(change(draft(TERMS, NOW.minusSeconds(3600), NOW.plusSeconds(60))));
        reject(() -> tariffs.publish(change(draft(TERMS, NOW, NOW.plusSeconds(3600)))), ErrorCode.STATE_CONFLICT);
        assertThat(tariffs.publish(change(draft(TERMS, NOW.plusSeconds(60), null))).state()).isEqualTo("PUBLISHED");
        assertThat(first.state()).isEqualTo("PUBLISHED");
    }

    @Test
    void publishedVersionsAreImmutableEvenForDirectSql() {
        Revision published = published(TERMS);
        assertThatThrownBy(() -> jdbc.sql("update tariff_version set pickup_minor = 999 where id = :id")
                .param("id", published.id()).update()).isInstanceOf(DataIntegrityViolationException.class);
        assertThatThrownBy(() -> jdbc.sql("delete from tariff_version where id = :id")
                .param("id", published.id()).update()).isInstanceOf(DataIntegrityViolationException.class);
        assertThat(jdbc.sql("select pickup_minor from tariff_version where id = :id")
                .param("id", published.id()).query(Long.class).single()).isEqualTo(2000);
        reject(() -> tariffs.publish(change(published)), ErrorCode.STATE_CONFLICT);
    }

    @Test
    void wrongOwnerFingerprintAndRepeatedConsumptionAreRefused() {
        published(TERMS);
        QuoteService.Quote quote = quotes.create(UUID.randomUUID(), request(PAYER));
        reject(() -> quotes.consume(quote.id(), new Actor(SubjectType.CLIENT, UUID.randomUUID()), quote.fingerprint()),
                ErrorCode.QUOTE_MISMATCH);
        reject(() -> quotes.consume(quote.id(), new Actor(SubjectType.DRIVER, PAYER.id()), quote.fingerprint()),
                ErrorCode.QUOTE_MISMATCH);
        reject(() -> quotes.consume(quote.id(), PAYER, "wrong fingerprint"), ErrorCode.QUOTE_MISMATCH);
        reject(() -> quotes.consume(UUID.randomUUID(), PAYER, quote.fingerprint()), ErrorCode.QUOTE_MISMATCH);
        assertThat(quotes.consume(quote.id(), PAYER, quote.fingerprint())).isEqualTo(quote);
        reject(() -> quotes.consume(quote.id(), PAYER, quote.fingerprint()), ErrorCode.QUOTE_EXPIRED);
        assertThat(audits(quote.id(), "quote.consume")).isZero();
    }

    @Test
    void expiryBoundaryIsExclusiveAndFailedConsumptionLeavesQuoteUnused() {
        published(TERMS);
        QuoteService.Quote quote = quotes.create(UUID.randomUUID(), request(PAYER));
        clock.current = quote.expiresAt();
        reject(() -> quotes.consume(quote.id(), PAYER, quote.fingerprint()), ErrorCode.QUOTE_EXPIRED);
        clock.current = quote.expiresAt().plusSeconds(1);
        reject(() -> quotes.consume(quote.id(), PAYER, quote.fingerprint()), ErrorCode.QUOTE_EXPIRED);
        assertThat(jdbc.sql("select consumed_at is null from quote where id = :id")
                .param("id", quote.id()).query(Boolean.class).single()).isTrue();
        assertThat(audits(quote.id(), "quote.consume")).isZero();
    }

    @Test
    void orderTransactionRollbackRestoresQuoteAndCommandReplayDoesNotConsumeAgain() {
        published(TERMS);
        QuoteService.Quote quote = quotes.create(UUID.randomUUID(), request(PAYER));
        assertThatThrownBy(() -> tx.executeWithoutResult(status -> {
            quotes.consume(quote.id(), PAYER, quote.fingerprint());
            throw new IllegalStateException("Synthetic order failure");
        })).isInstanceOf(IllegalStateException.class);
        assertThat(audits(quote.id(), "quote.consume")).isZero();
        assertThat(jdbc.sql("select consumed_at is null from quote where id = :id")
                .param("id", quote.id()).query(Boolean.class).single()).isTrue();
        CommandKey key = new CommandKey(PAYER, "synthetic.order.create", UUID.randomUUID());
        UUID order = commands.execute(key, quote.id(), UUID.class, () -> {
            quotes.consume(quote.id(), PAYER, quote.fingerprint());
            return UUID.randomUUID();
        });
        assertThat(commands.execute(key, quote.id(), UUID.class, () -> {
            throw new AssertionError("Order command must replay without consuming again");
        })).isEqualTo(order);
        assertThat(audits(quote.id(), "quote.consume")).isZero();
    }

    @Test
    void exactlyOneConcurrentConsumptionSucceeds() throws Exception {
        published(TERMS);
        QuoteService.Quote quote = quotes.create(UUID.randomUUID(), request(PAYER));
        List<Boolean> outcomes = race(List.of(
                () -> quotes.consume(quote.id(), PAYER, quote.fingerprint()),
                () -> quotes.consume(quote.id(), PAYER, quote.fingerprint())), ErrorCode.QUOTE_EXPIRED);
        assertThat(outcomes).containsExactlyInAnyOrder(true, false);
        assertThat(audits(quote.id(), "quote.consume")).isZero();
    }

    @Test
    void exactlyOneConcurrentOverlappingPublicationSucceeds() throws Exception {
        Revision a = draft(TERMS, NOW.minusSeconds(1), null);
        Revision b = draft(TERMS, NOW, null);
        assertThat(race(List.of(() -> tariffs.publish(change(a)), () -> tariffs.publish(change(b))),
                ErrorCode.STATE_CONFLICT)).containsExactlyInAnyOrder(true, false);
    }

    @Test
    void concurrentPublishAndArchiveOfOneVersionRespectVersionAndLockOrder() throws Exception {
        Revision draft = draft(TERMS, NOW, null);
        assertThat(race(List.of(() -> tariffs.publish(change(draft)), () -> tariffs.archive(change(draft))),
                ErrorCode.STATE_CONFLICT, ErrorCode.VERSION_CONFLICT)).containsExactlyInAnyOrder(true, false);
    }

    @Test
    void staffCommandsReplayAuditAndRejectStaleVersions() {
        Draft draftCommand = draftCommand(TERMS, NOW, null);
        Revision draft = tariffs.createDraft(draftCommand);
        assertThat(tariffs.createDraft(draftCommand)).isEqualTo(draft);
        Change publish = change(draft);
        Revision first = tariffs.publish(publish);
        assertThat(tariffs.publish(publish)).isEqualTo(first);
        reject(() -> tariffs.archive(change(draft)), ErrorCode.VERSION_CONFLICT);
        tariffs.archive(change(first));
        assertThat(audits(classId, "vehicleClass.create")).isEqualTo(1);
        assertThat(audits(draft.id(), "tariff.createDraft")).isEqualTo(1);
        assertThat(audits(draft.id(), "tariff.publish")).isEqualTo(1);
        assertThat(audits(draft.id(), "tariff.archive")).isEqualTo(1);
        reject(() -> tariffs.publish(new Change(publish.commandId(), manager, draft.id(), 1, publish.reason())),
                ErrorCode.IDEMPOTENCY_CONFLICT);
    }

    enum StaffCommand {
        VEHICLE_CLASS, DRAFT, PUBLISH, ARCHIVE
    }

    @ParameterizedTest
    @EnumSource(StaffCommand.class)
    void staffPermissionIsCheckedForEveryCommandAndAgainOnReplay(StaffCommand operation) {
        Revision tariff = draft(TERMS, NOW, null);
        if (operation == StaffCommand.ARCHIVE) {
            tariff = tariffs.publish(change(tariff));
        }
        Revision target = tariff;
        Actor missing = staff("ACTIVE");
        Actor suspended = staff("SUSPENDED", TariffService.MANAGE_PERMISSION);
        for (Actor denied : List.of(missing, suspended, new Actor(SubjectType.STAFF, UUID.randomUUID()), PAYER)) {
            reject(() -> staffCommand(operation, denied, UUID.randomUUID(), target), ErrorCode.ACCESS_DENIED);
        }
        UUID commandId = UUID.randomUUID();
        Revision first = staffCommand(operation, manager, commandId, target);
        jdbc.sql("update staff_user set permissions = '{}' where id = :id").param("id", manager.id()).update();
        reject(() -> staffCommand(operation, manager, commandId, target), ErrorCode.ACCESS_DENIED);
        jdbc.sql("update staff_user set permissions = :permissions, state = 'SUSPENDED' where id = :id")
                .param("permissions", new String[]{TariffService.MANAGE_PERMISSION}).param("id", manager.id()).update();
        reject(() -> staffCommand(operation, manager, commandId, target), ErrorCode.ACCESS_DENIED);
        assertThat(first).isNotNull();
    }

    @Test
    void quotesSelectTheEffectiveVersionAndRefuseInactiveClasses() {
        Revision old = tariffs.publish(change(draft(TERMS, NOW.minusSeconds(3600), NOW)));
        Revision current = tariffs.publish(change(draft(TERMS, NOW, null)));
        assertThat(quotes.create(UUID.randomUUID(), request(PAYER)).tariffVersionId()).isEqualTo(current.id());
        assertThat(current.id()).isNotEqualTo(old.id());
        jdbc.sql("update vehicle_class set active = false where id = :id").param("id", classId).update();
        reject(() -> quotes.create(UUID.randomUUID(), request(PAYER)), ErrorCode.NOT_FOUND);
    }

    @Test
    void currenciesAreMinorUnitsWithoutAssumingTwoDecimals() {
        city = city("JPY");
        classId = vehicleClass(city);
        tariffs.publish(change(tariffs.createDraft(new Draft(UUID.randomUUID(), manager, 0, city, classId, "JPY",
                NOW, null, TERMS, "Synthetic yen tariff"))));
        assertThat(quotes.create(UUID.randomUUID(), request(PAYER)).currency()).isEqualTo("JPY");
        assertThat(quotes.create(UUID.randomUUID(), request(PAYER)).amountMinor()).isEqualTo(11000);
    }

    @Test
    void badTermsRangesCurrencyAndCrossCityClassAreRejected() {
        Terms negative = new Terms(-1, BigDecimal.ZERO, BigDecimal.ZERO, 0, 0, BigDecimal.ZERO, 0, BigDecimal.ZERO);
        reject(() -> draft(negative, NOW, null), ErrorCode.VALIDATION_FAILED);
        reject(() -> draft(TERMS, NOW, NOW), ErrorCode.VALIDATION_FAILED);
        reject(() -> tariffs.createDraft(new Draft(UUID.randomUUID(), manager, 0, city, classId, "USD",
                NOW, null, TERMS, "Wrong city currency")), ErrorCode.VALIDATION_FAILED);
        UUID otherCity = city("UAH");
        reject(() -> tariffs.createDraft(new Draft(UUID.randomUUID(), manager, 0, otherCity, classId, "UAH",
                NOW, null, TERMS, "Wrong class city")), ErrorCode.NOT_FOUND);
        reject(() -> tariffs.createVehicleClass(new VehicleClassDraft(UUID.randomUUID(), manager, 0,
                city, "STANDARD", "Duplicate", "test")), ErrorCode.STATE_CONFLICT);
    }

    @Test
    void fingerprintsBindPointsCityClassAndPayerAndCannotBeReusedForAnotherRequest() {
        QuoteService.Request request = request(PAYER);
        assertThat(new QuoteService.Request(city, classId, request.dropOff(), request.pickup(), PAYER).fingerprint())
                .isNotEqualTo(request.fingerprint());
        assertThat(request(new Actor(SubjectType.CLIENT, UUID.randomUUID())).fingerprint())
                .isNotEqualTo(request.fingerprint());
        published(TERMS);
        UUID commandId = UUID.randomUUID();
        quotes.create(commandId, request);
        QuoteService.Request changed = new QuoteService.Request(city, classId, request.dropOff(), request.pickup(), PAYER);
        reject(() -> quotes.create(commandId, changed), ErrorCode.IDEMPOTENCY_CONFLICT);
    }


    @Test
    void quoteLifecycleUsesTheQuoteRowWithoutWritingAuditRecords() {
        published(TERMS);
        QuoteService.Quote quote = quotes.create(UUID.randomUUID(), request(PAYER));
        assertThat(quoteAuditCount(quote.id())).isZero();
        assertThat(jdbc.sql("select consumed_at is null from quote where id = :id")
                .param("id", quote.id()).query(Boolean.class).single()).isTrue();

        assertThat(quotes.consume(quote.id(), PAYER, quote.fingerprint())).isEqualTo(quote);

        assertThat(quoteAuditCount(quote.id())).isZero();
        assertThat(jdbc.sql("select consumed_at is not null from quote where id = :id")
                .param("id", quote.id()).query(Boolean.class).single()).isTrue();
    }

    @Test
    void quoteCreationRefusesAnExistingTransactionBeforeCallingTheEstimator() {
        published(TERMS);
        UUID commandId = UUID.randomUUID();
        assertThatThrownBy(() -> tx.executeWithoutResult(status -> {
            assertThat(TransactionSynchronizationManager.isActualTransactionActive()).isTrue();
            quotes.create(commandId, request(PAYER));
        })).isInstanceOf(IllegalTransactionStateException.class);
        assertThat(routes.calls).hasValue(0);
        assertThat(jdbc.sql("select count(*) from command_receipt where command_id = :id")
                .param("id", commandId).query(Long.class).single()).isZero();
    }

    private long quoteAuditCount(UUID id) {
        return jdbc.sql("select count(*) from audit_log where resource_type = 'quote' and resource_id = :id")
                .param("id", id.toString()).query(Long.class).single();
    }

    private Revision staffCommand(StaffCommand operation, Actor actor, UUID commandId, Revision target) {
        return switch (operation) {
            case VEHICLE_CLASS -> tariffs.createVehicleClass(new VehicleClassDraft(commandId, actor, 0, city,
                    "class-" + commandId, "Synthetic", "Permission test"));
            case DRAFT -> tariffs.createDraft(new Draft(commandId, actor, 0, city, classId, "UAH",
                    NOW, null, TERMS, "Permission test"));
            case PUBLISH -> tariffs.publish(new Change(commandId, actor, target.id(), target.version(), "Permission test"));
            case ARCHIVE -> tariffs.archive(new Change(commandId, actor, target.id(), target.version(), "Permission test"));
        };
    }

    private List<Boolean> race(List<Callable<?>> actions, ErrorCode... acceptedErrors) throws Exception {
        CountDownLatch ready = new CountDownLatch(actions.size());
        CountDownLatch start = new CountDownLatch(1);
        try (var pool = Executors.newFixedThreadPool(actions.size())) {
            var results = actions.stream().map(action -> pool.submit(() -> {
                ready.countDown();
                if (!start.await(10, TimeUnit.SECONDS)) {
                    throw new AssertionError("Start timeout");
                }
                try {
                    action.call();
                    return true;
                } catch (DomainException conflict) {
                    assertThat(conflict.code()).isIn((Object[]) acceptedErrors);
                    return false;
                }
            })).toList();
            assertThat(ready.await(10, TimeUnit.SECONDS)).isTrue();
            start.countDown();
            List<Boolean> outcomes = new ArrayList<>();
            for (var result : results) {
                outcomes.add(result.get(20, TimeUnit.SECONDS));
            }
            return outcomes;
        } finally {
            start.countDown();
        }
    }

    @Test
    void pricingManagersActOnlyInTheirCities() {
        Revision draft = draft(TERMS, NOW.minusSeconds(3600), null);
        UUID other = city("UAH");
        UUID outsiderId = UUID.randomUUID();
        jdbc.sql("""
                insert into staff_user(id, login, name, role, permissions, city_scope, state, created_at, updated_at)
                values (:id, :login, 'Other city pricing', 'ADMIN', :permissions, :scope, 'ACTIVE', now(), now())
                """).param("id", outsiderId).param("login", "pricing-" + outsiderId)
                .param("permissions", new String[]{TariffService.MANAGE_PERMISSION})
                .param("scope", new UUID[]{other}).update();
        Actor outsider = new Actor(SubjectType.STAFF, outsiderId);

        reject(() -> tariffs.createVehicleClass(new VehicleClassDraft(UUID.randomUUID(), outsider, 0, city,
                "COMFORT", "Synthetic comfort", "not my city")), ErrorCode.ACCESS_DENIED);
        reject(() -> tariffs.createDraft(new Draft(UUID.randomUUID(), outsider, 0, city, classId, "UAH",
                NOW, null, TERMS, "not my city")), ErrorCode.ACCESS_DENIED);
        reject(() -> tariffs.publish(new Change(UUID.randomUUID(), outsider, draft.id(), draft.version(),
                "not my city")), ErrorCode.ACCESS_DENIED);
        assertThat(tariffs.createVehicleClass(new VehicleClassDraft(UUID.randomUUID(), outsider, 0, other,
                "STANDARD", "Synthetic standard", "my city")).state()).isEqualTo("ACTIVE");
    }

    private Actor staff(String state, String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                insert into staff_user(id, login, name, role, permissions, state, created_at, updated_at)
                values (:id, :login, 'Pricing manager', 'ADMIN', :permissions, :state, now(), now())
                """).param("id", id).param("login", "pricing-" + id)
                .param("permissions", permissions).param("state", state).update();
        jdbc.sql("update staff_user set city_scope = :cities where id = :id")
                .param("cities", cities.toArray(UUID[]::new)).param("id", id).update();
        staffIds.add(id);
        return new Actor(SubjectType.STAFF, id);
    }

    private UUID city(String currency) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                insert into city(id, code, name, currency, timezone, polygon, priority, state, created_at, updated_at)
                values (:id, :code, 'Synthetic', :currency, 'UTC',
                    ST_GeomFromEWKT('SRID=4326;MULTIPOLYGON(((30 50,31 50,31 51,30 51,30 50)))'),
                    0, 'PUBLISHED', now(), now())
                """).param("id", id).param("code", "pricing-" + id).param("currency", currency).update();
        cities.add(id);
        // Every fixture staff member manages every fixture city; the scope itself is tested separately.
        jdbc.sql("update staff_user set city_scope = array_append(city_scope, :city) where id = any(:ids)")
                .param("city", id).param("ids", staffIds.toArray(UUID[]::new)).update();
        return id;
    }

    private UUID vehicleClass(UUID cityId) {
        return tariffs.createVehicleClass(new VehicleClassDraft(UUID.randomUUID(), manager, 0, cityId,
                "STANDARD", "Synthetic standard", "test")).id();
    }

    private Revision published(Terms terms) {
        return tariffs.publish(change(draft(terms, NOW.minusSeconds(3600), null)));
    }

    private Revision draft(Terms terms, Instant from, Instant to) {
        return tariffs.createDraft(draftCommand(terms, from, to));
    }

    private Draft draftCommand(Terms terms, Instant from, Instant to) {
        return new Draft(UUID.randomUUID(), manager, 0, city, classId, "UAH", from, to, terms, "Synthetic tariff");
    }

    private Change change(Revision revision) {
        return new Change(UUID.randomUUID(), manager, revision.id(), revision.version(), "Synthetic transition");
    }

    private QuoteService.Request request(Actor payer) {
        return new QuoteService.Request(city, classId, new GeoPoint(50.45, 30.52), new GeoPoint(50.5, 30.6), payer);
    }

    private long audits(UUID id, String action) {
        return jdbc.sql("select count(*) from audit_log where resource_id = :id and action = :action")
                .param("id", id.toString()).param("action", action).query(Long.class).single();
    }

    private void reject(Runnable action, ErrorCode code) {
        assertThatThrownBy(action::run).isInstanceOf(DomainException.class)
                .extracting(error -> ((DomainException) error).code()).isEqualTo(code);
    }

    @TestConfiguration(proxyBeanMethods = false)
    static class Fakes {
        @Bean
        @Primary
        TestClock pricingClock() {
            return new TestClock();
        }

        @Bean
        @Primary
        FakeRoutes pricingRoutes() {
            return new FakeRoutes();
        }
    }

    static class TestClock extends Clock {
        volatile Instant current = NOW;

        @Override
        public ZoneId getZone() {
            return ZoneOffset.UTC;
        }

        @Override
        public Clock withZone(ZoneId zone) {
            return Clock.fixed(current, zone);
        }

        @Override
        public Instant instant() {
            return current;
        }
    }

    static class FakeRoutes implements RouteEstimator {
        final AtomicInteger calls = new AtomicInteger();
        volatile Estimate next = new Estimate(7500, 900);

        @Override
        public Estimate estimate(GeoPoint pickup, GeoPoint dropOff) {
            assertThat(TransactionSynchronizationManager.isActualTransactionActive()).isFalse();
            calls.incrementAndGet();
            return next;
        }
    }
}
