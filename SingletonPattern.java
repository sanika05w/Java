public class SingletonPattern
{
    public static void main(String[] args) {
        Config a = Config.getInstance();
        Config b = Config.getInstance();
        System.out.println(a == b);
    }

    static class Config {
        private static Config instance;
        private Config() {}
        static Config getInstance() {
            if (instance == null) instance = new Config();
            return instance;
        }
    }
}
