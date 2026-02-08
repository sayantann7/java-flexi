import java.util.*;

public class ParallelStreams {
    public static void main(String[] args){
        int size = 10_000;
        List<Integer> nums = new ArrayList<>();

        Random rand = new Random();

        for(int i = 0; i<size; i++){
            nums.add(rand.nextInt(100));
        }

        long startSum1 = System.currentTimeMillis();
        int sum1 = nums.stream()
                        .map(i -> {
                            try {
                                Thread.sleep(1);
                            } catch (Exception e) {
                            }
                            return i*2;
                        })
                        .mapToInt(i->i)
                        .sum();
        long endSum1 = System.currentTimeMillis();

        long startSum2 = System.currentTimeMillis();
        int sum2 = nums.parallelStream()
                        .map(i -> {
                            try {
                                Thread.sleep(1);
                            } catch (Exception e) {
                            }
                            return i*2;
                        })
                        .mapToInt(i->i)
                        .sum();   
        long endSum2 = System.currentTimeMillis();
        
        System.out.println(sum1+" "+sum2);

        System.out.println("seq time : "+(endSum1-startSum1));
        System.out.println("para time : "+(endSum2-startSum2));
    }
}

// Parallel Streams
// 990664 990664
// seq time : 11473
// para time : 1067
// Vast time difference in parallel and sequential streams, but parallel streams are used only when you have independent operations, and not when you have dependent operations (like sorting)