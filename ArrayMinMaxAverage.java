public class ArrayMinMaxAverage
{
    public static void main(String[] args) {
        double[] a = {4.5, 2.0, 9.5, 7.0};
        double min = a[0], max = a[0], sum = 0;
        for (double x : a) { min = Math.min(min, x); max = Math.max(max, x); sum += x; }
        System.out.println("Min=" + min + " Max=" + max + " Avg=" + sum / a.length);
    }
}
