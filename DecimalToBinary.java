public class DecimalToBinary
{
    public static void main(String[] args) {
        int n = 45;
        String binary = "";
        int t = n;
        while (t > 0) {
            binary = (t % 2) + binary;
            t /= 2;
        }
        System.out.println(n + " = " + binary + " (binary)");
    }
}
