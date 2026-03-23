public class Main {
    public static void main(String[] args) {
        Employee tc1 = new Employee("Alice", 10000);
        Employee tc2 = new Manager("Bob", 10000);
        Employee tc3 = new Executive("Charlie", 10000);

        System.out.printf("TC 1 - Employee(\"Alice\", 10000): %.2f%n", tc1.calculateSalary());
        System.out.printf("TC 2 - Manager(\"Bob\", 10000): %.2f%n", tc2.calculateSalary());
        System.out.printf("TC 3 - Executive(\"Charlie\", 10000): %.2f%n", tc3.calculateSalary());
    }
}
