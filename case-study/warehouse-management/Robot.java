abstract public class Robot {
    private String batteryId;
    protected double chargeLevel;

    public Robot(String batteryId, double chargeLevel){
        this.batteryId = batteryId;
        this.chargeLevel = chargeLevel;
    }

    public String getBatteryId(){
        return batteryId;
    }

    public void reportStatus(){
        System.out.println("Charge Level : "+chargeLevel);
    }

    abstract public void performTask();
}
