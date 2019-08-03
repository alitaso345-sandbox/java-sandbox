public class StudentSample {
    public static void main(String... args) {
        Student murata = new Student("村田");

        murata.score = 80;
        murata.printScore();

        Student okada = new Student("岡田", 90);
        okada.printScore();
    }
}
