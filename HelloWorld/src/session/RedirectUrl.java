package session;

import java.net.MalformedURLException;
import java.net.URL;

public class RedirectUrl {
    final String value;

    public RedirectUrl(String value) {
        this.value = value;
    }

    Origin origin() {
        try {
            URL url = new URL(this.value);
            String origin = url.getProtocol() + "://" + url.getHost();
            return new Origin(origin);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
