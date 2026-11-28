public class VehicleHierarchy
{
    public static void main(String[] args) {
        Vehicle[] v = {new Car(), new Bike(), new Truck()};
        for (Vehicle x : v) System.out.println(x.name() + " has " + x.wheels() + " wheels");
    }

    static abstract class Vehicle {
        abstract int wheels();
        String name() { return getClass().getSimpleName(); }
    }
    static class Car extends Vehicle { int wheels() { return 4; } }
    static class Bike extends Vehicle { int wheels() { return 2; } }
    static class Truck extends Vehicle { int wheels() { return 6; } }
}
