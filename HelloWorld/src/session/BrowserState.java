package session;

public class BrowserState {
    final Encripted<SessionId> value;

    public BrowserState(Encripted<SessionId> value) {
        this.value = value;
    }
}
