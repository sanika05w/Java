public class CountWordOccurrence
{
    public static void main(String[] args) {
        String s = "the cat and the hat and the bat";
        int count = 0;
        for (String w : s.split(" ")) if (w.equals("the")) count++;
        System.out.println("'the' appears " + count + " times");
    }
}
