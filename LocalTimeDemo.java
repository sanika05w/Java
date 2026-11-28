import java.time.*;

public class LocalTimeDemo
{
    public static void main(String[] args) {
        LocalTime t = LocalTime.of(14, 30);
        System.out.println(t);
        System.out.println(t.plusHours(3).plusMinutes(45));
    }
}
