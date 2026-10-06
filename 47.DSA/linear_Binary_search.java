public class linear_Binary_search {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};

        int result1=linearSearch(arr, 12);
        int result2=binarySearch(arr, 12, 0, arr.length-1);
        int result3=binary_Search_recur(arr, 1, 0, arr.length-1);

        if(result3!=-1){
            System.out.println("Element found at index: "+result3);
        }
        else{
            System.out.println("Element not found in the array.");
        }
    }

    // Linear search:-
    public static int linearSearch(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    // Binary search using for loop:-
    public static int binarySearch(int[] arr, int target, int start, int end){

        while(start<=end){

            int mid=end+(start-end)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        } 
        return -1;
    }

    // Binary search using for loop:-
    public static int binary_Search_recur(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid=end+(start-end)/2;

        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]<target){
            start=mid+1;
            return binarySearch(arr, target, start, end);
        }
        else{
            end=mid-1;
            return binarySearch(arr, target, start, end);
        }
    }
}
