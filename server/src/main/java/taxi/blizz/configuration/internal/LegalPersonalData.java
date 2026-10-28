package taxi.blizz.configuration.internal;

import org.springframework.stereotype.Component;
import taxi.blizz.configuration.LegalDocuments;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.PersonalData;
import taxi.blizz.platform.SubjectType;

/** Which legal texts the rider accepted, when and in which language, for the copy of their data (REQ-PRV-07/08). */
@Component
class LegalPersonalData implements PersonalData {

    private final LegalDocuments legal;

    LegalPersonalData(LegalDocuments legal) {
        this.legal = legal;
    }

    @Override
    public String section() {
        return "legal_acceptances";
    }

    @Override
    public Object of(Subject subject) {
        return legal.acceptances(new Actor(SubjectType.CLIENT, subject.clientId()));
    }
}
