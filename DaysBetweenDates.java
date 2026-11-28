import java.time.*;
import java.time.temporal.ChronoUnit;

public class DaysBetweenDates
{
    public static void main(String[] args) {
        LocalDate a = LocalDate.of(2026, 1, 1), b = LocalDate.of(2026, 11, 28);
        System.out.println("Days between = " + ChronoUnit.DAYS.between(a, b));
    }
}
