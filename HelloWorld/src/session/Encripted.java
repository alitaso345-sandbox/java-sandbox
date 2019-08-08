package session;

import java.security.MessageDigest;

public class Encripted<T> {
    final String value;

    private Encripted(String value) {
        this.value = value;
    }

    private static String sha256(String text) {
        byte[] cipher_byte;
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(text.getBytes());
            cipher_byte = md.digest();
            StringBuilder sb = new StringBuilder(2 * cipher_byte.length);
            for(byte b: cipher_byte) {
                sb.append(String.format("%02x", b&0xff) );
            }
            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static <T> Encripted<T> from(String text) {
        return new Encripted<T>(sha256(text));
    }

    String text() {
        return this.value;
    }
}
