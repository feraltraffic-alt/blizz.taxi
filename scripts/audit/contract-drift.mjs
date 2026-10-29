#!/usr/bin/env node
// Static inventory, not execution coverage. Requires scripts/contracts-lint.sh's dependencies.
import { readFileSync, readdirSync, mkdtempSync, rmSync } from 'node:fs';
import { resolve, join } from 'node:path';
import { tmpdir } from 'node:os';
import { fileURLToPath } from 'node:url';
import { execFileSync } from 'node:child_process';
const root = resolve(fileURLToPath(new URL('../..', import.meta.url)));
const files = (dir, suffix) => readdirSync(join(root, dir), { withFileTypes: true }).flatMap(e =>
  e.isDirectory() ? files(`${dir}/${e.name}`, suffix) : e.name.endsWith(suffix) ? [`${dir}/${e.name}`] : []);
const read = f => readFileSync(join(root, f), 'utf8');
const errors = [], routes = [], events = new Map(), contracts = [], coverage = [];
const at = (f, s, i) => `${f}:${s.slice(0, i).split('\n').length}`;
const normalize = p => p.replace(/\{[^}]+\}/g, '{}').replace(/\/$/, '') || '/';
const key = (m, p) => `${m.toUpperCase()} ${normalize(p)}`;
// Preserve offsets and strings while removing comments (including URLs in strings).
const uncomment = s => s.replace(/"(?:\\.|[^"\\])*"|'(?:\\.|[^'\\])*'|\/\/[^\n]*|\/\*[\s\S]*?\*\//g,
  x => x.startsWith('//') || x.startsWith('/*') ? x.replace(/[^\n]/g, ' ') : x);
