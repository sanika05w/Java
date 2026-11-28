public class TrigonometryDemo
{
    public static void main(String[] args) {
        double angle = Math.toRadians(30);
        System.out.printf("sin(30) = %.2f%n", Math.sin(angle));
        System.out.printf("cos(60) = %.2f%n", Math.cos(Math.toRadians(60)));
        System.out.printf("tan(45) = %.2f%n", Math.tan(Math.toRadians(45)));
    }
}
