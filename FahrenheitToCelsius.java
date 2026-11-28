public class FahrenheitToCelsius
{
    public static void main(String[] args) {
        double f = 98.6;
        System.out.printf("%.1f F = %.2f C%n", f, (f - 32) * 5 / 9);
    }
}
