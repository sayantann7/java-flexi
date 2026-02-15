public class MultiExceptions {
    public static void main(String[] args) {
        try{
            System.out.println("Program start");
            String str = null;
            System.out.println(str.length());
            int i = 1/0;
            System.out.println("hi");
        }
        catch(NullPointerException | ArithmeticException e){
            System.out.println("Error : "+e.getClass().getSimpleName());
        }
        catch(Exception e){
            System.out.println("Some other error occured");
        }
        System.out.println("Program continues after exception");
    }    
}
