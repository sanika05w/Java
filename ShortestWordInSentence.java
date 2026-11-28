public class ShortestWordInSentence
{
    public static void main(String[] args) {
        String s = "Java makes programming fun";
        String shortest = s.split(" ")[0];
        for (String w : s.split(" ")) {
            if (w.length() < shortest.length()) shortest = w;
        }
        System.out.println("Shortest word = " + shortest);
    }
}
