public class SmartTV extends Device implements RemoteControllable, PowerSaving {

    String name;

    public SmartTV(String name){
        this.name = name;
    }

    public void turnOn(){
        System.out.println("Smart tv turning on");
    }

    public void connectToWifi(){
        System.out.println("TV conecting to wifi");
    }

    public void getEnergyRating(){
        System.out.println("Smart TV Energy Rating : 20W");
    }
}
