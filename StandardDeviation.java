public class StandardDeviation
{
    public static void main(String[] args) {
        double[] a = {2, 4, 4, 4, 5, 5, 7, 9};
        double mean = 0;
        for (double x : a) mean += x;
        mean /= a.length;
        double var = 0;
        for (double x : a) var += (x - mean) * (x - mean);
        System.out.println("Std deviation = " + Math.sqrt(var / a.length));
    }
}
