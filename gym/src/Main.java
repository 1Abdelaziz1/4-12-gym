import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LocalDate from = LocalDate.now();
        LocalDate to = from.plusDays(10);

        long result = ChronoUnit.DAYS.between(from, to);
        System.out.println(from);    // 10


    }
}
