import {afterEach, describe, expect, it, vi} from 'vitest';
import {render, screen} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {MemoryRouter} from 'react-router-dom';
import {createApiClient} from '@blizz/api-client';
import {AdminApp} from '../src/App.js';
import {cid} from '../../../../test/fixtures.js';

/** The panels' language (owner decision 27.10.2026: Russian by default, Ukrainian and Polish too). */
afterEach(() => {localStorage.clear(); sessionStorage.clear(); vi.restoreAllMocks();});

const signedOut = () => createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: {read: () => null,
  write: () => {}}, correlationId: () => cid, fetch: (async () => new Response(null, {status: 401})) as never});

describe('the admin panel', () => {
  it('is Russian by default, switches to Ukrainian and Polish, and remembers the choice', async () => {
    const {unmount} = render(<MemoryRouter><AdminApp client={signedOut()} /></MemoryRouter>);
    const user = userEvent.setup();
    expect(await screen.findByText('Вход для сотрудников')).toBeVisible();
    await user.selectOptions(screen.getByLabelText('Язык'), 'uk');
    expect(await screen.findByText('Вхід для співробітників')).toBeVisible();
    expect(localStorage.getItem('blizz.admin.locale')).toBe('uk');
    unmount();
    render(<MemoryRouter><AdminApp client={signedOut()} /></MemoryRouter>);
    expect(await screen.findByText('Вхід для співробітників')).toBeVisible();
    await user.selectOptions(screen.getByLabelText('Мова'), 'pl');
    expect(await screen.findByText('Logowanie pracowników')).toBeVisible();
    await user.selectOptions(screen.getByLabelText('Język'), 'en');
    expect(screen.getByLabelText('Language')).toHaveValue('en');
    expect(localStorage.getItem('blizz.admin.locale')).toBe('en');
  });

  it('a stored value that is not a language, or a blocked storage, gives Russian', async () => {
    localStorage.setItem('blizz.admin.locale', 'xx');
    const {unmount} = render(<MemoryRouter><AdminApp client={signedOut()} /></MemoryRouter>);
    expect(await screen.findByText('Вход для сотрудников')).toBeVisible();
    unmount();
    vi.spyOn(Storage.prototype, 'getItem').mockImplementation(() => {throw new Error('blocked');});
    vi.spyOn(Storage.prototype, 'setItem').mockImplementation(() => {throw new Error('blocked');});
    render(<MemoryRouter><AdminApp client={signedOut()} /></MemoryRouter>);
    const user = userEvent.setup();
    expect(await screen.findByText('Вход для сотрудников')).toBeVisible();
    await user.selectOptions(screen.getByLabelText('Язык'), 'uk');
    expect(await screen.findByText('Вхід для співробітників')).toBeVisible();
  });
});
