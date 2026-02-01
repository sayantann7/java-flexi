class Person{
    String name;

    void display(){
        System.out.println("Name: "+name);
    }
}

public class InstanceMethod {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "John";
        p.display();

        Person q = new Person();
        q.name = "Henry";
        q.display();

        Person r = new Person();
        r.name = "Ryan";
        r.display();
    }
}
