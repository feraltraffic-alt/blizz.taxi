# Fault tests (2026-10-31T19:25:57Z, 1e26c2d, break: database)

## Database: every connection of the server is cut; it comes back by itself

Server start 1.

Connections cut: 20, while four clients ask for sign-in codes.

Answers during the cut: 705×201 3×429 6×500 

**A lost database connection was answered with 500, not a retryable 503.**
