# ADR 0019. Who is at fault for a cancelled order

Date: 05.11.2026. Status: accepted (the owner's answers in the lead's session).

## Context

ADR 0007 records **who pressed "cancel"**: the rider (`RIDER`), staff (`STAFF`) or the driver (`DRIVER`). That is
not who is at fault: a rider who gives up after the driver is ten minutes late is recorded as "cancelled by the rider".
The fee for a cancellation (Q-07), who bears a refund (ADR 0018 A, point 6), the driver's counted cancellations
(ADR 0018 B) and the operator's points (ADR 0011) all depend on the fault, not on the button.

## Decision

The owner's rule from ADR 0018 holds: **every number below is a setting in the admin panel**, with the value given
here as the default.

### 1. Five kinds of fault

A cancelled order keeps the one status `CANCELLED` and who cancelled it (ADR 0007), and gets a **fault**. Panels,
reports and the order history show it as the kind of cancellation.

| Fault | Meaning |
|---|---|
| `CLIENT_FREE` | Cancelled by the client before a driver accepted the order, or within the free window after the acceptance |
| `CLIENT` | The client's fault, every other case |
| `DRIVER` | The driver's fault |
| `OPERATOR` | The operator's fault |
| `NONE` | Nobody's fault: a duplicate, a test order, no cars, a payment or software failure |

The owner asked for the first four; `NONE` was proposed by the lead and accepted, so that a duplicate or a test order
is not put on anyone.

### 2. The fault comes from the reason

Every cancellation reason (ADR 0007) gets a **fault** in the admin panel: `CLIENT`, `DRIVER`, `OPERATOR` or `NONE`.
A reason with `CLIENT` gives `CLIENT_FREE` or `CLIENT` by the time:

- no driver on the order at the moment of the cancellation (searching, scheduled, a driver gave it up and the search
  goes on): `CLIENT_FREE`;
- a driver on the order, accepted no longer than **2 minutes** ago (setting "free cancellation after acceptance",
  minutes): `CLIENT_FREE`;
- otherwise `CLIENT`.

The driver's 30-second grace (ADR 0018 B2) is a separate setting and stays.

A reason may also be marked **"the driver's fault if the driver is late"** (default only on the rider's "The wait is
too long"). With it, the fault is `DRIVER` when, at the moment of the cancellation, the driver is late:

- **late against the promise:** the driver has not arrived and the promised pickup time plus **5 minutes** (setting
  "driver late", minutes) has passed, or arrived after it;
- **the promised pickup time** is the time of the acceptance plus the pickup time the driver was offered the order
  with. Drivers are chosen by pickup time on the service's own GraphHopper (owner, 05.11.2026; ADR 0020), so the
  offer carries it;
- **no promise known** (an order taken from the "ALL" tab, or an offer made while the router was down): the driver
  is late when they have not arrived within **15 minutes** of the acceptance (setting "driver late without a promise",
  minutes).

The owner first agreed to "5 minutes over the first estimate the rider saw", then asked how Uber and Bolt do it
(05.11.2026). As far as the lead knows (from memory; the rules differ by city and change): both count lateness against
the pickup time given at the match, both make the rider's cancellation free when the driver is late, and neither
counts a rider's cancellation in the driver's cancellation rate. The owner chose: the fault is the driver's.

Starting faults of the reasons that exist today:

| Who cancels | Reason | Fault |
|---|---|---|
| Rider | Changed my mind, Wrong address, Found other transport | `CLIENT` |
| Rider | The wait is too long | `CLIENT`, the driver's fault if late |
| Driver | Passenger did not show up (after the waiting check), Passenger asked to cancel | `CLIENT` |
| Driver | Any other reason | `DRIVER` |
| Staff | Passenger asked | `CLIENT` |
| Staff | Operator error | `OPERATOR` |
| Staff | Duplicate order, No cars available, Test order, Accident | `NONE` |
| Staff | Vehicle broke down on the way | `DRIVER` |

A reason added later starts with `CLIENT` for the rider's list, `DRIVER` for the driver's, `NONE` for staff. Staff
reasons marked "operator's fault" (ADR 0011) have the fault `OPERATOR`; the two stay the same thing.

### 3. Consequences

- `DRIVER`: the cancellation counts against the driver (ADR 0018 B) when the driver cancelled it. A rider's
  cancellation because the driver was late counts only with the setting "count the rider's cancellations for
  lateness" (default off, as in Uber and Bolt); it is always recorded with the fault, so the rider pays nothing and
  reports and refunds put it on the driver. A cancellation by staff for the driver's fault (a breakdown on the way) is
  recorded with the fault but is not counted automatically.
- `OPERATOR`: the operator's points (ADR 0011), as today.
- `CLIENT`: a cancellation fee may apply once Q-07 is decided; nothing is charged today.
- `CLIENT_FREE`, `NONE`: nothing.
- Refunds (ADR 0018 A, point 6): who bears a refund follows the fault. Still to be confirmed with point 6.

### 4. Staff correct the fault

Staff with the new permission **"Change the fault of a cancellation"** (in their cities) set another fault on a
cancelled order with a comment. The change is a command with `command_id` and `expected_version`, is written to the
audit log and the order history, and recomputes what follows from it:

- to `DRIVER` on an order with a driver: the cancellation counts against that driver from now on;
- from `DRIVER`: it stops counting. A pause already given is not lifted by this; staff lift it (ADR 0018 B8);
- to or from `OPERATOR`: the operator's points follow.

### 5. Orders cancelled before this change

They have no fault (shown as "not set"); staff may set one with the same command.
