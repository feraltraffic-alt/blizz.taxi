package taxi.blizz.platform.internal;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.OutboundAddresses;

/** See {@link OutboundAddresses}. */
@Component
class GuardedOutboundAddresses implements OutboundAddresses {

    /** Resolves a host to all its addresses; replaced in tests. */
    interface Resolver {
        InetAddress[] resolve(String host) throws UnknownHostException;
    }

    private final Set<String> privateHosts;
    private final Resolver resolver;

    GuardedOutboundAddresses(@Value("${blizz.security.outbound-private-hosts:}") List<String> privateHosts) {
        this(privateHosts, InetAddress::getAllByName);
    }

    GuardedOutboundAddresses(List<String> privateHosts, Resolver resolver) {
        this.privateHosts = privateHosts == null ? Set.of() : privateHosts.stream().map(String::strip)
                .filter(h -> !h.isEmpty()).map(h -> h.toLowerCase(Locale.ROOT)).collect(Collectors.toUnmodifiableSet());
        this.resolver = resolver;
    }

    @Override
    public URI check(String address, Set<String> schemes) {
        URI uri;
        try {
            uri = new URI(address == null ? "" : address.strip());
        } catch (URISyntaxException e) {
            throw refused("not an address");
        }
        String scheme = uri.getScheme() == null ? "" : uri.getScheme().toLowerCase(Locale.ROOT);
        if (!schemes.contains(scheme)) {
            throw refused("the scheme must be one of " + schemes.stream().sorted().toList());
        }
        if (uri.getRawUserInfo() != null) {
            throw refused("a user or password in the address is not allowed; use the separate fields");
        }
        String host = uri.getHost();
        if (host == null || host.isBlank()) {
            throw refused("there is no host");
        }
        host = host.toLowerCase(Locale.ROOT);
        String bare = host.startsWith("[") && host.endsWith("]") ? host.substring(1, host.length() - 1) : host;
        InetAddress[] addresses;
        try {
            addresses = resolver.resolve(bare);
        } catch (UnknownHostException e) {
            throw refused("the host " + host + " is not known");
        }
        boolean listed = privateHosts.contains(host) || privateHosts.contains(bare);
        for (InetAddress a : addresses) {
            if (a.isLinkLocalAddress() || a.isAnyLocalAddress() || a.isMulticastAddress() || reserved(a)) {
                throw refused("the host " + host + " is a link-local, unspecified, multicast or reserved address");
            }
            if (!listed && (a.isLoopbackAddress() || a.isSiteLocalAddress() || privateRange(a))) {
                throw refused("the host " + host + " is in a private network; the deployment allows it with "
                        + "BLIZZ_OUTBOUND_PRIVATE_HOSTS");
            }
        }
        return uri;
    }

    /** 100.64/10 (carrier-grade NAT) and fc00::/7 (unique local), which Java does not call site-local. */
    private static boolean privateRange(InetAddress a) {
        byte[] b = a.getAddress();
        if (a instanceof Inet4Address) {
            return (b[0] & 0xFF) == 100 && (b[1] & 0xC0) == 64;
        }
        return a instanceof Inet6Address && (b[0] & 0xFE) == 0xFC;
    }

    /** 0/8, 192.0.0/24, 198.18/15 and 240/4: never a service's address. */
    private static boolean reserved(InetAddress a) {
        if (!(a instanceof Inet4Address)) {
            return false;
        }
        byte[] b = a.getAddress();
        int first = b[0] & 0xFF;
        int second = b[1] & 0xFF;
        return first == 0 || first >= 240 || (first == 192 && second == 0 && (b[2] & 0xFF) == 0)
                || (first == 198 && (second & 0xFE) == 18);
    }

    private static DomainException refused(String why) {
        return new DomainException(ErrorCode.VALIDATION_FAILED, "The address is refused: " + why);
    }
}
