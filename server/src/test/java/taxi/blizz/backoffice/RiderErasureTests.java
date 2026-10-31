package taxi.blizz.backoffice;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestQuotes;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.OtpAudience;
import taxi.blizz.identity.OtpService;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.CallerContact;
import taxi.blizz.operations.CreateOrder;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.OrderChannel;
import taxi.blizz.operations.OrderChat;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.operations.Ratings;
import taxi.blizz.operations.TripView;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;

/**
 * E1 of issue #144 (REQ-PRV-04, REQ-PRV-06, AC-24): after a rider's deletion no column of the schema holds their
 * phone or a word they wrote. The columns come from {@code information_schema}, not from a list of tables: every text,
 * varchar, char, jsonb, array and bytea column must be classified below, so a new column fails here until someone
 * decides what a deletion does to it. Only columns classified K (kept, with the register's basis) are left out of the
 * search.
 */
@SpringBootTest
@Import({TestcontainersConfiguration.class, ClientDeletionTests.Capture.class})
class RiderErasureTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.512345, 117.523456);
    static final GeoPoint DROPOFF = new GeoPoint(-39.456789, 117.587654);

    /**
     * R: the rider's data, erased or deleted by the deletion. N: not personal (codes, states, settings, the service's
     * directory, hashes). O: another person's data (drivers, staff, partners; register sections 2 and 18). K: kept with
     * a basis named in {@code docs/privacy/data-register.md}, and the only class not searched.
     */
    static final String COLUMNS = """
            N address: building_normalized building_raw house_normalized house_number house_raw house_suffix
            N address: instructions label language search_text source street street_normalized type visibility
            N address_alias: label language normalized search_text
            N address_history: action actor_type after before reason
            N address_override: object_id provider
            N assignment: close_reason close_reason_code close_reason_labels source state
            N audit_log: action actor_role actor_type after before reason resource_id resource_type
            R call: caller_phone caller_raw
            N call: called_number channel_id direction ended_reason party state
            N call_line: label number
            N call_recording: state
            N cancel_reason: audience code driver_outcome labels
            N card_binding: failure_reason reference state
            N card_top_up: account_type currency failure_reason masked_pan reference state
            N cash_dispute: currency decision reason
            N city: code currency name state timezone
            N city_operations: pause_reason payment_methods working_hours
            R client: language name phone_normalized
            N client: account_state blocked_reason deletion_previous_state
            K command_receipt: outcome
            N command_receipt: request_hash scope
            N consumer_inbox: consumer_id
            R device_session: device_ref
            N device_session: audience revoke_reason subject_type
            N dispatch_attempt: lease_owner phase
            O dispatch_round: candidates
            N dispatch_round: phase
            O driver: language name phone_normalized
            N driver: account_state deletion_previous_state eligibility_rules review_status
            N driver_balance_top_up: currency kind reason reference
            N driver_capacity: occupancy
            N driver_debt_limit: currency
            N driver_debt_refresh: currency
            N driver_debt_refresh_member: currency
            N driver_debt_status: currency
            O driver_document: decision_reason number
            N driver_document: decision type
            N driver_promotion: currency days_of_week name payment_method repeat state
            N driver_promotion_reward: currency
            N driver_restriction: kind source_ref
            O driver_review_event: reason
            N driver_review_event: actor_type from_status to_status
            O driver_risk_flag: evidence reason review_reason
            N driver_risk_flag: dedupe_key kind state
            O driver_transfer: comment
            N driver_transfer: currency
            N driver_transfer_rule: currency
            N feature_flag: key reason
            N file_object: declared_content_type detected_content_type encryption owner_type plain_key_pending_delete
            N file_object: purpose reject_reason scan_engine sha256 staging_key state storage_key
            N final_fare: breakdown currency policy
            N integration_value: hint name plain_value secret_value
            N invariant_report: check_id object_type
            N journal_line: account
            N journal_transaction: basis_type business_key currency reason
            N legal_acceptance: language subject_type
            N legal_document_version: audience kind state texts
            R notification: body data title
            N notification: channel last_error locale recipient_type state template
            N offer: state
            N operator_bonus_account: timezone
            N operator_bonus_entry: kind rule_key
            N operator_bonus_settings: reason time_rules
            N operator_status: status
            R order_contact: name phone
            N order_contact_attempt: kind
            N order_event: actor_type payload reason type
            R order_message: body
            N order_message: sender_role
            N order_tip: currency failure_reason method state
            R otp_challenge: client_ip device_ref phone_normalized
            N otp_challenge: audience channel code_hmac purpose
            R otp_delivery: phone provider_ref error
            N otp_delivery: audience channel provider state
            N outbox: aggregate_type event_type last_error lease_owner payload state
            O partner: contacts display_name exchange_endpoint legal_name
            N partner: allowed_cities allowed_classes state
            N payment_card: card_type masked_pan state token
            N payment_chargeback: bank_reason currency resolution_reason state
            K payment_event: payload
            N payment_event: fingerprint outcome reference status
            N payment_intent: currency state
            N payment_merchant: account currency domain provider secret_ref
            N payment_operation: provider_status reason reason_code reference state target type
            N payment_reconciliation: failure_code state
            N payment_reconciliation_entry: currency provider_status provider_type reference_fingerprint
            N payment_reconciliation_item: decision kind local_currency local_state local_type provider_currency
            N payment_reconciliation_item: provider_state provider_status provider_type reason reference_display
            N payment_reconciliation_item: reference_fingerprint state
            R personal_data_export: content error
            N personal_data_export: state
            N preorder_reservation: close_reason state
            N privacy_hold: basis object_type subject_type
            N promotion_grant: currency
            N promotion_quote: kind value_type
            R push_device: locale token
            N push_device: platform state subject_type
            R quote: snapshot
            N quote: currency fingerprint owner_type
            N rate_limit_hit: bucket
            R rating: comment
            N rating: author_type target_type
            N refresh_token: token_hash
            K report_export: content file_name
            N report_export: error kind state
            N retention_settings: days reason
            R ride_order: comment dropoff_label entrance pickup_label
            N ride_order: cancel_reason_code cancel_reason_labels cancelled_by channel created_by_type currency
            N ride_order: payment_method payment_state selected_payment_method source_ref status status_reason
            N ride_order: vehicle_class
            N rider_promotion: currency days_of_week kind name state value_type vehicle_class
            N rider_wallet: currency
            N rider_wallet_hold: currency state
            N rider_wallet_top_up: currency reason source state
            N safety_contacts: emergency_number extra reason support_phone
            N service_settings: reason settings
            O staff_activity: client_ip path resource_ids staff_login
            N staff_activity: audience kind method outcome role
            N staff_emergency_grant: city_scope permissions reason revoke_reason
            O staff_extension: extension
            O staff_sign_in: login
            N staff_sign_in: audience outcome
            O staff_user: email first_name last_name login name oidc_subject phone telegram
            N staff_user: city_scope mfa_policy password_hash permissions role state
            R support_case: resolution subject
            N support_case: category priority requester_type source_key state
            R support_message: body
            N support_message: author_type visibility
            R support_message_attachment: name
            N support_message_attachment: content_type
            N tariff_version: currency preorder_surcharge state waiting_rounding zone_surcharges
            N track_point: flags
            N trip: arrival_exception phase start_exception
            O vehicle: color make model registration_number
            N vehicle: class_approvals state
            N vehicle_class: code name
            N work_session: intent state
            N zone: state type
            """;

    @Autowired
    ClientDeletionReview review;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    SessionService auth;
    @Autowired
    OtpService otp;
    @Autowired
    OutboxRelay relay;
    @Autowired
    SupportCases support;
    @Autowired
    Orders orders;
    @Autowired
    Dispatch dispatch;
    @Autowired
    Trips trips;
    @Autowired
    WorkSessions sessions;
    @Autowired
    QuoteService quotes;
    @Autowired
    OrderChat chat;
    @Autowired
    Ratings ratings;

    // ------------------------------------------------------------ classification

    record Column(String table, String column) {
        @Override
        public String toString() {
            return table + "." + column;
        }
    }

    static Map<Column, Character> classification() {
        Map<Column, Character> classes = new LinkedHashMap<>();
        for (String line : COLUMNS.strip().split("\n")) {
            String[] parts = line.strip().split("\\s+");
            String table = parts[1].substring(0, parts[1].length() - 1);
            for (int i = 2; i < parts.length; i++) {
                Character previous = classes.put(new Column(table, parts[i]), parts[0].charAt(0));
                assertThat(previous).as("classified twice: %s.%s", table, parts[i]).isNull();
            }
        }
        return classes;
    }

    /** Every column of the schema that can hold text, as the database sees it now. */
    static List<Column> textColumns(JdbcClient jdbc) {
        return jdbc.sql("""
                        select c.table_name, c.column_name from information_schema.columns c
                        join information_schema.tables t on t.table_schema = c.table_schema
                                                         and t.table_name = c.table_name and t.table_type = 'BASE TABLE'
                        where c.table_schema = current_schema()
                          and c.data_type in ('text', 'character varying', 'character', 'jsonb', 'json', 'ARRAY',
                                              'bytea')
                          and c.table_name <> 'spatial_ref_sys' and c.table_name not like 'flyway%'
                        order by 1, 2""")
                .query((rs, i) -> new Column(rs.getString(1), rs.getString(2))).list();
    }

    @Test
    void everyTextColumnOfTheSchemaIsClassified() {
        Map<Column, Character> classes = classification();
        List<Column> columns = textColumns(jdbc);
        assertThat(columns).as("columns nobody classified for a deletion").allMatch(classes::containsKey);
        assertThat(classes.keySet()).as("classified columns that no longer exist").allMatch(columns::contains);
        assertThat(classes.values()).allMatch(c -> "RNOK".indexOf(c) >= 0);
    }

    // ------------------------------------------------------------ E1

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, state, created_at, updated_at)
                        values (:id, :login, 'Privacy', 'ADMIN', :permissions, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "erasure-" + id).param("permissions", permissions).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private String phone(Actor rider) {
        return jdbc.sql("select phone_normalized from client where id = :id").param("id", rider.id())
                .query(String.class).single();
    }

    private void deliverEvents() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    private OrderView order(TestRides rides, Actor payer, UUID city, String words, CallerContact contact) {
        UUID quote = new TestQuotes(jdbc, quotes).quote(payer, city, "STANDARD", PICKUP, DROPOFF).id();
        return orders.create(payer, UUID.randomUUID(), new CreateOrder(payer.id(), "STANDARD", PICKUP,
                "Home of " + words, DROPOFF, "Work of " + words, PaymentMethod.CASH, quote, OrderChannel.APP, null,
                contact, null, false, null, "Note: " + words, "Gate " + words));
    }

    /** {@code table.column} of every searched column holding one of {@code needles}; K columns are not searched. */
    private List<String> holders(List<String> needles) {
        Map<Column, Character> classes = classification();
        return holders(jdbc, needles, column -> classes.get(column) == Character.valueOf('K'));
    }

    /** {@code table.column} of every text column but the {@code skipped} holding one of {@code needles}. */
    static List<String> holders(JdbcClient jdbc, List<String> needles, java.util.function.Predicate<Column> skipped) {
        List<String> found = new ArrayList<>();
        for (Column column : textColumns(jdbc)) {
            if (skipped.test(column)) {
                continue;
            }
            String type = jdbc.sql("""
                            select data_type from information_schema.columns
                            where table_schema = current_schema() and table_name = :t and column_name = :c""")
                    .param("t", column.table()).param("c", column.column()).query(String.class).single();
            String value = "bytea".equals(type) ? "encode(\"%s\", 'escape')" : "\"%s\"::text";
            StringBuilder where = new StringBuilder();
            Map<String, Object> params = new LinkedHashMap<>();
            for (int i = 0; i < needles.size(); i++) {
                where.append(i == 0 ? "" : " or ").append(value.formatted(column.column())).append(" like :n")
                        .append(i);
                params.put("n" + i, "%" + needles.get(i) + "%");
            }
            long hits = jdbc.sql("select count(*) from \"%s\" where %s".formatted(column.table(), where))
                    .params(params).query(Long.class).single();
            if (hits > 0) {
                found.add(column.toString());
            }
        }
        return found;
    }

    private static double rounded(double value) {
        return Math.round(value * 100) / 100.0;
    }

    @Test
    void afterTheDeletionNoColumnHoldsTheRidersPhoneOrWords() {
        TestRides rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        UUID city = rides.city("test-rider-erasure", "UAH", 117);
        String words = "Sunflower" + UUID.randomUUID().toString().substring(0, 8);
        Actor rider = rides.client();
        String phone = phone(rider);
        jdbc.sql("update client set name = :name, language = 'uk' where id = :id")
                .param("name", "Olena " + words).param("id", rider.id()).update();
        String friend = "+48"
                + (600_000_000L + Math.floorMod(UUID.randomUUID().getLeastSignificantBits(), 99_999_999L));

        // The rider's ride for a friend, with a note, an entrance, a chat, a rating and a support case with a file.
        TestRides.Driver driver = rides.driverNear(PICKUP);
        OrderView order = order(rides, rider, city, words, new CallerContact("Friend " + words, friend));
        dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(),
                dispatch.offers(driver.actor()).getFirst().id());
        chat.post(rider, UUID.randomUUID(), order.id(), "I wear a red coat, " + words);
        chat.post(driver.actor(), UUID.randomUUID(), order.id(), "I am at the entrance");
        TripView trip = trips.current(driver.actor()).orElseThrow();
        rides.moveTo(driver, TestRides.north(PICKUP, 30));
        trip = trips.arrive(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), null);
        trip = trips.start(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), null);
        trips.complete(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), OffsetDateTime.now(), true);
        ratings.submit(rider, UUID.randomUUID(), order.id(), 2, "Rude, " + words);
        SupportCases.Case opened = support.open(rider, UUID.randomUUID(), SupportCases.Category.LOST_ITEM, order.id(),
                "Lost bag " + words, "Call me at " + phone + ", " + words);
        jdbc.sql("update support_case set state = 'RESOLVED', resolution = :r where id = :id")
                .param("r", "Returned to " + words).param("id", opened.id()).update();
        UUID message = jdbc.sql("select id from support_message where case_id = :id and author_type = 'CLIENT'")
                .param("id", opened.id()).query(UUID.class).single();
        UUID file = UUID.randomUUID();
        jdbc.sql("""
                        insert into file_object (id, owner_type, owner_id, purpose, declared_content_type,
                                                 declared_size_bytes, state, storage_key, upload_expires_at, created_at,
                                                 attached_at)
                        values (:id, 'CLIENT', :rider, 'SUPPORT_ATTACHMENT', 'image/png', 10, 'SAFE', :key,
                                now(), now(), now())""")
                .param("id", file).param("rider", rider.id()).param("key", "test/erasure/" + file).update();
        jdbc.sql("""
                        insert into support_message_attachment (message_id, file_id, content_type, size_bytes, name,
                                                                created_at)
                        values (:message, :file, 'image/png', 10, :name, now())""")
                .param("message", message).param("file", file).param("name", "bag-" + words + ".png").update();

        // Data known only by the phone: a sign-in code, a call with its recording, someone else's order for them.
        UUID challenge = otp.requestChallenge(OtpAudience.CLIENT, phone, "device-" + words, "10.1.2.3")
                .challengeId();
        jdbc.sql("""
                        insert into otp_delivery (id, challenge_id, phone, audience, channel, provider, state,
                                                  attempted_at)
                        values (:id, :challenge, :phone, 'CLIENT', 'SMS', 'FAKE', 'SENT', now())""")
                .param("id", UUID.randomUUID()).param("challenge", challenge).param("phone", phone).update();
        UUID call = UUID.randomUUID();
        jdbc.sql("""
                        insert into call (id, channel_id, caller_phone, caller_raw, called_number, state, started_at,
                                          ended_at)
                        values (:id, :channel, :phone, :raw, '+380441234567', 'ENDED', now(), now())""")
                .param("id", call).param("channel", "erasure-" + call).param("phone", phone)
                .param("raw", phone.substring(3)).update();
        jdbc.sql("""
                        insert into call_recording (call_id, state, next_attempt_at, created_at)
                        values (:id, 'PENDING', now() + interval '1 hour', now())""")
                .param("id", call).update();
        Actor other = rides.client();
        OrderView forThem = order(rides, other, city, "theirs", new CallerContact("Olena " + words, phone));
        orders.cancel(other, UUID.randomUUID(), forThem.id(), orders.get(forThem.id()).version(), "CHANGED_MIND");
        deliverEvents();
        // A push already sent to the rider whose text names their pickup.
        jdbc.sql("""
                        insert into notification (id, event_id, recipient_type, recipient_id, channel, template,
                                                  template_version, locale, title, body, data, state, next_attempt_at,
                                                  deadline, created_at)
                        values (:id, :event, 'CLIENT', :rider, 'PUSH', 'rider.driver-arrived', 1, 'uk', 'Arrived',
                                :body, cast(:data as jsonb), 'SENT', now(), now() + interval '1 hour', now())""")
                .param("id", UUID.randomUUID()).param("event", UUID.randomUUID()).param("rider", rider.id())
                .param("body", "The car is at Home of " + words)
                .param("data", "{\"label\":\"Home of " + words + "\"}").update();
        String digits = phone.substring(phone.length() - 9);
        String friendDigits = friend.substring(friend.length() - 9);
        assertThat(holders(List.of(digits, friendDigits, words))).as("the fixture spread the data")
                .contains("client.phone_normalized", "ride_order.comment", "order_message.body", "rating.comment",
                        "support_message.body", "support_message_attachment.name", "call.caller_phone",
                        "otp_challenge.phone_normalized", "otp_delivery.phone", "order_contact.phone",
                        "notification.body", "notification.data");
        assertThat(jdbc.sql("select count(*) from command_receipt where scope like :scope")
                .param("scope", "CLIENT:" + rider.id() + ":%").query(Long.class).single()).isPositive();

        jdbc.sql("""
                        update client set account_state = 'DELETION_PENDING', deletion_previous_state = 'ACTIVE',
                                          deletion_requested_at = now() where id = :id""")
                .param("id", rider.id()).update();
        assertThat(review.complete(staff(ClientDeletionReview.DELETE_PERMISSION), UUID.randomUUID(), rider.id(),
                "Confirmed by the rider").accountState()).isEqualTo("ANONYMIZED");
        deliverEvents();

        assertThat(new TreeSet<>(holders(List.of(digits, friendDigits, words))))
                .as("columns still holding the deleted rider's phone, their friend's phone or their words").isEmpty();
        // Receipts are K: the rider's own go now; a driver's trip commands may repeat the note until the receipts'
        // retention term (register, section 16).
        assertThat(jdbc.sql("select count(*) from command_receipt where scope like :scope")
                .param("scope", "CLIENT:" + rider.id() + ":%").query(Long.class).single())
                .as("the rider's own command receipts").isZero();

        // Points: about 1 km, enough for the city and zone statistics and the fare, not for the address.
        Map<String, Object> points = jdbc.sql("""
                        select ST_Y(pickup) as plat, ST_X(pickup) as plon, ST_Y(dropoff) as dlat, ST_X(dropoff) as dlon,
                               status, price_minor, final_fare_id from ride_order where id = :id""")
                .param("id", order.id()).query().singleRow();
        assertThat(points).containsEntry("plat", rounded(PICKUP.lat())).containsEntry("plon", rounded(PICKUP.lon()))
                .containsEntry("dlat", rounded(DROPOFF.lat())).containsEntry("dlon", rounded(DROPOFF.lon()))
                .containsEntry("status", "FULFILLED").containsEntry("price_minor", order.priceMinor());
        assertThat(points.get("final_fare_id")).as("the fare facts stay").isNotNull();
        List<Double> quoted = jdbc.sql("""
                        select (jsonb_array_elements(jsonb_path_query_array(snapshot, 'lax $.**.lat')
                                || jsonb_path_query_array(snapshot, 'lax $.**.lon')))::text::float8
                        from quote where owner_id = :id""")
                .param("id", rider.id()).query(Double.class).list();
        assertThat(quoted).isNotEmpty().allMatch(v -> v == rounded(v));
        // The other rider's order keeps its own data.
        assertThat(jdbc.sql("select pickup_label from ride_order where id = :id").param("id", forThem.id())
                .query(String.class).single()).isEqualTo("Home of theirs");
        // What the driver wrote stays; files and recordings are queued for deletion from storage.
        assertThat(jdbc.sql("select body from order_message where order_id = :id order by sequence")
                .param("id", order.id()).query(String.class).list()).containsExactly("[deleted]",
                "I am at the entrance");
        assertThat(jdbc.sql("select count(*) from file_object where id = :id and erase_requested_at is null")
                .param("id", file).query(Long.class).single()).isZero();
        assertThat(jdbc.sql("select count(*) from call_recording where call_id = :id and erase_requested_at is null")
                .param("id", call).query(Long.class).single()).isZero();

        // A redelivered event and a replay after a restore change nothing more.
        UUID event = jdbc.sql("""
                        select event_id from outbox where event_type = 'ClientAnonymized' and aggregate_id = :id""")
                .param("id", rider.id()).query(UUID.class).single();
        jdbc.sql("delete from consumer_inbox where event_id = :id").param("id", event).update();
        jdbc.sql("update outbox set state = 'PENDING', next_attempt_at = now() where event_id = :id")
                .param("id", event).update();
        deliverEvents();
        assertThat(jdbc.sql("select body from order_message where order_id = :id order by sequence")
                .param("id", order.id()).query(String.class).list()).containsExactly("[deleted]",
                "I am at the entrance");
        assertThat(jdbc.sql("select pickup_label from ride_order where id = :id").param("id", order.id())
                .query(String.class).single()).isEqualTo("—");
    }
}
