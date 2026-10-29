package taxi.blizz.location.internal;

import static org.assertj.core.api.Assertions.assertThat;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.location.TrackService;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;

@SpringBootTest
@Import(TestcontainersConfiguration.class)
class TrackBatchPredecessorTests {
    @Autowired TrackService tracks;

    TrackService.InputPoint point(long sequence,OffsetDateTime at,double lon) {
        return new TrackService.InputPoint(sequence,0,lon,5,null,null,at);
    }

    @Test
    void aSinglePreloadPreservesInterleavedHistoryAndDoesNotCarryADuplicate() {
        Actor driver=new Actor(SubjectType.DRIVER,UUID.randomUUID());
        UUID device=UUID.randomUUID();
        OffsetDateTime at=OffsetDateTime.now(ZoneOffset.UTC).minusHours(1);
        // 111 km over two hours is plausible. The backfilled point immediately before at is still at longitude 0.
        tracks.store(driver,device,UUID.randomUUID(),List.of(point(1,at.minusHours(2),0),point(3,at,1)));
        Logger logger=(Logger)LoggerFactory.getLogger(JdbcTemplate.class);
        Level oldLevel=logger.getLevel();
        ListAppender<ILoggingEvent> statements=new ListAppender<>();statements.start();
        logger.addAppender(statements);logger.setLevel(Level.DEBUG);
        TrackService.BatchResult result;
        try {
            result=tracks.store(driver,device,UUID.randomUUID(),List.of(
                point(4,at.plusSeconds(1),1),
                point(3,at.plusNanos(500_000_000),-1), // same stored sequence: never advance the baseline to -1
                point(2,at.minusSeconds(1),0)));
        } finally {logger.setLevel(oldLevel);logger.detachAppender(statements);statements.stop();}
        assertThat(result.accepted()).isEqualTo(2);
        assertThat(result.duplicates()).isEqualTo(1);
        assertThat(result.flagged()).as("stored point 3, not newly inserted point 2, precedes point 4").isZero();
        var stored=tracks.points(driver.id(),at.minusHours(3),at.plusMinutes(1));
        assertThat(stored).hasSize(4).allSatisfy(p->assertThat(p.flags()).isEmpty());
        assertThat(stored).filteredOn(p->p.sequence()==3).singleElement().satisfies(p->assertThat(p.lon()).isEqualTo(1));
        long previousReads=statements.list.stream().filter(e->e.getThreadName().equals(Thread.currentThread().getName()))
                .map(ILoggingEvent::getFormattedMessage)
                .filter(s->s.matches("(?is)Executing prepared SQL statement \\[(?:select|with).*\\btrack_point\\b.*"))
                .count();
        assertThat(previousReads).as("one actual JDBC predecessor SELECT for the whole batch, not one per point")
                .isEqualTo(1);
    }
}
