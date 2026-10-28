#!/usr/bin/env node
// Validates a single sandbox API response against the OpenAPI 3.1 contracts.
// Called from scripts/sandbox/lib.sh api(). Caches bundled specs in /tmp keyed by openapi hash.
// Usage: node validate-response.mjs METHOD PATH STATUS < body.json
// Exits 0 on ok / skipped, 1 on schema mismatch (prints one-line error to stderr).

import { createRequire } from "node:module";
import { readFileSync, writeFileSync, existsSync, mkdirSync, readdirSync, statSync } from "node:fs";
import { join, dirname } from "node:path";
import { fileURLToPath } from "node:url";
import { execSync } from "node:child_process";
import { createHash } from "node:crypto";

const __dirname = dirname(fileURLToPath(import.meta.url));
const REPO_ROOT = join(__dirname, "../..");
const CONTRACTS = join(REPO_ROOT, "packages/contracts");
const OPENAPI_DIR = join(CONTRACTS, "openapi");
const CACHE_BASE = "/tmp/blizz-sandbox-contracts";
const OPS_LOG = "/tmp/sandbox-ops-checked.txt";
const UNKNOWN_PATHS_LOG = "/tmp/sandbox-unknown-paths.txt";

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

function openapiHash() {
  const hash = createHash("sha256");
  const files = readdirSync(OPENAPI_DIR).filter(f => f.endsWith(".yaml") || f.endsWith(".yml")).sort();
  for (const f of files) {
    const p = join(OPENAPI_DIR, f);
    hash.update(f);
    hash.update(readFileSync(p));
  }
  return hash.digest("hex").slice(0, 16);
}

function ensureBundled() {
  const hash = openapiHash();
  const CACHE = join(CACHE_BASE, hash);
  if (existsSync(join(CACHE, "ready"))) return CACHE;
  mkdirSync(CACHE, { recursive: true });
  if (!existsSync(join(CONTRACTS, "node_modules"))) {
    execSync("npm ci --no-fund --no-audit", { cwd: CONTRACTS, stdio: "ignore" });
  }
  for (const api of MAIN_APIS) {
    const out = join(CACHE, `${api}.json`);
    execSync(
      `npx redocly bundle ${api} --dereferenced -o ${out}`,
      { cwd: CONTRACTS, stdio: "ignore" }
    );
  }
  writeFileSync(join(CACHE, "ready"), "1");
  return CACHE;
}

function loadSpecs() {
  const CACHE = ensureBundled();
  const specs = [];
  for (const api of MAIN_APIS) {
    const p = join(CACHE, `${api}.json`);
    if (existsSync(p)) specs.push(JSON.parse(readFileSync(p, "utf8")));
  }
  return specs;
}

// Recursively add unevaluatedProperties: false to object schemas that lack it
// (and lack additionalProperties). Do not touch schemas that are inside allOf/oneOf/anyOf.
function tightenSchema(schema, insideComposition = false) {
  if (!schema || typeof schema !== "object") return schema;
  if (Array.isArray(schema)) return schema.map(s => tightenSchema(s, insideComposition));

  const copy = { ...schema };
  const isComposition = !!(copy.allOf || copy.oneOf || copy.anyOf);

  // Recurse into subschemas
  for (const key of ["properties", "patternProperties", "additionalProperties", "unevaluatedProperties",
                     "items", "prefixItems", "contains", "if", "then", "else", "not",
                     "dependentSchemas", "propertyNames"]) {
    if (copy[key] && typeof copy[key] === "object") {
      if (key === "properties" || key === "patternProperties" || key === "dependentSchemas") {
        copy[key] = Object.fromEntries(
          Object.entries(copy[key]).map(([k, v]) => [k, tightenSchema(v, insideComposition)])
        );
      } else if (key === "items" || key === "prefixItems") {
        copy[key] = Array.isArray(copy[key]) ? copy[key].map(s => tightenSchema(s, insideComposition)) : tightenSchema(copy[key], insideComposition);
      } else {
        copy[key] = tightenSchema(copy[key], insideComposition);
      }
    }
  }
  for (const key of ["allOf", "oneOf", "anyOf"]) {
    if (Array.isArray(copy[key])) {
      copy[key] = copy[key].map(s => tightenSchema(s, true)); // mark as inside composition
    }
  }

  // Tighten only if not inside a composition and is a plain object
  if (!insideComposition && !isComposition &&
      copy.type === "object" &&
      copy.additionalProperties === undefined &&
      copy.unevaluatedProperties === undefined) {
    copy.unevaluatedProperties = false;
  }
  return copy;
}

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
          if (schema) responses[status] = tightenSchema(schema);
        }
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
  index.sort((a, b) => {
    const pa = (a.template.match(/\{/g) || []).length;
    const pb = (b.template.match(/\{/g) || []).length;
    if (pa !== pb) return pa - pb;
    return b.template.length - a.template.length;
  });
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

// Skip known non-contract paths
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
  const msg = `${method} ${path} ${status}: path not in contracts`;
  console.error(msg);
  try { writeFileSync(UNKNOWN_PATHS_LOG, `${method} ${path}\n`, { flag: "a" }); } catch {}
  process.exit(1);
}

const schema = op.responses[status];
if (!schema) {
  console.error(`${method} ${path} ${status}: response code not declared in contract`);
  process.exit(1);
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
  let msg = err ? `${err.instancePath || "/"} ${err.message}` : "schema error";
  if (err && (err.keyword === "unevaluatedProperties" || err.keyword === "additionalProperties") && err.params?.unevaluatedProperty) {
    msg = `${err.instancePath || "/"} unexpected property '${err.params.unevaluatedProperty}'`;
  } else if (err && err.keyword === "additionalProperties" && err.params?.additionalProperty) {
    msg = `${err.instancePath || "/"} unexpected property '${err.params.additionalProperty}'`;
  }
  console.error(`${method} ${path} ${status}: ${msg}`);
  process.exit(1);
}

try {
  const line = `${op.method} ${op.template}\n`;
  writeFileSync(OPS_LOG, line, { flag: "a" });
} catch { /* ignore */ }

process.exit(0);
