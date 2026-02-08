import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int age;
    int marks;

    public Student(String name, int age, int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student that){
        if( this.age > that.age ){
            return 1;
        }
        else{
            return -1;
        }
    }

    @Override
    public String toString(){
        return "NAME: "+name+"   AGE:  "+age+"   MARKS: "+marks;
    }
}

public class ComparableSorting {
    public static void main(String[] args) {
        List<Student> studs = new ArrayList<>();
        studs.add(new Student("Sayantan",20,87));
        studs.add(new Student("Shashank",19,99));
        studs.add(new Student("Shaswat",58,102));
        studs.add(new Student("Shayontan",27,14));

        System.out.println("Before sorting : ");
        for(Student stud : studs){
            System.out.println(stud);
        }

        studs.sort(null); // same as Collections.sort(studs);

        System.out.println("After sorting : ");
        for(Student stud : studs){
            System.out.println(stud);
        }
    }
}
