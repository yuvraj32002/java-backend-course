// ways of creating String:-
public class first {
    public static void main(String[] args) {
        // Using String literal:-
        String str1="Yuvarj Kumar";
        System.out.println(str1);

        // Using new Keyword:-
        String str2= new String("Yuvraj Kumar");
        System.out.println(str2);

        // printing hash code of a objext:-(objext_name.hashcode())
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        // perform concatenation with '+' method in string:-
        System.out.println(str1+str2); //Yuvarj KumarYuvraj Kumar
        System.out.println("Yuvraj"+"Kumar"); //YuvrajKumar
        System.out.println(str1+"Kumar"); //Yuvarj KumarKumar
        
    }
}
