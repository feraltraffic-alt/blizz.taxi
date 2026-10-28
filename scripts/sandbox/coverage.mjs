#!/usr/bin/env node
// Prints coverage of sandbox contract validation.
// Reads /tmp/sandbox-ops-checked.txt and /tmp/sandbox-unknown-paths.txt.

import { readFileSync, existsSync } from "node:fs";
import { join, dirname } from "node:path";
import { fileURLToPath } from "node:url";

const __dirname = dirname(fileURLToPath(import.meta.url));
const OPS_LOG = "/tmp/sandbox-ops-checked.txt";
const UNKNOWN_LOG = "/tmp/sandbox-unknown-paths.txt";

function loadSet(file) {
  const s = new Set();
  if (existsSync(file)) {
    for (const line of readFileSync(file, "utf8").split("\n")) {
      if (line.trim()) s.add(line.trim());
    }
  }
  return s;
}

const checked = loadSet(OPS_LOG);
const unknown = loadSet(UNKNOWN_LOG);

console.log("## Contract validation coverage\n");
console.log(`Checked at least once: ${checked.size}`);
if (unknown.size) {
  console.log(`\n### Paths not in contracts (errors)\n`);
  for (const p of [...unknown].sort()) console.log("- " + p);
}
