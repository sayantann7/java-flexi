public class Executive extends Manager {

    public Executive(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (baseSalary * 0.10);
    }
}
