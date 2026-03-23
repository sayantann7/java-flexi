public class DeliveryDrone extends Transport implements GPS, Autonomous {

    public DeliveryDrone(String trackingId){
        super(trackingId);
    }
    
    public void dispatch(){
        System.out.println("Delivery drone is dispatching");
    }

    public void getCoordinates(){
        System.out.println("Getting coordinates for Delivery drone");
    }

    public void selfNavigate(){
        System.out.println("Self navigating the Delivery drone");
    }
}
