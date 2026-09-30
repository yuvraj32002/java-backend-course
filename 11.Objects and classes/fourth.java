// Anonymous Object: An object that does not have any reference variable.
class AssignValue{
    public 
    String name;
    int rollno;
    
    public AssignValue(String name, int rollno){
        this.name=name;
        this.rollno=rollno;

        System.out.println("Your name: "+name+" , "+"Your rollno: "+rollno);
    }
}
public class fourth {
    public static void main(String[] args) {
        new AssignValue("Yuvraj", 140);
    }
    
}


