public class StaticTestMain {
    public static void main(String... args) {
        System.out.println(StaticTest.staticMethod());
        System.out.println(StaticTest.GREETING_MESSAGE);
        System.out.println(StaticTest.staticField);

        StaticTest.GREETING_MESSAGE = "hoge";
    }
}
