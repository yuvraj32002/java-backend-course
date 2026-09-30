// comparinhg two objects:-
class Laptop{

    int price;
    String model;

    @Override 
    public String toString(){
        return model+" , "+price;
    }

    public boolean equals(Laptop that){
        return this.model.equals(that.model) && this.price==that.price;
    }

}
public class second {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();

        obj1.price=1000;
        obj1.model="lenovo";

        System.out.println(obj1); //print the hashcode of the given object.

        Laptop obj2 = new Laptop();

        obj2.price=1000;
        obj2.model="lenovo";

        System.out.println(obj2); //print the hashcode of the given object.

        boolean compare1=obj1==obj2;
        System.out.println(compare1);//false

        boolean compare2=obj1.equals(obj2); // The default implementation in Object compares object references.
        System.out.println(compare2);//true

        System.out.println(obj1.getClass());// class Laptop
        System.out.println(obj2.getClass());// class Laptop

    }
}
