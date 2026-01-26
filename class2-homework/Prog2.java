// WAP in Java to display username and roll no. using counter where the initial similar path of the candidate's roll no. will be through static variable and the output should be concatanated between the static variable and the floating number

class Student{
    static String prnPrefix = "24070122";
    int prn;
    static int noOfStudents = 0;
    public Student(int prn){
        this.prn = prn;
        noOfStudents++;
    } 
    public void printInfo(){
        String fullPrn = prnPrefix + Integer.toString(prn);
        System.out.println("Student PRN : "+fullPrn);
    }
}

public class Prog2{
    public static void main(String[] args) {
        Student s1 = new Student(176);
        s1.printInfo();
        Student s2 = new Student(181);
        s2.printInfo();
        System.out.println("Total number of students : "+Student.noOfStudents);
    }
}