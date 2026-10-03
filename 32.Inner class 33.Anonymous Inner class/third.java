class A{
    public void show(){
        System.out.println("In a show A");
    }
}
public class third {
    public static void main(String[] args) {
        A obj = new A()
        {
            public void show(){
                System.out.println("In new show");
            }
        };

        obj.show();
    }
}
