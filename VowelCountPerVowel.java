public class VowelCountPerVowel
{
    public static void main(String[] args) {
        String s = "education is important";
        for (char v : "aeiou".toCharArray()) {
            int c = 0;
            for (char ch : s.toCharArray()) if (ch == v) c++;
            System.out.println(v + " -> " + c);
        }
    }
}
