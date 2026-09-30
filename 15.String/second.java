// Various string methodas:-
public class second {
    public static void main(String[] args) {
        String str=new String("Yuvraj Kumar");
      
        // 1. int length() Method
        System.out.println(str.length()); //12

        // 2. charAt(int i) Method
        System.out.println(str.charAt(5)); //j

        // 3. String substring(int i) Method
        System.out.println(str.substring(2, 5));

        // 5. String concat( String str) Method
        System.out.println(str.concat(" singh"));

        // indexOf()             → First occurrence
        // lastIndexOf()         → Last occurrence
        // equals()              → Compares contents
        // equalsIgnoreCase()    → Compares ignoring case
        // compareTo()           → Lexicographical comparison
        // compareToIgnoreCase() → Lexicographical comparison ignoring case
        // toLowerCase()         → Converts to lowercase
        // toUpperCase()         → Converts to uppercase
        // trim()                → Removes outer whitespace
        // replace()             → Replaces characters/sequence
        // contains()            → Checks presence
        // toCharArray()         → String → char[]
        // startsWith()          → Checks beginning
        // endsWith()            → Checks ending
    }
}
