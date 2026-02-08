import java.util.Scanner;

class Vehicle{
    int maxspeed;
    public Vehicle(){
        setMaxSpeed();
    }
    public void setMaxSpeed(){
        maxspeed = 60;
    }
}

class Bike extends Vehicle{
    public Bike(){
        setMaxSpeed();
    }
    public void setMaxSpeed(){
        maxspeed = 100;
    }
}

class Car extends Vehicle{
    public Car(){
        setMaxSpeed();
    }
    public void setMaxSpeed(){
        maxspeed = 140;
    }
}

public class MethodOverride{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your speed : ");
        int speed = sc.nextInt();
        System.out.println("What are you driving (1 for car or 2 for bike)");
        int choice = sc.nextInt();
        Vehicle obj;
        switch (choice) {
            case 1:
                obj = new Car();
                if(speed>obj.maxspeed){
                    System.out.println("You are overspeeding");
                }
                else{
                    System.out.println("You are going in limits");
                }
                break;
            
            case 2:
                obj = new Bike();
                if(speed>obj.maxspeed){
                    System.out.println("You are overspeeding");
                }
                else{
                    System.out.println("You are going in limits");
                }
                break;
        
            default:
                break;
        }
    }
}