public class Strings{
    public static void main(String args[]){
        String name = "sayantan";
        String name2 = "sayantan";
        String name3 = "nandi";
        System.out.println(name==name2); // true

        String name4 = new String("sayantan");
        System.out.println(name==name4); // false
    }
}