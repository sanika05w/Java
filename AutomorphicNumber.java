public class AutomorphicNumber
{
    public static void main(String[] args) {
        int n = 76;
        int sq = n * n;
        boolean ok = String.valueOf(sq).endsWith(String.valueOf(n));
        System.out.println(n + (ok ? " is automorphic" : " is not automorphic"));
    }
}
