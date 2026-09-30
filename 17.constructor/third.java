// Copy constructor:-

class Copy_const{
    String name;
    int age;

    Copy_const(String name, int age){
        this.name=name;
        this.age=age;
    }

    Copy_const(Copy_const obj1){
        this.name=obj1.name;
        this.age=obj1.age;
    }
}

public class third {
    public static void main(String[] args) {
        
        // 1st object:-
        Copy_const obj1=new Copy_const("Yuvraj", 21);
        
        // 2nd object:-
        Copy_const obj2=new Copy_const(obj1);
        System.out.println(obj2.name);
        System.out.println(obj2.age);

    }
}
