abstract class Animal{
    abstract void sound();
    abstract void eat();
}

abstract class Dog extends Animal{
    void eat(){
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog{
    void sound(){
        System.out.println("Sound");
    }
}

public class AbstractMethod{
    public static void main(String[] args) {
        Animal animal = new Puppy();
        animal.sound();
        animal.eat();
    }
}