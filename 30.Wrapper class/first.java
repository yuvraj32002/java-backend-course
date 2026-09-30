public class first{
    public static void main(String[] args) {
        
        int num=7;

        // Integer num1=new Integer(num);...This is deprecated concept, Now we use it
        // in different manner.
        Integer num1=num; // called...autoboxing;
        System.out.println(num1);

        // int num2=num1.intValue(); //unboxing
        int num2=num1; // auti-unboxing.
        System.out.println(num2);

        String str="12";
        int num3=Integer.parseInt(str);
        System.out.println(num3*3);
    }
}