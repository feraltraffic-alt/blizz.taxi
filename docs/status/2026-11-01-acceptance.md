# Критерии приёмки AC-01…AC-27 против `main`, 01.11.2026 (#196)

Проверялся коммит `main` 20b07af. Все тесты, на которые ссылаются строки, прошли в его CI:
[41280424095](https://github.com/feraltraffic-alt/blizz.taxi/actions/runs/41280424095).

Остальные прогоны:

- песочница `scenario=all` на `main`: [41271980928](https://github.com/feraltraffic-alt/blizz.taxi/actions/runs/41271980928) (72cc24d);
- аварийные тесты `faults.yml`: [41234127075](https://github.com/feraltraffic-alt/blizz.taxi/actions/runs/41234127075);
- обновление базы `upgrade.yml`: [41091748834](https://github.com/feraltraffic-alt/blizz.taxi/actions/runs/41091748834), отрицательный контроль [41140930504](https://github.com/feraltraffic-alt/blizz.taxi/actions/runs/41140930504);
- нагрузка L1 `load.yml`: [41243366916](https://github.com/feraltraffic-alt/blizz.taxi/actions/runs/41243366916) (после #178).

Подробности этих прогонов — в [2026-10-31-pilot-proofs.md](2026-10-31-pilot-proofs.md).

**Сколько критериев.** В спецификации их **27**, а не 26. AC-27 стоит в разделе 36.3: отдельные таблицы субъектов,
токены, роли сотрудников. Поэтому `grep -c '^| AC-' docs/status/2026-11-01-acceptance.md` печатает 27.

**Как ставился вердикт.** Критерий разбит на утверждения. MET ставится, только если у **каждого** утверждения есть тест,
который его проверяет. Каждый названный метод прочитан. В графе «Доказательства» указано, что именно тест утверждает,
а не только его имя. Тест, который доходит лишь до 401 или 400, доказательством не считается (AGENTS, привычка 9).
Аудит 30.10 служил только подсказкой, где искать.

## Итог

| Вердикт | Сколько | Критерии |
|---|---|---|
| MET | 11 | AC-02, 06, 09, 10, 11, 12, 13, 14, 15, 16, 20 |
| PARTIAL | 8 | AC-01, 03, 05, 08, 21, 22, 26, 27 |
| OWNER | 3 | AC-07, 24, 25 |
| CLIENT | 3 | AC-04, 19, 23 |
| M2 | 2 | AC-17, 18 |

**M2** — пятый вердикт, которого нет в задаче. Обмен заказами с партнёрами (AC-17) и центр Directory/Royalty (AC-18)
по таблице объёма в разделе 1 спецификации входят в M1 только как «контракты расширения». Пилот M1 их не строит.
Пробелом это не считается.

### Что мешает пилоту

1. **Решения владельца.**
   - Q-06: возвраты и их лимиты (AC-07, строки реестра AC-21).
   - Q-05: фискальные чеки (AC-24).
   - Q-19: сроки и основания в реестре данных (AC-24).
   - Q-15: стенд и площадки для учений по авариям, RPO/RTO и для L2/L3 (AC-25, AC-26).
   - Q-07 и Q-11, а также #30 (админка тарифов, отложена владельцем) — строки реестра M1 (AC-21).
2. **Клиенты.** #136 (веб) и #137 (приложение пассажира): ручная подача без GPS и экран после перезапуска (AC-04),
   отбрасывание устаревших уведомлений на экране (AC-19), отсутствие секретов в bundle (AC-23), проверки на
   устройствах (AC-26).
3. **Сервер, без владельца и без клиента.** Пять задач, все с меткой `claude2`. Ни одна из них не нашла ошибки в
   поведении: это недостающие доказательства того, что код уже делает.
   - #197: отозванная сессия и старое устройство не принимают оффер; документ, истёкший посреди поездки; подписанный
     токен без сессии (AC-03, AC-05, AC-27).
   - #198: тест на каждую строку таблицы переходов заказа; запрещённые переходы ничего не меняют (AC-08).
   - #199: воспроизводимый релиз, проверка в CI (AC-22).
   - #200: сквозной сценарий AC-01 в песочнице — новый город, водитель через проверку, два заказа до финансового
     итога (AC-01).
   - #201: проверка «сотрудник другого города» для всех операций админки и оператора (AC-21, AC-03).

## Таблица

| AC | Вердикт | Доказательства (что тест утверждает) | Чего нет и где это |
|---|---|---|---|
| AC-01 | PARTIAL | Город: песочница `city-draft.sh` (черновик создан, исправлен, опубликован, архивирован). Проверка водителя: `DriverAdmissionTests.driverIsSubmittedAndApproved`, `submitListsWhatIsMissing`. Заказ из приложения до финансового итога: `full-ride.sh` (заработок водителя, отчёт о деньгах, проводка `POSTED`). Заказ диспетчера: `terminal-ride.sh`, `incoming-call.sh`. Все сценарии прошли в прогоне 41271980928, каждый ответ сверен с контрактами. | Нет одного прогона «с нуля». Водители песочницы засеяны уже одобренными, заказы идут в засеянном Киеве: #200. Тариф создаётся только SQL, API тарифов отложено владельцем: #30. |
| AC-02 | MET | `AccessTokenCodecTests.tokenFromAnotherInstanceOrKeyIsRejected`: токен с другим `instance_id` или ключом не проходит `verify`. `PricingTests.oldQuoteKeepsItsTermsAfterArchivingAndPublishingANewTariff`: после архивации и нового тарифа погашенный старый quote равен исходному (11000, комиссия 0,15). Это строже, чем «тариф второго города»: тарифы привязаны к городу и классу. Границы: `GeographyTests.resolvesInsideAndBoundaryInLatitudeLongitudeOrderButNotOutsideOrDraft` (точка на границе принадлежит городу), `highestPriorityWinsAndArchivingFallsBackToTheLowerPriority`, `rejectsEqualPriorityOverlapAndSharedBordersButAllowsDisjointCities` (при равном приоритете и пересечении или общей границе — STATE_CONFLICT). | — |
| AC-03 | PARTIAL | Перебор OTP: `OtpServiceTests.wrongAttemptsAreCountedAndExhaustTheChallenge` (после 5 неверных кодов не проходит и верный), `hourlyLimitPerPhoneApplies` (шестой challenge за час — RateLimited), `resendTooSoonIsRateLimited`. Итого не больше 25 попыток в час на номер. Чужой город по прямому URL: `OperatorOrderApiTests.operatorPhoneOrdersAreScopedPermissionedAuditedAndDoNotCreateClients` (403). По WS: `CallLogTests.theOperatorsOfTheCityGetTheCardPopWithTheRiderAndHisOpenOrders` (оператор другого города карточку не получает). Ленты заказов для сотрудников по WS нет. Отозванная сессия: `SessionServiceTests.logoutRevokesSessionAndAccess`, `AuthApiTests.blockingTheAccountStopsRequestsOnceSessionsAreRevoked` (401 на `/me`). | Нет теста, что принятие оффера отозванной сессией или с устройства, потерявшего смену, отклонено, а оффер остался открытым. Код проверяет это под блокировкой (`JdbcDispatch.java:312`): #197. Сотрудник другого города проверен не для всех операций: #201. |
| AC-04 | CLIENT | Сервер. Заказ всегда с явной точкой подачи, местоположение устройства не требуется. После перезапуска: заказы в базе, `MultipleOrdersTests.upToTheLimitWithPreOrdersAndTheListShowsThemAll` (`orders.current` возвращает все три), песочница `multiple-orders.sh` (`GET /orders/current`). Повтор подтверждения: `M1RegistryContractTests.anOrderRepeatedAfterALostAnswerIsTheSameOrderAndTheSameKeyWithAnotherBodyIsRefused` (тот же `order_id`, заказ один), `OrderPricingTests.aQuoteServesOneOrderAndARepeatReturnsThatOrder`. Долг отдельно от статуса: `RiderObligationTests.aDebtIsListedPaidByCardOnceAndThenGone` (долг завершённой поездки виден отдельно с остатком, погашение проведено один раз). | Клиент (#137): выбор точки без разрешения GPS и показ того же заказа после перезапуска приложения. |
| AC-05 | PARTIAL | Блокировка: `DriverBlockTests.aBlockedDriverReadsEverythingFinishesTheTripAndIsRefusedNewWork` (accept и claim отклонены, поездка завершается), `blockingRevokesTheOpenOfferAtOnceAndTheNextDriverGetsTheOrder`, `aBlockAndAnAcceptAtOnceHaveExactlyOneWinner`. Принятие идёт только через REST, WS команд не принимает, так что «старая WS-сессия» оффер принять не может. Второй телефон: `WorkSessionTests.secondDeviceCannotOpenAnotherSessionButCanTakeControl` (STATE_CONFLICT, смена одна, старое устройство не может её поставить на паузу). Истёкший допуск: `WorkSessionTests.expiredAdmissionStopsNewOrdersButNotTheSession` (смена OPEN, водитель недоступен для заказов с причиной ADMISSION_EXPIRED). | Истёкший допуск проверен на водителе на паузе, а не посреди поездки (`WorkSessionTests.java:267`). Нет теста «документ истёк во время поездки → поездка завершается, следующий заказ отклонён»: #197. |
| AC-06 | MET | `CallLogTests.withAsteriskUnreachableCallsAreNotLoggedAndPhoneOrdersStillWork`: при недоступном Asterisk телефонный заказ создан и не отменён; после восстановления два события одного канала дают одну запись звонка. Занятый водитель: `ManualOfferTests.aManualOfferToAnIneligibleDriverIsRefused` (DRIVER_BUSY или NOT_ELIGIBLE, оффер не записан), `aManualAndAnAutomaticOfferRacingForOneDriverMakeOneOfferAndNeverTwoAssignments`. | — |
| AC-07 | OWNER | Экспорт другого города: `ReportExportTests.aRightTakenAwayBeforeTheBuildFailsTheExport` (запрос по чужому городу — ACCESS_DENIED; право снято до сборки — FAILED), `ReportsTests.onlyStaffWithTheRightForTheCity`. Исходная запись: `FareCorrectionTests.aHigherFareIsANewVersionAndOneDebtPostingARepeatPostsNothingMore` (утверждение «the original is never changed»), `FareLedgerTests.theJournalIsBalancedAndAppendOnly` (UPDATE `journal_line` падает с «append-only»). | Возвратов нет, лимиты и согласование не решены: Q-06. |
| AC-08 | PARTIAL | Строки таблицы раздела 9 покрыты в разных классах: `CardHoldTests` (создание → AWAITING_PAYMENT → READY), `CardHoldDeadlineTests` (AWAITING_PAYMENT → UNFULFILLED, #188), `DispatchTests.acceptingCommitsTheAssignmentAndStopsTheSearch` (SEARCHING → ASSIGNED), `DriverTransitionTests.takeTheDriverOffBeforeTheStart` (ASSIGNED → SEARCHING), `TripTests` (→ IN_SERVICE → FULFILLED), `DispatchTests.noDriverUntilTheTotalDeadlineMakesTheOrderUnfulfilled`, `cancellingWhileSearchingRevokesTheOffer`, `TripInterruptionTests` (IN_SERVICE → CANCELLED поддержкой). Гонка: `DispatchTests.cancellationRacingAcceptanceNeverLeavesAPhantomTrip`. | Нет теста на каждую строку с запрещённым инициатором, и нигде не проверено «STATE_CONFLICT без частичных изменений» (статус, версия, история, outbox): #198. |
| AC-09 | MET | `DispatchTests.hundredSimultaneousClaimsProduceOneAssignment`, `oneDriverClaimingTwoOrdersAtOnceGetsOne`, `BroadcastAbuseTests.twoDriversClaimingOneOrderAtOnceGetOneAssignmentAndNever500`. Перезапуск: случай `dispatch` в `faults.yml` 41234127075 (падение сразу после принятия: повтор получает то же назначение, назначение одно). | — |
| AC-10 | MET | Redis сервер не использует (REQ-DSP-02). Назначения и таймеры живут только в PostgreSQL (`dispatch_attempt`, `offer`). `DispatchTests.lateWorkerNeverUndoesAnAcceptedOrder`. Перезапуск — тот же случай `dispatch` в `faults.yml`. | «Потеря Redis» к серверу неприменима. |
| AC-11 | MET | `DriverTransitionTests` (#141): тест на каждую строку таблицы 12.2 с разрешённым путём, запрещённым участником, повтором и конфликтом версии. Ось допуска — `DriverAdmissionTests`. DISCONNECTED + ON_TRIP: `DriverTransitionTests.loseTheNetwork` (DISCONNECTED, ON_TRIP, недоступен, ни офферов, ни общего списка), `WorkSessionTests.staleHeartbeatExcludesTheDriverButKeepsAnAssignment`. | — |
| AC-12 | MET | `TripTests.cancellationRacingTheStartHasOneOutcome`: либо ABORTED и водитель свободен, либо IN_SERVICE и ON_TRIP, третьего нет. `TripTests.noShowOnlyAfterTheMinimumWait`: неявка до минимального ожидания отклоняется. Платы за отмену и неявку нет вовсе, это Q-07. | — |
| AC-13 | MET | Буфер GPS: `DriverLocationApiTests.repeatedCommandReturnsSameCountsAndNeverMovesWorkSessionLocation` (пачка точек пятиминутной давности не двигает `work_session.last_location`), `WorkSessionTests.olderLocationNeverMovesTheCurrentPositionBack` (точка с меньшим номером не двигает назад). «Дом 2»: `RiderAddressApiTests.searchFindsExactHouseNotTwentySixAndHidesHiddenRecords`. Скрытие: `AddressBookTests.hiddenAddressesDisappearFromSearchReverseLookupAndFreshSelectionThenReturn`; кэша провайдера нет (ADR 0012). Входы: `AddressBookTests.entrancesTenMetresApartRemainSeparateAndNearBreaksTies`. | — |
| AC-14 | MET | `PricingTests.oldQuoteKeepsItsTermsAfterArchivingAndPublishingANewTariff`. `FareLedgerTests.theFinalFareIsTheAgreedPriceWithTheQuotedCommissionEvenAfterATariffChange`: тариф меняется после quote; повтор завершения возвращает тот же ответ; итог равен цене quote по его ставке; `final_fare` неизменяем. Трек не входит в расчёт итога (итог = quote + платное ожидание по правилу), так что неполный трек ничего не добавит. | Утверждение про трек доказано устройством расчёта, отдельного теста с рваным треком нет. |
| AC-15 | MET | `CardHoldTests.anUnknownHoldIsReconciledAndALateSuccessAfterCancellationIsReleased` (UNKNOWN, отмена, отправлен VOID, итог VOIDED). `CardCaptureTests.aTimedOutCaptureAndRepeatedAnswersChargeAndCountOnce` (второго CHARGE нет, в журнале одно списание), `anOlderAnswerAfterPaidDoesNotUndoIt`. Погашения: `RiderObligationTests.aDebtIsListedPaidByCardOnceAndThenGone` (повторное уведомление — одна проводка), `onePageAtATimeAndTwoAtOnceGiveOne`. Частичная оплата: `RiderObligationTests.aPartialRepaymentLeavesTheRest`, `CardCaptureTests.whatCannotBeChargedStaysTheRidersDebt`. | — |
| AC-16 | MET | `FareLedgerTests.theJournalIsBalancedAndAppendOnly` (несбалансированная проводка и UPDATE отклонены), `redeliveryOfTheEventDoesNotPostTwice` (после повторной доставки одна транзакция на заказ), `aCashTripLeavesTheDriverOwingTheCommissionAndPaysNothingOut` (`DRIVER_PAYABLE` = −комиссия, долг пассажира 0). | — |
| AC-17 | M2 | — | Обмен заказами с партнёрами — M2 (раздел 1, таблица объёма). |
| AC-18 | M2 | — | Центр (Directory/Royalty) — M2, там же. |
| AC-19 | CLIENT | Сервер: `ReassignmentNotificationTests.aDriverReplacedBeforeThePushLeavesIsNeverAnnouncedAndTheRiderHearsAboutTheSecond` (push о первом назначении SUPERSEDED, отправлен только второй), `theRiderSeesTheCurrentDriverOnlyAndWhyTheDriverChanged`. Каждое сообщение несёт `aggregate_version`. Отзыв: `LiveChannelTests.aRevokedSessionLosesItsConnectionWithinSecondsNotWhenTheTokenExpires` (код 4403 за секунды; проверено на канале пассажира, канал сотрудника использует тот же механизм). Карта водителей — REST с проверкой прав на каждый запрос (`LiveDriverBoardTests`). | Клиент: не показывать уже полученное устаревшее уведомление (#137). |
| AC-20 | MET | Пустая база: `MigrationTests.allMigrationsAppliedSuccessfully`. Обновление с прошлого релиза сохраняет поездки: `upgrade.yml` 41091748834 (снимок не изменился), отрицательный контроль 41140930504 (красный). Конкурентно на настоящем PostgreSQL: `IdempotentCommandsTests.concurrentDuplicatesExecuteOnce`, `DispatchTests.hundredSimultaneousClaimsProduceOneAssignment`, `GeographyTests.onlyOneConcurrentEqualPriorityPublisherCommits`. | — |
| AC-21 | PARTIAL | `M1RegistryContractTests.theRegistryNamesEverySpecRowAndEachOperationIsInTheContracts`: 49 строк, 45 покрыты полностью. `everyContractOperationHasAHandlerInTheServer`, `everyRegistryCommandCarriesACommandId`, `anOrderRepeatedAfterALostAnswerIsTheSameOrderAndTheSameKeyWithAnotherBodyIsRefused` (тот же `order_id`; тот же ключ с другим телом — 409 IDEMPOTENCY_CONFLICT). Схема ошибок: `ErrorCodeContractTests`. Scope дальше 401: `AccessIsolationTests.strangersGetNothingOfAnotherPersonsObjects` (каждая операция пассажира и водителя с id), `cityReadsAndValidWriteBodiesRejectOtherCityStaffAndMissingPermission`. | Строки без операций ждут владельца: Q-07 (`cancellation-quotes`), #30 (тарифы), Q-06 (возвраты), Q-11 (`payout-batches`). Scope операций админки и оператора по городу не проверен сплошь: #201. |
| AC-22 | PARTIAL | Сборка и интеграционные тесты на каждом CI-раннере с нуля, на настоящем PostgreSQL (41280424095). Входы закреплены: образы по digest (`server/Dockerfile`, `deploy/*/compose.yaml`, `scripts/pin-images.sh`), `server/mvnw`. Провайдер не исчерпывает пул: `ProviderBreakersTests.aHangingProviderHoldsAtMostItsCapAndTheOthersKeepAnswering` (зависший провайдер держит не больше своего лимита, другие отвечают), `OtpDeliveryTests.providerRunsWithoutAnActiveDatabaseTransaction`. | Не доказано, что два билда одного коммита дают одинаковый артефакт: в `server/pom.xml` нет `project.build.outputTimestamp` и нет проверки: #199. |
| AC-23 | CLIENT | Подмена id: `AccessIsolationTests.strangersGetNothingOfAnotherPersonsObjects` (чужой объект — отказ без побочных записей, тот же запрос владельца проходит). WS без тем: `LiveChannelTests.theRiderAndTheOfferedDriverHearAboutTheOrderAndNobodyElse`. Вредоносный файл: `ContentScannerTests.eicarInsideAValidJpegIsRejectedByTheScannerAndACleanJpegIsSafe`, `whileTheScannerIsDownNothingBecomesSafeAndItHealsWhenItIsBack`, `FileServiceTests.pdfWithActiveContentIsRejected`. Подпись callback: `WayForPayProviderTests.notificationsAreTrustedOnlyWithTheRightSignatureAndAccount`, `CardBindingTests.forgedRepeatedAndDeclinedNotifications`. Логи: `LogRedactionTests.tokensAndCodesAreTakenOut`. | Клиент: секрет отсутствует в bundle (#136, #137). |
| AC-24 | OWNER | Удаление не трогает журнал: `ClientDeletionTests.completionAnonymizesTheClientAndEachModuleForgetsItsData` (все прежние строки журнала пассажира на месте, добавлено только сгорание бонусов), `DriverDeletionTests.completionAnonymizesTheDriverAndKeepsTheEarnings`. Восстановление: `ErasureReplayTests.aRestoredClientIsAnonymizedAgainAndTheOtherModulesAreToldAgain`, `aRestoredDriverIsAnonymizedAgain`. Матрица: `docs/privacy/data-register.md` (черновик, сроки из кода). | Сроки и правовые основания в матрице: Q-19. Фискальный чек: Q-05. |
| AC-25 | OWNER | В каждом прогоне песочницы есть шаг `backup-restore` (41271980928). Обрыв всех соединений с базой под нагрузкой — случай `database` в `faults.yml` (ни одного 500, после обрыва проходит поездка). Ранбуки: `docs/runbooks/database-failover.md`, `restore-from-backup.md`. | Стенда нет, учения на stage и фактические RPO/RTO ждут Q-15. Redis не используется. |
| AC-26 | PARTIAL | L1 опубликован с конфигурацией: `load.yml` 41243366916, отчёт в `2026-10-31-pilot-proofs.md`, часть 3. | L2/L3 по разделу 29 относятся к S-12, нужен стенд: Q-15. Реальные устройства — клиент (#137). |
| AC-27 | PARTIAL | Отдельные таблицы `client`, `driver`, `staff_user` (`V5__identity_subjects_and_otp.sql`), таблицы `app_user` нет ни в одной миграции. Одинаковый телефон: `OtpServiceTests.clientAndDriverWithTheSamePhoneAreSeparateAccounts`. Токен пассажира не проходит как токен водителя или админа: `AccessTokenCodecTests.tokenOfOneAudienceIsRejectedByAnother`. Подмену полей ловит подпись: `tamperedOrUnsignedTokenIsRejected`. Роли сотрудников в одной `staff_user`: `StaffSignInTests.superAdminAddsAnOperatorWhoSignsInChangesThePasswordAndGetsOnlyTheTickedFunctions`. | Нет теста, что правильно подписанный токен с несуществующей сессией отклонён (`JdbcSessionService.java:224`): #197. |

## Пробелы сервера, найденные по дороге

| Где | Что | Задача |
|---|---|---|
| `server/src/test/java/taxi/blizz/operations/WorkSessionTests.java:267` | Тест истёкшего допуска проверяет водителя на паузе. Поездка с истёкшим документом не проверена. | #197 |
| `server/src/main/java/taxi/blizz/operations/internal/JdbcDispatch.java:312` | Принятие проверяет устройство смены под блокировкой, но ни один тест не принимает оффер со старого устройства. | #197 |
| `server/src/main/java/taxi/blizz/identity/internal/JdbcSessionService.java:224` | `verifyAccess` ищет строку сессии только по id и не сверяет её субъекта с токеном. Безопасно, пока токен подписан, но второго рубежа нет. Теста на подписанный токен без сессии тоже нет. | #197 |
| `server/src/test/java/taxi/blizz/M1RegistryContractTests.java` | Scope проверяется только как 401 без токена или с другой аудиторией. Это фильтр аутентификации, а не город (привычка 9). Сплошной проверки города для операций админки и оператора нет. | #201 |
| `server/pom.xml` | Нет `project.build.outputTimestamp`, jar несёт время сборки. | #199 |

Исправлений тестов в этом PR нет. Каждый пробел больше нескольких строк, поэтому на каждый заведена задача.
