import java.util.*;

public class ComparatorSorting{
    public static void main(String[] args){

        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String a, String b){
                if(a.length() > b.length()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        
        List<String> strs = new ArrayList<>();
        strs.add("hi");
        strs.add("hello");
        strs.add("hey");
        strs.add("wassup");
        strs.add("nice");
        System.out.println(strs);
        strs.sort(com); // Collections.sort(strs, com);
        System.out.println(strs);
    }
}