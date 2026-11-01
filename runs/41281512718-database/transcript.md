# Fault tests (2026-11-01T06:37:14Z, 20b07af, break: database)

## Database: every connection of the server is cut; it comes back by itself

Server start 1.

Connections cut: 21, while four clients ask for sign-in codes.

Answers during the cut: 822×201 3×429 8×500 

**A lost database connection was answered with 500, not a retryable 503.**
