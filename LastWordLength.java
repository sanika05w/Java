public class LastWordLength
{
    public static void main(String[] args) {
        String s = "Hello beautiful world   ";
        String[] w = s.trim().split(" ");
        System.out.println("Last word length = " + w[w.length - 1].length());
    }
}
