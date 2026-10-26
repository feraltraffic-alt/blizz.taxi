/**
 * Shared platform mechanisms used by every module: subjects and actors, domain errors,
 * correlation ids, command idempotency (REQ-API-04) and the transactional outbox (REQ-ENG-05).
 * Kept deliberately small (REQ-ENG-03); it never depends on business modules.
 */
package taxi.blizz.platform;
