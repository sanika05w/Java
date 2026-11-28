public class EnumDemo
{
    public static void main(String[] args) {
        for (Day d : Day.values()) System.out.print(d + " ");
        System.out.println();
        System.out.println(Day.valueOf("FRI").ordinal());
    }

    enum Day { MON, TUE, WED, THU, FRI, SAT, SUN }
}
