class Laptop{

    int price;
    String model;

    // overloaded:-
    public String toString(){
        return model+" , "+price;
    }

}
public class first {
    public static void main(String[] args) {
        Laptop obj = new Laptop();

        obj.price=1000;
        obj.model="lenovo";

        System.out.println(obj); //print the hashcode of the given object.
        System.out.println(obj.toString());// print the hashcode value og given object;
    }
}
