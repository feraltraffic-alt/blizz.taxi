package taxi.blizz.geo;

import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/** WGS84 coordinates in caller order (latitude, longitude); SQL geometry uses (longitude, latitude). */
public record GeoPoint(double lat, double lon) {
    public GeoPoint {
        if (!Double.isFinite(lat) || !Double.isFinite(lon) || lat < -90 || lat > 90 || lon < -180 || lon > 180) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Invalid WGS84 coordinates");
        }
    }
}
