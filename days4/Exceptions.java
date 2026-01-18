public class Exceptions {
    public static void main(String[] args) {
        int i = 4;
        int j = 20;
        int k;
        int[] nums = {1,3,43,4};

        try{
            k = j/i;
            System.out.println("k : "+k);
            System.out.println("Arr : "+nums[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by 0");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Cannot access that index");
        }
        catch(Exception e){
            System.out.println("ERROR : "+e);
        }

        System.out.println("PROGRAM END");
    }
}
