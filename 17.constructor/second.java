// Types of constructor:-

// 1.Default constructor:-
// class Student {

//     String name;
//     int age;
// }

// public class second {

//     public static void main(String[] args) {

//         Student s = new Student();

//         System.out.println(s.name);
//         System.out.println(s.age);
//     }
// }

// 2.paramaterised constructor:-

class Student{

    // data members of the class
    String name;
    int id;

    // Parameterized Constructor
    Student(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    // Method to display object data
    void display(){
        
        System.out.println("GeekName: " + name
                           + " and GeekId: " + id);
    }
}
public class second{
    public static void main(String[] args){
        
        // This will invoke the parameterized constructor
        Student s1 = new Student("Sweta", 68);
        s1.display();
    }
}
