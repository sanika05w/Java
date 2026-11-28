public class HollowPyramid
{
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder(" ".repeat(n - i));
            for (int j = 1; j <= 2 * i - 1; j++) {
                sb.append((j == 1 || j == 2 * i - 1 || i == n) ? "*" : " ");
            }
            System.out.println(sb);
        }
    }
}
