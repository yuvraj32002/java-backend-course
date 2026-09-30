// Upcasting :-
class A{
    public void show1(){
        System.out.println("In show A");
    }
};
class B extends A{
    public void show2(){
        System.out.println("In show B");
    }
};

public class first {
    public static void main(String[] args) {
        // B obj=new B()
        // A obj1=(A) obj;....it is same as given below in nextline.
        A obj=(A) new B();//Upcasting.
        obj.show1();

        B obj2=(B) obj;
        obj2.show1();
        obj2.show2();     
    }
}
