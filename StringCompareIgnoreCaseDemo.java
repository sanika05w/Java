public class StringCompareIgnoreCaseDemo
{
    public static void main(String[] args) {
        String a = "Apple", b = "apple";
        System.out.println(a.compareTo(b));
        System.out.println(a.compareToIgnoreCase(b));
    }
}
