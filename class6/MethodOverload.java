import java.util.Scanner;

class Calculator{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}

public class MethodOverload{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Int Add : "+calc.add(18,57));;
        System.out.println("Double Add : "+calc.add(15.22,24.56));
        System.out.println("3 int nums add : "+calc.add(12,57,46));
    }
}