import java.time.*;

public class DurationDemo
{
    public static void main(String[] args) {
        Duration d = Duration.between(LocalTime.of(9, 15), LocalTime.of(17, 45));
        System.out.println(d.toHours() + " hours " + d.toMinutesPart() + " minutes");
    }
}
