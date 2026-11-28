public class CountConsonants
{
    public static void main(String[] args) {
        String s = "Hello World";
        int c = 0;
        for (char ch : s.toLowerCase().toCharArray())
            if (Character.isLetter(ch) && "aeiou".indexOf(ch) < 0) c++;
        System.out.println("Consonants = " + c);
    }
}
