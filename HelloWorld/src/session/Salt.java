package session;

import java.util.Random;
import java.util.UUID;

public class Salt {
    final String value;

    public Salt() {
        this.value = String.valueOf(new Random().nextInt());
    }
}
