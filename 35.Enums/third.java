// Defining constructor and methods in enum:- 

enum Laptop{
    Macbook(1500), XPS(200), Surface(250);

    private int price;
 
    private Laptop(int price) {
        this.price=price;
        System.out.println("In Laptop "+this.name());
    }

    int getPrice() {
        return this.price;
    }

    void setPrice(int x) {
        this.price=price;
    }
}
public class third {
    public static void main(String[] args) {
        
        Laptop l1=Laptop.Macbook;

        // System.out.println(Laptop.values());

        for(Laptop lap : Laptop.values()){
            System.out.println(lap+" : "+lap.getPrice());
        }
    }
}
