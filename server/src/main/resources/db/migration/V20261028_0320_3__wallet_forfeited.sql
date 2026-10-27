-- Bonuses of a rider who deleted the account burn (owner decision 27.10.2026, issue #56): the rest of RIDER_WALLET
-- goes to WALLET_FORFEITED, the service's income.
alter table journal_line drop constraint journal_line_account_check;
alter table journal_line add constraint journal_line_account_check
    check (account in ('RIDER_RECEIVABLE', 'DRIVER_PAYABLE', 'SERVICE_COMMISSION', 'SERVICE_FUNDS',
                       'PROVIDER_CLEARING', 'PARTNER_SETTLEMENT', 'TIPS_PAYABLE', 'REFUNDS_PAYABLE', 'SUSPENSE',
                       'SERVICE_EXPENSE', 'RIDER_WALLET', 'PROMO_EXPENSE', 'WALLET_FORFEITED'));
