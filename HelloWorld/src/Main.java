import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Group> groups = new ArrayList<>();

        Group group1 = new Group();
        group1.add(new Student("Murata", 100));
        group1.add(new Student("Tanimoto", 60));
        group1.add(new Student("Okada", 80));
        groups.add(group1);


        Group group2 = new Group();
        group2.add(new Student("Akiba", 75));
        group2.add(new Student("Hayakawa", 85));
        group2.add(new Student("Sakamoto", 95));
        groups.add(group2);

        Stream<List<Student>> mappedSteam = groups.stream().map(g -> g.getStudents());
        Stream<Student> flatMappedStream = groups.stream().flatMap(g -> g.getStudents().stream());
    }
}
