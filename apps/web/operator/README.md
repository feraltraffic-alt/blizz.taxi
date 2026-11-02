# Operator workstation

The operator's panel (#245): staff sign-in with the OPERATOR audience (shared with the admin panel through
`packages/web-ui`), then a phone order from the caller's number to the order's status.

```bash
npm run dev --workspace @blizz/operator
```

The API is proxied to `http://127.0.0.1:8080` (the server of the sandbox profile).
