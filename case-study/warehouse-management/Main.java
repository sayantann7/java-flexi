public class Main {
    
    public static void main(String[] args) {
        Robot r1 = new DroneRobot("D1", 20.0);
        r1.performTask();
        r1.reportStatus();

        Robot r2 = new GroundRobot("G5", 50.0);
        r2.performTask();
        r2.reportStatus();

        Robot r3 = new GroundRobot("G7", 2.0);
        r3.performTask();
        r3.reportStatus();
    }

}
