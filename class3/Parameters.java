class Test{
    void modfiyValue(int x){
        x = x + 10;
    }
}

public class Parameters {
    public static void main(String[] args) {
        int a = 5;
        Test obj = new Test();
        obj.modfiyValue(a);
        System.out.println(a);
    }    
}
