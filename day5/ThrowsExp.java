class MyException extends Exception {

    public MyException(String error) {
        super(error);
    }
}

class A {

    public void config() throws MyException {
        int i = 0;
        int j = 10 / i;
        System.out.println("i : " + i);
    }
}

// The throws keyword is basically used for allowing that particular method to not handle that exception and instead let it handle wherever it is called.
// In our example, the method config throws an exception so you dont have to handle it inside that method, instead you will handle it wherever that method is called, like for eg in the main method

public class ThrowsExp {

    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.config();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Program end");
    }
}
