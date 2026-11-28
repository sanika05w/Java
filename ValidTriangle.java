public class ValidTriangle
{
    public static void main(String[] args) {
        int a = 3, b = 4, c = 8;
        boolean valid = a + b > c && b + c > a && a + c > b;
        System.out.println(valid ? "Valid triangle" : "Not a valid triangle");
    }
}
