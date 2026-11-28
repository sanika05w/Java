public class DaysToYearsWeeks
{
    public static void main(String[] args) {
        int days = 1000;
        int years = days / 365;
        int weeks = (days % 365) / 7;
        int rem = (days % 365) % 7;
        System.out.println(years + " years, " + weeks + " weeks, " + rem + " days");
    }
}
