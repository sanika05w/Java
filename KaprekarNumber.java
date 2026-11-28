public class KaprekarNumber
{
    public static void main(String[] args) {
        int n = 45;
        long sq = (long) n * n;
        String s = String.valueOf(sq);
        int mid = s.length() / 2;
        int left = mid == 0 ? 0 : Integer.parseInt(s.substring(0, mid));
        int right = Integer.parseInt(s.substring(mid));
        System.out.println(n + (left + right == n ? " is a Kaprekar number" : " is not a Kaprekar number"));
    }
}
