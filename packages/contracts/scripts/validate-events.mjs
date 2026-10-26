// Compiles every event JSON Schema under events/ (draft 2020-12) and checks that its examples validate.
import { readdirSync, readFileSync } from "node:fs";
import { join } from "node:path";
import Ajv2020 from "ajv/dist/2020.js";
import addFormats from "ajv-formats";

const dir = new URL("../events/", import.meta.url).pathname;
const ajv = new Ajv2020({ strict: true, allErrors: true });
addFormats(ajv);

let failed = 0;
for (const file of readdirSync(dir).filter((f) => f.endsWith(".schema.json"))) {
  const schema = JSON.parse(readFileSync(join(dir, file), "utf8"));
  const validate = ajv.compile(schema);
  for (const [i, example] of (schema.examples ?? []).entries()) {
    if (!validate(example)) {
      failed++;
      console.error(`${file} example ${i}:`, ajv.errorsText(validate.errors));
    }
  }
  console.log(`${file}: ok`);
}
process.exit(failed ? 1 : 0);
