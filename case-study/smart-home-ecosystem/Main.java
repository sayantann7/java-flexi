public class Main {
    
    public static void main(String[] args) {
        // Device device = new SmartTV("Sony");
        // device.connectToWifi();
        // device.turnOn();
        // device.getEnergyRating();

        RemoteControllable r = new SmartTV("LG");
        r.connectToWifi();
        // r.turnOn();
    }

}
