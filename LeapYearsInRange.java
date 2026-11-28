public class LeapYearsInRange
{
    public static void main(String[] args) {
        for (int y = 2000; y <= 2030; y++) {
            if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) System.out.print(y + " ");
        }
        System.out.println();
    }
}
