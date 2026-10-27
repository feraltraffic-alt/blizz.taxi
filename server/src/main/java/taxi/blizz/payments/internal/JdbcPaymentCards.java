package taxi.blizz.payments.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.identity.AccountDirectory;
import taxi.blizz.payments.PaymentCards;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.SubjectType;

@Service
class JdbcPaymentCards implements PaymentCards {

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final Merchants merchants;
    private final Providers providers;
    private final PaymentsProperties properties;
    private final AccountDirectory accounts;
    private final Clock clock;

    JdbcPaymentCards(JdbcClient jdbc, IdempotentCommands commands, Merchants merchants, Providers providers,
                     PaymentsProperties properties, AccountDirectory accounts, Clock clock) {
        this.jdbc = jdbc;
        this.commands = commands;
        this.merchants = merchants;
        this.providers = providers;
        this.properties = properties;
        this.accounts = accounts;
        this.clock = clock;
    }

    record StartRequest(UUID cityId) {
    }

    @Override
    public Binding startBinding(Actor rider, UUID commandId, UUID cityId) {
        requireRider(rider);
        Merchant merchant = merchants.forCity(cityId)
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Cards are not accepted in this city"));
        return commands.execute(new CommandKey(rider, "card.bind", commandId), new StartRequest(cityId), Binding.class,
                () -> {
                    UUID id = UUID.randomUUID();
                    String reference = "card-" + id;
                    OffsetDateTime now = now();
                    OffsetDateTime expiresAt = now.plus(properties.bindingTtl());
                    jdbc.sql("""
                                    insert into card_binding (id, client_id, merchant_id, reference, state, created_at,
                                                              expires_at)
                                    values (:id, :client, :merchant, :reference, 'PENDING', :now, :expires)""")
                            .param("id", id).param("client", rider.id()).param("merchant", merchant.id())
                            .param("reference", reference).param("now", now).param("expires", expiresAt).update();
                    String returnUrl = properties.publicBaseUrl() + "/payments/v1/return?binding=" + id;
                    PaymentProvider.Form form = providers.of(merchant).cardVerifyForm(merchant, reference, returnUrl,
                            properties.publicBaseUrl() + "/payments/v1/callbacks/" + merchant.id(),
                            accounts.phone(rider).orElse(null));
                    return new Binding(id, "PENDING", form.url(), form.fields(), returnUrl, expiresAt, null, null);
                });
    }

    @Override
    @Transactional(readOnly = true)
    public Binding binding(Actor rider, UUID bindingId) {
        requireRider(rider);
        record Row(String state, OffsetDateTime expiresAt, UUID cardId, String failure) {
        }
        Row row = jdbc.sql("""
                        select state, expires_at, card_id, failure_reason from card_binding
                        where id = :id and client_id = :client""")
                .param("id", bindingId).param("client", rider.id())
                .query((rs, i) -> new Row(rs.getString(1), rs.getObject(2, OffsetDateTime.class),
                        rs.getObject(3, UUID.class), rs.getString(4)))
                .optional().orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Binding not found"));
        String state = "PENDING".equals(row.state()) && !now().isBefore(row.expiresAt()) ? "EXPIRED" : row.state();
        Card card = row.cardId() == null ? null : card(row.cardId()).orElse(null);
        return new Binding(bindingId, state, null, null, null, row.expiresAt(), card, row.failure());
    }

    @Override
    @Transactional(readOnly = true)
    public List<Card> cards(Actor rider) {
        requireRider(rider);
        return jdbc.sql("""
                        select id, merchant_id, masked_pan, card_type, created_at from payment_card
                        where client_id = :client and state = 'ACTIVE' order by created_at desc""")
                .param("client", rider.id()).query((rs, i) -> card(rs)).list();
    }

    record RemoveRequest(UUID cardId) {
    }

    @Override
    public void remove(Actor rider, UUID commandId, UUID cardId) {
        requireRider(rider);
        commands.execute(new CommandKey(rider, "card.remove", commandId), new RemoveRequest(cardId), Boolean.class, () -> {
            int changed = jdbc.sql("""
                            update payment_card set state = 'REMOVED', removed_at = :now, version = version + 1
                            where id = :id and client_id = :client and state = 'ACTIVE'""")
                    .param("now", now()).param("id", cardId).param("client", rider.id()).update();
            if (changed == 0) {
                throw new DomainException(ErrorCode.NOT_FOUND, "Card not found");
            }
            return true;
        });
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Card> cardFor(UUID clientId, UUID cityId) {
        return jdbc.sql("""
                        select k.id, k.merchant_id, k.masked_pan, k.card_type, k.created_at from payment_card k
                        join payment_merchant_city c on c.merchant_id = k.merchant_id and c.city_id = :city
                        where k.client_id = :client and k.state = 'ACTIVE' order by k.created_at desc limit 1""")
                .param("client", clientId).param("city", cityId).query((rs, i) -> card(rs)).optional();
    }

    private Optional<Card> card(UUID cardId) {
        return jdbc.sql("select id, merchant_id, masked_pan, card_type, created_at from payment_card where id = :id")
                .param("id", cardId).query((rs, i) -> card(rs)).optional();
    }

    private static Card card(java.sql.ResultSet rs) throws java.sql.SQLException {
        return new Card(rs.getObject("id", UUID.class), rs.getObject("merchant_id", UUID.class),
                rs.getString("masked_pan"), rs.getString("card_type"), rs.getObject("created_at", OffsetDateTime.class));
    }

    private OffsetDateTime now() {
        return clock.instant().truncatedTo(ChronoUnit.MICROS).atOffset(ZoneOffset.UTC);
    }

    private static void requireRider(Actor actor) {
        if (actor == null || actor.type() != SubjectType.CLIENT) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Only riders have cards");
        }
    }
}
