import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        int second = LocalDateTime.now().getSecond();

        if (second % 2 == 0) {
            System.out.println(second + "は偶数です");
        } else {
            System.out.println(second + "は奇数です");
        }
    }
}
