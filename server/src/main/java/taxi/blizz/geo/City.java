package taxi.blizz.geo;

import java.util.UUID;

/** The published city's configuration snapshot; retain its version when using it downstream. */
public record City(UUID id, String code, String name, String currency, String timezone, int priority, long version) {}
