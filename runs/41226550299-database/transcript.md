# Fault tests (2026-10-31T17:53:33Z, 4796389, break: database)

## Database: every connection of the server is cut; it comes back by itself

Server start 1.

Connections cut: 20, while four clients ask for sign-in codes.

Answers during the cut: 789×201 2×429 9×500 

**A lost database connection was answered with 500, not a retryable 503.**
