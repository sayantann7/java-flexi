import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Payroll payroll = new Payroll();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Payroll Management System!");
        int exit = 0;

        while (exit == 0) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("Option 1 : Add Employee");
            System.out.println("Option 2 : Calculate All Salaries");
            System.out.println("Option 3 : Find Employee by ID");
            System.out.println("Option 4 : Apply Deduction");
            System.out.println("Option 5 : Exit");
            System.out.print("Enter your option (1/2/3/4/5) : ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID : ");
                    String id = sc.nextLine();

                    System.out.print("Enter Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Role (manager/developer/designer/intern) : ");
                    String role = sc.nextLine().toLowerCase();

                    System.out.print("Enter Base Salary : ");
                    double baseSalary = Double.parseDouble(sc.nextLine());

                    Employee emp = new Employee(id, name, role, baseSalary);
                    payroll.addEmployee(emp);

                    System.out.println("Employee added successfully!");
                    break;

                case 2:
                    payroll.calculateAllSalaries();
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search : ");
                    String searchId = sc.nextLine();

                    Employee found = payroll.findEmployeeById(searchId);

                    if (found == null) {
                        System.out.println("Employee not found!");
                    } else {
                        found.displayEmployeeDetails();
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID : ");
                    String deductId = sc.nextLine();

                    Employee deductEmp = payroll.findEmployeeById(deductId);

                    if (deductEmp == null) {
                        System.out.println("Employee not found!");
                        break;
                    }

                    System.out.print("Enter Deduction Amount : ");
                    double deduction = Double.parseDouble(sc.nextLine());

                    deductEmp.applyDeduction(deduction);
                    System.out.println("Deduction applied successfully!");
                    break;

                case 5:
                    exit = 1;
                    System.out.println("Exiting Payroll System...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        }
    }
}
