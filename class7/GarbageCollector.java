class Test{
    int num;
    public void show(){
        System.out.println(num);
    }
}

public class GarbageCollector {
    public static void main(String[] args) {
        Test obj = new Test();
        obj = null;
        System.gc();
        System.out.println(obj);
    }
}
