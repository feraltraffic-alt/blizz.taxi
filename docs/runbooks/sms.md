# Коды для входа не уходят

**Алерт:** `SignInCodesFailing` — больше 20 % кодов за 15 минут не отправлены.

Без кода пассажиры и водители не могут войти.

## Проверить

```sql
select channel, provider, state, count(*) from otp_delivery
where attempted_at > now() - interval '30 minutes' group by 1, 2, 3;
select provider, error, count(*) from otp_delivery
where state <> 'SENT' and attempted_at > now() - interval '30 minutes' group by 1, 2 order by 3 desc;
```

- В админке: «Интеграции» → `otp` → «Проверить подключение» (TurboSMS и Asterisk).
- В кабинете TurboSMS: баланс и блокировки отправителя.

## Сделать

- **Закончился баланс или заблокирован отправитель.** Пополните или разблокируйте у провайдера.
- **Не работает SMS.** В админке переключите канал на голосовой звонок (`otp.channel=VOICE`) или включите переход на звонок (`otp.fallback`).
- **Не работает Asterisk.** Переключите на SMS.

Состояние доставки коду конкретного человека поддержка видит в разделе доставок кодов.
