// static block:-

class Mobile{
    
    String brand;
    int price;
    static String name;

    // It is called only once when the class will load in JVM 
    // and used to initlise the static_variable:-
    static{
        name="Smart Phone";
        System.out.println("Static block called");
    }

    Mobile(){
        System.out.println("constructor called");
    }

    // All static and non static variables can be used with non-static methods:-
    public void show(){
        System.out.println("Brand: "+brand+","+"Price: "+price+","+"Name: "+name);
    }
}
public class third {
    public static void main(String[] args)throws ClassNotFoundException {
 
        // Mobile.name="Smart Phone";

        // Mobile obj=new Mobile();
        // Mobile obj2=new Mobile();
        
        Class.forName("Mobile");
    }
}

//                  CLASS
//                    ↓
//           Loaded only once
//                    ↓
//           Static initialization
//                    ↓
//         ┌──────────┼──────────┐
//         ↓          ↓          ↓
//       Object 1   Object 2   Object 3
//         ↓          ↓          ↓
//    Constructor Constructor Constructor 

// When the first object of a class is created, if the class 
// hasn’t been loaded yet, the JVM loads/initializes the class 
// and then creates the object. Subsequent objects don’t 
// reload the class; they are simply created and their 
// constructors execute.


// Class.forName("Mobile")
//      ↓
// Class loading/initialization
//      ↓
// Static block
//      ↓
// NO object created
//      ↓
// NO constructor
