public class GeometricProgressionSum
{
    public static void main(String[] args) {
        double a = 1, r = 2;
        int n = 10;
        System.out.println("Sum of GP = " + (a * (Math.pow(r, n) - 1) / (r - 1)));
    }
}
