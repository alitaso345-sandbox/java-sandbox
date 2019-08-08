package session;

public class SessionState {
    final BrowserState browserState;
    final ClientId clientId;
    final Origin origin;
    final Salt salt;

    public SessionState(BrowserState browserState, ClientId clientId, Origin origin, Salt salt) {
        this.browserState = browserState;
        this.clientId = clientId;
        this.origin = origin;
        this.salt = salt;
    }

    private String encript() {
        String s = clientId.value + " " + browserState.value.text() + " " + origin.value + " " + salt.value;
        return Encripted.from(s).text();
    }

    String value() {
        return encript() + "." + salt.value;
    }
}
