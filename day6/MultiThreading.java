class A extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
        }
    }
}

public class MultiThreading{
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}

// Multi threads means that we are running our programs in different threads allowing for parallel processing. We can create a Multi Thread program by just extending the Thread class, and inside the class you need to name the function that you want to run as "run" and when calling the thread use objname.start()