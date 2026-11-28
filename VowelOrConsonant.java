public class VowelOrConsonant
{
    public static void main(String[] args) {
        char ch = 'e';
        String vowels = "aeiouAEIOU";
        System.out.println(ch + (vowels.indexOf(ch) >= 0 ? " is a vowel" : " is a consonant"));
    }
}
