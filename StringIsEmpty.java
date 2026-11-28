public class StringIsEmpty
{
    public static void main(String[] args) {
        String a = "", b = "  ";
        System.out.println(a.isEmpty());
        System.out.println(b.isEmpty());
        System.out.println(b.isBlank());
    }
}
