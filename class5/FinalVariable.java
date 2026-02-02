public class FinalVariable{
    final int MAX = 100;

    void display(){
        System.out.println("MAX Value : "+MAX);
    }

    public static void main(String[] args) {
        FinalVariable obj = new FinalVariable();
        obj.display();
    }
}