public class InvertedPyramidStars
{
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            System.out.println(" ".repeat(n - i) + "* ".repeat(i));
        }
    }
}
