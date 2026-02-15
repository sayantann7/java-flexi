public class SeatNotAvailable extends Exception{
    String message;
    public SeatNotAvailable(String message) {
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}
