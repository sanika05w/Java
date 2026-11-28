public class BuzzNumber
{
    public static void main(String[] args) {
        int n = 77;
        System.out.println(n + (n % 7 == 0 || n % 10 == 7 ? " is a buzz number" : " is not a buzz number"));
    }
}
