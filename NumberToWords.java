public class NumberToWords
{
    public static void main(String[] args) {
        System.out.println(words(0));
        System.out.println(words(45));
        System.out.println(words(319));
        System.out.println(words(900));
    }

    static final String[] ONES = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    static final String[] TENS = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    static String words(int n) {
        if (n < 20) return ONES[n];
        if (n < 100) return TENS[n / 10] + (n % 10 == 0 ? "" : " " + ONES[n % 10]);
        return ONES[n / 100] + " hundred" + (n % 100 == 0 ? "" : " " + words(n % 100));
    }
}
