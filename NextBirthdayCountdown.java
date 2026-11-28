import java.time.*;
import java.time.temporal.ChronoUnit;

public class NextBirthdayCountdown
{
    public static void main(String[] args) {
        LocalDate today = LocalDate.of(2026, 11, 28);
        LocalDate bday = LocalDate.of(2026, 5, 14);
        if (bday.isBefore(today)) bday = bday.plusYears(1);
        System.out.println("Days until next birthday = " + ChronoUnit.DAYS.between(today, bday));
    }
}
