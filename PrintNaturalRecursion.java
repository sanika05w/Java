public class PrintNaturalRecursion
{
    public static void main(String[] args) {
        print(1, 10);
        System.out.println();
    }

    static void print(int i, int n) {
        if (i > n) return;
        System.out.print(i + " ");
        print(i + 1, n);
    }
}
