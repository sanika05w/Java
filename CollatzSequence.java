public class CollatzSequence
{
    public static void main(String[] args) {
        int n = 27, steps = 0;
        while (n != 1) {
            n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
            steps++;
        }
        System.out.println("Steps to reach 1 = " + steps);
    }
}
