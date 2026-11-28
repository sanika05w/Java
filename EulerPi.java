public class EulerPi
{
    public static void main(String[] args) {
        double sum = 0;
        for (int k = 0; k < 100000; k++) {
            sum += (k % 2 == 0 ? 1.0 : -1.0) / (2 * k + 1);
        }
        System.out.println("Pi approx = " + (4 * sum));
    }
}
