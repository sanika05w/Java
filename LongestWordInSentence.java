public class LongestWordInSentence
{
    public static void main(String[] args) {
        String s = "Java makes programming enjoyable";
        String longest = "";
        for (String w : s.split(" ")) {
            if (w.length() > longest.length()) longest = w;
        }
        System.out.println("Longest word = " + longest);
    }
}
