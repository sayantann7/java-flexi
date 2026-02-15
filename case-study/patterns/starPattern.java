import java.util.Scanner;

public class starPattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");
        int num = sc.nextInt();

        for(int i = 1; i<=num; i++){
            int left = num-i;
            int right = i;
            for(int j = 1; j<=left; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=right; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}