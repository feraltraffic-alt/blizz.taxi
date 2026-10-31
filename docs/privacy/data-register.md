# Personal data register

- Status: draft for the owner (REQ-PRV-01, AC-24; issue #144), 31 October 2026
- Source of every term below: the code on `main` on that date. A term set in the admin panel (Retention, issue #118)
  is given with its default and the words "panel default"; the owner changes it there without a release.

This register lists each category of personal data the service keeps: why, on what basis, who controls it, who
receives it, where it is stored, how long, what happens at the end, whether a legal hold stops that, and who answers
for it. It describes what the code does today. Where the code does not yet do what the row needs, the row says
**gap** and names the work that closes it.

Legal questions are not decided here. Every field that needs a lawyer or the owner says **owner** and is repeated in
the list at the end (open question Q-19 of the specification: terms, legal bases, legal hold and cross-border
transfer). A field marked **owner** is not consent to any assumption (specification, section "Open questions").

## Fields

| Field | Meaning |
|---|---|
| Purpose | What the service needs the data for |
| Basis | The legal basis (GDPR art. 6 for Poland; the Law of Ukraine "On personal data protection" for Ukraine) |
| Controller | Who decides the purpose: the service operator, a partner fleet, or both |
| Recipients | Who outside the database gets the data: people in the product, staff, processors |
| Region | Where it is stored |
| Term | How long, and whether the code enforces it |
| At expiry | Deleted, anonymized or kept |
| Legal hold | What stops deletion |
| Owner | The role inside the operator who answers for the category |

Common to all rows:

- **Region:** the PostgreSQL database and the files directory of the deployment. The deployment region is not
  fixed in the repository: **owner**. Backups follow the database; the erasure journal (ADR 0013) lies on storage
  of its own and is not restored with the database.
- **Controller:** the operator of the service in each city. Partner fleets (REQ-TEN, `partner`) get no rider data by
  default (REQ-PRV-03); whether a partner is a joint controller or a processor for its own drivers: **owner**.
- **Staff access** goes through permissions and the order's scope; reading personal data in the admin panel is
  audited (REQ-SEC, `audit_log`).
- **Rider deletion** (#56, ADR 0013, #144): the account is anonymized after the grace period. What other modules
  know only by the phone (call log, code deliveries, someone else's order contact) is erased in the same transaction
  through `ClientErasing`; the phone never goes into an event. What they know by the rider's id follows
  `ClientAnonymized`. The erasure journal applies both again after a restore. Free text becomes `[deleted]`, labels
  `—`, points are rounded to two decimals (about 1 km), files are deleted from storage. An order with an open
  chargeback is held (`privacy_hold`) until the chargeback is decided. `RiderErasureTests` reads every text column of
  the schema and finds neither the phone nor the rider's words after a deletion.
- **Driver deletion** (#144): the same shape. The driver asks with a code; while the request is pending the
  session is limited like a blocked driver's and no order is offered. Staff complete it once no trip, offer,
  reservation, debt or open cash dispute is left (`DRIVER_HAS_ACTIVE_WORK`, `DRIVER_HAS_DEBT`,
  `DRIVER_HAS_DISPUTE`). Phone-only data goes through `DriverErasing`, the rest follows `DriverAnonymized`, and the
  erasure journal replays it after a restore. `DriverErasureTests` runs the same every-column search for the driver.
  Staff deletion does not exist: **owner** (staff accounts are deactivated, question 9).

## Categories

### 1. Rider account

- **Data:** `client` (phone, name, language, account state), `legal_acceptance` of the rider.
- **Purpose:** sign-in, contact about an order, the language of texts, proof that terms were accepted (REQ-PRV-08).
- **Basis:** contract (art. 6(1)(b)); acceptance records: legal obligation or legitimate interest — **owner**.
- **Recipients:** the assigned driver gets neither the rider's name nor phone (calls go through the service's
  numbers); the caller's name is shown to operators on an incoming call; staff in scope.
- **Term:** while the account exists. Not enforced by time: an account without orders for years is kept — **owner**
  (inactive-account term).
- **At expiry:** on the rider's deletion: phone, name and language set to null, state `ANONYMIZED`; data exports,
  receipts of the rider's commands and device references of their sessions deleted. Acceptance rows stay (proof of
  what was accepted) — **owner**.
- **Legal hold:** an open chargeback holds the order it disputes (category 6). An unpaid debt, an active order or an
  open support case blocks the deletion itself (#56). Other holds (complaint, police request) — **owner**.
- **Owner:** **owner** (data protection lead).

### 2. Driver account, vehicle and documents

- **Data:** `driver` (phone, name), `vehicle` (registration number, model, colour), `driver_document` (type,
  number, validity, the file of the scan), `driver_review_event`, `driver_restriction`, `driver_risk_flag`,
  `driver_admission_city`, the driver's `legal_acceptance`.
- **Purpose:** admission to work (licence, permit, insurance), showing the car to the rider, safety and fraud
  control.
- **Basis:** contract with the driver; documents: legal obligation of a taxi operator — **owner** per country.
- **Recipients:** the rider sees the name, car and registration number of the assigned driver; staff with
  `drivers.*` permissions; document scans only to reviewers.
- **Term:** while the driver works with the service, then until the driver asks for the deletion. How long a taxi
  operator must keep the document files as proof of the licence check: **owner**; the setting
  `DRIVER_DOCUMENT_KEEP` (`blizz.driver.document-keep`) holds the answer, 0 by default = deleted with the erasure.
- **At expiry:** on the driver's deletion: phone, name and language cleared, state `ANONYMIZED`, every session and
  push device ends, an open shift is closed. The documents keep their type, validity and decision; their numbers and
  the reviewers' reasons are cleared at once, their files are deleted from storage after `DRIVER_DOCUMENT_KEEP`. The
  driver's chat messages, rating comments and support texts become `[deleted]`, support files are deleted. Codes,
  code deliveries and the calls of the driver's phone are erased as for a rider. The vehicle (plate, model, colour)
  stays with the trips it served — basis **owner**. Review events and risk flags keep staff's reasons — **owner**.
- **Legal hold:** a trip, offer or reservation, a debt to the service, or a cash dispute not decided blocks the
  deletion itself (each with its code). An investigation — **owner**.
- **Copy of the data** (#144, REQ-PRV-07): the driver asks with a code and downloads one JSON file within 7 days:
  profile, documents (type, number, validity, decision; never the files), vehicles, shifts, trips (times, city,
  class, prices, payment method; nothing of the rider), balance movements and sign-in sessions. Open to a blocked
  driver and to one whose deletion is pending; dropped at once on the driver's deletion.
- **Owner:** **owner** (driver operations).

### 3. Sign-in codes and code deliveries

- **Data:** `otp_challenge` (phone, hash of the code), `otp_delivery` (phone, channel, provider status).
- **Purpose:** proving the phone at sign-in, phone change, deletion and data export; limiting SMS cost and abuse.
- **Basis:** contract; abuse control: legitimate interest — **owner**.
- **Recipients:** the SMS provider (TurboSMS) and the service's own Asterisk for code calls (ADR 0012, Q-18).
- **Term:** panel default 90 days each (`sign_in_codes`, `code_deliveries`); enforced by the retention job (#118).
- **At expiry:** rows deleted. On a rider's deletion the codes and deliveries of the rider's phone (audience CLIENT)
  are deleted at once.
- **Legal hold:** none.
- **Owner:** **owner**.

### 4. Calls and call recordings

- **Data:** `call` (caller phone as dialled and normalized, line, times), `call_order`, `call_recording` and the
  recording files (a disk of their own, `CALL_RECORDINGS_DIR`).
- **Purpose:** taking orders by phone, quality and dispute resolution; recording is mandatory (ADR 0012, item 5).
- **Basis:** **owner** (contract or legitimate interest; notice to the caller before recording).
- **Recipients:** operators in scope; listening needs a permission and each listening is audited (REQ-OPS-09).
- **Term:** recordings: panel default 0 = kept for ever until the owner sets a term (`call_recordings`). Call rows
  are not on the retention list and are kept for ever — **owner**.
- **At expiry:** files deleted first, then their rows (#118).
- **On a rider's deletion:** the caller's number (normalized and as dialled) is cleared from every call from the
  rider's phone; the call rows stay without it. Their recordings are discarded on Asterisk and deleted from storage
  whatever the term, by the recording sweep. A number that could not be parsed (no normalized phone) is not matched.
- **Legal hold:** none in code; a recording needed for a complaint or police request — **owner**.
- **Owner:** **owner** (operations).

### 5. Order contact (ordering for someone else)

- **Data:** `order_contact` (name and phone of the person who rides), `order_contact_attempt`.
- **Purpose:** the driver reaches the person at the pickup; the no-show rule (#143).
- **Basis:** contract with the ordering rider; the person riding is a third party — **owner**.
- **Recipients:** the assigned driver while the trip is open: the name, and the phone only when calls are DIRECT
  (otherwise calls go through the service's numbers); staff in scope.
- **Term:** kept with the order, for ever — **owner**.
- **At expiry:** none by time (a term for closed orders: **owner**). The contact is deleted when the ordering rider
  is deleted, and when the person named is a rider who deletes their account (matched by phone).
- **Legal hold:** an open chargeback on the order keeps the contact until it is decided.
- **Owner:** **owner**.

### 6. Orders and trips

- **Data:** `ride_order` (pickup and drop-off points and labels, the rider's comment and entrance), `trip`,
  `assignment`, `order_event` (payload), `quote`, `final_fare`, `order_tip`, `offer`, `dispatch_attempt`.
- **Purpose:** performing the ride, pricing, receipts, disputes, reporting.
- **Basis:** contract; accounting: legal obligation — **owner**.
- **Recipients:** rider and assigned driver; staff in scope; the payment provider sees the amount only.
- **Term:** kept for ever — **owner** (accounting term per country). Points remain identifying after the name is
  gone (REQ-PRV-06).
- **At expiry:** none by time. On the rider's deletion the order keeps its facts (status, price, final fare, times,
  driver, the rider id of an anonymized account). The labels become `—`, the note and the entrance `[deleted]`. The
  pickup, drop-off and interruption points are **rounded to two decimals** (about 1 km): enough for city and zone
  statistics and the fare facts, not for the address (a pickup repeated over many orders is the rider's home). The
  same rounding applies to the points in the rider's quotes. The trip track and the dispatch journal still hold the
  driver's positions near the pickup until their own terms (90 days, categories 7 and 12).
- **Legal hold:** an open chargeback keeps the order exact (labels, note, points, contact, chat) under a
  `privacy_hold` row; when the chargeback is decided, a sweep (every 10 minutes) anonymizes it like the rest and
  releases the hold. Cash disputes and investigations — **owner**.
- **Owner:** **owner**.

### 7. Dispatch journal

- **Data:** `dispatch_round` (candidates, distances, the reason each was skipped).
- **Purpose:** explaining why a driver did or did not get an order (REQ-DSP-12).
- **Basis:** legitimate interest — **owner**.
- **Recipients:** staff in scope.
- **Term:** 90 days (`blizz.dispatch.journal-retention`, environment setting), enforced.
- **At expiry:** rows deleted.
- **Legal hold:** none.
- **Owner:** **owner**.

### 8. Chat between rider and driver

- **Data:** `order_message` (text).
- **Purpose:** agreeing on the pickup; shown to staff in the order's details (design README, "Chat").
- **Basis:** contract — **owner**.
- **Recipients:** the two parties of the order; staff in scope, audited.
- **Term:** kept for ever with the order — **owner** (design README defers it to Q-19).
- **At expiry:** none by time. On the rider's deletion every message the rider wrote becomes `[deleted]`; what the
  driver wrote stays. Messages stay append-only otherwise: the database allows only this one change.
- **Legal hold:** complaint or investigation.
- **Owner:** **owner**.

### 9. Support

- **Data:** `support_case` (subject), `support_message` (text), `support_message_attachment` (file name and file).
- **Purpose:** handling complaints, lost items, safety reports.
- **Basis:** contract; safety reports: legitimate or vital interest — **owner**.
- **Recipients:** support staff in scope.
- **Term:** kept for ever — **owner**.
- **At expiry:** none by time. On the rider's deletion their cases keep the number, category, order, states and
  times; the subject, the resolution and every message in them (staff replies and notes included: they are about
  the rider) become `[deleted]`; attachments lose their names and their files are deleted from storage.
- **Legal hold:** open case, safety incident.
- **Owner:** **owner** (support).

### 10. Ratings

- **Data:** `rating` (score and comment).
- **Purpose:** quality of service, driver restrictions.
- **Basis:** legitimate interest — **owner**.
- **Recipients:** the rated driver sees the score without the rider's name; staff.
- **Term:** kept for ever — **owner**.
- **At expiry:** none by time; on the rider's deletion their comments become `[deleted]`, the scores stay.
- **Owner:** **owner**.

### 11. Address searches and the address directory

- **Data:** `address_search_request` (rider id and time; behind the search rate limit). The directory `address`,
  `address_alias`, `address_history` is the service's own and holds no rider data (labels typed by staff).
- **Purpose:** limiting the cost of the geocoder; the directory serves every rider.
- **Basis:** legitimate interest.
- **Recipients:** the typed text goes to the geocoder (Google) — **owner** (processor and transfer outside the EEA).
- **Term:** search rows: deleted when the rate window passes and on the rider's deletion.
- **At expiry:** deleted.
- **Owner:** **owner**.

### 12. Trip track and positions

- **Data:** `track_point`, `driver_last_position`, `location_batch_request`.
- **Purpose:** dispatch, the trip route, disputes about the route (REQ-PRV-02).
- **Basis:** contract with the driver; legitimate interest for disputes — **owner**.
- **Recipients:** the rider sees the assigned car on the map during the trip; staff in scope.
- **Term:** points outside a trip 24 hours, points of a trip 90 days (`blizz.location.retention`, environment
  settings), enforced by `TrackRetentionSweep`. `driver_last_position` is one row per driver, overwritten — kept
  while the driver exists.
- **At expiry:** deleted.
- **Legal hold:** none in code; a route under dispute after 90 days is lost — **owner**.
- **Owner:** **owner**.

### 13. Payments, cards, wallet and promotions

- **Data:** `payment_card` and `card_binding` (provider token, masked number, expiry; never the full number),
  `payment_intent`, `payment_operation`, `payment_event`, `payment_chargeback`, `cash_dispute`, `rider_wallet*`,
  `rider_promotion`, `promotion_*`.
- **Purpose:** charging the ride, refunds, chargebacks, bonuses.
- **Basis:** contract; accounting and anti-money-laundering: legal obligation — **owner**.
- **Recipients:** the payment provider (WayForPay) as processor or controller — **owner**.
- **Term:** kept for ever (finance is not on the retention list, #118) — **owner** (accounting term).
- **At expiry:** on the rider's deletion cards are unbound at the provider and deleted, wallet bonuses burn
  (`AnonymizedClientCards`, `AnonymizedClientWallet`); payments stay (AC-24: deletion does not delete the financial
  journal).
- **Legal hold:** chargeback or dispute.
- **Owner:** **owner** (finance).

### 14. Ledger, driver balance and earnings

- **Data:** `journal_transaction`, `journal_line`, `driver_balance_top_up`, `driver_debt_*`, `driver_promotion*`,
  `driver_transfer`, `operator_bonus_*`.
- **Purpose:** what the service and the driver owe each other.
- **Basis:** legal obligation (accounting) — **owner**.
- **Recipients:** the driver sees their own balance; finance staff.
- **Term:** kept for ever; never deleted by any job (#118) — **owner** (accounting term).
- **At expiry:** none; rows refer to ids, not names. A deleted driver's lines stay unchanged under the driver id
  (AC-24; `DriverDeletionTests` compares them before and after).
- **Owner:** **owner** (finance).

### 15. Notifications and push devices

- **Data:** `push_device` (FCM token), `notification` (text and data of each message), `outbox` payloads.
- **Purpose:** telling the rider and driver what happens to the order.
- **Basis:** contract.
- **Recipients:** Firebase Cloud Messaging (Google) — **owner** (transfer outside the EEA); SMS fallback through the
  SMS provider.
- **Term:** delivered outbox rows: panel default 30 days (`delivered_events`). Notifications: kept for ever —
  **owner**. Devices: until the app signs out or the account is deleted.
- **At expiry:** on the rider's deletion devices and unsent notifications are deleted; sent ones keep their
  template, channel, state and times, with title and text `[deleted]` and no data. Outbox payloads carry ids only
  (REQ-NTF-04; the chat event leaves the text out).
- **Owner:** **owner**.

### 16. Sessions, devices and technical receipts

- **Data:** `refresh_token`, `device_session` (device reference), `command_receipt`, `consumer_inbox`,
  `rate_limit_hit`.
- **Purpose:** keeping the user signed in, exactly-once commands, abuse limits.
- **Basis:** contract; legitimate interest.
- **Recipients:** none outside the database.
- **Term:** sessions 30 days after expiry or revocation, command and consumer receipts 30 days (panel defaults);
  rate-limit rows when the window passes. `device_session` is not on the list — **gap** (kept for ever).
- **At expiry:** deleted. On a rider's deletion the receipts of the rider's own commands and the device references
  of their sessions go at once. A receipt keeps the answer to a command for its repeat, so the receipts of the
  driver's trip commands repeat the rider's note, entrance and contact until the receipts' term (30 days by
  default): a residual copy, read only by a repeat of that driver's command.
- **Owner:** **owner**.

### 17. Files

- **Data:** `file_object` and files on disk: document scans, support attachments, data exports, report exports.
- **Purpose:** as the category that owns the file.
- **Term:** never-attached uploads 7 days, quarantined files 30 days (panel defaults). A rider's data export is
  dropped 7 days after it is ready (`blizz.privacy.data-export-keep`; its content is set to null), and at once on
  the rider's deletion.
- **At expiry:** file deleted first, then the row. A file whose owner record asks for its erasure (a deleted
  rider's support attachment) is deleted the same way whatever the terms, by the erasure sweep.
- **Owner:** **owner**.

### 18. Audit log and staff

- **Data:** `audit_log` (actor, action, reason, before/after), `staff_user` (login, name, e-mail, phone),
  `staff_sign_in` (login, outcome), `staff_activity`, `staff_emergency_grant`.
- **Purpose:** accountability for every staff action (REQ-SEC), sign-in security.
- **Basis:** legal obligation and legitimate interest — **owner**.
- **Recipients:** administrators.
- **Term:** kept for ever; the audit log is never deleted by any job (#118). `staff_sign_in` is not on the list —
  **owner**.
- **At expiry:** none. Phones in the audit are masked (`+380*****12`); a name changed by staff may stay in the
  before/after values after the rider's deletion — question 7 (an audit record is not rewritten without trace,
  REQ-PRV-07).
- **Owner:** **owner** (security).

## Questions for the owner

1. **Region** of the deployment and of the backups.
2. **Legal basis** of each category above, per country (Poland, Ukraine).
3. **Controller or processor:** partner fleets; WayForPay; Google (geocoder, FCM); TurboSMS.
4. **Transfers outside the EEA / Ukraine:** Google geocoder and FCM; any other processor.
5. **Terms** not set by the code: inactive rider accounts; drivers who left and their document scans (how long the
   document files must be kept as proof of the licence check); call rows and recordings; order contacts; orders,
   chat, support, ratings, notifications; staff sign-ins; finance and ledger (accounting term per country).
6. **Legal hold:** who sets it and on what (chargeback, dispute, complaint, police request); how long a trip track
   under dispute is kept after 90 days.
7. **Audit log:** whether a rider's phone and name stay in the before/after values of the audit after the rider's
   deletion.
8. **Notice before recording** a call, and its text.
9. **Owner role** for each category.

## Gaps that #144 closes

| Gap | Category | PR |
|---|---|---|
| Rows linked only by phone survive deletion (codes, calls, order contacts) | 3, 4, 5 | 2, closed |
| Free text of a deleted rider survives (orders, chat, support, ratings, notifications) | 6, 8, 9, 10, 15 | 2, closed |
| Exact points of a deleted rider's orders and quotes | 6 | 2, closed |
| An open chargeback does not hold deletion | 1, 6, 13 | 2, closed |
| Drivers cannot be deleted | 2 | 3, closed |
| Drivers cannot export their data | 2 | 4, closed |

The first register said expired data export files are not deleted; they are (`content` is set to null at expiry).

**Residual copies after a rider's deletion** (kept with the basis above): the driver's trip command receipts until
their term (16); the trip track and the dispatch journal near the pickup until 90 days (7, 12); provider callbacks
in `payment_event` (13); database backups until the erasure journal is applied after a restore (ADR 0013); server
logs, which do not record request bodies, until their rotation.

Not closed by #144 and left to the owner's terms: `device_session`, `staff_sign_in`, and every "kept for ever"
above.
