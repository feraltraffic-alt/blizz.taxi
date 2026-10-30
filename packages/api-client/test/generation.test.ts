import {it, expect} from 'vitest';
import {mkdtempSync, mkdirSync, writeFileSync, rmSync, unlinkSync} from 'node:fs';
import {tmpdir} from 'node:os';
import {resolve} from 'node:path';
import {spawnSync} from 'node:child_process';

it('E6: real generator rejects an edited input, missing output and an unexpected output', () => {
  const directory = mkdtempSync(resolve(tmpdir(), 'blizz-generation-'));
  const input = resolve(directory, 'contracts');
  const output = resolve(directory, 'generated');
  mkdirSync(input);
  const document = JSON.stringify({openapi: '3.1.0', info: {title: 'Probe', version: '1'}, paths: {},
    components: {schemas: {First: {type: 'string'}, Second: {type: 'integer'}}}});
  const source = resolve(input, 'probe.json');
  writeFileSync(source, document);
  function run(check = false) {
    return spawnSync(process.execPath, ['scripts/generate-api.mjs', '--contracts-dir', input,
      '--output-dir', output, ...(check ? ['--check'] : [])], {encoding: 'utf8'});
  }
  try {
    expect(run().status).toBe(0);
    expect(run(true).status).toBe(0);
    writeFileSync(source, document.replace('"version":"1"', '"version":"2"'));
    const edited = run(true);
    expect(edited.status).toBe(1);
    expect(edited.stderr).toContain('inputs.json');
    writeFileSync(source, document);
    expect(run().status).toBe(0);
    unlinkSync(resolve(output, 'probe.ts'));
    expect(run(true).status).toBe(1);
    expect(run().status).toBe(0);
    writeFileSync(resolve(output, 'untracked.ts'), 'export type Unexpected = string;\n');
    const unexpected = run(true);
    expect(unexpected.status).toBe(1);
    expect(unexpected.stderr).toContain('unexpected untracked.ts');
  } finally {
    rmSync(directory, {recursive: true, force: true});
  }
}, 30_000);
