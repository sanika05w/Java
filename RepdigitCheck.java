public class RepdigitCheck
{
    public static void main(String[] args) {
        String s = "7777";
        boolean rep = s.chars().distinct().count() == 1;
        System.out.println(s + (rep ? " is a repdigit" : " is not a repdigit"));
    }
}
