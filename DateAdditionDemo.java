import java.time.*;

public class DateAdditionDemo
{
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2026, 11, 28);
        System.out.println(d.plusDays(10));
        System.out.println(d.plusMonths(3));
        System.out.println(d.minusYears(1));
        System.out.println(d.isLeapYear());
    }
}
