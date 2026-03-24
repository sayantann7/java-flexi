public class DroneRobot extends Robot {

    public DroneRobot(String batteryId, double chargeLevel){
        super(batteryId, chargeLevel);
    }

    public void performTask(){
        if((this.chargeLevel - 15)<0.0){
            System.out.println("Low battery! Cannot perform task");
            return;
        }
        this.chargeLevel = this.chargeLevel - 15;
    }
}
