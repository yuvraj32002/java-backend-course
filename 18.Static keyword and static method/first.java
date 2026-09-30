// Static variable:-

class Student{

    static String collageName="BIT";
    String name;

}
public class first {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();

        s1.name="yuvraj";
        s2.name="Rahul";

        System.out.println("Name: "+ s1.name +" , "+Student.collageName);
        System.out.println("Name: "+ s2.name +" , "+Student.collageName);
        
    }
}
