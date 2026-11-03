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
const item = (n: number, over: Record<string, unknown> = {}) => ({driver_id: 'd000000' + n
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
  it('lists the drivers with phone and date; "more" reads by after', async () => {
    const {asked} = handlers({queue: q => q.get('after') ? {drivers: [item(2)], page: {next_cursor: null,
      has_more: false}} : {drivers: [item(1)], page: {next_cursor: 'c2', has_more: true}}});
    mount();
    expect(await screen.findByRole('link', {name: /Водитель 1 · \+380500000001 · с /})).toBeVisible();
    await userEvent.setup().click(screen.getByRole('button', {name: 'Ещё'}));
    expect(await screen.findByRole('link', {name: /Водитель 2/})).toBeVisible();
    expect(asked.queue.map(q => q.get('after'))).toEqual([null, 'c2']);
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
