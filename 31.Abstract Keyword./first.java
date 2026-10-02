// abstract class and method:-

abstract class Car{

    abstract public void drive();
    abstract public void fly();

    public void playMusic(){
        System.out.println("Playing Music");
    }
}
abstract class Wagnar extends Car{
    public void drive(){
        System.out.println("Driving...");
    }
}
class UpdatedWagnar extends Wagnar{  // concrete class
    public void fly(){
        System.out.println("Flying...");
    }
}
public class first{
    public static void main(String[] args) {
        // Car c=new Car();..can't craete create object of an abstract class;
        Car c=new UpdatedWagnar();

        c.drive();
        c.fly();
        c.playMusic();
    }
}