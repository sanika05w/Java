public class DigitalRoot
{
    public static void main(String[] args) {
        int n = 9875;
        int root = n == 0 ? 0 : 1 + (n - 1) % 9;
        System.out.println("Digital root of " + n + " = " + root);
    }
}
