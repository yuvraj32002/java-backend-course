// Anonymous inner class with abstract class:-
abstract class A{
    abstract public void show();
}

public class fourth {
    public static void main(String[] args) {
        A obj = new A() {
            public void show(){
                System.out.println("In the anonymous inner class of abstract class.");
            }
        };

        obj.show();
    }
}
