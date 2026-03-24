public class Movie extends Media {
    public Movie(String title, int duration, boolean isPremium){
        super(title, duration, isPremium);
    }

    public void playContent(){
        if(this.isPremium==true){
            System.out.println("Verifying subscription...");
        }
        System.out.println("Playing the movie");
    }
}
