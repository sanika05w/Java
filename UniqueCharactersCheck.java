public class UniqueCharactersCheck
{
    public static void main(String[] args) {
        String s = "abcdef";
        boolean unique = s.chars().distinct().count() == s.length();
        System.out.println(unique ? "All characters unique" : "Duplicates present");
    }
}
