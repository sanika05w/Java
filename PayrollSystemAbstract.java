public class PayrollSystemAbstract
{
    public static void main(String[] args) {
        Emp[] e = {new FullTime("Asha", 50000), new PartTime("Ravi", 80, 250)};
        for (Emp x : e) System.out.println(x.name + " earns " + x.pay());
    }

    static abstract class Emp {
        String name; Emp(String n) { name = n; }
        abstract double pay();
    }
    static class FullTime extends Emp {
        double salary;
        FullTime(String n, double s) { super(n); salary = s; }
        double pay() { return salary; }
    }
    static class PartTime extends Emp {
        int hours; double rate;
        PartTime(String n, int h, double r) { super(n); hours = h; rate = r; }
        double pay() { return hours * rate; }
    }
}
