// What if the Exact Prototype Does Not Match?

// When an exact overloaded method is not available, Java may perform 
// method invocation conversions, including certain primitive widening 
// conversions, to find a compatible method. Java tries type promotion 
// in overloading

// Convert to a higher type in the same hierarchy (e.g., byte -> int).
// Convert to the next higher hierarchy if needed (e.g., int -> float).

class Demo{
    
    // public void show(int x){
        
    //     System.out.println("In int: " + x); 
        
    // }
    public void show(String s){
        
        System.out.println("In String: " + s);
        }
    public void show(byte b){ 
        
        System.out.println("In byte: " + b); 
        
    }
    public void show(float f){ 
        
        System.out.println("In float: " + f); 
        
    }
}

public class second {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show((byte) 25); // 25 
        obj.show("hello"); // hello   
        obj.show(250); // 250.0      
        obj.show('A'); //65.0
        obj.show((short) 12); // type conversion(widening) took place. 
        obj.show(23);      //converted to near higher hierarchy i.e float.
        // obj.show(7.5);     // Error: no suitable method for double
    }
}