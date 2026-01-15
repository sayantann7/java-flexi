interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Coding on laptop");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Coding on Desktop");
    }
}

class Developer{
    public void developApp(Computer comp){
        comp.code();
    }
}

public class MoreInterface {
    public static void main(String[] args){
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer dev = new Developer();
        dev.developApp(lap);
    }
}
