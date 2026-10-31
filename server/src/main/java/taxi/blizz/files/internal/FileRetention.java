package taxi.blizz.files.internal;

import java.time.OffsetDateTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import taxi.blizz.platform.RetentionWork;

@Configuration(proxyBeanMethods = false)
class FileRetention {

    private final FileRetirement files;

    FileRetention(FileRetirement files) {
        this.files = files;
    }

    @Bean
    RetentionWork uploadSessionRetention() {
        return work("upload_sessions");
    }

    @Bean
    RetentionWork quarantineRetention() {
        return work("quarantined_files");
    }

    /** Linked recordings are handled by telephony first; this catches refused/unlinked system files. */
    @Bean
    @Order(10)
    RetentionWork orphanRecordingRetention() {
        return work("call_recordings");
    }

    private RetentionWork work(String kind) {
        return new RetentionWork() {
            public String kind() {
                return kind;
            }

            public String selectionSql(int limit) {
                return files.selection(kind, limit);
            }

            public Result run(OffsetDateTime cutoff, OffsetDateTime now, int limit) {
                return files.run(kind, cutoff, now, limit);
            }
        };
    }
}
