class Student implements Cloneable {
    int id = 101;
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class third {
    public static void main(String[] args)
            throws CloneNotSupportedException {

        Student s1 = new Student();
        Student s2 = (Student) s1.clone();
        
        System.out.println(s2.id);
    
    }
}