public class DisariumNumber
{
    public static void main(String[] args) {
        int n = 89, sum = 0;
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) sum += (int) Math.pow(s.charAt(i) - '0', i + 1);
        System.out.println(n + (sum == n ? " is a disarium number" : " is not a disarium number"));
    }
}
