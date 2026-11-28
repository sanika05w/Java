public class ReverseCaseWords
{
    public static void main(String[] args) {
        String s = "Hello Java World";
        for (String w : s.split(" ")) {
            System.out.print(w.substring(0, 1).toLowerCase() + w.substring(1).toUpperCase() + " ");
        }
        System.out.println();
    }
}
