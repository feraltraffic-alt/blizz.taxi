package taxi.blizz.platform.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.net.InetAddress;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Test;
import taxi.blizz.platform.DomainException;

/** Addresses typed in the admin panel never reach the server's own network (REQ-SEC-05). */
class OutboundAddressesTests {

    static final Set<String> HTTP = Set.of("http", "https");

    /** Names resolve as a DNS server under someone else's control might answer. */
    static final Map<String, List<String>> DNS = Map.of(
            "graphhopper.example.com", List.of("93.184.216.34"),
            "metadata.example.com", List.of("169.254.169.254"),
            "rebind.example.com", List.of("93.184.216.34", "10.1.2.3"),
            "asterisk", List.of("10.0.0.7"),
            "nat.example.com", List.of("100.64.0.9"),
            "ula.example.com", List.of("fd12:3456::1"),
            "localhost", List.of("127.0.0.1"));

    final GuardedOutboundAddresses guard = new GuardedOutboundAddresses(List.of("asterisk", " "), host -> {
        List<String> ips = DNS.get(host);
        if (ips == null) {
            return new InetAddress[]{InetAddress.getByName(host)}; // a literal address, or UnknownHostException
        }
        InetAddress[] out = new InetAddress[ips.size()];
        for (int i = 0; i < ips.size(); i++) {
            out[i] = InetAddress.getByName(ips.get(i));
        }
        return out;
    });

    @Test
    void publicAddressesAndListedPrivateHostsPass() {
        assertThat(guard.check("https://graphhopper.example.com/api", HTTP).getHost())
                .isEqualTo("graphhopper.example.com");
        assertThat(guard.check("http://asterisk:8088", HTTP).getPort()).isEqualTo(8088);
        assertThat(guard.check(" https://93.184.216.34 ", HTTP)).isNotNull();
    }

    @Test
    void theServersOwnNetworkIsRefused() {
        for (String address : List.of(
                "http://169.254.169.254/latest/meta-data",       // cloud metadata
                "http://metadata.example.com/",                  // the same through a name
                "http://[::ffff:169.254.169.254]/",              // the same as IPv6
                "http://rebind.example.com/",                    // one public and one private answer
                "http://10.0.0.5:8088", "http://192.168.1.1", "http://172.16.0.1",
                "http://localhost:8080", "http://127.0.0.1:5432", "http://[::1]/",
                "http://nat.example.com/", "http://ula.example.com/",
                "http://0.0.0.0/", "http://224.0.0.1/", "http://[fe80::1]/",
                "http://user:secret@graphhopper.example.com/", // credentials belong to the separate fields
                "ftp://graphhopper.example.com/", "file:///etc/passwd", "gopher://graphhopper.example.com/",
                "http:///nohost", "not a url", "http://unknown.invalid/")) {
            assertThatThrownBy(() -> guard.check(address, HTTP)).as(address).isInstanceOf(DomainException.class);
        }
    }

    @Test
    void linkLocalStaysRefusedEvenWhenListedAndTheMessageNeverShowsTheCredentials() {
        GuardedOutboundAddresses careless = new GuardedOutboundAddresses(List.of("169.254.169.254"),
                InetAddress::getAllByName);
        assertThatThrownBy(() -> careless.check("http://169.254.169.254/", HTTP))
                .isInstanceOf(DomainException.class);
        assertThatThrownBy(() -> guard.check("http://admin:s3cret@graphhopper.example.com/", HTTP))
                .isInstanceOf(DomainException.class).message().doesNotContain("s3cret");
    }
}
