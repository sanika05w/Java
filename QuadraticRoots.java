public class QuadraticRoots
{
    public static void main(String[] args) {
        double a = 1, b = -5, c = 6;
        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("No real roots");
        } else {
            System.out.println("Root 1 = " + ((-b + Math.sqrt(d)) / (2 * a)));
            System.out.println("Root 2 = " + ((-b - Math.sqrt(d)) / (2 * a)));
        }
    }
}
