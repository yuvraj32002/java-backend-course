class Calculator{
     public
     int add(int n1, int n2){
        System.out.print("The addting of these two numbers will give: ");
        return n1+n2;
     }
};

public class first {
    public static void main(String[] args) {
        Calculator c1=new Calculator();

        int result=c1.add(12, 13);
        System.out.println(result);
    }
}
