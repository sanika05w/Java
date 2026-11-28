public class ArmstrongInRange
{
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int t = i, sum = 0;
            while (t != 0) {
                int d = t % 10;
                sum += d * d * d;
                t /= 10;
            }
            if (sum == i) System.out.print(i + " ");
        }
        System.out.println();
    }
}
