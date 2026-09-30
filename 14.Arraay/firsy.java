// Creating array and printing it's value:-
public class firsy {
    public static void main(String[] args) {

        // Static way:-
        int arr[]={1,2,3,4,5};
        for(int i=0; i<5; i++){
            System.out.println(arr[i]);
        }

        // Dynamic way:-
        int num[]=new int[5];// we have to declare size of the array.

        num[0]=6;
        num[1]=7;
        num[2]=8;
        num[3]=9;
        num[4]=10;

        for(int i=0; i<5; i++){
            System.out.println(num[i]);
        }
        
    }
}
