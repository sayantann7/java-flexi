abstract class Car{
    public abstract void drive();

    public void playMusic(){
        System.out.println("Playing music..");
    }
} // this abstract class cannot have any objects

class BMW extends Car{
    public void drive(){
        System.out.println("Driving..");
    }
} // the opposite of abstract class is also known as concrete class

public class Abstract{
    public static void main(String[] args) {
        Car bmw = new BMW();
        bmw.drive();
        bmw.playMusic();
    }
}