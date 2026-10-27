package taxi.blizz.geocoding.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.geocoding.Geocoding.Place;
import tools.jackson.databind.json.JsonMapper;

/** The adapters speak the providers' formats (ADR 0012, Q-08) and never put the key into an error. */
class GeocoderAdapterTests {

    private static final GeoPoint KYIV = new GeoPoint(50.4501, 30.5234);
    private final JsonMapper json = JsonMapper.builder().build();
    private final List<URI> asked = new ArrayList<>();

    private GeocoderProvider.Transport answering(String body) {
        return uri -> {
            asked.add(uri);
            return body;
        };
    }

    @Test
    void googleSearchIsBiasedToTheRiderAndReadsStreetAndHouse() {
        GoogleGeocoder google = new GoogleGeocoder(answering("""
                {"status":"OK","results":[{"formatted_address":"вулиця Хрещатик, 22, Київ, Україна, 02000",
                  "geometry":{"location":{"lat":50.4475,"lng":30.5227}},
                  "address_components":[{"long_name":"22","types":["street_number"]},
                    {"long_name":"вулиця Хрещатик","types":["route"]},
                    {"long_name":"Київ","types":["locality","political"]}]}]}
                """), json, "secret-key");
        List<Place> places = google.search("Хрещатик 22", "uk", KYIV, 5);
        assertThat(places).singleElement().satisfies(p -> {
            assertThat(p.source()).isEqualTo("GOOGLE");
            assertThat(p.label()).startsWith("вулиця Хрещатик, 22");
            assertThat(p.street()).isEqualTo("вулиця Хрещатик");
            assertThat(p.house()).isEqualTo("22");
            assertThat(p.point()).isEqualTo(new GeoPoint(50.4475, 30.5227));
        });
        String url = asked.getFirst().toString();
        assertThat(url).startsWith(GoogleGeocoder.API + "?address=").contains("&bounds=").contains("&language=uk")
                .endsWith("&key=secret-key");
    }

    @Test
    void googleNothingFoundIsEmptyAndADeniedKeyIsAFailureWithoutTheKey() {
        assertThat(new GoogleGeocoder(answering("{\"status\":\"ZERO_RESULTS\",\"results\":[]}"), json, "k")
                .search("nowhere", null, KYIV, 5)).isEmpty();
        GoogleGeocoder denied = new GoogleGeocoder(answering("""
                {"status":"REQUEST_DENIED","error_message":"The provided API key is invalid."}"""), json, "secret-key");
        assertThatThrownBy(() -> denied.search("Хрещатик", "uk", KYIV, 5))
                .isInstanceOf(GeocoderProvider.ProviderException.class)
                .hasMessage("Google answered REQUEST_DENIED")
                .satisfies(e -> assertThat(e.getMessage()).doesNotContain("secret-key"));
        GoogleGeocoder down = new GoogleGeocoder(uri -> {
            throw new java.net.ConnectException("refused");
        }, json, "secret-key");
        assertThatThrownBy(() -> down.reverse(KYIV, "uk")).isInstanceOf(GeocoderProvider.ProviderException.class)
                .satisfies(e -> assertThat(e.getMessage()).doesNotContain("secret-key"));
    }

    @Test
    void visicomSearchReadsACollectionAndTheReverseASingleFeature() {
        VisicomGeocoder visicom = new VisicomGeocoder(answering("""
                {"type":"FeatureCollection","features":[
                  {"type":"Feature","id":"ADR1","properties":{"categories":"adr_address","name":"22",
                     "street":"Хрещатик","street_type":"вул.","settlement":"Київ"},
                   "geo_centroid":{"type":"Point","coordinates":[30.5227,50.4475]}},
                  {"type":"Feature","id":"POI1","properties":{"categories":"poi_shopping_center","name":"ТРЦ Глобус"},
                   "geo_centroid":{"type":"Point","coordinates":[30.5241,50.4505]}},
                  {"type":"Feature","id":"BROKEN","properties":{"name":"no centroid"}}]}
                """), json, "secret-key");
        List<Place> places = visicom.search("Хрещатик", "uk", KYIV, 5);
        assertThat(places).extracting(Place::label).containsExactly("вул. Хрещатик 22, Київ", "ТРЦ Глобус");
        assertThat(places.getFirst().house()).isEqualTo("22");
        assertThat(places.getFirst().point()).isEqualTo(new GeoPoint(50.4475, 30.5227));
        assertThat(asked.getFirst().toString()).startsWith(VisicomGeocoder.API + "uk/geocode.json?text=")
                .contains("&near=30.5234,50.4501").contains("&l=5").endsWith("&key=secret-key");

        VisicomGeocoder reverse = new VisicomGeocoder(answering("""
                {"type":"Feature","properties":{"categories":"adr_address","name":"1","street":"Майдан Незалежності",
                 "street_type":"","settlement":"Київ"},"geo_centroid":{"type":"Point","coordinates":[30.5234,50.4501]}}
                """), json, "k");
        assertThat(reverse.reverse(KYIV, "pl")).get().extracting(Place::label)
                .isEqualTo("Майдан Незалежності 1, Київ");
        assertThat(asked.getLast().toString()).contains("/en/geocode.json?categories=adr_address&near=")
                .contains("&r=50&l=1");
        assertThat(new VisicomGeocoder(answering("{}"), json, "k").search("x", "uk", KYIV, 5)).isEmpty();
    }
}
