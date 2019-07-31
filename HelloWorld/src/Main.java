import java.time.LocalDateTime;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        Month month = LocalDateTime.now().getMonth();

        switch (month) {
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println(month + "は春です");
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println(month + "は夏です");
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println(month + "は秋です");
                break;
            default:
                System.out.println(month + "は冬です");
                break;
        }

    }
}
