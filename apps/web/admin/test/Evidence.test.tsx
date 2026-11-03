import {afterAll, afterEach, beforeAll, beforeEach, describe, expect, it, vi} from 'vitest';
import {render, screen, waitFor} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {MemoryRouter} from 'react-router-dom';
import {http, HttpResponse} from 'msw';
import {setupServer} from 'msw/node';
import {createApiClient} from '@blizz/api-client';
import {AdminApp} from '../src/App.js';
import {browserRefreshTokens} from '../src/storage.js';
import {cid, me, problem, session} from '../../../../test/fixtures.js';

/** An order's evidence for a chargeback, exported with a reason (#430): E1–E4 of the issue. */
const origin = 'https://api.blizz.test';
const server = setupServer();
beforeAll(() => server.listen({onUnhandledFrame: 'error'}));
afterAll(() => server.close());

const statics = URL as unknown as {createObjectURL?: (blob: Blob) => string; revokeObjectURL?: (url: string) => void};
let made: Blob[] = [];
let revoked: string[] = [];
beforeEach(() => {
  made = [];
  revoked = [];
  statics.createObjectURL = vi.fn((blob: Blob) => {
    made.push(blob);
    return 'blob:evidence-' + made.length;
  });
  statics.revokeObjectURL = vi.fn((url: string) => {
    revoked.push(url);
  });
});
afterEach(() => {
  server.resetHandlers();
  sessionStorage.clear();
  localStorage.clear();
  vi.restoreAllMocks();
  delete statics.createObjectURL;
  delete statics.revokeObjectURL;
});

const ORDER = '0d000000-0000-4000-8000-000000000001';
const payments = {...me, effective_permissions: ['orders.view', 'payments.retry']};
const operation = {id: '01000000-0000-4000-8000-000000000001', order_id: ORDER, type: 'SETTLE', state: 'SUCCEEDED',
  amount_minor: 12500, currency: 'UAH', provider_status: null, reason: null, retry_of: null, initiated_by: null,
  created_at: '2026-10-30T09:00:00Z'};
const evidence = (n: number) => ({generated_at: '2026-11-03T10:00:00Z', order: {id: ORDER, export: n}, driver: null,
  track: {points: 0}, rider: null, card_operations: [{id: 'a'}, {id: 'b'}], chat: [{id: 1}, {id: 2}, {id: 3}],
  support_cases: [{id: 'x'}]});

function handlers(opts: {evidence?: (n: number) => Response} = {}) {
  const asked: (string | null)[] = [];
  server.use(
    http.get(origin + '/api/admin/v1/me', () => HttpResponse.json(payments as never)),
    http.get(origin + '/api/admin/v1/orders/' + ORDER + '/timeline', () => HttpResponse.json({events: []} as never)),
    http.get(origin + '/api/admin/v1/orders/' + ORDER + '/fare', () => HttpResponse.json(problem(404, 'NOT_FOUND'),
      {status: 404})),
    http.get(origin + '/api/admin/v1/orders/' + ORDER + '/payment-operations', () =>
      HttpResponse.json({operations: [operation]} as never)),
    http.get(origin + '/api/admin/v1/orders/' + ORDER + '/chargebacks', () =>
      HttpResponse.json({chargebacks: []} as never)),
    http.get(origin + '/api/admin/v1/orders/' + ORDER + '/evidence', ({request}) => {
      asked.push(new URL(request.url).searchParams.get('reason'));
      return opts.evidence ? opts.evidence(asked.length) : HttpResponse.json(evidence(asked.length) as never);
    }));
  return {asked};
}

function mount() {
  const api = createApiClient({baseUrl: origin, refreshTokens: browserRefreshTokens(sessionStorage),
    correlationId: () => cid, initialSession: session});
  return render(<MemoryRouter initialEntries={['/orders/' + ORDER]}><AdminApp client={api} /></MemoryRouter>);
}

const read = (blob: Blob) => new Response(blob).text();

async function exportWith(user: ReturnType<typeof userEvent.setup>, reason: string) {
  const input = await screen.findByLabelText('Причина выгрузки');
  if (reason) {
    await user.click(input);
    await user.paste(reason);
  }
  await user.click(screen.getByRole('button', {name: 'Выгрузить доказательства'}));
}

describe('E1: export', () => {
  it('asks with reason, offers the server JSON as a file, sums it up and empties the reason', async () => {
    const h = handlers();
    const user = userEvent.setup();
    mount();
    await exportWith(user, 'Запрос банка 4837');
    const link = await screen.findByRole('link', {name: 'Сохранить файл доказательств'});
    expect(h.asked).toEqual(['Запрос банка 4837']);
    expect(link).toHaveAttribute('href', 'blob:evidence-1');
    expect(link).toHaveAttribute('download', 'evidence-0d000000.json');
    expect(JSON.parse(await read(made[0]!))).toEqual(evidence(1));
    expect(screen.getByText('Сформировано 03.11.2026 10:00 UTC · операций по карте 2 · сообщений чата 3 · '
      + 'обращений 1')).toBeTruthy();
    expect((screen.getByLabelText('Причина выгрузки') as HTMLInputElement).value).toBe('');
  });
});

describe('E2: refused before sending', () => {
  it.each([['no reason', ''], ['blank reason', '   '], ['a reason over 500', 'x'.repeat(501)]])('%s',
    async (_name, reason) => {
      const h = handlers();
      const user = userEvent.setup();
      mount();
      await exportWith(user, reason);
      expect(await screen.findByText('Нужна причина выгрузки до 500 знаков.')).toBeTruthy();
      expect(h.asked).toHaveLength(0);
      expect(screen.queryByRole('link', {name: 'Сохранить файл доказательств'})).toBeNull();
    });
});

describe('E3: each export asks again', () => {
  it('a second export asks again, the earlier file is revoked, and the last when the page is left', async () => {
    const h = handlers();
    const user = userEvent.setup();
    const view = mount();
    await exportWith(user, 'Первый запрос');
    await screen.findByRole('link', {name: 'Сохранить файл доказательств'});
    await exportWith(user, 'Второй запрос');
    await waitFor(() => expect(screen.getByRole('link', {name: 'Сохранить файл доказательств'}))
      .toHaveAttribute('href', 'blob:evidence-2'));
    expect(h.asked).toEqual(['Первый запрос', 'Второй запрос']);
    expect(JSON.parse(await read(made[1]!))).toEqual(evidence(2));
    expect(revoked).toEqual(['blob:evidence-1']);
    view.unmount();
    expect(revoked).toEqual(['blob:evidence-1', 'blob:evidence-2']);
  });
});

describe('E4: failure', () => {
  it.each([[404, 'NOT_FOUND'], [500, 'INTERNAL']])('%s says the export failed, no file', async (status, code) => {
    handlers({evidence: () => HttpResponse.json(problem(status, code), {status})});
    const user = userEvent.setup();
    mount();
    await exportWith(user, 'Запрос банка');
    expect(await screen.findByText('Выгрузить не удалось.')).toBeTruthy();
    expect(screen.queryByRole('link', {name: 'Сохранить файл доказательств'})).toBeNull();
    expect(made).toHaveLength(0);
  });
});
