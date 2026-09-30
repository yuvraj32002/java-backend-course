// Static methoda:-
class Mobile{
    
    String brand;
    int price;
    static String name;

    // All static and non static variables can be used with non-static methods:-
    public void show(){
        System.out.println("Brand: "+brand+","+"Price: "+price+","+"Name: "+name);
    }

    // But only static variables can be used with static 
    // methods but if we have object reference then we can use it:-
    public static void show1(Mobile obj){
        System.out.println("In Static method.");
        System.out.println("Brand: "+obj.brand+","+"Price: "+obj.price+","+"Name: "+obj.name);
    }
}
public class second {
    public static void main(String[] args) {
 
        Mobile.name="Smart Phone";

        Mobile obj=new Mobile();
        obj.brand="Samsung";
        obj.price=20000;

        obj.show(); //non-static method called with object name.
        Mobile.show1(obj); //Static method called with class name.
    }
}
