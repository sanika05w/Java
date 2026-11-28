public class LargestOfThree
{
    public static void main(String[] args) {
        int a = 12, b = 89, c = 34;
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Largest = " + max);
    }
}
