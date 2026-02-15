public class Movie{
    String name;
    int noOfSeats;

    public Movie(String name, int noOfSeats){
        this.name = name;
        this.noOfSeats = noOfSeats;
    }

    public int bookTicket(int seats) throws SeatNotAvailable{
        if(seats>noOfSeats){
            throw new SeatNotAvailable("Not enough seats available");
        }
        else{
            noOfSeats = noOfSeats-seats;
            return noOfSeats;
        }
    }
}