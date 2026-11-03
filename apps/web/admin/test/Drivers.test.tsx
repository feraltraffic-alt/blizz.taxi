import {afterAll, afterEach, beforeAll, describe, expect, it, vi} from 'vitest';
import {render, screen, waitFor} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {MemoryRouter} from 'react-router-dom';
import {http, HttpResponse, delay} from 'msw';
import {setupServer} from 'msw/node';
import {createApiClient} from '@blizz/api-client';
import {AdminApp} from '../src/App.js';
import {browserRefreshTokens} from '../src/storage.js';
import {cid, me, problem, session} from '../../../../test/fixtures.js';

/** The driver review queue (#351): V1–V8 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterEach(() => {server.resetHandlers(); sessionStorage.clear(); localStorage.clear(); vi.restoreAllMocks();});
afterAll(() => server.close());

const DRIVER = 'd0000000-0000-4000-8000-000000000001';
const DOC = 'f1000000-0000-4000-8000-000000000001';
const DOC2 = 'f2000000-0000-4000-8000-000000000002';
const reviewer = {...me, effective_permissions: ['driver.review']};
const item = (n: number, over: Record<string, unknown> = {}) => ({driver_id: n === 1 ? DRIVER : 'd000000' + n
  + '-0000-4000-8000-000000000001', name: 'Водитель ' + n, phone: '+38050000000' + n, status: 'IN_REVIEW',
  since: '2026-11-0' + n + 'T10:00:00Z', version: 4, ...over});
const profile = (status = 'IN_REVIEW') => ({id: DRIVER, account_state: 'ACTIVE', review_status: status,
  has_payment_terminal: false, admission_city_ids: [], version: 4, name: 'Водитель 1', language: 'uk',
  vehicles: [{id: 'v1', registration_number: 'AA1234BB', make: 'Skoda', model: 'Octavia', color: 'white',
    production_year: 2019, state: 'IN_REVIEW', class_approvals: []}],
  documents: [{id: DOC, type: 'DRIVER_LICENSE', file_id: 'x', number: 'ВХА123', valid_from: null,
    valid_to: '2030-01-01', decision: 'PENDING', decision_reason: null},
  {id: DOC2, type: 'INSURANCE', vehicle_id: 'v1', file_id: 'y', number: null, valid_from: null, valid_to: null,
    decision: 'PENDING', decision_reason: null}]});
const theCase = (over: Record<string, unknown> = {}) => ({profile: profile(), phone: '+380500000001',
  history: [{from: 'NOT_SUBMITTED', to: 'IN_REVIEW', actor_type: 'DRIVER', actor_id: DRIVER, reason: 'submitted',
    at: '2026-11-01T10:00:00Z'}], duplicates: [], ...over});

type Sent = {body: Record<string, unknown>};

function handlers(opts: {rights?: unknown; queue?: (q: URLSearchParams) => unknown; one?: () => unknown;
  decision?: () => Response | Promise<Response>; file?: () => Response} = {}) {
  const sent: Sent[] = [];
  const asked = {queue: [] as URLSearchParams[], files: 0, cases: 0};
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json((opts.rights ?? reviewer) as never)),
    http.get(origin + '/api/admin/v1/drivers', ({request}) => {
      const query = new URL(request.url).searchParams;
      asked.queue.push(query);
      return HttpResponse.json((opts.queue ? opts.queue(query) : {drivers: [item(1)],
        page: {next_cursor: null, has_more: false}}) as never);
    }),
    http.get(origin + '/api/admin/v1/drivers/' + DRIVER, () => {
      asked.cases++;
      return HttpResponse.json((opts.one ? opts.one() : theCase()) as never);
    }),
    http.get(origin + '/api/admin/v1/drivers/' + DRIVER + '/documents/' + DOC + '/file', () => {
      asked.files++;
      return opts.file ? opts.file() : new HttpResponse(new Uint8Array([137, 80, 78, 71]),
        {headers: {'Content-Type': 'image/png'}});
    }),
    http.post(origin + '/api/admin/v1/drivers/' + DRIVER + '/decision', async ({request}) => {
      sent.push({body: await request.json() as Record<string, unknown>});
      return opts.decision ? opts.decision() : HttpResponse.json(profile('APPROVED') as never);
    }));
  return {sent, asked};
}

function mount(path = '/drivers') {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  render(<MemoryRouter initialEntries={[path]}><AdminApp client={api} /></MemoryRouter>);
}

async function openCase(user = userEvent.setup()) {
  mount();
  await user.click(await screen.findByRole('link', {name: /Водитель 1/}));
  await screen.findByText('Skoda Octavia AA1234BB · на проверке');
  return user;
}

const statics = URL as unknown as {createObjectURL?: (blob: Blob) => string; revokeObjectURL?: (url: string) => void};
function stubUrls() {
  statics.createObjectURL = vi.fn(() => 'blob:scan');
  statics.revokeObjectURL = vi.fn();
}
afterEach(() => {
  delete statics.createObjectURL;
  delete statics.revokeObjectURL;
});

describe('V1: the section', () => {
  it('is in the menu for a reviewer', async () => {
    handlers();
    mount('/');
    expect(await screen.findByRole('link', {name: 'Водители'})).toBeVisible();
  });

  it('is not for others', async () => {
    handlers({rights: {...me, effective_permissions: ['geo.manage']}});
    mount('/');
    await screen.findByRole('link', {name: 'Профиль'});
    expect(screen.queryByRole('link', {name: 'Водители'})).not.toBeInTheDocument();
  });
});

describe('V2: the queue', () => {
  it('lists the drivers with phone and date; Q1, Q2 (#361): "more" reads by cursor, never by after', async () => {
    const {asked} = handlers({queue: q => q.get('cursor') ? {drivers: [item(2)], page: {next_cursor: null,
      has_more: false}} : {drivers: [item(1)], page: {next_cursor: 'c2', has_more: true}}});
    mount();
    expect(await screen.findByRole('link', {name: /Водитель 1 · \+380500000001 · с /})).toBeVisible();
    await userEvent.setup().click(screen.getByRole('button', {name: 'Ещё'}));
    expect(await screen.findByRole('link', {name: /Водитель 2/})).toBeVisible();
    expect(asked.queue.map(q => q.get('cursor'))).toEqual([null, 'c2']);
    expect(asked.queue.map(q => q.has('after'))).toEqual([false, false]);
  });

  it('says when it is empty', async () => {
    handlers({queue: () => ({drivers: [], page: {next_cursor: null, has_more: false}})});
    mount();
    expect(await screen.findByText('Очередь пуста.')).toBeVisible();
  });
});

describe('V3: the case', () => {
  it('shows documents, vehicles, history and duplicates', async () => {
    handlers({one: () => theCase({duplicates: [{document_id: DOC, other_driver_id: 'o', other_document_id: 'od'}]})});
    await openCase();
    expect(screen.getByText('Водительское удостоверение · на проверке · № ВХА123 · до 2030-01-01')).toBeVisible();
    expect(screen.getByText('Страховка · на проверке')).toBeVisible();
    expect(screen.getByText(/NOT_SUBMITTED → IN_REVIEW · submitted/)).toBeVisible();
    expect(screen.getByText('Такой же файл есть у другого водителя: Водительское удостоверение')).toBeVisible();
  });
});

describe('V4: a scan', () => {
  it('is downloaded once and shown', async () => {
    stubUrls();
    const {asked} = handlers();
    const user = await openCase();
    await user.click(screen.getByRole('button', {name: 'Открыть: Водительское удостоверение'}));
    expect(await screen.findByRole('img', {name: 'Водительское удостоверение'})).toHaveAttribute('src', 'blob:scan');
    expect(screen.queryByRole('button', {name: 'Открыть: Водительское удостоверение'})).not.toBeInTheDocument();
    expect(asked.files).toBe(1);
  });
});

describe('V5: decisions', () => {
  it('APPROVE with the classes and the version', async () => {
    const {sent} = handlers();
    const user = await openCase();
    await user.click(screen.getByRole('radio', {name: 'Допустить'}));
    await user.type(screen.getByLabelText('Классы авто (через запятую)'), 'STANDARD, COMFORT');
    await user.type(screen.getByLabelText('Причина решения'), 'Документы в порядке');
    await user.click(screen.getByRole('button', {name: 'Принять решение'}));
    await waitFor(() => expect(sent).toHaveLength(1));
    expect(sent[0]!.body).toEqual({command_id: expect.any(String), expected_version: 4, decision: 'APPROVE',
      reason: 'Документы в порядке', vehicle_classes: ['STANDARD', 'COMFORT']});
  });

  it('REQUEST_CHANGES with the ticked documents', async () => {
    const {sent} = handlers({decision: () => HttpResponse.json(profile('CHANGES_REQUIRED') as never)});
    const user = await openCase();
    await user.click(screen.getByRole('radio', {name: 'Нужны исправления'}));
    await user.click(screen.getByRole('checkbox', {name: 'Отклонить: Страховка'}));
    await user.type(screen.getByLabelText('Причина решения'), 'Нечитаемая страховка');
    await user.click(screen.getByRole('button', {name: 'Принять решение'}));
    await waitFor(() => expect(sent).toHaveLength(1));
    expect(sent[0]!.body).toEqual({command_id: expect.any(String), expected_version: 4,
      decision: 'REQUEST_CHANGES', reason: 'Нечитаемая страховка', rejected_documents: [DOC2]});
  });
});

describe('V6: refused on the screen', () => {
  it.each([['no reason', 'Допустить', 'STANDARD', ''], ['APPROVE without a class', 'Допустить', '', 'ок'],
    ['no decision', '', '', 'ок']])('%s sends nothing', async (_name, radio, classes, reason) => {
    const {sent} = handlers();
    const user = await openCase();
    if (radio) await user.click(screen.getByRole('radio', {name: radio}));
    if (classes) await user.type(screen.getByLabelText('Классы авто (через запятую)'), classes);
    if (reason) await user.type(screen.getByLabelText('Причина решения'), reason);
    await user.click(screen.getByRole('button', {name: 'Принять решение'}));
    expect(await screen.findByText('Выберите решение и укажите причину; для допуска — хотя бы один класс.'))
      .toBeVisible();
    expect(sent).toEqual([]);
  });
});

describe('V7: a conflict', () => {
  it('reads the case again and says so', async () => {
    const {asked} = handlers({decision: () => HttpResponse.json(problem(409, 'STATE_CONFLICT'), {status: 409})});
    const user = await openCase();
    await user.click(screen.getByRole('radio', {name: 'Отказать'}));
    await user.type(screen.getByLabelText('Причина решения'), 'Поддельные документы');
    await user.click(screen.getByRole('button', {name: 'Принять решение'}));
    expect(await screen.findByText('Водитель изменился, пока вы решали. Проверьте ещё раз.')).toBeVisible();
    expect(asked.cases).toBe(2);
  });
});

describe('V8: one at a time', () => {
  it('a double click sends one decision', async () => {
    const {sent} = handlers({decision: async () => {
      await delay(200);
      return HttpResponse.json(profile('REJECTED') as never);
    }});
    const user = await openCase();
    await user.click(screen.getByRole('radio', {name: 'Отказать'}));
    await user.type(screen.getByLabelText('Причина решения'), 'Нет');
    const button = screen.getByRole('button', {name: 'Принять решение'});
    await Promise.all([user.click(button), user.click(button)]);
    await waitFor(() => expect(sent).toHaveLength(1));
    await delay(300);
    expect(sent).toHaveLength(1);
  });
});

/** A driver's admission cities (#353): P2–P6. */
describe('#353: admission cities', () => {
  const KYIV = {id: '5a000000-0000-4000-8000-000000000001', code: 'kyiv', name: 'Київ', currency: 'UAH',
    timezone: 'Europe/Kyiv', center: {lat: 50.45, lon: 30.52}};
  const LVIV = {...KYIV, id: '5a000000-0000-4000-8000-000000000002', code: 'lviv', name: 'Львів'};
  const PUT = '/api/admin/v1/drivers/' + DRIVER + '/admission-cities';

  function cities(answer?: () => Response | Promise<Response>, admitted: string[] = [KYIV.id]) {
    const put: Record<string, unknown>[] = [];
    let reads = 0;
    handlers({one: () => {
      reads++;
      return theCase({profile: {...profile('APPROVED'), admission_city_ids: admitted}});
    }});
    server.use(
      http.get(origin + '/api/config/v1/bootstrap', () => HttpResponse.json({cities: [KYIV, LVIV]})),
      http.put(origin + PUT, async ({request}) => {
        put.push(await request.json() as Record<string, unknown>);
        return answer ? answer() : HttpResponse.json({...profile('APPROVED'), admission_city_ids: [KYIV.id, LVIV.id],
          version: 5} as never);
      }));
    return {put, reads: () => reads};
  }

  it('P2: the cities with the admitted ones ticked', async () => {
    cities();
    await openCase();
    expect(await screen.findByRole('checkbox', {name: 'Київ'})).toBeChecked();
    expect(screen.getByRole('checkbox', {name: 'Львів'})).not.toBeChecked();
  });

  it('P3: the whole new list with the version and a reason', async () => {
    const {put} = cities();
    const user = await openCase();
    await user.click(await screen.findByRole('checkbox', {name: 'Львів'}));
    await user.type(screen.getByLabelText('Причина изменения городов'), 'Переехал');
    await user.click(screen.getByRole('button', {name: 'Сохранить города'}));
    await waitFor(() => expect(put).toHaveLength(1));
    expect(put[0]).toEqual({command_id: expect.any(String), expected_version: 4, city_ids: [KYIV.id, LVIV.id],
      reason: 'Переехал'});
    expect(await screen.findByText('Города допуска сохранены.')).toBeVisible();
  });

  it.each([['no reason', true, ''], ['an unchanged list', false, 'ок']])('P4: %s sends nothing', async (_n, change, why) => {
    const {put} = cities();
    const user = await openCase();
    if (change) await user.click(await screen.findByRole('checkbox', {name: 'Львів'}));
    else await screen.findByRole('checkbox', {name: 'Львів'});
    if (why) await user.type(screen.getByLabelText('Причина изменения городов'), why);
    await user.click(screen.getByRole('button', {name: 'Сохранить города'}));
    expect(await screen.findByText('Измените список и укажите причину.')).toBeVisible();
    expect(put).toEqual([]);
  });

  it('P5: a 409 reads the case again', async () => {
    const {reads} = cities(() => HttpResponse.json(problem(409, 'STATE_CONFLICT'), {status: 409}));
    const user = await openCase();
    await user.click(await screen.findByRole('checkbox', {name: 'Львів'}));
    await user.type(screen.getByLabelText('Причина изменения городов'), 'Переехал');
    await user.click(screen.getByRole('button', {name: 'Сохранить города'}));
    expect(await screen.findByText('Водитель изменился, пока вы решали. Проверьте ещё раз.')).toBeVisible();
    expect(reads()).toBe(2);
  });

  it('P6: a double click saves once', async () => {
    const {put} = cities(async () => {
      await delay(200);
      return HttpResponse.json({...profile('APPROVED'), admission_city_ids: [KYIV.id, LVIV.id], version: 5} as never);
    });
    const user = await openCase();
    await user.click(await screen.findByRole('checkbox', {name: 'Львів'}));
    await user.type(screen.getByLabelText('Причина изменения городов'), 'Переехал');
    const save = screen.getByRole('button', {name: 'Сохранить города'});
    await Promise.all([user.click(save), user.click(save)]);
    await waitFor(() => expect(put).toHaveLength(1));
    await delay(300);
    expect(put).toHaveLength(1);
  });
});

