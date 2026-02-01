class Student{
    String name;
    int age;

    Student(String n, int a){
        name = n;
        age = a;
    }

    void display(){
        System.out.println("Name: "+name+" Age: "+age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student student1 = new Student("Alice",20);
        student1.display();
    }
}

// HOMEWORK : WAP in Java using parameterized constructor to store student name, roll no., division. Insert 3 values of 3 students.
// WAP in Java to display username and roll no. using counter where the initial similar path of the candidate's roll no. will be through static variable and the output should be concatanated between the static variable and the floating number
// WAP in java to perform static method using static variable
// WAP in java to implement instance method using static and instance variable