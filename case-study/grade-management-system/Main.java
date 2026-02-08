import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        GradeManager gradeManager = new GradeManager();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our Grade Managager System!");
        int exit = 0;

        while(exit==0){
            System.out.println("What do you want to do?");
            System.out.println("Option 1 : Display all students");
            System.out.println("Option 2 : Add a student");
            System.out.println("Option 3 : Add grade of a student");
            System.out.println("Option 4 : Search a students by his/her name");
            System.out.println("Option 5 : Exit the system");
            System.out.print("Enter your option (1/2/3/4) : ");
            int choice = Integer.parseInt(sc.nextLine());
            System.out.println();
            switch(choice){
                case 1:
                    gradeManager.displayAllStudents();

                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter student name : ");
                    String name = sc.nextLine();
                    
                    Student student = new Student(name);
                    gradeManager.addStudent(student);
                    System.out.println("The new student has been added!");

                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter the student name : ");
                    String studName = sc.nextLine();

                    Student foundStud = gradeManager.findStudentByName(studName);
                    
                    if(foundStud==null){
                        System.out.println("Could not find the student!");
                    }else{
                        System.out.print("Enter the student grade : ");
                        double grade = Double.parseDouble(sc.nextLine());
                        foundStud.addGrade(grade);
                        System.out.println("Grade has been added");
                    }
                    break;
                case 4:
                    System.out.print("Enter student name to search for : ");
                    String searchName = sc.nextLine();

                    Student searchedStudent = gradeManager.findStudentByName(searchName);
                    
                    if(searchedStudent==null){
                        System.out.println("Could not find the student!");
                    }else{
                        System.out.println("Student has been found :");
                        searchedStudent.displayStudentDetails();
                    }

                    System.out.println();
                    break;
                case 5:
                    exit = 1;
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        }
    }
}
