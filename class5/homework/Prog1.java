// write a program where you will be using final class and final method and final variable  within a single  program

final class Prog1{
    final int val = 10;

    final public void parentmethod(){
        System.out.println("This is a final method that cannot be overridden in the child class");
    }

    public static void main(String[] args) {
        System.out.println("the program is running");
    }
}

// class Class extends Prog1 {} -> This will give error as we cannot extend a final class