// Static inner:-

class A{

    int age;

    public void show(){
        System.out.println("In show");
    }

    static class B{
        public void config(){
            System.out.println("In congig");
        }
    }

}

public class second {
    public static void main(String[] args) {
        
        A.B obj = new A.B();
        obj.config();
    }
} 

