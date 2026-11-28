public class TotalAndAverageMarks
{
    public static void main(String[] args) {
        int[] marks = {78, 85, 92, 67, 88};
        int total = 0;
        for (int m : marks) total += m;
        System.out.println("Total = " + total);
        System.out.println("Average = " + (double) total / marks.length);
    }
}
