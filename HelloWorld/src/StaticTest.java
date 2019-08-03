public class StaticTest {
    static String staticField = "World"; // クラスフィールド

    static String staticMethod() { // クラスメソッド
        return "yay!";
    }

    String instanceField = "Hello";

    String instanceMethod() {
        return  instanceField + " " + staticField + " " + staticMethod();
    }
}
