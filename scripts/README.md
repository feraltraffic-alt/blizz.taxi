# Scripts

Build and utility scripts. CI pipelines only call these, so every build step can also be run locally.

| Script | What it does |
|---|---|
| `server-build.sh` | Compiles, tests and packages the server with the Maven wrapper (`server/mvnw`): the Maven version and its checksum are in `server/.mvn/wrapper/maven-wrapper.properties` |
| `contracts-lint.sh` | Lints the OpenAPI documents and validates the event schemas |
| `security-scan.sh` | Scans the repository, or an image given as the argument, for vulnerable dependencies and secrets |
| `pin-images.sh` | `--check`: fails if a container image has no digest (CI). Without arguments: writes the current digest of each tag |
| `dev-infra-up.sh` | Starts PostgreSQL with PostGIS and Redis for local development |
| `sandbox/` | The sandbox scenarios; `scenario=all` in the Sandbox workflow runs them all |
| `audit/` | Audits of the code against the contracts |
| `wait-for-work.sh` | For contributors: waits for issues and comments with their label |
