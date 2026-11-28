public class PerfectCubeCheck
{
    public static void main(String[] args) {
        int n = 343;
        int r = (int) Math.round(Math.cbrt(n));
        System.out.println(n + (r * r * r == n ? " is a perfect cube" : " is not a perfect cube"));
    }
}
