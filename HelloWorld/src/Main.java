import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String[] array = {"Murata", "Okada", "Tanimoto"};
        Stream<String> stream = Arrays.stream(array);
        stream.forEach(System.out::println);
    }
}
