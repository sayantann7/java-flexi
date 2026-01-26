// WAP in Java using parameterized constructor to store student name, roll no., division. Insert 3 values of 3 students.

class Student{
    String name;
    String roll;
    String division;
    public Student(String name, String roll, String division){
        this.name = name;
        this.roll = roll;
        this.division = division;
    }
    public void printInfo(){
        System.out.println("Student Details : ");
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+roll);
        System.out.println("Divison : "+division);
    }
}

public class Prog1{
    public static void main(String[] args) {
        Student s1 = new Student("Sayantan","24070122176","B3");
        Student s2 = new Student("Shashank","24070122181","B4");
        Student s3 = new Student("Laha","24070122184","B5");

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
    }
}