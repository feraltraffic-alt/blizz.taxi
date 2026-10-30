// Compiles every event JSON Schema under events/ (draft 2020-12) and checks that its examples validate. A payload
// schema is chosen by aggregate and type: a type in the titles of several schemas needs a different x-aggregate in
// each (the envelope's aggregate_type), or a consumer could not tell which payload it gets.
import { readdirSync, readFileSync } from "node:fs";
import { join } from "node:path";
import Ajv2020 from "ajv/dist/2020.js";
import addFormats from "ajv-formats";

const dir = new URL("../events/", import.meta.url).pathname;
const ajv = new Ajv2020({ strict: true, allErrors: true });
addFormats(ajv);
ajv.addKeyword({ keyword: "x-aggregate", schemaType: "string" });

let failed = 0;
const byType = new Map();
for (const file of readdirSync(dir).filter((f) => f.endsWith(".schema.json"))) {
  const schema = JSON.parse(readFileSync(join(dir, file), "utf8"));
  if (file !== "envelope.schema.json") {
    const names = schema.title?.match(/^([\w /]+) v\d+(?: payload)?$/)?.[1].split(/\s*\/\s*/);
    if (!names) {
      failed++;
      console.error(`${file}: the title must name the event types, e.g. "OrderCreated v1 payload"`);
    }
    for (const name of names ?? []) byType.set(name, [...(byType.get(name) ?? []), { file, aggregate: schema["x-aggregate"] }]);
  }
  const validate = ajv.compile(schema);
  for (const [i, example] of (schema.examples ?? []).entries()) {
    if (!validate(example)) {
      failed++;
      console.error(`${file} example ${i}:`, ajv.errorsText(validate.errors));
    }
  }
  console.log(`${file}: ok`);
}
for (const [type, schemas] of byType) {
  const aggregates = schemas.map((s) => s.aggregate);
  if (schemas.length > 1 && (aggregates.some((a) => !a) || new Set(aggregates).size !== aggregates.length)) {
    failed++;
    console.error(`${type}: ${schemas.map((s) => s.file).join(", ")} need a different x-aggregate each`);
  }
}
process.exit(failed ? 1 : 0);
