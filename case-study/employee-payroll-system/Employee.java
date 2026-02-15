public class Employee{
    String employeeId;
    String name;
    String role;
    double baseSalary;
    double monthlySalary;

    public Employee(String employeeId, String name, String role, double baseSalary){
        this.employeeId = employeeId;
        this.name = name;
        this.role = role;
        this.baseSalary = baseSalary;
    }

    public void calculateSalary(){
        switch(role){
            case "manager":
                monthlySalary = baseSalary + baseSalary*0.2;
                break;
            case "developer":
                monthlySalary = baseSalary + baseSalary*0.1;
                break;
            case "designer":
                monthlySalary = baseSalary + baseSalary*0.05;
                break;
            case "intern":
                monthlySalary = 1000.0;
                break;
            default:
                monthlySalary = 0.0;
                break;
        }
    }

    public void applyDeduction(double amount){
        monthlySalary -= amount;
    }

    public void displayEmployeeDetails(){
        System.out.println("Employee ID : "+employeeId);
        System.out.println("Name : "+name);
        System.out.println("Role : "+role);
        System.out.println("Base Salary : "+baseSalary);
        System.out.println("Monthly Salary : "+monthlySalary);
    }
}