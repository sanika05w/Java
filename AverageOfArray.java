public class AverageOfArray
{
    public static void main(String[] args) {
        int[] a = {70, 80, 90, 85};
        int sum = 0;
        for (int x : a) sum += x;
        System.out.println("Average = " + (double) sum / a.length);
    }
}
