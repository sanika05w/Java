public class StringConcatDemo
{
    public static void main(String[] args) {
        String a = "Hello", b = "World";
        System.out.println(a + " " + b);
        System.out.println(a.concat(" ").concat(b));
    }
}
