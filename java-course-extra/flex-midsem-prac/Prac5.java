import java.util.Scanner;

public class Prac5 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        try{
            calc.doCalculation(age);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Calculation done");
        sc.close();
    }
}

class Calculator{
    public void doCalculation(int age) throws Exception{
        if(age<18){
            throw new MinorAgeException("Minor Error : Jeffrey Epstein will hunt you");
        }
        System.out.println("You are safe");
    }
}

class MinorAgeException extends Exception{
    public MinorAgeException(String msg){
        super(msg);
    }
}