import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("murata");
        list.add("okada");
        list.add("tanimoto");
        list.add("sakamoto");

        Map<Integer, List<String>> map = new HashMap<>();
        list.forEach(name -> {
            Integer nameLen = name.length();

            // キーがないときだけ、空の List として値を与える
            List<String> valueList = map.computeIfAbsent(nameLen, key -> new ArrayList<>());
            valueList.add(name);
        });

        System.out.println(map);
    }
}
