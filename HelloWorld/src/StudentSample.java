public class StudentSample {
    public static void main(String... args) {
        Student murata = new Student();

        murata.name = "村田";
        murata.score = 80;
        murata.printScore();

        Student okada = new Student();
        okada.name = "岡田";
        okada.score = 90;
        okada.printScore();
    }
}
