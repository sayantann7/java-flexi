public class Wrapper {
    public static void main(String[] args) {
        int i = 3;
        double d = 2.4;
        System.out.println("Integer i : "+i);
        System.out.println("Double d : "+d);
        Integer i1 = Integer.valueOf(i);
        Double d1 = Double.valueOf(d);
        System.out.println("Wrapped Integer i : "+i1);
        System.out.println("Wrapped Double d : "+d1);
        String str1 = "123";
        String str2 = "456";
        System.out.println("answer is "+(str1+str2));
        int s1 = Integer.parseInt(str1);
        int s2 = Integer.parseInt(str2);
        System.out.println("answer is "+(s1+s2));
    }
}

// HOMEWORK
// 1. WAP in Java where using Wrapper class we will taking input as float and priting it through int
// 2. WAP in Java where we will be implenting static and instance method through user input data calling
// 3. WAP in java where we will be using the concept of inner class and outer class