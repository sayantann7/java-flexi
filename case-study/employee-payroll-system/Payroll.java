import java.util.ArrayList;

public class Payroll{
    ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void calculateAllSalaries(){
        int i = 0;
        for(Employee emp : employees){
            emp.calculateSalary();
            System.out.println("Monthly Salary of Employee"+i+": "+emp.monthlySalary);
            i++;
        }
    }

    public Employee findEmployeeById(String employeeId){
        for(Employee emp : employees){
            if(emp.employeeId.equals(employeeId)){
                return emp;
            }
        }
        return null;
    }
}