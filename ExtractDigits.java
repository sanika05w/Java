public class ExtractDigits
{
    public static void main(String[] args) {
        String s = "Room 204, Floor 7";
        System.out.println(s.replaceAll("[^0-9]", ""));
    }
}