describe('#363: find by status; block, suspend and their reversal', () => {
  const at = (account: string, review: string, version = 4) => ({...profile(review), account_state: account, version});
  function more(opts: {current?: () => ReturnType<typeof at>; act?: (action: string) => Response | Promise<Response>}
    = {}) {
    const acts: {action: string; body: Record<string, unknown>}[] = [];
    server.use(
      http.get(origin + '/api/admin/v1/drivers/' + DRIVER, () => HttpResponse.json(theCase({profile: opts.current
        ? opts.current() : at('ACTIVE', 'APPROVED')}) as never)),
      http.post(origin + '/api/admin/v1/drivers/' + DRIVER + '/:action', async ({request, params}) => {
        const action = String(params.action);
        acts.push({action, body: await request.json() as Record<string, unknown>});
        if (opts.act) return opts.act(action);
        const after: Record<string, [string, string]> = {block: ['BLOCKED', 'APPROVED'], unblock: ['ACTIVE', 'APPROVED'],
          suspend: ['ACTIVE', 'SUSPENDED'], reinstate: ['ACTIVE', 'APPROVED']};
        const [account, review] = after[action] ?? ['ACTIVE', 'APPROVED'];
        return HttpResponse.json(at(account, review, 5) as never);
      }));
    return {acts};
  }
  async function open() {
    mount('/drivers/' + DRIVER);
    const user = userEvent.setup();
    await screen.findByText('Skoda Octavia AA1234BB · на проверке');
    return user;
  }
  const why = 'Причина для аккаунта и допуска';

  it('B1: the status filter reads the first page by status; "more" keeps it with the cursor', async () => {
    const {asked} = handlers({queue: q => q.get('cursor') ? {drivers: [item(2, {status: 'APPROVED'})],
      page: {next_cursor: null, has_more: false}} : {drivers: [item(1, {status: q.get('status')})],
      page: {next_cursor: 'c2', has_more: true}}});
    mount();
    const user = userEvent.setup();
    await screen.findByRole('link', {name: /Водитель 1/});
    await user.selectOptions(screen.getByLabelText('Статус'), 'APPROVED');
    await waitFor(() => expect(asked.queue).toHaveLength(2));
    await user.click(await screen.findByRole('button', {name: 'Ещё'}));
    expect(await screen.findByRole('link', {name: /Водитель 2/})).toBeVisible();
    expect(asked.queue.map(q => [q.get('status'), q.get('cursor')])).toEqual([['IN_REVIEW', null],
      ['APPROVED', null], ['APPROVED', 'c2']]);
  });

  it.each([['ACTIVE', 'активен'], ['BLOCKED', 'заблокирован'], ['DELETION_PENDING', 'ожидает удаления'],
    ['ANONYMIZED', 'обезличен']])('B2: the account state %s', async (account, text) => {
    handlers();
    more({current: () => at(account, 'APPROVED')});
    mount('/drivers/' + DRIVER);
    expect(await screen.findByText('Аккаунт: ' + text)).toBeVisible();
  });

  it('B3: block with the version and the reason; then only unblock is offered', async () => {
    handlers();
    const {acts} = more();
    const user = await open();
    expect(screen.queryByRole('button', {name: 'Разблокировать аккаунт'})).toBeNull();
    await user.type(screen.getByLabelText(why), 'Жалобы пассажиров');
    await user.click(screen.getByRole('button', {name: 'Заблокировать аккаунт'}));
    expect(await screen.findByText('Аккаунт: заблокирован')).toBeVisible();
    expect(acts).toEqual([{action: 'block', body: {command_id: expect.any(String), expected_version: 4,
      reason: 'Жалобы пассажиров'}}]);
    expect(screen.getByRole('button', {name: 'Разблокировать аккаунт'})).toBeVisible();
    expect(screen.queryByRole('button', {name: 'Заблокировать аккаунт'})).toBeNull();
  });

  it('B3: unblock a blocked account', async () => {
    handlers();
    const {acts} = more({current: () => at('BLOCKED', 'APPROVED')});
    const user = await open();
    expect(screen.queryByRole('button', {name: 'Заблокировать аккаунт'})).toBeNull();
    await user.type(screen.getByLabelText(why), 'Разобрались');
    await user.click(screen.getByRole('button', {name: 'Разблокировать аккаунт'}));
    expect(await screen.findByText('Аккаунт: активен')).toBeVisible();
    expect(acts.map(a => a.action)).toEqual(['unblock']);
  });

  it('B4: suspend an approved driver; then only reinstate is offered', async () => {
    handlers();
    const {acts} = more();
    const user = await open();
    expect(screen.queryByRole('button', {name: 'Восстановить допуск'})).toBeNull();
    await user.type(screen.getByLabelText(why), 'Истекла страховка');
    await user.click(screen.getByRole('button', {name: 'Приостановить допуск'}));
    expect(await screen.findByText('Проверка: приостановлен')).toBeVisible();
    expect(acts).toEqual([{action: 'suspend', body: {command_id: expect.any(String), expected_version: 4,
      reason: 'Истекла страховка'}}]);
    expect(screen.getByRole('button', {name: 'Восстановить допуск'})).toBeVisible();
    expect(screen.queryByRole('button', {name: 'Приостановить допуск'})).toBeNull();
  });

  it('B4: reinstate a suspended driver', async () => {
    handlers();
    const {acts} = more({current: () => at('ACTIVE', 'SUSPENDED')});
    const user = await open();
    await user.type(screen.getByLabelText(why), 'Новая страховка');
    await user.click(screen.getByRole('button', {name: 'Восстановить допуск'}));
    expect(await screen.findByText('Проверка: допущен')).toBeVisible();
    expect(acts).toEqual([{action: 'reinstate', body: {command_id: expect.any(String), expected_version: 4,
      reason: 'Новая страховка'}}]);
  });

  it('B4: neither suspend nor reinstate for a driver in review', async () => {
    handlers();
    more({current: () => at('ACTIVE', 'IN_REVIEW')});
    await open();
    expect(screen.queryByRole('button', {name: 'Приостановить допуск'})).toBeNull();
    expect(screen.queryByRole('button', {name: 'Восстановить допуск'})).toBeNull();
  });

  it.each([['no reason', ''], ['a reason over 1000 characters', 'x'.repeat(1001)]])(
    'B5: %s sends nothing', async (_name, text) => {
      handlers();
      const {acts} = more();
      const user = await open();
      if (text) {
        await user.click(screen.getByLabelText(why));
        await user.paste(text);
      }
      await user.click(screen.getByRole('button', {name: 'Заблокировать аккаунт'}));
      expect(await screen.findByText('Нужна причина, не длиннее 1000 символов.')).toBeVisible();
      expect(acts).toEqual([]);
    });

  it('B6: a conflict is told, the case is read again, and the next command carries the new version', async () => {
    handlers();
    let version = 4;
    let first = true;
    const {acts} = more({current: () => at('ACTIVE', 'APPROVED', version), act: () => {
      if (first) {
        first = false;
        version = 9;
        return HttpResponse.json(problem(409, 'VERSION_CONFLICT'), {status: 409});
      }
      return HttpResponse.json(at('BLOCKED', 'APPROVED', 10) as never);
    }});
    const user = await open();
    await user.type(screen.getByLabelText(why), 'r');
    await user.click(screen.getByRole('button', {name: 'Заблокировать аккаунт'}));
    expect(await screen.findByText('Водитель изменился, пока вы решали. Проверьте ещё раз.')).toBeVisible();
    await user.clear(screen.getByLabelText(why));
    await user.type(screen.getByLabelText(why), 'r');
    await user.click(screen.getByRole('button', {name: 'Заблокировать аккаунт'}));
    expect(await screen.findByText('Аккаунт: заблокирован')).toBeVisible();
    expect(acts.map(a => a.body.expected_version)).toEqual([4, 9]);
  });

  it('B7: a double click sends one command', async () => {
    handlers();
    const {acts} = more({act: async () => {
      await delay(100);
      return HttpResponse.json(at('BLOCKED', 'APPROVED', 5) as never);
    }});
    const user = await open();
    await user.type(screen.getByLabelText(why), 'r');
    await user.dblClick(screen.getByRole('button', {name: 'Заблокировать аккаунт'}));
    expect(await screen.findByText('Аккаунт: заблокирован')).toBeVisible();
    expect(acts).toHaveLength(1);
  });
});
