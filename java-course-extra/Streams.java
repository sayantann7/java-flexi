
import java.util.ArrayList;
import java.util.List;

public class Streams{
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // Stream<Integer> s3 = s2.map( n -> n*2 );
        // int result = s3.reduce( 0, (a,b) -> a+b );

        int result = nums.stream()
                        .filter(n -> n%2==0)
                        .map( n -> n*2 )
                        .reduce( 0, (a,b) -> a+b );

        System.out.println("Result = "+result);


    }
}