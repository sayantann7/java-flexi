public class Podcast extends Media {
    public Podcast(String title, int duration, boolean isPremium){
        super(title, duration, isPremium);
    }

    public void playContent(){
        if(this.isPremium==false){
            System.out.println("Playing advertisement...");
        }
        System.out.println("Playing the podcast");
    }
}
