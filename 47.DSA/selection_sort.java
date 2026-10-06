// selecting maximun value and placing it at the begning:-

public class selection_sort {
    public static void main(String[] args) {
    
        int arr[]={5,9,1,4,10};

        for(int i=0; i<arr.length-1; i++){

            int index=i;

            for(int j=i+1; j<arr.length-1; j++){
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" , ");
        }
    }   
}
