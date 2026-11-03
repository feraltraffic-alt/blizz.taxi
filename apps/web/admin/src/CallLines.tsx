import {useCallback, useEffect, useRef, useState} from 'react';
import {ApiError, type ApiClient} from '@blizz/api-client';
import {Failure, type Translate} from '@blizz/web-ui';

type Line = {number: string; city_id: string; label: string | null; version: number};

const E164 = /^\+[1-9][0-9]{7,14}$/;

/**
 * The call centre's service numbers and their cities for holders of settings.manage (#407): a call to a number goes
 * to its city's operators. Adding is version 0, moving and removing carry the version read; removing sends city null.
 */
export function CallLines({client, t, newId}: {client: ApiClient; t: Translate; newId: () => string}) {
  const [lines, setLines] = useState<Line[] | null>(null);
  const [cities, setCities] = useState<{id: string; name: string}[]>([]);
  const [moves, setMoves] = useState<Record<string, string>>({});
  const [reasons, setReasons] = useState<Record<string, string>>({});
  const [form, setForm] = useState({number: '', city: '', label: '', reason: ''});
  const [message, setMessage] = useState<string | null>(null);
  const [error, setError] = useState<unknown>(null);
  const acting = useRef(false);

  const read = useCallback(async () => {
    setLines(((await client.get('/api/admin/v1/call-lines' as never, {} as never)) as {lines: Line[]}).lines);
  }, [client]);

  useEffect(() => {
    read().catch(failure => setError(failure));
    client.get('/api/config/v1/bootstrap' as never, {} as never)
      .then(boot => setCities((boot as {cities: {id: string; name: string}[]}).cities)).catch(() => undefined);
  }, [client, read]);

  async function change(number: string, body: Record<string, unknown>, after: (answer: Line) => void) {
    if (acting.current) return;
    acting.current = true;
    setMessage(null);
    setError(null);
    try {
      after(await client.post('/api/admin/v1/call-lines/{number}' as never, {params: {number},
        body: {command_id: newId(), ...body}} as never) as Line);
    } catch (failure) {
      if (failure instanceof ApiError && failure.status === 409) {
        setMessage(t('lineConflict'));
        await read().catch(again => setError(again));
      } else setError(failure);
    } finally {
      acting.current = false;
    }
  }

  function add() {
    const number = form.number.trim();
    const label = form.label.trim();
    const reason = form.reason.trim();
    if (!E164.test(number) || !form.city || label.length > 80 || !reason || reason.length > 500
      || (lines ?? []).some(l => l.number === number)) {
      setMessage(t('lineNeeds'));
      return;
    }
    return change(number, {expected_version: 0, city_id: form.city, label: label || null, reason}, answer => {
      setLines(list => [...(list ?? []), answer]);
      setForm({number: '', city: '', label: '', reason: ''});
    });
  }

  function move(l: Line, remove: boolean) {
    const reason = (reasons[l.number] ?? '').trim();
    if (!reason || reason.length > 500) {
      setMessage(t('lineReasonNeeds'));
      return;
    }
    const body = remove ? {expected_version: l.version, city_id: null, reason}
      : {expected_version: l.version, city_id: moves[l.number] ?? l.city_id, label: l.label, reason};
    return change(l.number, body, answer => setLines(list => remove ? (list ?? []).filter(x => x.number !== l.number)
      : (list ?? []).map(x => x.number === l.number ? answer : x)));
  }

  const name = (id: string) => cities.find(c => c.id === id)?.name ?? id;
  return (
    <section aria-labelledby="lines-title">
      <h1 id="lines-title">{t('linesTitle')}</h1>
      <ul>
        {(lines ?? []).map(l => (
          <li key={l.number}>
            <span>{[l.number, name(l.city_id), ...(l.label ? [l.label] : [])].join(' · ')}</span>
            <label>{t('lineNewCity')}
              <select value={moves[l.number] ?? l.city_id} onChange={e => setMoves(all => ({...all,
                [l.number]: e.target.value}))}>
                {cities.map(c => <option key={c.id} value={c.id}>{c.name}</option>)}
              </select>
            </label>
            <label>{t('lineReason')}<input value={reasons[l.number] ?? ''}
              onChange={e => setReasons(all => ({...all, [l.number]: e.target.value}))} /></label>
            <button type="button" onClick={() => void move(l, false)}>{t('lineMove')}</button>
            <button type="button" onClick={() => void move(l, true)}>{t('lineRemove')}</button>
          </li>
        ))}
      </ul>
      <fieldset>
        <legend>{t('lineAddTitle')}</legend>
        <label>{t('lineNumber')}<input type="tel" value={form.number}
          onChange={e => setForm(f => ({...f, number: e.target.value}))} /></label>
        <label htmlFor="line-city">{t('lineCity')}</label>
        <select id="line-city" value={form.city} onChange={e => setForm(f => ({...f, city: e.target.value}))}>
          <option value="">—</option>
          {cities.map(c => <option key={c.id} value={c.id}>{c.name}</option>)}
        </select>
        <label>{t('lineLabel')}<input value={form.label} onChange={e => setForm(f => ({...f, label: e.target.value}))} />
        </label>
        <label>{t('lineAddReason')}<input value={form.reason}
          onChange={e => setForm(f => ({...f, reason: e.target.value}))} /></label>
        <button type="button" onClick={() => void add()}>{t('lineAdd')}</button>
      </fieldset>
      {message ? <p role="status">{message}</p> : null}
      {error ? <Failure error={error} t={t} /> : null}
    </section>
  );
}
