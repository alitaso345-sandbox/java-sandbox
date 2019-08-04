import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ken", 100));
        students.add(new Student("Shin", 60));
        students.add(new Student("Takuya", 80));

        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getScore() < 70) {
                iterator.remove();
            }
        }

        for (Student student : students) {
            System.out.println(student.getName() + ":" + student.getScore());
        }
    }
}
