#!/usr/bin/env node
// No secret in a client bundle (AC-23, #253): node scripts/audit/bundle-secrets.mjs <build dir>...
//
// Reads every text file of the given build folders (scripts, HTML, CSS, JSON, source maps) and fails, naming the file
// and the kind, on:
//  - a PEM private key block;
//  - a credential of a known shape (AWS, Google, GitHub, Slack, Stripe live, a signed JWT);
//  - the name of a server secret variable, read from application*.yml (every ${NAME...}) and the deploy guide's table,
//    when the name says SECRET, PASSWORD, KEY or TOKEN;
//  - a value of those secrets in the sandbox profile (application-sandbox.yml defaults and merchant secrets).
// The words "password" or "token" in texts and paths are fine: the server's names and values are what may not ship.
import {existsSync, readdirSync, readFileSync, statSync} from 'node:fs';
import {dirname, extname, join, relative} from 'node:path';
import {fileURLToPath} from 'node:url';

const root = join(dirname(fileURLToPath(import.meta.url)), '..', '..');
const resources = join(root, 'server', 'src', 'main', 'resources');
const TEXT = new Set(['.js', '.mjs', '.cjs', '.html', '.css', '.json', '.map', '.txt', '.svg', '.webmanifest']);

const shapes = [
  ['PEM private key', /-----BEGIN [A-Z ]*PRIVATE KEY-----/],
  ['AWS access key id', /\b(?:AKIA|ASIA)[0-9A-Z]{16}\b/],
  ['Google API key', /\bAIza[0-9A-Za-z_-]{35}\b/],
  ['GitHub token', /\b(?:gh[pousr]_[0-9A-Za-z]{36}|github_pat_[0-9A-Za-z_]{22,})\b/],
  ['Slack token', /\bxox[abprs]-[0-9A-Za-z-]{10,}/],
  ['Stripe live key', /\b[sr]k_live_[0-9A-Za-z]{16,}/],
  ['signed JWT', /\beyJ[0-9A-Za-z_-]{8,}\.eyJ[0-9A-Za-z_-]{8,}\.[0-9A-Za-z_-]{16,}/]
];

/** The server's secret variable names: ${NAME} or ${NAME:default} in any application*.yml profile. */
function secretNames() {
  const text = readdirSync(resources).filter(name => /^application.*\.ya?ml$/.test(name))
    .map(name => readFileSync(join(resources, name), 'utf8')).join('\n');
  // Variables bound by Spring's relaxed names (blizz.routing.graphhopper.api-key) appear only in the deploy guide.
  const guide = readFileSync(join(root, 'deploy', 'README.md'), 'utf8');
  const names = new Set([...guide.matchAll(/^\| `([A-Z][A-Z0-9_]*)` \|/gm)].map(match => match[1])
    .filter(name => /SECRET|PASSWORD|KEY|TOKEN/.test(name)));
  for (const match of text.matchAll(/\$\{([A-Z][A-Z0-9_]*)[:}]/g)) {
    if (/SECRET|PASSWORD|KEY|TOKEN/.test(match[1])) names.add(match[1]);
  }
  if (names.size === 0) throw new Error('No secret variables in application*.yml: the scanner would see nothing');
  return [...names];
}

/** The sandbox profile's values of those secrets, and its merchant secrets (a nested "secrets:" map). */
function sandboxValues(names) {
  const text = readFileSync(join(resources, 'application-sandbox.yml'), 'utf8');
  const values = new Set();
  for (const match of text.matchAll(/\$\{([A-Z][A-Z0-9_]*):([^}]+)\}/g)) {
    if (names.includes(match[1]) || /SECRET|PASSWORD|KEY|TOKEN/.test(match[1])) values.add(match[2].trim());
  }
  const lines = text.split('\n');
  for (let i = 0; i < lines.length; i++) {
    const head = /^(\s*)secrets:\s*$/.exec(lines[i]);
    if (!head) continue;
    for (let j = i + 1; j < lines.length; j++) {
      const entry = /^(\s*)[\w.-]+:\s*(\S.*)$/.exec(lines[j]);
      if (!entry || entry[1].length <= head[1].length) break;
      if (!entry[2].startsWith('${')) values.add(entry[2].trim());
    }
  }
  return [...values].filter(value => value.length >= 8);
}

function files(dir) {
  const found = [];
  for (const name of readdirSync(dir)) {
    const path = join(dir, name);
    if (statSync(path).isDirectory()) found.push(...files(path));
    else if (TEXT.has(extname(name))) found.push(path);
  }
  return found;
}

const dirs = process.argv.slice(2);
if (dirs.length === 0) {
  console.error('usage: node scripts/audit/bundle-secrets.mjs <build dir>...');
  process.exit(2);
}
const names = secretNames();
const values = sandboxValues(names);
const findings = [];
let scanned = 0;
for (const dir of dirs) {
  if (!existsSync(dir) || !statSync(dir).isDirectory()) {
    console.error(`${dir}: no such build folder (build it first)`);
    process.exit(2);
  }
  for (const file of files(dir)) {
    scanned++;
    const text = readFileSync(file, 'utf8');
    const where = relative(process.cwd(), file);
    for (const [kind, pattern] of shapes) if (pattern.test(text)) findings.push(`${where}: ${kind}`);
    for (const name of names) {
      if (new RegExp(`\\b${name}\\b`).test(text)) findings.push(`${where}: server secret name ${name}`);
    }
    for (const value of values) if (text.includes(value)) findings.push(`${where}: sandbox secret value`);
  }
}
if (scanned === 0) {
  console.error(`${dirs.join(', ')}: no text files to scan`);
  process.exit(2);
}
if (findings.length > 0) {
  console.error(`Secrets in the client bundles (${findings.length}):`);
  for (const finding of findings) console.error('  ' + finding);
  process.exit(1);
}
console.log(`Bundles: ${scanned} file(s) in ${dirs.length} folder(s), no secrets (${names.length} names, ` +
  `${values.length} sandbox values, ${shapes.length} shapes).`);
