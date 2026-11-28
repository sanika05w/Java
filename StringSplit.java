public class StringSplit
{
    public static void main(String[] args) {
        String s = "apple,banana,cherry";
        String[] parts = s.split(",");
        for (String p : parts) System.out.println(p);
    }
}
