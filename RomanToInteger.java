public class RomanToInteger
{
    public static void main(String[] args) {
        System.out.println(toInt("MCMXCIV"));
    }

    static int val(char c) {
        switch (c) {
            case 'I': return 1; case 'V': return 5; case 'X': return 10; case 'L': return 50;
            case 'C': return 100; case 'D': return 500; default: return 1000;
        }
    }
    static int toInt(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && val(s.charAt(i)) < val(s.charAt(i + 1))) total -= val(s.charAt(i));
            else total += val(s.charAt(i));
        }
        return total;
    }
}
