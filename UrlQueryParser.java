public class UrlQueryParser
{
    public static void main(String[] args) {
        String url = "https://site.com/search?q=java&page=2&sort=asc";
        String query = url.substring(url.indexOf('?') + 1);
        for (String pair : query.split("&")) {
            String[] kv = pair.split("=");
            System.out.println(kv[0] + " -> " + kv[1]);
        }
    }
}
