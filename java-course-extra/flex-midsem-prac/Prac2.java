public class Prac2 {
    public static void main(String[] args) {
        Computer machine = new Desktop();
        machine.work(1);
    }
}

class Computer{
    public void work(int i){
        System.out.println("Computer is working "+i );
    }
}

class Desktop extends Computer{
    public void work(int i){
        System.out.println("Desktop is working "+i );
    }
    public void work(){
        System.out.println("Desktop is working");
    }
}