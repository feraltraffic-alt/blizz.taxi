#!/usr/bin/env node
// Prints coverage of sandbox contract validation: which operations were checked, which never called.
// Reads /tmp/sandbox-ops-checked.txt written by validate-response.mjs.

import { readFileSync, existsSync } from "node:fs";
import { join, dirname } from "node:path";
import { fileURLToPath } from "node:url";

const __dirname = dirname(fileURLToPath(import.meta.url));
const CACHE = "/tmp/blizz-sandbox-contracts";
const OPS_LOG = "/tmp/sandbox-ops-checked.txt";

const MAIN_APIS = ["auth-v1","rider-v1","driver-v1","admin-v1","operator-v1","config-v1","providers-v1"];

function loadAllOperations() {
  const ops = new Set();
  for (const api of MAIN_APIS) {
    const p = join(CACHE, `${api}.json`);
    if (!existsSync(p)) continue;
    const spec = JSON.parse(readFileSync(p, "utf8"));
    for (const [template, pathItem] of Object.entries(spec.paths || {})) {
      for (const method of ["get","post","put","patch","delete"]) {
        if (pathItem[method]) ops.add(`${method.toUpperCase()} ${template}`);
      }
    }
  }
  return [...ops].sort();
}

const checked = new Set();
if (existsSync(OPS_LOG)) {
  for (const line of readFileSync(OPS_LOG, "utf8").split("\n")) {
    if (line.trim()) checked.add(line.trim());
  }
}

const all = loadAllOperations();
const never = all.filter(o => !checked.has(o));

console.log("## Contract validation coverage\n");
console.log(`Checked at least once: ${checked.size}`);
console.log(`Never called: ${never.length}\n`);
if (never.length) {
  console.log("### Operations never called by the sandbox scenarios\n");
  for (const o of never) console.log("- " + o);
}
