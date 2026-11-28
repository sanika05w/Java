public class CountWords
{
    public static void main(String[] args) {
        String s = "Java is simple and powerful";
        System.out.println("Words = " + s.trim().split("\\s+").length);
    }
}
