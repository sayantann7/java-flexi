public class Manager extends Employee {

    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + 2000.0;
    }
}
