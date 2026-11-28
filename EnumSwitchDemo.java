public class EnumSwitchDemo
{
    public static void main(String[] args) {
        Level l = Level.MEDIUM;
        switch (l) {
            case LOW: System.out.println("Low priority"); break;
            case MEDIUM: System.out.println("Medium priority"); break;
            case HIGH: System.out.println("High priority"); break;
        }
    }

    enum Level { LOW, MEDIUM, HIGH }
}
