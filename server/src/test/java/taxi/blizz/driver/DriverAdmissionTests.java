package taxi.blizz.driver;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.files.FilePurpose;
import taxi.blizz.files.FileService;
import taxi.blizz.files.FileState;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;

/** Section 6 and the admission rows of section 12.2: REQ-DRV-01, REQ-DRV-02, REQ-DRV-05, AC-11, T-17. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class DriverAdmissionTests {

    private static final LocalDate TODAY = LocalDate.now();

    @Autowired
    DriverAdmission admission;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    FileService files;

    static final byte[] PNG = {(byte) 0x89, 'P', 'N', 'G', '\r', '\n', 0x1A, '\n', 0, 0, 0, 13, 'I', 'H', 'D', 'R'};

    // ------------------------------------------------------------ fixtures

    private Actor newDriver() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver (id, phone_normalized, account_state, review_status, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', 'NOT_SUBMITTED', now(), now())""")
                .param("id", id)
                .param("phone", "+38097" + String.format("%07d", Math.floorMod(id.hashCode(), 10_000_000)))
                .update();
        return new Actor(SubjectType.DRIVER, id);
    }

    private Actor newStaff(String state, String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, state, created_at, updated_at)
                        values (:id, :login, 'Reviewer', 'ADMIN', :permissions, :state, now(), now())""")
                .param("id", id)
                .param("login", "staff-" + id)
                .param("permissions", permissions)
                .param("state", state)
                .update();
        return new Actor(SubjectType.STAFF, id);
    }

    private Actor reviewer() {
        return newStaff("ACTIVE", DriverAdmission.REVIEW_PERMISSION);
    }

    private UUID vehicle(Actor driver) {
        return admission.addVehicle(driver, UUID.randomUUID(),
                new DriverAdmission.VehicleInput("aa 4821 kt", "Škoda", "Octavia", "white", 2021));
    }

    private UUID safeFile(Actor driver) {
        UUID fileId = files.openUpload(driver, UUID.randomUUID(), FilePurpose.DRIVER_DOCUMENT, "image/png", PNG.length)
                .fileId();
        assertThat(files.upload(driver, fileId, "image/png", PNG.length, new java.io.ByteArrayInputStream(PNG)).state())
                .isEqualTo(FileState.SAFE);
        return fileId;
    }

    private UUID document(Actor driver, DocumentType type, UUID vehicleId, LocalDate validTo) {
        return admission.addDocument(driver, UUID.randomUUID(),
                new DriverAdmission.DocumentInput(type, vehicleId, safeFile(driver), "N-1", TODAY.minusYears(1), validTo));
    }

    /** A driver with a vehicle and every required document, ready to submit. */
    private UUID complete(Actor driver) {
        UUID vehicle = vehicle(driver);
        document(driver, DocumentType.DRIVER_LICENSE, null, TODAY.plusYears(5));
        document(driver, DocumentType.VEHICLE_REGISTRATION, vehicle, null);
        document(driver, DocumentType.INSURANCE, vehicle, TODAY.plusMonths(6));
        return vehicle;
    }

    private DriverProfile submitted(Actor driver) {
        complete(driver);
        return admission.submit(driver, UUID.randomUUID(), admission.profile(driver.id()).version());
    }

    private DriverProfile approved(Actor driver) {
        DriverProfile inReview = submitted(driver);
        return admission.decide(reviewer(), UUID.randomUUID(), driver.id(), inReview.version(),
                ReviewDecision.APPROVE, "All documents checked", List.of("STANDARD"), List.of());
    }

    private int count(String sql, UUID id) {
        return jdbc.sql(sql).param("id", id).query(Integer.class).single();
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    // ------------------------------------------------------------ happy path

    @Test
    void driverIsSubmittedAndApproved() {
        Actor driver = newDriver();
        UUID vehicle = complete(driver);

        DriverProfile inReview = admission.submit(driver, UUID.randomUUID(), admission.profile(driver.id()).version());
        assertThat(inReview.reviewStatus()).isEqualTo(ReviewStatus.IN_REVIEW);
        assertThat(inReview.vehicles()).extracting(DriverProfile.Vehicle::state).containsExactly("IN_REVIEW");

        DriverProfile approved = admission.decide(reviewer(), UUID.randomUUID(), driver.id(), inReview.version(),
                ReviewDecision.APPROVE, "All documents checked", List.of("STANDARD", "COMFORT"), List.of());

        assertThat(approved.reviewStatus()).isEqualTo(ReviewStatus.APPROVED);
        assertThat(approved.vehicles()).singleElement().satisfies(v -> {
            assertThat(v.id()).isEqualTo(vehicle);
            assertThat(v.state()).isEqualTo("APPROVED");
            assertThat(v.classApprovals()).containsExactly("STANDARD", "COMFORT");
            assertThat(v.registrationNumber()).isEqualTo("AA 4821 KT");
        });
        assertThat(approved.documents()).extracting(DriverProfile.Document::decision).containsOnly("ACCEPTED");
        assertThat(count("select count(*) from driver_review_event where driver_id = :id", driver.id())).isEqualTo(2);
        assertThat(count("select count(*) from audit_log where resource_type = 'driver' and resource_id = cast(:id as text)",
                driver.id())).isEqualTo(2);
        assertThat(count("select count(*) from outbox where aggregate_id = :id and event_type = 'DriverReviewStatusChanged'",
                driver.id())).isEqualTo(2);
    }

    // ------------------------------------------------------------ submit rules

    @Test
    void submitListsWhatIsMissing() {
        Actor driver = newDriver();
        vehicle(driver);

        assertThatThrownBy(() -> admission.submit(driver, UUID.randomUUID(), admission.profile(driver.id()).version()))
                .isInstanceOf(DomainException.class)
                .hasMessageContaining("DRIVER_LICENSE")
                .hasMessageContaining("INSURANCE");
    }

    @Test
    void submitNeedsAVehicle() {
        Actor driver = newDriver();
        document(driver, DocumentType.DRIVER_LICENSE, null, TODAY.plusYears(1));

        assertThatThrownBy(() -> admission.submit(driver, UUID.randomUUID(), admission.profile(driver.id()).version()))
                .isInstanceOf(DomainException.class)
                .hasMessageContaining("VEHICLE");
    }

    @Test
    void expiredDocumentBlocksSubmission() {
        Actor driver = newDriver();
        UUID vehicle = vehicle(driver);
        document(driver, DocumentType.DRIVER_LICENSE, null, TODAY.plusYears(5));
        document(driver, DocumentType.VEHICLE_REGISTRATION, vehicle, null);
        document(driver, DocumentType.INSURANCE, vehicle, TODAY.minusDays(1));

        assertCode(() -> admission.submit(driver, UUID.randomUUID(), admission.profile(driver.id()).version()),
                ErrorCode.VALIDATION_FAILED);
    }

    @Test
    void staleVersionIsAConflict() {
        Actor driver = newDriver();
        complete(driver);
        long version = admission.profile(driver.id()).version();
        admission.updateProfile(driver, UUID.randomUUID(), "Andrii", "uk");

        assertCode(() -> admission.submit(driver, UUID.randomUUID(), version), ErrorCode.VERSION_CONFLICT);
    }

    @Test
    void repeatedSubmitReturnsTheFirstResult() {
        Actor driver = newDriver();
        complete(driver);
        long version = admission.profile(driver.id()).version();
        UUID command = UUID.randomUUID();

        DriverProfile first = admission.submit(driver, command, version);
        DriverProfile repeat = admission.submit(driver, command, version);

        assertThat(repeat).isEqualTo(first);
        assertThat(count("select count(*) from driver_review_event where driver_id = :id", driver.id())).isEqualTo(1);
    }

    @Test
    void documentsAreFrozenWhileInReview() {
        Actor driver = newDriver();
        submitted(driver);

        assertCode(() -> document(driver, DocumentType.TAXI_PERMIT, null, null), ErrorCode.STATE_CONFLICT);
        assertCode(() -> vehicle(driver), ErrorCode.STATE_CONFLICT);
    }

    @Test
    void vehicleDocumentRulesAreEnforced() {
        Actor driver = newDriver();
        Actor other = newDriver();
        UUID othersVehicle = vehicle(other);

        assertCode(() -> document(driver, DocumentType.INSURANCE, null, null), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> document(driver, DocumentType.DRIVER_LICENSE, othersVehicle, null), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> document(driver, DocumentType.INSURANCE, othersVehicle, null), ErrorCode.NOT_FOUND);
    }

    @Test
    void documentNeedsASafeFileOfTheSameDriver() {
        Actor driver = newDriver();
        Actor other = newDriver();
        UUID othersFile = safeFile(other);
        UUID pending = files.openUpload(driver, UUID.randomUUID(), FilePurpose.DRIVER_DOCUMENT, "image/png", 100).fileId();

        assertCode(() -> admission.addDocument(driver, UUID.randomUUID(), new DriverAdmission.DocumentInput(
                DocumentType.DRIVER_LICENSE, null, null, null, null, null)), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> admission.addDocument(driver, UUID.randomUUID(), new DriverAdmission.DocumentInput(
                DocumentType.DRIVER_LICENSE, null, othersFile, null, null, null)), ErrorCode.NOT_FOUND);
        assertCode(() -> admission.addDocument(driver, UUID.randomUUID(), new DriverAdmission.DocumentInput(
                DocumentType.DRIVER_LICENSE, null, pending, null, null, null)), ErrorCode.STATE_CONFLICT);
    }

    // ------------------------------------------------------------ reviewer rules

    @Test
    void onlyActiveStaffWithPermissionCanDecide() {
        Actor driver = newDriver();
        DriverProfile inReview = submitted(driver);
        long version = inReview.version();

        assertCode(() -> admission.decide(driver, UUID.randomUUID(), driver.id(), version, ReviewDecision.APPROVE,
                "self approval", List.of("STANDARD"), List.of()), ErrorCode.ACCESS_DENIED);
        assertCode(() -> admission.decide(newStaff("ACTIVE"), UUID.randomUUID(), driver.id(), version,
                ReviewDecision.APPROVE, "no permission", List.of("STANDARD"), List.of()), ErrorCode.ACCESS_DENIED);
        assertCode(() -> admission.decide(newStaff("SUSPENDED", DriverAdmission.REVIEW_PERMISSION), UUID.randomUUID(),
                driver.id(), version, ReviewDecision.APPROVE, "suspended staff", List.of("STANDARD"), List.of()),
                ErrorCode.ACCESS_DENIED);
        assertThat(admission.profile(driver.id()).reviewStatus()).isEqualTo(ReviewStatus.IN_REVIEW);
    }

    @Test
    void decisionNeedsAReason() {
        Actor driver = newDriver();
        DriverProfile inReview = submitted(driver);

        assertCode(() -> admission.decide(reviewer(), UUID.randomUUID(), driver.id(), inReview.version(),
                ReviewDecision.REJECT, " ", List.of(), List.of()), ErrorCode.VALIDATION_FAILED);
    }

    @Test
    void requestedChangesRejectTheListedDocumentAndRequireANewOne() {
        Actor driver = newDriver();
        DriverProfile inReview = submitted(driver);
        UUID insurance = inReview.documents().stream()
                .filter(d -> d.type() == DocumentType.INSURANCE).findFirst().orElseThrow().id();
        UUID vehicle = inReview.vehicles().getFirst().id();

        DriverProfile changes = admission.decide(reviewer(), UUID.randomUUID(), driver.id(), inReview.version(),
                ReviewDecision.REQUEST_CHANGES, "Insurance photo is unreadable", List.of(), List.of(insurance));

        assertThat(changes.reviewStatus()).isEqualTo(ReviewStatus.CHANGES_REQUIRED);
        assertThat(changes.documents()).filteredOn(d -> d.id().equals(insurance)).singleElement()
                .satisfies(d -> assertThat(d.decisionReason()).isEqualTo("Insurance photo is unreadable"));
        assertCode(() -> admission.submit(driver, UUID.randomUUID(), changes.version()), ErrorCode.VALIDATION_FAILED);

        document(driver, DocumentType.INSURANCE, vehicle, TODAY.plusMonths(6));
        DriverProfile resubmitted = admission.submit(driver, UUID.randomUUID(), admission.profile(driver.id()).version());
        assertThat(resubmitted.reviewStatus()).isEqualTo(ReviewStatus.IN_REVIEW);
        assertThat(count("select count(*) from driver_document where driver_id = :id and type = 'INSURANCE'", driver.id()))
                .as("history is kept").isEqualTo(2);
    }

    @Test
    void cannotDecideOutsideReview() {
        Actor driver = newDriver();
        complete(driver);

        assertCode(() -> admission.decide(reviewer(), UUID.randomUUID(), driver.id(),
                admission.profile(driver.id()).version(), ReviewDecision.APPROVE, "early", List.of("STANDARD"),
                List.of()), ErrorCode.STATE_CONFLICT);
    }

    @Test
    void concurrentDecisionsOnTheSameVersionLetOnlyOneWin() throws Exception {
        Actor driver = newDriver();
        long version = submitted(driver).version();
        Actor first = reviewer();
        Actor second = reviewer();
        CountDownLatch start = new CountDownLatch(1);
        ExecutorService pool = Executors.newFixedThreadPool(2);
        try {
            List<Future<DriverProfile>> results = new ArrayList<>();
            for (Callable<DriverProfile> call : List.<Callable<DriverProfile>>of(
                    () -> admission.decide(first, UUID.randomUUID(), driver.id(), version, ReviewDecision.APPROVE,
                            "ok", List.of("STANDARD"), List.of()),
                    () -> admission.decide(second, UUID.randomUUID(), driver.id(), version, ReviewDecision.REJECT,
                            "fake documents", List.of(), List.of()))) {
                results.add(pool.submit(() -> {
                    start.await();
                    return call.call();
                }));
            }
            start.countDown();
            int succeeded = 0;
            int conflicts = 0;
            for (Future<DriverProfile> result : results) {
                try {
                    result.get();
                    succeeded++;
                } catch (java.util.concurrent.ExecutionException e) {
                    assertThat(e.getCause()).isInstanceOf(DomainException.class);
                    assertThat(((DomainException) e.getCause()).code()).isEqualTo(ErrorCode.VERSION_CONFLICT);
                    conflicts++;
                }
            }
            assertThat(succeeded).isEqualTo(1);
            assertThat(conflicts).isEqualTo(1);
        } finally {
            pool.shutdownNow();
        }
        assertThat(count("select count(*) from driver_review_event where driver_id = :id", driver.id())).isEqualTo(2);
    }

    // ------------------------------------------------------------ suspension and expiry

    @Test
    void approvedDriverCanBeSuspendedWithAReason() {
        Actor driver = newDriver();
        DriverProfile approved = approved(driver);

        DriverProfile suspended = admission.suspend(reviewer(), UUID.randomUUID(), driver.id(), approved.version(),
                "Complaint under investigation");

        assertThat(suspended.reviewStatus()).isEqualTo(ReviewStatus.SUSPENDED);
        assertCode(() -> admission.suspend(reviewer(), UUID.randomUUID(), driver.id(), suspended.version(), "again"),
                ErrorCode.STATE_CONFLICT);
    }

    @Test
    void expiredRequiredDocumentMovesTheDriverToExpiredOnce() {
        Actor driver = newDriver();
        approved(driver);
        Actor healthy = newDriver();
        approved(healthy);
        jdbc.sql("update driver_document set valid_to = :d where driver_id = :id and type = 'INSURANCE'")
                .param("d", TODAY.minusDays(1)).param("id", driver.id()).update();

        int moved = admission.expireDocuments(TODAY);

        assertThat(moved).isGreaterThanOrEqualTo(1);
        assertThat(admission.profile(driver.id()).reviewStatus()).isEqualTo(ReviewStatus.EXPIRED);
        assertThat(admission.profile(healthy.id()).reviewStatus()).isEqualTo(ReviewStatus.APPROVED);
        admission.expireDocuments(TODAY);
        assertThat(count("""
                select count(*) from driver_review_event where driver_id = :id and to_status = 'EXPIRED'""", driver.id()))
                .isEqualTo(1);
    }

    @Test
    void newPendingDocumentDoesNotHideAnExpiredAcceptedOne() {
        Actor driver = newDriver();
        DriverProfile approved = approved(driver);
        UUID vehicle = approved.vehicles().getFirst().id();
        jdbc.sql("update driver_document set valid_to = :d where driver_id = :id and type = 'INSURANCE'")
                .param("d", TODAY.minusDays(1)).param("id", driver.id()).update();
        document(driver, DocumentType.INSURANCE, vehicle, TODAY.plusYears(1));

        admission.expireDocuments(TODAY);

        DriverProfile expired = admission.profile(driver.id());
        assertThat(expired.reviewStatus()).isEqualTo(ReviewStatus.EXPIRED);
        DriverProfile again = admission.submit(driver, UUID.randomUUID(), expired.version());
        assertThat(again.reviewStatus()).isEqualTo(ReviewStatus.IN_REVIEW);
    }
}
