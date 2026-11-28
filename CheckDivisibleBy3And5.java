public class CheckDivisibleBy3And5
{
    public static void main(String[] args) {
        int n = 45;
        if (n % 3 == 0 && n % 5 == 0) System.out.println(n + " is divisible by both 3 and 5");
        else System.out.println(n + " is not divisible by both");
    }
}
