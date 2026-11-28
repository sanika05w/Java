public class CaesarCipher
{
    public static void main(String[] args) {
        String text = "HELLO";
        int shift = 3;
        StringBuilder sb = new StringBuilder();
        for (char ch : text.toCharArray()) {
            sb.append((char) ((ch - 'A' + shift) % 26 + 'A'));
        }
        System.out.println("Encrypted: " + sb);
    }
}
