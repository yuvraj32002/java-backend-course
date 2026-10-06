// Interface:-

 interface A{
    // final and static 
    int age=21;
    String name="Yuvraj Kumar";

    // abstract and public
    void show();
    void config();
}

interface C{

    void showC();
    void configC();
}

interface D extends C{
    void showCExtended();
}

class B implements A,C{

    @Override
    public void show() {
        System.out.println("In show");
    }

    @Override
    public void config() {
        System.out.println("In config");
    }

    @Override
    public void showC() {
        System.out.println("In showC");
    }

    @Override
    public void configC() {
        System.out.println("In configC");
    }   
}

class E implements D{

    @Override
    public void showC() {
        System.out.println("In ShowC");
    }

    @Override
    public void configC() {
        System.out.println("In configC");
    }

    @Override
    public void showCExtended() {
        System.out.println("In ShowCExtended");
    }

}

public class first {
    public static void main(String[] args) {
        A obj=new B();

        obj.show();
        obj.config();
        
        C obj2=new B();

        obj2.showC();
        obj2.configC();

        D obj3=new E();

        obj3.configC();
        obj3.showC();
        obj3.showCExtended();

        System.out.println(A.name);
        System.out.println(A.age);
    }
}


// In inheritance all methods, by defailt are abstract and public.
// in inheriytance all methods, by default are final and static.
// interface have no memory of their own in the heap.
// one class can implement multiple interfaces.
// Inheritance is valid for interface.

// class->class => extends
// interface->class => implements
// interface->interface => extends

