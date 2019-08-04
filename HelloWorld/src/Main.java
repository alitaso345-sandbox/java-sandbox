import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Murata", "Okada", "Tanimoto");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
    }
}
