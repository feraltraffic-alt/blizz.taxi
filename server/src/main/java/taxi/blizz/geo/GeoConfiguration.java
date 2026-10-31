package taxi.blizz.geo;

import java.util.UUID;
import taxi.blizz.platform.Actor;

/** Active staff with {@code MANAGE_PERMISSION} only. Named commands. Polygons are EWKT MultiPolygons with SRID 4326; new drafts start at version 0. */
public interface GeoConfiguration {
    String MANAGE_PERMISSION = "geo.manage";

    Revision createCityDraft(CityDraft command);

    /**
     * The name, currency, timezone, boundary and priority of a city that is still a DRAFT (registry 22.2, issue
     * #176); a published or archived city is STATE_CONFLICT. The boundary is validated as on create and refused
     * (STATE_CONFLICT) when it intersects a published city of the same priority.
     */
    Revision updateCityDraft(CityUpdate command);
    Revision publishCity(Change command);
    Revision archiveCity(Change command);
    Revision createZoneDraft(ZoneDraft command);
    Revision publishZone(Change command);
    Revision archiveZone(Change command);

    record Revision(UUID id, String state, long version) {}
    record CityDraft(UUID commandId, Actor actor, long expectedVersion, String code, String name,
                     String currency, String timezone, String polygonEwkt, int priority, String reason) {}
    record CityUpdate(UUID commandId, Actor actor, UUID id, long expectedVersion, String name, String currency,
                      String timezone, String polygonEwkt, int priority, String reason) {}
    record ZoneDraft(UUID commandId, Actor actor, long expectedVersion, UUID cityId,
                     String type, String polygonEwkt, int priority, String reason) {}
    record Change(UUID commandId, Actor actor, UUID id, long expectedVersion, String reason) {}
}
