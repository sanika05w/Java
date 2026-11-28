public class MostFrequentCharacter
{
    public static void main(String[] args) {
        String s = "mississippi";
        int[] f = new int[256];
        for (char ch : s.toCharArray()) f[ch]++;
        int best = 0;
        for (int i = 0; i < 256; i++) if (f[i] > f[best]) best = i;
        System.out.println((char) best + " appears " + f[best] + " times");
    }
}
