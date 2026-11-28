public class EnumWithFields
{
    public static void main(String[] args) {
        for (Planet p : Planet.values())
            System.out.println(p + " -> gravity " + p.gravity);
    }

    enum Planet {
        EARTH(9.8), MARS(3.7), JUPITER(24.8);
        final double gravity;
        Planet(double g) { gravity = g; }
    }
}
