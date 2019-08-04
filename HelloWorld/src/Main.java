public class Main {

    public static void main(String[] args) {
        GenericStack<String> genStack = new GenericStack<>();

        genStack.push("Scala");
        genStack.push("Groovy");
        genStack.push("Java");

        String genElement = genStack.pop();

        if (genElement != null) {
            System.out.println(genElement);
        }

        GenericStack<Integer> genStack2 = new GenericStack<>();

        genStack2.push(100);
        genStack2.push(200);

        Integer genElement2 = genStack2.pop();

        if (genElement2 != null) {
            System.out.println(genElement2);
        }
    }
}
