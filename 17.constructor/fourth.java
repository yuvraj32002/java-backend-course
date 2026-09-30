// Private constructor:-

class Priv_const{
     
    static int num=20;
    static int num2=21;
    String name="yuvraj kumar";
    String father_name="pawan";

    private Priv_const(){
        System.out.println("This is private const.");
    }

    static void DisplayMessage(){
        System.out.println("This class can be accessed only through this method.");
    }
    
    // Can create method inside the same class and return it to other class:-
    public static Priv_const createObj(){
        Priv_const obj=new Priv_const();
        return obj;
    }
}

public class fourth {
    public static void main(String[] args) {
        
        // Priv_const p1=new Priv_const();
        // making a class of constructor with a private const generate a errer.

        System.out.println(Priv_const.num);
        System.out.println(Priv_const.num2);

        Priv_const.DisplayMessage();

        // The class is accessed only through the static method 
        // displayMessage(), which is called directly using the class name.

        Priv_const obj=Priv_const.createObj();
        System.out.println(obj.name);
        System.out.println(obj.father_name);
    }
}
