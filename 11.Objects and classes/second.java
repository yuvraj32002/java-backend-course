class Student{
    public 
    int id;
    String name;
    
    public 
    Student(int id, String name){
        this.id=id;
        this.name=name;
    }

}
public class second {
    public static void main(String[] args) {
        
        Student s1=new Student(140, "Yuvraj");

        System.out.println("Student's name: "+s1.name);
        System.out.println("Student's Id: "+s1.id);
    }
}
