public class ReverseWordOrder
{
    public static void main(String[] args) {
        String[] words = "Java is fun".split(" ");
        for (int i = words.length - 1; i >= 0; i--) System.out.print(words[i] + " ");
        System.out.println();
    }
}
