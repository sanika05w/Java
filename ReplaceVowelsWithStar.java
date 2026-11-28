public class ReplaceVowelsWithStar
{
    public static void main(String[] args) {
        String s = "programming language";
        System.out.println(s.replaceAll("[aeiouAEIOU]", "*"));
    }
}
