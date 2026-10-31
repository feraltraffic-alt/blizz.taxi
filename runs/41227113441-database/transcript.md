# Fault tests (2026-10-31T17:59:27Z, b70f5cf, break: database)

## Database: every connection of the server is cut; it comes back by itself

Server start 1.

Connections cut: 20, while four clients ask for sign-in codes.

Answers during the cut: 1173×201 8×429 9×500 

**A lost database connection was answered with 500, not a retryable 503.**
