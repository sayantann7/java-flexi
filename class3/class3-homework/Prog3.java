// 3. WAP in java where we will be using the concept of inner class and outer class

class Car {
    String brand = "Tesla";

    class Engine {
        void start() {
            System.out.println("Engine started in " + brand + " car");
        }
    }

    void drive() {
        Engine engine = new Engine();
        engine.start();
        System.out.println("Car is driving");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
