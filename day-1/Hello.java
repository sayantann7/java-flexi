class Calculator{
    static int a = 10;
    public static void main(String args[]){
        System.out.println("Welcome to my calculator");
        System.out.print(a);
    }
    public int add(int a, int b){
        return a+b;
    }
}

public class Hello{
    public static void main(String args[]){
        int a = 10;
        int b = 23;

        Calculator calc = new Calculator();

        int result = calc.add(a, b);

        System.out.print(result);
    }
}

// Homework Program :
// 1. Write a program to add two numbers
// 2. WAP to multiply 2 numbers
// 3. WAP to print my name
// 4. WAP to print my best friend's name