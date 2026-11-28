import java.time.*;

public class DayOfWeekCalculator
{
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2026, 11, 28);
        System.out.println(d + " is a " + d.getDayOfWeek());
    }
}
