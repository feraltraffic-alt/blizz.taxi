#!/usr/bin/env node
// Validates a single sandbox API response against the OpenAPI 3.1 contracts.
// Called from scripts/sandbox/lib.sh api(). Caches bundled specs in /tmp.
// Usage: node validate-response.mjs METHOD PATH STATUS < body.json
// Exits 0 on ok / skipped, 1 on schema mismatch (prints one-line error to stderr).

import { createRequire } from "node:module";
import { readFileSync, writeFileSync, existsSync, mkdirSync } from "node:fs";
import { join, dirname } from "node:path";
import { fileURLToPath } from "node:url";
import { execSync } from "node:child_process";

const __dirname = dirname(fileURLToPath(import.meta.url));
const REPO_ROOT = join(__dirname, "../..");
const CONTRACTS = join(REPO_ROOT, "packages/contracts");
const CACHE = "/tmp/blizz-sandbox-contracts";
const OPS_LOG = "/tmp/sandbox-ops-checked.txt";

const require = createRequire(join(CONTRACTS, "package.json"));
const Ajv2020 = require("ajv/dist/2020.js").default;
const addFormats = require("ajv-formats").default;

const MAIN_APIS = [
  "auth-v1",
  "rider-v1",
  "driver-v1",
  "admin-v1",
  "operator-v1",
  "config-v1",
  "providers-v1",
];

function ensureBundled() {
  if (existsSync(join(CACHE, "ready"))) return;
  mkdirSync(CACHE, { recursive: true });
  // Ensure node_modules exist
  if (!existsSync(join(CONTRACTS, "node_modules"))) {
    execSync("npm ci --no-fund --no-audit", { cwd: CONTRACTS, stdio: "ignore" });
  }
  for (const api of MAIN_APIS) {
    const out = join(CACHE, `${api}.json`);
    if (!existsSync(out)) {
      execSync(
        `npx redocly bundle ${api} --dereferenced -o ${out}`,
        { cwd: CONTRACTS, stdio: "ignore" }
      );
    }
  }
  writeFileSync(join(CACHE, "ready"), "1");
}

function loadSpecs() {
  ensureBundled();
  const specs = [];
  for (const api of MAIN_APIS) {
    const p = join(CACHE, `${api}.json`);
    if (existsSync(p)) specs.push(JSON.parse(readFileSync(p, "utf8")));
  }
  return specs;
}

// Build a list of { template, method, status -> schema, operationId, pathRegex }
function buildIndex(specs) {
  const index = [];
  for (const spec of specs) {
    for (const [template, pathItem] of Object.entries(spec.paths || {})) {
      for (const method of ["get", "post", "put", "patch", "delete", "head", "options"]) {
        const op = pathItem[method];
        if (!op || !op.responses) continue;
        const responses = {};
        for (const [status, resp] of Object.entries(op.responses)) {
          const schema = resp?.content?.["application/json"]?.schema
            ?? resp?.content?.["application/problem+json"]?.schema;
          if (schema) responses[status] = schema;
        }
        if (Object.keys(responses).length === 0) continue;
        // Convert template to regex: {param} -> [^/]+
        const regexStr = "^" + template.replace(/\{[^}]+\}/g, "[^/]+") + "$";
        index.push({
          template,
          method: method.toUpperCase(),
          responses,
          operationId: op.operationId || `${method} ${template}`,
          regex: new RegExp(regexStr),
        });
      }
    }
  }
  // Longer / more specific templates first
  index.sort((a, b) => b.template.length - a.template.length);
  return index;
}

function matchOperation(index, method, path) {
  const clean = path.split("?")[0];
  for (const entry of index) {
    if (entry.method === method && entry.regex.test(clean)) return entry;
  }
  return null;
}

const [,, method, path, status] = process.argv;
if (!method || !path || !status) {
  console.error("Usage: validate-response.mjs METHOD PATH STATUS < body");
  process.exit(2);
}

// Skip non-API or sandbox
if (path.startsWith("/sandbox/") || path === "/readyz" || path === "/livez") {
  process.exit(0);
}

let body = "";
try {
  body = readFileSync(0, "utf8").trim();
} catch {
  process.exit(0);
}
if (!body || status === "204" || status === "101") process.exit(0);

// Quick JSON check
if (!body.startsWith("{") && !body.startsWith("[")) process.exit(0);

let json;
try {
  json = JSON.parse(body);
} catch {
  console.error(`${method} ${path} ${status}: response is not valid JSON`);
  process.exit(1);
}

const specs = loadSpecs();
const index = buildIndex(specs);
const op = matchOperation(index, method.toUpperCase(), path);

if (!op) {
  // Path not in contracts — skip (or could warn)
  process.exit(0);
}

const schema = op.responses[status] || op.responses["default"];
if (!schema) {
  // No schema for this status — skip
  process.exit(0);
}

const ajv = new Ajv2020({ strict: false, allErrors: false, coerceTypes: false });
addFormats(ajv);
let validate;
try {
  validate = ajv.compile(schema);
} catch (e) {
  console.error(`${method} ${path} ${status}: cannot compile schema (${e.message})`);
  process.exit(1);
}

if (!validate(json)) {
  const err = validate.errors?.[0];
  const msg = err
    ? `${err.instancePath || "/"} ${err.message}`
    : "schema error";
  console.error(`${method} ${path} ${status}: ${msg}`);
  process.exit(1);
}

// Record that this operation was checked
try {
  const line = `${op.method} ${op.template}\n`;
  writeFileSync(OPS_LOG, line, { flag: "a" });
} catch { /* ignore */ }

process.exit(0);
