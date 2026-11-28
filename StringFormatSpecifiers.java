public class StringFormatSpecifiers
{
    public static void main(String[] args) {
        System.out.printf("%d | %5d | %-5d | %05d%n", 42, 42, 42, 42);
        System.out.printf("%f | %.2f | %10.3f%n", 3.14159, 3.14159, 3.14159);
        System.out.printf("%s | %10s | %-10s|%n", "hi", "hi", "hi");
        System.out.printf("%x | %o | %e%n", 255, 8, 12345.678);
    }
}
