package session;

public class Main {
    public static void main(String[] args) {
        SessionId sessionId = new SessionId("1234567");
        RedirectUrl redirectUrl = new RedirectUrl("https://comic.pixiv.net/callback");
        ClientId clientId = new ClientId("aaaaa");
        BrowserState browserState = new BrowserState(sessionId.encript());
        Salt salt = new Salt();

        SessionState sessionState = new SessionState(browserState, clientId, redirectUrl.origin(), salt);
        System.out.println(sessionState.value());
    }
}
