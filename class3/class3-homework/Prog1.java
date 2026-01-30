// WAP in Java where using Wrapper class we will taking input as float and priting it through int

import java.util.Scanner;

public class Prog1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the double value : ");
        Double num = sc.nextDouble();
        int integer_num = num.intValue();
        System.out.println("Integer value : "+integer_num);
    }
}