public class RemoveExtraSpaces
{
    public static void main(String[] args) {
        String s = "  Java    is   very   simple  ";
        System.out.println("[" + s.trim().replaceAll("\\s+", " ") + "]");
    }
}
