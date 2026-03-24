abstract public class Media {
    private String title;
    private int duration;
    protected boolean isPremium;

    public Media(String title, int duration, boolean isPremium){
        this.title = title;
        this.duration = duration;
        this.isPremium = isPremium;
    }

    public void getDetails(){
        System.out.println("Title : "+title);
        System.out.println("Duration : "+duration);
        System.out.println("IsPremium : "+isPremium);
    }

    abstract public void playContent();
}
