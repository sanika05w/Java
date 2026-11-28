import java.util.*;

public class EnumMapDemo
{
    public static void main(String[] args) {
        EnumMap<Day, String> m = new EnumMap<>(Day.class);
        m.put(Day.WED, "Gym"); m.put(Day.MON, "Work"); m.put(Day.FRI, "Movie");
        System.out.println(m);
    }

    enum Day { MON, TUE, WED, THU, FRI }
}
