public class StringContainsOnlyLetters
{
    public static void main(String[] args) {
        String s = "HelloWorld";
        System.out.println(s.matches("[A-Za-z]+") ? "Only letters" : "Contains other characters");
    }
}
