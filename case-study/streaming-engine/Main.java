public class Main {
    public static void main(String[] args) {
        Media[] medias = new Media[3];
        medias[0] = new Movie("Dhurandhar", 240, true);
        medias[1] = new Podcast("Nikhil Kamath", 300, false);
        medias[2] = new Movie("Top Gun", 150, false);

        for(Media m : medias){
            m.playContent();
        }
    }
}
