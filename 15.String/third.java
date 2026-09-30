// String Buffer:-

public class third {
    public static void main(String[] args) {

        // 1. Using default constructor
        StringBuffer sb1 = new StringBuffer();
        sb1.append("Hello");
        System.out.println("Default Constructor: " + sb1);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        // 2. Using constructor with specified capacity
        StringBuffer sb2 = new StringBuffer(50);
        sb2.append("Java Programming");
        System.out.println("With Capacity 50: " + sb2);
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());


        // 3. Using constructor with String
        StringBuffer sb3 = new StringBuffer("Welcome");
        sb3.append(" to Java");
        System.out.println("With String: " + sb3);
        System.out.println(sb3.length());// 15
        System.out.println(sb3.capacity());// 23

        // convert from  string buffrr to string :-
        String sb4=sb3.toString();
        System.out.println(sb4);
    }
}
    
