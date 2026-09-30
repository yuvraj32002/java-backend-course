
class A{
    public A(){
        System.out.println("I am default constructor of parent class.");
    }
    public A(int a){
        System.out.println("I am paramaterised constructor of parent class.");
    }
}
class B extends A{
    public B(){
        this(5);
        System.out.println("I am default const of child class.");
    }
    public B(int b){
        super(5);
        System.out.println("I am paramaterised const of child class.");
    }
}
public class first {
    public static void main(String[] args) {
        B b=new B(5);
    }
}

// By default "super()" is the first line of all the constructor.
// Point out the the constructor of the parent class;
// Every class in java is the child of "ObjECT CLASS".
// "this()" is used to to call the constructor of the same class.
// but you can use only one out of this() or super() at once, in a constructor calling.