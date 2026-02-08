import java.util.ArrayList;

public class Student{
    String name;
    ArrayList<Double> grades = new ArrayList<>();

    public Student(String name){
        this.name = name;
    }

    public void addGrade(double grade){
        grades.add(grade);
    }

    double calculateAverage(){
        double sum = 0.0;
        int count = 0;
        for(double grade : grades){
            sum += grade;
            count++;
        }
        double average = sum/count;
        return average;
    }

    public void displayStudentDetails(){
        System.out.println("NAME : "+name);
        System.out.println("GRADES : "+grades);
        System.err.println("AVERAGE GRADE : "+calculateAverage());
    }
}