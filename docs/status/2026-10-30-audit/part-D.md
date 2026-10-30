# Part D — spec lines 715–957 (sections 23–28) against `main`

Paths are relative to the repository root; `S/` = `server/src/main/java/taxi/blizz/`, `T/` = `server/src/test/java/taxi/blizz/`, `M/` = `server/src/main/resources/db/migration/`.

| id | status | evidence (paths/tests) | what is missing (for PARTIAL/MISSING) |
|---|---|---|---|
| REQ-ENG-01 | DONE | Spring Boot modular monolith (`server/pom.xml`, `server/README.md`), Spring Modulith; `apps/mobile/{rider,driver}`, `apps/web/{admin,operator}` | — |
| REQ-ENG-02 | DONE | `docs/decisions/0001-stack-versions.md` (JDK 25, Boot 4.1.2, PG 18, PostGIS 3.6, Expo 58, support dates). Note: ADR status still "предложено", formal approval is owner process | — |
| REQ-ENG-03 | PARTIAL | Modules = public API + `internal` (`server/README.md`); `S/platform/package-info.java` keeps shared small; ADR 0004 data ownership | No domain / application / adapters split inside modules: `Jdbc*` classes mix SQL, rules and orchestration. Refactor-level, not launch-blocking |
| REQ-ENG-04 | DONE | `T/ModularityTests.java` (Modulith verify in CI); providers called outside transactions: `S/payments/internal/PaymentWorker.java`, `S/payments/CardPayments.java`, `JdbcQuoteService` (`Propagation.NEVER`), `ChannelOtpDelivery` (`NOT_SUPPORTED`), `JdbcCalls` | No automated check that HTTP is never called inside a transaction (convention + review only) |
| REQ-ENG-05 | DONE | `S/platform/Outbox.java`, `M/V3__outbox.sql`, ADR 0002; `T/platform/internal/OutboxTests.java` | — |
| REQ-ENG-06 | DONE | `S/platform/internal/OutboxRelay.java` (`FOR UPDATE SKIP LOCKED`, backoff, consumer_inbox), `PaymentWorker` lease; `T/payments/internal/CardCaptureTests.java` (`aLostCaptureIsSentAgainWhileTheHoldStands`, `aLostVoidIsSentAgain`) | — |
| REQ-ENG-07 | PARTIAL | Circuit breakers `S/platform/ProviderBreakers.java` for GRAPHHOPPER, GEOCODING, TURBOSMS, FCM, `T/platform/internal/ProviderBreakersTests.java`; timeouts in `PaymentsConfiguration`, `TelephonyConfiguration`, `HttpTransport`, `PushConfiguration`; scheduler pool 10 (`application.yml`) | No bulkhead (concurrency cap) per provider; no explicit retry budget per provider; no breaker for WayForPay and Asterisk ARI; timeouts are hard-coded per client rather than configured per provider |
| REQ-ENG-08 | DONE | Monorepo layout: `server`, `apps/mobile/*`, `apps/web/*`, `packages/{api-client,contracts,localization}`, `deploy`, `docs` (`README.md`) | — |
| REQ-ENG-09 | CLIENT | Web/mobile UI concern | — |
| REQ-ENG-10 | CLIENT | Delivery choice, `README.md` | — |
| REQ-ENG-11 | PARTIAL | Versions pinned in `pom.xml`, `packages/contracts/package-lock.json`, Trivy pinned `aquasec/trivy:0.56.2`; secrets not in repo, `ProductionSafety` refuses repo values; CI secret scan | Images not pinned by digest: `server/Dockerfile` (`maven:3.9-eclipse-temurin-25`, `eclipse-temurin:25-jre`), `deploy/dev/compose.yaml` (`andrius/asterisk:latest`, `redis:8`, `postgis/postgis:18-3.6`), `deploy/sandbox/compose.yaml`; no Maven wrapper |
| REQ-ENG-12 | PARTIAL | `scripts/dev-infra-up.sh`, `scripts/server-build.sh`, `scripts/contracts-lint.sh`, `scripts/security-scan.sh`, sandbox scenarios (`scripts/sandbox/`), `server/README.md` "Run locally" | No command to create a migration, no command to restore a test backup (no backup/restore scripts in `deploy/` despite README claim), no local e2e/integration split commands; web/mobile commands absent |
| REQ-ENG-13 | DONE | `application-prod.yml`, `S/platform/internal/ProductionSafety.java`, `ProductionSafetyCheck.java` (no default profile), `T/platform/internal/ProductionSafetyTests.java`, `deploy/README.md` | — |
| REQ-ENG-14 | DONE | `S/configuration/FeatureFlags.java` (owner, review date), `M/V20261028_1530_1__feature_flags.sql`, `T/configuration/FeatureFlagsTests.java` (expired-date test, audited switch, concurrent switch), `CardCaptureTests` (started holds continue); `scripts/sandbox/scenarios/feature-flags.sh` | — |
| REQ-ENG-15 | CLIENT | Mobile OTA policy (server min-version is REQ-API-10, outside this range) | — |
| AC-22 | PARTIAL | CI builds and tests on real PostgreSQL; provider failures isolated by breakers and workers outside the request pool | Release not reproducible (no image digests, ENG-11); clean-machine instructions lack restore/migration commands (ENG-12); no bulkhead (ENG-07) |
| REQ-SEC-01 | CLIENT | Infra (TLS, disk/backup encryption). Server side present: admin-panel keys encrypted with `SECRETS_MASTER_KEY`, call recordings AES-256-GCM (`deploy/README.md`). Driver documents not encrypted at rest: task #135 | — |
| REQ-SEC-02 | DONE | `docs/security/threat-model.md` covers all 10 listed threats with code references; partner threat deferred to M2 | — |
| REQ-SEC-03 | DONE | `S/platform/RateLimits.java` (quote, order, offer-accept, file-upload, broadcast-claim/list; per account, not per IP), `S/geo/internal/AddressSearchRateLimiter.java`, `S/location/internal/LocationBatchRateLimiter.java`, OTP limits (`M/V7__otp_client_limits.sql`); `T/platform/RateLimitTests.java` | — |
| REQ-SEC-04 | DONE | Object checks everywhere (`T/AccessIsolationTests.java`); driver sees rider phone only during the trip (`S/operations/internal/JdbcTrips.java` `recipient(...)` null after `completedAt`); chat writable 24 h after order (threat model T1, `JdbcOrderChat`, `T/operations/OrderChatTests.java`); revoked session loses WS (`T/notification/LiveChannelTests.java`) | — |
| REQ-SEC-05 | DONE | Bearer tokens only (no cookie auth → no CSRF), no CORS mappings (same-origin default), parameterised SQL; SSRF allowlist `S/platform/OutboundAddresses.java`, `T/platform/internal/OutboundAddressesTests.java`. Note: WS handlers use `setAllowedOriginPatterns("*")` (`S/notification/internal/LiveConfiguration.java`), acceptable only because auth is a bearer token, not a cookie | — |
| REQ-SEC-06 | DONE | `S/files/FileService.java`, `M/V10__files.sql`, `M/V20261030_0846_5__file_rescan.sql`; signature vs declared MIME, size, SHA-256, QUARANTINE→SAFE/REJECTED, ClamAV; `T/files/FileServiceTests.java`, `T/files/ContentScannerTests.java` | — |
| REQ-SEC-07 | DONE | Download only through backend with checks (`DriverFilesController`, `SupportFilesController`, `AdminDriverReviewController`, `attachment` + `nosniff`); metadata stripping `S/files/internal/ImageMetadataStripper.java`, `JpegMetadataStripper.java`, `T/files/internal/ImageMetadataStripperTests.java` | — |
| REQ-SEC-08 | PARTIAL | `S/platform/internal/LogRedaction.java`, `logback-spring.xml` (`%redactedEx`), `T/platform/internal/LogRedactionTests.java`, `LogRedactionOutputTests.java`; proxy rule for `/api/` query strings in `deploy/README.md` | WS handshake accepts `access_token` in the query string (`S/notification/internal/LiveHandshake.java`, used by browsers on `/ws/v1/operator`), but the proxy no-query-logging rule in `deploy/README.md` covers only `/api/`: tokens reach proxy logs. Crash-analytics part is CLIENT |
| REQ-SEC-09 | DONE | `M/V20261028_1330_1__merchant_previous_key.sql`, `S/payments/internal/MerchantAdmin.java`, `PaymentNotifications.java` (previous key in window + re-check with provider), `T/payments/internal/MerchantAdminTests.java`; `docs/runbooks/key-compromise.md` | — |
| REQ-SEC-10 | DONE | `S/identity/EmergencyAccess.java`, `M/V20261028_0520_1__emergency_access.sql` (time-limited, reason, audited), `T/identity/EmergencyAccessTests.java` | — |
| REQ-SEC-11 | DONE | `S/operations/DriverRiskFlags.java` (reason, evidence, review OPEN→CONFIRMED/DISMISSED), flags never block by themselves (threat model G4); `T/operations/internal/DriverRiskFlagTests.java` | — |
| REQ-SEC-12 | DONE | CI job "Security" runs `scripts/security-scan.sh` (Trivy vuln/secret/misconfig + image), `.github/dependabot.yml`, `.trivyignore` with reasons/expiry, `docs/security/vulnerabilities.md` | — |
| REQ-SEC-13 | DONE | Append-only `audit_log` with triggers against UPDATE/DELETE/TRUNCATE (`M/V4__audit_log.sql`), `T/audit/AuditLogTests.java`; ledger append-only. Accepted deviation: no separate approver (threat model C2, owner 28.10.2026); refund limits wait for Q-06 | — |
| AC-23 | DONE | `T/AccessIsolationTests.java` (order/file/case/card…), `T/notification/LiveChannelTests.java` (WS), `T/files/FileServiceTests.java` + `ContentScannerTests.java` (EICAR), `T/payments/internal/WayForPayProviderTests.java` (`notificationsAreTrustedOnlyWithTheRightSignatureAndAccount`), `T/payments/CardBindingTests.java` (`forgedRepeatedAndDeclinedNotifications`), log redaction tests. Client-bundle part is CLIENT | — |
| REQ-PRV-01 | MISSING | Q-19 decided by the owner (lead handoff, #118 in flight); no data register anywhere in `docs/` or code | Register per data category: purpose, basis, controller, recipients, storage region, term, action at expiry, legal hold, owner |
| REQ-PRV-02 | PARTIAL | GPS: `S/location/TrackRetention.java`, `TrackRetentionSweep.java`, `TrackRetentionProperties.java` (off-trip 24 h, trip 90 d, disputed held via `S/backoffice/internal/SupportTrackHolds.java`), `T/location/internal/TrackRetentionTests.java`, alert `TrackRetentionStuck`; `driver_last_position` kept 30 min | Retention for call recordings (explicitly "nothing deletes", `S/telephony/internal/CallRecordings.java`), driver documents, support attachments, order chat, delivered outbox events: issue #118 not merged |
| REQ-PRV-03 | M2 | No central module exists, nothing is sent to a centre; partner minimum is M2. Masked calls: `S/telephony/Calls.java`, `T/telephony/internal/CallCentreTests.java` | — |
| REQ-PRV-04 | PARTIAL | Client deletion with identification by code, staff review, blockers (active order, debt, open case), ledger kept: `S/identity/internal/JdbcClientDeletions.java`, `S/backoffice/ClientDeletionReview.java`, consumers `AnonymizedClientPushes/Wallet/Searches/Cards`; `T/backoffice/ClientDeletionTests.java` | No drivers' deletion at all; on client anonymization nothing handles `order_contact` (recipient phones), call log/recordings, support cases and attachments, order chat, `otp_delivery` phones — neither anonymized nor recorded as kept with a basis; no file/cache deletion plan |
| REQ-PRV-05 | DONE | `S/identity/internal/ErasureJournal.java`, `ErasureReplay.java` (re-applied at start), ADR 0013, `T/identity/internal/ErasureReplayTests.java`. Note: covers clients only (no other deletion exists) | — |
| REQ-PRV-06 | PARTIAL | Device sessions revoked, push devices and searches removed on anonymization | After anonymization, order pickup/drop-off points, trip tracks, IP/device rows (rate-limit, OTP) stay linked to the client id; no documented assessment of which remain identifying |
| REQ-PRV-07 | PARTIAL | Rider export with code: `S/identity/internal/PersonalDataExportController.java`, `PersonalData` contributors per module, `T/identity/PersonalDataExportTests.java`, `scripts/sandbox/scenarios/data-export.sh`; profile correction via phone change (`JdbcPhoneChanges`) audited | No data export for drivers (`privacy.yaml` used only by rider and admin contracts) |
| REQ-PRV-08 | DONE | `S/configuration/LegalDocuments.java`, `M/V20261028_0510_1__legal_documents.sql`, acceptance enforced in `JdbcOrders`/`JdbcWorkSessions`; `T/configuration/LegalDocumentsTests.java` | — |
| REQ-FIS-01 | OWNER | No `FiscalProvider` in code; applicability and seller are Q-05/Q-12 | — |
| REQ-FIS-02 | OWNER | Q-05/Q-12 (legal seller) | — |
| REQ-FIS-03 | OWNER | Q-05 | — |
| REQ-FIS-04 | OWNER | Q-05 (explicit in spec) | — |
| REQ-FIS-05 | OWNER | Merchants per city exist (`payment_merchant_city`); seller → merchant → fiscal profile mapping waits for Q-05/Q-12 | — |
| AC-24 | PARTIAL | Deletion keeps ledger (`ClientDeletionTests`, `AnonymizedClientWallet`); restore does not bring back the profile (`ErasureReplayTests`, T-39) | Retention matrix not filled (PRV-01, #118); fiscal callback repeat is OWNER (Q-05) |
| REQ-OPSINF-01 | CLIENT | Infra/backup placement | — |
| REQ-OPSINF-02 | OWNER | Q-15 (RPO/RTO, sites) | — |
| REQ-OPSINF-03 | DONE | Workers safe with replicas: `OutboxRelay` (`SKIP LOCKED`), payment worker leases, recording download leases (`CallRecordings`), invariant scans outside transactions (`S/platform/InvariantChecks.java`). Old-primary fencing is infra | — |
| REQ-OPSINF-04 | DONE | Server does not use Redis (no dependency in `pom.xml`); candidates from PostGIS with GPS freshness (`S/operations/internal/PresenceProperties.java`, eligibility in `JdbcWorkSessions`); active trips read from DB | — |
| REQ-OPSINF-05 | DONE | Commands commit in one DB transaction with `command_receipt` (ADR 0002), retry returns the stored result (`T/platform/IdempotentCommandsTests.java`); `/readyz` drops without DB; `docs/runbooks/database-and-server.md`. Client pending queue is CLIENT | — |
| REQ-OPSINF-06 | CLIENT | Backup content/process is infra; `deploy/README.md` says keep master key with backups | — |
| REQ-OPSINF-07 | CLIENT | Monthly restore drill is process | — |
| REQ-OPSINF-08 | CLIENT | Release process; forward-fix migrations noted in `docs/runbooks/database-and-server.md` | — |
| REQ-OPSINF-09 | DONE | Daily card reconciliation `S/payments/internal/CardReconciliation.java`, `ReconciliationSchedule.java`, `M/V20261029_1028_2__payment_reconciliation.sql`, `docs/runbooks/payment-reconciliation.md`; chargebacks `M/V20261029_0930_1__chargebacks.sql` | — |
| REQ-OPSINF-10 | PARTIAL | `docs/runbooks/`: database-and-server, outbox, payment-unknown, payment-reconciliation, invariants, ledger, clock, sms, providers (GPS/routing/SMS/push), orders-and-gps, key-compromise | Missing runbooks: wrong merchant (payment to the wrong merchant/legal entity), site recovery / restore from backup, DB failover (current DB runbook only says "restore the database"). Redis N/A, partner uncertainty is M2 |
| REQ-OPSINF-11 | DONE | `blizz.clock.skew.seconds` in `S/platform/internal/PlatformGauges.java`, alert `ClockSkew`, `docs/runbooks/clock.md`; deadlines use DB/server clock | — |
| REQ-OPSINF-12 | CLIENT | Migration of an instance between profiles is an ops procedure (`INSTANCE_ID` fixed, `deploy/README.md`) | — |
| AC-25 | CLIENT | Stage drills (primary loss, Redis loss, restore) are ops work | — |
| REQ-NFR-01 | MISSING | No load-test harness in the repository (no k6/Gatling/JMeter) | Load test with drivers online, orders/s, searches, GPS/s, WS connections, operators and failure mix; L1 profile at least for the pilot |
| REQ-NFR-02 | PARTIAL | `http.server.requests` percentile histograms (`application.yml`), `blizz.dispatch.first_offer` timer | p95 targets never measured (needs NFR-01); no metric for "position received → shown" latency |
| REQ-NFR-03 | DONE | `blizz.dispatch.assigned` timer separate from `blizz.dispatch.first_offer` (`S/operations/internal/OrderMetrics.java`, `T/operations/OrderMetricsTests.java`) | — |
| REQ-NFR-04 | MISSING | DB gauges exist (`S/platform/DatabaseGauges.java`), outbox lag gauges | No load run recording p50/p95/p99, CPU/RAM, locks, queue lag, GC, with invariant checks during the run |
| REQ-NFR-05 | PARTIAL | GPS batch limiter `S/location/internal/LocationBatchRateLimiter.java`; report exports are async (`S/backoffice/internal/JdbcReportExports.java`); money/command events go through outbox, never dropped | No server-side limit on staff map polling (`S/operations/internal/LiveDriverBoard.java`, spec map interval ≥5 s); no shedding of non-critical reports under load |
| REQ-OBS-01 | DONE | `S/platform/internal/CorrelationIdFilter.java`, `CorrelationId.java`, outbox `correlation_id`, `order_event`/`payment_intent`/`payment_operation` columns (`M/V20261028_0550_3__track_retention_correlation.sql`), log pattern; `T/payments/internal/CorrelationIdTests.java` | — |
| REQ-OBS-02 | DONE | `OrderMetrics` (created/cancelled/unfulfilled, first offer, assigned, offers outcome, exclusions), `blizz.drivers.online.stale_location`, `blizz.assignments.active`, `blizz.outbox.*`, `blizz.payments.unknown*`, `blizz.ledger.unbalanced`, `blizz.sms.sent`, `blizz.otp.sent{channel,country}`; `T/platform/internal/ObservabilityTests.java`, `scripts/sandbox/check-metrics.mjs`. Refund metric waits for Q-06 (no refunds), partner reserves are M2 | — |
| REQ-OBS-03 | DONE | `deploy/monitoring/alerts.yml` (owner + runbook per alert; OutboxStuck >60 s, PaymentOutcomeUnknown >300 s, ServerErrors, InvariantViolation), `alerts.test.yml`. Partner uncertainty alert is M2 | — |
| REQ-OBS-04 | DONE | Failed orders/payments persisted; correlation search `S/identity/internal/StaffLogsController.java` + `S/platform/CorrelationTrail.java`; problem queues `M/V20261028_1400_1__problem_queues.sql`; `scripts/sandbox/scenarios/correlation-search.sh` | — |
| REQ-OBS-05 | M2 | Central monitoring is the network centre (M2). Locally: metrics only on the unpublished management port, no PII in logs | — |
| REQ-UX-01 | CLIENT | Screen states (`docs/design/README.md`) | — |
| REQ-UX-02 | CLIENT | Accessibility | — |
| REQ-UX-03 | DONE | Server part: UTC everywhere (`application.yml` Hikari `SET TIME ZONE 'UTC'`), reports by city local day (`T/ReportsTests.java`, `T/finance/DriverEarningsTests.java`). Strings/plurals are CLIENT (`packages/localization`) | — |
| REQ-UX-04 | CLIENT | Device matrix Q-17 | — |
| REQ-UX-05 | CLIENT | App behaviour; server already exposes position age/state | — |
| AC-26 | MISSING | — | L1–L3 results with configuration (server side: load harness, NFR-01/04); device checks are CLIENT |
| REQ-QA-01 | PARTIAL | Unit + integration on real PostgreSQL/PostGIS (Testcontainers), contract lint (`scripts/contracts-lint.sh`, `scripts/audit/contract-drift.mjs`), e2e via 39 sandbox scenarios with response validation (`scripts/sandbox/validate-response.mjs`), restart of offer expiry (T-11) | No fault tests (process restarts mid-operation, network cuts to DB/providers beyond fakes), no load tests |
| REQ-QA-02 | PARTIAL | Transitions covered scenario by scenario (`T/operations/DispatchTests.java`, `TripTests.java`, `WorkSessionTests.java`, `IdempotentCommandsTests`, `AccessIsolationTests`) | No parameterised tables derived from sections 9–13 checking each allowed/forbidden transition × wrong role × foreign object × stale version × repeat × concurrent command |
| REQ-QA-03 | MISSING | Runtime invariant scans exist (`S/operations/internal/OperationsInvariants.java`, `FinanceInvariants`, `PaymentsInvariants`, `T/payments/internal/InvariantViolationsTests.java`) but no property-based tests (no jqwik etc. in `pom.xml`) | Random command sequences asserting: ≤1 active assignment per order/driver, terminal order never back in search, every trip has an assignment, ledger balanced, capture not duplicated, refunds ≤ allowed |
| REQ-QA-04 | MISSING | Adapter tests use fakes (`T/payments/internal/WayForPayProviderTests.java`); sandbox uses FAKE provider (`scripts/sandbox/scenarios/card-ride.sh`) | Run of the WayForPay adapter against the provider's sandbox with saved anonymised transcripts: UNKNOWN, repeats, late callbacks, amount mismatch |
| REQ-QA-05 | CLIENT | Real-device background tests | — |
| REQ-QA-06 | CLIENT | Defect process | — |
| T-01 | DONE | `T/operations/TripTests.java` (full ride), `T/finance/FareLedgerTests.java`, `scripts/sandbox/scenarios/full-ride.sh` | — |
| T-02 | DONE | `T/payments/internal/CardCaptureTests.java` `aCardRideIsPaidFromTheHoldAfterTheTrip`; `card-ride.sh` | — |
| T-03 | DONE | `T/operations/OperatorOrderApiTests.java`, `T/telephony/internal/CallLogTests.java`; caller SMS `scripts/sandbox/scenarios/caller-sms.sh` | — |
| T-04 | DONE | `T/operations/DispatchTests.java` | — |
| T-05 | DONE | `T/operations/DispatchTests.java`, `broadcast-claims.sh` | — |
| T-06 | DONE | `T/operations/DispatchTests.java` | — |
| T-07 | DONE | `T/operations/DispatchTests.java` | — |
| T-08 | DONE | `T/operations/TripTests.java` (cancellation racing the start) | — |
| T-09 | DONE | `T/operations/DispatchTests.java` | — |
| T-10 | DONE | `T/operations/DispatchTests.java`, `T/platform/IdempotentCommandsTests.java` | — |
| T-11 | DONE | `T/operations/DispatchTests.java`, `S/operations/internal/DispatchEngine.java` | — |
| T-12 | DONE | Redis is not used; occupancy in PostgreSQL, candidates need fresh GPS (`T/operations/WorkSessionTests.java` `staleHeartbeatExcludesTheDriverButKeepsAnAssignment`) | — |
| T-13 | DONE | `WorkSessionTests` `staleHeartbeatExcludesTheDriverButKeepsAnAssignment`; repeats via `IdempotentCommandsTests`. App queue is CLIENT | — |
| T-14 | DONE | `T/location/DriverLocationApiTests.java`, `WorkSessionTests` `olderLocationNeverMovesTheCurrentPositionBack` | — |
| T-15 | DONE | `WorkSessionTests` `heartbeatWithoutLocationRestoresConnectionButNotEligibility` | — |
| T-16 | DONE | `WorkSessionTests` (one controlling device) | — |
| T-17 | DONE | `T/driver/DriverAdmissionTests.java`, `WorkSessionTests` | — |
| T-18 | DONE | `WorkSessionTests`, `TripTests` | — |
| T-19 | DONE | `TripTests` (arrival check) | — |
| T-20 | DONE | `TripTests` (no-show without minimum wait) | — |
| T-21 | OWNER | Paid cancellation / cancellation quote: Q-07 | — |
| T-22 | DONE | `T/operations/TripInterruptionTests.java`, `interruption.sh` | — |
| T-23 | DONE | `T/payments/internal/CardHoldTests.java` | — |
| T-24 | DONE | `CardCaptureTests` `aTimedOutCaptureAndRepeatedAnswersChargeAndCountOnce` | — |
| T-25 | DONE | `CardCaptureTests` `anOlderAnswerAfterPaidDoesNotUndoIt` | — |
| T-26 | DONE | `CardCaptureTests` `aboveTheHoldTheRestIsChargedToTheSavedCard`, `whatCannotBeChargedStaysTheRidersDebt`, `aCardFareLeftPartlyUnpaidBecomesOneCase` | — |
| T-27 | DONE | `CardCaptureTests` `cashReportedOnACardOrderIsNotCountedTwice` | — |
| T-28 | OWNER | No refunds exist (threat model §8); refund limits Q-06 | — |
| T-29 | OWNER | Payout registry Q-11 | — |
| T-30 | DONE | `T/finance/FareLedgerTests.java` `aCashTripLeavesTheDriverOwingTheCommissionAndPaysNothingOut` | — |
| T-31 | DONE | `FareLedgerTests` `theFinalFareIsTheAgreedPriceWithTheQuotedCommissionEvenAfterATariffChange`, `T/pricing/PricingTests.java` `oldQuoteKeepsItsTermsAfterArchivingAndPublishingANewTariff` | — |
| T-32 | DONE | Final fare = agreed quote; no track-based surcharge exists (`FareLedgerTests`). Note: no test named for a lost track | — |
| T-33 | DONE | `T/geo/AddressBookTests.java` | — |
| T-34 | DONE | `T/geo/AddressBookTests.java` | — |
| T-35 | DONE | `T/geo/GeographyTests.java` | — |
| T-36 | DONE | `T/platform/internal/ProviderBreakersTests.java`, `CallLogTests` `withAsteriskUnreachableCallsAreNotLoggedAndPhoneOrdersStillWork`, `docs/runbooks/providers.md` | — |
| T-37 | DONE | `T/AccessIsolationTests.java`, `T/notification/LiveChannelTests.java` | — |
| T-38 | DONE | `T/files/FileServiceTests.java`, `ContentScannerTests.java`, `WayForPayProviderTests`, `CardBindingTests` | — |
| T-39 | DONE | `T/identity/internal/ErasureReplayTests.java` | — |
| T-40 | DONE | `T/ReportsTests.java`, `T/finance/DriverEarningsTests.java` | — |
| T-41 | M2 | Partner exchange (`S/partner/` empty) | — |
| T-42 | M2 | — | — |
| T-43 | M2 | — | — |
| T-44 | M2 | — | — |
| T-45 | M2 | — | — |
| T-46 | M2 | — | — |
| T-47 | M2 | — | — |
| T-48 | CLIENT | DB failover drill (infra) | — |
| T-49 | CLIENT | Restore drill (ops); server side covered by erasure replay and reconciliation, but no restore script exists (see ENG-12) | — |
| T-50 | MISSING | — | L2/L3 run with background reports and provider failure, latencies and invariants measured |

## Server work left

M1 = needed before the pilot/launch per section 29 (S-11 "Подготовка пилота": AC-22–26, backup, runbooks, monitoring, L1) and 28.4 DoD (sandbox payments, backup restore, pilot load profile); "post" = can follow the pilot (L2/L3 production or quality refactors).

### Privacy and retention
- **M1** — Data register per category with purpose, basis, controller, recipients, region, term, action at expiry, legal hold, owner (REQ-PRV-01, AC-24). Q-19 is decided; pairs with #118.
- **M1** — Finish retention of call recordings, driver documents, support attachments, order chat and delivered outbox events with terms from the register (REQ-PRV-02); in flight as #118.
- **M1** — Client anonymization must also handle `order_contact` phones, call log and recordings, support cases and attachments, order chat and `otp_delivery` phones: anonymize, or keep each with a recorded basis. Add a plan for deleting files and caches (REQ-PRV-04, REQ-PRV-06).
- **M1** — Deletion and data export for drivers, with erasure-journal entries (REQ-PRV-04, REQ-PRV-05 extension, REQ-PRV-07).

### Security
- **M1** — Stop the WS `access_token` query parameter from reaching proxy logs: extend the `deploy/README.md` rule to `/ws/`, or move the browser token to `Sec-WebSocket-Protocol` or a one-time ticket (REQ-SEC-08).

### Engineering and resilience
- **M1** — Bulkhead (concurrency cap) and retry budget per provider. Add breakers for WayForPay and Asterisk ARI. Make timeouts configurable per provider (REQ-ENG-07, AC-22).
- **M1** — Pin images by digest in `server/Dockerfile` and both compose files (`andrius/asterisk:latest` first), and add a Maven wrapper (REQ-ENG-11, AC-22).
- **M1** — Project commands: create a migration, back up and restore a test database (backup/restore scripts in `deploy/`), run e2e locally (REQ-ENG-12, AC-22, T-49).
- post — Explicit domain / application / adapters layering inside modules (REQ-ENG-03).

### Operations
- **M1** — Runbooks for a wrong merchant, site recovery / restore from backup, and DB failover (REQ-OPSINF-10).

### Performance and load
- **M1** — Load harness and L1 pilot run, recording p50/p95/p99, errors, CPU/RAM, DB connections and locks, queue lag and GC, with invariant scans during the run (REQ-NFR-01, REQ-NFR-04, AC-26).
- post (production) — L2/L3 and an 8 h soak with background reports and provider failure; check the p95 targets, including a "position received → shown" latency metric (REQ-NFR-02, T-50, AC-26).
- post — Server-side throttle for staff map polling (≥5 s) and shedding of non-critical reports under load (REQ-NFR-05).

### Testing
- **M1** — Run the WayForPay adapter against the provider's sandbox and keep anonymised transcripts: UNKNOWN, repeats, late callbacks, amount mismatch (REQ-QA-04; required by 28.4 "sandbox платежей").
- **M1** — Fault tests: restart mid-operation (payment worker, outbox, dispatch) and DB/provider network cuts (REQ-QA-01).
- post — Parameterised transition-table tests for sections 9–13: allowed and forbidden transitions, wrong role, foreign object, stale version, repeat, concurrent command (REQ-QA-02).
- post (before L2) — Property-based random command sequences for the six invariants (REQ-QA-03).
