-- SMS to a phone order's caller (REQ-NTF-08, section 20): a notification of channel SMS whose recipient is the
-- order's contact (recipient_id = the order). The phone is looked up when it is sent, never stored here.
alter table notification drop constraint notification_recipient_type_check;
alter table notification add constraint notification_recipient_type_check
    check (recipient_type in ('CLIENT', 'DRIVER', 'ORDER_CONTACT'));
alter table notification drop constraint notification_channel_check;
alter table notification add constraint notification_channel_check check (channel in ('PUSH', 'SMS'));
alter table notification add constraint notification_contact_by_sms_check
    check ((recipient_type = 'ORDER_CONTACT') = (channel = 'SMS'));
