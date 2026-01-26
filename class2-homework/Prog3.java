// WAP in java to perform static method using static variable

public class Prog3 {
    static int count = 0;
    
    static void increment() {
        count++;
    }
    
    public static void main(String[] args) {
        increment();
        increment();
        increment();
        System.out.println("Count: " + count);
    }
}