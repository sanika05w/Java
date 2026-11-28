public class ConstructorDemo
{
    public static void main(String[] args) {
        Car c = new Car("Toyota", 2022);
        System.out.println(c);
    }

    static class Car {
        String brand;
        int year;
        Car(String brand, int year) {
            this.brand = brand;
            this.year = year;
        }
        public String toString() {
            return brand + " (" + year + ")";
        }
    }
}
