public class WordLengthStatistics
{
    public static void main(String[] args) {
        String[] w = "java is a powerful language".split(" ");
        int total = 0, max = 0;
        for (String s : w) { total += s.length(); max = Math.max(max, s.length()); }
        System.out.println("Words = " + w.length + ", longest = " + max + ", average = " + (double) total / w.length);
    }
}
