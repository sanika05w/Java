public class RemoveDigitsFromString
{
    public static void main(String[] args) {
        String s = "a1b2c3d4";
        System.out.println(s.replaceAll("[0-9]", ""));
    }
}
