public class GroundRobot extends Robot {
    public GroundRobot(String batteryId, double chargeLevel){
        super(batteryId, chargeLevel);
    }

    public void performTask(){
        if((this.chargeLevel - 5)<0.0){
            System.out.println("Low battery! Cannot perform task");
            return;
        }
        this.chargeLevel = this.chargeLevel - 5;
    }
}
