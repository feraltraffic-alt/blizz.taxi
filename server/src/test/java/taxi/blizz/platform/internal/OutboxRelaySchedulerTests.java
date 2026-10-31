package taxi.blizz.platform.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

/** Issue #178: a full batch is followed at once by the next one, up to a bound; a partial batch ends the tick. */
class OutboxRelaySchedulerTests {

    @Test
    void fullBatchesAreClaimedAgainAtOnceAndAPartialOneEndsTheTick() {
        OutboxRelay relay = mock(OutboxRelay.class);
        when(relay.runOnce()).thenReturn(100, 100, 37);
        assertThat(OutboxRelayScheduler.drain(relay, 100)).isEqualTo(3);
        verify(relay, times(3)).runOnce();
    }

    @Test
    void anEmptyOutboxIsOneClaim() {
        OutboxRelay relay = mock(OutboxRelay.class);
        when(relay.runOnce()).thenReturn(0);
        assertThat(OutboxRelayScheduler.drain(relay, 100)).isEqualTo(1);
    }

    @Test
    void aFloodStopsAfterTheBound() {
        OutboxRelay relay = mock(OutboxRelay.class);
        when(relay.runOnce()).thenReturn(100);
        assertThat(OutboxRelayScheduler.drain(relay, 100)).isEqualTo(OutboxRelayScheduler.MAX_ROUNDS);
        verify(relay, times(OutboxRelayScheduler.MAX_ROUNDS)).runOnce();
    }
}
