import java.util.ArrayList;

public class Prac3 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.add(60);
        nums.remove(0);
        System.out.println(nums);
    }
}
