-- A request waiting for a confirmation reminds the confirmers once (ADR 0018 A3, issue #512, part 3).
alter table refund add column reminded_at timestamptz;
