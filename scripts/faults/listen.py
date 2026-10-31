"""Writes every notification on the live channel to a file, one JSON per line (issue #146).

It holds its own connection to PostgreSQL, so it keeps listening while the server is killed and started again:
what the server sends to riders and drivers before and after a crash is all here.
Usage: python3 listen.py OUT_FILE  (PGHOST, PGUSER, PGPASSWORD, PGDATABASE from the environment)
"""
import sys

import psycopg

with psycopg.connect(autocommit=True) as conn, open(sys.argv[1], "a", buffering=1) as out:
    conn.execute("listen blizz_live")
    print("listening", file=sys.stderr, flush=True)
    for note in conn.notifies():
        out.write(note.payload + "\n")
