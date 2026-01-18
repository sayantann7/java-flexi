@FunctionalInterface
interface A{
    int add(int a, int b);
}

public class Lambda2 {
    public static void main(String[] args) {
        // A obj = (int a, int b) -> {
        //         return a+b;
        // };
        A obj = (a,b) -> a+b; // no need to mention the data types and also return statement
        System.out.println(obj.add(2, 3));
    }
}
