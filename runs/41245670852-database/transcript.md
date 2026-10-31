# Fault tests (2026-10-31T21:54:15Z, 234f73b, break: database)

## Database: every connection of the server is cut; it comes back by itself

Server start 1.

Connections cut: 20, while four clients ask for sign-in codes.

Answers during the cut: 664×201 9×500 

**A lost database connection was answered with 500, not a retryable 503.**
