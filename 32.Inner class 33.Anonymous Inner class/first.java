// nested class:-
class A{

    int age;

    public void show(){
        System.out.println("In show");
    }

    class B{
        public void config(){
            System.out.println("In congig");
        }
    }

}

public class first {
    public static void main(String[] args) {
        
        A a=new A();
        A.B b=a.new B();

        b.config();
        a.show();
    }
}
