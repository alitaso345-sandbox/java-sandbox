package session;

public class SessionId {
    final String value;

    public SessionId(String value) {
        this.value = value;
    }

    Encripted<SessionId> encript() {
        return Encripted.<SessionId>from(this.value);
    }
}
