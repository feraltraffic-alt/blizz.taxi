package taxi.blizz.geo;

import java.util.UUID;
import taxi.blizz.platform.Actor;

/** Staff-only named commands. Polygons are EWKT MultiPolygons with SRID 4326; new drafts start at version 0. */
public interface GeoConfiguration {
    Revision createCityDraft(CityDraft command);
    Revision publishCity(Change command);
    Revision archiveCity(Change command);
    Revision createZoneDraft(ZoneDraft command);
    Revision publishZone(Change command);
    Revision archiveZone(Change command);

    record Revision(UUID id, String state, long version) {}
    record CityDraft(UUID commandId, Actor actor, long expectedVersion, String code, String name,
                     String currency, String timezone, String polygonEwkt, int priority, String reason) {}
    record ZoneDraft(UUID commandId, Actor actor, long expectedVersion, UUID cityId,
                     String type, String polygonEwkt, int priority, String reason) {}
    record Change(UUID commandId, Actor actor, UUID id, long expectedVersion, String reason) {}
}
