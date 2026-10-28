# Журнал не сходится

**Алерт:** `LedgerUnbalanced` — есть транзакция за последние сутки, у которой дебет не равен кредиту.

Такого не должно быть никогда. Журнал только дополняется, сервер проверяет баланс каждой проводки.

## Проверить

```sql
select t.id, t.basis_type, t.basis_id, t.occurred_at, sum(l.debit_minor) d, sum(l.credit_minor) c
from journal_transaction t join journal_line l on l.transaction_id = t.id
where t.occurred_at > now() - interval '24 hours'
group by t.id having sum(l.debit_minor) <> sum(l.credit_minor);
```

Найдите `basis_type` и `basis_id`: это заказ, пополнение, чаевые и т. п. По `correlation_id` в логах найдите, что произошло.

## Сделать

- Не правьте журнал (UPDATE запрещён триггером). Исправление — компенсирующая проводка отдельной командой с причиной.
- До выяснения остановите выплаты водителям из затронутой валюты.

## Эскалация

Сразу ответственный за финансы и разработчики.
