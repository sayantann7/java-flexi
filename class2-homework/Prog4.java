// WAP in java to implement instance method using static and instance variable

public class Prog4 {
    static int totalStudents = 0;
    String name;
    int marks;
    
    Prog4(String name, int marks) {
        this.name = name;
        this.marks = marks;
        totalStudents++;
    }

    void display() {
        System.out.println("Student: " + name + ", Marks: " + marks);
        System.out.println("Total Students: " + totalStudents);
    }
    
    public static void main(String[] args) {
        Prog4 s1 = new Prog4("Sayantan", 85);
        s1.display();
        Prog4 s2 = new Prog4("Shashank", 90);
        s2.display();
    }
}