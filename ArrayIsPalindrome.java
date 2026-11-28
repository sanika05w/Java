public class ArrayIsPalindrome
{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        boolean pal = true;
        for (int i = 0; i < a.length / 2; i++) if (a[i] != a[a.length - 1 - i]) pal = false;
        System.out.println(pal ? "Palindrome array" : "Not a palindrome array");
    }
}
