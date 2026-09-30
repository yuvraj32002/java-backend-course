class Calculator{
    
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public double add(double n1, double n2){
        return n1+n2;
    }
}
public class first {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        System.out.println(c1.add(12,13));
        System.out.println(c1.add(12,13,14));
        System.out.println(c1.add(12.12, 13.18));
    }
}
