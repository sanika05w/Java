import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateFormatDemo
{
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2026, 11, 28);
        System.out.println(d.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println(d.format(DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy")));
    }
}
