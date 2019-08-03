public class Person {
    String name;

    @Override
    public String toString() {
        return name;
    }

    @Deprecated
    String get_name() {
        return name;
    }

    String getName() {
        return name;
    }
}
