public class CountdownRecursion
{
    public static void main(String[] args) {
        countdown(5);
    }

    static void countdown(int n) {
        if (n == 0) {
            System.out.println("Liftoff!");
            return;
        }
        System.out.println(n);
        countdown(n - 1);
    }
}
