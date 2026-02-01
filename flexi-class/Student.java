class Student {
    int id;
    String name;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Alice";

        Student s2 = new Student();
        s2.id = 932;
        s2.name = "John";

        System.out.println(s1.id+" "+s1.name);
        System.out.println(s2.id+" "+s2.name);
    }
}
