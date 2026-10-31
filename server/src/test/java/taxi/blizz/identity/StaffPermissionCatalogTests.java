package taxi.blizz.identity;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Set;
import org.junit.jupiter.api.Test;
import taxi.blizz.backoffice.ClientDeletionReview;
import taxi.blizz.backoffice.SupportCases;
import taxi.blizz.configuration.Integrations;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.driver.DriverAdmission;
import taxi.blizz.finance.DriverDebts;
import taxi.blizz.finance.RiderWallets;
import taxi.blizz.geo.GeoConfiguration;
import taxi.blizz.operations.OrderChat;
import taxi.blizz.operations.Orders;
import taxi.blizz.operatorbonus.OperatorBonuses;
import taxi.blizz.pricing.TariffService;
import taxi.blizz.telephony.Calls;
import taxi.blizz.promotions.RiderPromotions;

/** Every permission a module checks can be ticked in the admin panel, and nothing else can. */
class StaffPermissionCatalogTests {

    @Test
    void theCatalogListsExactlyThePermissionsTheModulesCheck() {
        assertThat(StaffPermissions.CODES).containsExactlyInAnyOrderElementsOf(Set.of(
                Orders.CREATE_PERMISSION, Orders.CANCEL_PERMISSION, Orders.REASSIGN_PERMISSION, Orders.INTERRUPT_PERMISSION,
                Orders.OFFER_PERMISSION,
                OrderChat.VIEW_PERMISSION, DriverAdmission.REVIEW_PERMISSION, GeoConfiguration.MANAGE_PERMISSION,
                TariffService.MANAGE_PERMISSION, DriverDebts.MANAGE_PERMISSION, StaffPermissions.AUDIT_VIEW,
                StaffPermissions.REPORTS_VIEW, taxi.blizz.configuration.LegalDocuments.MANAGE_PERMISSION,
                ServiceSettings.MANAGE_PERMISSION, taxi.blizz.configuration.RetentionSettings.MANAGE_PERMISSION, SupportCases.MANAGE_PERMISSION, Integrations.MANAGE_PERMISSION,
                RiderWallets.MANAGE_PERMISSION, RiderPromotions.MANAGE_PERMISSION, OperatorBonuses.MANAGE_PERMISSION,
                ClientDeletionReview.DELETE_PERMISSION, taxi.blizz.identity.ClientAccounts.MANAGE_PERMISSION,
                Calls.ANSWER_PERMISSION, Calls.LISTEN_PERMISSION,
                Calls.SUPERVISE_PERMISSION, taxi.blizz.operations.DriverRiskFlags.RISK_PERMISSION,
                taxi.blizz.payments.PaymentOperations.RETRY_PERMISSION,
                taxi.blizz.configuration.FeatureFlags.MANAGE_PERMISSION));
    }
}
