public class CharacterPyramid
{
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.print(" ".repeat(n - i - 1));
            for (int j = 0; j <= i; j++) System.out.print((char) ('A' + i) + " ");
            System.out.println();
        }
    }
}
