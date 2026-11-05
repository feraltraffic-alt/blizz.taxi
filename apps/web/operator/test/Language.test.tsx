import {afterEach, describe, expect, it} from 'vitest';
import {render, screen} from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import {createApiClient} from '@blizz/api-client';
import {OperatorApp} from '../src/App.js';
import {cid} from '../../../../test/fixtures.js';

/** The workstation's language (owner decision 27.10.2026: Russian by default, Ukrainian and Polish too). */
afterEach(() => {localStorage.clear(); sessionStorage.clear();});

const signedOut = () => createApiClient({baseUrl: 'https://api.blizz.test', refreshTokens: {read: () => null,
  write: () => {}}, correlationId: () => cid, fetch: (async () => new Response(null, {status: 401})) as never});

describe('the operator workstation', () => {
  it('switches language on its own key', async () => {
    render(<OperatorApp client={signedOut()} />);
    const user = userEvent.setup();
    expect(await screen.findByText('Вход оператора')).toBeVisible();
    await user.selectOptions(screen.getByLabelText('Язык'), 'pl');
    expect(await screen.findByText('Logowanie operatora')).toBeVisible();
    expect(localStorage.getItem('blizz.operator.locale')).toBe('pl');
    expect(localStorage.getItem('blizz.admin.locale')).toBeNull();
  });
});
