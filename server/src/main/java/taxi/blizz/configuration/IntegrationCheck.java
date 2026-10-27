package taxi.blizz.configuration;

/** A module's "check the connection" of its integration group, e.g. a sign-in at Firebase without sending anything. */
public interface IntegrationCheck {

    String group();

    /** Uses the values in force now; the message names what was checked, never a key. */
    Integrations.Check check();
}
