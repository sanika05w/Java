public class EmployeeClass
{
    public static void main(String[] args) {
        Employee e = new Employee("Asha", 45000);
        e.showDetails();
        e.raise(10);
        e.showDetails();
    }

    static class Employee {
        String name;
        double salary;
        Employee(String name, double salary) { this.name = name; this.salary = salary; }
        void raise(double percent) { salary += salary * percent / 100; }
        void showDetails() { System.out.println(name + " earns " + salary); }
    }
}
