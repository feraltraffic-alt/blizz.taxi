# Server audit, part B: spec sections 9-15 (lines 168-381)

Checked against main at `audit-main`. Paths are relative to `server/src/main/java/taxi/blizz/` (main) and `server/src/test/java/taxi/blizz/` (tests) unless they start with `server/`, `packages/` or `docs/`. All requirements in this range are marked [D] and belong to M1 unless noted.

| id | status | evidence (paths/tests) | what is missing (for PARTIAL/MISSING) |
|---|---|---|---|
| REQ-ORD-01 | DONE | `operations/CreateOrder.java` (quote first, then order); `JdbcOrders.create` writes READY and an `OrderCreated` event before `DispatchEngine.startSearch` moves it to SEARCHING (`OrderSearchStarted`); test `operations/DispatchTests.historyRecordsEveryVersionOfTheOrder` | |
| REQ-ORD-02 | DONE | `ride_order` status check (V20261026_1640); every command checks the status under the order lock (`JdbcOrders.cancel`, `JdbcTrips.lock`); follow-up is a new linked order (`related_order_id`, V20261027_2000_1, `Orders.interrupt`); test `TripInterruptionTests.aBrokenDownTripIsFreeAndTheFollowUpIsOnTheService` | |
| REQ-ORD-03 | DONE | `dispatch_attempt.phase` PERSONAL/BROADCAST/STOPPED/EXHAUSTED, order status stays SEARCHING (`DispatchEngine`) | |
| REQ-ORD-04 | DONE | Separate `ride_order.payment_state` axis (V20261026_1700); FULFILLED with CAPTURE_PENDING / CASH_* in `JdbcTrips.complete`; tests `TripTests.cashRideFromAssignmentToCompletion`, `finance/FareLedgerTests` | (cancellation fee itself: see REQ-CAN-02) |
| REQ-ORD-05 | DONE | `trip.completion_reported_at` + `completed_at`, difference over `reported-time-tolerance` sets `needs_review` (`JdbcTrips.complete`); test `TripTests.completionTimeFarFromServerTimeIsFlagged` | "sending completion" screen is client work |
| REQ-ORD-06 | DONE | `JdbcTrips.complete` needs no GPS; fare = quote price + waiting (`pricing/internal/JdbcFinalFares`), never mileage from the track | |
| AC-08 | DONE | `operations/DispatchTests` (accept, refuse, expiry, broadcast, unfulfilled, `cancellationRacingAcceptanceNeverLeavesAPhantomTrip`), `TripTests`, `TripInterruptionTests`, `payments/internal/CardHoldTests`; forbidden transitions throw `STATE_CONFLICT` inside one transaction | |
| REQ-ASG-01 | DONE | `operations/internal/AssignmentCommitter.commit` creates COMMITTED directly; RESERVED only in the schema for M2 | |
| REQ-ASG-02 | DONE | `JdbcDispatch.accept` marks ACCEPTED only in the commit transaction, OFFER_EXPIRED / OFFER_REVOKED otherwise; tests `DispatchTests.lateAcceptanceAfterExpiryIsRefusedAndTheSearchMovesOn`, `acceptanceAfterTheServerDeadlineIsRefusedEvenBeforeTheWorkerRuns` | |
| REQ-ASG-03 | DONE | trip TO_PICKUP in `AssignmentCommitter`; `JdbcTrips.arrive/start/complete`; test `TripTests.cashRideFromAssignmentToCompletion` | |
| REQ-ASG-04 | DONE | `OrderCore.endAssignmentBeforeStart` (ABORTED, release, refuses after start); after start only `Orders.interrupt` with `orders.interrupt`; tests `TripTests.withdrawalAfterTheStartIsRefused`, `startedTripCannotBeCancelledByThePassenger`, `TripInterruptionTests` | |
| REQ-ASG-05 | DONE | `JdbcTrips.start` from TO_PICKUP only with `exceptionReason`, `start_exception`, `needs_review`; test `TripTests.startWithoutArrivalNeedsAReason` | |
| REQ-ASG-06 | DONE | `JdbcTrips.arrivalCheck`: 150 m, GPS ≤ 15 s, accuracy ≤ 100 m (`DispatchProperties`, `PresenceProperties`), exception with reason flags review; tests `TripTests.arrivalFarFromThePickupNeedsAReasonAndIsFlagged`, `arrivalWithAPoorFixNeedsAReasonAndIsFlagged`, `arrivalWithAStaleLocationIsRefused` | |
| REQ-ASG-07 | DONE | server `arrived_at` (`JdbcTrips.arrive`), waiting terms from the quote's tariff (`RiderQuoteController.WaitingTerms`), waiting computed from server times at completion | |
| REQ-ASG-08 | DONE | lock order order → capacity → assignment/offer documented and used in `OrderCore`, `JdbcDispatch`, `JdbcTrips.lock`, `AssignmentCommitter` | |
| REQ-ASG-09 | DONE | `assignment_active_order_uq`, `assignment_active_driver_uq` with status predicates (V20261026_1640); tests `DispatchTests.hundredSimultaneousClaimsProduceOneAssignment`, `oneDriverClaimingTwoOrdersAtOnceGetsOne` | |
| REQ-ASG-10 | M2 | partner module empty | |
| REQ-ASG-11 | M2 | constraint for partner agreements | |
| AC-09 | DONE | `DispatchTests.hundredSimultaneousClaimsProduceOneAssignment`, `oneDriverClaimingTwoOrdersAtOnceGetsOne`, `BroadcastAbuseTests.twoDriversClaimingOneOrderAtOnceGetOneAssignmentAndNever500`; assignments live only in PostgreSQL | |
| REQ-DSP-01 | PARTIAL | `OrderCore.candidates`: open accepting session in the order's city, fresh heartbeat/location, active account, APPROVED admission and vehicle with the class, terminal for TERMINAL orders, FREE capacity, no restriction; re-checked under locks on accept/claim | Driver admission has no city (no city column on `driver`, `DriverAdmission`), so "допуск в городе" is not checked: any admitted driver who opens a shift in a city is a candidate there |
| REQ-DSP-02 | PARTIAL | PostGIS query `OrderCore.candidates` is the preliminary list with freshness filter; final checks repeat under locks (`JdbcDispatch.requireEligible`) | Redis GEO is not used (ADR 0001 lists Redis for REQ-DSP-02); the PostGIS-only design is not recorded as an accepted deviation (ADR) |
| REQ-DSP-03 | PARTIAL | `operations/internal/DispatchProperties`: radii 2000/5000 m, 20 candidates, offer 15 s, personal phase 60 s, total 180 s | Road ETA for the first 10 candidates is not computed; candidates are ranked by straight distance (`ST_Distance`) only |
| REQ-DSP-04 | PARTIAL | A driver never gets the same order twice (`candidates` excludes earlier offers and assignments of the order) | No scoring: no ETA, no idle time, no versioned coefficients; nearest-first only |
| REQ-DSP-05 | DONE | `offer_open_driver_uq`, `offer_open_order_uq` (V20261026_1640), capacity OFFERED | |
| REQ-DSP-06 | DONE | `DispatchEngine.toBroadcast` revokes the open offer in the same transaction; `DispatchWorker.process` checks attempt id and generation; tests `DispatchTests.endOfThePersonalPhaseRevokesTheOfferAndBroadcasts`, `lateWorkerNeverUndoesAnAcceptedOrder` | |
| REQ-DSP-07 | PARTIAL | `JdbcDispatch.broadcast`/`claim`: city, class, payment (terminal), eligibility, radius; GET `/api/driver/v1/broadcast-orders` gives the snapshot | No zone filter for the ALL tab |
| REQ-DSP-08 | M2 | partner exchange | |
| REQ-DSP-09 | DONE | `DispatchWorker` (`FOR UPDATE SKIP LOCKED`, lease), deadlines in `dispatch_attempt.next_action_at`; test `DispatchTests.lateWorkerNeverUndoesAnAcceptedOrder` | |
| REQ-DSP-10 | MISSING | No manual (dispatcher) offer command exists (no endpoint in `OperatorOrderController`, nothing in contracts); no dispatcher extension of the search either | Manual offer from the operator that uses the attempt's total deadline, goes through driver acceptance, eligibility and the same commit path (REQ-OPS-04) |
| REQ-DSP-11 | DONE | one offer at a time, `candidateLimit` 20 per radius, no router calls in dispatch, rate limits on ALL tab and claims (`BroadcastAbuseTests`) | |
| REQ-DSP-12 | DONE | `operations/internal/JdbcDispatchJournal`, `OrderCore.explain` (reasons, ids and distances only), order events OfferMade/OfferExpired/OrderBroadcast/AssignmentCommitted/OrderUnfulfilled; test `operations/internal/DispatchJournalTests` | |
| AC-10 | DONE | No Redis dependency at all; timers in `dispatch_attempt`, unique indexes; test `DispatchTests.lateWorkerNeverUndoesAnAcceptedOrder` | (note: "Redis loss" is vacuous because Redis is not used, see REQ-DSP-02) |
| REQ-DS-01 | PARTIAL | SUSPENDED/EXPIRED admission and `driver_restriction` (debt) remove eligibility but keep the session and trip (`JdbcWorkSessions.availability`, `DriverAdmission.suspend`); test `WorkSessionTests.expiredAdmissionStopsNewOrdersButNotTheSession` | There is no command to block a driver account; and if `driver.account_state` is not ACTIVE, `identity/internal/BearerAuthenticationInterceptor` refuses every request, so a BLOCKED driver could not complete an ongoing trip (spec: completion stays available in a limited session) |
| REQ-DS-02 | DONE | `operations/DriverAvailability` (axes + `eligible` + reasons) | |
| REQ-DS-03 | PARTIAL | stale heartbeat excluded from `candidates`, assignment kept (test `WorkSessionTests.staleHeartbeatExcludesTheDriverButKeepsAnAssignment`); `LostDrivers` problem task; `LiveDriverBoard` shows connection state and `lastLocationAt` | The support map does not expose the last heartbeat time (`last_heartbeat_at`), only last location time |
| REQ-DS-04 | DONE | `JdbcWorkSessions.heartbeat` without location; test `WorkSessionTests.heartbeatWithoutLocationRestoresConnectionButNotEligibility` | |
| REQ-DS-05 | DONE | candidates need FREE; `OrderCore.closeOpenOffers` frees only OFFERED capacity; expiry is server-side (`DispatchEngine.advance`) | |
| REQ-DS-06 | DONE | vehicle fixed per session (`JdbcWorkSessions.open`), a new session needs no open/closing one and re-checks admission and vehicle; city resolved from the location at open | (per-city admission: see REQ-DSP-01) |
| REQ-DS-07 | PARTIAL | nothing ends a trip on leaving a polygon; eligibility by distance to the pickup | No "return zone" setting for a driver outside the city's polygon |
| REQ-DS-08 | DONE | `operations/internal/ImpossibleMovementFlags`, `JdbcDriverRiskFlags`, `DriverRiskFlags` (never blocks); tests `operations/internal/DriverRiskFlagTests`, `DispatchPositionTests` | |
| REQ-DS-09 | DONE | idempotent `offer.accept` replays the stored result; GET `/assignments/current`; test `DispatchTests.lostResponseRepeatReturnsTheSameAssignment` | (client "pending" display is app work) |
| REQ-DS-10 | DONE | `JdbcDispatch.accept` needs OFFERED, `claim` needs FREE, plus `assignment_active_driver_uq` | |
| REQ-DS-11 | DONE | only named commands (`WorkSessions`, `Trips`, `Dispatch`); no status PATCH endpoint | |
| REQ-DS-12 | DONE | `JdbcTrips.complete` frees the driver with CAPTURE_PENDING; debt restriction is separate (`DriverDebtRestriction`) | |
| REQ-DS-13 | DONE | `operations/internal/CashDisputeFlags`, `backoffice/internal/ProblemQueues` CASH_DISPUTE; test `backoffice/SupportCasesTests` | |
| AC-11 | PARTIAL | positive/forbidden actor/repeat/version tests: `WorkSessionTests` (incl. `staleVersionIsAConflict`), `TripTests.onlyTheAssignedDriverControlsTheTrip`, `staleVersionAndRepeatsBehave`, `DriverAdmissionTests`; DISCONNECTED/ON_TRIP never a candidate (`candidates` needs fresh heartbeat and FREE) | Rows "Пауза" and "Выйти" say open offers are revoked: `JdbcWorkSessions.pause/close` leave an OPEN offer and OFFERED capacity until expiry (accept is refused, but the order waits up to 15 s); no test per transition row for each of the four checks |
| REQ-CAN-01 | PARTIAL | Catalog per side (`configuration` cancel reasons, ADR 0007), labels snapshot on the order; rider/staff cancel and driver cancel need a code | Staff `revoke-assignment` (`JdbcOrders.revokeAssignment`) and `Trips.withdraw` take free text instead of a catalog code; no optional comment next to the code on cancellations (per-stage lists are not required after ADR 0007) |
| REQ-CAN-02 | OWNER | Q-07 open; paid cancellation is off (`OrderCore.cancel` releases the hold, no fee) | |
| REQ-CAN-03 | OWNER | Q-07 open; `cancellation_quote` needed only for paid cancellation | |
| REQ-CAN-04 | DONE | `JdbcTrips.complete` charges waiting only when `arrival_exception` and `start_exception` are null; test `finance/FareLedgerTests.noAutomaticWaitingChargeAfterAnArrivalConfirmedWithAnException` | |
| REQ-CAN-05 | PARTIAL | withdrawal → new `dispatch_attempt` generation, old kept (`DispatchEngine.resumeSearch`), remaining search time continues; test `TripTests.driverWithdrawalSendsTheOrderToAnotherDriver` | `resumeSearch` extends the search to at least one personal phase (60 s) beyond the passenger's total without a shown consent step |
| REQ-CAN-06 | PARTIAL | no-show only in WAITING after `noShowMinimumWait`, records `waited_seconds`, arrived_at on the trip (`JdbcTrips.noShow`); test `TripTests.noShowOnlyAfterTheMinimumWait` | Contact attempts are neither required nor recorded with the no-show (`OrderCalls` only resolves the call target, nothing is logged per order) |
| REQ-CAN-07 | PARTIAL | interruption after start needs `orders.interrupt` (`JdbcOrders.interrupt`), history is append-only (`order_event`) | No correcting command for trip facts/times with reason and author (e.g. "driver pressed start by mistake", section 13 table) |
| REQ-CAN-08 | DONE | order lock serializes cancel and start; tests `TripTests.cancellationRacingTheStartHasOneOutcome`, `startedTripCannotBeCancelledByThePassenger` | |
| AC-12 | DONE | `TripTests.cancellationRacingTheStartHasOneOutcome`, `noShowOnlyAfterTheMinimumWait`; no fee charged at all until Q-07 | |
| REQ-GEO-01 | DONE | `V8__cities_and_zones.sql` (x=lon), `location/internal/JdbcTrackService` stores recorded_at, received_at, accuracy, speed, heading, device session, sequence; validation in `DriverLocationController`, `geo/GeoPoint`; test `geo/GeographyTests.geoPointRejectsNonFiniteAndOutOfRangeCoordinates` | |
| REQ-GEO-02 | DONE | `JdbcWorkSessions.heartbeat` (newer sequence only), track batches never move the current position; test `WorkSessionTests.olderLocationNeverMovesTheCurrentPositionBack` | |
| REQ-GEO-03 | CLIENT | sending frequency is app behaviour | |
| REQ-GEO-04 | PARTIAL | `PresenceProperties` stale 15 s / disconnected 30 s / GPS 15 s; busy drivers never freed | Eligibility (`JdbcWorkSessions.availability`, `OrderCore.candidates`) does not check location accuracy; only arrival does |
| REQ-GEO-05 | DONE | batch 1..100 points, dedup on `(device_session_id, sequence)`, `LocationBatchRateLimiter`; test `location/DriverLocationApiTests` | encrypted local buffer is app work |
| REQ-GEO-06 | DONE | flags FUTURE / POOR_ACCURACY / JUMP (`JdbcTrackService.flagsFor`), `summary` excludes flagged points, fare never uses the track | |
| REQ-GEO-07 | DONE | `pricing/RouteEstimator` vs `geocoding/Geocoding`; GraphHopper adapter `pricing/internal/GraphHopperRouteEstimator`; `route_source` in the quote | own GraphHopper server deferred (#43) |
| REQ-GEO-08 | DONE | circuit breaker in `GraphHopperRouteEstimator`, STRAIGHT_LINE marked or refused (`blizz.pricing.straight-line-quotes`); tests `pricing/StraightLineQuoteMarkedTests`, `StraightLineQuoteRefusedTests` | |
| REQ-GEO-09 | CLIENT | map SDK and licences | |
| REQ-GEO-10 | DONE | `address` / `address_alias` (V20261026_1740), `geo/AddressBook` | |
| REQ-GEO-11 | DONE | ADR 0012: provider results not stored (`PlaceSearchController` "nothing found here is stored"), only opaque `address_override`; history first (test `operations/PlaceSearchApiTests.historyComesFirstThenOwnAddressesThenTheProvider`) | |
| REQ-GEO-12 | DONE | `address_override` (V20261026_1740); test `AddressBookTests.ownOverrideLinkSurvivesEditsHidingAndRestorationWithoutProviderContent` | |
| REQ-GEO-13 | DONE | `geo/HouseNumber`, `AddressText`; tests `HouseNumberTests`, `AddressBookTests.numericBaseIsExactAndExactHouseRanksAboveSuffixPrefixes`, `multilingualAliasesFindOneAddressInAnyInterfaceLanguage` | |
| REQ-GEO-14 | PARTIAL | entrances are never merged by proximity (test `AddressBookTests.entrancesTenMetresApartRemainSeparateAndNearBreaksTies`); a provider ref maps to one own address | No duplicate check for own addresses by city + house/building + coordinates (+ provider id) on create/update |
| REQ-GEO-15 | DONE | hide/restore with `expectedVersion`, reason, `address_history`; `AddressBook.find` re-checks visibility; tests `AddressBookTests.hiddenAddressesDisappear...`, `concurrentEditsLetOnlyOneVersionWin`, `changesHaveVersionedBeforeAfterHistoryActorReasonAndAudit` | |
| REQ-GEO-16 | DONE | min 3 chars, cap 20, `AddressSearchRateLimiter`; tests `AddressBookTests.minimumQueryAndServerResultLimitAreEnforcedAndCitiesStayIsolated`, `RiderAddressApiTests.sixtyFirstSearchIsRateLimitedWithRetryAfter` | debounce/cancel are app work |
| REQ-GEO-17 | MISSING | no OSM import job | Import job with source version, licence, preview, dry run, duplicate report and batch rollback; section 2 puts address import in M3 |
| REQ-GEO-18 | DONE | priority + covered boundary, invalid polygons refused at publish (`geo/internal/JdbcGeoConfiguration`); tests `GeographyTests.highestPriorityWins...`, `rejectsInvalidAndEmptyPolygonsAtPublicationWithoutChangingTheDraft` | |
| AC-13 | DONE | `WorkSessionTests.olderLocationNeverMovesTheCurrentPositionBack`, `RiderAddressApiTests.searchFindsExactHouseNotTwentySixAndHidesHiddenRecords`, `AddressBookTests.hiddenAddresses...`, `entrancesTenMetresApartRemainSeparate...` (no provider cache exists, ADR 0012) | |
| REQ-PRC-01 | DONE | `tariff_version` DRAFT/PUBLISHED/ARCHIVED with immutability trigger (V12), overlap check `JdbcTariffService` (tstzrange); tests `pricing/PricingTests.overlappingRangesAreRejectedButAdjacentRangesAreAllowed`, `publishedVersionsAreImmutableEvenForDirectSql` | admin HTTP API deferred to reminder #30 (service layer only, no controller) |
| REQ-PRC-02 | DONE | `TariffService.Terms` (pickup, km, minute, minimum, free/paid waiting, outside rates, zone fees, cancellation fee, commission); `bigint` minor units, `numeric` rates; test `PricingTests.currenciesAreMinorUnitsWithoutAssumingTwoDecimals`, `FareCalculatorTests.pricingProductionSourcesContainNoInexactNumericTypesOrConversions` | |
| REQ-PRC-03 | DONE | `pricing/internal/FareCalculator` (one final HALF_UP rounding); `FareCalculatorTests.specificationExampleIsExactly11000MinorUnits` | |
| REQ-PRC-04 | DONE | no dynamic demand factor; factor is only owner-approved zone/pre-order coefficients, fixed in the quote snapshot | |
| REQ-PRC-05 | PARTIAL | `quote` table + snapshot: points, city, class, price, currency, `tariff_version_id`, `pricing_policy_version`, breakdown, `expires_at` (300 s), fingerprint (`JdbcQuoteService.create`); test `PricingTests.quoteStoresExactPriceRouteTermsAndFiveMinuteExpiry` | Payment constraints are not part of the quote (neither snapshot nor `Quote` schema in `packages/contracts/openapi/rider.v1.yaml`); allowed methods are checked only at order creation |
| REQ-PRC-06 | DONE | `JdbcQuoteService.consume` (owner + fingerprint, `for update`), consumed in the order transaction; tests `OrderPricingTests.aQuoteServesOneOrderAndARepeatReturnsThatOrder`, `PricingTests.exactlyOneConcurrentConsumptionSucceeds` | |
| REQ-PRC-07 | DONE | price copied to `ride_order.price_minor`; final fare from the consumed quote | (no search-extension procedure exists; see REQ-CAN-05) |
| REQ-PRC-08 | DONE | no deviation surcharge; exception arrivals get no waiting charge (`JdbcTrips.complete`) | |
| REQ-PRC-09 | DONE | `pricing/internal/WaitingCharge` from server arrival→start, per-tariff step and rounding (V20261027_0630); `WaitingChargeTests`, `FareLedgerTests.paidWaitingFollowsTheTariffRuleAndCarriesCommission` | rounding policy left configurable per tariff while Q-07 is open |
| REQ-PRC-10 | PARTIAL | `final_fare` versioned and immutable (V20261026_1800), posting carries `final_fare_version` (`JdbcTrips.complete` payload) | No command creates a corrected version 2 with a delta posting; corrections of a final fare are impossible today |
| REQ-PRC-11 | DONE | policy `M1_AGREED_PLUS_WAITING` (`FinalFares`): agreed price plus proven waiting only, track not used | |
| REQ-PRC-12 | DONE | `final_fare.commission_rate` snapshot from the quote's tariff; test `FareLedgerTests.theFinalFareIsTheAgreedPriceWithTheQuotedCommissionEvenAfterATariffChange` | |
| AC-14 | DONE | `PricingTests.oldQuoteKeepsItsTermsAfterArchivingAndPublishingANewTariff`, `FareLedgerTests.theFinalFareIsTheAgreedPriceWithTheQuotedCommissionEvenAfterATariffChange`, `JdbcFinalFares.finalizeFare` idempotent per order, track never used | |

Counts: DONE 61, PARTIAL 17, MISSING 2, OWNER 2, M2 3, CLIENT 2 (87 ids).

## Server work left

All items below are M1 by the spec's marks (sections 9-15 are [D], slices S-03 to S-06 of section 29 come before the pilot) unless stated.

### Dispatch (S-05)
- **M1** Per-city driver admission: store the admission city/cities and require it in candidates, accept and claim (REQ-DSP-01, REQ-DS-06).
- **M1** Road ETA for the first 10 candidates and a versioned scoring (ETA, idle time, documented limits) instead of straight distance (REQ-DSP-03, REQ-DSP-04). The previous audit put this after launch; section 29 S-15 mentions ETA optimisation as later development, so the owner may confirm the deferral.
- **M1** Zone filter for the ALL tab (REQ-DSP-07).
- **M1** Manual offer from the operator through the normal accept/commit path within the total deadline (REQ-DSP-10, REQ-OPS-04).
- **Low** Record the PostGIS-instead-of-Redis-GEO choice as an ADR, or add Redis (REQ-DSP-02, AC-10).

### Driver state (S-03)
- **M1** Revoke open offers when a free driver pauses or closes the shift (AC-11 rows "Пауза", "Выйти"), with tests per transition row for positive / forbidden actor / repeat / version conflict (AC-11).
- **M1** Driver account blocking that removes new orders but keeps a limited session for the ongoing trip (completion, support) instead of refusing every request (REQ-DS-01).
- **M1** Show the last heartbeat time on the support map (REQ-DS-03).
- **M1** Return-zone setting for drivers outside the city polygon (REQ-DS-07).
- **M1** Require location accuracy for eligibility, not only for arrival (REQ-GEO-04).

### Cancellation and exceptions (S-05, S-08)
- **M1** Catalog reason code (plus optional comment) for staff revoke-assignment and driver withdraw (REQ-CAN-01).
- **M1** Do not extend the search past the passenger's total without a shown consent; or add a consent command (REQ-CAN-05, REQ-PRC-07).
- **M1** Record contact attempts (calls/messages per order) and show them with a no-show (REQ-CAN-06).
- **M1** Correcting command for trip facts/times after the start (e.g. start pressed by mistake) with reason, author and blocked charge until review (REQ-CAN-07).

### Geography (S-04)
- **M1** Duplicate check for own addresses by city, house/building, coordinates and provider id (REQ-GEO-14).
- **M3** OSM import job with dry run, duplicate report and rollback (REQ-GEO-17; section 2 places address import in M3).

### Pricing (S-06)
- **M1** Payment constraints in the quote (snapshot and contract) (REQ-PRC-05).
- **M1** Final-fare correction as a new version with a delta posting, with permission and audit (REQ-PRC-10); its admin screen belongs to #30.
