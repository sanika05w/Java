public class InstanceOfDemo
{
    public static void main(String[] args) {
        Object[] items = {"text", 42, 3.14, 'c'};
        for (Object o : items) {
            if (o instanceof String) System.out.println("String: " + o);
            else if (o instanceof Integer) System.out.println("Integer: " + o);
            else if (o instanceof Double) System.out.println("Double: " + o);
            else System.out.println("Other: " + o);
        }
    }
}
