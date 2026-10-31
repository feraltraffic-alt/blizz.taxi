#!/usr/bin/env bash
# During the load run (issue #146 part 3): every 10 s, the server's metrics, its process and the database, appended
# to metrics.prom (timestamped scrapes), process.tsv and database.tsv. Stops when the file STOP exists.
#   MANAGEMENT  actuator address (default http://localhost:8081);  SERVER_PID  the server's process
set -uo pipefail
MANAGEMENT="${MANAGEMENT:-http://localhost:8081}"
echo -e "time\tcpu_percent\trss_mb\tthreads" > process.tsv
echo -e "time\tconnections\tactive\tidle_in_tx\twaiting_locks\tlocks" > database.tsv
: > metrics.prom
while [[ ! -f STOP ]]; do
    now=$(date +%s)
    { echo "# scrape $now"
      curl -fsS "$MANAGEMENT/actuator/prometheus" | grep -E '^(hikaricp_connections(_active|_pending|_idle|_timeout_total)?|blizz_outbox_(pending|oldest_seconds|failed)|jvm_gc_pause_seconds_(sum|count|max)|jvm_memory_used_bytes|process_cpu_usage|system_cpu_usage|blizz_invariant_(violations|last_success)|blizz_drivers_online|blizz_orders_searching|blizz_assignments_active|blizz_orders_(created|unfulfilled|cancelled)_total|blizz_offers_total|blizz_dispatch_(first_offer|assigned)_seconds_(count|sum|max)|http_server_requests_seconds_count)' || true
    } >> metrics.prom
    if [[ -n "${SERVER_PID:-}" ]]; then
        echo -e "$now\t$(ps -o %cpu=,rss=,nlwp= -p "$SERVER_PID" | awk '{printf "%s\t%d\t%s", $1, $2/1024, $3}')" >> process.tsv
    fi
    echo -e "$now\t$(psql -X -At -F $'\t' -c "select count(*), count(*) filter (where state = 'active'),
        count(*) filter (where state = 'idle in transaction'),
        (select count(*) from pg_locks where not granted), (select count(*) from pg_locks)
        from pg_stat_activity where datname = current_database()")" >> database.tsv
    sleep 10
done
