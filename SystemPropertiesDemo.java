public class SystemPropertiesDemo
{
    public static void main(String[] args) {
        System.out.println("OS name : " + System.getProperty("os.name"));
        System.out.println("Java    : " + System.getProperty("java.version"));
        System.out.println("Line sep: " + System.lineSeparator().length() + " char(s)");
    }
}
