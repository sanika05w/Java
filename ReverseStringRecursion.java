public class ReverseStringRecursion
{
    public static void main(String[] args) {
        System.out.println(reverse("recursion"));
    }

    static String reverse(String s) {
        return s.isEmpty() ? s : reverse(s.substring(1)) + s.charAt(0);
    }
}
