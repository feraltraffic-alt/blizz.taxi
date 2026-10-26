# UI reference

Figma: [Taxi Platform — Driver + Passenger (themes)](https://www.figma.com/design/6QYyqBdQSxcqFKghUJPHPF/Taxi-Platform-%E2%80%94-Driver---Themes)

The mockups are a **visual reference**, not a complete specification. The apps implement every screen and state required by the specification in the same visual language; screens missing from the mockups are designed in code.

## Covered by the mockups

Light and dark theme for each screen, plus a taximeter component (driving / waiting).

**Driver:** 01 off line · 02 on line · 03 new offer · 04 "ALL" tab · 05 to pickup · 06 waiting · 07 on trip · 08 trip result · 09 earnings · 10 pause · 11 no connection · 12 profile and documents.

**Passenger:** home · route · class selection · searching · driver on the way · driver arrived · trip · result.

## To be designed in code (gaps against the specification)

Driver:
- [ ] Trip result for cash: "received / not received" (REQ-PAY-15)
- [ ] Payment still being confirmed, next order still allowed (REQ-DS-12)
- [ ] Offer expired or taken by another driver (OFFER_EXPIRED, T-05)
- [ ] Command pending / confirmed / rejected while offline (REQ-DRV-10)
- [ ] OTP sign-in; verification: submit, changes required, rejected, suspended, document expired (REQ-DRV-02, REQ-DRV-05)
- [ ] Pause after current trip; financial restriction (debt)
- [ ] Earnings: refunds, corrections, debt (REQ-DRV-12)

Passenger:
- [ ] Sign-in: phone, code, consents
- [ ] Location permission denied, manual address (REQ-RID-01)
- [ ] Outside service area; no class available
- [ ] Card hold pending / declined / unknown (AWAITING_PAYMENT)
- [ ] No drivers found (UNFULFILLED)
- [ ] Cancellation with fee confirmation (REQ-RID-07)
- [ ] Driver replaced (REQ-RID-05)
- [ ] Safety and support button during the trip (REQ-RID-09)
- [ ] History, profile (payment methods, account deletion), debt

All screens: loading, empty, offline, stale data, retrying, error states (REQ-UX-01).

## Decisions

- **Theme:** chosen in settings with "Light / Dark / System"; the floating theme button in the mockups is a demo control only.
- **Branding:** colours, logo and app name are design tokens per service, never hard-coded (REQ-TEN-07). Mockup values are the default theme.
- **Chat ("Написать"):** in-app chat between client and driver, tied to the order. The full conversation is stored and shown in the admin panel in the order details. Access in the admin follows the order's scope and is audited; retention follows the data retention matrix (Q-19).
- **Calls ("Позвонить"):** the mode is a service setting in the admin panel (product owner decision, 26.10.2026):
  - `DIRECT` — the app dials the other party's real number;
  - `VIA_SERVICE_NUMBERS` — the call goes through the service's numbers, the real numbers stay hidden (depends on the SIP provider, Q-18).
  The setting is versioned and audited like other service settings (REQ-TEN-06). In `DIRECT` mode the number stays in the phone's call log, so REQ-SEC-04 ("no lasting access to the passenger's phone after the trip") holds only with `VIA_SERVICE_NUMBERS`; the admin shows this when the mode is changed.
