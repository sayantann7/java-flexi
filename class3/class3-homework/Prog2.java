// WAP in Java where we will be implenting static and instance method through user input data calling

import java.util.Scanner;

class Student{
    static private int noOfStudents = 0;
    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
        noOfStudents++;
    }

    // static method
    public static int getNoOfStudents(){
        return noOfStudents;
    }
    
    // instance method
    public void printInfo(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}

public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of Student 1 : ");
        String name1 = sc.next();
        System.out.println("Enter age of Student 1 : ");
        int age1 = sc.nextInt();
        System.out.println("Enter name of Student 2 : ");
        String name2 = sc.next();
        System.out.println("Enter age of Student 2 : ");
        int age2 = sc.nextInt();
        Student s1 = new Student(name1, age1);
        s1.printInfo();
        Student s2 = new Student(name2, age2);
        s2.printInfo();
        System.out.println("Total number of students : "+Student.getNoOfStudents());
    }
}