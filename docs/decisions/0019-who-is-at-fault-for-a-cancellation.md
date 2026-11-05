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
too long"). With it, the fault is `DRIVER` when the driver is later than promised by more than **5 minutes** (setting
"driver late", minutes): the driver has not arrived and the promised time plus the setting has passed, or arrived after
it.

**The promised time** is the first pickup estimate the rider was shown for this driver (REQ-RID-04): the time of the
driver's position it was computed from plus the estimated duration. The server records it once per assignment. With no
estimate ever shown (for example an order taken by phone), there is no promise and lateness is not applied.

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

- `DRIVER`: the cancellation counts against the driver (ADR 0018 B) when the driver cancelled it or the rider
  cancelled because the driver was late. A cancellation by staff for the driver's fault (a breakdown on the way)
  is recorded with the fault but is not counted automatically.
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
