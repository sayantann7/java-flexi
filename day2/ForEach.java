public class ForEach {
    public static void main(String[] args) {
        int numbers[] = {45, 22, 89, 16, 90, 33};
        int min = numbers[0];
        int max = numbers[0];
        for(int n : numbers){
            if(n<min){
                min = n;
            }
            if(n>max){
                max = n;
            }
        }
        System.out.println("Smallest: "+min);
        System.out.println("Largest: "+max);
    }
}
