// Java line-length ratchet (issue #149, lessons case 14): no Java file under server/src may have more lines over 120
// characters than its entry in java-line-length-baseline.json; a file not listed is allowed none. A file whose count
// went down fails too, until the baseline is lowered, so the baseline only ever goes down.
//   node scripts/audit/java-line-length.mjs            check (exit 1 on any finding)
//   node scripts/audit/java-line-length.mjs --print    print the current counts as a baseline, to review and commit
import { readFileSync, readdirSync, statSync } from 'node:fs';
import { join, relative, resolve, dirname } from 'node:path';
import { fileURLToPath } from 'node:url';

const LIMIT = 120;
const here = dirname(fileURLToPath(import.meta.url));
const root = resolve(here, '..', '..');
const baselineFile = join(here, 'java-line-length-baseline.json');

function javaFiles(dir) {
  return readdirSync(dir).flatMap((name) => {
    const path = join(dir, name);
    if (statSync(path).isDirectory()) return javaFiles(path);
    return name.endsWith('.java') ? [path] : [];
  });
}

const counts = {};
const long = {};
for (const path of javaFiles(join(root, 'server', 'src'))) {
  const lines = readFileSync(path, 'utf8').split('\n');
  const over = [];
  lines.forEach((line, i) => {
    // Characters, not UTF-16 units: Cyrillic text counts one per letter, as an editor shows it.
    if ([...line].length > LIMIT) over.push(i + 1);
  });
  if (over.length) {
    const name = relative(root, path).split('\\').join('/');
    counts[name] = over.length;
    long[name] = over;
  }
}

if (process.argv.includes('--print')) {
  const sorted = Object.fromEntries(Object.entries(counts).sort(([a], [b]) => a.localeCompare(b)));
  process.stdout.write(`${JSON.stringify(sorted, null, 2)}\n`);
  process.exit(0);
}

const baseline = JSON.parse(readFileSync(baselineFile, 'utf8'));
const problems = [];
for (const [name, count] of Object.entries(counts)) {
  const allowed = baseline[name] ?? 0;
  if (count > allowed) {
    problems.push(`${name}: ${count} lines over ${LIMIT} characters, ${allowed} allowed; lines ${long[name].join(', ')}`);
  }
}
for (const [name, allowed] of Object.entries(baseline)) {
  const count = counts[name] ?? 0;
  if (count < allowed) {
    problems.push(`${name}: lower the baseline for ${name} to ${count} (it allows ${allowed})`);
  }
}
if (problems.length) {
  console.error(`Java line length (${LIMIT}): ${problems.length} finding(s)`);
  problems.forEach((p) => console.error(`  ${p}`));
  process.exit(1);
}
console.log(`Java line length (${LIMIT}): ${Object.keys(counts).length} file(s) within their baseline`);
