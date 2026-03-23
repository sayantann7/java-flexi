abstract class Transport {
    String trackingId;
    String destination;

    public Transport(String trackingId){
        this.trackingId = trackingId;
    }

    abstract public void dispatch();
}
