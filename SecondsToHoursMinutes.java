public class SecondsToHoursMinutes
{
    public static void main(String[] args) {
        int seconds = 7384;
        int h = seconds / 3600;
        int m = (seconds % 3600) / 60;
        int s = seconds % 60;
        System.out.println(h + "h " + m + "m " + s + "s");
    }
}