const masks = new Map();
const mask = s => { if (!masks.has(s)) masks.set(s, s.replace(/"""[\s\S]*?"""|"(?:\\.|[^"\\])*"|'(?:\\.|[^'\\])*'/g, x => x.replace(/[^\n]/g, ' '))); return masks.get(s); };
const strings = s => [...s.matchAll(/"((?:\\.|[^"\\])*)"/g)].map(m => m[1]);
function args(s, start) {
  let depth = 0, begin = start + 1, out = [];
  const skeleton = mask(s).replace(/<[A-Za-z_?][\w\s,.?<>[\]]*>/g, x => x.replace(/,/g, ' '));
  for (let i = start; i < s.length; i++) {
    const c = skeleton[i];
    if ('({['.includes(c)) depth++;
    if (')}]'.includes(c) && --depth === 0) return { values: [...out, s.slice(begin, i).trim()], end: i };
    if (c === ',' && depth === 1) { out.push(s.slice(begin, i).trim()); begin = i + 1; }
  }
  throw Error('Unclosed argument list');
}
const sources = files('server/src/main/java', '.java').map(f => ({ f, s: uncomment(read(f)) }));
const constants = new Map();
for (const { f, s } of sources) for (const m of s.matchAll(/\bString\s+(\w+)\s*=\s*"([^"]+)"/g)) {
  const list = constants.get(m[1]) ?? []; list.push({ value: m[2], f }); constants.set(m[1], list);
}
for (const { f, s } of sources) {
  const mappings = [...mask(s).matchAll(/@(?:org\.springframework\.web\.bind\.annotation\.)?(Get|Post|Put|Patch|Delete|Head|Options|Request)Mapping\b/g)];
  const classPos = mask(s).search(/\b(?:class|interface|record)\s+\w+/);
  let prefixes = [''];
  for (const m of mappings) {
    const next = m.index + m[0].length;
    const hasArgs = /^\s*\(/.test(s.slice(next));
    const values = hasArgs ? args(s, s.indexOf('(', next)).values : [];
    const pathArg = values.find(v => /^(?:path|value)\s*=/.test(v))
      ?? values.find(v => /^\s*["{]/.test(v)) ?? '';
    const paths = strings(pathArg);
    const a = values.join(',');
    if ((pathArg && !paths.length) || (values.length && !pathArg && !values.every(v=>/^\w+\s*=/.test(v)))) errors.push(`${at(f,s,m.index)} unresolved mapping: ${a}`);
    if (m.index < classPos) { prefixes = paths.length ? paths : ['']; continue; }
    const methods = m[1] === 'Request' ? [...a.matchAll(/RequestMethod\.(\w+)/g)].map(x => x[1]) : [m[1].toUpperCase()];
    if (!methods.length) { errors.push(`${at(f,s,m.index)} unrestricted RequestMapping; inventory needs explicit methods`); continue; }
    for (const prefix of prefixes) for (const p of paths.length ? paths : ['']) for (const method of methods)
      routes.push({ method, path: prefix + p, source: at(f,s,m.index) });
  }
  for(const m of mask(s).matchAll(/\.addHandler\s*\(/g)) {
    const a=args(s,s.indexOf('(',m.index));
    const paths=a.values.slice(1).flatMap(strings);
    if(!paths.length) errors.push(`${at(f,s,m.index)} unresolved WebSocket registration`);
    for(const path of paths) routes.push({method:'GET',path,source:at(f,s,m.index),transport:'websocket'});
  }
}
// Trace String event parameters back through publisher wrappers, rather than counting unrelated literals.
const methods = [];
for (const { f,s } of sources) for (const m of mask(s).matchAll(/\b(?:public|private|protected|static|final|synchronized)?\s*(?:void|\w+(?:<[^;{}]+>)?)\s+(\w+)\s*\(/g)) {
  const a = args(s, m.index + m[0].length - 1);
  if (!/^\s*(?:throws [^{]+)?\{/.test(s.slice(a.end + 1))) continue;
  const bodyStart = s.indexOf('{', a.end + 1);
  let depth=1, end=bodyStart+1; const skeleton=mask(s);
  for (;end<s.length && depth;end++) {
    if(skeleton[end]==='{')depth++; if(skeleton[end]==='}')depth--;
  }
  methods.push({ f,s,name:m[1],params:a.values.join(',').split(/,(?![^<]*>)/).map(v=>v.match(/(\w+)\s*$/)?.[1]),start:bodyStart,end });
}
const visited = new Set();
function trace(expr, owner, location) {
  expr=expr.trim();
  const literals = strings(expr);
  const question = mask(expr).indexOf('?');
  if (question >= 0) {
    let nested = 0;
    for (let i = question; i < expr.length; i++) {
      if (mask(expr)[i] === '?') nested++;
      if (mask(expr)[i] === ':' && --nested === 0) {
        trace(expr.slice(question + 1, i), owner, location);
        trace(expr.slice(i + 1), owner, location);
        return;
      }
    }
    errors.push(`${location} unresolved conditional event expression ${expr}`);
    return;
  }
  if (/^"[^"\\]+"$/.test(expr)) {
    if (!literals.length) errors.push(`${location} unresolved event expression ${expr}`);
    for(const value of literals) events.set(value,[...(events.get(value)??[]),location]);
    return;
  }
  const name=expr.split('.').at(-1), candidates=constants.get(name)??[];
  const local=candidates.filter(c=>c.f===owner?.f);
  const selected=local.length?local:candidates;
  if(selected.length && new Set(selected.map(c=>c.value)).size===1) { trace(JSON.stringify(selected[0].value),owner,location); return; }
  const index=owner?.params.indexOf(expr)??-1;
  if(index<0) { errors.push(`${location} unresolved event expression ${expr}`); return; }
  const visit=`${owner.f}:${owner.start}:${index}`;
  if(visited.has(visit)) return;
  visited.add(visit);
  let calls=0;
  for(const {f,s} of sources) {
    for(const m of mask(s).matchAll(new RegExp(`\\b${owner.name}\\s*\\(`,'g'))) {
      const receiver=s.slice(0,m.index).match(/(\w+)\.\s*$/)?.[1];
      const ownerClass=owner.f.split('/').at(-1).replace('.java','');
      if(receiver && receiver!=='this' && !new RegExp(`\\b${ownerClass}\\s+${receiver}\\b`).test(s))continue;
      if((!receiver || receiver==='this') && f!==owner.f)continue;
      const a=args(s,s.indexOf('(',m.index));
      if(methods.some(x=>x.f===f && x.name===owner.name && a.end<x.start && /^\s*(?:throws [^{]+)?\{/.test(s.slice(a.end+1))))continue;
      const parent=methods.find(x=>x.f===f && x.start<m.index && x.end>m.index);
      if(a.values.length!==owner.params.length)continue;
      calls++; trace(a.values[index],parent,at(f,s,m.index));
    }
  }
  if(!calls) errors.push(`${location} no calls resolved for ${owner.name} parameter ${expr}`);
}
for(const {f,s} of sources) for(const m of mask(s).matchAll(/new\s+OutboxEvent\s*\(/g)) {
  const a=args(s,s.indexOf('(',m.index));
  trace(a.values[0],methods.find(x=>x.f===f && x.start<m.index && x.end>m.index),at(f,s,m.index));
}
const temp=mkdtempSync(join(tmpdir(),'contract-drift-'));
try {
  const documents=files('packages/contracts/openapi','.yaml').filter(f=>/^paths:/m.test(read(f)));
  execFileSync(process.execPath,[join(root,'packages/contracts/node_modules/@redocly/cli/bin/cli.js'),'bundle',...documents.map(f=>join(root,f)),'--output',temp,'--ext','json'],{stdio:'pipe',env:{...process.env,REDOCLY_TELEMETRY:'off'}});
  for(const f of documents) {
    const target=join(temp,f.split('/').at(-1).replace(/\.yaml$/,'.json'));
    const doc=JSON.parse(readFileSync(target,'utf8'));
    for(const [path,item] of Object.entries(doc.paths??{})) for(const [method,operation] of Object.entries(item))
      if(/^(get|post|put|patch|delete|head|options|trace)$/.test(method)) contracts.push({method:method.toUpperCase(),path,operationId:operation.operationId,source:f});
  }
} finally { rmSync(temp,{recursive:true,force:true}); }
const schemas = new Map();
for(const f of files('packages/contracts/events','.schema.json')) {
  if(f.endsWith('/envelope.schema.json'))continue;
  const schema=JSON.parse(read(f));
  const names=schema.title?.match(/^([\w /]+) v\d+(?: payload)?$/)?.[1].split(/\s*\/\s*/);
  if(!names) errors.push(`${f} cannot identify event type from schema title`);
  else for(const name of names) schemas.set(name,f);
}
// Resolve local HTTP test helpers from their bodies, including helpers forwarding to helpers.
const testSources=files('server/src/test','.java').map(f=>({f,s:uncomment(read(f))}));
const helpers=[];
for(const {f,s} of testSources) for(const m of s.matchAll(/\bprivate\s+(?:static\s+)?[\w<>?, ]+\s+(\w+)\s*\(/g)) {
  const a=args(s,s.indexOf('(',m.index));
  const start=s.indexOf('{',a.end+1), end=s.indexOf('\n    }',start);
  if(start<0 || end<0)continue;
  helpers.push({f,name:m[1],params:a.values.map(v=>v.match(/(\w+)\s*$/)?.[1]),body:s.slice(start,end),source:at(f,s,m.index)});
}
for(let pass=0;pass<helpers.length;pass++) {
  let changed=false;
  for(const h of helpers) {
    if(h.http || h.methodIndex!==undefined)continue;
    if(h.body.includes('.buildAsync(') && /\+\s*path\b/.test(h.body) && h.params.includes('path')) {
      h.pathIndex=h.params.indexOf('path');h.http='GET';changed=true;continue;
    }
    const direct=[...h.body.matchAll(/\b(get|post|put|patch|delete|head|options)\(\s*(\w+)\s*\)/g)].filter(m=>h.params.includes(m[2]));
    if(direct.length && h.body.includes('mvc.perform(')) {
      h.pathIndex=h.params.indexOf(direct[0][2]);
      h.http=direct.length===1?direct[0][1].toUpperCase():null;
      if(direct.length>1 && h.params.includes('method')) h.methodIndex=h.params.indexOf('method');
      if(h.http || h.methodIndex!==undefined) { changed=true; continue; }
    }
    for(const target of helpers.filter(x=>x.f===h.f && x!==h && x.http)) {
      const call=h.body.match(new RegExp(`\\b${target.name}\\s*\\(`));
      if(!call)continue;
      const a=args(h.body,h.body.indexOf('(',call.index));
      const index=h.params.indexOf(a.values[target.pathIndex]);
      if(index>=0) {h.pathIndex=index;h.http=target.http;changed=true;break;}
    }
  }
  if(!changed)break;
}
const javaPath=expression=>expression.replace(/^("[^"]*")\.formatted\([\s\S]*$/, '$1').replaceAll('%s','{}').split(/\s*\+\s*/).map(x=>/^".*"$/.test(x)?x.slice(1,-1):'{}').join('').split('?')[0];
for(const {f,s} of testSources) for(const h of helpers.filter(h=>h.f===f && (h.http||h.methodIndex!==undefined))) {
  for(const m of mask(s).matchAll(new RegExp(`\\b${h.name}\\s*\\(`,'g'))) {
    const a=args(s,s.indexOf('(',m.index));
    if(!a.values[h.pathIndex]?.startsWith('"'))continue;
    const method=h.http??a.values[h.methodIndex]?.replaceAll('"','');
    if(!/^(GET|POST|PUT|PATCH|DELETE|HEAD|OPTIONS)$/.test(method))continue;
    coverage.push({method,path:javaPath(a.values[h.pathIndex]),source:at(f,s,m.index),via:h.source});
  }
}
// Only executable HTTP call syntax counts. Concatenated/dynamic segments match one template segment.
for(const f of [...files('server/src/test','.java'),...files('scripts/sandbox/scenarios','.sh')]) {
  const s=f.endsWith('.java')?uncomment(read(f)):read(f).replace(/^[ \t]*#[^\n]*$/gm, x=>x.replace(/[^\n]/g,' '));
  const pattern=f.endsWith('.java') ? /\b(get|post|put|patch|delete|head|options)\(\s*"([^"\n]+)"([^\n;]*)/g : /\bapi\s+(GET|POST|PUT|PATCH|DELETE|HEAD|OPTIONS)\s+["']?([^\s"']+)/g;
  for(const m of s.matchAll(pattern)) {
    let path=m[2].split('?')[0];
    if(f.endsWith('.java')) {
      // Follow string concatenation on the call's first argument only.
      const expression=args(s,s.indexOf('(',m.index)).values[0];
      // Reconstruct reliably from alternating literal and expression terms.
      path=javaPath(expression);
    } else path=path.replace(/\$\{[^}]+\}|\$[A-Za-z_]\w*/g,'{}');
    if(!path.startsWith('/')) continue;
    coverage.push({method:m[1].toUpperCase(),path,source:at(f,s,m.index)});
  }
}
// curl downloads bypass the sandbox api helper. Count only URLs whose path is visible.
const unresolvedCoverage=[];
for(const f of files('scripts/sandbox/scenarios','.sh')) {
  const s=read(f).replace(/^[ \t]*#[^\n]*$/gm, x=>x.replace(/[^\n]/g,' '));
  for(const m of s.matchAll(/\bcurl\b(?:\\\n|[^\n])*/g)) {
    const url=m[0].match(/"\$(?:BASE|\{BASE\})(\/[^"\n]+)"/);
    if(!url) { unresolvedCoverage.push({source:at(f,s,m.index),reason:'curl URL is constructed dynamically or is outside the application API'});continue; }
    const method=m[0].match(/(?:-X|--request)\s+(\w+)/)?.[1]??(/--data/.test(m[0])?'POST':'GET');
    const path=url[1].split('?')[0].replace(/\$\{[^}]+\}|\$[A-Za-z_]\w*/g,'{}');
    coverage.push({method,path,source:at(f,s,m.index)});
  }
}
const routeKeys=new Set(routes.map(r=>key(r.method,r.path))), contractKeys=new Set(contracts.map(r=>key(r.method,r.path)));
const missingContracts=routes.filter(r=>!contractKeys.has(key(r.method,r.path)));
const missingMappings=contracts.filter(r=>!routeKeys.has(key(r.method,r.path)));
const untested=contracts.filter(r=>!coverage.some(c=>key(c.method,c.path)===key(r.method,r.path)));
const report={summary:{routes:routes.length,contractOperations:contracts.length,publishedEvents:events.size,eventSchemas:schemas.size,untestedOperations:untested.length},
  missingContracts,missingMappings,missingEventSchemas:[...events].filter(([n])=>!schemas.has(n)).map(([name,sources])=>({name,sources})),
  coverageLimitations:["Static calls do not prove successful authorization or business assertions.","Contract-driven AccessIsolationTests calls rider/driver paths dynamically; these checks can reject requests before business logic and require manual review.","Paths passed only through variables, helper-generated upload URLs and shell audience substitutions are not classified as covered without a resolved concrete path."],unresolvedCoverage,
  schemasWithoutPublisher:[...schemas].filter(([n])=>!events.has(n)).map(([name,source])=>({name,source})),unresolved:errors,untested,
  covered:contracts.filter(r=>!untested.includes(r)).map(r=>({...r,evidence:coverage.filter(c=>key(c.method,c.path)===key(r.method,r.path))})),
  routes,events:Object.fromEntries(events)};
if(process.argv.includes('--json')) console.log(JSON.stringify(report,null,2));
else {
  console.log(JSON.stringify(report.summary));
  console.log('Coverage is a static HTTP-call inventory, not proof of successful authorization or business assertions. Dynamic contract-driven tests and unresolved URL variables require manual review.');
  for(const name of ['missingContracts','missingMappings','missingEventSchemas','schemasWithoutPublisher','unresolved','unresolvedCoverage','untested']) {
    console.log(`\n${name} (${report[name].length})`);
    for(const row of report[name]) console.log(typeof row==='string'?row:JSON.stringify(row));
  }
}
process.exitCode=missingContracts.length||missingMappings.length||report.missingEventSchemas.length||report.schemasWithoutPublisher.length||errors.length?1:0;
