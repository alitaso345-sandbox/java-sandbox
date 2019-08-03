public class StaticTestMain {
    public static void main(String... args) {
        System.out.println(StaticTest.staticField);
        System.out.println(StaticTest.staticMethod());

        StaticTest.staticField = "Japan";
        System.out.println(StaticTest.staticField);

        StaticTest test = new StaticTest();
        System.out.println(test.staticField);
        System.out.println(test.staticMethod());
        System.out.println(test.instanceMethod());

        test.staticField = "Murata";
        System.out.println(test.instanceMethod());

        test.instanceField = "Hi";
        System.out.println(test.instanceMethod());
    }
}
