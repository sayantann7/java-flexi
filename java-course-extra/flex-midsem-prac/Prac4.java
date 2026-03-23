import java.util.StringTokenizer;

public class Prac4 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(str1.equals(str1));

        StringBuffer sb1 = new StringBuffer("hi");
        StringBuffer sb2 = new StringBuffer("hi");
        System.out.println(System.identityHashCode(sb1));
        System.out.println(System.identityHashCode(sb2));
        System.out.println(sb1.equals(sb2));

        String str = "Java,Python,C++";
        StringTokenizer st = new StringTokenizer(str,",");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
