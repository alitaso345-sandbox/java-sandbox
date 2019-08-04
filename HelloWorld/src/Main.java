import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Murata", "Okada", "Tanimoto");

        List<String> newList = list.stream()
                .filter(p -> p.length() > 5)
                .map(p -> "[" + p + "]")
                .collect(Collectors.toList());

        newList.forEach(System.out::println);

        int count = 5;

        String query = IntStream.range(0, count)
                .mapToObj(i -> "?")
                .collect(Collectors.joining(", "));
        System.out.println(query);
    }
}
