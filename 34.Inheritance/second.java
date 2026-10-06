// Real world use

interface Computer{
    void code();
}

class Laptop implements Computer{

    @Override
    public void code() {
        System.out.println("Code, compile, run");
    }
    
}

class Desktop implements Computer{

    @Override
    public void code() {
        System.out.println("code, compile, run : Faster");
    }
    
}

class Developer{
    void devApp(Computer obj){
        obj.code();
    }
}

public class second {
    public static void main(String[] args) {
        Computer lap=new Laptop();
        Computer des=new Desktop();

        Developer yuvraj = new Developer();
        yuvraj.devApp(lap);
        yuvraj.devApp(des);
    }
}
