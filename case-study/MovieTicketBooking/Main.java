import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Dhurandhar", 300);
        int exit = 0;
        Scanner sc = new Scanner(System.in);
        while(exit==0){
            System.out.println("How many seats you want to book?");
            int tickets = sc.nextInt();
            try {
                int available = movie.bookTicket(tickets);
                System.out.println("Tickets have been booked successfully!");
                System.out.println("Available tickets : "+available);
            } catch (Exception e){
                System.out.println("ERROR : "+e.getMessage());
            }
            System.out.println("Do you want to book any more seats?");
            System.out.println("1 for no, 0 for yes");
            exit = sc.nextInt();
        }
    }
}
