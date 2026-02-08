import java.util.ArrayList;

public class GradeManager {
    ArrayList<Student> students = new ArrayList<>();

    static int noOfStudents = 0;

    public void addStudent(Student student){
        students.add(student);
        noOfStudents++;
    }

    public Student findStudentByName(String name){
        for(Student student : students){
            if(student.name.equals(name)){
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents(){
        if(noOfStudents==0){
            System.out.println("No students to display!");
        }
        else{
            System.out.println("All Student Details : ");
            for(Student student : students){
                student.displayStudentDetails();
                System.out.println();
            }
        }
    }
}
